package x1;

import a9.C0073l;
import g4.C2492h;
import java.util.List;
import k4.InterfaceC3987h;
import og.zf;
import rw.C6668r;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a */
    public final C2492h f39454a;

    /* renamed from: b */
    public final g4.o0 f39455b;

    /* renamed from: e */
    public final boolean f39458e;

    /* renamed from: g */
    public final InterfaceC6747c f39460g;

    /* renamed from: h */
    public final InterfaceC3987h f39461h;

    /* renamed from: j */
    public C0073l f39463j;

    /* renamed from: k */
    public EnumC6757m f39464k;

    /* renamed from: c */
    public final int f39456c = Integer.MAX_VALUE;

    /* renamed from: d */
    public final int f39457d = 1;

    /* renamed from: f */
    public final int f39459f = 1;

    /* renamed from: i */
    public final List f39462i = C6668r.f31943a;

    public c1(C2492h c2492h, g4.o0 o0Var, boolean z6, InterfaceC6747c interfaceC6747c, InterfaceC3987h interfaceC3987h, int i10) {
        this.f39454a = c2492h;
        this.f39455b = o0Var;
        this.f39458e = z6;
        this.f39460g = interfaceC6747c;
        this.f39461h = interfaceC3987h;
    }

    /* renamed from: a */
    public final void m15430a(EnumC6757m enumC6757m) {
        C0073l c0073l = this.f39463j;
        if (c0073l == null || enumC6757m != this.f39464k || c0073l.mo209a()) {
            this.f39464k = enumC6757m;
            c0073l = new C0073l(this.f39454a, zf.m11101c(this.f39455b, enumC6757m), this.f39462i, this.f39460g, this.f39461h);
        }
        this.f39463j = c0073l;
    }
}
