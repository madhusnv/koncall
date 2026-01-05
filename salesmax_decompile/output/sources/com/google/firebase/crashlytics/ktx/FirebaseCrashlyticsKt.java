package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.ktx.Firebase;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes4.dex */
public final class FirebaseCrashlyticsKt {
    public static final String LIBRARY_NAME = "fire-cls-ktx";

    public static final FirebaseCrashlytics getCrashlytics(Firebase firebase) {
        sq8.m48649h(firebase, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        sq8.m48648g(firebaseCrashlytics, "getInstance()");
        return firebaseCrashlytics;
    }

    public static final void setCustomKeys(FirebaseCrashlytics firebaseCrashlytics, xk7 xk7Var) {
        sq8.m48649h(firebaseCrashlytics, "<this>");
        sq8.m48649h(xk7Var, "init");
        xk7Var.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
