package v3;

import s4.AbstractC6746b;
import t3.C7024k;
import t3.C7032s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.x */
/* loaded from: classes.dex */
public interface InterfaceC7652x extends InterfaceC7641m {
    /* renamed from: H */
    default int mo146H(n0 n0Var, t3.i0 i0Var, int i10) {
        return mo148b(new C7032s(n0Var, n0Var.getLayoutDirection()), new C7024k(i0Var, j1.Min, k1.Height, 2), AbstractC6746b.m12924b(i10, 0, 13)).getHeight();
    }

    /* renamed from: V */
    default int mo147V(n0 n0Var, t3.i0 i0Var, int i10) {
        return mo148b(new C7032s(n0Var, n0Var.getLayoutDirection()), new C7024k(i0Var, j1.Max, k1.Height, 2), AbstractC6746b.m12924b(i10, 0, 13)).getHeight();
    }

    /* renamed from: b */
    t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6);

    default int k0(n0 n0Var, t3.i0 i0Var, int i10) {
        return mo148b(new C7032s(n0Var, n0Var.getLayoutDirection()), new C7024k(i0Var, j1.Max, k1.Width, 2), AbstractC6746b.m12924b(0, i10, 7)).mo12108b();
    }

    default int x0(n0 n0Var, t3.i0 i0Var, int i10) {
        return mo148b(new C7032s(n0Var, n0Var.getLayoutDirection()), new C7024k(i0Var, j1.Min, k1.Width, 2), AbstractC6746b.m12924b(0, i10, 7)).mo12108b();
    }
}
