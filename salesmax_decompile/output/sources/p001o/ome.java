package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import p001o.g32;

/* loaded from: classes2.dex */
public class ome {

    /* renamed from: a */
    public final boolean f38598a;

    /* renamed from: b */
    public final List f38599b = Collections.synchronizedList(new ArrayList());

    /* renamed from: o.ome$a */
    public static class C15842a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final zfa f38600a = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.nme
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f37047a.m42449c(c13614a);
            }
        });

        /* renamed from: b */
        public g32.C13614a f38601b;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Object m42449c(g32.C13614a c13614a) {
            this.f38601b = c13614a;
            return "RequestCompleteListener[" + this + "]";
        }

        /* renamed from: b */
        public final void m42450b() {
            g32.C13614a c13614a = this.f38601b;
            if (c13614a != null) {
                c13614a.m28005c(null);
                this.f38601b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m42450b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            m42450b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            m42450b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            m42450b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            m42450b();
        }
    }

    public ome(boolean z) {
        this.f38598a = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m42441f(C15842a c15842a, zfa zfaVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("RequestListener ");
        sb.append(c15842a);
        sb.append(" done ");
        sb.append(this);
        this.f38599b.remove(zfaVar);
    }

    /* renamed from: g */
    public static /* synthetic */ Void m42442g(List list) {
        return null;
    }

    /* renamed from: c */
    public final CameraCaptureSession.CaptureCallback m42443c() {
        final C15842a c15842a = new C15842a();
        final zfa zfaVar = c15842a.f38600a;
        this.f38599b.add(zfaVar);
        StringBuilder sb = new StringBuilder();
        sb.append("RequestListener ");
        sb.append(c15842a);
        sb.append(" monitoring ");
        sb.append(this);
        zfaVar.addListener(new Runnable() { // from class: o.lme
            @Override // java.lang.Runnable
            public final void run() {
                this.f34045a.m42441f(c15842a, zfaVar);
            }
        }, gb2.m28293a());
        return c15842a;
    }

    /* renamed from: d */
    public CameraCaptureSession.CaptureCallback m42444d(CameraCaptureSession.CaptureCallback captureCallback) {
        return m42446h() ? n52.m40113b(m42443c(), captureCallback) : captureCallback;
    }

    /* renamed from: e */
    public zfa m42445e() {
        return this.f38599b.isEmpty() ? bn7.m19430p(null) : bn7.m19407B(bn7.m19412G(bn7.m19411F(new ArrayList(this.f38599b)), new zl7() { // from class: o.mme
            @Override // p001o.zl7
            public final Object apply(Object obj) {
                return ome.m42442g((List) obj);
            }
        }, gb2.m28293a()));
    }

    /* renamed from: h */
    public boolean m42446h() {
        return this.f38598a;
    }

    /* renamed from: i */
    public void m42447i() {
        LinkedList linkedList = new LinkedList(this.f38599b);
        while (!linkedList.isEmpty()) {
            zfa zfaVar = (zfa) linkedList.poll();
            Objects.requireNonNull(zfaVar);
            zfaVar.cancel(true);
        }
    }
}
