package fk;

import hk.InterfaceC2962b;
import hk.InterfaceC2963c;
import ik.C3280d;
import ik.C3281e;
import ik.C3287k;
import ik.C3291o;
import ji.C3773g;
import pw.InterfaceC6043a;
import rj.InterfaceC6558d;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 implements InterfaceC2962b {

    /* renamed from: a */
    public final /* synthetic */ int f10507a = 0;

    /* renamed from: b */
    public final InterfaceC6043a f10508b;

    /* renamed from: c */
    public final InterfaceC6043a f10509c;

    /* renamed from: d */
    public final InterfaceC6043a f10510d;

    /* renamed from: e */
    public final InterfaceC2963c f10511e;

    /* renamed from: f */
    public final InterfaceC6043a f10512f;

    public w0(InterfaceC2963c interfaceC2963c, m0 m0Var, InterfaceC2963c interfaceC2963c2, InterfaceC2963c interfaceC2963c3, InterfaceC2963c interfaceC2963c4) {
        this.f10508b = interfaceC2963c;
        this.f10509c = m0Var;
        this.f10510d = interfaceC2963c2;
        this.f10512f = interfaceC2963c3;
        this.f10511e = interfaceC2963c4;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f10507a) {
            case 0:
                return new v0((C3773g) ((m0) this.f10512f).f10459b, (InterfaceC6558d) this.f10508b.get(), (C3287k) this.f10509c.get(), (C2306l) this.f10511e.get(), (InterfaceC7564h) this.f10510d.get());
            default:
                return new C3280d((m1) this.f10508b.get(), (InterfaceC6558d) this.f10509c.get(), (C2296b) this.f10510d.get(), (C3281e) this.f10512f.get(), (C3291o) this.f10511e.get());
        }
    }

    public w0(m0 m0Var, m0 m0Var2, InterfaceC2963c interfaceC2963c, InterfaceC2963c interfaceC2963c2, m0 m0Var3) {
        this.f10512f = m0Var;
        this.f10508b = m0Var2;
        this.f10509c = interfaceC2963c;
        this.f10511e = interfaceC2963c2;
        this.f10510d = m0Var3;
    }
}
