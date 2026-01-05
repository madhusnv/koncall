package k0;

import ag.RunnableC0142b;
import android.os.Handler;
import android.os.Looper;
import c0.ThreadFactoryC0820m;
import com.google.android.gms.internal.measurement.h0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ug.m1;
import ug.n1;
import ug.q2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k0.g */
/* loaded from: classes.dex */
public final class ExecutorC3897g implements Executor {

    /* renamed from: c */
    public static volatile ExecutorC3897g f20001c;

    /* renamed from: a */
    public final /* synthetic */ int f20002a;

    /* renamed from: b */
    public final Object f20003b;

    public /* synthetic */ ExecutorC3897g(int i10, Object obj) {
        this.f20002a = i10;
        this.f20003b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f20002a) {
            case 0:
                ((ExecutorService) this.f20003b).execute(runnable);
                break;
            case 1:
                ((Handler) this.f20003b).post(runnable);
                break;
            case 2:
                m1 m1Var = ((n1) ((q2) this.f20003b).f482a).f35670g;
                n1.m14085m(m1Var);
                m1Var.m14047V(runnable);
                break;
            case 3:
                ((Executor) this.f20003b).execute(new RunnableC0142b(runnable, 3));
                break;
            default:
                ((h0) this.f20003b).post(runnable);
                break;
        }
    }

    public ExecutorC3897g(int i10) {
        this.f20002a = i10;
        switch (i10) {
            case 1:
                this.f20003b = new Handler(Looper.getMainLooper());
                break;
            case 4:
                h0 h0Var = new h0(Looper.getMainLooper(), 6, false);
                Looper.getMainLooper();
                this.f20003b = h0Var;
                break;
            default:
                this.f20003b = Executors.newFixedThreadPool(2, new ThreadFactoryC0820m(1));
                break;
        }
    }
}
