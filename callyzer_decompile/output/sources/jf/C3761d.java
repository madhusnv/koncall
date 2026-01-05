package jf;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jf.d */
/* loaded from: classes.dex */
public final class C3761d extends Thread {

    /* renamed from: a */
    public final WeakReference f19636a;

    /* renamed from: b */
    public final long f19637b;

    /* renamed from: c */
    public final CountDownLatch f19638c = new CountDownLatch(1);

    /* renamed from: d */
    public boolean f19639d = false;

    public C3761d(C3759b c3759b, long j6) {
        this.f19636a = new WeakReference(c3759b);
        this.f19637b = j6;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C3759b c3759b;
        WeakReference weakReference = this.f19636a;
        try {
            if (this.f19638c.await(this.f19637b, TimeUnit.MILLISECONDS) || (c3759b = (C3759b) weakReference.get()) == null) {
                return;
            }
            c3759b.m8282b();
            this.f19639d = true;
        } catch (InterruptedException unused) {
            C3759b c3759b2 = (C3759b) weakReference.get();
            if (c3759b2 != null) {
                c3759b2.m8282b();
                this.f19639d = true;
            }
        }
    }
}
