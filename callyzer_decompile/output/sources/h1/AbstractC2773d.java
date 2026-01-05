package h1;

import aq.C0408k;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.r2;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import w2.C7864c;
import w2.InterfaceC7880s;
import ww.AbstractC8193c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.d */
/* loaded from: classes.dex */
public abstract class AbstractC2773d {

    /* renamed from: a */
    public static final C2781l f15375a = new C2781l(Float.POSITIVE_INFINITY);

    /* renamed from: b */
    public static final C2782m f15376b = new C2782m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c */
    public static final C2783n f15377c = new C2783n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d */
    public static final C2784o f15378d = new C2784o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e */
    public static final C2781l f15379e = new C2781l(Float.NEGATIVE_INFINITY);

    /* renamed from: f */
    public static final C2782m f15380f = new C2782m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g */
    public static final C2783n f15381g = new C2783n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h */
    public static final C2784o f15382h = new C2784o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: i */
    public static final float[] f15383i = new float[91];

    /* renamed from: a */
    public static C2772c m6778a(float f6) {
        return new C2772c(Float.valueOf(f6), y1.f15664a, Float.valueOf(0.01f), 8);
    }

    /* renamed from: b */
    public static C2780k m6779b(float f6, float f10, int i10) {
        if ((i10 & 2) != 0) {
            f10 = DefinitionKt.NO_Float_VALUE;
        }
        return new C2780k(y1.f15664a, Float.valueOf(f6), new C2781l(f10), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* renamed from: c */
    public static final Object m6780c(float f6, float f10, float f11, InterfaceC2779j interfaceC2779j, InterfaceC2141e interfaceC2141e, AbstractC8199i abstractC8199i) {
        x1 x1Var = y1.f15664a;
        Float f12 = new Float(f6);
        Float f13 = new Float(f10);
        C2781l c2781l = new C2781l(new Float(f11).floatValue());
        Object objM6781d = m6781d(new C2780k(x1Var, f12, c2781l, 56), new k1(interfaceC2779j, x1Var, f12, f13, c2781l), Long.MIN_VALUE, new d1(interfaceC2141e, 0), abstractC8199i);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        qw.a0 a0Var = qw.a0.f30746a;
        if (objM6781d != enumC7794a) {
            objM6781d = a0Var;
        }
        return objM6781d == enumC7794a ? objM6781d : a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6781d(h1.C2780k r23, h1.InterfaceC2775f r24, long r25, ex.InterfaceC2139c r27, ww.AbstractC8193c r28) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.AbstractC2773d.m6781d(h1.k, h1.f, long, ex.c, ww.c):java.lang.Object");
    }

    /* renamed from: e */
    public static /* synthetic */ Object m6782e(float f6, float f10, InterfaceC2779j interfaceC2779j, InterfaceC2141e interfaceC2141e, AbstractC8199i abstractC8199i, int i10) {
        if ((i10 & 8) != 0) {
            interfaceC2779j = m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7);
        }
        return m6780c(f6, f10, DefinitionKt.NO_Float_VALUE, interfaceC2779j, interfaceC2141e, abstractC8199i);
    }

    /* renamed from: f */
    public static final Object m6783f(C2780k c2780k, C2790u c2790u, boolean z6, InterfaceC2139c interfaceC2139c, AbstractC8193c abstractC8193c) {
        Object objM6781d = m6781d(c2780k, new C2789t(c2790u, c2780k.f15489a, c2780k.f15490b.getValue(), c2780k.f15491c), z6 ? c2780k.f15492d : Long.MIN_VALUE, interfaceC2139c, abstractC8193c);
        return objM6781d == EnumC7794a.COROUTINE_SUSPENDED ? objM6781d : qw.a0.f30746a;
    }

    /* renamed from: g */
    public static final e0 m6784g(g0 g0Var, float f6, d0 d0Var, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        return m6787j(g0Var, Float.valueOf(DefinitionKt.NO_Float_VALUE), Float.valueOf(f6), y1.f15664a, d0Var, (i11 & 8) != 0 ? "FloatAnimation" : "Rotation", interfaceC3962k, 33208 | ((i10 << 3) & 458752), 0);
    }

    /* renamed from: h */
    public static final Object m6785h(C2780k c2780k, Float f6, InterfaceC2779j interfaceC2779j, boolean z6, InterfaceC2139c interfaceC2139c, AbstractC8193c abstractC8193c) {
        Object objM6781d = m6781d(c2780k, new k1(interfaceC2779j, c2780k.f15489a, c2780k.f15490b.getValue(), f6, c2780k.f15491c), z6 ? c2780k.f15492d : Long.MIN_VALUE, interfaceC2139c, abstractC8193c);
        return objM6781d == EnumC7794a.COROUTINE_SUSPENDED ? objM6781d : qw.a0.f30746a;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m6786i(C2780k c2780k, Float f6, a1 a1Var, boolean z6, InterfaceC2139c interfaceC2139c, AbstractC8193c abstractC8193c, int i10) {
        if ((i10 & 2) != 0) {
            a1Var = m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7);
        }
        a1 a1Var2 = a1Var;
        if ((i10 & 8) != 0) {
            interfaceC2139c = i1.f15463b;
        }
        return m6785h(c2780k, f6, a1Var2, z6, interfaceC2139c, abstractC8193c);
    }

    /* renamed from: j */
    public static final e0 m6787j(g0 g0Var, Number number, Number number2, x1 x1Var, d0 d0Var, String str, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        g0 g0Var2;
        Number number3;
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        k2.s0 s0Var = C3961j.f20408a;
        if (objM8596M == s0Var) {
            g0Var2 = g0Var;
            e0 e0Var = new e0(g0Var2, number, number2, x1Var, d0Var);
            number3 = number2;
            c3966o.j0(e0Var);
            objM8596M = e0Var;
        } else {
            g0Var2 = g0Var;
            number3 = number2;
        }
        e0 e0Var2 = (e0) objM8596M;
        boolean z6 = (((57344 & i10) ^ 24576) > 16384 && c3966o.m8616i(d0Var)) || (i10 & 24576) == 16384;
        Object objM8596M2 = c3966o.m8596M();
        if (z6 || objM8596M2 == s0Var) {
            r2 r2Var = new r2(number, e0Var2, number3, d0Var, 3);
            c3966o.j0(r2Var);
            objM8596M2 = r2Var;
        }
        C3953b.m8505h((InterfaceC2137a) objM8596M2, c3966o);
        boolean zM8616i = c3966o.m8616i(g0Var2);
        Object objM8596M3 = c3966o.m8596M();
        if (zM8616i || objM8596M3 == s0Var) {
            objM8596M3 = new C0408k(19, g0Var2, e0Var2);
            c3966o.j0(objM8596M3);
        }
        C3953b.m8500c(e0Var2, (InterfaceC2139c) objM8596M3, c3966o);
        return e0Var2;
    }

    /* renamed from: k */
    public static final AbstractC2785p m6788k(AbstractC2785p abstractC2785p) {
        AbstractC2785p abstractC2785pMo6833c = abstractC2785p.mo6833c();
        int iMo6832b = abstractC2785pMo6833c.mo6832b();
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            abstractC2785pMo6833c.mo6835e(abstractC2785p.mo6831a(i10), i10);
        }
        return abstractC2785pMo6833c;
    }

