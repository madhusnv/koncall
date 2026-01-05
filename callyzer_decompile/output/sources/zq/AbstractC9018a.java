package zq;

import al.C0174b;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.d1;
import ar.C0419i;
import br.C0739b;
import br.C0740c;
import br.C0741d;
import bt.C0762g;
import bt.d0;
import c0.AbstractC0810c;
import com.amplifyframework.auth.cognito.C1139f;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import cr.C1479a;
import cr.C1480b;
import cr.C1481c;
import cv.C1515k;
import d3.h0;
import dr.C1752b;
import dr.C1775y;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import fk.C2310p;
import g2.k9;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import hq.C3004i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import k2.s0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kr.AbstractC4189d;
import l7.a0;
import lx.InterfaceC4566e;
import nx.C5186x;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5243b;
import o1.C5246e;
import o1.C5261t;
import o1.m1;
import o1.n1;
import o1.o1;
import o1.p1;
import o1.w1;
import og.hg;
import og.je;
import og.nc;
import og.t0;
import op.C5435d;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p005f.C2162k;
import p020v.a1;
import pg.b9;
import pg.f9;
import pg.i0;
import pg.v8;
import pg.x8;
import q1.C6097y;
import q1.b0;
import qr.g0;
import qv.C6334i;
import qw.C6361k;
import r4.C6456k;
import rr.C6609i;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.C6885b;
import sq.b1;
import sq.d3;
import sq.g2;
import sq.g3;
import sq.k3;
import sq.n2;
import sq.y0;
import t1.C6979d;
import t3.j0;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import uv.AbstractC7554g;
import uv.AbstractC7556i;
import uw.C7565i;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import vr.C7734b;
import vs.C7759a;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;
import wr.C8147c;
import xp.C8423d;
import xp.C8426g;
import xt.C8453d;
import xt.C8457h;
import xt.C8459j;
import xu.C8470i;
import yu.C8784j;
import yv.C8789d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zq.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9018a {

    /* renamed from: a */
    public static final C6734c f43435a = new C6734c(new C7759a(15), false, -1170035864);

    /* renamed from: b */
    public static final C6734c f43436b = new C6734c(new C7759a(16), false, -1420085958);

    /* renamed from: c */
    public static final C6734c f43437c = new C6734c(new C7759a(17), false, -1792467151);

    /* renamed from: d */
    public static final C6734c f43438d = new C6734c(new C7759a(18), false, -1785208622);

    /* renamed from: e */
    public static final C6734c f43439e = new C6734c(new C7734b(26), false, -447678449);

    /* renamed from: f */
    public static final C6734c f43440f = new C6734c(new C7734b(27), false, -485113036);

    /* renamed from: a */
    public static final void m16481a(String str, String str2, String str3, String str4, InterfaceC3962k interfaceC3962k, int i10) {
        C7637i c7637i;
        C7636h c7636h;
        C7637i c7637i2;
        C7636h c7636h2;
        C7637i c7637i3;
        C7636h c7636h3;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-579595649);
        int i11 = i10 | (c3966o.m8614g(str) ? 4 : 2) | (c3966o.m8614g(str2) ? 32 : 16) | (c3966o.m8614g(str3) ? 256 : 128) | (c3966o.m8614g(str4) ? NewHope.SENDB_BYTES : 1024);
        if (c3966o.m8598P(i11 & 1, (i11 & 1171) != 1170)) {
            C7876o c7876o = C7876o.f37669a;
            float f6 = 20;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), f6, f6, f6, DefinitionKt.NO_Float_VALUE, 8);
            C5243b c5243b = AbstractC5251j.f25757a;
            C7870i c7870i = C7864c.f37651k;
            n1 n1VarM10357a = m1.m10357a(c5243b, c7870i, c3966o, 0);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i4 = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i4);
            } else {
                c3966o.m0();
            }
            C7636h c7636h4 = C7638j.f36925f;
            C3953b.m8521x(c7636h4, n1VarM10357a, c3966o);
            C7636h c7636h5 = C7638j.f36924e;
            C3953b.m8521x(c7636h5, i1VarM8620m, c3966o);
            C7636h c7636h6 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h6);
            }
            C7636h c7636h7 = C7638j.f36923d;
            C3953b.m8521x(c7636h7, interfaceC7879rM14845c, c3966o);
            String strM11629c = f9.m11629c(c3966o, R.string.average_call_duration);
            p1 p1Var = p1.f25811a;
            b1.m13113q(strM11629c, AbstractC0242a.m660n(p1Var.mo10364b(1.0f, c7876o, true), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 2, 7), 0L, null, null, 0, 0, 0L, null, ((vd) c3966o.m8618k(xd.f13268a)).f13050f, c3966o, 0, 508);
            AbstractC4189d.m8940h(t0.m10920c(c3966o, R.string.analysis_average_duration_info), 0L, null, c3966o, 0, 6);
            c3966o.m8623p(true);
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o, 1.0f), f6, DefinitionKt.NO_Float_VALUE, 2);
            n1 n1VarM10357a2 = m1.m10357a(c5243b, c7870i, c3966o, 0);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM658l);
            c3966o.c0();
            if (c3966o.f20461O) {
                c7637i = c7637i4;
                c3966o.m8619l(c7637i);
            } else {
                c7637i = c7637i4;
                c3966o.m0();
            }
            C3953b.m8521x(c7636h4, n1VarM10357a2, c3966o);
            C3953b.m8521x(c7636h5, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                c7636h = c7636h6;
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            } else {
                c7636h = c7636h6;
            }
            C3953b.m8521x(c7636h7, interfaceC7879rM14845c2, c3966o);
            C7636h c7636h8 = c7636h;
            C7637i c7637i5 = c7637i;
            b1.m13113q(t0.m10920c(c3966o, R.string.per_day), p1Var.mo10364b(1.0f, c7876o, true), 0L, null, null, 0, 0, 0L, null, null, c3966o, 0, 1020);
            b1.m13113q(str, null, 0L, null, null, 0, 0, 0L, null, null, c3966o, i11 & 14, 1022);
            c3966o.m8623p(true);
            InterfaceC7879r interfaceC7879rM658l2 = AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o, 1.0f), f6, DefinitionKt.NO_Float_VALUE, 2);
            n1 n1VarM10357a3 = m1.m10357a(c5243b, c7870i, c3966o, 0);
            int i14 = c3966o.f20462P;
            i1 i1VarM8620m3 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM658l2);
            c3966o.c0();
            if (c3966o.f20461O) {
                c7637i2 = c7637i5;
                c3966o.m8619l(c7637i2);
            } else {
                c7637i2 = c7637i5;
                c3966o.m0();
            }
            C3953b.m8521x(c7636h4, n1VarM10357a3, c3966o);
            C3953b.m8521x(c7636h5, i1VarM8620m3, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                c7636h2 = c7636h8;
                AbstractC1452a.m4577x(i14, c3966o, i14, c7636h2);
            } else {
                c7636h2 = c7636h8;
            }
            C3953b.m8521x(c7636h7, interfaceC7879rM14845c3, c3966o);
            C7636h c7636h9 = c7636h2;
            C7637i c7637i6 = c7637i2;
            b1.m13113q(t0.m10920c(c3966o, R.string.per_call), p1Var.mo10364b(1.0f, c7876o, true), 0L, null, null, 0, 0, 0L, null, null, c3966o, 0, 1020);
            b1.m13113q(str2, null, 0L, null, null, 0, 0, 0L, null, null, c3966o, (i11 >> 3) & 14, 1022);
            c3966o.m8623p(true);
            InterfaceC7879r interfaceC7879rM658l3 = AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o, 1.0f), f6, DefinitionKt.NO_Float_VALUE, 2);
            n1 n1VarM10357a4 = m1.m10357a(c5243b, c7870i, c3966o, 0);
            int i15 = c3966o.f20462P;
            i1 i1VarM8620m4 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c4 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM658l3);
            c3966o.c0();
            if (c3966o.f20461O) {
                c7637i3 = c7637i6;
                c3966o.m8619l(c7637i3);
            } else {
                c7637i3 = c7637i6;
                c3966o.m0();
            }
            C3953b.m8521x(c7636h4, n1VarM10357a4, c3966o);
            C3953b.m8521x(c7636h5, i1VarM8620m4, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                c7636h3 = c7636h9;
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h3);
            } else {
                c7636h3 = c7636h9;
            }
            C3953b.m8521x(c7636h7, interfaceC7879rM14845c4, c3966o);
            C7636h c7636h10 = c7636h3;
            C7637i c7637i7 = c7637i3;
            b1.m13113q(t0.m10920c(c3966o, R.string.per_incoming_call), p1Var.mo10364b(1.0f, c7876o, true), 0L, null, null, 0, 0, 0L, null, null, c3966o, 0, 1020);
            b1.m13113q(str3, null, 0L, null, null, 0, 0, 0L, null, null, c3966o, (i11 >> 6) & 14, 1022);
            c3966o.m8623p(true);
            InterfaceC7879r interfaceC7879rM658l4 = AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o, 1.0f), f6, DefinitionKt.NO_Float_VALUE, 2);
            n1 n1VarM10357a5 = m1.m10357a(c5243b, c7870i, c3966o, 0);
            int i16 = c3966o.f20462P;
            i1 i1VarM8620m5 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c5 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM658l4);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i7);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h4, n1VarM10357a5, c3966o);
            C3953b.m8521x(c7636h5, i1VarM8620m5, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i16))) {
                AbstractC1452a.m4577x(i16, c3966o, i16, c7636h10);
            }
            C3953b.m8521x(c7636h7, interfaceC7879rM14845c5, c3966o);
            b1.m13113q(t0.m10920c(c3966o, R.string.per_outgoing_call), p1Var.mo10364b(1.0f, c7876o, true), 0L, null, null, 0, 0, 0L, null, null, c3966o, 0, 1020);
            b1.m13113q(str4, null, 0L, null, null, 0, 0, 0L, null, null, c3966o, (i11 >> 9) & 14, 1022);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C9019b(str, str2, str3, str4, i10, 0);
        }
    }

    /* renamed from: b */
    public static final void m16482b(int i10, int i11, int i12, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1294700891);
        int i13 = (c3966o.m8612e(i10) ? 4 : 2) | i12 | (c3966o.m8612e(i11) ? 32 : 16) | (c3966o.m8616i(interfaceC2137a) ? 256 : 128);
        if (c3966o.m8598P(i13 & 1, (i13 & 147) != 146)) {
            C7870i c7870i = C7864c.f37652l;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
            boolean z6 = (i13 & 896) == 256;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new C8147c(21, interfaceC2137a);
                c3966o.j0(objM8596M);
            }
            float f6 = 10;
            InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(AbstractC0237a.m637e(interfaceC7879rM668e, false, null, null, (InterfaceC2137a) objM8596M, 7), 15, f6);
            n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o, 48);
            int i14 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM657k);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o, i14, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            i0.m11693a(b9.m11551a(i10, i13 & 14, c3966o), "", AbstractC0245d.m678o(c7876o, 25), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o, 432, 120);
            b1.m13113q(f9.m11629c(c3966o, i11), AbstractC0242a.m660n(c7876o, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), 0L, null, null, 0, 0, 0L, null, o0.m6461a(((vd) c3966o.m8618k(xd.f13268a)).f13054j, 0L, 0L, null, null, v8.m11898a(x8.m11932a(R.font.montserrat_regular)), 0L, 0L, null, 16777183), c3966o, 48, 508);
            c3966o = c3966o;
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1515k(i10, i11, i12, interfaceC2137a);
        }
    }

    /* renamed from: c */
    public static final void m16483c(C1480b c1480b, EnumC7204p enumC7204p, List list, InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1662123837);
        int i11 = (c3966o.m8616i(c1480b) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8612e(enumC7204p.ordinal()) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(list) ? 256 : 128;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e) ? 1048576 : 524288;
        }
        if (c3966o.m8598P(i11 & 1, (599187 & i11) != 599186)) {
            p9.m6240d(AbstractC0245d.m668e(AbstractC0242a.m656j(C7876o.f37669a, 10), 1.0f), AbstractC7861e.m14841b(15), p9.m6253q(AbstractC7554g.m14301b(c3966o).f36396h, c3966o, 0), p9.m6254r(8, 62), null, AbstractC6740i.m12902d(298096529, new C0762g(c1480b, interfaceC2141e, enumC7204p, interfaceC2139c, list, interfaceC2139c2, interfaceC2137a), c3966o), c3966o, 196614, 16);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6609i(c1480b, enumC7204p, list, interfaceC2137a, interfaceC2139c, interfaceC2139c2, interfaceC2141e, i10);
        }
    }

    /* renamed from: d */
    public static final void m16484d(C1479a c1479a, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1356512718);
        int i11 = (c3966o.m8614g(c1479a) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            FillElement fillElement = AbstractC0245d.f1971c;
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, fillElement);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            m16492l(c1479a.f7540a, c1479a.f7541b, c1479a.f7542c, c3966o, 0);
            m16490j(c1479a.f7543d, c1479a.f7545f, c1479a.f7546g, c1479a.f7544e, c3966o, 0);
            m16481a(c1479a.f7547h, c1479a.f7548i, c1479a.f7549j, c1479a.f7550k, c3966o, 0);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6885b(c1479a, i10, 18);
        }
    }

    /* renamed from: e */
    public static final void m16485e(final C0740c c0740c, w0 w0Var, w0 w0Var2, w0 w0Var3, InterfaceC2139c interfaceC2139c, a0 a0Var, boolean z6, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        w0 w0Var4;
        w0 w0Var5;
        w0 w0Var6;
        InterfaceC2139c interfaceC2139c2;
        boolean z10;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-106921675);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8616i(c0740c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            w0Var4 = w0Var;
            i11 |= c3966o2.m8614g(w0Var4) ? 32 : 16;
        } else {
            w0Var4 = w0Var;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            w0Var5 = w0Var2;
            i11 |= c3966o2.m8614g(w0Var5) ? 256 : 128;
        } else {
            w0Var5 = w0Var2;
        }
        if ((i10 & 3072) == 0) {
            w0Var6 = w0Var3;
            i11 |= c3966o2.m8614g(w0Var6) ? NewHope.SENDB_BYTES : 1024;
        } else {
            w0Var6 = w0Var3;
        }
        if ((i10 & 24576) == 0) {
            interfaceC2139c2 = interfaceC2139c;
            i11 |= c3966o2.m8616i(interfaceC2139c2) ? 16384 : 8192;
        } else {
            interfaceC2139c2 = interfaceC2139c;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o2.m8616i(a0Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            z10 = z6;
            i11 |= c3966o2.m8615h(z10) ? 1048576 : 524288;
        } else {
            z10 = z6;
        }
        if (c3966o2.m8598P(i11 & 1, (599187 & i11) != 599186)) {
            String str = c0740c.f4679m;
            String strM11238i = AbstractC5601a.m11238i("+", c0740c.f4680n, c0740c.f4681o);
            final boolean z11 = z10;
            final w0 w0Var7 = w0Var5;
            final w0 w0Var8 = w0Var4;
            final InterfaceC2139c interfaceC2139c3 = interfaceC2139c2;
            final w0 w0Var9 = w0Var6;
            C6734c c6734cM12902d = AbstractC6740i.m12902d(-1499000628, new InterfaceC2142f() { // from class: zq.j
                @Override // ex.InterfaceC2142f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    o1 AppBarWithTitleDesc = (o1) obj;
                    InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    AbstractC4154l.m8923f(AppBarWithTitleDesc, "$this$AppBarWithTitleDesc");
                    C3966o c3966o3 = (C3966o) interfaceC3962k2;
                    if (c3966o3.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z12 = z11;
                        InterfaceC2139c interfaceC2139c4 = interfaceC2139c3;
                        if (z12) {
                            c3966o3.m8607Y(-1952696088);
                            boolean zM8614g = c3966o3.m8614g(interfaceC2139c4);
                            Object objM8596M = c3966o3.m8596M();
                            if (zM8614g || objM8596M == C3961j.f20408a) {
                                objM8596M = new sq.p1(18, interfaceC2139c4);
                                c3966o3.j0(objM8596M);
                            }
                            g2.m13131I((InterfaceC2137a) objM8596M, null, false, null, null, AbstractC9018a.f43439e, c3966o3, 196608, 30);
                        } else {
                            c3966o3.m8607Y(-1966811690);
                        }
                        c3966o3.m8623p(false);
                        C0740c c0740c2 = c0740c;
                        AbstractC9018a.m16488h(w0Var8, w0Var7, w0Var9, c0740c2.f4681o, c0740c2.f4680n, interfaceC2139c4, c3966o3, 0);
                    } else {
                        c3966o3.m8601S();
                    }
                    return qw.a0.f30746a;
                }
            }, c3966o2);
            boolean zM8616i = c3966o2.m8616i(a0Var);
            Object objM8596M = c3966o2.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C8470i(a0Var, 1);
                c3966o2.j0(objM8596M);
            }
            c3966o = c3966o2;
            g2.m13159k(null, null, str, strM11238i, 0L, 0, c6734cM12902d, (InterfaceC2137a) objM8596M, c3966o, 12582912, 115);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new y0(c0740c, w0Var, w0Var2, w0Var3, interfaceC2139c, a0Var, z6, i10);
        }
    }

    /* renamed from: f */
    public static final void m16486f(List callHistoryList, C0739b c0739b, InterfaceC2137a getLatestState, EnumC7204p simSelectionMode, InterfaceC2139c onPlayRecordingClick, InterfaceC2139c onRecordingDownloadClick, InterfaceC2139c viewModelAction, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C6097y c6097y;
        AbstractC4154l.m8923f(callHistoryList, "callHistoryList");
        AbstractC4154l.m8923f(getLatestState, "getLatestState");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(onPlayRecordingClick, "onPlayRecordingClick");
        AbstractC4154l.m8923f(onRecordingDownloadClick, "onRecordingDownloadClick");
        AbstractC4154l.m8923f(viewModelAction, "viewModelAction");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-49461667);
        int i12 = i10 | (c3966o.m8616i(callHistoryList) ? 4 : 2) | (c3966o.m8616i(c0739b) ? 32 : 16) | (c3966o.m8616i(getLatestState) ? 256 : 128) | (c3966o.m8612e(simSelectionMode.ordinal()) ? NewHope.SENDB_BYTES : 1024) | (c3966o.m8616i(onPlayRecordingClick) ? 16384 : 8192) | (c3966o.m8616i(onRecordingDownloadClick) ? 131072 : 65536) | (c3966o.m8616i(viewModelAction) ? 1048576 : 524288);
        if (c3966o.m8598P(i12 & 1, (599187 & i12) != 599186)) {
            C6097y c6097yM12082a = b0.m12082a(0, 3, c3966o);
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            if (objM8596M == obj) {
                objM8596M = C3953b.m8510m(C7565i.f36440a, c3966o);
                c3966o.j0(objM8596M);
            }
            InterfaceC7266z interfaceC7266z = (InterfaceC7266z) objM8596M;
            int i13 = 3670016 & i12;
            boolean zM8614g = c3966o.m8614g(c6097yM12082a) | c3966o.m8616i(interfaceC7266z) | ((i12 & 896) == 256) | (i13 == 1048576);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g || objM8596M2 == obj) {
                i11 = i12;
                C8423d c8423d = new C8423d(c6097yM12082a, interfaceC7266z, getLatestState, viewModelAction, null, 1);
                c6097y = c6097yM12082a;
                c3966o.j0(c8423d);
                objM8596M2 = c8423d;
            } else {
                i11 = i12;
                c6097y = c6097yM12082a;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M2, c6097y, c3966o);
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == obj) {
                objM8596M3 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M3);
            }
            w0 w0Var = (w0) objM8596M3;
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                w0Var.setValue(Boolean.FALSE);
                Toast.makeText(context, context.getString(R.string.deleted_recording_msg), 0).show();
            }
            if (callHistoryList.isEmpty()) {
                c3966o.m8607Y(-337186959);
                FillElement fillElement = AbstractC0245d.f1971c;
                j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
                int i14 = c3966o.f20462P;
                i1 i1VarM8620m = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, fillElement);
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
                b1.m13113q(t0.m10920c(c3966o, R.string.no_call_history), C0243b.f1966a.mo662a(C7876o.f37669a, C7864c.f37646e), 0L, null, null, 0, 0, 0L, null, null, c3966o, 0, 1020);
                c3966o = c3966o;
                c3966o.m8623p(true);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-336981243);
                FillElement fillElement2 = AbstractC0245d.f1971c;
                WeakHashMap weakHashMap = w1.f25863v;
                o1.y0 y0VarM10323h = AbstractC5244c.m10323h(C5243b.m10315e(c3966o).f25868e, c3966o);
                boolean zM8616i = (i13 == 1048576) | c3966o.m8616i(callHistoryList) | c3966o.m8616i(c0739b) | ((i11 & 7168) == 2048) | ((57344 & i11) == 16384) | ((458752 & i11) == 131072);
                Object objM8596M4 = c3966o.m8596M();
                if (zM8616i || objM8596M4 == obj) {
                    C1139f c1139f = new C1139f(callHistoryList, c0739b, simSelectionMode, onPlayRecordingClick, onRecordingDownloadClick, viewModelAction, w0Var, 4);
                    c3966o.j0(c1139f);
                    objM8596M4 = c1139f;
                }
                nc.m10775b(fillElement2, c6097y, y0VarM10323h, null, null, null, false, null, (InterfaceC2139c) objM8596M4, c3966o, 6, 504);
                c3966o.m8623p(false);
            }
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new k3(callHistoryList, c0739b, getLatestState, simSelectionMode, onPlayRecordingClick, onRecordingDownloadClick, viewModelAction, i10);
        }
    }

    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [w2.j, w2.r] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* renamed from: g */
    public static final void m16487g(a0 navController, C1775y viewModel, InterfaceC2137a navigation, InterfaceC3962k interfaceC3962k, int i10) {
        C1775y c1775y;
        a0 a0Var;
        w0 w0Var;
        boolean z6;
        Boolean bool;
        Context context;
        final C0740c c0740c;
        C6361k c6361k;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        w0 w0Var2;
        InterfaceC7559c interfaceC7559c;
        Object c9029l;
        w0 w0Var3;
        C6979d c6979d;
        ?? r10;
        C0740c c0740c2;
        boolean z13;
        C0740c c0740c3;
        boolean z14;
        Object obj;
        w0 w0Var4;
        w0 w0Var5;
        C0741d c0741d;
        boolean z15;
        boolean z16;
        Object obj2;
        Boolean bool2;
        boolean z17;
        AbstractC4154l.m8923f(navController, "navController");
        AbstractC4154l.m8923f(viewModel, "viewModel");
        wx.w0 w0Var6 = viewModel.f36253c;
        AbstractC4154l.m8923f(navigation, "navigation");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1683954890);
        int i12 = i10 | (c3966o.m8616i(navController) ? 4 : 2) | (c3966o.m8616i(viewModel) ? 32 : 16) | (c3966o.m8616i(navigation) ? 256 : 128);
        if (c3966o.m8598P(i12 & 1, (i12 & 147) != 146)) {
            C0740c c0740c4 = (C0740c) C3953b.m8509l(viewModel.f8636s, c3966o).getValue();
            w0 w0VarM8509l = C3953b.m8509l(viewModel.f8643z, c3966o);
            Object objM8596M = c3966o.m8596M();
            Object obj3 = C3961j.f20408a;
            if (objM8596M == obj3) {
                objM8596M = new n2(24);
                c3966o.j0(objM8596M);
            }
            C6979d c6979dM13251b = t1.b0.m13251b(0, KyberEngine.KyberPolyBytes, 3, (InterfaceC2137a) objM8596M, c3966o);
            Context context2 = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            Object[] objArr = new Object[0];
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == obj3) {
                objM8596M2 = new n2(25);
                c3966o.j0(objM8596M2);
            }
            w0 w0Var7 = (w0) hg.m10691b(objArr, null, (InterfaceC2137a) objM8596M2, c3966o, 0, 6);
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == obj3) {
                objM8596M3 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M3);
            }
            w0 w0Var8 = (w0) objM8596M3;
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == obj3) {
                objM8596M4 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M4);
            }
            w0 w0Var9 = (w0) objM8596M4;
            Object objM8596M5 = c3966o.m8596M();
            if (objM8596M5 == obj3) {
                objM8596M5 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M5);
            }
            w0 w0Var10 = (w0) objM8596M5;
            Object objM8596M6 = c3966o.m8596M();
            if (objM8596M6 == obj3) {
                objM8596M6 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M6);
            }
            w0 w0Var11 = (w0) objM8596M6;
            if (((Boolean) w0Var10.getValue()).booleanValue()) {
                c3966o.m8607Y(1482954129);
                w0Var10.setValue(Boolean.FALSE);
                Uri uri = c0740c4.f4685s.f4689c;
                boolean zM8616i = c3966o.m8616i(context2);
                Object objM8596M7 = c3966o.m8596M();
                if (zM8616i || objM8596M7 == obj3) {
                    w0Var = w0Var10;
                    objM8596M7 = new C2310p(context2, 7);
                    c3966o.j0(objM8596M7);
                } else {
                    w0Var = w0Var10;
                }
                z6 = false;
                g2.m13143U(uri, (InterfaceC2137a) objM8596M7, c3966o, 0);
            } else {
                w0Var = w0Var10;
                z6 = false;
                c3966o.m8607Y(1477953240);
            }
            c3966o.m8623p(z6);
            if (((Boolean) w0Var11.getValue()).booleanValue()) {
                c3966o.m8607Y(1483273181);
                w0Var11.setValue(Boolean.FALSE);
                g2.e0(c0740c4.f4685s.f4689c, c3966o, 0);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(1477953240);
                c3966o.m8623p(false);
            }
            d1 d1Var = new d1(1);
            boolean zM8616i2 = c3966o.m8616i(context2) | c3966o.m8616i(viewModel);
            Object objM8596M8 = c3966o.m8596M();
            if (zM8616i2 || objM8596M8 == obj3) {
                objM8596M8 = new C6334i(15, context2, viewModel);
                c3966o.j0(objM8596M8);
            }
            C2162k c2162kM10719c = je.m10719c(d1Var, (InterfaceC2139c) objM8596M8, c3966o, 0);
            String str = c0740c4.f4684r;
            C0741d c0741d2 = c0740c4.f4685s;
            Boolean bool3 = c0741d2.f4687a;
            boolean zM8616i3 = c3966o.m8616i(c0740c4) | c3966o.m8616i(c2162kM10719c);
            Object objM8596M9 = c3966o.m8596M();
            if (zM8616i3 || objM8596M9 == obj3) {
                objM8596M9 = new C8426g(c0740c4, c2162kM10719c, (InterfaceC7559c) null);
                c3966o.j0(objM8596M9);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M9, str, c3966o);
            Boolean bool4 = Boolean.TRUE;
            boolean zM8616i4 = c3966o.m8616i(viewModel) | c3966o.m8616i(navController) | c3966o.m8616i(context2);
            Object objM8596M10 = c3966o.m8596M();
            if (zM8616i4 || objM8596M10 == obj3) {
                bool = bool4;
                context = context2;
                c0740c = c0740c4;
                c6361k = null;
                i11 = 1477953240;
                C9029l c9029l2 = new C9029l(viewModel, navController, context, null, 1);
                c3966o.j0(c9029l2);
                objM8596M10 = c9029l2;
            } else {
                c6361k = null;
                i11 = 1477953240;
                bool = bool4;
                context = context2;
                c0740c = c0740c4;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M10, bool, c3966o);
            if (((C6361k) w0VarM8509l.getValue()) != null) {
                c3966o.m8607Y(1484634267);
                C6361k c6361k2 = (C6361k) w0VarM8509l.getValue();
                AbstractC4154l.m8920c(c6361k2);
                z10 = false;
                g2.m13142T((Uri) c6361k2.f30756b, c3966o, 0);
                viewModel.m5459s(new C0419i(c6361k));
            } else {
                z10 = false;
                c3966o.m8607Y(i11);
            }
            c3966o.m8623p(z10);
            ArrayList arrayList = new ArrayList();
            final int i13 = 0;
            arrayList.add(new g3(f9.m11629c(c3966o, R.string.summary), AbstractC6740i.m12902d(1890263439, new InterfaceC2141e() { // from class: zq.h
                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj4, Object obj5) {
                    int i14 = i13;
                    InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    switch (i14) {
                        case 0:
                            C3966o c3966o2 = (C3966o) interfaceC3962k2;
                            if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC9018a.m16489i(c0740c.f4670d.f4690a, c3966o2, 0);
                            } else {
                                c3966o2.m8601S();
                            }
                            break;
                        default:
                            C3966o c3966o3 = (C3966o) interfaceC3962k2;
                            if (c3966o3.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC9018a.m16484d(c0740c.f4671e.f4657a, c3966o3, 0);
                            } else {
                                c3966o3.m8601S();
                            }
                            break;
                    }
                    return qw.a0.f30746a;
                }
            }, c3966o)));
            final int i14 = 1;
            arrayList.add(new g3(f9.m11629c(c3966o, R.string.analysis), AbstractC6740i.m12902d(-82015880, new InterfaceC2141e() { // from class: zq.h
                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj4, Object obj5) {
                    int i142 = i14;
                    InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    switch (i142) {
                        case 0:
                            C3966o c3966o2 = (C3966o) interfaceC3962k2;
                            if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC9018a.m16489i(c0740c.f4670d.f4690a, c3966o2, 0);
                            } else {
                                c3966o2.m8601S();
                            }
                            break;
                        default:
                            C3966o c3966o3 = (C3966o) interfaceC3962k2;
                            if (c3966o3.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC9018a.m16484d(c0740c.f4671e.f4657a, c3966o3, 0);
                            } else {
                                c3966o3.m8601S();
                            }
                            break;
                    }
                    return qw.a0.f30746a;
                }
            }, c3966o)));
            arrayList.add(new g3(f9.m11629c(c3966o, R.string.call_history), AbstractC6740i.m12902d(-944320041, new C8453d(c0740c, viewModel, 5), c3966o)));
            if (((Boolean) w0Var9.getValue()).booleanValue()) {
                c3966o.m8607Y(1486068234);
                Object objM8596M11 = c3966o.m8596M();
                if (objM8596M11 == obj3) {
                    objM8596M11 = new C8457h(w0Var9, 16);
                    c3966o.j0(objM8596M11);
                }
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M11;
                boolean zM8616i5 = c3966o.m8616i(viewModel);
                Object objM8596M12 = c3966o.m8596M();
                if (zM8616i5 || objM8596M12 == obj3) {
                    objM8596M12 = new C9026i(w0Var9, viewModel);
                    c3966o.j0(objM8596M12);
                }
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M12;
                boolean zM8616i6 = c3966o.m8616i(viewModel);
                Object objM8596M13 = c3966o.m8596M();
                if (zM8616i6 || objM8596M13 == obj3) {
                    objM8596M13 = new C9026i(viewModel, w0Var9);
                    c3966o.j0(objM8596M13);
                }
                b1.m13096Z(interfaceC2137a, interfaceC2137a2, (InterfaceC2137a) objM8596M13, c3966o, 6);
                z11 = false;
            } else {
                z11 = false;
                c3966o.m8607Y(1477953240);
            }
            c3966o.m8623p(z11);
            if (((Boolean) w0Var8.getValue()).booleanValue()) {
                c3966o.m8607Y(1486562374);
                boolean zM8616i7 = c3966o.m8616i(viewModel) | c3966o.m8616i(c0740c);
                Object objM8596M14 = c3966o.m8596M();
                if (zM8616i7 || objM8596M14 == obj3) {
                    objM8596M14 = new C9024g(viewModel, c0740c, w0Var8);
                    c3966o.j0(objM8596M14);
                }
                InterfaceC2137a interfaceC2137a3 = (InterfaceC2137a) objM8596M14;
                Object objM8596M15 = c3966o.m8596M();
                if (objM8596M15 == obj3) {
                    objM8596M15 = new C8457h(w0Var8, 13);
                    c3966o.j0(objM8596M15);
                }
                g2.m13165q(interfaceC2137a3, (InterfaceC2137a) objM8596M15, c3966o, 48);
                z12 = false;
            } else {
                z12 = false;
                c3966o.m8607Y(1477953240);
            }
            c3966o.m8623p(z12);
            Integer numValueOf = Integer.valueOf(c6979dM13251b.m13263j());
            boolean zM8614g = c3966o.m8614g(c6979dM13251b) | c3966o.m8616i(viewModel);
            Object objM8596M16 = c3966o.m8596M();
            if (zM8614g || objM8596M16 == obj3) {
                w0Var2 = w0Var8;
                interfaceC7559c = null;
                objM8596M16 = new C8426g(c6979dM13251b, viewModel, interfaceC7559c, 12);
                c3966o.j0(objM8596M16);
            } else {
                w0Var2 = w0Var8;
                interfaceC7559c = null;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M16, numValueOf, c3966o);
            boolean zM8616i8 = c3966o.m8616i(viewModel) | c3966o.m8616i(navController) | c3966o.m8616i(context);
            Object objM8596M17 = c3966o.m8596M();
            if (zM8616i8 || objM8596M17 == obj3) {
                c9029l = new C9029l(viewModel, navController, context, interfaceC7559c, 0);
                c3966o.j0(c9029l);
            } else {
                c9029l = objM8596M17;
            }
            C3953b.m8503f((InterfaceC2141e) c9029l, qw.a0.f30746a, c3966o);
            long j6 = ((v1) c3966o.m8618k(y1.f13286a)).f12967n;
            C0174b c0174b = h0.f7748a;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0237a.m633a(c7876o, j6, c0174b).mo14852e(AbstractC0245d.f1971c), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 20, 7);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i15 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            if (c0740c.f4668b) {
                c3966o.m8607Y(-1666826523);
                g2.d0(c3966o, 0);
                c3966o.m8623p(false);
                a0Var = navController;
                c1775y = viewModel;
                c3966o = c3966o;
                c0740c3 = c0740c;
                obj = obj3;
                z14 = false;
                w0Var4 = w0Var;
                w0Var5 = w0Var11;
                c0741d = c0741d2;
                z15 = true;
            } else {
                c3966o.m8607Y(-1666737739);
                boolean zM8616i9 = c3966o.m8616i(viewModel);
                Object objM8596M18 = c3966o.m8596M();
                if (zM8616i9 || objM8596M18 == obj3) {
                    w0Var3 = w0Var9;
                    c6979d = c6979dM13251b;
                    r10 = 0;
                    vr.b0 b0Var = new vr.b0(1, viewModel, C1775y.class, "onAction", "onAction(Lcom/websoptimization/callyzerbiz/ui/contact_detail/event/ContactDetailEvent;)V", 0, 25);
                    c3966o.j0(b0Var);
                    objM8596M18 = b0Var;
                } else {
                    w0Var3 = w0Var9;
                    c6979d = c6979dM13251b;
                    r10 = 0;
                }
                C0740c c0740c5 = c0740c;
                m16485e(c0740c5, w0Var7, w0Var2, w0Var3, (InterfaceC2139c) ((InterfaceC4566e) objM8596M18), navController, c0740c.f4683q && !c0740c.f4669c.f4658a.isEmpty(), c3966o, ((i12 << 15) & 458752) | 3456);
                boolean zM8616i10 = c3966o.m8616i(viewModel);
                Object objM8596M19 = c3966o.m8596M();
                if (zM8616i10 || objM8596M19 == obj3) {
                    c0740c2 = c0740c5;
                    vr.b0 b0Var2 = new vr.b0(1, viewModel, C1775y.class, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/filters/model/AllFiltersEvent;)V", 0, 26);
                    c3966o.j0(b0Var2);
                    objM8596M19 = b0Var2;
                } else {
                    c0740c2 = c0740c5;
                }
                List list = ((ur.i0) C3953b.m8509l(w0Var6, c3966o).getValue()).f36224a;
                g0 g0Var = ((ur.i0) C3953b.m8509l(w0Var6, c3966o).getValue()).f36227d;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) ((InterfaceC4566e) objM8596M19);
                boolean z18 = (i12 & 896) == 256;
                Object objM8596M20 = c3966o.m8596M();
                if (z18 || objM8596M20 == obj3) {
                    objM8596M20 = new C8147c(22, navigation);
                    c3966o.j0(objM8596M20);
                }
                c3966o = c3966o;
                c1775y = viewModel;
                a0Var = navController;
                b1.m13099c(interfaceC2139c, list, g0Var, (InterfaceC2137a) objM8596M20, false, c3966o, 24576, 0);
                b1.m13087Q(AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, 10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13), c0740c2.f4676j, c0740c2.f4677k, c3966o, 6);
                if (c0740c2.f4667a) {
                    c3966o.m8607Y(-1665693411);
                    z13 = false;
                    b1.m13072B(0, 2, f9.m11629c(c3966o, R.string.no_data_found), c3966o, r10);
                } else {
                    z13 = false;
                    c3966o.m8607Y(-1676821202);
                }
                c3966o.m8623p(z13);
                InterfaceC7879r interfaceC7879rM686w = AbstractC0245d.m686w(c7876o, r10, 3);
                c0740c3 = c0740c2;
                z14 = z13;
                obj = obj3;
                w0Var4 = w0Var;
                w0Var5 = w0Var11;
                c0741d = c0741d2;
                z15 = true;
                b1.m13092V(arrayList, c6979d, null, null, AbstractC7556i.f36435h, interfaceC7879rM686w, c3966o, 221184, 12);
                c3966o.m8623p(z14);
            }
            c3966o.m8623p(z15);
            if (c0740c3.f4682p.f21221a) {
                c3966o.m8607Y(1489528237);
                boolean zM8616i11 = c3966o.m8616i(c1775y);
                Object objM8596M21 = c3966o.m8596M();
                if (zM8616i11 || objM8596M21 == obj) {
                    objM8596M21 = new C1752b(c1775y, 5);
                    c3966o.j0(objM8596M21);
                }
                InterfaceC2137a interfaceC2137a4 = (InterfaceC2137a) objM8596M21;
                C3966o c3966o2 = c3966o;
                obj2 = obj;
                z16 = z14;
                bool2 = bool3;
                g2.m13137O(interfaceC2137a4, f43436b, AbstractC6740i.m12902d(-1930637503, new C8459j(2, c1775y), c3966o), AbstractC6740i.m12902d(-1337148832, new C3004i(8, interfaceC2137a4), c3966o), c3966o2, 3504);
                c3966o = c3966o2;
            } else {
                z16 = z14;
                obj2 = obj;
                bool2 = bool3;
                c3966o.m8607Y(1477953240);
            }
            c3966o.m8623p(z16);
            if (bool2 != null) {
                c3966o.m8607Y(1490639897);
                if (AbstractC4154l.m8918a(bool2, Boolean.FALSE)) {
                    c3966o.m8607Y(1490693713);
                    Integer num = c0741d.f4688b;
                    String strM10920c = t0.m10920c(c3966o, num != null ? num.intValue() : R.string.something_went_wrong);
                    boolean zM8616i12 = c3966o.m8616i(c1775y);
                    Object objM8596M22 = c3966o.m8596M();
                    if (zM8616i12 || objM8596M22 == obj2) {
                        objM8596M22 = new C1752b(c1775y, 6);
                        c3966o.j0(objM8596M22);
                    }
                    z17 = z16;
                    g2.m13128F(strM10920c, 0, false, false, null, (InterfaceC2137a) objM8596M22, c3966o, 0, 30);
                    c3966o.m8623p(z17);
                } else {
                    z17 = z16;
                    c3966o.m8607Y(1490999125);
                    String strM10920c2 = t0.m10920c(c3966o, R.string.csv_exported_true);
                    String strM10920c3 = t0.m10920c(c3966o, R.string.csv_find_hint);
                    Object objM8596M23 = c3966o.m8596M();
                    if (objM8596M23 == obj2) {
                        objM8596M23 = new C8457h(w0Var4, 14);
                        c3966o.j0(objM8596M23);
                    }
                    InterfaceC2137a interfaceC2137a5 = (InterfaceC2137a) objM8596M23;
                    Object objM8596M24 = c3966o.m8596M();
                    if (objM8596M24 == obj2) {
                        objM8596M24 = new C8457h(w0Var5, 15);
                        c3966o.j0(objM8596M24);
                    }
                    InterfaceC2137a interfaceC2137a6 = (InterfaceC2137a) objM8596M24;
                    boolean zM8616i13 = c3966o.m8616i(c1775y);
                    Object objM8596M25 = c3966o.m8596M();
                    if (zM8616i13 || objM8596M25 == obj2) {
                        objM8596M25 = new C1752b(c1775y, 7);
                        c3966o.j0(objM8596M25);
                    }
                    g2.m13130H(strM10920c2, strM10920c3, interfaceC2137a5, interfaceC2137a6, (InterfaceC2137a) objM8596M25, c3966o, 3456);
                    c3966o.m8623p(z17);
                }
            } else {
                z17 = z16;
                c3966o.m8607Y(1477953240);
            }
            c3966o.m8623p(z17);
        } else {
            c1775y = viewModel;
            a0Var = navController;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C8784j(a0Var, c1775y, navigation, i10);
        }
    }

    /* renamed from: h */
    public static final void m16488h(w0 w0Var, w0 w0Var2, w0 w0Var3, String str, String str2, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, int i10) {
        boolean z6;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-478862500);
        int i11 = i10 | (c3966o.m8614g(w0Var) ? 4 : 2) | (c3966o.m8614g(w0Var2) ? 32 : 16) | (c3966o.m8614g(w0Var3) ? 256 : 128) | (c3966o.m8614g(str) ? NewHope.SENDB_BYTES : 1024) | (c3966o.m8614g(str2) ? 16384 : 8192) | (c3966o.m8616i(interfaceC2139c) ? 131072 : 65536);
        if (c3966o.m8598P(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 14;
            boolean z10 = i12 == 4;
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (z10 || objM8596M == s0Var) {
                objM8596M = new C8457h(w0Var, 17);
                c3966o.j0(objM8596M);
            }
            g2.m13131I((InterfaceC2137a) objM8596M, null, false, null, null, f43440f, c3966o, 196608, 30);
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                c3966o.m8607Y(2089160299);
                boolean z11 = i12 == 4;
                Object objM8596M2 = c3966o.m8596M();
                if (z11 || objM8596M2 == s0Var) {
                    objM8596M2 = new C8457h(w0Var, 18);
                    c3966o.j0(objM8596M2);
                }
                g2.m13162n(0L, null, null, (InterfaceC2137a) objM8596M2, AbstractC6740i.m12902d(1109838156, new C5435d(w0Var2, w0Var, w0Var3, interfaceC2139c, str2, str), c3966o), c3966o, 24576, 7);
                c3966o = c3966o;
                z6 = false;
            } else {
                z6 = false;
                c3966o.m8607Y(2073884646);
            }
            c3966o.m8623p(z6);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new d0(w0Var, w0Var2, w0Var3, str, str2, interfaceC2139c, i10);
        }
    }

    /* renamed from: i */
    public static final void m16489i(List summaryList, InterfaceC3962k interfaceC3962k, int i10) {
        C1481c c1481c;
        AbstractC4154l.m8923f(summaryList, "summaryList");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-167616244);
        int i11 = (c3966o.m8616i(summaryList) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            FillElement fillElement = AbstractC0245d.f1971c;
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, fillElement);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, j0VarM10361d, c3966o);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            i1.p1 p1VarM11707b = pg.j0.m11707b(c3966o);
            C5246e c5246e = AbstractC5251j.f25763g;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM11708c = pg.j0.m11708c(c7876o, p1VarM11707b, true, true);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(c5246e, C7864c.f37654n, c3966o, 6);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM11708c);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, c5261tM10367a, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            ArrayList arrayList = new ArrayList();
            c3966o.m8607Y(-425823762);
            Iterator it = summaryList.iterator();
            while (it.hasNext()) {
                C1481c c1481c2 = (C1481c) it.next();
                if (c1481c2.f7557b.equals("Total")) {
                    c3966o.m8607Y(-28761189);
                } else {
                    c3966o.m8607Y(-26906459);
                    arrayList.add(new d3(c1481c2.f7558c, c1481c2.m5058a(c3966o), c1481c2.f7557b));
                }
                c3966o.m8623p(false);
            }
            c3966o.m8623p(false);
            g2.m13147Y(AbstractC0245d.m668e(c7876o, 1.0f), arrayList, false, c3966o, 6);
            m16493m(c3966o, 0);
            c3966o.m8607Y(-425811600);
            Iterator it2 = summaryList.iterator();
            while (it2.hasNext()) {
                C1481c c1481c3 = (C1481c) it2.next();
                if (c1481c3.f7557b.equals("Total")) {
                    c3966o.m8607Y(271170465);
                    float f6 = 20;
                    InterfaceC7879r interfaceC7879rM2176a = AbstractC0810c.m2176a(AbstractC0242a.m660n(c7876o, f6, 10, f6, DefinitionKt.NO_Float_VALUE, 8), 0.3f);
                    c1481c = c1481c3;
                    p9.m6245i(interfaceC7879rM2176a, DefinitionKt.NO_Float_VALUE, 0L, c3966o, 0, 6);
                } else {
                    c1481c = c1481c3;
                    c3966o.m8607Y(268938930);
                }
                c3966o.m8623p(false);
                m16494n(c1481c, c3966o, 0);
            }
            a1.m14320C(c3966o, false, true, true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C5186x(summaryList, i10, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0233  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m16490j(java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, k2.InterfaceC3962k r50, int r51) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.AbstractC9018a.m16490j(java.lang.String, java.lang.String, java.lang.String, java.lang.String, k2.k, int):void");
    }

    /* renamed from: k */
    public static final void m16491k(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1476156715);
        if (c3966o.m8598P(i10 & 1, i10 != 0)) {
            FillElement fillElement = AbstractC0245d.f1971c;
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37646e, false);
            int i11 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, fillElement);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i11))) {
                AbstractC1452a.m4577x(i11, c3966o, i11, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            k9.m6197b(AbstractC0242a.m656j(AbstractC0245d.m678o(C7876o.f37669a, 50), 10), ((v1) c3966o.m8618k(y1.f13286a)).f12954a, 3.0f, 0L, 0, c3966o, 390, 24);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7734b(i10, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e6  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m16492l(java.lang.String r61, java.lang.String r62, java.lang.String r63, k2.InterfaceC3962k r64, int r65) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.AbstractC9018a.m16492l(java.lang.String, java.lang.String, java.lang.String, k2.k, int):void");
    }

    /* renamed from: m */
    public static final void m16493m(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(320557503);
        if (c3966o.m8598P(i10 & 1, i10 != 0)) {
            C7870i c7870i = C7864c.f37652l;
            float f6 = 20;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(c7876o, f6, 10, f6, DefinitionKt.NO_Float_VALUE, 8);
            n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o, 48);
            int i11 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i11))) {
                AbstractC1452a.m4577x(i11, c3966o, i11, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            InterfaceC7879r interfaceC7879rM670g = AbstractC0245d.m670g(c7876o, 14);
            p1 p1Var = p1.f25811a;
            AbstractC5244c.m10322f(c3966o, p1Var.mo10364b(1.0f, interfaceC7879rM670g, true));
            String strM11629c = f9.m11629c(c3966o, R.string.calls);
            i2 i2Var = xd.f13268a;
            b1.m13113q(strM11629c, AbstractC0245d.m668e(p1Var.mo10364b(1.0f, c7876o, true), 1.0f), 0L, null, new C6456k(3), 0, 0, 0L, null, ((vd) c3966o.m8618k(i2Var)).f13050f, c3966o, 0, 492);
            b1.m13113q(f9.m11629c(c3966o, R.string.duration), AbstractC0245d.m668e(p1Var.mo10364b(1.0f, c7876o, true), 1.0f), 0L, null, new C6456k(3), 0, 0, 0L, null, ((vd) c3966o.m8618k(i2Var)).f13050f, c3966o, 0, 492);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C9030m(i10);
        }
    }

    /* renamed from: n */
    public static final void m16494n(C1481c c1481c, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        String strM16160g;
        String str = c1481c.f7557b;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-799531584);
        int i11 = i10 | (c3966o2.m8614g(c1481c) ? 4 : 2);
        if (c3966o2.m8598P(i11 & 1, (i11 & 3) != 2)) {
            float f6 = 20;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(c7876o, f6, 10, f6, DefinitionKt.NO_Float_VALUE, 8);
            n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, C7864c.f37651k, c3966o2, 0);
            int i12 = c3966o2.f20462P;
            i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM660n);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(c7637i);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o2);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o2);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o2, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o2);
            long jM5058a = c1481c.m5058a(c3966o2);
            o0 o0VarM5059b = c1481c.m5059b(c3966o2);
            p1 p1Var = p1.f25811a;
            b1.m13113q(str, p1Var.mo10364b(1.0f, c7876o, true), jM5058a, null, null, 0, 0, 0L, null, o0VarM5059b, c3966o2, 0, 504);
            b1.m13113q(String.valueOf(c1481c.f7558c), AbstractC0245d.m668e(p1Var.mo10364b(1.0f, c7876o, true), 1.0f), 0L, null, new C6456k(3), 0, 0, 0L, null, c1481c.m5059b(c3966o2), c3966o2, 0, 492);
            if (str.equals("Missed") || str.equals("Rejected")) {
                strM16160g = "-";
            } else {
                Long l9 = c1481c.f7556a.f27214b;
                if (l9 == null || (strM16160g = C8789d.m16160g(false, l9.longValue())) == null) {
                    strM16160g = "0s";
                }
            }
            b1.m13113q(strM16160g, AbstractC0245d.m668e(p1Var.mo10364b(1.0f, c7876o, true), 1.0f), 0L, null, new C6456k(3), 0, 0, 0L, null, c1481c.m5059b(c3966o2), c3966o2, 0, 492);
            c3966o = c3966o2;
            c3966o.m8623p(true);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6885b(c1481c, i10, 19);
        }
    }
}
