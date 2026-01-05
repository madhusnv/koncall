package of;

import ag.ThreadFactoryC0141a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import dj.RunnableC1730c;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pg.l8;
import tf.AbstractC7149a;
import ug.C7434e;
import ug.C7449t;
import ug.i0;
import ug.j4;
import ug.k3;
import ug.n1;
import ug.n4;
import ug.v0;
import wj.C8083i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5354i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26282a;

    /* renamed from: b */
    public final /* synthetic */ boolean f26283b;

    /* renamed from: c */
    public final /* synthetic */ Parcelable f26284c;

    /* renamed from: d */
    public final /* synthetic */ Object f26285d;

    /* renamed from: e */
    public final /* synthetic */ Object f26286e;

    public /* synthetic */ RunnableC5354i(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z6, BroadcastReceiver.PendingResult pendingResult) {
        this.f26282a = 0;
        this.f26284c = intent;
        this.f26285d = context;
        this.f26283b = z6;
        this.f26286e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executor;
        int iM4467a;
        switch (this.f26282a) {
            case 0:
                Intent intent = (Intent) this.f26284c;
                Context context = (Context) this.f26285d;
                boolean z6 = this.f26283b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f26286e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        iM4467a = FirebaseInstanceIdReceiver.m4467a(intent2);
                    } else {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            Executor executorUnconfigurableExecutorService = null;
                            C5346a c5346a = new C5346a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f7143b;
                                    if (softReference != null) {
                                        executorUnconfigurableExecutorService = (Executor) softReference.get();
                                    }
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0141a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f7143b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                    executor = executorUnconfigurableExecutorService;
                                } finally {
                                }
                            }
                            executor.execute(new RunnableC1730c(2, context, c5346a, countDownLatch, false));
                            try {
                                iIntValue = ((Integer) l8.m11760a(new C8083i(context).m15221b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException unused) {
                            }
                            try {
                                countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e2) {
                                "Message ack failed: ".concat(e2.toString());
                            }
                        }
                        iM4467a = iIntValue;
                    }
                    if (z6 && pendingResult != null) {
                        pendingResult.setResultCode(iM4467a);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                k3 k3Var = (k3) this.f26286e;
                i0 i0Var = k3Var.f35570d;
                if (i0Var == null) {
                    v0 v0Var = ((n1) k3Var.f482a).f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35862f.m14140a("Discarding data. Failed to set user property");
                    return;
                } else {
                    k3Var.e0(i0Var, this.f26283b ? null : (j4) this.f26285d, (n4) this.f26284c);
                    k3Var.m14026Z();
                    return;
                }
            case 2:
                k3 k3Var2 = (k3) this.f26286e;
                i0 i0Var2 = k3Var2.f35570d;
                if (i0Var2 == null) {
                    v0 v0Var2 = ((n1) k3Var2.f482a).f35669f;
                    n1.m14085m(v0Var2);
                    v0Var2.f35862f.m14140a("Discarding data. Failed to send event to service");
                    return;
                } else {
                    k3Var2.e0(i0Var2, this.f26283b ? null : (C7449t) this.f26285d, (n4) this.f26284c);
                    k3Var2.m14026Z();
                    return;
                }
            default:
                k3 k3Var3 = (k3) this.f26286e;
                i0 i0Var3 = k3Var3.f35570d;
                if (i0Var3 == null) {
                    v0 v0Var3 = ((n1) k3Var3.f482a).f35669f;
                    n1.m14085m(v0Var3);
                    v0Var3.f35862f.m14140a("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    k3Var3.e0(i0Var3, this.f26283b ? null : (C7434e) this.f26285d, (n4) this.f26284c);
                    k3Var3.m14026Z();
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC5354i(k3 k3Var, n4 n4Var, boolean z6, AbstractC7149a abstractC7149a, int i10) {
        this.f26282a = i10;
        this.f26284c = n4Var;
        this.f26283b = z6;
        this.f26285d = abstractC7149a;
        this.f26286e = k3Var;
    }

    public RunnableC5354i(k3 k3Var, n4 n4Var, boolean z6, C7434e c7434e) {
        this.f26282a = 3;
        this.f26284c = n4Var;
        this.f26283b = z6;
        this.f26285d = c7434e;
        Objects.requireNonNull(k3Var);
        this.f26286e = k3Var;
    }
}
