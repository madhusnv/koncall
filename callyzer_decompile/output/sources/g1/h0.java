package g1;

import ex.InterfaceC2139c;
import h1.InterfaceC2794y;
import h1.n1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11004a;

    /* renamed from: b */
    public final /* synthetic */ u0 f11005b;

    /* renamed from: c */
    public final /* synthetic */ v0 f11006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(u0 u0Var, v0 v0Var, int i10) {
        super(1);
        this.f11004a = i10;
        this.f11005b = u0Var;
        this.f11006c = v0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC2794y interfaceC2794y;
        InterfaceC2794y interfaceC2794y2;
        switch (this.f11004a) {
            case 0:
                n1 n1Var = (n1) obj;
                f0 f0Var = f0.PreEnter;
                f0 f0Var2 = f0.Visible;
                if (n1Var.m6841b(f0Var, f0Var2)) {
                    w0 w0Var = this.f11005b.f11095a.f11017a;
                    return (w0Var == null || (interfaceC2794y2 = w0Var.f11113b) == null) ? o0.f11044b : interfaceC2794y2;
                }
                if (!n1Var.m6841b(f0Var2, f0.PostExit)) {
                    return o0.f11044b;
                }
                w0 w0Var2 = this.f11006c.f11104a.f11017a;
                return (w0Var2 == null || (interfaceC2794y = w0Var2.f11113b) == null) ? o0.f11044b : interfaceC2794y;
            case 1:
                int i10 = i0.f11016a[((f0) obj).ordinal()];
                float f6 = 1.0f;
                if (i10 != 1) {
                    if (i10 == 2) {
                        w0 w0Var3 = this.f11005b.f11095a.f11017a;
                        if (w0Var3 != null) {
                            f6 = w0Var3.f11112a;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        w0 w0Var4 = this.f11006c.f11104a.f11017a;
                        if (w0Var4 != null) {
                            f6 = w0Var4.f11112a;
                        }
                    }
                }
                return Float.valueOf(f6);
            case 2:
                n1 n1Var2 = (n1) obj;
                f0 f0Var3 = f0.PreEnter;
                f0 f0Var4 = f0.Visible;
                if (n1Var2.m6841b(f0Var3, f0Var4)) {
                    return o0.f11044b;
                }
                if (!n1Var2.m6841b(f0Var4, f0.PostExit)) {
                    return o0.f11044b;
                }
                i1 i1Var = this.f11006c.f11104a;
                return o0.f11044b;
            default:
                int i11 = j0.f11025a[((f0) obj).ordinal()];
                if (i11 != 1 && i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i1 i1Var2 = this.f11006c.f11104a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
