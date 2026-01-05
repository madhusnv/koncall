package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import j7.C3595b;
import java.util.concurrent.CountDownLatch;
import k7.C4022d;
import k7.EnumC4023e;
import k7.RunnableC4019a;
import nf.C5042d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class h0 extends Handler {

    /* renamed from: a */
    public final /* synthetic */ int f6224a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Looper looper, int i10, boolean z6) {
        super(looper);
        this.f6224a = i10;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        switch (this.f6224a) {
            case 2:
                C4022d c4022d = (C4022d) message.obj;
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    RunnableC4019a runnableC4019a = c4022d.f20799a;
                    return;
                }
                RunnableC4019a runnableC4019a2 = c4022d.f20799a;
                Object obj = c4022d.f20800b[0];
                if (runnableC4019a2.f20793d.get()) {
                    countDownLatch = runnableC4019a2.f20795f;
                    try {
                        C5042d c5042d = runnableC4019a2.f20796g;
                        if (c5042d.f24813h == runnableC4019a2) {
                            SystemClock.uptimeMillis();
                            c5042d.f24813h = null;
                            c5042d.m9963b();
                        }
                        countDownLatch.countDown();
                    } finally {
                        countDownLatch.countDown();
                    }
                } else {
                    try {
                        C5042d c5042d2 = runnableC4019a2.f20796g;
                        if (c5042d2.f24812g != runnableC4019a2) {
                            if (c5042d2.f24813h == runnableC4019a2) {
                                SystemClock.uptimeMillis();
                                c5042d2.f24813h = null;
                                c5042d2.m9963b();
                            }
                        } else if (!c5042d2.f24808c) {
                            SystemClock.uptimeMillis();
                            c5042d2.f24812g = null;
                            C3595b c3595b = c5042d2.f24806a;
                            if (c3595b != null) {
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    c3595b.m5321k(obj);
                                } else {
                                    c3595b.m5319i(obj);
                                }
                            }
                        }
                    } finally {
                        countDownLatch = runnableC4019a2.f20795f;
                    }
                }
                runnableC4019a2.f20792c = EnumC4023e.FINISHED;
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Looper looper, Handler.Callback callback, int i10) {
        super(looper, callback);
        this.f6224a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Looper looper, int i10) {
        super(looper);
        this.f6224a = i10;
        switch (i10) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 4:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
