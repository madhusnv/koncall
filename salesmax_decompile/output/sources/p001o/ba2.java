package p001o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class ba2 extends aa2 {
    public ba2(Context context) {
        super(context);
    }

    @Override // p001o.aa2, p001o.da2, p001o.z92.InterfaceC18583b
    /* renamed from: b */
    public CameraCharacteristics mo16712b(String str) throws h72 {
        try {
            return this.f19451a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw h72.m29867e(e);
        }
    }

    @Override // p001o.aa2, p001o.da2, p001o.z92.InterfaceC18583b
    /* renamed from: d */
    public void mo16713d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws h72, CameraAccessException {
        try {
            this.f19451a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw h72.m29867e(e);
        }
    }
}
