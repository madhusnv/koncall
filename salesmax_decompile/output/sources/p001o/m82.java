package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class m82 extends n82 {
    public m82(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // p001o.n82, p001o.x72.InterfaceC18068a
    /* renamed from: b */
    public int mo38528b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f36547a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // p001o.n82, p001o.x72.InterfaceC18068a
    /* renamed from: c */
    public int mo38529c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f36547a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
