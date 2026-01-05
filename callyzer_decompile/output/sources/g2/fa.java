package g2;

import c3.C0847b;
import c9.C0925t;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import o3.InterfaceC5278a;
import s4.C6761q;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class fa implements InterfaceC5278a {

    /* renamed from: a */
    public final /* synthetic */ ja f11593a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f11594b;

    /* renamed from: c */
    public final /* synthetic */ k1.x0 f11595c;

    public fa(ja jaVar, InterfaceC2139c interfaceC2139c, k1.x0 x0Var) {
        this.f11593a = jaVar;
        this.f11594b = interfaceC2139c;
        this.f11595c = x0Var;
    }

    @Override // o3.InterfaceC5278a
    /* renamed from: B */
    public final long mo6161B(int i10, long j6) {
        k1.x0 x0Var = k1.x0.Horizontal;
        k1.x0 x0Var2 = this.f11595c;
        float fM2273d = x0Var2 == x0Var ? C0847b.m2273d(j6) : C0847b.m2274e(j6);
        float f6 = DefinitionKt.NO_Float_VALUE;
        if (fM2273d >= DefinitionKt.NO_Float_VALUE || i10 != 1) {
            return 0L;
        }
        C0925t c0925t = this.f11593a.f11872b;
        float fM2688q = c0925t.m2688q(fM2273d);
        k2.a1 a1Var = (k2.a1) c0925t.f5660j;
        float fM8490f = Float.isNaN(a1Var.m8490f()) ? 0.0f : a1Var.m8490f();
        a1Var.m8491g(fM2688q);
        float f10 = fM2688q - fM8490f;
        float f11 = x0Var2 == x0Var ? f10 : 0.0f;
        if (x0Var2 == k1.x0.Vertical) {
            f6 = f10;
        }
        return og.a2.m10524a(f11, f6);
    }

    @Override // o3.InterfaceC5278a
    public final long d0(int i10, long j6, long j10) {
        if (i10 != 1) {
            return 0L;
        }
        C0925t c0925t = this.f11593a.f11872b;
        k1.x0 x0Var = k1.x0.Horizontal;
        k1.x0 x0Var2 = this.f11595c;
        float fM2688q = c0925t.m2688q(x0Var2 == x0Var ? C0847b.m2273d(j10) : C0847b.m2274e(j10));
        k2.a1 a1Var = (k2.a1) c0925t.f5660j;
        boolean zIsNaN = Float.isNaN(a1Var.m8490f());
        float f6 = DefinitionKt.NO_Float_VALUE;
        float fM8490f = zIsNaN ? 0.0f : a1Var.m8490f();
        a1Var.m8491g(fM2688q);
        float f10 = fM2688q - fM8490f;
        float f11 = x0Var2 == x0Var ? f10 : 0.0f;
        if (x0Var2 == k1.x0.Vertical) {
            f6 = f10;
        }
        return og.a2.m10524a(f11, f6);
    }

    @Override // o3.InterfaceC5278a
    /* renamed from: s */
    public final Object mo6162s(long j6, long j10, InterfaceC7559c interfaceC7559c) {
        this.f11594b.invoke(new Float(this.f11595c == k1.x0.Horizontal ? C6761q.m12959b(j10) : C6761q.m12960c(j10)));
        return new C6761q(j10);
    }

    @Override // o3.InterfaceC5278a
    /* renamed from: v */
    public final Object mo6163v(long j6, InterfaceC7559c interfaceC7559c) {
        float fM12959b = this.f11595c == k1.x0.Horizontal ? C6761q.m12959b(j6) : C6761q.m12960c(j6);
        ja jaVar = this.f11593a;
        float fM2689r = jaVar.f11872b.m2689r();
        float fM6890c = jaVar.f11872b.m2679h().m6890c();
        if (fM12959b >= DefinitionKt.NO_Float_VALUE || fM2689r <= fM6890c) {
            j6 = 0;
        } else {
            this.f11594b.invoke(new Float(fM12959b));
        }
        return new C6761q(j6);
    }
}
