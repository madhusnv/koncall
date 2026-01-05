package p001o;

import p001o.bff;

/* loaded from: classes6.dex */
public class p7g extends k7 implements b89 {

    /* renamed from: a */
    public final p79 f39559a;

    /* renamed from: b */
    public final zcj f39560b;

    /* renamed from: c */
    public final a8 f39561c;

    /* renamed from: d */
    public final wff f39562d;

    /* renamed from: e */
    public int f39563e;

    /* renamed from: f */
    public C16016a f39564f;

    /* renamed from: g */
    public final u79 f39565g;

    /* renamed from: h */
    public final m89 f39566h;

    /* renamed from: o.p7g$a */
    public static final class C16016a {

        /* renamed from: a */
        public String f39567a;

        public C16016a(String str) {
            this.f39567a = str;
        }
    }

    /* renamed from: o.p7g$b */
    public /* synthetic */ class C16017b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39568a;

        static {
            int[] iArr = new int[zcj.values().length];
            try {
                iArr[zcj.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zcj.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zcj.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zcj.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39568a = iArr;
        }
    }

    public p7g(p79 p79Var, zcj zcjVar, a8 a8Var, uef uefVar, C16016a c16016a) {
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(zcjVar, "mode");
        sq8.m48649h(a8Var, "lexer");
        sq8.m48649h(uefVar, "descriptor");
        this.f39559a = p79Var;
        this.f39560b = zcjVar;
        this.f39561c = a8Var;
        this.f39562d = p79Var.mo43085a();
        this.f39563e = -1;
        this.f39564f = c16016a;
        u79 u79VarM43087d = p79Var.m43087d();
        this.f39565g = u79VarM43087d;
        this.f39566h = u79VarM43087d.m51132i() ? null : new m89(uefVar);
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: B */
    public String mo17215B() {
        return this.f39565g.m51139p() ? this.f39561c.m16616r() : this.f39561c.m16613o();
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: C */
    public Object mo17216C(bn5 bn5Var) {
        sq8.m48649h(bn5Var, "deserializer");
        try {
            if ((bn5Var instanceof e9) && !this.f39559a.m43087d().m51138o()) {
                String strM52591c = vdd.m52591c(bn5Var.getDescriptor(), this.f39559a);
                String strMo16588E = this.f39561c.mo16588E(strM52591c, this.f39565g.m51139p());
                if (strMo16588E == null) {
                    return vdd.m52592d(this, bn5Var);
                }
                try {
                    bn5 bn5VarM56096a = xdd.m56096a((e9) bn5Var, this, strMo16588E);
                    sq8.m48647f(bn5VarM56096a, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.f39564f = new C16016a(strM52591c);
                    return bn5VarM56096a.deserialize(this);
                } catch (gff e) {
                    String message = e.getMessage();
                    sq8.m48646e(message);
                    String strV0 = f9g.v0(f9g.U0(message, '\n', null, 2, null), ".");
                    String message2 = e.getMessage();
                    sq8.m48646e(message2);
                    a8.m16582x(this.f39561c, strV0, 0, f9g.M0(message2, '\n', ""), 2, null);
                    throw new qe9();
                }
            }
            return bn5Var.deserialize(this);
        } catch (hgb e2) {
            String message3 = e2.getMessage();
            sq8.m48646e(message3);
            if (f9g.m26306P(message3, "at path", false, 2, null)) {
                throw e2;
            }
            throw new hgb(e2.m30422a(), e2.getMessage() + " at path: " + this.f39561c.f14267b.m22677a(), e2);
        }
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: D */
    public boolean mo20417D() {
        m89 m89Var = this.f39566h;
        return ((m89Var != null ? m89Var.m38550b() : false) || a8.m16580O(this.f39561c, false, 1, null)) ? false : true;
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: G */
    public byte mo17219G() {
        long jM16612m = this.f39561c.m16612m();
        byte b = (byte) jM16612m;
        if (jM16612m == b) {
            return b;
        }
        a8.m16582x(this.f39561c, "Failed to parse byte for input '" + jM16612m + '\'', 0, null, 6, null);
        throw new qe9();
    }

    /* renamed from: K */
    public final void m43145K() {
        if (this.f39561c.m16589F() != 4) {
            return;
        }
        a8.m16582x(this.f39561c, "Unexpected leading comma", 0, null, 6, null);
        throw new qe9();
    }

    /* renamed from: L */
    public final boolean m43146L(uef uefVar, int i) {
        String strM16590G;
        p79 p79Var = this.f39559a;
        if (!uefVar.mo16767i(i)) {
            return false;
        }
        uef uefVarMo16765g = uefVar.mo16765g(i);
        if (uefVarMo16765g.mo16760b() || !this.f39561c.m16597N(true)) {
            if (!sq8.m48644c(uefVarMo16765g.getKind(), bff.C12373b.f16099a)) {
                return false;
            }
            if ((uefVarMo16765g.mo16760b() && this.f39561c.m16597N(false)) || (strM16590G = this.f39561c.m16590G(this.f39565g.m51139p())) == null || u99.m51246h(uefVarMo16765g, p79Var, strM16590G) != -3) {
                return false;
            }
            this.f39561c.m16613o();
        }
        return true;
    }

    /* renamed from: M */
    public final int m43147M() {
        boolean zMo16596M = this.f39561c.mo16596M();
        if (!this.f39561c.mo16604e()) {
            if (!zMo16596M || this.f39559a.m43087d().m51126c()) {
                return -1;
            }
            w89.m54059g(this.f39561c, "array");
            throw new qe9();
        }
        int i = this.f39563e;
        if (i != -1 && !zMo16596M) {
            a8.m16582x(this.f39561c, "Expected end of the array or comma", 0, null, 6, null);
            throw new qe9();
        }
        int i2 = i + 1;
        this.f39563e = i2;
        return i2;
    }

    /* renamed from: N */
    public final int m43148N() {
        int i = this.f39563e;
        boolean zMo16596M = false;
        boolean z = i % 2 != 0;
        if (!z) {
            this.f39561c.mo16611l(':');
        } else if (i != -1) {
            zMo16596M = this.f39561c.mo16596M();
        }
        if (!this.f39561c.mo16604e()) {
            if (!zMo16596M || this.f39559a.m43087d().m51126c()) {
                return -1;
            }
            w89.m54060h(this.f39561c, null, 1, null);
            throw new qe9();
        }
        if (z) {
            if (this.f39563e == -1) {
                a8 a8Var = this.f39561c;
                boolean z2 = !zMo16596M;
                int i2 = a8Var.f14266a;
                if (!z2) {
                    a8.m16582x(a8Var, "Unexpected leading comma", i2, null, 4, null);
                    throw new qe9();
                }
            } else {
                a8 a8Var2 = this.f39561c;
                int i3 = a8Var2.f14266a;
                if (!zMo16596M) {
                    a8.m16582x(a8Var2, "Expected comma after the key-value pair", i3, null, 4, null);
                    throw new qe9();
                }
            }
        }
        int i4 = this.f39563e + 1;
        this.f39563e = i4;
        return i4;
    }

    /* renamed from: O */
    public final int m43149O(uef uefVar) {
        int iM51246h;
        boolean zMo16596M;
        boolean zMo16596M2 = this.f39561c.mo16596M();
        while (true) {
            boolean z = true;
            if (!this.f39561c.mo16604e()) {
                if (zMo16596M2 && !this.f39559a.m43087d().m51126c()) {
                    w89.m54060h(this.f39561c, null, 1, null);
                    throw new qe9();
                }
                m89 m89Var = this.f39566h;
                if (m89Var != null) {
                    return m89Var.m38552d();
                }
                return -1;
            }
            String strM43150P = m43150P();
            this.f39561c.mo16611l(':');
            iM51246h = u99.m51246h(uefVar, this.f39559a, strM43150P);
            if (iM51246h == -3) {
                zMo16596M = false;
            } else {
                if (!this.f39565g.m51129f() || !m43146L(uefVar, iM51246h)) {
                    break;
                }
                zMo16596M = this.f39561c.mo16596M();
                z = false;
            }
            zMo16596M2 = z ? m43151Q(strM43150P) : zMo16596M;
        }
        m89 m89Var2 = this.f39566h;
        if (m89Var2 != null) {
            m89Var2.m38551c(iM51246h);
        }
        return iM51246h;
    }

    /* renamed from: P */
    public final String m43150P() {
        return this.f39565g.m51139p() ? this.f39561c.m16616r() : this.f39561c.mo16608i();
    }

    /* renamed from: Q */
    public final boolean m43151Q(String str) {
        if (this.f39565g.m51133j() || m43153S(this.f39564f, str)) {
            this.f39561c.m16592I(this.f39565g.m51139p());
        } else {
            this.f39561c.m16584A(str);
        }
        return this.f39561c.mo16596M();
    }

    /* renamed from: R */
    public final void m43152R(uef uefVar) {
        while (mo16814k(uefVar) != -1) {
        }
    }

    /* renamed from: S */
    public final boolean m43153S(C16016a c16016a, String str) {
        if (c16016a == null || !sq8.m48644c(c16016a.f39567a, str)) {
            return false;
        }
        c16016a.f39567a = null;
        return true;
    }

    @Override // p001o.jo3
    /* renamed from: a */
    public wff mo20419a() {
        return this.f39562d;
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: b */
    public jo3 mo20420b(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        zcj zcjVarM16936b = adj.m16936b(this.f39559a, uefVar);
        this.f39561c.f14267b.m22679c(uefVar);
        this.f39561c.mo16611l(zcjVarM16936b.begin);
        m43145K();
        int i = C16017b.f39568a[zcjVarM16936b.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? new p7g(this.f39559a, zcjVarM16936b, this.f39561c, uefVar, this.f39564f) : (this.f39560b == zcjVarM16936b && this.f39559a.m43087d().m51132i()) ? this : new p7g(this.f39559a, zcjVarM16936b, this.f39561c, uefVar, this.f39564f);
    }

    @Override // p001o.k7, p001o.jo3
    /* renamed from: c */
    public void mo18548c(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        if (this.f39559a.m43087d().m51133j() && uefVar.mo16762d() == 0) {
            m43152R(uefVar);
        }
        if (this.f39561c.mo16596M() && !this.f39559a.m43087d().m51126c()) {
            w89.m54059g(this.f39561c, "");
            throw new qe9();
        }
        this.f39561c.mo16611l(this.f39560b.end);
        this.f39561c.f14267b.m22678b();
    }

    @Override // p001o.b89
    /* renamed from: d */
    public final p79 mo18278d() {
        return this.f39559a;
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: e */
    public int mo17238e(uef uefVar) {
        sq8.m48649h(uefVar, "enumDescriptor");
        return u99.m51247i(uefVar, this.f39559a, mo17215B(), " at path " + this.f39561c.f14267b.m22677a());
    }

    @Override // p001o.b89
    /* renamed from: f */
    public k89 mo18279f() {
        return new cb9(this.f39559a.m43087d(), this.f39561c).m20650e();
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: h */
    public int mo17240h() {
        long jM16612m = this.f39561c.m16612m();
        int i = (int) jM16612m;
        if (jM16612m == i) {
            return i;
        }
        a8.m16582x(this.f39561c, "Failed to parse int for input '" + jM16612m + '\'', 0, null, 6, null);
        throw new qe9();
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: i */
    public Void mo17241i() {
        return null;
    }

    @Override // p001o.jo3
    /* renamed from: k */
    public int mo16814k(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        int i = C16017b.f39568a[this.f39560b.ordinal()];
        int iM43147M = i != 2 ? i != 4 ? m43147M() : m43149O(uefVar) : m43148N();
        if (this.f39560b != zcj.MAP) {
            this.f39561c.f14267b.m22683g(iM43147M);
        }
        return iM43147M;
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: l */
    public long mo17243l() {
        return this.f39561c.m16612m();
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: s */
    public short mo17250s() {
        long jM16612m = this.f39561c.m16612m();
        short s = (short) jM16612m;
        if (jM16612m == s) {
            return s;
        }
        a8.m16582x(this.f39561c, "Failed to parse short for input '" + jM16612m + '\'', 0, null, 6, null);
        throw new qe9();
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: t */
    public float mo17251t() throws NumberFormatException {
        a8 a8Var = this.f39561c;
        String strM16615q = a8Var.m16615q();
        try {
            float f = Float.parseFloat(strM16615q);
            if (!this.f39559a.m43087d().m51124a()) {
                if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
                    w89.m54063k(this.f39561c, Float.valueOf(f));
                    throw new qe9();
                }
            }
            return f;
        } catch (IllegalArgumentException unused) {
            a8.m16582x(a8Var, "Failed to parse type 'float' for input '" + strM16615q + '\'', 0, null, 6, null);
            throw new qe9();
        }
    }

    @Override // p001o.k7, p001o.jo3
    /* renamed from: u */
    public Object mo17252u(uef uefVar, int i, bn5 bn5Var, Object obj) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(bn5Var, "deserializer");
        boolean z = this.f39560b == zcj.MAP && (i & 1) == 0;
        if (z) {
            this.f39561c.f14267b.m22680d();
        }
        Object objMo17252u = super.mo17252u(uefVar, i, bn5Var, obj);
        if (z) {
            this.f39561c.f14267b.m22682f(objMo17252u);
        }
        return objMo17252u;
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: w */
    public double mo17254w() throws NumberFormatException {
        a8 a8Var = this.f39561c;
        String strM16615q = a8Var.m16615q();
        try {
            double d = Double.parseDouble(strM16615q);
            if (!this.f39559a.m43087d().m51124a()) {
                if (!((Double.isInfinite(d) || Double.isNaN(d)) ? false : true)) {
                    w89.m54063k(this.f39561c, Double.valueOf(d));
                    throw new qe9();
                }
            }
            return d;
        } catch (IllegalArgumentException unused) {
            a8.m16582x(a8Var, "Failed to parse type 'double' for input '" + strM16615q + '\'', 0, null, 6, null);
            throw new qe9();
        }
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: x */
    public boolean mo17255x() {
        return this.f39561c.m16606g();
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: y */
    public char mo17256y() {
        String strM16615q = this.f39561c.m16615q();
        if (strM16615q.length() == 1) {
            return strM16615q.charAt(0);
        }
        a8.m16582x(this.f39561c, "Expected single char, but got '" + strM16615q + '\'', 0, null, 6, null);
        throw new qe9();
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: z */
    public w75 mo17257z(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        return r7g.m46312b(uefVar) ? new c89(this.f39561c, this.f39559a) : super.mo17257z(uefVar);
    }
}
