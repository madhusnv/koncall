package p001o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class fna {

    /* renamed from: b */
    public static final Object f23701b = new Object();

    /* renamed from: c */
    public static fna f23702c;

    /* renamed from: a */
    public final Handler f23703a;

    public fna(Looper looper) {
        this.f23703a = new zza(looper);
    }

    /* renamed from: a */
    public static fna m27126a() {
        fna fnaVar;
        synchronized (f23701b) {
            if (f23702c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f23702c = new fna(handlerThread.getLooper());
            }
            fnaVar = f23702c;
        }
        return fnaVar;
    }

    /* renamed from: d */
    public static Executor m27127d() {
        return bjj.zza;
    }

    /* renamed from: b */
    public Task m27129b(final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m27130c(new Runnable() { // from class: o.rij
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (lgb e) {
                    taskCompletionSource2.setException(e);
                } catch (Exception e2) {
                    taskCompletionSource2.setException(new lgb("Internal error has occurred when executing ML Kit tasks", 13, e2));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: c */
    public void m27130c(Runnable runnable) {
        m27127d().execute(runnable);
    }
}
