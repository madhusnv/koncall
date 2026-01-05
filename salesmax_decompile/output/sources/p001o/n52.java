package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class n52 {

    /* renamed from: o.n52$a */
    public static final class C15503a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final List f36396a = new ArrayList();

        public C15503a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
                if (!(captureCallback instanceof C15504b)) {
                    this.f36396a.add(captureCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            Iterator it = this.f36396a.iterator();
            while (it.hasNext()) {
                di0.m23158a((CameraCaptureSession.CaptureCallback) it.next(), cameraCaptureSession, captureRequest, surface, j);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            Iterator it = this.f36396a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Iterator it = this.f36396a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            Iterator it = this.f36396a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            Iterator it = this.f36396a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            Iterator it = this.f36396a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            Iterator it = this.f36396a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            }
        }
    }

    /* renamed from: o.n52$b */
    public static final class C15504b extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        }
    }

    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m40112a(List list) {
        return new C15503a(list);
    }

    /* renamed from: b */
    public static CameraCaptureSession.CaptureCallback m40113b(CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return m40112a(Arrays.asList(captureCallbackArr));
    }

    /* renamed from: c */
    public static CameraCaptureSession.CaptureCallback m40114c() {
        return new C15504b();
    }
}
