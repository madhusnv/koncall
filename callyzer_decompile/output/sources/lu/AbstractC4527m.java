package lu;

import android.app.Activity;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import aw.C0465e;
import bt.C0767l;
import bt.f0;
import bt.l0;
import com.amplifyframework.storage.s3.C1230b;
import com.google.android.gms.internal.measurement.b4;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import cv.C1513i;
import cv.C1514j;
import d3.C1565s;
import d7.EnumC1645q;
import d7.InterfaceC1637j;
import d7.InterfaceC1649u;
import d7.c1;
import e7.AbstractC1967c;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.k9;
import g2.p9;
import g2.t6;
import g2.u0;
import g2.u9;
import g2.v0;
import g7.C2536a;
import gm.C2643l;
import gm.C2645n;
import h1.AbstractC2773d;
import h1.AbstractC2793x;
import h1.C2772c;
import h1.e0;
import h1.o0;
import h7.AbstractC2868a;
import hq.C3009n;
import hr.C3022a;
import im.EnumC3321w;
import java.util.List;
import jn.InterfaceC3804c;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;
import k2.i1;
import k2.n1;
import k2.s0;
import k2.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import lp.C4504f;
import mq.C4835c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.m1;
import og.lb;
import og.nc;
import og.pe;
import og.qd;
import p1.AbstractC5788a;
import pg.AbstractC5928i;
import pg.c0;
import pg.f9;
import pg.i0;
import pu.C6040h;
import pu.EnumC6039g;
import qu.C6324e;
import qw.C6367q;
import qw.a0;
import s2.AbstractC6740i;
import sq.b1;
import t3.j0;
import uv.AbstractC7554g;
import uv.C7555h;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w1.C7860d;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lu.m */
/* loaded from: classes3.dex */
public abstract class AbstractC4527m {

    /* renamed from: a */
    public static final float f22496a = 2;

    /* renamed from: b */
    public static final float f22497b = 55;

    /* renamed from: c */
    public static final float f22498c = 15;

