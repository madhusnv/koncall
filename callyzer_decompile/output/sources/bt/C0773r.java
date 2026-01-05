package bt;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import au.C0440d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import g2.e6;
import g2.k9;
import g2.n9;
import g2.sc;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import j$.time.LocalDateTime;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import kr.C4207v;
import mm.C4791b;
import mm.C4792c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5245d;
import o1.C5261t;
import o1.InterfaceC5262u;
import o1.m1;
import o1.n1;
import o1.o1;
import og.nc;
import p1.AbstractC5788a;
import r4.C6456k;
import sq.b1;
import sq.g2;
import u2.C7320q;
import uv.AbstractC7548a;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7876o;
import w2.InterfaceC7879r;
import wr.AbstractC8154j;
import ys.AbstractC8768a;
import yv.C8789d;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.r */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0773r implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f4906a;

    /* renamed from: b */
    public final /* synthetic */ boolean f4907b;

    /* renamed from: c */
    public final /* synthetic */ Object f4908c;

    /* renamed from: d */
    public final /* synthetic */ Object f4909d;

    public /* synthetic */ C0773r(int i10, Object obj, Object obj2, boolean z6) {
        this.f4906a = i10;
        this.f4907b = z6;
        this.f4908c = obj;
        this.f4909d = obj2;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z6;
        int i10 = this.f4906a;
        C7876o c7876o = C7876o.f37669a;
        k2.s0 s0Var = C3961j.f20408a;
        boolean z10 = this.f4907b;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj4 = this.f4909d;
        Object obj5 = this.f4908c;
        switch (i10) {
            case 0:
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) obj5;
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) obj4;
                InterfaceC5262u BottomSheet = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(BottomSheet, "$this$BottomSheet");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c3966o.m8601S();
                    break;
                } else {
                    if (z10) {
                        c3966o.m8607Y(-1030844706);
                        boolean zM8614g = c3966o.m8614g(interfaceC2137a);
                        Object objM8596M = c3966o.m8596M();
                        if (zM8614g || objM8596M == s0Var) {
                            objM8596M = new C0440d(2, interfaceC2137a);
                            c3966o.j0(objM8596M);
                        }
                        InterfaceC2137a interfaceC2137a3 = (InterfaceC2137a) objM8596M;
                        boolean zM8614g2 = c3966o.m8614g(interfaceC2137a2);
                        Object objM8596M2 = c3966o.m8596M();
                        if (zM8614g2 || objM8596M2 == s0Var) {
                            objM8596M2 = new C0440d(3, interfaceC2137a2);
                            c3966o.j0(objM8596M2);
                        }
                        z6 = false;
                        AbstractC8768a.m16122a(interfaceC2137a3, (InterfaceC2137a) objM8596M2, c3966o, 0);
                    } else {
                        z6 = false;
                        c3966o.m8607Y(-1055039741);
                    }
                    c3966o.m8623p(z6);
                    break;
                }
            case 1:
                C7320q c7320q = (C7320q) obj5;
                k2.w0 w0Var = (k2.w0) obj4;
                InterfaceC5262u Card = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card, "$this$Card");
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (!c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c3966o2.m8601S();
                    break;
                } else {
                    InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(c7876o, 20, 10);
                    boolean zM8615h = c3966o2.m8615h(z10);
                    Object objM8596M3 = c3966o2.m8596M();
                    if (zM8615h || objM8596M3 == s0Var) {
                        objM8596M3 = new C4207v(0, c7320q, w0Var, z10);
                        c3966o2.j0(objM8596M3);
                    }
                    nc.m10775b(interfaceC7879rM657k, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M3, c3966o2, 6, 510);
                    break;
                }
            case 2:
                InterfaceC2137a interfaceC2137a4 = (InterfaceC2137a) obj5;
                C4791b c4791b = (C4791b) obj4;
                InterfaceC5262u Card2 = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card2, "$this$Card");
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (!c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c3966o3.m8601S();
                    break;
                } else {
                    C7876o c7876o2 = C7876o.f37669a;
                    float f6 = 8;
                    InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(AbstractC0245d.m668e(c7876o2, 1.0f), f6);
                    n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, C7864c.f37652l, c3966o3, 48);
                    int i11 = c3966o3.f20462P;
                    i1 i1VarM8620m = c3966o3.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM656j);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o3.c0();
                    if (c3966o3.f20461O) {
                        c3966o3.m8619l(c7637i);
                    } else {
                        c3966o3.m0();
                    }
                    C7636h c7636h = C7638j.f36925f;
                    C3953b.m8521x(c7636h, n1VarM10357a, c3966o3);
                    C7636h c7636h2 = C7638j.f36924e;
                    C3953b.m8521x(c7636h2, i1VarM8620m, c3966o3);
                    C7636h c7636h3 = C7638j.f36926g;
                    if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i11))) {
                        AbstractC1452a.m4577x(i11, c3966o3, i11, c7636h3);
                    }
                    C7636h c7636h4 = C7638j.f36923d;
                    C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o3);
                    n9.m6221a(this.f4907b, interfaceC2137a4, null, false, null, c3966o3, 0);
                    if (1.0f <= 0.0d) {
                        AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                    C5245d c5245d = AbstractC5251j.f25759c;
                    C7869h c7869h = C7864c.f37654n;
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(c5245d, c7869h, c3966o3, 0);
                    int i12 = c3966o3.f20462P;
                    i1 i1VarM8620m2 = c3966o3.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o3, layoutWeightElement);
                    c3966o3.c0();
                    if (c3966o3.f20461O) {
                        c3966o3.m8619l(c7637i);
                    } else {
                        c3966o3.m0();
                    }
                    C3953b.m8521x(c7636h, c5261tM10367a, c3966o3);
                    C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o3);
                    if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i12))) {
                        AbstractC1452a.m4577x(i12, c3966o3, i12, c7636h3);
                    }
                    C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o3);
                    C4792c c4792c = c4791b.f23833b;
                    sc.m6307b(c4792c.f23844a, null, 0L, 0L, C3998s.f20700k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c3966o3, 196608, 0, 131038);
                    String str = c4792c.f23846c;
                    EnumC8994d enumC8994d = c4792c.f23848e;
                    LocalDateTime localDateTime = c4792c.f23849f;
                    b1.m13113q(str, null, 0L, null, null, 0, 0, 0L, null, null, c3966o3, 0, 1022);
                    c3966o3.m8623p(true);
                    if (1.0f <= 0.0d) {
                        AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C5261t c5261tM10367a2 = AbstractC5260s.m10367a(AbstractC5251j.f25761e, c7869h, c3966o3, 54);
                    int i13 = c3966o3.f20462P;
                    i1 i1VarM8620m3 = c3966o3.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o3, layoutWeightElement2);
                    c3966o3.c0();
                    if (c3966o3.f20461O) {
                        c3966o3.m8619l(c7637i);
                    } else {
                        c3966o3.m0();
                    }
                    C3953b.m8521x(c7636h, c5261tM10367a2, c3966o3);
                    C3953b.m8521x(c7636h2, i1VarM8620m3, c3966o3);
                    if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i13))) {
                        AbstractC1452a.m4577x(i13, c3966o3, i13, c7636h3);
                    }
                    C3953b.m8521x(c7636h4, interfaceC7879rM14845c3, c3966o3);
                    C8800o c8800o = C8800o.f42459a;
                    b1.m13113q(C8800o.m16216y(localDateTime), null, 0L, null, null, 0, 0, 0L, null, null, c3966o3, 0, 1022);
                    b1.m13113q(C8800o.m16186J(localDateTime), null, 0L, null, null, 0, 0, 0L, null, null, c3966o3, 0, 1022);
                    c3966o3.m8623p(true);
                    InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(c7876o2, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, 11);
                    C5261t c5261tM10367a3 = AbstractC5260s.m10367a(c5245d, C7864c.f37656q, c3966o3, 48);
                    int i14 = c3966o3.f20462P;
                    i1 i1VarM8620m4 = c3966o3.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c4 = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM660n);
                    c3966o3.c0();
                    if (c3966o3.f20461O) {
                        c3966o3.m8619l(c7637i);
                    } else {
                        c3966o3.m0();
                    }
                    C3953b.m8521x(c7636h, c5261tM10367a3, c3966o3);
                    C3953b.m8521x(c7636h2, i1VarM8620m4, c3966o3);
                    if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i14))) {
                        AbstractC1452a.m4577x(i14, c3966o3, i14, c7636h3);
                    }
                    C3953b.m8521x(c7636h4, interfaceC7879rM14845c4, c3966o3);
                    e6.m6132a(og.r0.m10866b(C8789d.m16158e(enumC8994d == null ? EnumC8994d.MISSED : enumC8994d), 0, c3966o3), null, null, C8789d.m16157d(enumC8994d), c3966o3, 48, 4);
                    Long l9 = c4792c.f23851h;
                    b1.m13113q(C8789d.m16160g(false, l9 != null ? l9.longValue() : 0L), null, 0L, null, null, 0, 0, 0L, null, null, c3966o3, 0, 1022);
                    c3966o3.m8623p(true);
                    c3966o3.m8623p(true);
                    break;
                }
                break;
            case 3:
                String str2 = (String) obj5;
                g4.o0 o0Var = (g4.o0) obj4;
                InterfaceC5262u Card3 = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card3, "$this$Card");
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (!c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c3966o4.m8601S();
                    break;
                } else {
                    C7876o c7876o3 = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM666c = AbstractC0245d.m666c(AbstractC0245d.m668e(c7876o3, 1.0f), 1.0f);
                    t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37646e, false);
                    int i15 = c3966o4.f20462P;
                    i1 i1VarM8620m5 = c3966o4.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c5 = AbstractC7862a.m14845c(c3966o4, interfaceC7879rM666c);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i2 = C7638j.f36921b;
                    c3966o4.c0();
                    if (c3966o4.f20461O) {
                        c3966o4.m8619l(c7637i2);
                    } else {
                        c3966o4.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o4);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m5, c3966o4);
                    C7636h c7636h5 = C7638j.f36926g;
                    if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i15))) {
                        AbstractC1452a.m4577x(i15, c3966o4, i15, c7636h5);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c5, c3966o4);
                    if (z10) {
                        c3966o4.m8607Y(1292947563);
                        k9.m6197b(null, ((v1) c3966o4.m8618k(y1.f13286a)).f12955b, DefinitionKt.NO_Float_VALUE, 0L, 0, c3966o4, 0, 29);
                        c3966o4.m8623p(false);
                    } else {
                        c3966o4.m8607Y(1293113289);
                        sc.m6307b(str2, c7876o3, AbstractC7548a.f36357k, 0L, null, null, 0L, null, new C6456k(3), 0L, 0, false, 0, 0, null, o0Var, c3966o4, 432, 0, 65016);
                        c3966o4.m8623p(false);
                    }
                    c3966o4.m8623p(true);
                    break;
                }
                break;
            case 4:
                InterfaceC2137a interfaceC2137a5 = (InterfaceC2137a) obj5;
                String str3 = (String) obj4;
                o1 DialogWithPositiveAndNegativeButtons = (o1) obj;
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(DialogWithPositiveAndNegativeButtons, "$this$DialogWithPositiveAndNegativeButtons");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((C3966o) interfaceC3962k5).m8614g(DialogWithPositiveAndNegativeButtons) ? 4 : 2;
                }
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (!c3966o5.m8598P(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    c3966o5.m8601S();
                    break;
                } else {
                    g2.m13145W(AbstractC0245d.m666c(DialogWithPositiveAndNegativeButtons.mo10364b(1.0f, c7876o, true), 1.0f), interfaceC2137a5, 0L, DefinitionKt.NO_Float_VALUE, 0, null, str3, 0L, ((vd) c3966o5.m8618k(xd.f13268a)).f13054j, this.f4907b, null, c3966o5, 0, 0, 1212);
                    break;
                }
            default:
                String str4 = (String) obj5;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) obj4;
                InterfaceC0246a item = (InterfaceC0246a) obj;
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(item, "$this$item");
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (!c3966o6.m8598P(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    c3966o6.m8601S();
                    break;
                } else {
                    if (!z10 || str4 == null || str4.length() == 0) {
                        c3966o6.m8607Y(649405767);
                    } else {
                        c3966o6.m8607Y(654543366);
                        boolean zM8614g3 = c3966o6.m8614g(interfaceC2139c) | c3966o6.m8614g(str4);
                        Object objM8596M4 = c3966o6.m8596M();
                        if (zM8614g3 || objM8596M4 == s0Var) {
                            objM8596M4 = new ps.h0(interfaceC2139c, str4, 2);
                            c3966o6.j0(objM8596M4);
                        }
                        AbstractC8154j.m15323b(str4, (InterfaceC2137a) objM8596M4, c3966o6, 0);
                    }
                    c3966o6.m8623p(false);
                    break;
                }
        }
        return a0Var;
    }

    public /* synthetic */ C0773r(InterfaceC2137a interfaceC2137a, String str, boolean z6) {
        this.f4906a = 4;
        this.f4908c = interfaceC2137a;
        this.f4909d = str;
        this.f4907b = z6;
    }
}
