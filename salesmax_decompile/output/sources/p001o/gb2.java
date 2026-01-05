package p001o;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class gb2 {
    /* renamed from: a */
    public static Executor m28293a() {
        return lt5.m37874a();
    }

    /* renamed from: b */
    public static Executor m28294b() {
        return tv8.m50712a();
    }

    /* renamed from: c */
    public static ScheduledExecutorService m28295c() {
        return ppa.m44008a();
    }

    /* renamed from: d */
    public static ScheduledExecutorService m28296d(Handler handler) {
        return new sw7(handler);
    }

    /* renamed from: e */
    public static Executor m28297e(Executor executor) {
        return new tef(executor);
    }
}
