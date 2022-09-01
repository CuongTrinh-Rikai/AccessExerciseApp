package com.rikai.exercise;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = UserTestApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface UserTestApp_GeneratedInjector {
  void injectUserTestApp(UserTestApp userTestApp);
}
