package p021w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import og.u1;
import p022x.C8237g;
import p022x.C8238h;
import p022x.C8249s;
import p022x.InterfaceC8248r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.k */
/* loaded from: classes.dex */
public class C7845k extends AbstractC7848n {
    /* renamed from: e */
    public void mo14829e(C8249s c8249s) throws CameraAccessException, CameraAccessExceptionCompat {
        CameraDevice cameraDevice = (CameraDevice) this.f37615a;
        cameraDevice.getClass();
        InterfaceC8248r interfaceC8248r = c8249s.f39395a;
        interfaceC8248r.mo15425e().getClass();
        List listMo15426f = interfaceC8248r.mo15426f();
        if (listMo15426f == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (interfaceC8248r.mo15423c() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        cameraDevice.getId();
        Iterator it = listMo15426f.iterator();
        while (it.hasNext()) {
            String strMo15414d = ((C8238h) it.next()).f39377a.mo15414d();
            if (strMo15414d != null && !strMo15414d.isEmpty()) {
                u1.m10951j("CameraDeviceCompat");
            }
        }
        C7839e c7839e = new C7839e(interfaceC8248r.mo15423c(), interfaceC8248r.mo15425e());
        List listMo15426f2 = interfaceC8248r.mo15426f();
        C7847m c7847m = (C7847m) this.f37616b;
        c7847m.getClass();
        Handler handler = c7847m.f37614a;
        C8237g c8237gMo15422b = interfaceC8248r.mo15422b();
        try {
            if (c8237gMo15422b != null) {
                InputConfiguration inputConfiguration = c8237gMo15422b.f39376a.f39375a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C8249s.m15429a(listMo15426f2), c7839e, handler);
            } else {
                if (interfaceC8248r.mo15424d() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(C8249s.m15429a(listMo15426f2), c7839e, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(listMo15426f2.size());
                Iterator it2 = listMo15426f2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C8238h) it2.next()).f39377a.m15415e());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, c7839e, handler);
            }
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        }
    }
}
