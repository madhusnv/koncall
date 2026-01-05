package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import p001o.ch3;
import p001o.sq8;
import p001o.vl6;
import p001o.z74;

@Keep
/* loaded from: classes5.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component componentBuild = Component.builder(Qualified.qualified(Background.class, z74.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final z74 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Background.class, Executor.class));
                sq8.m48648g(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return vl6.m52908a((Executor) obj);
            }
        }).build();
        sq8.m48648g(componentBuild, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component componentBuild2 = Component.builder(Qualified.qualified(Lightweight.class, z74.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final z74 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
                sq8.m48648g(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return vl6.m52908a((Executor) obj);
            }
        }).build();
        sq8.m48648g(componentBuild2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component componentBuild3 = Component.builder(Qualified.qualified(Blocking.class, z74.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final z74 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
                sq8.m48648g(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return vl6.m52908a((Executor) obj);
            }
        }).build();
        sq8.m48648g(componentBuild3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component componentBuild4 = Component.builder(Qualified.qualified(UiThread.class, z74.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final z74 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(UiThread.class, Executor.class));
                sq8.m48648g(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return vl6.m52908a((Executor) obj);
            }
        }).build();
        sq8.m48648g(componentBuild4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return ch3.m21249n(componentBuild, componentBuild2, componentBuild3, componentBuild4);
    }
}
