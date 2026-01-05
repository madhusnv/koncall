package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.FirebaseInstallationsApi;
import javax.inject.Provider;
import p001o.egd;

/* loaded from: classes6.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory implements Provider {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(firebasePerformanceModule);
    }

    public static FirebaseInstallationsApi providesFirebaseInstallations(FirebasePerformanceModule firebasePerformanceModule) {
        return (FirebaseInstallationsApi) egd.m24974c(firebasePerformanceModule.providesFirebaseInstallations(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public FirebaseInstallationsApi get() {
        return providesFirebaseInstallations(this.module);
    }
}
