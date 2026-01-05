package p001o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* loaded from: classes2.dex */
public class j92 extends i92 {
    public j92(CameraDevice cameraDevice) {
        super((CameraDevice) fgd.m26663g(cameraDevice), null);
    }

    @Override // p001o.i92, p001o.c92.InterfaceC12590a
    /* renamed from: a */
    public void mo20498a(dhf dhfVar) throws h72, CameraAccessException {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) dhfVar.m23145j();
        fgd.m26663g(sessionConfiguration);
        try {
            this.f31656a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw h72.m29867e(e);
        }
    }
}
