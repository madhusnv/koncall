package p001o;

import p001o.p9g;
import p001o.vdd;

/* loaded from: classes6.dex */
public final class q7g extends m7 implements q89 {

    /* renamed from: a */
    public final vn3 f41434a;

    /* renamed from: b */
    public final p79 f41435b;

    /* renamed from: c */
    public final zcj f41436c;

    /* renamed from: d */
    public final q89[] f41437d;

    /* renamed from: e */
    public final wff f41438e;

    /* renamed from: f */
    public final u79 f41439f;

    /* renamed from: g */
    public boolean f41440g;

    /* renamed from: h */
    public String f41441h;

    /* renamed from: o.q7g$a */
    public /* synthetic */ class C16318a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41442a;

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
            f41442a = iArr;
        }
    }

    public q7g(vn3 vn3Var, p79 p79Var, zcj zcjVar, q89[] q89VarArr) {
        sq8.m48649h(vn3Var, "composer");
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(zcjVar, "mode");
        this.f41434a = vn3Var;
        this.f41435b = p79Var;
        this.f41436c = zcjVar;
        this.f41437d = q89VarArr;
        this.f41438e = mo44939d().mo43085a();
        this.f41439f = mo44939d().m43087d();
        int iOrdinal = zcjVar.ordinal();
        if (q89VarArr != null) {
            q89 q89Var = q89VarArr[iOrdinal];
            if (q89Var == null && q89Var == this) {
                return;
            }
            q89VarArr[iOrdinal] = this;
        }
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: B */
    public void mo29873B(int i) {
        if (this.f41440g) {
            mo29875F(String.valueOf(i));
        } else {
            this.f41434a.mo25363i(i);
        }
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: F */
    public void mo29875F(String str) {
        sq8.m48649h(str, "value");
        this.f41434a.mo53032n(str);
    }

    @Override // p001o.m7
    /* renamed from: G */
    public boolean mo25644G(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        int i2 = C16318a.f41442a[this.f41436c.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.f41434a.m53026a()) {
                        this.f41434a.m53027f(',');
                    }
                    this.f41434a.mo30874c();
                    mo29875F(u99.m51245g(uefVar, mo44939d(), i));
                    this.f41434a.m53027f(':');
                    this.f41434a.mo30876p();
                } else {
                    if (i == 0) {
                        this.f41440g = true;
                    }
                    if (i == 1) {
                        this.f41434a.m53027f(',');
                        this.f41434a.mo30876p();
                        this.f41440g = false;
                    }
                }
            } else if (this.f41434a.m53026a()) {
                this.f41440g = true;
                this.f41434a.mo30874c();
            } else {
                if (i % 2 == 0) {
                    this.f41434a.m53027f(',');
                    this.f41434a.mo30874c();
                    z = true;
                } else {
                    this.f41434a.m53027f(':');
                    this.f41434a.mo30876p();
                }
                this.f41440g = z;
            }
        } else {
            if (!this.f41434a.m53026a()) {
                this.f41434a.m53027f(',');
            }
            this.f41434a.mo30874c();
        }
        return true;
    }

    /* renamed from: J */
    public final void m44938J(uef uefVar) {
        this.f41434a.mo30874c();
        String str = this.f41441h;
        sq8.m48646e(str);
        mo29875F(str);
        this.f41434a.m53027f(':');
        this.f41434a.mo30876p();
        mo29875F(uefVar.mo16766h());
    }

    @Override // p001o.h76
    /* renamed from: a */
    public wff mo25648a() {
        return this.f41438e;
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: b */
    public lo3 mo29876b(uef uefVar) {
        q89 q89Var;
        sq8.m48649h(uefVar, "descriptor");
        zcj zcjVarM16936b = adj.m16936b(mo44939d(), uefVar);
        char c = zcjVarM16936b.begin;
        if (c != 0) {
            this.f41434a.m53027f(c);
            this.f41434a.mo30873b();
        }
        if (this.f41441h != null) {
            m44938J(uefVar);
            this.f41441h = null;
        }
        if (this.f41436c == zcjVarM16936b) {
            return this;
        }
        q89[] q89VarArr = this.f41437d;
        return (q89VarArr == null || (q89Var = q89VarArr[zcjVarM16936b.ordinal()]) == null) ? new q7g(this.f41434a, mo44939d(), zcjVarM16936b, this.f41437d) : q89Var;
    }

    @Override // p001o.m7, p001o.lo3
    /* renamed from: c */
    public void mo37560c(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        if (this.f41436c.end != 0) {
            this.f41434a.mo30877q();
            this.f41434a.mo30875d();
            this.f41434a.m53027f(this.f41436c.end);
        }
    }

    @Override // p001o.q89
    /* renamed from: d */
    public p79 mo44939d() {
        return this.f41435b;
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: g */
    public void mo29877g(double d) {
        if (this.f41440g) {
            mo29875F(String.valueOf(d));
        } else {
            this.f41434a.m53028g(d);
        }
        if (this.f41439f.m51124a()) {
            return;
        }
        if (!((Double.isInfinite(d) || Double.isNaN(d)) ? false : true)) {
            throw w89.m54054b(Double.valueOf(d), this.f41434a.f50571a.toString());
        }
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: h */
    public void mo29878h(byte b) {
        if (this.f41440g) {
            mo29875F(String.valueOf((int) b));
        } else {
            this.f41434a.mo25362e(b);
        }
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: m */
    public void mo29879m(uef uefVar, int i) {
        sq8.m48649h(uefVar, "enumDescriptor");
        mo29875F(uefVar.mo16763e(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // p001o.m7, p001o.h76
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo25649n(iff iffVar, Object obj) {
        sq8.m48649h(iffVar, "serializer");
        if (mo44939d().m43087d().m51138o()) {
            iffVar.serialize(this, obj);
            return;
        }
        boolean z = iffVar instanceof e9;
        boolean z2 = false;
        if (!z) {
            int i = vdd.C17551a.f50158a[mo44939d().m43087d().m51128e().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new szb();
                }
                bff kind = iffVar.getDescriptor().getKind();
                if (sq8.m48644c(kind, p9g.C16037a.f39681a) || sq8.m48644c(kind, p9g.C16040d.f39684a)) {
                }
            }
        } else if (mo44939d().m43087d().m51128e() != ea3.NONE) {
            z2 = true;
        }
        String strM52591c = z2 ? vdd.m52591c(iffVar.getDescriptor(), mo44939d()) : null;
        if (z) {
            e9 e9Var = (e9) iffVar;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + iffVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            iff iffVarM56097b = xdd.m56097b(e9Var, this, obj);
            if (strM52591c != null) {
                vdd.m52593e(iffVar, iffVarM56097b, strM52591c);
            }
            vdd.m52590b(iffVarM56097b.getDescriptor().getKind());
            sq8.m48647f(iffVarM56097b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            iffVar = iffVarM56097b;
        }
        if (strM52591c != null) {
            this.f41441h = strM52591c;
        }
        iffVar.serialize(this, obj);
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: q */
    public void mo29880q(long j) {
        if (this.f41440g) {
            mo29875F(String.valueOf(j));
        } else {
            this.f41434a.mo25364j(j);
        }
    }

    @Override // p001o.m7, p001o.lo3
    /* renamed from: r */
    public boolean mo37569r(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return this.f41439f.m51131h();
    }

    @Override // p001o.h76
    /* renamed from: s */
    public void mo25650s() {
        this.f41434a.m53030k("null");
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: t */
    public h76 mo25651t(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        if (r7g.m46312b(uefVar)) {
            vn3 eo3Var = this.f41434a;
            if (!(eo3Var instanceof eo3)) {
                eo3Var = new eo3(eo3Var.f50571a, this.f41440g);
            }
            return new q7g(eo3Var, mo44939d(), this.f41436c, (q89[]) null);
        }
        if (!r7g.m46311a(uefVar)) {
            return super.mo25651t(uefVar);
        }
        vn3 wn3Var = this.f41434a;
        if (!(wn3Var instanceof wn3)) {
            wn3Var = new wn3(wn3Var.f50571a, this.f41440g);
        }
        return new q7g(wn3Var, mo44939d(), this.f41436c, (q89[]) null);
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: u */
    public void mo29881u(short s) {
        if (this.f41440g) {
            mo29875F(String.valueOf((int) s));
        } else {
            this.f41434a.mo25365l(s);
        }
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: w */
    public void mo29882w(boolean z) {
        if (this.f41440g) {
            mo29875F(String.valueOf(z));
        } else {
            this.f41434a.m53031m(z);
        }
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: x */
    public void mo29883x(float f) {
        if (this.f41440g) {
            mo29875F(String.valueOf(f));
        } else {
            this.f41434a.m53029h(f);
        }
        if (this.f41439f.m51124a()) {
            return;
        }
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            throw w89.m54054b(Float.valueOf(f), this.f41434a.f50571a.toString());
        }
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: y */
    public void mo29884y(char c) {
        mo29875F(String.valueOf(c));
    }

    @Override // p001o.m7, p001o.lo3
    /* renamed from: z */
    public void mo37571z(uef uefVar, int i, iff iffVar, Object obj) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(iffVar, "serializer");
        if (obj != null || this.f41439f.m51132i()) {
            super.mo37571z(uefVar, i, iffVar, obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q7g(up8 up8Var, p79 p79Var, zcj zcjVar, q89[] q89VarArr) {
        this(io3.m32509a(up8Var, p79Var), p79Var, zcjVar, q89VarArr);
        sq8.m48649h(up8Var, "output");
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(zcjVar, "mode");
        sq8.m48649h(q89VarArr, "modeReuseCache");
    }
}
