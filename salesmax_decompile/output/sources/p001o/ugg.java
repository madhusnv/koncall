package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public interface ugg {

    /* renamed from: o.ugg$a */
    public interface InterfaceC17375a {
        /* renamed from: b */
        Executor mo17114b();

        /* renamed from: h */
        zfa mo17120h(List list, long j);

        /* renamed from: i */
        dhf mo17121i(int i, List list, AbstractC17377c abstractC17377c);

        /* renamed from: k */
        zfa mo17123k(CameraDevice cameraDevice, dhf dhfVar, List list);

        boolean stop();
    }

    /* renamed from: o.ugg$b */
    public static class C17376b {

        /* renamed from: a */
        public final Executor f48912a;

        /* renamed from: b */
        public final ScheduledExecutorService f48913b;

        /* renamed from: c */
        public final Handler f48914c;

        /* renamed from: d */
        public final fe2 f48915d;

        /* renamed from: e */
        public final l5e f48916e;

        /* renamed from: f */
        public final l5e f48917f;

        public C17376b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, fe2 fe2Var, l5e l5eVar, l5e l5eVar2) {
            this.f48912a = executor;
            this.f48913b = scheduledExecutorService;
            this.f48914c = handler;
            this.f48915d = fe2Var;
            this.f48916e = l5eVar;
            this.f48917f = l5eVar2;
        }

        /* renamed from: a */
        public InterfaceC17375a m51569a() {
            return new ehg(this.f48916e, this.f48917f, this.f48915d, this.f48912a, this.f48913b, this.f48914c);
        }
    }

    /* renamed from: o.ugg$c */
    public static abstract class AbstractC17377c {
        /* renamed from: o */
        public void mo17126o(ugg uggVar) {
        }

        /* renamed from: p */
        public void mo17127p(ugg uggVar) {
        }

        /* renamed from: q */
        public void mo17128q(ugg uggVar) {
        }

        /* renamed from: r */
        public abstract void mo17129r(ugg uggVar);

        /* renamed from: s */
        public abstract void mo17130s(ugg uggVar);

        /* renamed from: t */
        public abstract void mo17131t(ugg uggVar);

        /* renamed from: u */
        public abstract void mo17132u(ugg uggVar);

        /* renamed from: v */
        public void mo17133v(ugg uggVar, Surface surface) {
        }
    }

    /* renamed from: a */
    void mo17113a();

    /* renamed from: c */
    AbstractC17377c mo17115c();

    void close();

    /* renamed from: d */
    void mo17116d(int i);

    /* renamed from: e */
    void mo17117e();

    /* renamed from: f */
    CameraDevice mo17118f();

    /* renamed from: g */
    int mo17119g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: j */
    int mo17122j(List list, CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: l */
    x72 mo17124l();

    /* renamed from: m */
    void mo17125m();

    /* renamed from: n */
    zfa mo25085n();
}
