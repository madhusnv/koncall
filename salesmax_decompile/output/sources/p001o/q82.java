package p001o;

import android.hardware.camera2.CameraCharacteristics;
import p001o.s82;

/* loaded from: classes2.dex */
public class q82 implements s82.InterfaceC16767a {

    /* renamed from: a */
    public final CameraCharacteristics f41450a;

    public q82(CameraCharacteristics cameraCharacteristics) {
        this.f41450a = cameraCharacteristics;
    }

    @Override // p001o.s82.InterfaceC16767a
    /* renamed from: a */
    public Object mo44959a(CameraCharacteristics.Key key) {
        return this.f41450a.get(key);
    }
}
