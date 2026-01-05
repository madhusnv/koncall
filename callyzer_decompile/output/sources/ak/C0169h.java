package ak;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import qi.C6230m;
import qj.InterfaceC6237b;
import ri.ScheduledExecutorServiceC6548f;
import ri.ThreadFactoryC6543a;
import uf.C7427b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ak.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0169h implements InterfaceC6237b {

    /* renamed from: a */
    public final /* synthetic */ int f519a;

    public /* synthetic */ C0169h(int i10) {
        this.f519a = i10;
    }

    @Override // qj.InterfaceC6237b
    public final Object get() {
        switch (this.f519a) {
            case 0:
                Random random = C0171j.f521j;
                return null;
            case 1:
                return Collections.EMPTY_SET;
            case 2:
                return null;
            case 3:
                return ExecutorsRegistrar.m4463a();
            case 4:
                C6230m c6230m = ExecutorsRegistrar.f7134a;
                return new ScheduledExecutorServiceC6548f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC6543a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f7137d.get());
            case 5:
                C6230m c6230m2 = ExecutorsRegistrar.f7134a;
                return new ScheduledExecutorServiceC6548f(Executors.newCachedThreadPool(new ThreadFactoryC6543a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f7137d.get());
            case 6:
                C6230m c6230m3 = ExecutorsRegistrar.f7134a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC6543a("Firebase Scheduler", 0, null));
            default:
                C7427b c7427b = FirebaseMessaging.f7158k;
                return null;
        }
    }
}
