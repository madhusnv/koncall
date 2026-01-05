package g2;

import rw.C6669s;
import s4.C6750f;
import v3.AbstractC7634f;
import v3.InterfaceC7640l;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c7 extends AbstractC7878q implements InterfaceC7640l, InterfaceC7652x {
    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        float f6 = ((C6750f) AbstractC7634f.m14548i(this, g6.f11637b)).f32201a;
        float f10 = 0;
        if (f6 < f10) {
            f6 = f10;
        }
        t3.w0 w0VarMo13314z = i0Var.mo13314z(j6);
        boolean z6 = this.f37683p && !Float.isNaN(f6) && Float.compare(f6, f10) > 0;
        int iE0 = Float.isNaN(f6) ? 0 : l0Var.e0(f6);
        int iMax = z6 ? Math.max(w0VarMo13314z.f34030a, iE0) : w0VarMo13314z.f34030a;
        int iMax2 = z6 ? Math.max(w0VarMo13314z.f34031b, iE0) : w0VarMo13314z.f34031b;
        return l0Var.g0(iMax, iMax2, C6669s.f31944a, new b7(iMax, w0VarMo13314z, iMax2));
    }
}
