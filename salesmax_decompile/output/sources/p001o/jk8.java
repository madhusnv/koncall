package p001o;

import p001o.gk8;
import p001o.k16;

/* loaded from: classes3.dex */
public abstract class jk8 {
    /* renamed from: a */
    public static final gk8 m33903a(gk8.C13769a c13769a, long j) {
        sq8.m48649h(c13769a, "<this>");
        long j2 = 1000;
        long j3 = j / j2;
        return c13769a.m28958a(j3, (int) ((j - (j2 * j3)) * 1000000));
    }

    /* renamed from: b */
    public static final long m33904b(gk8 gk8Var) {
        sq8.m48649h(gk8Var, "<this>");
        return (gk8Var.m28952e() * 1000) + (gk8Var.m28953g() / 1000000);
    }

    /* renamed from: c */
    public static final long m33905c(gk8 gk8Var, gk8 gk8Var2) {
        sq8.m48649h(gk8Var, "<this>");
        sq8.m48649h(gk8Var2, "other");
        k16.C14700a c14700a = k16.f31358b;
        return m16.m38176t(m33904b(gk8Var2) - m33904b(gk8Var), o16.MILLISECONDS);
    }
}
