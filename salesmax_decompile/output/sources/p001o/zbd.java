package p001o;

/* loaded from: classes3.dex */
public final class zbd {

    /* renamed from: c */
    public static final C18611b f56906c = new C18611b(null);

    /* renamed from: a */
    public final Float f56907a;

    /* renamed from: b */
    public final Float f56908b;

    /* renamed from: o.zbd$a */
    public static final class C18610a {

        /* renamed from: a */
        public Float f56909a;

        /* renamed from: b */
        public Float f56910b;

        /* renamed from: a */
        public final zbd m59156a() {
            return new zbd(this, null);
        }

        /* renamed from: b */
        public final C18610a m59157b() {
            return this;
        }

        /* renamed from: c */
        public final Float m59158c() {
            return this.f56909a;
        }

        /* renamed from: d */
        public final Float m59159d() {
            return this.f56910b;
        }

        /* renamed from: e */
        public final void m59160e(Float f) {
            this.f56909a = f;
        }

        /* renamed from: f */
        public final void m59161f(Float f) {
            this.f56910b = f;
        }
    }

    /* renamed from: o.zbd$b */
    public static final class C18611b {
        public C18611b() {
        }

        public /* synthetic */ C18611b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ zbd(C18610a c18610a, id5 id5Var) {
        this(c18610a);
    }

    /* renamed from: a */
    public final Float m59154a() {
        return this.f56907a;
    }

    /* renamed from: b */
    public final Float m59155b() {
        return this.f56908b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zbd.class != obj.getClass()) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        Float f = this.f56907a;
        if (!(f != null ? f.equals(zbdVar.f56907a) : zbdVar.f56907a == null)) {
            return false;
        }
        Float f2 = this.f56908b;
        Float f3 = zbdVar.f56908b;
        return f2 != null ? f2.equals(f3) : f3 == null;
    }

    public int hashCode() {
        Float f = this.f56907a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f56908b;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Point(");
        sb.append("x=" + this.f56907a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("y=");
        sb2.append(this.f56908b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public zbd(C18610a c18610a) {
        this.f56907a = c18610a.m59158c();
        this.f56908b = c18610a.m59159d();
    }
}
