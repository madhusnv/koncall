package p020v;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import bg.AbstractC0656a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import og.u1;
import og.y0;
import x4.C8299i;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    public final /* synthetic */ int f36537a;

    /* renamed from: b */
    public final Object f36538b;

    public /* synthetic */ f0(int i10, Object obj) {
        this.f36537a = i10;
        this.f36538b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f36537a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36538b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.StateCallback) obj).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                g1 g1Var = (g1) this.f36538b;
                g1Var.m14379j(cameraCaptureSession);
                g1Var.mo14365a(g1Var);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f36537a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36538b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    AbstractC0656a.m1909r((CameraCaptureSession.StateCallback) obj, cameraCaptureSession);
                }
                break;
            case 1:
                g1 g1Var = (g1) this.f36538b;
                g1Var.m14379j(cameraCaptureSession);
                g1Var.mo14366b(g1Var);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f36537a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36538b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.StateCallback) obj).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                g1 g1Var = (g1) this.f36538b;
                g1Var.m14379j(cameraCaptureSession);
                g1Var.mo14367c(g1Var);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C8299i c8299i;
        switch (this.f36537a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36538b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.StateCallback) obj).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((g1) this.f36538b).m14379j(cameraCaptureSession);
                    g1 g1Var = (g1) this.f36538b;
                    g1Var.mo14368d(g1Var);
                    synchronized (((g1) this.f36538b).f36544a) {
                        y0.m11055e(((g1) this.f36538b).f36552i, "OpenCaptureSession completer should not null");
                        g1 g1Var2 = (g1) this.f36538b;
                        c8299i = g1Var2.f36552i;
                        g1Var2.f36552i = null;
                    }
                    c8299i.m15509d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th2) {
                    synchronized (((g1) this.f36538b).f36544a) {
                        y0.m11055e(((g1) this.f36538b).f36552i, "OpenCaptureSession completer should not null");
                        g1 g1Var3 = (g1) this.f36538b;
                        C8299i c8299i2 = g1Var3.f36552i;
                        g1Var3.f36552i = null;
                        c8299i2.m15509d(new IllegalStateException("onConfigureFailed"));
                        throw th2;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C8299i c8299i;
        switch (this.f36537a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36538b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.StateCallback) obj).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((g1) this.f36538b).m14379j(cameraCaptureSession);
                    g1 g1Var = (g1) this.f36538b;
                    g1Var.mo14369e(g1Var);
                    synchronized (((g1) this.f36538b).f36544a) {
                        y0.m11055e(((g1) this.f36538b).f36552i, "OpenCaptureSession completer should not null");
                        g1 g1Var2 = (g1) this.f36538b;
                        c8299i = g1Var2.f36552i;
                        g1Var2.f36552i = null;
                    }
                    c8299i.m15507b(null);
                    return;
                } catch (Throwable th2) {
                    synchronized (((g1) this.f36538b).f36544a) {
                        y0.m11055e(((g1) this.f36538b).f36552i, "OpenCaptureSession completer should not null");
                        g1 g1Var3 = (g1) this.f36538b;
                        C8299i c8299i2 = g1Var3.f36552i;
                        g1Var3.f36552i = null;
                        c8299i2.m15507b(null);
                        throw th2;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    C8849i c8849i = (C8849i) this.f36538b;
                    ImageWriter imageWriterNewInstance = ImageWriter.newInstance(inputSurface, 1);
                    if (((AtomicBoolean) c8849i.f42584c).get()) {
                        if (((ImageWriter) c8849i.f42583b) != null) {
                            u1.m10951j("ZslControlImpl");
                            ((ImageWriter) c8849i.f42583b).close();
                        }
                        c8849i.f42583b = imageWriterNewInstance;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f36537a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36538b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.StateCallback) obj).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                g1 g1Var = (g1) this.f36538b;
                g1Var.m14379j(cameraCaptureSession);
                g1Var.mo14370f(g1Var);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f36537a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36538b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.StateCallback) obj).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                g1 g1Var = (g1) this.f36538b;
                g1Var.m14379j(cameraCaptureSession);
                g1Var.mo14372h(g1Var, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public f0(List list) {
        this.f36537a = 0;
        this.f36538b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof g0)) {
                ((ArrayList) this.f36538b).add(stateCallback);
            }
        }
    }

    /* renamed from: a */
    private final void m14374a(CameraCaptureSession cameraCaptureSession) {
    }
}
