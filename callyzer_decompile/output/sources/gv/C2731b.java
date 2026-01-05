package gv;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import hv.C3038c;
import iv.C3357a;
import qv.C6348w;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gv.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2731b implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f15253a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f15254b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f15255c;

    /* renamed from: d */
    public final /* synthetic */ C3357a f15256d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f15257e;

    public /* synthetic */ C2731b(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, C3357a c3357a, InterfaceC2139c interfaceC2139c3, int i10) {
        this.f15253a = i10;
        this.f15254b = interfaceC2139c;
        this.f15255c = interfaceC2139c2;
        this.f15256d = c3357a;
        this.f15257e = interfaceC2139c3;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f15253a) {
            case 0:
                this.f15254b.invoke(C3038c.f16369a);
                this.f15255c.invoke(new C6348w(this.f15256d.f17765l));
                this.f15257e.invoke("registration");
                break;
            default:
                this.f15254b.invoke(C3038c.f16369a);
                this.f15255c.invoke(new C6348w(this.f15256d.f17765l));
                this.f15257e.invoke("registration");
                break;
        }
        return a0.f30746a;
    }
}
