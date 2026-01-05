package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class o82 {

    /* renamed from: o.o82$a */
    public static final class C15730a extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final List f37918a = new ArrayList();

        public C15730a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
                if (!(stateCallback instanceof C15731b)) {
                    this.f37918a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f37918a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f37918a.iterator();
            while (it.hasNext()) {
                fi0.m26710a((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f37918a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f37918a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f37918a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f37918a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            Iterator it = this.f37918a.iterator();
            while (it.hasNext()) {
                ci0.m21292a((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession, surface);
            }
        }
    }

    /* renamed from: o.o82$b */
    public static final class C15731b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }
    }

    /* renamed from: a */
    public static CameraCaptureSession.StateCallback m41757a(List list) {
        return list.isEmpty() ? m41758b() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new C15730a(list);
    }

    /* renamed from: b */
    public static CameraCaptureSession.StateCallback m41758b() {
        return new C15731b();
    }
}
