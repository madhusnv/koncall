package kr;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import or.C5454q;
import tr.C7211g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.z */
/* loaded from: classes3.dex */
public final class C4211z implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f21334a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f21335b;

    /* renamed from: c */
    public final /* synthetic */ C5454q f21336c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f21337d;

    public /* synthetic */ C4211z(InterfaceC2139c interfaceC2139c, C5454q c5454q, InterfaceC2137a interfaceC2137a, int i10) {
        this.f21334a = i10;
        this.f21335b = interfaceC2139c;
        this.f21336c = c5454q;
        this.f21337d = interfaceC2137a;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f21334a) {
            case 0:
                this.f21335b.invoke(this.f21336c);
                this.f21337d.invoke();
                break;
            default:
                this.f21335b.invoke(new C7211g(this.f21336c));
                this.f21337d.invoke();
                break;
        }
        return qw.a0.f30746a;
    }
}
