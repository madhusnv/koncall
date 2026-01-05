package com.websoptimization.callyzerbiz.broadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ay.C0496f;
import ay.ExecutorC0495e;
import gm.C2651t;
import hm.C2982r;
import hm.InterfaceC2983s;
import ln.C4490c;
import nn.C5113e;
import org.slf4j.helpers.AbstractC5722k;
import tx.c0;
import tx.m0;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class SimStatesChangedReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public volatile boolean f7312a = false;

    /* renamed from: b */
    public final Object f7313b = new Object();

    /* renamed from: c */
    public final C8810d f7314c;

    /* renamed from: d */
    public C8805t f7315d;

    /* renamed from: e */
    public C5113e f7316e;

    /* renamed from: f */
    public C4490c f7317f;

    public SimStatesChangedReceiver() {
        C0496f c0496f = m0.f34659a;
        this.f7314c = c0.m13479b(ExecutorC0495e.f3538c);
    }

    /* renamed from: a */
    public final void m4615a(Context context, Intent intent) {
        if (this.f7312a) {
            return;
        }
        synchronized (this.f7313b) {
            try {
                if (!this.f7312a) {
                    C2651t c2651t = (C2651t) ((InterfaceC2983s) AbstractC5722k.m11277a(context));
                    this.f7315d = c2651t.m6633w();
                    this.f7316e = c2651t.m6611a();
                    this.f7317f = c2651t.m6617g();
                    this.f7312a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m4615a(context, intent);
        c0.m13502y(this.f7314c, null, null, new C2982r(this, null), 3);
    }
}
