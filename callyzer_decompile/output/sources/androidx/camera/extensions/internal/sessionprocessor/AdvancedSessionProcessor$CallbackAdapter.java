package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import i0.C3088s;
import i0.InterfaceC3093x;
import i0.x1;
import i0.y1;
import java.util.Objects;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class AdvancedSessionProcessor$CallbackAdapter implements x1 {
    private final RequestProcessorImpl.Callback mCallback;

    public AdvancedSessionProcessor$CallbackAdapter(RequestProcessorImpl.Callback callback) {
        this.mCallback = callback;
    }

    private RequestProcessorImpl.Request getImplRequest(y1 y1Var) {
        y0.m11052b(y1Var instanceof AdvancedSessionProcessor$RequestAdapter);
        return ((AdvancedSessionProcessor$RequestAdapter) y1Var).getImplRequest();
    }

    public void onCaptureBufferLost(y1 y1Var, long j6, int i10) {
        this.mCallback.onCaptureBufferLost(getImplRequest(y1Var), j6, i10);
    }

    public void onCaptureCompleted(y1 y1Var, InterfaceC3093x interfaceC3093x) {
        CaptureResult captureResultMo7429n = interfaceC3093x.mo7429n();
        y0.m11051a("CaptureResult in cameraCaptureResult is not a TotalCaptureResult", captureResultMo7429n instanceof TotalCaptureResult);
        this.mCallback.onCaptureCompleted(getImplRequest(y1Var), (TotalCaptureResult) captureResultMo7429n);
    }

    public void onCaptureFailed(y1 y1Var, C3088s c3088s) {
        c3088s.getClass();
        y0.m11051a("CameraCaptureFailure does not contain CaptureFailure.", Objects.nonNull(null));
        this.mCallback.onCaptureFailed(getImplRequest(y1Var), (CaptureFailure) null);
    }

    public void onCaptureProgressed(y1 y1Var, InterfaceC3093x interfaceC3093x) {
        CaptureResult captureResultMo7429n = interfaceC3093x.mo7429n();
        y0.m11051a("Cannot get CaptureResult from the cameraCaptureResult ", captureResultMo7429n != null);
        this.mCallback.onCaptureProgressed(getImplRequest(y1Var), captureResultMo7429n);
    }

    public void onCaptureSequenceAborted(int i10) {
        this.mCallback.onCaptureSequenceAborted(i10);
    }

    public void onCaptureSequenceCompleted(int i10, long j6) {
        this.mCallback.onCaptureSequenceCompleted(i10, j6);
    }

    public void onCaptureStarted(y1 y1Var, long j6, long j10) {
        this.mCallback.onCaptureStarted(getImplRequest(y1Var), j6, j10);
    }
}
