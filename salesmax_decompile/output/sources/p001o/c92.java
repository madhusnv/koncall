package p001o;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class c92 {

    /* renamed from: a */
    public final InterfaceC12590a f17521a;

    /* renamed from: o.c92$a */
    public interface InterfaceC12590a {
        /* renamed from: a */
        void mo20498a(dhf dhfVar);
    }

    /* renamed from: o.c92$b */
    public static final class C12591b extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final CameraDevice.StateCallback f17522a;

        /* renamed from: b */
        public final Executor f17523b;

        public C12591b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f17523b = executor;
            this.f17522a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m20503e(CameraDevice cameraDevice) {
            this.f17522a.onClosed(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m20504f(CameraDevice cameraDevice) {
            this.f17522a.onDisconnected(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m20505g(CameraDevice cameraDevice, int i) {
            this.f17522a.onError(cameraDevice, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m20506h(CameraDevice cameraDevice) {
            this.f17522a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f17523b.execute(new Runnable() { // from class: o.d92
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19397a.m20503e(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f17523b.execute(new Runnable() { // from class: o.e92
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21176a.m20504f(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.f17523b.execute(new Runnable() { // from class: o.g92
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24748a.m20505g(cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f17523b.execute(new Runnable() { // from class: o.f92
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22976a.m20506h(cameraDevice);
                }
            });
        }
    }

    public c92(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17521a = new j92(cameraDevice);
        } else {
            this.f17521a = i92.m31761e(cameraDevice, handler);
        }
    }

    /* renamed from: b */
    public static c92 m20496b(CameraDevice cameraDevice, Handler handler) {
        return new c92(cameraDevice, handler);
    }

    /* renamed from: a */
    public void m20497a(dhf dhfVar) {
        this.f17521a.mo20498a(dhfVar);
    }
}
