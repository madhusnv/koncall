package p001o;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class i32 {
    /* renamed from: a */
    public static Handler m31406a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
