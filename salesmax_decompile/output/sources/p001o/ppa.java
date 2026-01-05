package p001o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class ppa {

    /* renamed from: a */
    public static volatile ScheduledExecutorService f40379a;

    /* renamed from: a */
    public static ScheduledExecutorService m44008a() {
        if (f40379a != null) {
            return f40379a;
        }
        synchronized (ppa.class) {
            if (f40379a == null) {
                f40379a = new sw7(new Handler(Looper.getMainLooper()));
            }
        }
        return f40379a;
    }
}
