package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AnalyticsKt {
    public static final String LIBRARY_NAME = "fire-analytics-ktx";
    private static volatile FirebaseAnalytics zza;
    private static final Object zzb = new Object();

    public static final FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    public static final FirebaseAnalytics getAnalytics(Firebase firebase) {
        sq8.m48649h(firebase, "<this>");
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    zza = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        sq8.m48646e(firebaseAnalytics);
        return firebaseAnalytics;
    }

    public static final Object getLOCK() {
        return zzb;
    }

    public static final void logEvent(FirebaseAnalytics firebaseAnalytics, String str, xk7 xk7Var) {
        sq8.m48649h(firebaseAnalytics, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(xk7Var, "block");
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        xk7Var.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(str, parametersBuilder.getBundle());
    }

    public static final void setANALYTICS(FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    public static final void setConsent(FirebaseAnalytics firebaseAnalytics, xk7 xk7Var) {
        sq8.m48649h(firebaseAnalytics, "<this>");
        sq8.m48649h(xk7Var, "block");
        ConsentBuilder consentBuilder = new ConsentBuilder();
        xk7Var.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
