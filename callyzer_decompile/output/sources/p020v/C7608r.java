package p020v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.r */
/* loaded from: classes.dex */
public final class C7608r extends CameraManager.AvailabilityCallback {

    /* renamed from: a */
    public final String f36677a;

    /* renamed from: b */
    public boolean f36678b = true;

    /* renamed from: c */
    public final /* synthetic */ C7612v f36679c;

    public C7608r(C7612v c7612v, String str) {
        this.f36679c = c7612v;
        this.f36677a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) throws CameraAccessException {
        if (this.f36677a.equals(str)) {
            this.f36678b = true;
            if (this.f36679c.f36723e == EnumC7610t.PENDING_OPEN || this.f36679c.f36723e == EnumC7610t.OPENING_WITH_ERROR) {
                this.f36679c.m14447L(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.f36677a.equals(str)) {
            this.f36678b = false;
        }
    }
}
