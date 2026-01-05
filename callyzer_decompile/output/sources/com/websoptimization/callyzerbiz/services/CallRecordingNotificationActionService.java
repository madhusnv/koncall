package com.websoptimization.callyzerbiz.services;

import ab.C0084b;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ap.InterfaceC0391d;
import ay.C0496f;
import ay.ExecutorC0495e;
import gm.C2648q;
import gm.C2651t;
import gw.C2746h;
import iw.InterfaceC3359b;
import jn.AbstractC3802a;
import kotlin.jvm.internal.AbstractC4154l;
import tx.c0;
import tx.m0;
import xm.s2;
import xm.x1;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallRecordingNotificationActionService extends Service implements InterfaceC3359b {

    /* renamed from: a */
    public volatile C2746h f7411a;

    /* renamed from: b */
    public final Object f7412b = new Object();

    /* renamed from: c */
    public boolean f7413c = false;

    /* renamed from: d */
    public s2 f7414d;

    /* renamed from: e */
    public x1 f7415e;

    /* renamed from: f */
    public C8805t f7416f;

    /* renamed from: g */
    public C8810d f7417g;

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        if (this.f7411a == null) {
            synchronized (this.f7412b) {
                try {
                    if (this.f7411a == null) {
                        this.f7411a = new C2746h(this);
                    }
                } finally {
                }
            }
        }
        return this.f7411a.mo1432a();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f7413c) {
            this.f7413c = true;
            C2651t c2651t = ((C2648q) ((InterfaceC0391d) mo1432a())).f14272a;
            this.f7414d = (s2) c2651t.f14300X.get();
            this.f7415e = c2651t.m6614d();
            this.f7416f = c2651t.m6633w();
            this.f7417g = AbstractC3802a.m8397a(c2651t.f14307e);
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        String stringExtra;
        if (intent == null || !intent.hasExtra("action") || (stringExtra = intent.getStringExtra("action")) == null || stringExtra.length() == 0 || !AbstractC4154l.m8918a(intent.getStringExtra("action"), "UploadWork")) {
            return 1;
        }
        C0496f c0496f = m0.f34659a;
        c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C0084b(this, null, 2), 3);
        return 1;
    }
}
