package com.google.firebase.perf.injection.modules;

import javax.inject.Provider;
import p001o.egd;
import p001o.rwh;

/* renamed from: com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory */
/* loaded from: classes6.dex */
public final class C11432x3dbbb29c implements Provider {
    private final FirebasePerformanceModule module;

    public C11432x3dbbb29c(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static C11432x3dbbb29c create(FirebasePerformanceModule firebasePerformanceModule) {
        return new C11432x3dbbb29c(firebasePerformanceModule);
    }

    public static com.google.firebase.inject.Provider<rwh> providesTransportFactoryProvider(FirebasePerformanceModule firebasePerformanceModule) {
        return (com.google.firebase.inject.Provider) egd.m24974c(firebasePerformanceModule.providesTransportFactoryProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public com.google.firebase.inject.Provider<rwh> get() {
        return providesTransportFactoryProvider(this.module);
    }
}
