package p001o;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class mpa {

    /* renamed from: a */
    public static volatile Handler f35847a;

    /* renamed from: a */
    public static Handler m39497a() {
        if (f35847a != null) {
            return f35847a;
        }
        synchronized (mpa.class) {
            if (f35847a == null) {
                f35847a = lw7.m37994a(Looper.getMainLooper());
            }
        }
        return f35847a;
    }
}
