package zi;

import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.s */
/* loaded from: classes.dex */
public final class C8976s implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8976s f43261a = new C8976s();

    /* renamed from: b */
    public static final C3777b f43262b = C3777b.m8300c("batteryLevel");

    /* renamed from: c */
    public static final C3777b f43263c = C3777b.m8300c("batteryVelocity");

    /* renamed from: d */
    public static final C3777b f43264d = C3777b.m8300c("proximityOn");

    /* renamed from: e */
    public static final C3777b f43265e = C3777b.m8300c("orientation");

    /* renamed from: f */
    public static final C3777b f43266f = C3777b.m8300c("ramUsed");

    /* renamed from: g */
    public static final C3777b f43267g = C3777b.m8300c("diskUsed");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        b1 b1Var = (b1) ((e2) obj);
        interfaceC3779d.mo8302a(f43262b, b1Var.f43014a);
        interfaceC3779d.mo8306e(f43263c, b1Var.f43015b);
        interfaceC3779d.mo8303b(f43264d, b1Var.f43016c);
        interfaceC3779d.mo8306e(f43265e, b1Var.f43017d);
        interfaceC3779d.mo8305d(f43266f, b1Var.f43018e);
        interfaceC3779d.mo8305d(f43267g, b1Var.f43019f);
    }
}
