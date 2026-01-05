package p001o;

/* loaded from: classes2.dex */
public final class sq5 {

    /* renamed from: e */
    public static final sq5 f45763e = new C16893b(0).m48636e();

    /* renamed from: f */
    public static final String f45764f = sqi.B0(0);

    /* renamed from: g */
    public static final String f45765g = sqi.B0(1);

    /* renamed from: h */
    public static final String f45766h = sqi.B0(2);

    /* renamed from: i */
    public static final String f45767i = sqi.B0(3);

    /* renamed from: a */
    public final int f45768a;

    /* renamed from: b */
    public final int f45769b;

    /* renamed from: c */
    public final int f45770c;

    /* renamed from: d */
    public final String f45771d;

    /* renamed from: o.sq5$b */
    public static final class C16893b {

        /* renamed from: a */
        public final int f45772a;

        /* renamed from: b */
        public int f45773b;

        /* renamed from: c */
        public int f45774c;

        /* renamed from: d */
        public String f45775d;

        public C16893b(int i) {
            this.f45772a = i;
        }

        /* renamed from: e */
        public sq5 m48636e() {
            op0.m42511a(this.f45773b <= this.f45774c);
            return new sq5(this);
        }

        /* renamed from: f */
        public C16893b m48637f(int i) {
            this.f45774c = i;
            return this;
        }

        /* renamed from: g */
        public C16893b m48638g(int i) {
            this.f45773b = i;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq5)) {
            return false;
        }
        sq5 sq5Var = (sq5) obj;
        return this.f45768a == sq5Var.f45768a && this.f45769b == sq5Var.f45769b && this.f45770c == sq5Var.f45770c && sqi.m48724c(this.f45771d, sq5Var.f45771d);
    }

    public int hashCode() {
        int i = (((((527 + this.f45768a) * 31) + this.f45769b) * 31) + this.f45770c) * 31;
        String str = this.f45771d;
        return i + (str == null ? 0 : str.hashCode());
    }

    public sq5(C16893b c16893b) {
        this.f45768a = c16893b.f45772a;
        this.f45769b = c16893b.f45773b;
        this.f45770c = c16893b.f45774c;
        this.f45771d = c16893b.f45775d;
    }
}
