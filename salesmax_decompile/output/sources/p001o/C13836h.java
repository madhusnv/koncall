package p001o;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.C10773c;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p001o.lk8;

/* renamed from: o.h */
/* loaded from: classes5.dex */
public final class C13836h {

    /* renamed from: a */
    public static final C13836h f26029a = new C13836h();

    /* renamed from: b */
    public static final int f26030b = Process.myUid();

    /* renamed from: c */
    public static final ScheduledExecutorService f26031c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d */
    public static String f26032d = "";

    /* renamed from: e */
    public static final Runnable f26033e = new Runnable() { // from class: o.g
        @Override // java.lang.Runnable
        public final void run() {
            C13836h.m29714b();
        }
    };

    /* renamed from: b */
    public static final void m29714b() {
        if (a94.m16694d(C13836h.class)) {
            return;
        }
        try {
            Object systemService = C10773c.m13019l().getSystemService("activity");
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            m29715c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th) {
            a94.m16692b(th, C13836h.class);
        }
    }

    /* renamed from: c */
    public static final void m29715c(ActivityManager activityManager) {
        if (a94.m16694d(C13836h.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f26030b) {
                        Thread thread = Looper.getMainLooper().getThread();
                        sq8.m48648g(thread, "getMainLooper().thread");
                        String strM50112g = tk8.m50112g(thread);
                        if (!sq8.m48644c(strM50112g, f26032d) && tk8.m50116k(thread)) {
                            f26032d = strM50112g;
                            lk8.C15093a.m37384a(processErrorStateInfo.shortMsg, strM50112g).m37383g();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, C13836h.class);
        }
    }

    /* renamed from: d */
    public static final void m29716d() {
        if (a94.m16694d(C13836h.class)) {
            return;
        }
        try {
            f26031c.scheduleWithFixedDelay(f26033e, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            a94.m16692b(th, C13836h.class);
        }
    }
}
