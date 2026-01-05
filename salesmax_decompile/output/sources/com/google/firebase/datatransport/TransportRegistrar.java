package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import p001o.cxh;
import p001o.fr1;
import p001o.rwh;

@Keep
/* loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ rwh lambda$getComponents$0(ComponentContainer componentContainer) {
        cxh.m22043f((Context) componentContainer.get(Context.class));
        return cxh.m22041c().m22047g(fr1.f23958h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(rwh.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: o.bxh
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
