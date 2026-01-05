package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class i72 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: b */
    public InterfaceC14202a f28174b = null;

    /* renamed from: a */
    public final Map f28173a = new HashMap();

    /* renamed from: o.i72$a */
    public interface InterfaceC14202a {
        /* renamed from: a */
        void mo16941a(CameraCaptureSession cameraCaptureSession, int i, boolean z);
    }

    /* renamed from: a */
    public void m31619a(CaptureRequest captureRequest, List list) {
        List list2 = (List) this.f28173a.get(captureRequest);
        if (list2 == null) {
            this.f28173a.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f28173a.put(captureRequest, arrayList);
    }

    /* renamed from: b */
    public final List m31620b(CaptureRequest captureRequest) {
        List list = (List) this.f28173a.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: c */
    public void m31621c(InterfaceC14202a interfaceC14202a) {
        this.f28174b = interfaceC14202a;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        Iterator it = m31620b(captureRequest).iterator();
        while (it.hasNext()) {
            di0.m23158a((CameraCaptureSession.CaptureCallback) it.next(), cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator it = m31620b(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator it = m31620b(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator it = m31620b(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        Iterator it = this.f28173a.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        InterfaceC14202a interfaceC14202a = this.f28174b;
        if (interfaceC14202a != null) {
            interfaceC14202a.mo16941a(cameraCaptureSession, i, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        Iterator it = this.f28173a.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        InterfaceC14202a interfaceC14202a = this.f28174b;
        if (interfaceC14202a != null) {
            interfaceC14202a.mo16941a(cameraCaptureSession, i, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        Iterator it = m31620b(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
