package p021w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import c9.C0908c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.q */
/* loaded from: classes.dex */
public final class C7851q {

    /* renamed from: a */
    public final C0908c f37624a;

    /* renamed from: b */
    public final ArrayMap f37625b = new ArrayMap(4);

    public C7851q(C0908c c0908c) {
        this.f37624a = c0908c;
    }

    /* renamed from: a */
    public static C7851q m14834a(Context context, Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        return new C7851q(i10 >= 30 ? new C7854t(context, null) : i10 >= 29 ? new C7853s(context, null) : i10 >= 28 ? new C7852r(context, null) : new C0908c(context, new C7855u(handler)));
    }

    /* renamed from: b */
    public final C7843i m14835b(String str) {
        C7843i c7843i;
        synchronized (this.f37625b) {
            c7843i = (C7843i) this.f37625b.get(str);
            if (c7843i == null) {
                try {
                    C7843i c7843i2 = new C7843i(this.f37624a.mo2565i(str), str);
                    this.f37625b.put(str, c7843i2);
                    c7843i = c7843i2;
                } catch (AssertionError e2) {
                    throw new CameraAccessExceptionCompat(e2.getMessage(), e2);
                }
            }
        }
        return c7843i;
    }

    /* renamed from: c */
    public final String[] m14836c() throws CameraAccessExceptionCompat {
        C0908c c0908c = this.f37624a;
        c0908c.getClass();
        try {
            return ((CameraManager) c0908c.f5574b).getCameraIdList();
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        }
    }
}
