package nq;

import al.C0174b;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0409l;
import au.C0457u;
import bt.C0767l;
import bt.C0773r;
import com.amplifyframework.storage.s3.C1230b;
import com.sun.mail.util.AbstractC1452a;
import d3.h0;
import d7.InterfaceC1637j;
import d7.c1;
import d7.w0;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fw.C2392f;
import g2.p9;
import g2.u9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import g7.C2536a;
import h7.AbstractC2868a;
import hq.f0;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.n1;
import k2.s0;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4182l;
import lp.C4504f;
import ls.C4513d;
import mm.C4791b;
import o1.AbstractC5256o;
import og.af;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import pg.AbstractC5928i;
import pg.r9;
import q1.C6080h;
import qq.C6276b;
import r4.C6456k;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.b1;
import t3.j0;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nq.e */
/* loaded from: classes3.dex */
public abstract class AbstractC5133e {

    /* renamed from: a */
    public static final C6734c f25135a = new C6734c(new C4182l(5), false, -904301196);

    /* renamed from: a */
    public static final void m10053a(C4791b c4791b, boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1254775049);
        int i11 = (c3966o.m8616i(c4791b) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8615h(z6) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2137a) ? 256 : 128;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            p9.m6240d(AbstractC0242a.m656j(C7876o.f37669a, 8), AbstractC7861e.m14841b(10), null, p9.m6254r(4, 62), null, AbstractC6740i.m12902d(51222213, new C0773r(2, interfaceC2137a, c4791b, z6), c3966o), c3966o, 196614, 20);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(c4791b, z6, interfaceC2137a, i10, 2);
        }
    }

    /* renamed from: b */
    public static final void m10054b(Intent intent, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(817340954);
        int i11 = (c3966o.m8616i(intent) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            c3966o.m8608Z(1890788296);
            c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2392f c2392fM11854a = r9.m11854a(c1VarM6992a, c3966o);
            c3966o.m8608Z(1729797275);
            w0 w0VarM11692c = AbstractC5928i.m11692c(C6276b.class, c1VarM6992a, c2392fM11854a, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b, c3966o);
            c3966o.m8623p(false);
            c3966o.m8623p(false);
            C6276b c6276b = (C6276b) w0VarM11692c;
            k2.w0 w0VarM8509l = C3953b.m8509l(c6276b.f30493g, c3966o);
            boolean zM8616i = c3966o.m8616i(c6276b) | c3966o.m8616i(intent);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            InterfaceC7559c interfaceC7559c = null;
            if (zM8616i || objM8596M == s0Var) {
                objM8596M = new C4504f(c6276b, intent, interfaceC7559c, 15);
                c3966o.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, intent, c3966o);
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8616i2 = c3966o.m8616i(c6276b) | c3966o.m8616i(context);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i2 || objM8596M2 == s0Var) {
                objM8596M2 = new C4504f(c6276b, context, interfaceC7559c, 16);
                c3966o.j0(objM8596M2);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M2, intent, c3966o);
            u9.m6323a(null, AbstractC6740i.m12902d(1588785886, new C0767l(21, context, c6276b, w0VarM8509l), c3966o), null, null, null, 0, 0L, 0L, null, AbstractC6740i.m12902d(600037033, new C5129a(w0VarM8509l, c6276b), c3966o), c3966o, 805306416, 509);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1230b(intent, i10, 20);
        }
    }

    /* renamed from: c */
    public static final void m10055c(String str, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(251134536);
        int i11 = i10 | (c3966o.m8614g(str) ? 4 : 2);
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            long j6 = ((v1) c3966o.m8618k(y1.f13286a)).f12967n;
            C0174b c0174b = h0.f7748a;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(c7876o, j6, c0174b);
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM633a);
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
            b1.m13113q(str, AbstractC0242a.m656j(AbstractC0245d.m668e(c7876o, 1.0f), 10), 0L, null, new C6456k(5), 0, 0, 0L, null, o0.m6461a(((vd) c3966o.m8618k(xd.f13268a)).f13051g, 0L, af.m10534c(18), null, null, null, 0L, 0L, null, 16777213), c3966o, (i11 & 14) | 48, 492);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0457u(str, i10, 8);
        }
    }

    /* renamed from: d */
    public static final void m10056d(String str, List list, int i10, InterfaceC2139c interfaceC2139c, C6080h c6080h) {
        c6080h.m12100r(null, (3 & 2) != 0 ? null : "Date", new C6734c(new C4513d(str, 1), true, -739545993));
        c6080h.m12099p(list.size(), null, new C0409l(list, 19), new C6734c(new C5132d(i10, interfaceC2139c, list), true, -1091073711));
    }
}
