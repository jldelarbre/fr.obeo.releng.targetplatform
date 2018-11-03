/**
 * Copyright (c) 2012-2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mikael Barbero (Obeo) - initial API and implementation
 */
package fr.obeo.releng.targetplatform.util;

import com.google.common.base.Function;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;
import com.google.inject.Inject;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.TargetContent;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.TargetPlatformBundleActivator;
import fr.obeo.releng.targetplatform.util.CompositeElementResolver;
import fr.obeo.releng.targetplatform.util.ResourceUtil;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class LocationIndexBuilder {
  @Inject
  private ImportUriResolver resolver;
  
  @Inject
  private CompositeElementResolver compositeElementResolver;
  
  public ListMultimap<String, Location> getLocationIndex(final TargetPlatform targetPlatform) {
    this.compositeElementResolver.resolveCompositeElements(targetPlatform);
    final Function1<Location, Boolean> _function = new Function1<Location, Boolean>() {
      @Override
      public Boolean apply(final Location it) {
        boolean _xblockexpression = false;
        {
          String _uri = it.getUri();
          boolean _tripleEquals = (_uri == null);
          if (_tripleEquals) {
            String message = "Location ";
            String _iD = it.getID();
            boolean _tripleNotEquals = (_iD != null);
            if (_tripleNotEquals) {
              String _message = message;
              String _iD_1 = it.getID();
              String _plus = ("(id=" + _iD_1);
              String _plus_1 = (_plus + ") ");
              message = (_message + _plus_1);
            }
            String _message_1 = message;
            EObject _eContainer = it.eContainer();
            String _name = ((TargetPlatform) _eContainer).getName();
            String _plus_2 = ("in target: " + _name);
            String _plus_3 = (_plus_2 + " could not be resolved");
            message = (_message_1 + _plus_3);
            ILog _log = TargetPlatformBundleActivator.getInstance().getLog();
            Status _status = new Status(IStatus.WARNING, TargetPlatformBundleActivator.PLUGIN_ID, message);
            _log.log(_status);
          }
          String _uri_1 = it.getUri();
          _xblockexpression = (null != _uri_1);
        }
        return Boolean.valueOf(_xblockexpression);
      }
    };
    Iterable<Location> locationList = IterableExtensions.<Location>filter(this.getLocations(
      CollectionLiterals.<TargetPlatform>newLinkedHashSet(targetPlatform), 
      CollectionLiterals.<TargetPlatform>newLinkedList(targetPlatform)), _function);
    final Function<Location, String> _function_1 = new Function<Location, String>() {
      @Override
      public String apply(final Location it) {
        return it.getUri();
      }
    };
    return LinkedListMultimap.<String, Location>create(Multimaps.<String, Location>index(locationList, _function_1));
  }
  
  private List<Location> getLocations(final Set<TargetPlatform> visited, final List<TargetPlatform> toBeVisited) {
    final ArrayList<Location> locations = CollectionLiterals.<Location>newArrayList();
    final Consumer<TargetPlatform> _function = new Consumer<TargetPlatform>() {
      @Override
      public void accept(final TargetPlatform it) {
        final LinkedList<IncludeDeclaration> includes = CollectionLiterals.<IncludeDeclaration>newLinkedList();
        final Consumer<TargetContent> _function = new Consumer<TargetContent>() {
          @Override
          public void accept(final TargetContent content) {
            if ((content instanceof Location)) {
              boolean _isEmpty = includes.isEmpty();
              boolean _not = (!_isEmpty);
              if (_not) {
                locations.addAll(LocationIndexBuilder.this.getLocationFromVisitedIncludes(it, includes, visited));
                includes.clear();
              }
              locations.add(((Location)content));
            } else {
              if ((content instanceof IncludeDeclaration)) {
                includes.add(((IncludeDeclaration)content));
              }
            }
          }
        };
        ListExtensions.<TargetContent>reverseView(it.getContents()).forEach(_function);
        boolean _isEmpty = includes.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          locations.addAll(LocationIndexBuilder.this.getLocationFromVisitedIncludes(it, includes, visited));
          includes.clear();
        }
      }
    };
    toBeVisited.forEach(_function);
    return locations;
  }
  
  private List<Location> getLocationFromVisitedIncludes(final TargetPlatform parent, final List<IncludeDeclaration> includes, final Set<TargetPlatform> visited) {
    final Function1<IncludeDeclaration, TargetPlatform> _function = new Function1<IncludeDeclaration, TargetPlatform>() {
      @Override
      public TargetPlatform apply(final IncludeDeclaration it) {
        return LocationIndexBuilder.this.getImportedTargetPlatform(parent.eResource(), it);
      }
    };
    final Function1<TargetPlatform, Boolean> _function_1 = new Function1<TargetPlatform, Boolean>() {
      @Override
      public Boolean apply(final TargetPlatform it) {
        boolean _contains = visited.contains(it);
        return Boolean.valueOf((!_contains));
      }
    };
    final List<TargetPlatform> importedLocation = IterableExtensions.<TargetPlatform>toList(IterableExtensions.<TargetPlatform>filter(IterableExtensions.<TargetPlatform>filterNull(ListExtensions.<IncludeDeclaration, TargetPlatform>map(includes, _function)), _function_1));
    visited.addAll(importedLocation);
    return this.getLocations(visited, importedLocation);
  }
  
  /**
   * Returns all imported target platforms in a BSF fashion. The returned collection has
   * an iteration order reflecting the import overriding: the last import override precedent ones
   * and the deepest import is of least importance. E.g.
   * A includes B, C and D
   * B includes E, F and G
   * C includes H, I and J
   * D includes K, L and M
   * 
   * The returned collection for A is : D, C, B, M, L, K, J, I, H, G, F, E
   */
  public LinkedList<TargetPlatform> getImportedTargetPlatforms(final TargetPlatform targetPlatform) {
    this.compositeElementResolver.resolveCompositeElements(targetPlatform);
    return this.getImportedTargetPlatformsDoNotResolveCompositeElement(targetPlatform);
  }
  
  public LinkedList<TargetPlatform> getImportedTargetPlatformsDoNotResolveCompositeElement(final TargetPlatform targetPlatform) {
    final LinkedHashSet<TargetPlatform> visited = CollectionLiterals.<TargetPlatform>newLinkedHashSet();
    final LinkedList<TargetPlatform> queue = CollectionLiterals.<TargetPlatform>newLinkedList();
    final LinkedList<TargetPlatform> includeRet = CollectionLiterals.<TargetPlatform>newLinkedList();
    queue.addLast(targetPlatform);
    visited.add(targetPlatform);
    while ((!queue.isEmpty())) {
      {
        final LinkedList<TargetPlatform> tr = CollectionLiterals.<TargetPlatform>newLinkedList();
        final TargetPlatform t = queue.removeLast();
        final Function1<IncludeDeclaration, Boolean> _function = new Function1<IncludeDeclaration, Boolean>() {
          @Override
          public Boolean apply(final IncludeDeclaration it) {
            return Boolean.valueOf(it.isResolved());
          }
        };
        final Function1<IncludeDeclaration, TargetPlatform> _function_1 = new Function1<IncludeDeclaration, TargetPlatform>() {
          @Override
          public TargetPlatform apply(final IncludeDeclaration it) {
            return LocationIndexBuilder.this.getImportedTargetPlatform(t.eResource(), it);
          }
        };
        Iterable<TargetPlatform> _filterNull = IterableExtensions.<TargetPlatform>filterNull(IterableExtensions.<IncludeDeclaration, TargetPlatform>map(IterableExtensions.<IncludeDeclaration>filter(t.getIncludes(), _function), _function_1));
        for (final TargetPlatform unvisited : _filterNull) {
          boolean _contains = visited.contains(unvisited);
          boolean _not = (!_contains);
          if (_not) {
            visited.add(unvisited);
            queue.addLast(unvisited);
            tr.addFirst(unvisited);
          }
        }
        includeRet.addAll(tr);
      }
    }
    return includeRet;
  }
  
  public List<TargetPlatform> checkIncludeCycle(final TargetPlatform targetPlatform) {
    this.compositeElementResolver.resolveCompositeElements(targetPlatform);
    final LinkedHashSet<TargetPlatform> acc = CollectionLiterals.<TargetPlatform>newLinkedHashSet();
    final LinkedList<TargetPlatform> s = CollectionLiterals.<TargetPlatform>newLinkedList();
    List<TargetPlatform> _xifexpression = null;
    boolean _checkIncludeCycle = this.checkIncludeCycle(targetPlatform, acc, s);
    if (_checkIncludeCycle) {
      _xifexpression = ListExtensions.<TargetPlatform>reverse(s);
    } else {
      _xifexpression = CollectionLiterals.<TargetPlatform>newImmutableList();
    }
    return _xifexpression;
  }
  
  private boolean checkIncludeCycle(final TargetPlatform targetPlatform, final Set<TargetPlatform> visited, final LinkedList<TargetPlatform> s) {
    s.addFirst(targetPlatform);
    final Resource context = targetPlatform.eResource();
    final Function1<IncludeDeclaration, TargetPlatform> _function = new Function1<IncludeDeclaration, TargetPlatform>() {
      @Override
      public TargetPlatform apply(final IncludeDeclaration it) {
        return LocationIndexBuilder.this.getImportedTargetPlatform(context, it);
      }
    };
    final Set<TargetPlatform> includedTPs = IterableExtensions.<TargetPlatform>toSet(IterableExtensions.<TargetPlatform>filterNull(ListExtensions.<IncludeDeclaration, TargetPlatform>map(targetPlatform.getIncludes(), _function)));
    for (final TargetPlatform includedTP : includedTPs) {
      {
        boolean _contains = s.contains(includedTP);
        if (_contains) {
          s.addFirst(includedTP);
          return true;
        }
        visited.add(includedTP);
        boolean _checkIncludeCycle = this.checkIncludeCycle(includedTP, visited, s);
        if (_checkIncludeCycle) {
          return true;
        }
      }
    }
    s.removeFirst();
    return false;
  }
  
  public TargetPlatform getImportedTargetPlatform(final Resource context, final IncludeDeclaration include) {
    TargetPlatform ret = null;
    include.generateImportURI();
    Resource resource = ResourceUtil.getResource(context, this.resolver.resolve(include));
    boolean _tripleEquals = (null == resource);
    if (_tripleEquals) {
      resource = context.getResourceSet().getResource(URI.createURI(this.resolver.resolve(include)), false);
    }
    EList<EObject> _contents = null;
    if (resource!=null) {
      _contents=resource.getContents();
    }
    EObject _head = null;
    if (_contents!=null) {
      _head=IterableExtensions.<EObject>head(_contents);
    }
    EObject root = _head;
    if ((root instanceof TargetPlatform)) {
      ret = ((TargetPlatform) root);
    }
    return ret;
  }
}
