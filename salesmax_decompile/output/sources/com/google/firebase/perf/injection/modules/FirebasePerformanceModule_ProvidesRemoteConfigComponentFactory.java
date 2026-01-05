package com.google.firebase.perf.injection.modules;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import javax.inject.Provider;
import p001o.egd;

/* loaded from: classes6.dex */
public final class FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory implements Provider {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(firebasePerformanceModule);
    }

    public static com.google.firebase.inject.Provider<RemoteConfigComponent> providesRemoteConfigComponent(FirebasePerformanceModule firebasePerformanceModule) {
        return (com.google.firebase.inject.Provider) egd.m24974c(firebasePerformanceModule.providesRemoteConfigComponent(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public com.google.firebase.inject.Provider<RemoteConfigComponent> get() {
        return providesRemoteConfigComponent(this.module);
    }
}
