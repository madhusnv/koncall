package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes6.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RemoteConfigComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new RemoteConfigComponent((Context) componentContainer.get(Context.class), (FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), ((AbtComponent) componentContainer.get(AbtComponent.class)).get(FirebaseABTesting.OriginService.REMOTE_CONFIG), componentContainer.getProvider(AnalyticsConnector.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(RemoteConfigComponent.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).add(Dependency.required((Class<?>) AbtComponent.class)).add(Dependency.optionalProvider((Class<?>) AnalyticsConnector.class)).factory(new ComponentFactory() { // from class: o.eie
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return RemoteConfigRegistrar.lambda$getComponents$0(componentContainer);
            }
        }).eagerInDefaultApp().build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
