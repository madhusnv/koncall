package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import javax.inject.Provider;
import p001o.egd;

/* loaded from: classes6.dex */
public final class FirebasePerformanceModule_ProvidesSessionManagerFactory implements Provider {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesSessionManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesSessionManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesSessionManagerFactory(firebasePerformanceModule);
    }

    public static SessionManager providesSessionManager(FirebasePerformanceModule firebasePerformanceModule) {
        return (SessionManager) egd.m24974c(firebasePerformanceModule.providesSessionManager(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public SessionManager get() {
        return providesSessionManager(this.module);
    }
}
