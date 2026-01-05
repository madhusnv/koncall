package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aw8 extends vv8 {

    /* renamed from: g */
    public static final aw8 f15300g;

    /* renamed from: h */
    public static final aw8 f15301h;

    /* renamed from: b */
    public final byte[] f15303b;

    /* renamed from: c */
    public final String f15304c;

    /* renamed from: d */
    public final gi9 f15305d;

    /* renamed from: e */
    public final gi9 f15306e;

    /* renamed from: f */
    public static final C12260a f15299f = new C12260a(null);

    /* renamed from: i */
    public static final byte[] f15302i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1};

    /* renamed from: o.aw8$a */
    public static final class C12260a {
        public C12260a() {
        }

        public /* synthetic */ C12260a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final aw8 m17907a() {
            return aw8.f15300g;
        }
    }

    /* renamed from: o.aw8$b */
    public static final class C12261b {

        /* renamed from: a */
        public int f15307a;

        /* renamed from: b */
        public int f15308b;

        public C12261b(int i, int i2) {
            this.f15307a = i;
            this.f15308b = i2;
        }

        /* renamed from: a */
        public final int m17908a() {
            return this.f15308b;
        }

        /* renamed from: b */
        public final int m17909b() {
            return this.f15307a;
        }

        /* renamed from: c */
        public final void m17910c(int i) {
            this.f15308b = i;
        }

        /* renamed from: d */
        public final void m17911d(int i) {
            this.f15307a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12261b)) {
                return false;
            }
            C12261b c12261b = (C12261b) obj;
            return this.f15307a == c12261b.f15307a && this.f15308b == c12261b.f15308b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f15307a) * 31) + Integer.hashCode(this.f15308b);
        }

        public String toString() {
            return "Span(start=" + this.f15307a + ", len=" + this.f15308b + ')';
        }

        public /* synthetic */ C12261b(int i, int i2, int i3, id5 id5Var) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    /* renamed from: o.aw8$c */
    public static final class C12262c implements uk7 {
        public C12262c() {
        }

        /* renamed from: a */
        public final short[] m17912a() {
            int length = aw8.this.mo17900a().length / 2;
            aw8 aw8Var = aw8.this;
            short[] sArr = new short[length];
            for (int i = 0; i < length; i++) {
                byte[] bArrMo17900a = aw8Var.mo17900a();
                int i2 = i * 2;
                if (!(i2 <= bArrMo17900a.length + (-2))) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                sArr[i] = d1i.m22246c((short) ((bArrMo17900a[i2 + 1] & 255) | ((bArrMo17900a[i2] & 255) << 8)));
            }
            return e1i.m24126j(sArr);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            return e1i.m24124d(m17912a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 2;
        f15300g = new aw8(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        f15301h = new aw8(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    public /* synthetic */ aw8(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, String str, id5 id5Var) {
        this(s, s2, s3, s4, s5, s6, s7, s8, str);
    }

    /* renamed from: f */
    public static final String m17898f(aw8 aw8Var) {
        String string;
        xv8 xv8VarM17906l = aw8Var.m17906l();
        if (aw8Var.mo17901b()) {
            string = "::1";
        } else if (aw8Var.m17905k()) {
            string = "::";
        } else if (xv8VarM17906l != null) {
            string = "::ffff:" + xv8VarM17906l;
        } else {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int i2 = 3;
            id5 id5Var = null;
            C12261b c12261b = new C12261b(i, i, i2, id5Var);
            C12261b c12261b2 = new C12261b(i, i, i2, id5Var);
            short[] sArrM17904j = aw8Var.m17904j();
            int iM24131y = e1i.m24131y(sArrM17904j);
            int i3 = 0;
            int i4 = 0;
            while (i3 < iM24131y) {
                int i5 = i4 + 1;
                if (e1i.m24130v(sArrM17904j, i3) == d1i.m22246c((short) 0)) {
                    if (c12261b.m17908a() == 0) {
                        c12261b.m17911d(i4);
                    }
                    c12261b.m17910c(c12261b.m17908a() + 1);
                    if (c12261b.m17908a() > c12261b2.m17908a()) {
                        c12261b2 = c12261b;
                    }
                } else {
                    c12261b = new C12261b(i, i, i2, id5Var);
                }
                i3++;
                i4 = i5;
            }
            if (c12261b2.m17908a() > 1) {
                aw8Var.m17902g(sb, bce.m18616s(0, c12261b2.m17909b()));
                sb.append("::");
                aw8Var.m17902g(sb, bce.m18616s(c12261b2.m17909b() + c12261b2.m17908a(), e1i.m24131y(aw8Var.m17904j())));
            } else {
                aw8Var.m17902g(sb, gp0.m29259Z(aw8Var.m17904j()));
            }
            string = sb.toString();
            sq8.m48648g(string, "toString(...)");
        }
        if (aw8Var.f15304c == null) {
            return string;
        }
        return string + '%' + aw8Var.f15304c;
    }

    /* renamed from: h */
    public static final CharSequence m17899h(aw8 aw8Var, int i) {
        return m1i.m38185a(e1i.m24130v(aw8Var.m17904j(), i), 16);
    }

    @Override // p001o.vv8
    /* renamed from: a */
    public byte[] mo17900a() {
        return this.f15303b;
    }

    @Override // p001o.vv8
    /* renamed from: b */
    public boolean mo17901b() {
        return sq8.m48644c(this, f15300g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && aw8.class == obj.getClass() && Arrays.equals(mo17900a(), ((aw8) obj).mo17900a());
    }

    /* renamed from: g */
    public final StringBuilder m17902g(StringBuilder sb, kl8 kl8Var) {
        return (StringBuilder) kh3.m0(kl8Var, sb, (124 & 2) != 0 ? ", " : ":", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new xk7() { // from class: o.zv8
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return aw8.m17899h(this.f57786a, ((Integer) obj).intValue());
            }
        });
    }

    public int hashCode() {
        return Arrays.hashCode(mo17900a());
    }

    /* renamed from: i */
    public String m17903i() {
        return (String) this.f15306e.getValue();
    }

    /* renamed from: j */
    public final short[] m17904j() {
        return ((e1i) this.f15305d.getValue()).m24132J();
    }

    /* renamed from: k */
    public boolean m17905k() {
        return sq8.m48644c(this, f15301h);
    }

    /* renamed from: l */
    public final xv8 m17906l() {
        byte[] bArr = f15302i;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (mo17900a()[i2] != bArr[i]) {
                return null;
            }
            i++;
            i2 = i3;
        }
        return new xv8(gp0.v0(mo17900a(), bce.m18616s(f15302i.length, mo17900a().length)));
    }

    public String toString() {
        return m17903i();
    }

    public /* synthetic */ aw8(byte[] bArr, String str, int i, id5 id5Var) {
        this(bArr, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw8(byte[] bArr, String str) {
        super(null);
        sq8.m48649h(bArr, "octets");
        this.f15303b = bArr;
        this.f15304c = str;
        if (mo17900a().length == 16) {
            this.f15305d = si9.m48360a(new C12262c());
            this.f15306e = si9.m48360a(new uk7() { // from class: o.yv8
                @Override // p001o.uk7
                public final Object invoke() {
                    return aw8.m17898f(this.f56142a);
                }
            });
        } else {
            throw new IllegalArgumentException(("Invalid IPv6 repr: " + mo17900a() + "; expected 16 bytes").toString());
        }
    }

    public /* synthetic */ aw8(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, String str, int i, id5 id5Var) {
        this(s, s2, s3, s4, s5, s6, s7, s8, (i & 256) != 0 ? null : str, null);
    }

    public aw8(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, String str) {
        this(bw8.m19904b(s, s2, s3, s4, s5, s6, s7, s8), str);
    }
}
