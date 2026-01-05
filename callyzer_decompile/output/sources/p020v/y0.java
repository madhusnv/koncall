package p020v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final CaptureRequest f36760a;

    /* renamed from: b */
    public final C7597g f36761b;

    public y0(CaptureRequest forwardedRequest, C7597g c7597g) {
        AbstractC4154l.m8923f(forwardedRequest, "forwardedRequest");
        this.f36760a = forwardedRequest;
        this.f36761b = c7597g;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession session, CaptureRequest request, Surface target, long j6) {
        AbstractC4154l.m8923f(session, "session");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(target, "target");
        this.f36761b.onCaptureBufferLost(session, this.f36760a, target, j6);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        AbstractC4154l.m8923f(session, "session");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(result, "result");
        this.f36761b.onCaptureCompleted(session, this.f36760a, result);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure) {
        AbstractC4154l.m8923f(session, "session");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(failure, "failure");
        this.f36761b.onCaptureFailed(session, this.f36760a, failure);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession session, CaptureRequest request, CaptureResult partialResult) {
        AbstractC4154l.m8923f(session, "session");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(partialResult, "partialResult");
        this.f36761b.onCaptureProgressed(session, this.f36760a, partialResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession session, int i10) {
        AbstractC4154l.m8923f(session, "session");
        this.f36761b.onCaptureSequenceAborted(session, i10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession session, int i10, long j6) {
        AbstractC4154l.m8923f(session, "session");
        this.f36761b.onCaptureSequenceCompleted(session, i10, j6);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long j6, long j10) {
        AbstractC4154l.m8923f(session, "session");
        AbstractC4154l.m8923f(request, "request");
        this.f36761b.onCaptureStarted(session, this.f36760a, j6, j10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession session, CaptureRequest request, long j6, long j10) {
        AbstractC4154l.m8923f(session, "session");
        AbstractC4154l.m8923f(request, "request");
        this.f36761b.onReadoutStarted(session, this.f36760a, j6, j10);
    }
}
