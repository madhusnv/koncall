package p001o;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes2.dex */
public final class ad2 extends j72 {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f14523a;

    public ad2(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f14523a = captureCallback;
    }

    /* renamed from: e */
    public static ad2 m16892e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new ad2(captureCallback);
    }

    /* renamed from: f */
    public CameraCaptureSession.CaptureCallback m16893f() {
        return this.f14523a;
    }
}
