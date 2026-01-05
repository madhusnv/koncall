package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.ConfigResolver;
import javax.inject.Provider;
import p001o.egd;

/* loaded from: classes6.dex */
public final class FirebasePerformanceModule_ProvidesConfigResolverFactory implements Provider {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesConfigResolverFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesConfigResolverFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesConfigResolverFactory(firebasePerformanceModule);
    }

    public static ConfigResolver providesConfigResolver(FirebasePerformanceModule firebasePerformanceModule) {
        return (ConfigResolver) egd.m24974c(firebasePerformanceModule.providesConfigResolver(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ConfigResolver get() {
        return providesConfigResolver(this.module);
    }
}
