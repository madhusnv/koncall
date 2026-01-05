package p001o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import p001o.k92;
import p001o.x72;

/* loaded from: classes2.dex */
public class i92 extends h92 {
    public i92(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* renamed from: e */
    public static i92 m31761e(CameraDevice cameraDevice, Handler handler) {
        return new i92(cameraDevice, new k92.C14738a(handler));
    }

    @Override // p001o.c92.InterfaceC12590a
    /* renamed from: a */
    public void mo20498a(dhf dhfVar) throws h72, CameraAccessException {
        k92.m35183c(this.f31656a, dhfVar);
        x72.C18070c c18070c = new x72.C18070c(dhfVar.m23138a(), dhfVar.m23142e());
        List listM23140c = dhfVar.m23140c();
        Handler handler = ((k92.C14738a) fgd.m26663g((k92.C14738a) this.f31657b)).f31658a;
        ej8 ej8VarM23139b = dhfVar.m23139b();
        try {
            if (ej8VarM23139b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) ej8VarM23139b.m25131a();
                fgd.m26663g(inputConfiguration);
                this.f31656a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, dhf.m23136h(listM23140c), c18070c, handler);
            } else if (dhfVar.m23141d() == 1) {
                this.f31656a.createConstrainedHighSpeedCaptureSession(k92.m35184d(listM23140c), c18070c, handler);
            } else {
                this.f31656a.createCaptureSessionByOutputConfigurations(dhf.m23136h(listM23140c), c18070c, handler);
            }
        } catch (CameraAccessException e) {
            throw h72.m29867e(e);
        }
    }
}
