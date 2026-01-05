package p021w;

import a1.RunnableC0025x;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.e */
/* loaded from: classes.dex */
public final class C7839e extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    public final CameraCaptureSession.StateCallback f37604a;

    /* renamed from: b */
    public final Executor f37605b;

    public C7839e(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f37605b = executor;
        this.f37604a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f37605b.execute(new RunnableC7838d(this, cameraCaptureSession, 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f37605b.execute(new RunnableC7838d(this, cameraCaptureSession, 2));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f37605b.execute(new RunnableC7838d(this, cameraCaptureSession, 1));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f37605b.execute(new RunnableC7838d(this, cameraCaptureSession, 5));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f37605b.execute(new RunnableC7838d(this, cameraCaptureSession, 3));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f37605b.execute(new RunnableC7838d(this, cameraCaptureSession, 4));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f37605b.execute(new RunnableC0025x(24, this, cameraCaptureSession, surface));
    }
}
