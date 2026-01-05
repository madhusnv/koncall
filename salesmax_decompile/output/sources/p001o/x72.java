package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class x72 {

    /* renamed from: a */
    public final InterfaceC18068a f53289a;

    /* renamed from: o.x72$a */
    public interface InterfaceC18068a {
        /* renamed from: a */
        CameraCaptureSession mo40238a();

        /* renamed from: b */
        int mo38528b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        /* renamed from: c */
        int mo38529c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* renamed from: o.x72$b */
    public static final class C18069b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final CameraCaptureSession.CaptureCallback f53290a;

        /* renamed from: b */
        public final Executor f53291b;

        public C18069b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f53291b = executor;
            this.f53290a = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m55771h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            di0.m23158a(this.f53290a, cameraCaptureSession, captureRequest, surface, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m55772i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f53290a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m55773j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f53290a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m55774k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f53290a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m55775l(CameraCaptureSession cameraCaptureSession, int i) {
            this.f53290a.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m55776m(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f53290a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m55777n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f53290a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
            this.f53291b.execute(new Runnable() { // from class: o.z72
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56619a.m55771h(cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f53291b.execute(new Runnable() { // from class: o.c82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17492a.m55772i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f53291b.execute(new Runnable() { // from class: o.e82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21154a.m55773j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f53291b.execute(new Runnable() { // from class: o.b82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15661a.m55774k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
            this.f53291b.execute(new Runnable() { // from class: o.y72
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55008a.m55775l(cameraCaptureSession, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.f53291b.execute(new Runnable() { // from class: o.a82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14271a.m55776m(cameraCaptureSession, i, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
            this.f53291b.execute(new Runnable() { // from class: o.d82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19249a.m55777n(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    /* renamed from: o.x72$c */
    public static final class C18070c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f53292a;

        /* renamed from: b */
        public final Executor f53293b;

        public C18070c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f53293b = executor;
            this.f53292a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m55785h(CameraCaptureSession cameraCaptureSession) {
            this.f53292a.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m55786i(CameraCaptureSession cameraCaptureSession) {
            fi0.m26710a(this.f53292a, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m55787j(CameraCaptureSession cameraCaptureSession) {
            this.f53292a.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m55788k(CameraCaptureSession cameraCaptureSession) {
            this.f53292a.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m55789l(CameraCaptureSession cameraCaptureSession) {
            this.f53292a.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m55790m(CameraCaptureSession cameraCaptureSession) {
            this.f53292a.onReady(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m55791n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            ci0.m21292a(this.f53292a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f53293b.execute(new Runnable() { // from class: o.i82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28213a.m55785h(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f53293b.execute(new Runnable() { // from class: o.h82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26390a.m55786i(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f53293b.execute(new Runnable() { // from class: o.g82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24706a.m55787j(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f53293b.execute(new Runnable() { // from class: o.j82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29947a.m55788k(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f53293b.execute(new Runnable() { // from class: o.f82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22939a.m55789l(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f53293b.execute(new Runnable() { // from class: o.k82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31611a.m55790m(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f53293b.execute(new Runnable() { // from class: o.l82
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33428a.m55791n(cameraCaptureSession, surface);
                }
            });
        }
    }

    public x72(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f53289a = new m82(cameraCaptureSession);
        } else {
            this.f53289a = n82.m40237d(cameraCaptureSession, handler);
        }
    }

    /* renamed from: d */
    public static x72 m55760d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new x72(cameraCaptureSession, handler);
    }

    /* renamed from: a */
    public int m55761a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f53289a.mo38528b(list, executor, captureCallback);
    }

    /* renamed from: b */
    public int m55762b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f53289a.mo38529c(captureRequest, executor, captureCallback);
    }

    /* renamed from: c */
    public CameraCaptureSession m55763c() {
        return this.f53289a.mo40238a();
    }
}
