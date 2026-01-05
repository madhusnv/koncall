package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import javax.inject.Provider;
import p001o.egd;

/* loaded from: classes6.dex */
public final class FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory implements Provider {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(firebasePerformanceModule);
    }

    public static RemoteConfigManager providesRemoteConfigManager(FirebasePerformanceModule firebasePerformanceModule) {
        return (RemoteConfigManager) egd.m24974c(firebasePerformanceModule.providesRemoteConfigManager(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public RemoteConfigManager get() {
        return providesRemoteConfigManager(this.module);
    }
}
