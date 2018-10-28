package fr.obeo.releng.targetplatform.tests.util;

import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.util.TargetReloader;

/**
 * We implement a special target reloader for test because:
 * After the call of unload on the resource, the method "EcoreUtil2.getResource" used in
 * production code of TargetReloader: "TargetReloaderImpl" return null.
 * 
 * In test, ParseHelper is used. It generates target in ResourceSet not the same way
 * as in normal code. Hence target unload / reload does not work the same.
 */
@SuppressWarnings("all")
public class TargetReloaderTestImpl implements TargetReloader {
  @Override
  public TargetPlatform getUpToDateTarget(final TargetPlatform targetPlatformBase, final TargetPlatform importedTargetPlatform) {
    return importedTargetPlatform;
  }
}
