package p001o;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import p001o.d72;
import p001o.g32;
import p001o.gfj;
import p001o.mq3;

/* loaded from: classes2.dex */
public final class uc4 implements gfj.InterfaceC13704b {

    /* renamed from: a */
    public final s82 f48706a;

    /* renamed from: c */
    public g32.C13614a f48708c;

    /* renamed from: b */
    public Rect f48707b = null;

    /* renamed from: d */
    public Rect f48709d = null;

    public uc4(s82 s82Var) {
        this.f48706a = s82Var;
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: a */
    public void mo28562a(TotalCaptureResult totalCaptureResult) {
        if (this.f48708c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f48709d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f48708c.m28005c(null);
            this.f48708c = null;
            this.f48709d = null;
        }
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: b */
    public float mo28563b() {
        return 1.0f;
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: c */
    public void mo28564c() {
        this.f48709d = null;
        this.f48707b = null;
        g32.C13614a c13614a = this.f48708c;
        if (c13614a != null) {
            c13614a.m28008f(new y82("Camera is not active."));
            this.f48708c = null;
        }
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: d */
    public float mo28565d() {
        Float f = (Float) this.f48706a.m47965a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue() < mo28563b() ? mo28563b() : f.floatValue();
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: e */
    public void mo28566e(d72.C12801a c12801a) {
        Rect rect = this.f48707b;
        if (rect != null) {
            c12801a.m22396g(CaptureRequest.SCALER_CROP_REGION, rect, mq3.EnumC15404c.REQUIRED);
        }
    }
}
