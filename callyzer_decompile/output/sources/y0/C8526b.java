package y0;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import dg.C1720i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y0.b */
/* loaded from: classes.dex */
public final class C8526b implements InterfaceC8528d {

    /* renamed from: a */
    public final CameraDevice.CameraDeviceSetup f41450a;

    public C8526b(CameraManager cameraManager, String str) {
        this.f41450a = cameraManager.getCameraDeviceSetup(str);
    }

    @Override // y0.InterfaceC8528d
    /* renamed from: a */
    public final C1720i mo15797a(SessionConfiguration sessionConfiguration) throws NumberFormatException {
        int i10 = this.f41450a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
        String property = System.getProperty("ro.build.date.utc");
        if (property != null) {
            try {
                Long.parseLong(property);
            } catch (NumberFormatException unused) {
            }
        }
        return new C1720i(i10, 4);
    }
}
