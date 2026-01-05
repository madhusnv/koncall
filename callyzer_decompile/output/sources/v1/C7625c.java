package v1;

import d4.AbstractC1592t;
import d4.AbstractC1594v;
import d4.C1580h;
import d4.C1595w;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import f4.EnumC2203a;
import g2.c1;
import i1.C3142u;
import lx.InterfaceC4574m;
import m1.InterfaceC4630l;
import o6.b0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v1.c */
/* loaded from: classes.dex */
public final class C7625c extends C3142u {

    /* renamed from: M */
    public boolean f36781M;

    /* renamed from: N */
    public InterfaceC2139c f36782N;

    /* renamed from: O */
    public final b0 f36783O;

    public C7625c(boolean z6, InterfaceC4630l interfaceC4630l, boolean z10, C1580h c1580h, InterfaceC2139c interfaceC2139c) {
        super(interfaceC4630l, null, z10, null, c1580h, new c1(interfaceC2139c, z6, 1));
        this.f36781M = z6;
        this.f36782N = interfaceC2139c;
        this.f36783O = new b0(10, this);
    }

    @Override // i1.AbstractC3126e
    public final void O0(InterfaceC1596x interfaceC1596x) {
        EnumC2203a enumC2203a = this.f36781M ? EnumC2203a.On : EnumC2203a.Off;
        InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
        C1595w c1595w = AbstractC1592t.f7911H;
        InterfaceC4574m interfaceC4574m = AbstractC1594v.f7944a[23];
        c1595w.m5236a(interfaceC1596x, enumC2203a);
    }
}
