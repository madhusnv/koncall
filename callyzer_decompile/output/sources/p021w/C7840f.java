package p021w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import k0.ExecutorC3900j;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.f */
/* loaded from: classes.dex */
public final class C7840f extends C8849i {
    @Override // z1.C8849i
    /* renamed from: G */
    public final int mo14820G(List list, ExecutorC3900j executorC3900j, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f42583b).setRepeatingBurstRequests(list, executorC3900j, captureCallback);
    }

    @Override // z1.C8849i
    /* renamed from: H */
    public final int mo14821H(CaptureRequest captureRequest, ExecutorC3900j executorC3900j, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f42583b).setSingleRepeatingRequest(captureRequest, executorC3900j, captureCallback);
    }

    @Override // z1.C8849i
    /* renamed from: p */
    public final int mo14822p(List list, ExecutorC3900j executorC3900j, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f42583b).captureBurstRequests(list, executorC3900j, captureCallback);
    }
}
