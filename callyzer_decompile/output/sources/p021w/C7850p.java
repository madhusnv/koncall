package p021w;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;
import p020v.RunnableC7606p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.p */
/* loaded from: classes.dex */
public final class C7850p extends CameraManager.AvailabilityCallback {

    /* renamed from: a */
    public final Executor f37620a;

    /* renamed from: b */
    public final CameraManager.AvailabilityCallback f37621b;

    /* renamed from: c */
    public final Object f37622c = new Object();

    /* renamed from: d */
    public boolean f37623d = false;

    public C7850p(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f37620a = executor;
        this.f37621b = availabilityCallback;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f37622c) {
            try {
                if (!this.f37623d) {
                    this.f37620a.execute(new RunnableC7606p(4, this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f37622c) {
            try {
                if (!this.f37623d) {
                    this.f37620a.execute(new RunnableC7849o(this, str, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f37622c) {
            try {
                if (!this.f37623d) {
                    this.f37620a.execute(new RunnableC7849o(this, str, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
