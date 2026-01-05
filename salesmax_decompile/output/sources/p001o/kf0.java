package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import p001o.d72;
import p001o.g32;
import p001o.gfj;
import p001o.mq3;

/* loaded from: classes2.dex */
public final class kf0 implements gfj.InterfaceC13704b {

    /* renamed from: a */
    public final s82 f32123a;

    /* renamed from: b */
    public final Range f32124b;

    /* renamed from: d */
    public g32.C13614a f32126d;

    /* renamed from: f */
    public boolean f32128f;

    /* renamed from: c */
    public float f32125c = 1.0f;

    /* renamed from: e */
    public float f32127e = 1.0f;

    public kf0(s82 s82Var) {
        this.f32128f = false;
        this.f32123a = s82Var;
        this.f32124b = (Range) s82Var.m47965a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f32128f = s82Var.m47968d();
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: a */
    public void mo28562a(TotalCaptureResult totalCaptureResult) {
        if (this.f32126d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.f32127e == f.floatValue()) {
                this.f32126d.m28005c(null);
                this.f32126d = null;
            }
        }
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: b */
    public float mo28563b() {
        return ((Float) this.f32124b.getLower()).floatValue();
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: c */
    public void mo28564c() {
        this.f32125c = 1.0f;
        g32.C13614a c13614a = this.f32126d;
        if (c13614a != null) {
            c13614a.m28008f(new y82("Camera is not active."));
            this.f32126d = null;
        }
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: d */
    public float mo28565d() {
        return ((Float) this.f32124b.getUpper()).floatValue();
    }

    @Override // p001o.gfj.InterfaceC13704b
    /* renamed from: e */
    public void mo28566e(d72.C12801a c12801a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f32125c);
        mq3.EnumC15404c enumC15404c = mq3.EnumC15404c.REQUIRED;
        c12801a.m22396g(key, fValueOf, enumC15404c);
        if (this.f32128f) {
            td2.m49751a(c12801a, enumC15404c);
        }
    }
}
