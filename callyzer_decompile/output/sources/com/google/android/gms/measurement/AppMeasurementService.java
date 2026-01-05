package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import c7.AbstractC0897a;
import l0.RunnableC4307g;
import uf.C7427b;
import ug.h4;
import ug.n1;
import ug.n3;
import ug.s1;
import ug.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements n3 {

    /* renamed from: a */
    public C7427b f6713a;

    @Override // ug.n3
    /* renamed from: a */
    public final boolean mo4012a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // ug.n3
    /* renamed from: b */
    public final void mo4013b(Intent intent) {
        SparseArray sparseArray = AbstractC0897a.f5549a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = AbstractC0897a.f5549a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ug.n3
    /* renamed from: c */
    public final void mo4014c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final C7427b m4016d() {
        if (this.f6713a == null) {
            this.f6713a = new C7427b(1, this);
        }
        return this.f6713a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C7427b c7427bM4016d = m4016d();
        c7427bM4016d.getClass();
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new s1(h4.m13938C((Service) c7427bM4016d.f35231b));
        }
        "onBind received unknown action: ".concat(String.valueOf(action));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((Service) m4016d().f35231b).getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((Service) m4016d().f35231b).getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m4016d();
        if (intent == null) {
            return;
        }
        "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, final int i11) {
        final C7427b c7427bM4016d = m4016d();
        if (intent == null) {
            c7427bM4016d.getClass();
            return 2;
        }
        Service service = (Service) c7427bM4016d.f35231b;
        final v0 v0Var = n1.m14086s(service, null, null).f35669f;
        n1.m14085m(v0Var);
        String action = intent.getAction();
        v0Var.f35870p.m14142c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: ug.o3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) c7427bM4016d.f35231b;
                n3 n3Var = (n3) service2;
                int i12 = i11;
                if (n3Var.mo4012a(i12)) {
                    v0Var.f35870p.m14141b(Integer.valueOf(i12), "Local AppMeasurementService processed last upload request. StartId");
                    v0 v0Var2 = n1.m14086s(service2, null, null).f35669f;
                    n1.m14085m(v0Var2);
                    v0Var2.f35870p.m14140a("Completed wakeful intent.");
                    n3Var.mo4013b(intent);
                }
            }
        };
        h4 h4VarM13938C = h4.m13938C(service);
        h4VarM13938C.mo327b().m14047V(new RunnableC4307g(c7427bM4016d, h4VarM13938C, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m4016d();
        if (intent == null) {
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }
}
