package com.google.firebase.perf.injection.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.FirebasePerformance_Factory;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.injection.modules.C11432x3dbbb29c;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesSessionManagerFactory;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import javax.inject.Provider;
import p001o.dx5;
import p001o.egd;
import p001o.rwh;

/* loaded from: classes6.dex */
public final class DaggerFirebasePerformanceComponent implements FirebasePerformanceComponent {
    private Provider<FirebasePerformance> firebasePerformanceProvider;
    private Provider<ConfigResolver> providesConfigResolverProvider;
    private Provider<FirebaseApp> providesFirebaseAppProvider;
    private Provider<FirebaseInstallationsApi> providesFirebaseInstallationsProvider;
    private Provider<com.google.firebase.inject.Provider<RemoteConfigComponent>> providesRemoteConfigComponentProvider;
    private Provider<RemoteConfigManager> providesRemoteConfigManagerProvider;
    private Provider<SessionManager> providesSessionManagerProvider;
    private Provider<com.google.firebase.inject.Provider<rwh>> providesTransportFactoryProvider;

    public static final class Builder {
        private FirebasePerformanceModule firebasePerformanceModule;

        public FirebasePerformanceComponent build() {
            egd.m24972a(this.firebasePerformanceModule, FirebasePerformanceModule.class);
            return new DaggerFirebasePerformanceComponent(this.firebasePerformanceModule);
        }

        public Builder firebasePerformanceModule(FirebasePerformanceModule firebasePerformanceModule) {
            this.firebasePerformanceModule = (FirebasePerformanceModule) egd.m24973b(firebasePerformanceModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(FirebasePerformanceModule firebasePerformanceModule) {
        this.providesFirebaseAppProvider = FirebasePerformanceModule_ProvidesFirebaseAppFactory.create(firebasePerformanceModule);
        this.providesRemoteConfigComponentProvider = FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.create(firebasePerformanceModule);
        this.providesFirebaseInstallationsProvider = FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.create(firebasePerformanceModule);
        this.providesTransportFactoryProvider = C11432x3dbbb29c.create(firebasePerformanceModule);
        this.providesRemoteConfigManagerProvider = FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.create(firebasePerformanceModule);
        this.providesConfigResolverProvider = FirebasePerformanceModule_ProvidesConfigResolverFactory.create(firebasePerformanceModule);
        FirebasePerformanceModule_ProvidesSessionManagerFactory firebasePerformanceModule_ProvidesSessionManagerFactoryCreate = FirebasePerformanceModule_ProvidesSessionManagerFactory.create(firebasePerformanceModule);
        this.providesSessionManagerProvider = firebasePerformanceModule_ProvidesSessionManagerFactoryCreate;
        this.firebasePerformanceProvider = dx5.m23919a(FirebasePerformance_Factory.create(this.providesFirebaseAppProvider, this.providesRemoteConfigComponentProvider, this.providesFirebaseInstallationsProvider, this.providesTransportFactoryProvider, this.providesRemoteConfigManagerProvider, this.providesConfigResolverProvider, firebasePerformanceModule_ProvidesSessionManagerFactoryCreate));
    }

    @Override // com.google.firebase.perf.injection.components.FirebasePerformanceComponent
    public FirebasePerformance getFirebasePerformance() {
        return this.firebasePerformanceProvider.get();
    }

    private DaggerFirebasePerformanceComponent(FirebasePerformanceModule firebasePerformanceModule) {
        initialize(firebasePerformanceModule);
    }
}
