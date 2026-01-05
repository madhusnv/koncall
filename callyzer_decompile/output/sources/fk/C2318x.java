package fk;

import hk.InterfaceC2962b;
import hk.InterfaceC2963c;
import ik.C3287k;
import ji.C3773g;
import pw.InterfaceC6043a;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.x */
/* loaded from: classes.dex */
public final class C2318x implements InterfaceC2962b {

    /* renamed from: a */
    public final m0 f10513a;

    /* renamed from: b */
    public final InterfaceC6043a f10514b;

    /* renamed from: c */
    public final InterfaceC6043a f10515c;

    /* renamed from: d */
    public final InterfaceC2963c f10516d;

    public C2318x(m0 m0Var, InterfaceC2963c interfaceC2963c, m0 m0Var2, InterfaceC2963c interfaceC2963c2) {
        this.f10513a = m0Var;
        this.f10514b = interfaceC2963c;
        this.f10515c = m0Var2;
        this.f10516d = interfaceC2963c2;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        return new C2309o((C3773g) this.f10513a.f10459b, (C3287k) this.f10514b.get(), (InterfaceC7564h) this.f10515c.get(), (a1) this.f10516d.get());
    }
}
