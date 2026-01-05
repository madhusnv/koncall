package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class q38 {

    /* renamed from: a */
    public static final q38 f41219a = new q38();

    /* renamed from: a */
    public static final boolean m44762a(String str) {
        sq8.m48649h(str, FirebaseAnalytics.Param.METHOD);
        return (sq8.m48644c(str, "GET") || sq8.m48644c(str, "HEAD")) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m44763d(String str) {
        sq8.m48649h(str, FirebaseAnalytics.Param.METHOD);
        return sq8.m48644c(str, "POST") || sq8.m48644c(str, "PUT") || sq8.m48644c(str, "PATCH") || sq8.m48644c(str, "PROPPATCH") || sq8.m48644c(str, "REPORT");
    }

    /* renamed from: b */
    public final boolean m44764b(String str) {
        sq8.m48649h(str, FirebaseAnalytics.Param.METHOD);
        return !sq8.m48644c(str, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m44765c(String str) {
        sq8.m48649h(str, FirebaseAnalytics.Param.METHOD);
        return sq8.m48644c(str, "PROPFIND");
    }
}
