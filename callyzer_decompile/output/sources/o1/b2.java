package o1;

import kotlin.jvm.internal.AbstractC4155m;
import pg.w9;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b2 extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public EnumC5267z f25704q;

    /* renamed from: r */
    public AbstractC4155m f25705r;

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        t3.w0 w0VarMo13314z = i0Var.mo13314z(AbstractC6746b.m12923a(this.f25704q != EnumC5267z.Vertical ? 0 : C6745a.m12920k(j6), C6745a.m12918i(j6), this.f25704q == EnumC5267z.Horizontal ? C6745a.m12919j(j6) : 0, C6745a.m12917h(j6)));
        int iM11912c = w9.m11912c(w0VarMo13314z.f34030a, C6745a.m12920k(j6), C6745a.m12918i(j6));
        int iM11912c2 = w9.m11912c(w0VarMo13314z.f34031b, C6745a.m12919j(j6), C6745a.m12917h(j6));
        return l0Var.g0(iM11912c, iM11912c2, C6669s.f31944a, new a2(this, iM11912c, w0VarMo13314z, iM11912c2, l0Var));
    }
}
