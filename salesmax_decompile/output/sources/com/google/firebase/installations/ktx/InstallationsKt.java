package com.google.firebase.installations.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.ktx.Firebase;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class InstallationsKt {
    public static final FirebaseInstallations getInstallations(Firebase firebase) {
        sq8.m48649h(firebase, "<this>");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
        sq8.m48648g(firebaseInstallations, "getInstance()");
        return firebaseInstallations;
    }

    public static final FirebaseInstallations installations(Firebase firebase, FirebaseApp firebaseApp) {
        sq8.m48649h(firebase, "<this>");
        sq8.m48649h(firebaseApp, "app");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(firebaseApp);
        sq8.m48648g(firebaseInstallations, "getInstance(app)");
        return firebaseInstallations;
    }
}
