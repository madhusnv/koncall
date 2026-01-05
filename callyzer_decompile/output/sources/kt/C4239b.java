package kt;

import al.C0174b;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d3.h0;
import dp.C1736c;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import g2.g6;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.C2489e;
import g4.C2492h;
import g4.o0;
import hq.c0;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.l1;
import k2.w0;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import kr.C4190e;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5245d;
import o1.C5261t;
import o1.InterfaceC5262u;
import o1.m1;
import o1.n1;
import og.af;
import p020v.a1;
import p1.AbstractC5788a;
import pg.f9;
import qw.a0;
import s2.AbstractC6740i;
import sq.b1;
import sq.g2;
import v3.C7636h;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kt.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4239b implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f21549a;

    /* renamed from: b */
    public final /* synthetic */ w0 f21550b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f21551c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f21552d;

    public /* synthetic */ C4239b(w0 w0Var, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, int i10) {
        this.f21549a = i10;
        this.f21550b = w0Var;
        this.f21551c = interfaceC2139c;
        this.f21552d = interfaceC2139c2;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f21549a) {
            case 0:
                InterfaceC5262u BottomSheet = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(BottomSheet, "$this$BottomSheet");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p9.m6240d(AbstractC0245d.m668e(AbstractC0237a.m633a(C7876o.f37669a, ((v1) c3966o.m8618k(y1.f13286a)).f12969p, h0.f7748a), 1.0f), AbstractC7861e.m14841b(2), null, null, null, AbstractC6740i.m12902d(-1986127081, new C4239b(this.f21550b, this.f21551c, this.f21552d, 1), c3966o), c3966o, 196608, 28);
                } else {
                    c3966o.m8601S();
                }
                return a0.f30746a;
            default:
                InterfaceC5262u Card = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card, "$this$Card");
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c3966o2.m8607Y(-1702643716);
                    C2489e c2489e = new C2489e();
                    c3966o2.m8607Y(-1702642805);
                    l1 l1Var = xd.f13268a;
                    int iM6427g = c2489e.m6427g(o0.m6461a(((vd) c3966o2.m8618k(l1Var)).f13052h, 0L, af.m10534c(17), C3998s.f20698h, null, null, 0L, 0L, null, 16777209).f13688a);
                    try {
                        c2489e.m6423c(f9.m11629c(c3966o2, R.string.note_m));
                        c2489e.m6425e(iM6427g);
                        c3966o2.m8623p(false);
                        c3966o2.m8607Y(-1702632446);
                        iM6427g = c2489e.m6427g(o0.m6461a(((vd) c3966o2.m8618k(l1Var)).f13055k, 0L, af.m10534c(16), null, null, null, 0L, 0L, null, 16777213).f13688a);
                        try {
                            c2489e.m6423c(" " + f9.m11629c(c3966o2, R.string.note_message));
                            c2489e.m6425e(iM6427g);
                            c3966o2.m8623p(false);
                            C2492h c2492hM6428h = c2489e.m6428h();
                            c3966o2.m8623p(false);
                            l1 l1Var2 = y1.f13286a;
                            long j6 = ((v1) c3966o2.m8618k(l1Var2)).f12969p;
                            C7876o c7876o = C7876o.f37669a;
                            C0174b c0174b = h0.f7748a;
                            InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(c7876o, j6, c0174b);
                            C5245d c5245d = AbstractC5251j.f25759c;
                            C7869h c7869h = C7864c.f37654n;
                            C5261t c5261tM10367a = AbstractC5260s.m10367a(c5245d, c7869h, c3966o2, 0);
                            int i10 = c3966o2.f20462P;
                            i1 i1VarM8620m = c3966o2.m8620m();
                            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM633a);
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
                            float f6 = 23;
                            float f10 = 15;
                            InterfaceC7879r interfaceC7879rM633a2 = AbstractC0237a.m633a(AbstractC0242a.m659m(c7876o, f6, f10, f6, 8), ((v1) c3966o2.m8618k(l1Var2)).f12969p, c0174b);
                            C5261t c5261tM10367a2 = AbstractC5260s.m10367a(c5245d, c7869h, c3966o2, 0);
                            int i11 = c3966o2.f20462P;
                            i1 i1VarM8620m2 = c3966o2.m8620m();
                            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM633a2);
                            c3966o2.c0();
                            if (c3966o2.f20461O) {
                                c3966o2.m8619l(interfaceC2137a);
                            } else {
                                c3966o2.m0();
                            }
                            C3953b.m8521x(c7636h, c5261tM10367a2, c3966o2);
                            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o2);
                            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i11))) {
                                AbstractC1452a.m4577x(i11, c3966o2, i11, c7636h3);
                            }
                            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o2);
                            C2489e c2489e2 = new C2489e();
                            c2489e2.m6422b(c2492hM6428h);
                            b1.m13114r(c2489e2.m6428h(), AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, 5, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13), 0L, null, 0, 0, null, null, c3966o2, 48, 508);
                            InterfaceC7879r interfaceC7879rM633a3 = AbstractC0237a.m633a(AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, f10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13), ((v1) c3966o2.m8618k(l1Var2)).f12969p, c0174b);
                            C7870i c7870i = C7864c.f37652l;
                            n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25761e, c7870i, c3966o2, 54);
                            int i12 = c3966o2.f20462P;
                            i1 i1VarM8620m3 = c3966o2.m8620m();
                            InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM633a3);
                            c3966o2.c0();
                            if (c3966o2.f20461O) {
                                c3966o2.m8619l(interfaceC2137a);
                            } else {
                                c3966o2.m0();
                            }
                            C3953b.m8521x(c7636h, n1VarM10357a, c3966o2);
                            C3953b.m8521x(c7636h2, i1VarM8620m3, c3966o2);
                            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i12))) {
                                AbstractC1452a.m4577x(i12, c3966o2, i12, c7636h3);
                            }
                            C3953b.m8521x(c7636h4, interfaceC7879rM14845c3, c3966o2);
                            k2.m1 m1VarMo8541a = g6.f11636a.mo8541a(Boolean.FALSE);
                            w0 w0Var = this.f21550b;
                            C3953b.m8498a(m1VarMo8541a, AbstractC6740i.m12902d(137562119, new c0(w0Var, 2), c3966o2), c3966o2, 56);
                            float f11 = 10;
                            b1.m13113q(f9.m11629c(c3966o2, R.string.dont_ask_again), AbstractC0242a.m660n(c7876o, f11, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), 0L, null, null, 0, 0, 0L, null, new o0(0L, af.m10534c(16), null, null, null, 0L, 0, 0L, 16777213), c3966o2, 805306416, 508);
                            c3966o2.m8623p(true);
                            InterfaceC7879r interfaceC7879rM633a4 = AbstractC0237a.m633a(AbstractC0245d.m668e(AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, f11, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13), 1.0f), ((v1) c3966o2.m8618k(l1Var2)).f12969p, c0174b);
                            n1 n1VarM10357a2 = m1.m10357a(AbstractC5251j.f25762f, c7870i, c3966o2, 54);
                            int i13 = c3966o2.f20462P;
                            i1 i1VarM8620m4 = c3966o2.m8620m();
                            InterfaceC7879r interfaceC7879rM14845c4 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM633a4);
                            c3966o2.c0();
                            if (c3966o2.f20461O) {
                                c3966o2.m8619l(interfaceC2137a);
                            } else {
                                c3966o2.m0();
                            }
                            C3953b.m8521x(c7636h, n1VarM10357a2, c3966o2);
                            C3953b.m8521x(c7636h2, i1VarM8620m4, c3966o2);
                            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i13))) {
                                AbstractC1452a.m4577x(i13, c3966o2, i13, c7636h3);
                            }
                            C3953b.m8521x(c7636h4, interfaceC7879rM14845c4, c3966o2);
                            String strM11629c = f9.m11629c(c3966o2, R.string.cancel);
                            if (1.0f <= 0.0d) {
                                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            InterfaceC2139c interfaceC2139c = this.f21551c;
                            boolean zM8614g = c3966o2.m8614g(interfaceC2139c);
                            Object objM8596M = c3966o2.m8596M();
                            Object obj4 = C3961j.f20408a;
                            if (zM8614g || objM8596M == obj4) {
                                objM8596M = new C1736c(13, interfaceC2139c);
                                c3966o2.j0(objM8596M);
                            }
                            g2.m13134L(strM11629c, layoutWeightElement, null, 0, null, null, 0L, (InterfaceC2137a) objM8596M, c3966o2, 0, 124);
                            AbstractC5244c.m10322f(c3966o2, AbstractC0245d.m682s(c7876o, 30));
                            String strM11629c2 = f9.m11629c(c3966o2, R.string.okay);
                            if (1.0f <= 0.0d) {
                                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            InterfaceC2139c interfaceC2139c2 = this.f21552d;
                            boolean zM8614g2 = c3966o2.m8614g(interfaceC2139c2);
                            Object objM8596M2 = c3966o2.m8596M();
                            if (zM8614g2 || objM8596M2 == obj4) {
                                objM8596M2 = new C4190e(1, interfaceC2139c2, w0Var);
                                c3966o2.j0(objM8596M2);
                            }
                            g2.m13168t(strM11629c2, layoutWeightElement2, null, 0, null, 0L, (InterfaceC2137a) objM8596M2, c3966o2, 0, 60);
                            a1.m14320C(c3966o2, true, true, true);
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    c3966o2.m8601S();
                }
                return a0.f30746a;
        }
    }
}
