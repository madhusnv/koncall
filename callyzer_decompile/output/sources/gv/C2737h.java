package gv;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import hv.C3039d;
import hv.C3047l;
import hv.C3048m;
import qv.C6346u;
import qw.a0;
import rv.C6645u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gv.h */
/* loaded from: classes3.dex */
public final class C2737h implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f15275a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f15276b;

    public /* synthetic */ C2737h(int i10, InterfaceC2139c interfaceC2139c) {
        this.f15275a = i10;
        this.f15276b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f15275a) {
            case 0:
                this.f15276b.invoke(C3047l.f16378a);
                break;
            case 1:
                this.f15276b.invoke(C3039d.f16370a);
                break;
            case 2:
                this.f15276b.invoke(C3048m.f16379a);
                break;
            case 3:
                this.f15276b.invoke(C6346u.f30740a);
                break;
            case 4:
                this.f15276b.invoke(C6645u.f31908a);
                break;
            default:
                this.f15276b.invoke(C6346u.f30740a);
                break;
        }
        return a0.f30746a;
    }
}
