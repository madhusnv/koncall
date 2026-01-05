package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Arrays;
import java.util.List;
import p001o.rwh;

@Keep
/* loaded from: classes6.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static FirebasePerformance providesFirebasePerformance(ComponentContainer componentContainer) {
        return DaggerFirebasePerformanceComponent.builder().firebasePerformanceModule(new FirebasePerformanceModule((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), componentContainer.getProvider(RemoteConfigComponent.class), componentContainer.getProvider(rwh.class))).build().getFirebasePerformance();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebasePerformance.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.requiredProvider((Class<?>) RemoteConfigComponent.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).add(Dependency.requiredProvider((Class<?>) rwh.class)).factory(new ComponentFactory() { // from class: o.g17
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebasePerfRegistrar.providesFirebasePerformance(componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, "20.2.0"));
    }
}
