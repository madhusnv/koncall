package com.google.firebase.perf.ktx;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import p001o.bj8;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes6.dex */
public final class PerformanceKt {
    public static final String LIBRARY_NAME = "fire-perf-ktx";

    public static final FirebasePerformance getPerformance(Firebase firebase) {
        sq8.m48649h(firebase, "<this>");
        FirebasePerformance firebasePerformance = FirebasePerformance.getInstance();
        sq8.m48648g(firebasePerformance, "getInstance()");
        return firebasePerformance;
    }

    public static final void trace(HttpMetric httpMetric, xk7 xk7Var) {
        sq8.m48649h(httpMetric, "<this>");
        sq8.m48649h(xk7Var, "block");
        httpMetric.start();
        try {
            xk7Var.invoke(httpMetric);
        } finally {
            bj8.m19244b(1);
            httpMetric.stop();
            bj8.m19243a(1);
        }
    }

    public static final <T> T trace(Trace trace, xk7 xk7Var) {
        sq8.m48649h(trace, "<this>");
        sq8.m48649h(xk7Var, "block");
        trace.start();
        try {
            return (T) xk7Var.invoke(trace);
        } finally {
            bj8.m19244b(1);
            trace.stop();
            bj8.m19243a(1);
        }
    }
}
