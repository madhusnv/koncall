package ps;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import l4.C4381z;
import ss.C6916e;
import ss.C6932u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f29385a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f29386b;

    /* renamed from: c */
    public final /* synthetic */ C4381z f29387c;

    public /* synthetic */ j0(int i10, InterfaceC2139c interfaceC2139c, C4381z c4381z) {
        this.f29385a = i10;
        this.f29386b = interfaceC2139c;
        this.f29387c = c4381z;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f29385a) {
            case 0:
                this.f29386b.invoke(this.f29387c.f21945a.f13620b);
                break;
            case 1:
                this.f29386b.invoke(new C6932u(this.f29387c.f21945a.f13620b));
                break;
            default:
                this.f29386b.invoke(new C6916e(this.f29387c.f21945a.f13620b));
                break;
        }
        return qw.a0.f30746a;
    }
}
