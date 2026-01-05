package p021w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.t */
/* loaded from: classes.dex */
public final class C7854t extends C7853s {
    @Override // c9.C0908c
    /* renamed from: k */
    public final Set mo2566k() throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.f5574b).getConcurrentCameraIds();
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        }
    }
}