    /* renamed from: l */
    public static C2780k m6789l(C2780k c2780k, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = ((Number) c2780k.f15490b.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f10 = ((C2781l) c2780k.f15491c).f15504a;
        }
        return new C2780k(c2780k.f15489a, Float.valueOf(f6), new C2781l(f10), c2780k.f15492d, c2780k.f15493e, c2780k.f15494f);
    }

    /* renamed from: m */
    public static final void m6790m(C2778i c2778i, long j6, float f6, InterfaceC2775f interfaceC2775f, C2780k c2780k, InterfaceC2139c interfaceC2139c) {
        long jMo6805c = f6 == DefinitionKt.NO_Float_VALUE ? interfaceC2775f.mo6805c() : (long) ((j6 - c2778i.f15455c) / f6);
        c2778i.f15459g = j6;
        c2778i.f15457e.setValue(interfaceC2775f.mo6809g(jMo6805c));
        c2778i.f15458f = interfaceC2775f.mo6807e(jMo6805c);
        if (interfaceC2775f.m6808f(jMo6805c)) {
            c2778i.f15460h = c2778i.f15459g;
            c2778i.f15461i.setValue(Boolean.FALSE);
        }
        m6796s(c2778i, c2780k);
        interfaceC2139c.invoke(c2778i);
    }

    /* renamed from: n */
    public static final float m6791n(InterfaceC7564h interfaceC7564h) {
        InterfaceC7880s interfaceC7880s = (InterfaceC7880s) interfaceC7564h.o0(C7864c.f37657r);
        float fMo2297J = interfaceC7880s != null ? interfaceC7880s.mo2297J() : 1.0f;
        if (fMo2297J >= DefinitionKt.NO_Float_VALUE) {
            return fMo2297J;
        }
        n0.m6840b("negative scale factor");
        return fMo2297J;
    }

    /* renamed from: o */
    public static d0 m6792o(InterfaceC2791v interfaceC2791v, o0 o0Var, int i10) {
        if ((i10 & 2) != 0) {
            o0Var = o0.Restart;
        }
        return new d0(interfaceC2791v, o0Var, 0);
    }

    /* renamed from: p */
    public static final g0 m6793p(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        if (objM8596M == C3961j.f20408a) {
            objM8596M = new g0();
            c3966o.j0(objM8596M);
        }
        g0 g0Var = (g0) objM8596M;
        g0Var.m6811a(c3966o, 0);
        return g0Var;
    }

    /* renamed from: q */
    public static a1 m6794q(float f6, float f10, Object obj, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new a1(f6, f10, obj);
    }

    /* renamed from: r */
    public static w1 m6795r(int i10, int i11, InterfaceC2792w interfaceC2792w, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC2792w = AbstractC2793x.f15639a;
        }
        return new w1(i10, i11, interfaceC2792w);
    }

    /* renamed from: s */
    public static final void m6796s(C2778i c2778i, C2780k c2780k) {
        c2780k.f15490b.setValue(c2778i.f15457e.getValue());
        AbstractC2785p abstractC2785p = c2780k.f15491c;
        AbstractC2785p abstractC2785p2 = c2778i.f15458f;
        int iMo6832b = abstractC2785p.mo6832b();
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            abstractC2785p.mo6835e(abstractC2785p2.mo6831a(i10), i10);
        }
        c2780k.f15493e = c2778i.f15460h;
        c2780k.f15492d = c2778i.f15459g;
        c2780k.f15494f = ((Boolean) c2778i.f15461i.getValue()).booleanValue();
    }
}
