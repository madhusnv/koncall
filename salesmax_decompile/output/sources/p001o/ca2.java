package p001o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* loaded from: classes2.dex */
public class ca2 extends ba2 {
    public ca2(Context context) {
        super(context);
    }

    @Override // p001o.da2, p001o.z92.InterfaceC18583b
    /* renamed from: c */
    public Set mo20544c() throws h72 {
        try {
            return this.f19451a.getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw h72.m29867e(e);
        }
    }
}
