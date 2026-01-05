package ys;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0245d;
import au.C0439c;
import com.websoptimization.callyzerbiz.R;
import ct.C1502a;
import cv.C1509e;
import d3.h0;
import ex.InterfaceC2137a;
import fq.C2366a;
import g2.ja;
import g2.p9;
import g2.v1;
import g2.y1;
import g2.z7;
import hq.C3004i;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import og.t0;
import qr.f0;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.g2;
import vs.C7759a;
import w1.AbstractC7861e;
import w2.C7876o;
import wr.C8147c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ys.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8768a {

    /* renamed from: a */
    public static final C6734c f42386a = new C6734c(new C7759a(13), false, -1782258413);

    /* renamed from: a */
    public static final void m16122a(InterfaceC2137a onConfirm, InterfaceC2137a onDismiss, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onConfirm, "onConfirm");
        AbstractC4154l.m8923f(onDismiss, "onDismiss");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(914831252);
        int i11 = (c3966o.m8616i(onConfirm) ? 4 : 2) | i10 | (c3966o.m8616i(onDismiss) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            p9.m6240d(AbstractC0245d.m668e(AbstractC0237a.m633a(C7876o.f37669a, ((v1) c3966o.m8618k(y1.f13286a)).f12969p, h0.f7748a), 1.0f), AbstractC7861e.m14841b(8), null, null, null, AbstractC6740i.m12902d(-1121249786, new C2366a(onDismiss, onConfirm, 4), c3966o), c3966o, 196608, 28);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1509e(onConfirm, onDismiss, i10, 4);
        }
    }

    /* renamed from: b */
    public static final void m16123b(InterfaceC2137a onConfirm, C1502a item, InterfaceC2137a onDismissRequest, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        AbstractC4154l.m8923f(onConfirm, "onConfirm");
        AbstractC4154l.m8923f(item, "item");
        AbstractC4154l.m8923f(onDismissRequest, "onDismissRequest");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-67505168);
        int i11 = i10 | (c3966o2.m8616i(onConfirm) ? 4 : 2) | (c3966o2.m8616i(item) ? 32 : 16) | (c3966o2.m8616i(onDismissRequest) ? 256 : 128);
        if (c3966o2.m8598P(i11 & 1, (i11 & 147) != 146)) {
            ja jaVarM6355f = z7.m6355f(false, null, c3966o2, 0, 3);
            if (item.f7590c) {
                c3966o2.m8607Y(-1001567175);
                String strM10920c = t0.m10920c(c3966o2, R.string.master_tamplates_can_not_be_deleted_or_edited);
                boolean z6 = (i11 & 896) == 256;
                Object objM8596M = c3966o2.m8596M();
                if (z6 || objM8596M == C3961j.f20408a) {
                    objM8596M = new C8147c(8, onDismissRequest);
                    c3966o2.j0(objM8596M);
                }
                c3966o = c3966o2;
                g2.m13128F(strM10920c, 0, false, false, null, (InterfaceC2137a) objM8596M, c3966o, 0, 30);
                c3966o.m8623p(false);
            } else {
                c3966o = c3966o2;
                c3966o.m8607Y(-1001408145);
                g2.m13162n(0L, null, jaVarM6355f, onDismissRequest, AbstractC6740i.m12902d(-2048472457, new C2366a(onConfirm, onDismissRequest, 6), c3966o), c3966o2, ((i11 << 3) & 7168) | 24624, 1);
                c3966o.m8623p(false);
            }
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(onConfirm, (Object) item, (Object) onDismissRequest, i10, 29);
        }
    }

    /* renamed from: c */
    public static final void m16124c(InterfaceC2137a onConfirm, InterfaceC2137a onDismiss, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onConfirm, "onConfirm");
        AbstractC4154l.m8923f(onDismiss, "onDismiss");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(865404005);
        int i11 = (c3966o.m8616i(onConfirm) ? 4 : 2) | i10 | (c3966o.m8616i(onDismiss) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            p9.m6240d(AbstractC0245d.m668e(AbstractC0237a.m633a(C7876o.f37669a, ((v1) c3966o.m8618k(y1.f13286a)).f12969p, h0.f7748a), 1.0f), AbstractC7861e.m14841b(8), null, null, null, AbstractC6740i.m12902d(998837043, new C2366a(onDismiss, onConfirm, 8), c3966o), c3966o, 196608, 28);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1509e(onConfirm, onDismiss, i10, 6);
        }
    }

    /* renamed from: d */
    public static final void m16125d(InterfaceC2137a onConfirm, InterfaceC2137a onDismiss, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onConfirm, "onConfirm");
        AbstractC4154l.m8923f(onDismiss, "onDismiss");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-765214827);
        int i11 = (c3966o.m8616i(onConfirm) ? 4 : 2) | i10 | (c3966o.m8616i(onDismiss) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            ja jaVarM6355f = z7.m6355f(false, null, c3966o, 0, 3);
            boolean z6 = (i11 & 112) == 32;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new C8147c(13, onDismiss);
                c3966o.j0(objM8596M);
            }
            g2.m13162n(0L, null, jaVarM6355f, (InterfaceC2137a) objM8596M, AbstractC6740i.m12902d(1928425024, new C2366a(onDismiss, onConfirm, 5), c3966o), c3966o, 24624, 1);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1509e(onConfirm, onDismiss, i10, 5);
        }
    }

    /* renamed from: e */
    public static final void m16126e(InterfaceC2137a onConfirm, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2137a interfaceC2137a;
        AbstractC4154l.m8923f(onConfirm, "onConfirm");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-516973578);
        int i11 = (c3966o.m8616i(onConfirm) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            interfaceC2137a = onConfirm;
            g2.m13162n(0L, null, z7.m6355f(false, null, c3966o, 0, 3), interfaceC2137a, AbstractC6740i.m12902d(-1461130901, new C3004i(6, onConfirm), c3966o), c3966o, ((i11 << 9) & 7168) | 24624, 1);
        } else {
            interfaceC2137a = onConfirm;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 19, interfaceC2137a);
        }
    }
}
