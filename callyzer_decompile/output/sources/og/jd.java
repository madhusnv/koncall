package og;

import android.view.View;
import android.view.Window;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2142f;
import fq.C2366a;
import fq.C2367b;
import g2.k9;
import g2.sc;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import ht.C3028c;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import o1.AbstractC5251j;
import o1.InterfaceC5262u;
import o1.m1;
import o1.n1;
import og.af;
import og.r0;
import og.t0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p1.AbstractC5788a;
import pg.i0;
import qs.C6305c;
import qw.a0;
import r4.C6457l;
import s2.AbstractC6740i;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w1.C7860d;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class jd {
    /* renamed from: a */
    public static final void m10713a(InterfaceC7879r interfaceC7879r, InterfaceC2137a clickOnTap, InterfaceC2137a clickOnDismiss, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC7879r interfaceC7879r2;
        AbstractC4154l.m8923f(clickOnTap, "clickOnTap");
        AbstractC4154l.m8923f(clickOnDismiss, "clickOnDismiss");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1163677669);
        int i11 = i10 | 6 | (c3966o.m8616i(clickOnTap) ? 32 : 16) | (c3966o.m8616i(clickOnDismiss) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            C7860d c7860dM14841b = AbstractC7861e.m14841b(10);
            C7876o c7876o = C7876o.f37669a;
            g2.p9.m6240d(AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o, 1.0f), 5, DefinitionKt.NO_Float_VALUE, 2), c7860dM14841b, g2.p9.m6253q(((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12976w, c3966o, 0), null, null, AbstractC6740i.m12902d(303852503, new C2366a(clickOnTap, clickOnDismiss, 1), c3966o), c3966o, 196608, 24);
            interfaceC7879r2 = c7876o;
        } else {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2367b(interfaceC7879r2, clickOnTap, clickOnDismiss, i10, 1);
        }
    }

    /* renamed from: b */
    public static final void m10714b(String str, boolean z6, InterfaceC7879r interfaceC7879r, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC7879r interfaceC7879r2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1642682139);
        int i11 = i10 | (c3966o.m8614g(str) ? 4 : 2) | (c3966o.m8615h(z6) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            C7860d c7860dM14841b = AbstractC7861e.m14841b(10);
            C7876o c7876o = C7876o.f37669a;
            float f6 = 5;
            k2.i2 i2Var = g2.y1.f13286a;
            g2.p9.m6240d(pg.c0.m11560a(AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), f6, DefinitionKt.NO_Float_VALUE, f6, f6, 2), 1, ((g2.v1) c3966o.m8618k(i2Var)).f12976w, c7860dM14841b), c7860dM14841b, g2.p9.m6253q(((g2.v1) c3966o.m8618k(i2Var)).f12978y, c3966o, 0), null, null, AbstractC6740i.m12902d(610143155, new C6305c(z6, str, 0), c3966o), c3966o, 196608, 24);
            interfaceC7879r2 = c7876o;
        } else {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C3028c(str, z6, interfaceC7879r2, i10, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10715c(java.lang.Integer r17, ss.C6913b r18, s2.C6734c r19, k2.InterfaceC3962k r20, int r21) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.jd.m10715c(java.lang.Integer, ss.b, s2.c, k2.k, int):void");
    }

    /* renamed from: d */
    public static final void m10716d(final int i10, final boolean z6, final InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, InterfaceC3962k interfaceC3962k, int i11) {
        InterfaceC7879r interfaceC7879r2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1908302928);
        int i12 = i11 | (c3966o.m8612e(i10) ? 4 : 2) | (c3966o.m8615h(z6) ? 32 : 16) | (c3966o.m8616i(interfaceC2137a) ? 256 : 128) | 3072;
        if (c3966o.m8598P(i12 & 1, (i12 & 1171) != 1170)) {
            C7860d c7860dM14841b = AbstractC7861e.m14841b(10);
            C7876o c7876o = C7876o.f37669a;
            float f6 = 5;
            k2.i2 i2Var = g2.y1.f13286a;
            g2.p9.m6240d(pg.c0.m11560a(AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), f6, DefinitionKt.NO_Float_VALUE, f6, f6, 2), 1, ((g2.v1) c3966o.m8618k(i2Var)).f12959f, c7860dM14841b), c7860dM14841b, g2.p9.m6253q(((g2.v1) c3966o.m8618k(i2Var)).f12967n, c3966o, 0), null, null, AbstractC6740i.m12902d(-613285346, new InterfaceC2142f() { // from class: qs.b
                @Override // ex.InterfaceC2142f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String strM10919b;
                    C3966o c3966o2;
                    InterfaceC5262u Card = (InterfaceC5262u) obj;
                    InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    AbstractC4154l.m8923f(Card, "$this$Card");
                    C3966o c3966o3 = (C3966o) interfaceC3962k2;
                    if (c3966o3.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                        C7870i c7870i = C7864c.f37652l;
                        C7876o c7876o2 = C7876o.f37669a;
                        InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(c7876o2, 6);
                        n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o3, 48);
                        int i13 = c3966o3.f20462P;
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
                        C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o3);
                        C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o3);
                        C7636h c7636h = C7638j.f36926g;
                        if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i13))) {
                            AbstractC1452a.m4577x(i13, c3966o3, i13, c7636h);
                        }
                        C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o3);
                        if (z6) {
                            c3966o3.m8607Y(1134212106);
                            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o2, 22);
                            i2 i2Var2 = y1.f13286a;
                            k9.m6197b(interfaceC7879rM678o, ((v1) c3966o3.m8618k(i2Var2)).f12959f, 3, 0L, 0, c3966o3, 390, 24);
                            sc.m6307b(t0.m10920c(c3966o3, R.string.call_recording_syncing), AbstractC0242a.m660n(c7876o2, 10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), ((v1) c3966o3.m8618k(i2Var2)).f12959f, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0.m6461a(((vd) c3966o3.m8618k(xd.f13268a)).f13056l, 0L, af.m10534c(14), C3998s.f20698h, null, null, 0L, 0L, null, 16777209), c3966o3, 48, 0, 65528);
                            c3966o2 = c3966o3;
                            c3966o2.m8623p(false);
                        } else {
                            c3966o3.m8607Y(1134675246);
                            i0.m11693a(r0.m10866b(R.drawable.red_warrning_icon, 0, c3966o3), "Icon", AbstractC0245d.m678o(c7876o2, 25), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o3, 432, 120);
                            int i14 = i10;
                            if (i14 == 1) {
                                c3966o3.m8607Y(867894545);
                                strM10919b = t0.m10920c(c3966o3, R.string.one_recording_sync_pending_msg);
                                c3966o3.m8623p(false);
                            } else {
                                c3966o3.m8607Y(867896744);
                                strM10919b = t0.m10919b(R.string.recording_sync_pending_msg, new Object[]{Integer.valueOf(i14)}, c3966o3);
                                c3966o3.m8623p(false);
                            }
                            i2 i2Var3 = xd.f13268a;
                            o0 o0VarM6461a = o0.m6461a(((vd) c3966o3.m8618k(i2Var3)).f13056l, 0L, af.m10534c(14), C3998s.f20698h, null, null, 0L, 0L, null, 16777209);
                            long j6 = ((v1) c3966o3.m8618k(y1.f13286a)).f12959f;
                            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(c7876o2, 10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14);
                            if (1.0f <= 0.0d) {
                                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                            }
                            sc.m6307b(strM10919b, AbstractC4801l.m9747u(1.0f, interfaceC7879rM660n, true), j6, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0VarM6461a, c3966o3, 0, 0, 65528);
                            sc.m6307b(t0.m10920c(c3966o3, R.string.retry), AbstractC0237a.m637e(AbstractC0242a.m658l(c7876o2, 8, DefinitionKt.NO_Float_VALUE, 2), false, null, null, interfaceC2137a, 7), 0L, 0L, null, null, 0L, C6457l.f31117c, null, 0L, 0, false, 0, 0, null, ((vd) c3966o3.m8618k(i2Var3)).f13056l, c3966o3, 100663296, 0, 65276);
                            c3966o2 = c3966o3;
                            c3966o2.m8623p(false);
                        }
                        c3966o2.m8623p(true);
                    } else {
                        c3966o3.m8601S();
                    }
                    return a0.f30746a;
                }
            }, c3966o), c3966o, 196608, 24);
            interfaceC7879r2 = c7876o;
        } else {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new hq.f0(i10, z6, interfaceC2137a, interfaceC7879r2, i11);
        }
    }

    /* renamed from: f */
    public abstract void mo5512f(p004e.g0 g0Var, p004e.g0 g0Var2, Window window, View view, boolean z6, boolean z10);

    /* renamed from: e */
    public void mo5513e(Window window) {
    }
}
