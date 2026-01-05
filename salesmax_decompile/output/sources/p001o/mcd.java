package p001o;

/* loaded from: classes2.dex */
public abstract class mcd {
    /* renamed from: a */
    public static final boolean m38743a(vcd vcdVar) {
        sq8.m48649h(vcdVar, "<this>");
        return !vcdVar.m52529i() && vcdVar.m52527g();
    }

    /* renamed from: b */
    public static final boolean m38744b(vcd vcdVar) {
        sq8.m48649h(vcdVar, "<this>");
        return vcdVar.m52529i() && !vcdVar.m52527g();
    }

    /* renamed from: c */
    public static final boolean m38745c(vcd vcdVar, long j) {
        sq8.m48649h(vcdVar, "$this$isOutOfBounds");
        long jM52526f = vcdVar.m52526f();
        float fM48052k = s9c.m48052k(jM52526f);
        float fM48053l = s9c.m48053l(jM52526f);
        return fM48052k < 0.0f || fM48052k > ((float) ml8.m39312e(j)) || fM48053l < 0.0f || fM48053l > ((float) ml8.m39311d(j));
    }

    /* renamed from: d */
    public static final long m38746d(vcd vcdVar, boolean z) {
        long jM48056o = s9c.m48056o(vcdVar.m52526f(), vcdVar.m52528h());
        return (z || !vcdVar.m52531k()) ? jM48056o : s9c.f45035b.m48063c();
    }

    /* renamed from: e */
    public static final boolean m38747e(vcd vcdVar) {
        sq8.m48649h(vcdVar, "<this>");
        return !s9c.m48050i(m38746d(vcdVar, true), s9c.f45035b.m48063c());
    }
}
