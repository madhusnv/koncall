package k2;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k2.z */
/* loaded from: classes.dex */
public final class C3977z extends l1 {

    /* renamed from: b */
    public final /* synthetic */ int f20634b = 1;

    /* renamed from: c */
    public final Object f20635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3977z(InterfaceC2137a interfaceC2137a) {
        super(interfaceC2137a);
        s0 s0Var = s0.f20547f;
        this.f20635c = s0Var;
    }

    @Override // k2.l1
    /* renamed from: a */
    public final m1 mo8541a(Object obj) {
        switch (this.f20634b) {
            case 0:
                return new m1(this, obj, obj == null, null, true);
            default:
                return new m1(this, obj, obj == null, (d2) this.f20635c, true);
        }
    }

    @Override // k2.l1
    /* renamed from: b */
    public k2 mo8554b() {
        switch (this.f20634b) {
            case 0:
                return (a0) this.f20635c;
            default:
                return super.mo8554b();
        }
    }

    public C3977z(InterfaceC2139c interfaceC2139c) {
        super(C3976y.f20608a);
        this.f20635c = new a0(interfaceC2139c);
    }
}
