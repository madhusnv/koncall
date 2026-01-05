package p001o;

/* loaded from: classes2.dex */
public final class ef8 {

    /* renamed from: f */
    public static final C13177a f21542f = new C13177a(null);

    /* renamed from: g */
    public static final ef8 f21543g = new ef8(false, 0, false, 0, 0, 31, null);

    /* renamed from: a */
    public final boolean f21544a;

    /* renamed from: b */
    public final int f21545b;

    /* renamed from: c */
    public final boolean f21546c;

    /* renamed from: d */
    public final int f21547d;

    /* renamed from: e */
    public final int f21548e;

    /* renamed from: o.ef8$a */
    public static final class C13177a {
        public C13177a() {
        }

        public /* synthetic */ C13177a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ef8 m24921a() {
            return ef8.f21543g;
        }
    }

    public /* synthetic */ ef8(boolean z, int i, boolean z2, int i2, int i3, id5 id5Var) {
        this(z, i, z2, i2, i3);
    }

    /* renamed from: b */
    public final boolean m24916b() {
        return this.f21546c;
    }

    /* renamed from: c */
    public final int m24917c() {
        return this.f21545b;
    }

    /* renamed from: d */
    public final int m24918d() {
        return this.f21548e;
    }

    /* renamed from: e */
    public final int m24919e() {
        return this.f21547d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef8)) {
            return false;
        }
        ef8 ef8Var = (ef8) obj;
        return this.f21544a == ef8Var.f21544a && pd9.m43459f(this.f21545b, ef8Var.f21545b) && this.f21546c == ef8Var.f21546c && qd9.m45176k(this.f21547d, ef8Var.f21547d) && df8.m22972l(this.f21548e, ef8Var.f21548e);
    }

    /* renamed from: f */
    public final boolean m24920f() {
        return this.f21544a;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f21544a) * 31) + pd9.m43460g(this.f21545b)) * 31) + Boolean.hashCode(this.f21546c)) * 31) + qd9.m45177l(this.f21547d)) * 31) + df8.m22973m(this.f21548e);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f21544a + ", capitalization=" + ((Object) pd9.m43461h(this.f21545b)) + ", autoCorrect=" + this.f21546c + ", keyboardType=" + ((Object) qd9.m45178m(this.f21547d)) + ", imeAction=" + ((Object) df8.m22974n(this.f21548e)) + ')';
    }

    public ef8(boolean z, int i, boolean z2, int i2, int i3) {
        this.f21544a = z;
        this.f21545b = i;
        this.f21546c = z2;
        this.f21547d = i2;
        this.f21548e = i3;
    }

    public /* synthetic */ ef8(boolean z, int i, boolean z2, int i2, int i3, int i4, id5 id5Var) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? pd9.f39900a.m43463b() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? qd9.f41694a.m45186h() : i2, (i4 & 16) != 0 ? df8.f19732b.m22976a() : i3, null);
    }
}