    /* renamed from: a */
    public static final void m9370a(InterfaceC7879r interfaceC7879r, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1069557899);
        if (c3966o.m8598P(i10 & 1, (i10 & 3) != 2)) {
            long j6 = C1565s.f7816i;
            C1565s c1565s = new C1565s(j6);
            C1565s c1565s2 = new C1565s(j6);
            long j10 = C1565s.f7811d;
            List listM10834i = pe.m10834i(c1565s, c1565s2, new C1565s(C1565s.m5186b(0.1f, 14, j10)), new C1565s(C1565s.m5186b(0.9f, 14, C1565s.f7812e)), new C1565s(C1565s.m5186b(0.1f, 14, j10)), new C1565s(j6), new C1565s(j6));
            e0 e0VarM6784g = AbstractC2773d.m6784g(AbstractC2773d.m6793p(c3966o, 0), 360.0f, AbstractC2773d.m6792o(AbstractC2773d.m6795r(1500, 0, AbstractC2793x.f15642d, 2), o0.Restart, 4), c3966o, 29112, 0);
            boolean zM8614g = c3966o.m8614g(e0VarM6784g);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                objM8596M = new C3009n(9, e0VarM6784g, listM10834i);
                c3966o.j0(objM8596M);
            }
            pg.e0.m11594a(6, (InterfaceC2139c) objM8596M, c3966o, interfaceC7879r);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1230b(interfaceC7879r, i10, 16);
        }
    }

    /* renamed from: b */
    public static final void m9371b(int i10, EnumC6039g enumC6039g, InterfaceC3962k interfaceC3962k, int i11) {
        C6367q c6367q;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1302156634);
        int i12 = (c3966o.m8612e(i10) ? 4 : 2) | i11 | (c3966o.m8612e(enumC6039g.ordinal()) ? 32 : 16);
        if (c3966o.m8598P(i12 & 1, (i12 & 19) != 18)) {
            int i13 = AbstractC4526l.f22495a[enumC6039g.ordinal()];
            InterfaceC7559c interfaceC7559c = null;
            if (i13 == 1 || i13 == 2) {
                c3966o.m8607Y(1537050060);
                c6367q = new C6367q(AbstractC7554g.m14301b(c3966o).f36385M, new C1565s(C1565s.f7816i), null);
                c3966o.m8623p(false);
            } else if (i13 == 3) {
                c3966o.m8607Y(1537055179);
                c6367q = new C6367q(AbstractC7554g.m14301b(c3966o).f36386N, new C1565s(t6.m6310a(c3966o).f12967n), Integer.valueOf(R.drawable.ic_ts_success));
                c3966o.m8623p(false);
            } else {
                if (i13 != 4) {
                    c3966o.m8607Y(1537047216);
                    c3966o.m8623p(false);
                    throw new NoWhenBranchMatchedException();
                }
                c3966o.m8607Y(1537062183);
                c6367q = new C6367q(AbstractC7554g.m14301b(c3966o).f36387O, new C1565s(t6.m6310a(c3966o).f12967n), Integer.valueOf(R.drawable.ic_ts_error));
                c3966o.m8623p(false);
            }
            C7555h c7555h = (C7555h) c6367q.f30765a;
            long j6 = ((C1565s) c6367q.f30766b).f7819a;
            Integer num = (Integer) c6367q.f30767c;
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = AbstractC2773d.m6778a(0.1f);
                c3966o.j0(objM8596M);
            }
            C2772c c2772c = (C2772c) objM8596M;
            boolean zM8616i = ((i12 & 112) == 32) | c3966o.m8616i(c2772c);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i || objM8596M2 == s0Var) {
                objM8596M2 = new C4504f(enumC6039g, c2772c, interfaceC7559c, 3);
                c3966o.j0(objM8596M2);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M2, enumC6039g, c3966o);
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == s0Var) {
                objM8596M3 = C3953b.m8512o(new C0465e(22, c2772c));
                c3966o.j0(objM8596M3);
            }
            h2 h2Var = (h2) objM8596M3;
            float f6 = f22497b;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o, f6);
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i14 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM678o);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o, i14, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            float fFloatValue = ((Number) h2Var.getValue()).floatValue();
            long j10 = c7555h.f36426b;
            boolean z6 = ((Number) h2Var.getValue()).floatValue() >= 1.0f && enumC6039g == EnumC6039g.WORKING;
            FillElement fillElement = AbstractC0245d.f1971c;
            m9372c(fFloatValue, j10, z6, b4.m3152b(fillElement, 90.0f), c3966o, 3072);
            C7860d c7860d = AbstractC7861e.f37635a;
            u0 u0VarM6253q = p9.m6253q(c7555h.f36425a, c3966o, 0);
            v0 v0VarM6254r = p9.m6254r(0, 62);
            float f10 = f22496a;
            p9.m6240d(c0.m11560a(AbstractC0242a.m656j(fillElement, f10 - ((float) 0.2d)), f10, j6, c7860d), c7860d, u0VarM6253q, v0VarM6254r, null, AbstractC6740i.m12902d(-771629214, new C1514j(i10, c7555h), c3966o), c3966o, 196608, 16);
            c3966o = c3966o;
            if (num != null) {
                c3966o.m8607Y(1251196516);
                i0.m11694b(og.u0.m10941c(num.intValue(), 6, c3966o), "", C0243b.f1966a.mo662a(AbstractC0245d.m678o(c7876o, 17), C7864c.f37644c), null, c3966o, 48, 120);
            } else {
                c3966o.m8607Y(1241104590);
            }
            c3966o.m8623p(false);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(i10, enumC6039g, i11);
        }
    }

    /* renamed from: c */
    public static final void m9372c(final float f6, final long j6, final boolean z6, final InterfaceC7879r interfaceC7879r, InterfaceC3962k interfaceC3962k, final int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1192118196);
        int i11 = i10 | (c3966o.m8611d(f6) ? 4 : 2) | (c3966o.m8613f(j6) ? 32 : 16) | (c3966o.m8615h(z6) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 1171) != 1170)) {
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            FillElement fillElement = AbstractC0245d.f1971c;
            long j10 = C1565s.f7816i;
            boolean z10 = (i11 & 14) == 4;
            Object objM8596M = c3966o.m8596M();
            if (z10 || objM8596M == C3961j.f20408a) {
                objM8596M = new C4519e(f6);
                c3966o.j0(objM8596M);
            }
            k9.m6196a((InterfaceC2137a) objM8596M, fillElement, j6, f22496a, j10, 0, DefinitionKt.NO_Float_VALUE, c3966o, ((i11 << 3) & 896) | 27696, 96);
            if (z6) {
                c3966o.m8607Y(958566191);
                m9370a(b4.m3152b(fillElement, 90.0f), c3966o, 6);
            } else {
                c3966o.m8607Y(946478888);
            }
            c3966o.m8623p(false);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e(f6, j6, z6, interfaceC7879r, i10) { // from class: lu.f

                /* renamed from: a */
                public final /* synthetic */ float f22480a;

                /* renamed from: b */
                public final /* synthetic */ long f22481b;

                /* renamed from: c */
                public final /* synthetic */ boolean f22482c;

                /* renamed from: d */
                public final /* synthetic */ InterfaceC7879r f22483d;

                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM8496A = C3953b.m8496A(3073);
                    AbstractC4527m.m9372c(this.f22480a, this.f22481b, this.f22482c, this.f22483d, (InterfaceC3962k) obj, iM8496A);
                    return a0.f30746a;
                }
            };
        }
    }

    /* renamed from: d */
    public static final void m9373d(InterfaceC7879r interfaceC7879r, C6040h c6040h, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        String str;
        long j6;
        boolean z6;
        boolean z10;
        C6040h troubleshootStepUiModel = c6040h;
        AbstractC4154l.m8923f(troubleshootStepUiModel, "troubleshootStepUiModel");
        EnumC6039g enumC6039g = troubleshootStepUiModel.f29492e;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-619546121);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c3966o.m8614g(interfaceC7879r) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(troubleshootStepUiModel) ? 32 : 16;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            int i12 = AbstractC4526l.f22495a[enumC6039g.ordinal()];
            if (i12 == 1 || i12 == 2) {
                str = troubleshootStepUiModel.f29489b;
            } else {
                str = troubleshootStepUiModel.f29493f;
                if (str == null) {
                    str = "";
                }
            }
            String str2 = str;
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.m10351g(5), C7864c.f37654n, c3966o, 6);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, c5261tM10367a, c3966o);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            b1.m13113q(troubleshootStepUiModel.f29488a, null, 0L, null, null, 0, 0, 0L, null, t6.m6311b(c3966o).f13052h, c3966o, 0, 510);
            g4.o0 o0Var = t6.m6311b(c3966o).f13055k;
            EnumC6039g enumC6039g2 = EnumC6039g.ERROR;
            if (enumC6039g == enumC6039g2) {
                c3966o.m8607Y(-898228570);
                j6 = AbstractC7554g.m14301b(c3966o).f36388P;
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-898226103);
                j6 = AbstractC7554g.m14301b(c3966o).f36384L;
                c3966o.m8623p(false);
            }
            b1.m13113q(str2, null, j6, null, null, 0, 0, 0L, null, o0Var, c3966o, 0, 506);
            c3966o = c3966o;
            if (enumC6039g == enumC6039g2) {
                c3966o.m8607Y(-2075068798);
                InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(C7876o.f37669a, 1.0f);
                j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
                int i14 = c3966o.f20462P;
                i1 i1VarM8620m2 = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM668e);
                c3966o.c0();
                if (c3966o.f20461O) {
                    c3966o.m8619l(c7637i);
                } else {
                    c3966o.m0();
                }
                C3953b.m8521x(c7636h, j0VarM10361d, c3966o);
                C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                    AbstractC1452a.m4577x(i14, c3966o, i14, c7636h3);
                }
                C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
                c3966o.m8607Y(-1975853597);
                troubleshootStepUiModel = c6040h;
                z10 = false;
                troubleshootStepUiModel.f29495h.invoke(troubleshootStepUiModel, c3966o, 0);
                c3966o.m8623p(false);
                z6 = true;
                c3966o.m8623p(true);
            } else {
                troubleshootStepUiModel = c6040h;
                z6 = true;
                z10 = false;
                c3966o.m8607Y(-2086512107);
            }
            c3966o.m8623p(z10);
            c3966o.m8623p(z6);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1513i(interfaceC7879r, troubleshootStepUiModel, i10, 4);
        }
    }

    /* renamed from: e */
    public static final void m9374e(InterfaceC7879r interfaceC7879r, List troubleshootStepList, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(troubleshootStepList, "troubleshootStepList");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(2023715856);
        int i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10 | (c3966o.m8616i(troubleshootStepList) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            boolean zM8616i = c3966o.m8616i(troubleshootStepList);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C3022a(troubleshootStepList, 1);
                c3966o.j0(objM8596M);
            }
            nc.m10775b(interfaceC7879r, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, i11 & 14, 510);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C4521g(i10, 0, troubleshootStepList, interfaceC7879r);
        }
    }

    /* renamed from: f */
    public static final void m9375f(C6040h c6040h, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1486680794);
        int i11 = (c3966o.m8614g(c6040h) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
            float f6 = f22498c;
            InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(interfaceC7879rM668e, f6);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM656j);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, c5261tM10367a, c3966o);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            InterfaceC7879r interfaceC7879rM668e2 = AbstractC0245d.m668e(c7876o, 1.0f);
            o1.n1 n1VarM10357a = m1.m10357a(AbstractC5251j.m10351g(f6), C7864c.f37651k, c3966o, 54);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM668e2);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, n1VarM10357a, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            m9371b(c6040h.f29490c, c6040h.f29492e, c3966o, 0);
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            m9373d(AbstractC0242a.m658l(new LayoutWeightElement(1.0f, true), DefinitionKt.NO_Float_VALUE, 3, 1), c6040h, c3966o, (i11 << 3) & 112);
            c3966o.m8623p(true);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1230b(c6040h, i10, 17);
        }
    }

    /* renamed from: g */
    public static final void m9376g(String str, InterfaceC2139c navigateToRoute, InterfaceC2137a onBackClick, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        AbstractC4154l.m8923f(navigateToRoute, "navigateToRoute");
        AbstractC4154l.m8923f(onBackClick, "onBackClick");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-903792776);
        int i11 = i10 | (c3966o2.m8614g(str) ? 4 : 2) | (c3966o2.m8616i(navigateToRoute) ? 32 : 16) | (c3966o2.m8616i(onBackClick) ? 256 : 128);
        if (c3966o2.m8598P(i11 & 1, (i11 & 147) != 146)) {
            C2643l viewModelAssistedFactory = (C2643l) ((C2645n) ((InterfaceC3804c) lb.m10745a((Activity) c3966o2.m8618k(C8791f.f42458b)))).f14268k.get();
            c3966o2.m8607Y(-961446343);
            EnumC3321w troubleshootFeature = (!str.equals(f9.m11629c(c3966o2, R.string.call_sync)) && str.equals(f9.m11629c(c3966o2, R.string.note_popup))) ? EnumC3321w.NOTE_POPUP : EnumC3321w.CALL_SYNC;
            c3966o2.m8623p(false);
            AbstractC4154l.m8923f(viewModelAssistedFactory, "viewModelAssistedFactory");
            AbstractC4154l.m8923f(troubleshootFeature, "troubleshootFeature");
            C4835c c4835c = new C4835c(viewModelAssistedFactory, troubleshootFeature, 1);
            c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o2);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            InterfaceC7559c interfaceC7559c = null;
            C6324e c6324e = (C6324e) AbstractC5928i.m11691b(c1VarM6992a, kotlin.jvm.internal.a0.m8901a(C6324e.class), null, c4835c, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b);
            w0 w0VarM10853a = qd.m10853a(c6324e.f30670j, c3966o2);
            w0 w0VarM8509l = C3953b.m8509l(((InterfaceC1649u) c3966o2.m8618k(AbstractC1967c.f9212a)).getLifecycle().mo5345c(), c3966o2);
            EnumC1645q enumC1645q = (EnumC1645q) w0VarM8509l.getValue();
            boolean zM8614g = c3966o2.m8614g(w0VarM8509l) | c3966o2.m8616i(c6324e);
            Object objM8596M = c3966o2.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (zM8614g || objM8596M == s0Var) {
                objM8596M = new C4525k(c6324e, w0VarM8509l, null, 0);
                c3966o2.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, enumC1645q, c3966o2);
            Boolean bool = Boolean.TRUE;
            boolean zM8616i = c3966o2.m8616i(c6324e) | ((i11 & 112) == 32);
            Object objM8596M2 = c3966o2.m8596M();
            if (zM8616i || objM8596M2 == s0Var) {
                objM8596M2 = new C4504f(c6324e, navigateToRoute, interfaceC7559c, 4);
                c3966o2.j0(objM8596M2);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M2, bool, c3966o2);
            c3966o = c3966o2;
            u9.m6323a(AbstractC0245d.f1971c, AbstractC6740i.m12902d(1537825596, new C0767l(str, onBackClick, c6324e), c3966o2), null, null, null, 0, 0L, 0L, null, AbstractC6740i.m12902d(1104987975, new l0(11, w0VarM10853a), c3966o2), c3966o, 805306422, 508);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0767l(str, (Object) navigateToRoute, (Object) onBackClick, i10, 16);
        }
    }
}
