package fk;

import hk.InterfaceC2962b;
import hk.InterfaceC2963c;
import ik.C3287k;
import ik.InterfaceC3292p;
import pw.InterfaceC6043a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 implements InterfaceC2962b {

    /* renamed from: a */
    public final /* synthetic */ int f10523a;

    /* renamed from: b */
    public final InterfaceC6043a f10524b;

    /* renamed from: c */
    public final InterfaceC2963c f10525c;

    public /* synthetic */ y0(InterfaceC2963c interfaceC2963c, InterfaceC2963c interfaceC2963c2, int i10) {
        this.f10523a = i10;
        this.f10524b = interfaceC2963c;
        this.f10525c = interfaceC2963c2;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f10523a) {
            case 0:
                return new x0((m1) this.f10524b.get(), (n1) this.f10525c.get());
            default:
                return new C3287k((InterfaceC3292p) this.f10524b.get(), (InterfaceC3292p) this.f10525c.get());
        }
    }
}
