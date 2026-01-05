package p020v;

import android.hardware.camera2.CameraCaptureSession;
import i0.AbstractC3084o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 extends AbstractC3084o {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f36618a;

    public k0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f36618a = captureCallback;
    }
}
