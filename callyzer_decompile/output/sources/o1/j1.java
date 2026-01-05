package o1;

import g2.b7;
import p1.AbstractC5788a;
import rw.C6669s;
import s4.AbstractC6746b;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public h1 f25774q;

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        float fMo10342b = this.f25774q.mo10342b(l0Var.getLayoutDirection());
        float fMo10344d = this.f25774q.mo10344d();
        float fMo10343c = this.f25774q.mo10343c(l0Var.getLayoutDirection());
        float fMo10341a = this.f25774q.mo10341a();
        float f6 = 0;
        if (!((Float.compare(fMo10341a, f6) >= 0) & (Float.compare(fMo10342b, f6) >= 0) & (Float.compare(fMo10344d, f6) >= 0) & (Float.compare(fMo10343c, f6) >= 0))) {
            AbstractC5788a.m11338a("Padding must be non-negative");
        }
        int iE0 = l0Var.e0(fMo10342b);
        int iE02 = l0Var.e0(fMo10343c) + iE0;
        int iE03 = l0Var.e0(fMo10344d);
        int iE04 = l0Var.e0(fMo10341a) + iE03;
        t3.w0 w0VarMo13314z = i0Var.mo13314z(AbstractC6746b.m12931i(-iE02, -iE04, j6));
        return l0Var.g0(AbstractC6746b.m12929g(w0VarMo13314z.f34030a + iE02, j6), AbstractC6746b.m12928f(w0VarMo13314z.f34031b + iE04, j6), C6669s.f31944a, new b7(w0VarMo13314z, iE0, iE03, 3));
    }
}
