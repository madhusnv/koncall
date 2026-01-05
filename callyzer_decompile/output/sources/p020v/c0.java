package p020v;

import android.hardware.camera2.CameraManager;
import c0.d1;
import kotlin.jvm.internal.AbstractC4154l;
import l0.C4305e;
import pg.i7;
import x4.C8302l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends CameraManager.AvailabilityCallback {

    /* renamed from: a */
    public final /* synthetic */ d1 f36489a;

    public c0(d1 d1Var) {
        this.f36489a = d1Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        i7.m11697b(new C4305e((C8302l) this.f36489a.m2186f(), 1));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String cameraId) {
        AbstractC4154l.m8923f(cameraId, "cameraId");
        i7.m11697b(new C4305e((C8302l) this.f36489a.m2186f(), 1));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String cameraId) {
        AbstractC4154l.m8923f(cameraId, "cameraId");
        i7.m11697b(new C4305e((C8302l) this.f36489a.m2186f(), 1));
    }
}
