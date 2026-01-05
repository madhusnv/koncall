package wi;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.t */
/* loaded from: classes.dex */
public final class RunnableC8070t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f38651a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f38652b;

    public RunnableC8070t(Runnable runnable) {
        this.f38652b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        switch (this.f38651a) {
            case 0:
                ((Runnable) this.f38652b).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) this.f38652b;
                try {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        executorService.shutdownNow();
                        break;
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdownNow();
                    return;
                }
                break;
        }
    }

    public RunnableC8070t(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f38652b = executorService;
    }
}
