package tp;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import ex.InterfaceC2143g;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.l1;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import mm.AbstractC4801l;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.m1;
import o1.n1;
import og.pe;
import og.r0;
import p1.AbstractC5788a;
import pg.b9;
import pg.i0;
import qp.C6272i;
import qw.a0;
import r4.C6456k;
import sq.b1;
import v3.C7636h;
import v3.C7638j;
import v3.InterfaceC7639k;
import vp.AbstractC7728a;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;
import zp.C9014n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tp.e */
/* loaded from: classes3.dex */
public final class C7184e extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f34467a;

    /* renamed from: b */
    public final /* synthetic */ List f34468b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2141e f34469c;

    /* renamed from: d */
    public final /* synthetic */ C6272i f34470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7184e(List list, InterfaceC2141e interfaceC2141e, C6272i c6272i, int i10) {
        super(4);
        this.f34467a = i10;
        this.f34468b = list;
        this.f34469c = interfaceC2141e;
        this.f34470d = c6272i;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f34467a) {
            case 0:
                InterfaceC0246a interfaceC0246a = (InterfaceC0246a) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i10 = (((C3966o) interfaceC3962k).m8614g(interfaceC0246a) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= ((C3966o) interfaceC3962k).m8612e(iIntValue) ? 32 : 16;
                }
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(i10 & 1, (i10 & 147) != 146)) {
                    C9014n c9014n = (C9014n) this.f34468b.get(iIntValue);
                    c3966o.m8607Y(290874890);
                    AbstractC7185f.m13443b(c9014n, this.f34469c, c3966o, 0);
                    if (iIntValue < pe.m10832g(this.f34470d.f30434a)) {
                        c3966o.m8607Y(290999819);
                        p9.m6245i(AbstractC0242a.m658l(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 10, DefinitionKt.NO_Float_VALUE, 2), 1, ((v1) c3966o.m8618k(y1.f13286a)).f12928A, c3966o, 54, 0);
                    } else {
                        c3966o.m8607Y(288843118);
                    }
                    c3966o.m8623p(false);
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                InterfaceC0246a interfaceC0246a2 = (InterfaceC0246a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i11 = (((C3966o) interfaceC3962k2).m8614g(interfaceC0246a2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i11 |= ((C3966o) interfaceC3962k2).m8612e(iIntValue3) ? 32 : 16;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(i11 & 1, (i11 & 147) != 146)) {
                    C9014n c9014n2 = (C9014n) this.f34468b.get(iIntValue3);
                    c3966o2.m8607Y(-1081246993);
                    C7870i c7870i = C7864c.f37652l;
                    C7876o c7876o = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
                    InterfaceC2141e interfaceC2141e = this.f34469c;
                    boolean zM8614g = c3966o2.m8614g(interfaceC2141e) | c3966o2.m8616i(c9014n2);
                    Object objM8596M = c3966o2.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C7186g(interfaceC2141e, c9014n2, 0);
                        c3966o2.j0(objM8596M);
                    }
                    float f6 = 10;
                    InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(AbstractC0237a.m637e(interfaceC7879rM668e, false, null, null, (InterfaceC2137a) objM8596M, 7), f6, 15);
                    n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o2, 48);
                    int i16 = c3966o2.f20462P;
                    i1 i1VarM8620m = c3966o2.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM657k);
                    InterfaceC7639k.V0.getClass();
                    InterfaceC2137a interfaceC2137a = C7638j.f36921b;
                    c3966o2.c0();
                    if (c3966o2.f20461O) {
                        c3966o2.m8619l(interfaceC2137a);
                    } else {
                        c3966o2.m0();
                    }
                    C7636h c7636h = C7638j.f36925f;
                    C3953b.m8521x(c7636h, n1VarM10357a, c3966o2);
                    C7636h c7636h2 = C7638j.f36924e;
                    C3953b.m8521x(c7636h2, i1VarM8620m, c3966o2);
                    C7636h c7636h3 = C7638j.f36926g;
                    if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i16))) {
                        AbstractC1452a.m4577x(i16, c3966o2, i16, c7636h3);
                    }
                    C7636h c7636h4 = C7638j.f36923d;
                    C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o2);
                    i0.m11693a(b9.m11551a(c9014n2.f43426h, 0, c3966o2), "", AbstractC0245d.m678o(c7876o, 30), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o2, 432, 120);
                    InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(c7876o, f6, DefinitionKt.NO_Float_VALUE, 2);
                    if (1.0f <= 0.0d) {
                        AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                    }
                    InterfaceC7879r interfaceC7879rM9747u = AbstractC4801l.m9747u(1.0f, interfaceC7879rM658l, true);
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o2, 0);
                    int i17 = c3966o2.f20462P;
                    i1 i1VarM8620m2 = c3966o2.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM9747u);
                    c3966o2.c0();
                    if (c3966o2.f20461O) {
                        c3966o2.m8619l(interfaceC2137a);
                    } else {
                        c3966o2.m0();
                    }
                    C3953b.m8521x(c7636h, c5261tM10367a, c3966o2);
                    C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o2);
                    if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i17))) {
                        AbstractC1452a.m4577x(i17, c3966o2, i17, c7636h3);
                    }
                    C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o2);
                    String str = c9014n2.f43420b;
                    l1 l1Var = xd.f13268a;
                    b1.m13113q(str, null, 0L, null, null, 0, 0, 0L, null, ((vd) c3966o2.m8618k(l1Var)).f13050f, c3966o2, 0, 510);
                    b1.m13113q(c9014n2.f43421c, null, 0L, null, new C6456k(5), 0, 0, 0L, null, ((vd) c3966o2.m8618k(l1Var)).f13056l, c3966o2, 0, 494);
                    c3966o2.m8623p(true);
                    b1.m13115s(r0.m10866b(R.drawable.ic_call, 0, c3966o2), c9014n2.f43425g, null, DefinitionKt.NO_Float_VALUE, 12, null, DefinitionKt.NO_Float_VALUE, 0, null, c3966o2, 1572864, 1980);
                    c3966o2.m8623p(true);
                    if (iIntValue3 < pe.m10832g(this.f34470d.f30435b)) {
                        c3966o2.m8607Y(-1079960215);
                        p9.m6245i(AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o, 1.0f), f6, DefinitionKt.NO_Float_VALUE, 2), 1, ((v1) c3966o2.m8618k(y1.f13286a)).f12928A, c3966o2, 54, 0);
                    } else {
                        c3966o2.m8607Y(-1083017652);
                    }
                    c3966o2.m8623p(false);
                    c3966o2.m8623p(false);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                InterfaceC0246a interfaceC0246a3 = (InterfaceC0246a) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i12 = (((C3966o) interfaceC3962k3).m8614g(interfaceC0246a3) ? 4 : 2) | iIntValue6;
                } else {
                    i12 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i12 |= ((C3966o) interfaceC3962k3).m8612e(iIntValue5) ? 32 : 16;
                }
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(i12 & 1, (i12 & 147) != 146)) {
                    C9014n c9014n3 = (C9014n) this.f34468b.get(iIntValue5);
                    c3966o3.m8607Y(-1644666320);
                    C7870i c7870i2 = C7864c.f37652l;
                    C7876o c7876o2 = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM668e2 = AbstractC0245d.m668e(c7876o2, 1.0f);
                    InterfaceC2141e interfaceC2141e2 = this.f34469c;
                    boolean zM8614g2 = c3966o3.m8614g(interfaceC2141e2) | c3966o3.m8616i(c9014n3);
                    Object objM8596M2 = c3966o3.m8596M();
                    if (zM8614g2 || objM8596M2 == C3961j.f20408a) {
                        objM8596M2 = new C7186g(interfaceC2141e2, c9014n3, 1);
                        c3966o3.j0(objM8596M2);
                    }
                    float f10 = 10;
                    InterfaceC7879r interfaceC7879rM657k2 = AbstractC0242a.m657k(AbstractC0237a.m637e(interfaceC7879rM668e2, false, null, null, (InterfaceC2137a) objM8596M2, 7), f10, 15);
                    n1 n1VarM10357a2 = m1.m10357a(AbstractC5251j.f25757a, c7870i2, c3966o3, 48);
                    int i18 = c3966o3.f20462P;
                    i1 i1VarM8620m3 = c3966o3.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM657k2);
                    InterfaceC7639k.V0.getClass();
                    InterfaceC2137a interfaceC2137a2 = C7638j.f36921b;
                    c3966o3.c0();
                    if (c3966o3.f20461O) {
                        c3966o3.m8619l(interfaceC2137a2);
                    } else {
                        c3966o3.m0();
                    }
                    C7636h c7636h5 = C7638j.f36925f;
                    C3953b.m8521x(c7636h5, n1VarM10357a2, c3966o3);
                    C7636h c7636h6 = C7638j.f36924e;
                    C3953b.m8521x(c7636h6, i1VarM8620m3, c3966o3);
                    C7636h c7636h7 = C7638j.f36926g;
                    if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i18))) {
                        AbstractC1452a.m4577x(i18, c3966o3, i18, c7636h7);
                    }
                    C7636h c7636h8 = C7638j.f36923d;
                    C3953b.m8521x(c7636h8, interfaceC7879rM14845c3, c3966o3);
                    i0.m11693a(b9.m11551a(c9014n3.f43426h, 0, c3966o3), "", AbstractC0245d.m678o(c7876o2, 30), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o3, 432, 120);
                    InterfaceC7879r interfaceC7879rM658l2 = AbstractC0242a.m658l(c7876o2, f10, DefinitionKt.NO_Float_VALUE, 2);
                    if (1.0f <= 0.0d) {
                        AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                    }
                    InterfaceC7879r interfaceC7879rM9747u2 = AbstractC4801l.m9747u(1.0f, interfaceC7879rM658l2, true);
                    C5261t c5261tM10367a2 = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o3, 0);
                    int i19 = c3966o3.f20462P;
                    i1 i1VarM8620m4 = c3966o3.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c4 = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM9747u2);
                    c3966o3.c0();
                    if (c3966o3.f20461O) {
                        c3966o3.m8619l(interfaceC2137a2);
                    } else {
                        c3966o3.m0();
                    }
                    C3953b.m8521x(c7636h5, c5261tM10367a2, c3966o3);
                    C3953b.m8521x(c7636h6, i1VarM8620m4, c3966o3);
                    if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i19))) {
                        AbstractC1452a.m4577x(i19, c3966o3, i19, c7636h7);
                    }
                    C3953b.m8521x(c7636h8, interfaceC7879rM14845c4, c3966o3);
                    String str2 = c9014n3.f43420b;
                    l1 l1Var2 = xd.f13268a;
                    b1.m13113q(str2, null, 0L, null, null, 0, 0, 0L, null, ((vd) c3966o3.m8618k(l1Var2)).f13050f, c3966o3, 0, 510);
                    b1.m13113q(c9014n3.f43421c, null, 0L, null, new C6456k(5), 0, 0, 0L, null, ((vd) c3966o3.m8618k(l1Var2)).f13056l, c3966o3, 0, 494);
                    c3966o3.m8623p(true);
                    b1.m13115s(r0.m10866b(R.drawable.ic_call, 0, c3966o3), c9014n3.f43425g, null, DefinitionKt.NO_Float_VALUE, 12, null, DefinitionKt.NO_Float_VALUE, 0, null, c3966o3, 1572864, 1980);
                    c3966o3.m8623p(true);
                    if (iIntValue5 < pe.m10832g(this.f34470d.f30436c)) {
                        c3966o3.m8607Y(-1643399723);
                        p9.m6245i(AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o2, 1.0f), f10, DefinitionKt.NO_Float_VALUE, 2), 1, ((v1) c3966o3.m8618k(y1.f13286a)).f12928A, c3966o3, 54, 0);
                    } else {
                        c3966o3.m8607Y(-1646436328);
                    }
                    c3966o3.m8623p(false);
                    c3966o3.m8623p(false);
                } else {
                    c3966o3.m8601S();
                }
                break;
            case 3:
                InterfaceC0246a interfaceC0246a4 = (InterfaceC0246a) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i13 = (((C3966o) interfaceC3962k4).m8614g(interfaceC0246a4) ? 4 : 2) | iIntValue8;
                } else {
                    i13 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i13 |= ((C3966o) interfaceC3962k4).m8612e(iIntValue7) ? 32 : 16;
                }
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(i13 & 1, (i13 & 147) != 146)) {
                    C9014n c9014n4 = (C9014n) this.f34468b.get(iIntValue7);
                    c3966o4.m8607Y(1568810825);
                    AbstractC7728a.m14716b(c9014n4, this.f34469c, c3966o4, 0);
                    if (iIntValue7 < pe.m10832g(this.f34470d.f30434a)) {
                        c3966o4.m8607Y(1568932871);
                        p9.m6245i(AbstractC0242a.m658l(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 10, DefinitionKt.NO_Float_VALUE, 2), 1, ((v1) c3966o4.m8618k(y1.f13286a)).f12928A, c3966o4, 54, 0);
                    } else {
                        c3966o4.m8607Y(1566684906);
                    }
                    c3966o4.m8623p(false);
                    c3966o4.m8623p(false);
                } else {
                    c3966o4.m8601S();
                }
                break;
            case 4:
                InterfaceC0246a interfaceC0246a5 = (InterfaceC0246a) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i14 = (((C3966o) interfaceC3962k5).m8614g(interfaceC0246a5) ? 4 : 2) | iIntValue10;
                } else {
                    i14 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i14 |= ((C3966o) interfaceC3962k5).m8612e(iIntValue9) ? 32 : 16;
                }
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (c3966o5.m8598P(i14 & 1, (i14 & 147) != 146)) {
                    C9014n c9014n5 = (C9014n) this.f34468b.get(iIntValue9);
                    c3966o5.m8607Y(1076508848);
                    AbstractC7728a.m14717c(c9014n5, this.f34469c, c3966o5, 0);
                    if (iIntValue9 < pe.m10832g(this.f34470d.f30435b)) {
                        c3966o5.m8607Y(1076643387);
                        p9.m6245i(AbstractC0242a.m658l(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 10, DefinitionKt.NO_Float_VALUE, 2), 1, ((v1) c3966o5.m8618k(y1.f13286a)).f12928A, c3966o5, 54, 0);
                    } else {
                        c3966o5.m8607Y(1074600766);
                    }
                    c3966o5.m8623p(false);
                    c3966o5.m8623p(false);
                } else {
                    c3966o5.m8601S();
                }
                break;
            default:
                InterfaceC0246a interfaceC0246a6 = (InterfaceC0246a) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i15 = (((C3966o) interfaceC3962k6).m8614g(interfaceC0246a6) ? 4 : 2) | iIntValue12;
                } else {
                    i15 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i15 |= ((C3966o) interfaceC3962k6).m8612e(iIntValue11) ? 32 : 16;
                }
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (c3966o6.m8598P(i15 & 1, (i15 & 147) != 146)) {
                    C9014n c9014n6 = (C9014n) this.f34468b.get(iIntValue11);
                    c3966o6.m8607Y(513089955);
                    AbstractC7728a.m14718d(c9014n6, this.f34469c, c3966o6, 0);
                    if (iIntValue11 < pe.m10832g(this.f34470d.f30436c)) {
                        c3966o6.m8607Y(513217767);
                        p9.m6245i(AbstractC0242a.m658l(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 10, DefinitionKt.NO_Float_VALUE, 2), 1, ((v1) c3966o6.m8618k(y1.f13286a)).f12928A, c3966o6, 54, 0);
                    } else {
                        c3966o6.m8607Y(511182090);
                    }
                    c3966o6.m8623p(false);
                    c3966o6.m8623p(false);
                } else {
                    c3966o6.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
