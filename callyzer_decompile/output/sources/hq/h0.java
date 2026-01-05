package hq;

import androidx.compose.animation.AbstractC0236c;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.foundation.layout.FillElement;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import cv.C1516l;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import g2.k9;
import g2.p9;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.InterfaceC5262u;
import o1.h1;
import pg.f9;
import s2.AbstractC6740i;
import sq.C6905v;
import sq.b1;
import sq.g2;
import sq.p1;
import v3.C7636h;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import wr.C8146b;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f16199a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f16200b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f16201c;

    /* renamed from: d */
    public final /* synthetic */ boolean f16202d;

    /* renamed from: e */
    public final /* synthetic */ Object f16203e;

    /* renamed from: f */
    public final /* synthetic */ Object f16204f;

    /* renamed from: g */
    public final /* synthetic */ Object f16205g;

    /* renamed from: h */
    public final /* synthetic */ Object f16206h;

    public /* synthetic */ h0(C9008h c9008h, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3, w0 w0Var, boolean z6, boolean z10) {
        this.f16203e = c9008h;
        this.f16201c = interfaceC2139c;
        this.f16204f = interfaceC2139c2;
        this.f16205g = interfaceC2139c3;
        this.f16206h = w0Var;
        this.f16200b = z6;
        this.f16202d = z10;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strM11629c;
        switch (this.f16199a) {
            case 0:
                C9008h c9008h = (C9008h) this.f16203e;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f16204f;
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f16205g;
                w0 w0Var = (w0) this.f16206h;
                InterfaceC5262u Card = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card, "$this$Card");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f6 = 10;
                    C7876o c7876o = C7876o.f37669a;
                    AbstractC5244c.m10322f(c3966o, AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13));
                    boolean zM8614g = c3966o.m8614g(interfaceC2139c);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C1516l(1, interfaceC2139c);
                        c3966o.j0(objM8596M);
                    }
                    a0.m7260f(c9008h, this.f16201c, (InterfaceC2139c) objM8596M, interfaceC2139c2, c3966o, 0);
                    a0.m7262h(c9008h, w0Var, this.f16200b, this.f16202d, c3966o, 0);
                    if (c9008h.f43402h.size() > 5) {
                        c3966o.m8607Y(1728916985);
                        a0.m7272r(w0Var, c3966o, 0);
                    } else {
                        c3966o.m8607Y(1718278312);
                    }
                    c3966o.m8623p(false);
                    AbstractC5244c.m10322f(c3966o, AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f6, 7));
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                String str = (String) this.f16203e;
                Integer num = (Integer) this.f16204f;
                List list = (List) this.f16205g;
                List list2 = (List) this.f16206h;
                h1 it = (h1) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(it, "it");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C3966o) interfaceC3962k2).m8614g(it) ? 4 : 2;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    C7876o c7876o2 = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM655i = AbstractC0242a.m655i(AbstractC0236c.m632a(c7876o2), it);
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o2, 0);
                    int i10 = c3966o2.f20462P;
                    i1 i1VarM8620m = c3966o2.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM655i);
                    InterfaceC7639k.V0.getClass();
                    InterfaceC2137a interfaceC2137a = C7638j.f36921b;
                    c3966o2.c0();
                    if (c3966o2.f20461O) {
                        c3966o2.m8619l(interfaceC2137a);
                    } else {
                        c3966o2.m0();
                    }
                    C7636h c7636h = C7638j.f36925f;
                    C3953b.m8521x(c7636h, c5261tM10367a, c3966o2);
                    C7636h c7636h2 = C7638j.f36924e;
                    C3953b.m8521x(c7636h2, i1VarM8620m, c3966o2);
                    C7636h c7636h3 = C7638j.f36926g;
                    if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i10))) {
                        AbstractC1452a.m4577x(i10, c3966o2, i10, c7636h3);
                    }
                    C7636h c7636h4 = C7638j.f36923d;
                    C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o2);
                    if (this.f16200b) {
                        c3966o2.m8607Y(2127736163);
                        FillElement fillElement = AbstractC0245d.f1971c;
                        t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
                        int i11 = c3966o2.f20462P;
                        i1 i1VarM8620m2 = c3966o2.m8620m();
                        InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o2, fillElement);
                        c3966o2.c0();
                        if (c3966o2.f20461O) {
                            c3966o2.m8619l(interfaceC2137a);
                        } else {
                            c3966o2.m0();
                        }
                        C3953b.m8521x(c7636h, j0VarM10361d, c3966o2);
                        C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o2);
                        if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i11))) {
                            AbstractC1452a.m4577x(i11, c3966o2, i11, c7636h3);
                        }
                        C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o2);
                        k9.m6197b(C0243b.f1966a.mo662a(c7876o2, C7864c.f37646e), 0L, DefinitionKt.NO_Float_VALUE, 0L, 0, c3966o2, 0, 30);
                        c3966o2.m8623p(true);
                        c3966o2.m8623p(false);
                    } else {
                        c3966o2.m8607Y(2127978118);
                        String str2 = str == null ? "" : str;
                        InterfaceC2139c interfaceC2139c3 = this.f16201c;
                        boolean zM8614g2 = c3966o2.m8614g(interfaceC2139c3);
                        Object objM8596M2 = c3966o2.m8596M();
                        Object obj4 = C3961j.f20408a;
                        if (zM8614g2 || objM8596M2 == obj4) {
                            objM8596M2 = new p1(14, interfaceC2139c3);
                            c3966o2.j0(objM8596M2);
                        }
                        InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M2;
                        boolean zM8614g3 = c3966o2.m8614g(interfaceC2139c3);
                        Object objM8596M3 = c3966o2.m8596M();
                        if (zM8614g3 || objM8596M3 == obj4) {
                            objM8596M3 = new C8146b(6, interfaceC2139c3);
                            c3966o2.j0(objM8596M3);
                        }
                        InterfaceC2139c interfaceC2139c4 = (InterfaceC2139c) objM8596M3;
                        if (num == null) {
                            c3966o2.m8607Y(2128238858);
                            c3966o2.m8623p(false);
                            strM11629c = null;
                        } else {
                            c3966o2.m8607Y(761389527);
                            strM11629c = f9.m11629c(c3966o2, num.intValue());
                            c3966o2.m8623p(false);
                        }
                        b1.m13105i(str2, interfaceC2137a2, interfaceC2139c4, strM11629c, DefinitionKt.NO_Float_VALUE, false, AbstractC0242a.m656j(c7876o2, 8), c3966o2, 1572864, 48);
                        if (list.isEmpty()) {
                            c3966o2.m8607Y(2124438104);
                        } else {
                            c3966o2.m8607Y(2128379537);
                            boolean zM8614g4 = c3966o2.m8614g(interfaceC2139c3);
                            Object objM8596M4 = c3966o2.m8596M();
                            if (zM8614g4 || objM8596M4 == obj4) {
                                objM8596M4 = new C8146b(7, interfaceC2139c3);
                                c3966o2.j0(objM8596M4);
                            }
                            g2.m13172x(list, (InterfaceC2139c) objM8596M4, c3966o2, 0);
                        }
                        c3966o2.m8623p(false);
                        float f10 = 15;
                        p9.m6240d(AbstractC0242a.m657k(c7876o2, f10, 10), AbstractC7861e.m14841b(f10), null, null, null, AbstractC6740i.m12902d(-1550337324, new C6905v(list2, this.f16202d, interfaceC2139c3, str), c3966o2), c3966o2, 196614, 28);
                        c3966o2.m8623p(false);
                    }
                    c3966o2.m8623p(true);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ h0(boolean z6, String str, InterfaceC2139c interfaceC2139c, Integer num, List list, List list2, boolean z10) {
        this.f16200b = z6;
        this.f16203e = str;
        this.f16201c = interfaceC2139c;
        this.f16204f = num;
        this.f16205g = list;
        this.f16206h = list2;
        this.f16202d = z10;
    }
}
