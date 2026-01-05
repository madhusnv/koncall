package p020v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import c0.h1;
import c6.e0;
import i0.r0;
import p021w.C7843i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.a */
/* loaded from: classes.dex */
public final class C7591a implements l1 {

    /* renamed from: a */
    public final Range f36468a;

    /* renamed from: b */
    public final boolean f36469b;

    public C7591a(C7843i c7843i) {
        this.f36469b = false;
        this.f36468a = (Range) c7843i.m14823a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f36469b = c7843i.m14828f();
    }

    @Override // p020v.l1
    /* renamed from: c */
    public final float mo13922c() {
        return ((Float) this.f36468a.getUpper()).floatValue();
    }

    @Override // p020v.l1
    /* renamed from: e */
    public final float mo13923e() {
        return ((Float) this.f36468a.getLower()).floatValue();
    }

    @Override // p020v.l1
    /* renamed from: h */
    public final void mo13924h(h1 h1Var) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(1.0f);
        r0 r0Var = r0.REQUIRED;
        h1Var.m2202c(key, fValueOf, r0Var);
        if (this.f36469b) {
            e0.m2374u(h1Var, r0Var);
        }
    }

    @Override // p020v.l1
    /* renamed from: o */
    public final void mo13925o() {
    }

    @Override // p020v.l1
    /* renamed from: a */
    public final void mo13921a(TotalCaptureResult totalCaptureResult) {
    }
}
