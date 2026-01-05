package k7;

import android.os.Looper;
import androidx.core.os.OperationCanceledException;
import c0.ThreadFactoryC0820m;
import com.google.android.gms.internal.measurement.h0;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.CallableC3892b;
import nf.C5042d;
import qf.AbstractC6209h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k7.a */
/* loaded from: classes.dex */
public final class RunnableC4019a implements Runnable {

    /* renamed from: h */
    public static final ThreadPoolExecutor f20788h;

    /* renamed from: j */
    public static h0 f20789j;

    /* renamed from: a */
    public final CallableC3892b f20790a;

    /* renamed from: b */
    public final C4020b f20791b;

    /* renamed from: c */
    public volatile EnumC4023e f20792c = EnumC4023e.PENDING;

    /* renamed from: d */
    public final AtomicBoolean f20793d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f20794e = new AtomicBoolean();

    /* renamed from: f */
    public final CountDownLatch f20795f;

    /* renamed from: g */
    public final /* synthetic */ C5042d f20796g;

    static {
        ThreadFactoryC0820m threadFactoryC0820m = new ThreadFactoryC0820m(2);
        f20788h = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactoryC0820m);
    }

    public RunnableC4019a(C5042d c5042d) {
        this.f20796g = c5042d;
        CallableC3892b callableC3892b = new CallableC3892b(1, this);
        this.f20790a = callableC3892b;
        this.f20791b = new C4020b(this, callableC3892b);
        this.f20795f = new CountDownLatch(1);
    }

    /* renamed from: a */
    public final void m8821a() throws InterruptedException {
        try {
            C5042d c5042d = this.f20796g;
            Iterator it = c5042d.f24815j.iterator();
            if (it.hasNext()) {
                ((AbstractC6209h) it.next()).getClass();
                throw new UnsupportedOperationException();
            }
            try {
                c5042d.f24814i.tryAcquire(0, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (OperationCanceledException e2) {
            if (!this.f20793d.get()) {
                throw e2;
            }
        }
    }

    /* renamed from: b */
    public final void m8822b(Object obj) {
        h0 h0Var;
        synchronized (RunnableC4019a.class) {
            try {
                if (f20789j == null) {
                    f20789j = new h0(Looper.getMainLooper(), 2, false);
                }
                h0Var = f20789j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h0Var.obtainMessage(1, new C4022d(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20796g.m9963b();
    }
}
