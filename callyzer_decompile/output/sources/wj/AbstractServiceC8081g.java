package wj;

import a1.C0004c;
import a1.RunnableC0025x;
import ag.ThreadFactoryC0141a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import h6.ExecutorC2852h;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ug.g1;
import yg.C8650g;
import yg.C8656m;
import yj.EnumC8686a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.g */
/* loaded from: classes.dex */
public abstract class AbstractServiceC8081g extends Service {

    /* renamed from: a */
    public final ExecutorService f38697a;

    /* renamed from: b */
    public BinderC8099y f38698b;

    /* renamed from: c */
    public final Object f38699c;

    /* renamed from: d */
    public int f38700d;

    /* renamed from: e */
    public int f38701e;

    public AbstractServiceC8081g() {
        ThreadFactoryC0141a threadFactoryC0141a = new ThreadFactoryC0141a("Firebase-Messaging-Intent-Handle");
        EnumC8686a enumC8686a = EnumC8686a.LOW_POWER;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC0141a);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f38697a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f38699c = new Object();
        this.f38701e = 0;
    }

    /* renamed from: b */
    public final void m15219b(Intent intent) {
        if (intent != null) {
            AbstractC8098x.m15282b(intent);
        }
        synchronized (this.f38699c) {
            try {
                int i10 = this.f38701e - 1;
                this.f38701e = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f38700d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public abstract void mo4487c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.f38698b == null) {
                this.f38698b = new BinderC8099y(new g1(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f38698b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f38697a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f38699c) {
            this.f38700d = i11;
            this.f38701e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) C8090p.m15225t().f38726d).poll();
        if (intent2 == null) {
            m15219b(intent);
            return 2;
        }
        C8650g c8650g = new C8650g();
        this.f38697a.execute(new RunnableC0025x(25, this, intent2, c8650g));
        C8656m c8656m = c8650g.f41930a;
        if (c8656m.m15984k()) {
            m15219b(intent);
            return 2;
        }
        c8656m.m15975b(new ExecutorC2852h(0), new C0004c(21, this, intent));
        return 3;
    }
}
