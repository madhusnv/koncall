package p021w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.s */
/* loaded from: classes.dex */
public class C7853s extends C7852r {
    @Override // p021w.C7852r, c9.C0908c
    /* renamed from: C */
    public final void mo2550C(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        try {
            ((CameraManager) this.f5574b).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        }
    }

    @Override // p021w.C7852r, c9.C0908c
    /* renamed from: i */
    public final CameraCharacteristics mo2565i(String str) throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.f5574b).getCameraCharacteristics(str);
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        }
    }
}
