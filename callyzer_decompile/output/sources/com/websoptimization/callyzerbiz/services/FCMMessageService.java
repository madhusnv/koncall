package com.websoptimization.callyzerbiz.services;

import a9.C0073l;
import android.content.Context;
import ao.C0372k;
import ap.InterfaceC0392e;
import ay.C0496f;
import ay.ExecutorC0495e;
import c9.C0914i;
import cj.C0979e;
import com.google.firebase.messaging.FirebaseMessagingService;
import e1.u0;
import fn.C2336i;
import gm.C2648q;
import gm.C2651t;
import gn.x2;
import gw.C2746h;
import hn.C2987d;
import iw.InterfaceC3359b;
import ix.AbstractC3363d;
import java.util.Objects;
import jn.AbstractC3802a;
import kn.EnumC4127g;
import kotlin.jvm.internal.AbstractC4154l;
import no.C5122i;
import po.C5984e;
import rn.h0;
import so.C6877c;
import tx.c0;
import tx.m0;
import u7.C7351a;
import uw.InterfaceC7559c;
import wj.C8083i;
import wj.C8089o;
import wo.C8134s;
import xm.C8418z;
import xm.b0;
import xm.l2;
import xm.q4;
import xm.y5;
import yn.C8716n;
import yv.C8791f;
import yv.C8803r;
import yv.C8805t;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FCMMessageService extends FirebaseMessagingService implements InterfaceC3359b {

    /* renamed from: h */
    public volatile C2746h f7418h;

    /* renamed from: j */
    public final Object f7419j = new Object();

    /* renamed from: k */
    public boolean f7420k = false;

    /* renamed from: l */
    public C8716n f7421l;

    /* renamed from: m */
    public C8805t f7422m;

    /* renamed from: n */
    public C5984e f7423n;

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        if (this.f7418h == null) {
            synchronized (this.f7419j) {
                try {
                    if (this.f7418h == null) {
                        this.f7418h = new C2746h(this);
                    }
                } finally {
                }
            }
        }
        return this.f7418h.mo1432a();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: d */
    public final void mo4488d(C8089o c8089o) {
        String str;
        String str2;
        Object objM15223b = c8089o.m15223b();
        AbstractC4154l.m8922e(objM15223b, "getData(...)");
        if (!((u0) objM15223b).isEmpty()) {
            C0496f c0496f = m0.f34659a;
            c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C0372k(this, c8089o, (InterfaceC7559c) null, 2), 3);
            return;
        }
        if (c8089o.m15224c() != null) {
            Objects.toString(c8089o.m15224c());
            C8805t c8805t = this.f7422m;
            if (c8805t == null) {
                AbstractC4154l.m8928k("traceLogs");
                throw null;
            }
            c8805t.m16231f("Notification received with no data");
            C5984e c5984e = this.f7423n;
            if (c5984e == null) {
                AbstractC4154l.m8928k("notificationUseCase");
                throw null;
            }
            int iM7677d = AbstractC3363d.f17771a.m7677d(300);
            C8083i c8083iM15224c = c8089o.m15224c();
            String str3 = (c8083iM15224c == null || (str2 = (String) c8083iM15224c.f38708b) == null) ? "" : str2;
            C8083i c8083iM15224c2 = c8089o.m15224c();
            C5984e.m12016g(c5984e, iM7677d, str3, (c8083iM15224c2 == null || (str = (String) c8083iM15224c2.f38707a) == null) ? "" : str, EnumC4127g.Floating, null, false, null, false, null, 1008);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: e */
    public final void mo4489e(String token) {
        AbstractC4154l.m8923f(token, "token");
        C8791f c8791f = C8791f.f42457a;
        if (C8791f.m16171d(token)) {
            C8716n c8716n = this.f7421l;
            if (c8716n == null) {
                AbstractC4154l.m8928k("mFCMTokenUseCase");
                throw null;
            }
            b0 b0Var = c8716n.f42143a;
            C0496f c0496f = m0.f34659a;
            c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C7351a(b0Var, token, null, 29), 3);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f7420k) {
            this.f7420k = true;
            C2651t c2651t = ((C2648q) ((InterfaceC0392e) mo1432a())).f14272a;
            C2987d c2987d = (C2987d) c2651t.f14280D.get();
            b0 b0Var = new b0((C2336i) c2651t.f14277A.get(), (x2) c2651t.f14327y.get(), c2987d, c2651t.m6633w(), AbstractC3802a.m8397a(c2651t.f14307e));
            C9000c c9000cM6634x = c2651t.m6634x();
            C5984e c5984eM6624n = c2651t.m6624n();
            y5 y5Var = (y5) c2651t.f14281E.get();
            C8134s c8134sM6631u = c2651t.m6631u();
            C6877c c6877cM6625o = c2651t.m6625o();
            h0 h0Var = (h0) c2651t.f14302Z.get();
            l2 l2VarM6615e = c2651t.m6615e();
            x2 x2Var = (x2) c2651t.f14327y.get();
            Context context = c2651t.f14305c.f15864a;
            this.f7421l = new C8716n(b0Var, c9000cM6634x, c5984eM6624n, y5Var, c8134sM6631u, c6877cM6625o, h0Var, l2VarM6615e, x2Var, new C0073l(context, c2651t.m6618h(), (y5) c2651t.f14281E.get(), c2651t.m6627q(), c2651t.m6633w()), (C8418z) c2651t.f14296T.get(), new C0979e(new b0((x2) c2651t.f14327y.get(), (C2336i) c2651t.f14277A.get(), (C2987d) c2651t.f14280D.get(), (q4) c2651t.f14295S.get(), c2651t.m6633w()), (y5) c2651t.f14281E.get(), (q4) c2651t.f14295S.get(), (C2336i) c2651t.f14277A.get(), (C8803r) c2651t.f14293Q.get(), context, c2651t.m6633w()), new C0914i(c2651t.m6626p(), (y5) c2651t.f14281E.get(), c2651t.m6629s(), context), c2651t.m6633w(), c2651t.m6619i(), (C8803r) c2651t.f14293Q.get(), c2651t.m6614d(), (C5122i) c2651t.f14301Y.get(), context);
            this.f7422m = c2651t.m6633w();
            this.f7423n = c2651t.m6624n();
        }
        super.onCreate();
    }
}
