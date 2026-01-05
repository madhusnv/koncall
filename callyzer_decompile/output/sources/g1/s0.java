package g1;

import ex.InterfaceC2139c;
import h1.InterfaceC2794y;
import h1.n1;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11069a;

    /* renamed from: b */
    public final /* synthetic */ t0 f11070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(t0 t0Var, int i10) {
        super(1);
        this.f11069a = i10;
        this.f11070b = t0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC2794y interfaceC2794y;
        InterfaceC2794y interfaceC2794y2;
        switch (this.f11069a) {
            case 0:
                n1 n1Var = (n1) obj;
                f0 f0Var = f0.PreEnter;
                f0 f0Var2 = f0.Visible;
                boolean zM6841b = n1Var.m6841b(f0Var, f0Var2);
                Object obj2 = null;
                t0 t0Var = this.f11070b;
                if (zM6841b) {
                    C2446z c2446z = t0Var.f11080v.f11095a.f11019c;
                    if (c2446z != null) {
                        obj2 = c2446z.f11122c;
                    }
                } else if (n1Var.m6841b(f0Var2, f0.PostExit)) {
                    C2446z c2446z2 = t0Var.f11081w.f11104a.f11019c;
                    if (c2446z2 != null) {
                        obj2 = c2446z2.f11122c;
                    }
                } else {
                    obj2 = o0.f11046d;
                }
                return obj2 == null ? o0.f11046d : obj2;
            default:
                n1 n1Var2 = (n1) obj;
                f0 f0Var3 = f0.PreEnter;
                f0 f0Var4 = f0.Visible;
                boolean zM6841b2 = n1Var2.m6841b(f0Var3, f0Var4);
                t0 t0Var2 = this.f11070b;
                if (zM6841b2) {
                    g1 g1Var = t0Var2.f11080v.f11095a.f11018b;
                    return (g1Var == null || (interfaceC2794y2 = g1Var.f10996b) == null) ? o0.f11045c : interfaceC2794y2;
                }
                if (!n1Var2.m6841b(f0Var4, f0.PostExit)) {
                    return o0.f11045c;
                }
                g1 g1Var2 = t0Var2.f11081w.f11104a.f11018b;
                return (g1Var2 == null || (interfaceC2794y = g1Var2.f10996b) == null) ? o0.f11045c : interfaceC2794y;
        }
    }
}
