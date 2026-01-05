package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import p001o.l72;

/* loaded from: classes2.dex */
public final class zc2 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final j72 f56924a;

    public zc2(j72 j72Var) {
        if (j72Var == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f56924a = j72Var;
    }

    /* renamed from: a */
    public final int m59171a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof wig) && (num = (Integer) ((wig) captureRequest.getTag()).m54617d("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        wig wigVarM54615b;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            fgd.m26658b(tag instanceof wig, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            wigVarM54615b = (wig) tag;
        } else {
            wigVarM54615b = wig.m54615b();
        }
        this.f56924a.mo4682b(m59171a(captureRequest), new r32(wigVarM54615b, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f56924a.mo18248c(m59171a(captureRequest), new l72(l72.EnumC15008a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        this.f56924a.mo33322d(m59171a(captureRequest));
    }
}
