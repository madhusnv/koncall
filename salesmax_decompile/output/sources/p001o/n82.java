package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import p001o.x72;

/* loaded from: classes2.dex */
public class n82 implements x72.InterfaceC18068a {

    /* renamed from: a */
    public final CameraCaptureSession f36547a;

    /* renamed from: b */
    public final Object f36548b;

    /* renamed from: o.n82$a */
    public static class C15527a {

        /* renamed from: a */
        public final Handler f36549a;

        public C15527a(Handler handler) {
            this.f36549a = handler;
        }
    }

    public n82(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f36547a = (CameraCaptureSession) fgd.m26663g(cameraCaptureSession);
        this.f36548b = obj;
    }

    /* renamed from: d */
    public static x72.InterfaceC18068a m40237d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new n82(cameraCaptureSession, new C15527a(handler));
    }

    @Override // p001o.x72.InterfaceC18068a
    /* renamed from: a */
    public CameraCaptureSession mo40238a() {
        return this.f36547a;
    }

    @Override // p001o.x72.InterfaceC18068a
    /* renamed from: b */
    public int mo38528b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f36547a.captureBurst(list, new x72.C18069b(executor, captureCallback), ((C15527a) this.f36548b).f36549a);
    }

    @Override // p001o.x72.InterfaceC18068a
    /* renamed from: c */
    public int mo38529c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f36547a.setRepeatingRequest(captureRequest, new x72.C18069b(executor, captureCallback), ((C15527a) this.f36548b).f36549a);
    }
}
