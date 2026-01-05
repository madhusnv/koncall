package p001o;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes2.dex */
public abstract class fi0 {
    /* renamed from: a */
    public static void m26710a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
