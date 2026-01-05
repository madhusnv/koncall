package p020v;

import a1.d0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import com.amplifyframework.storage.s3.transfer.RunnableC1255b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k0.ExecutorC3900j;
import pg.i7;
import qi.RunnableC6224g;
import x4.C8299i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.g */
/* loaded from: classes.dex */
public final class C7597g extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final /* synthetic */ int f36541a;

    /* renamed from: b */
    public final Object f36542b;

    /* renamed from: c */
    public Object f36543c;

    public C7597g(int i10) {
        this.f36541a = i10;
        switch (i10) {
            case 3:
                this.f36542b = i7.m11697b(new b0(13, this));
                break;
            default:
                this.f36543c = null;
                this.f36542b = new HashMap();
                break;
        }
    }

    /* renamed from: a */
    public void m14375a(CaptureRequest captureRequest, List list) {
        HashMap map = (HashMap) this.f36542b;
        List list2 = (List) map.get(captureRequest);
        if (list2 == null) {
            map.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        map.put(captureRequest, arrayList);
    }

    /* renamed from: b */
    public void m14376b() {
        C8299i c8299i = (C8299i) this.f36543c;
        if (c8299i != null) {
            c8299i.m15507b(null);
            this.f36543c = null;
        }
    }

    /* renamed from: c */
    public List m14377c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.f36542b).get(captureRequest);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j6) {
        switch (this.f36541a) {
            case 1:
                Iterator it = m14377c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j6);
                }
                break;
            case 2:
                ((ExecutorC3900j) this.f36543c).execute(new Runnable() { // from class: w.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.f37596a.f36542b).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j6);
                    }
                });
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j6);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f36541a) {
            case 0:
                ((ExecutorC3900j) this.f36543c).execute(new RunnableC6224g(10, this, totalCaptureResult));
                break;
            case 1:
                Iterator it = m14377c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                break;
            case 2:
                ((ExecutorC3900j) this.f36543c).execute(new d0(this, cameraCaptureSession, captureRequest, totalCaptureResult, 4));
                break;
            default:
                m14376b();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f36541a) {
            case 1:
                Iterator it = m14377c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 2:
                ((ExecutorC3900j) this.f36543c).execute(new d0(this, cameraCaptureSession, captureRequest, captureFailure, 6));
                break;
            case 3:
                m14376b();
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f36541a) {
            case 1:
                Iterator it = m14377c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            case 2:
                ((ExecutorC3900j) this.f36543c).execute(new d0(this, cameraCaptureSession, captureRequest, captureResult, 5));
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        switch (this.f36541a) {
            case 1:
                Iterator it = ((HashMap) this.f36542b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i10);
                    }
                }
                l0 l0Var = (l0) this.f36543c;
                if (l0Var != null) {
                    l0Var.m14404a();
                    break;
                }
                break;
            case 2:
                ((ExecutorC3900j) this.f36543c).execute(new RunnableC1255b(this, cameraCaptureSession, i10, 6));
                break;
            case 3:
                m14376b();
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j6) {
        switch (this.f36541a) {
            case 1:
                Iterator it = ((HashMap) this.f36542b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i10, j6);
                    }
                }
                l0 l0Var = (l0) this.f36543c;
                if (l0Var != null) {
                    l0Var.m14404a();
                    break;
                }
                break;
            case 2:
                ((ExecutorC3900j) this.f36543c).execute(new Runnable() { // from class: w.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.f37592a.f36542b).onCaptureSequenceCompleted(cameraCaptureSession, i10, j6);
                    }
                });
                break;
            case 3:
                m14376b();
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i10, j6);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j6, final long j10) {
        switch (this.f36541a) {
            case 1:
                Iterator it = m14377c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                }
                break;
            case 2:
                ((ExecutorC3900j) this.f36543c).execute(new Runnable() { // from class: w.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.f37587a.f36542b).onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                    }
                });
                break;
            case 3:
                m14376b();
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                break;
        }
    }

    public C7597g(ExecutorC3900j executorC3900j, CameraCaptureSession.CaptureCallback captureCallback) {
        this.f36541a = 2;
        this.f36543c = executorC3900j;
        this.f36542b = captureCallback;
    }

    public C7597g(ExecutorC3900j executorC3900j) {
        this.f36541a = 0;
        this.f36542b = new HashSet();
        this.f36543c = executorC3900j;
    }
}
