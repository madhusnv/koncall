package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import javax.inject.Provider;
import p001o.egd;

/* loaded from: classes6.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseAppFactory implements Provider {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesFirebaseAppFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesFirebaseAppFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseAppFactory(firebasePerformanceModule);
    }

    public static FirebaseApp providesFirebaseApp(FirebasePerformanceModule firebasePerformanceModule) {
        return (FirebaseApp) egd.m24974c(firebasePerformanceModule.providesFirebaseApp(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public FirebaseApp get() {
        return providesFirebaseApp(this.module);
    }
}
