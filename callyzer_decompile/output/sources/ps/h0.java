package ps;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ss.C6935x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f29364a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f29365b;

    /* renamed from: c */
    public final /* synthetic */ String f29366c;

    public /* synthetic */ h0(InterfaceC2139c interfaceC2139c, String str, int i10) {
        this.f29364a = i10;
        this.f29365b = interfaceC2139c;
        this.f29366c = str;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f29364a) {
            case 0:
                this.f29365b.invoke(new C6935x(this.f29366c));
                break;
            case 1:
                this.f29365b.invoke(this.f29366c);
                break;
            default:
                this.f29365b.invoke(new yr.b0(this.f29366c));
                break;
        }
        return qw.a0.f30746a;
    }
}
