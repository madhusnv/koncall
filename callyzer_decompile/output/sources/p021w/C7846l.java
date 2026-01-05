package p021w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import p022x.C8249s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.l */
/* loaded from: classes.dex */
public final class C7846l extends C7845k {
    @Override // p021w.C7845k
    /* renamed from: e */
    public final void mo14829e(C8249s c8249s) throws CameraAccessException, CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) c8249s.f39395a.mo15421a();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.f37615a).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        }
    }
}
