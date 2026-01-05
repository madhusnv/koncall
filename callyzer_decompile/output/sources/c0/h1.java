package c0;

import android.hardware.camera2.CaptureRequest;
import i0.v2;
import i0.w2;
import i0.y2;
import java.util.UUID;
import m0.InterfaceC4617k;
import p019u.C7286a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 implements v2, b0 {

    /* renamed from: a */
    public final /* synthetic */ int f5105a;

    /* renamed from: b */
    public final i0.j1 f5106b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(int i10) {
        this(i0.j1.m7349b());
        this.f5105a = i10;
        switch (i10) {
            case 1:
                this.f5106b = i0.j1.m7349b();
                break;
            default:
                break;
        }
    }

    @Override // c0.b0
    /* renamed from: a */
    public final i0.i1 mo1513a() {
        switch (this.f5105a) {
            case 0:
                return this.f5106b;
            default:
                throw null;
        }
    }

    @Override // i0.v2
    /* renamed from: b */
    public w2 mo1514b() {
        return new i0.r1(i0.o1.m7399a(this.f5106b));
    }

    /* renamed from: c */
    public void m2202c(CaptureRequest.Key key, Object obj, i0.r0 r0Var) {
        this.f5106b.m7351m(C7286a.g0(key), r0Var, obj);
    }

    public h1(i0.j1 j1Var) {
        Object objMo7406k;
        this.f5105a = 0;
        this.f5106b = j1Var;
        Object objMo7406k2 = null;
        try {
            objMo7406k = j1Var.mo7406k(InterfaceC4617k.N0);
        } catch (IllegalArgumentException unused) {
            objMo7406k = null;
        }
        Class cls = (Class) objMo7406k;
        if (cls != null && !cls.equals(k1.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        this.f5106b.m7352n(w2.C0, y2.PREVIEW);
        i0.j1 j1Var2 = this.f5106b;
        j1Var2.m7352n(InterfaceC4617k.N0, k1.class);
        try {
            objMo7406k2 = j1Var2.mo7406k(InterfaceC4617k.M0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objMo7406k2 == null) {
            this.f5106b.m7352n(InterfaceC4617k.M0, k1.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
        Object objMo7406k3 = -1;
        try {
            objMo7406k3 = j1Var.mo7406k(i0.b1.f44335k0);
        } catch (IllegalArgumentException unused3) {
        }
        if (((Integer) objMo7406k3).intValue() == -1) {
            j1Var.m7352n(i0.b1.f44335k0, 2);
        }
    }
}
