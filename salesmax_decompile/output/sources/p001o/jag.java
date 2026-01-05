package p001o;

import p001o.iag;

/* loaded from: classes2.dex */
public final class jag implements rb3 {

    /* renamed from: a */
    public final r9d f30065a;

    /* renamed from: b */
    public final t18 f30066b;

    /* renamed from: c */
    public final String f30067c;

    public jag(r9d r9dVar, t18 t18Var, String str) {
        sq8.m48649h(r9dVar, "platformProvider");
        this.f30065a = r9dVar;
        this.f30066b = t18Var;
        this.f30067c = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p001o.qc4, p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        return iag.C14230a.m31808b(iag.f28350e, null, null, this.f30067c, null, 0L, this.f30065a, this.f30066b, 27, null).resolve(qx0Var, n64Var);
    }
}
