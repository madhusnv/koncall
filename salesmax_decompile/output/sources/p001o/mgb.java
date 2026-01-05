package p001o;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzbg;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class mgb extends zzbg {

    /* renamed from: b */
    public static final ThreadLocal f35398b = new ThreadLocal();

    /* renamed from: a */
    public final ThreadPoolExecutor f35399a;

    public mgb() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: o.ijj
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: o.ljj
                    @Override // java.lang.Runnable
                    public final void run() {
                        mgb.m38987b(runnable);
                    }
                });
            }
        });
        this.f35399a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: b */
    public static /* synthetic */ void m38987b(Runnable runnable) {
        f35398b.set(new ArrayDeque());
        runnable.run();
    }

    /* renamed from: c */
    public static void m38988c(Deque deque, Runnable runnable) {
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbg, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f35398b.get();
        if (deque == null || deque.size() > 1) {
            this.f35399a.execute(new Runnable() { // from class: o.fjj
                @Override // java.lang.Runnable
                public final void run() {
                    mgb.m38988c((Deque) mgb.f35398b.get(), runnable);
                }
            });
        } else {
            m38988c(deque, runnable);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbg, com.google.android.gms.internal.mlkit_common.zzai
    public final /* synthetic */ Object zza() {
        return this.f35399a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbg
    public final ExecutorService zzb() {
        return this.f35399a;
    }
}
