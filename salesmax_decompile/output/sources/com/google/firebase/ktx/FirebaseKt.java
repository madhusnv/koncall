package com.google.firebase.ktx;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import p001o.sq8;
import p001o.vl6;
import p001o.z74;

/* loaded from: classes5.dex */
public final class FirebaseKt {
    public static final FirebaseApp app(Firebase firebase, String str) {
        sq8.m48649h(firebase, "<this>");
        sq8.m48649h(str, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        sq8.m48648g(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    private static final /* synthetic */ <T extends Annotation> Component<z74> coroutineDispatcher() {
        sq8.m48655n(4, "T");
        Component.Builder builder = Component.builder(Qualified.qualified(Annotation.class, z74.class));
        sq8.m48655n(4, "T");
        Component.Builder builderAdd = builder.add(Dependency.required((Qualified<?>) Qualified.qualified(Annotation.class, Executor.class)));
        sq8.m48654m();
        Component<z74> componentBuild = builderAdd.factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseKt.coroutineDispatcher.1
            @Override // com.google.firebase.components.ComponentFactory
            public final z74 create(ComponentContainer componentContainer) {
                sq8.m48655n(4, "T");
                Object obj = componentContainer.get(Qualified.qualified(Annotation.class, Executor.class));
                sq8.m48648g(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return vl6.m52908a((Executor) obj);
            }
        }).build();
        sq8.m48648g(componentBuild, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return componentBuild;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        sq8.m48649h(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        sq8.m48648g(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        sq8.m48649h(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        sq8.m48648g(options, "Firebase.app.options");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        sq8.m48649h(firebase, "<this>");
        sq8.m48649h(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions) {
        sq8.m48649h(firebase, "<this>");
        sq8.m48649h(context, "context");
        sq8.m48649h(firebaseOptions, "options");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        sq8.m48648g(firebaseAppInitializeApp, "initializeApp(context, options)");
        return firebaseAppInitializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions, String str) {
        sq8.m48649h(firebase, "<this>");
        sq8.m48649h(context, "context");
        sq8.m48649h(firebaseOptions, "options");
        sq8.m48649h(str, "name");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        sq8.m48648g(firebaseAppInitializeApp, "initializeApp(context, options, name)");
        return firebaseAppInitializeApp;
    }
}
