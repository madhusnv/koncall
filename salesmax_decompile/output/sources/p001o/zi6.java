package p001o;

import p001o.zi6;

/* loaded from: classes3.dex */
public final class zi6 {

    /* renamed from: e */
    public static final C18651a f57249e = new C18651a(null);

    /* renamed from: a */
    public final xk7 f57250a;

    /* renamed from: b */
    public final String f57251b;

    /* renamed from: c */
    public final String f57252c;

    /* renamed from: d */
    public final Object f57253d;

    /* renamed from: o.zi6$a */
    public static final class C18651a {
        public C18651a() {
        }

        public /* synthetic */ C18651a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public static final zi6 m59496c(xk7 xk7Var, String str, String str2) {
            sq8.m48649h(str, "sysProp");
            sq8.m48649h(str2, "envVar");
            return new zi6(xk7Var, str, str2, null, 8, null);
        }

        /* renamed from: b */
        public final nl7 m59497b(final xk7 xk7Var) {
            sq8.m48649h(xk7Var, "asTyped");
            return new nl7() { // from class: o.yi6
                @Override // p001o.nl7
                public final Object invoke(Object obj, Object obj2) {
                    return zi6.C18651a.m59496c(xk7Var, (String) obj, (String) obj2);
                }
            };
        }
    }

    public zi6(xk7 xk7Var, String str, String str2, Object obj) {
        sq8.m48649h(xk7Var, "parse");
        sq8.m48649h(str, "sysProp");
        sq8.m48649h(str2, "envVar");
        this.f57250a = xk7Var;
        this.f57251b = str;
        this.f57252c = str2;
        this.f57253d = obj;
    }

    /* renamed from: b */
    public static /* synthetic */ zi6 m59488b(zi6 zi6Var, xk7 xk7Var, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            xk7Var = zi6Var.f57250a;
        }
        if ((i & 2) != 0) {
            str = zi6Var.f57251b;
        }
        if ((i & 4) != 0) {
            str2 = zi6Var.f57252c;
        }
        if ((i & 8) != 0) {
            obj = zi6Var.f57253d;
        }
        return zi6Var.m59489a(xk7Var, str, str2, obj);
    }

    /* renamed from: a */
    public final zi6 m59489a(xk7 xk7Var, String str, String str2, Object obj) {
        sq8.m48649h(xk7Var, "parse");
        sq8.m48649h(str, "sysProp");
        sq8.m48649h(str2, "envVar");
        return new zi6(xk7Var, str, str2, obj);
    }

    /* renamed from: c */
    public final Object m59490c() {
        return this.f57253d;
    }

    /* renamed from: d */
    public final String m59491d() {
        return this.f57252c;
    }

    /* renamed from: e */
    public final xk7 m59492e() {
        return this.f57250a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi6)) {
            return false;
        }
        zi6 zi6Var = (zi6) obj;
        return sq8.m48644c(this.f57250a, zi6Var.f57250a) && sq8.m48644c(this.f57251b, zi6Var.f57251b) && sq8.m48644c(this.f57252c, zi6Var.f57252c) && sq8.m48644c(this.f57253d, zi6Var.f57253d);
    }

    /* renamed from: f */
    public final String m59493f() {
        return this.f57251b;
    }

    /* renamed from: g */
    public final zi6 m59494g(Object obj) {
        return m59488b(this, null, null, null, obj, 7, null);
    }

    public int hashCode() {
        int iHashCode = ((((this.f57250a.hashCode() * 31) + this.f57251b.hashCode()) * 31) + this.f57252c.hashCode()) * 31;
        Object obj = this.f57253d;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "EnvironmentSetting(parse=" + this.f57250a + ", sysProp=" + this.f57251b + ", envVar=" + this.f57252c + ", defaultValue=" + this.f57253d + ')';
    }

    public /* synthetic */ zi6(xk7 xk7Var, String str, String str2, Object obj, int i, id5 id5Var) {
        this(xk7Var, str, str2, (i & 8) != 0 ? null : obj);
    }
}
