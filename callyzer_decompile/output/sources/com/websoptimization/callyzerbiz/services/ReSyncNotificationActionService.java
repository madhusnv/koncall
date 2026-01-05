package com.websoptimization.callyzerbiz.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ap.C0395h;
import ap.InterfaceC0396i;
import ay.ExecutorC0495e;
import gm.C2648q;
import gm.C2651t;
import gw.C2746h;
import iw.InterfaceC3359b;
import kotlin.jvm.internal.AbstractC4154l;
import po.C5984e;
import tx.c0;
import uw.InterfaceC7559c;
import wo.C8134s;
import xm.y5;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class ReSyncNotificationActionService extends Service implements InterfaceC3359b {

    /* renamed from: a */
    public volatile C2746h f7431a;

    /* renamed from: d */
    public C8134s f7434d;

    /* renamed from: e */
    public C5984e f7435e;

    /* renamed from: f */
    public y5 f7436f;

    /* renamed from: g */
    public C8805t f7437g;

    /* renamed from: b */
    public final Object f7432b = new Object();

    /* renamed from: c */
    public boolean f7433c = false;

    /* renamed from: h */
    public final String f7438h = "ReSyncNotificationActionService";

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        if (this.f7431a == null) {
            synchronized (this.f7432b) {
                try {
                    if (this.f7431a == null) {
                        this.f7431a = new C2746h(this);
                    }
                } finally {
                }
            }
        }
        return this.f7431a.mo1432a();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f7433c) {
            this.f7433c = true;
            C2651t c2651t = ((C2648q) ((InterfaceC0396i) mo1432a())).f14272a;
            this.f7434d = c2651t.m6631u();
            this.f7435e = c2651t.m6624n();
            this.f7436f = (y5) c2651t.f14281E.get();
            this.f7437g = c2651t.m6633w();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        C8805t c8805t = this.f7437g;
        InterfaceC7559c interfaceC7559c = null;
        if (c8805t == null) {
            AbstractC4154l.m8928k("traceLogs");
            throw null;
        }
        c8805t.m16232g(this.f7438h, "ReSyncNotificationActionService: Started");
        C5984e c5984e = this.f7435e;
        if (c5984e == null) {
            AbstractC4154l.m8928k("notificationUseCase");
            throw null;
        }
        c5984e.m12019a(562);
        c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C0395h(this, interfaceC7559c, 0), 3);
        return 1;
    }
}
