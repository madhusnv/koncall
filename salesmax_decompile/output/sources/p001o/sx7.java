package p001o;

import p001o.zq1;

/* loaded from: classes6.dex */
public final class sx7 {

    /* renamed from: d */
    public static final C16934a f46077d = new C16934a(null);

    /* renamed from: e */
    public static final zq1 f46078e;

    /* renamed from: f */
    public static final zq1 f46079f;

    /* renamed from: g */
    public static final zq1 f46080g;

    /* renamed from: h */
    public static final zq1 f46081h;

    /* renamed from: i */
    public static final zq1 f46082i;

    /* renamed from: j */
    public static final zq1 f46083j;

    /* renamed from: a */
    public final zq1 f46084a;

    /* renamed from: b */
    public final zq1 f46085b;

    /* renamed from: c */
    public final int f46086c;

    /* renamed from: o.sx7$a */
    public static final class C16934a {
        public C16934a() {
        }

        public /* synthetic */ C16934a(id5 id5Var) {
            this();
        }
    }

    static {
        zq1.C18692a c18692a = zq1.f57497d;
        f46078e = c18692a.m59707c(":");
        f46079f = c18692a.m59707c(":status");
        f46080g = c18692a.m59707c(":method");
        f46081h = c18692a.m59707c(":path");
        f46082i = c18692a.m59707c(":scheme");
        f46083j = c18692a.m59707c(":authority");
    }

    public sx7(zq1 zq1Var, zq1 zq1Var2) {
        sq8.m48649h(zq1Var, "name");
        sq8.m48649h(zq1Var2, "value");
        this.f46084a = zq1Var;
        this.f46085b = zq1Var2;
        this.f46086c = zq1Var.m59694L() + 32 + zq1Var2.m59694L();
    }

    /* renamed from: a */
    public final zq1 m49070a() {
        return this.f46084a;
    }

    /* renamed from: b */
    public final zq1 m49071b() {
        return this.f46085b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx7)) {
            return false;
        }
        sx7 sx7Var = (sx7) obj;
        return sq8.m48644c(this.f46084a, sx7Var.f46084a) && sq8.m48644c(this.f46085b, sx7Var.f46085b);
    }

    public int hashCode() {
        return (this.f46084a.hashCode() * 31) + this.f46085b.hashCode();
    }

    public String toString() {
        return this.f46084a.m59696R() + ": " + this.f46085b.m59696R();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sx7(String str, String str2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        zq1.C18692a c18692a = zq1.f57497d;
        this(c18692a.m59707c(str), c18692a.m59707c(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sx7(zq1 zq1Var, String str) {
        this(zq1Var, zq1.f57497d.m59707c(str));
        sq8.m48649h(zq1Var, "name");
        sq8.m48649h(str, "value");
    }
}
