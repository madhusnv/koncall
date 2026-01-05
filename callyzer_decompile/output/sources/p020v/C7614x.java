package p020v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import i0.AbstractC3084o;
import i0.C3088s;
import i0.EnumC3087r;
import i0.g2;
import i0.q0;
import i0.r2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import og.u1;
import og.y0;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.x */
/* loaded from: classes.dex */
public final class C7614x extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final /* synthetic */ int f36751a;

    /* renamed from: b */
    public final Object f36752b;

    public C7614x(AbstractC3084o abstractC3084o) {
        this.f36751a = 1;
        if (abstractC3084o == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f36752b = abstractC3084o;
    }

    /* renamed from: a */
    public static int m14458a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof r2) && (num = (Integer) ((r2) captureRequest.getTag()).f16577a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j6) {
        switch (this.f36751a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36752b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((CameraCaptureSession.CaptureCallback) arrayList.get(i10)).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j6);
                }
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j6);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        r2 r2Var;
        switch (this.f36751a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36752b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 1:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    y0.m11051a("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof r2);
                    r2Var = (r2) tag;
                } else {
                    r2Var = r2.f16576b;
                }
                ((AbstractC3084o) this.f36752b).mo83b(m14458a(captureRequest), new C8849i(19, r2Var, totalCaptureResult));
                return;
            default:
                synchronized (((o0) this.f36752b).f36644a) {
                    try {
                        g2 g2Var = ((o0) this.f36752b).f36649f;
                        if (g2Var == null) {
                            return;
                        }
                        q0 q0Var = g2Var.f16473g;
                        u1.m10942a("CaptureSession");
                        o0 o0Var = (o0) this.f36752b;
                        o0Var.f36658o.getClass();
                        o0Var.m14415j(Collections.singletonList(eb.q0.m5734c(q0Var)));
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f36751a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36752b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 1:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                EnumC3087r enumC3087r = EnumC3087r.ERROR;
                ((AbstractC3084o) this.f36752b).mo84c(m14458a(captureRequest), new C3088s());
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f36751a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36752b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        switch (this.f36751a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36752b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureSequenceAborted(cameraCaptureSession, i10);
                }
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j6) {
        switch (this.f36751a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36752b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureSequenceCompleted(cameraCaptureSession, i10, j6);
                }
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i10, j6);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j6, long j10) {
        switch (this.f36751a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36752b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                }
                break;
            case 1:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                ((AbstractC3084o) this.f36752b).mo2192d(m14458a(captureRequest));
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                break;
        }
    }

    public C7614x(List list) {
        this.f36751a = 0;
        this.f36752b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof C7615y)) {
                ((ArrayList) this.f36752b).add(captureCallback);
            }
        }
    }

    public C7614x(o0 o0Var) {
        this.f36751a = 2;
        this.f36752b = o0Var;
    }
}
