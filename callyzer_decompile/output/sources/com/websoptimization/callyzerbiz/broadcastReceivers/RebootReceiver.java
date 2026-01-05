package com.websoptimization.callyzerbiz.broadcastReceivers;

import ab.C0084b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sun.mail.util.AbstractC1452a;
import gm.C2651t;
import hm.InterfaceC2980p;
import jn.AbstractC3802a;
import kotlin.jvm.internal.AbstractC4154l;
import org.slf4j.helpers.AbstractC5722k;
import tx.c0;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class RebootReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public volatile boolean f7307a = false;

    /* renamed from: b */
    public final Object f7308b = new Object();

    /* renamed from: c */
    public C8805t f7309c;

    /* renamed from: d */
    public C9000c f7310d;

    /* renamed from: e */
    public C8810d f7311e;

    /* renamed from: a */
    public final void m4614a(Context context, Intent intent) {
        if (this.f7307a) {
            return;
        }
        synchronized (this.f7308b) {
            try {
                if (!this.f7307a) {
                    C2651t c2651t = (C2651t) ((InterfaceC2980p) AbstractC5722k.m11277a(context));
                    this.f7309c = c2651t.m6633w();
                    this.f7310d = c2651t.m6634x();
                    this.f7311e = AbstractC3802a.m8397a(c2651t.f14307e);
                    this.f7307a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m4614a(context, intent);
        if ((intent != null ? intent.getAction() : null) == null || !(AbstractC4154l.m8918a(intent.getAction(), "android.intent.action.BOOT_COMPLETED") || AbstractC4154l.m8918a(intent.getAction(), "android.intent.action.QUICKBOOT_POWERON") || AbstractC4154l.m8918a(intent.getAction(), "android.intent.action.REBOOT"))) {
            C8805t c8805t = this.f7309c;
            if (c8805t != null) {
                AbstractC1452a.m4579z("different intent action :- ", intent != null ? intent.getAction() : null, c8805t);
                return;
            } else {
                AbstractC4154l.m8928k("traceLog");
                throw null;
            }
        }
        C8810d c8810d = this.f7311e;
        if (c8810d != null) {
            c0.m13502y(c8810d, null, null, new C0084b(this, null, 19), 3);
        } else {
            AbstractC4154l.m8928k("ioCoroutineScope");
            throw null;
        }
    }
}
