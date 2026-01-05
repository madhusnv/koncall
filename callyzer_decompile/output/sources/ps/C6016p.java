package ps;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import im.EnumC3310l;
import tr.C7206b;
import yr.C8764w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6016p implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f29407a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f29408b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f29409c;

    public /* synthetic */ C6016p(int i10, InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c) {
        this.f29407a = i10;
        this.f29408b = interfaceC2139c;
        this.f29409c = interfaceC2137a;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f29407a) {
            case 0:
                this.f29408b.invoke(EnumC3310l.FrequentContactCalls);
                this.f29409c.invoke();
                break;
            case 1:
                this.f29408b.invoke(C7206b.f34498a);
                this.f29409c.invoke();
                break;
            case 2:
                this.f29408b.invoke(C8764w.f42382a);
                this.f29409c.invoke();
                break;
            case 3:
                this.f29408b.invoke(C8764w.f42382a);
                this.f29409c.invoke();
                break;
            case 4:
                this.f29408b.invoke(yr.f0.f42361a);
                this.f29409c.invoke();
                break;
            case 5:
                this.f29409c.invoke();
                this.f29408b.invoke(yr.g0.f42363a);
                break;
            default:
                this.f29408b.invoke(yr.f0.f42361a);
                this.f29409c.invoke();
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C6016p(InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c) {
        this.f29407a = 5;
        this.f29409c = interfaceC2137a;
        this.f29408b = interfaceC2139c;
    }
}
