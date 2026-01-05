package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* loaded from: classes2.dex */
public abstract class ci0 {
    /* renamed from: a */
    public static void m21292a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
