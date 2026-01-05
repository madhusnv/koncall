package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* loaded from: classes2.dex */
public abstract class di0 {
    /* renamed from: a */
    public static void m23158a(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
    }
}
