package s2;

import android.os.Looper;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s2.k */
/* loaded from: classes.dex */
public abstract class AbstractC6742k {

    /* renamed from: a */
    public static final long f32194a;

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f32194a = id2;
    }
}
