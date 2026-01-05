package bt;

import dt.C1818x;
import ex.InterfaceC2137a;
import zs.C9056u;
import zs.C9057v;
import zs.C9059x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4923a;

    /* renamed from: b */
    public final /* synthetic */ C1818x f4924b;

    public /* synthetic */ t0(C1818x c1818x, int i10) {
        this.f4923a = i10;
        this.f4924b = c1818x;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4923a) {
            case 0:
                C9057v c9057v = C9057v.f43567a;
                C1818x c1818x = this.f4924b;
                c1818x.m5481f(c9057v);
                c1818x.m5481f(new C9059x(false));
                break;
            case 1:
                this.f4924b.m5481f(new C9059x(true));
                break;
            case 2:
                this.f4924b.m5481f(new C9059x(false));
                break;
            case 3:
                C9056u c9056u = new C9056u(true);
                C1818x c1818x2 = this.f4924b;
                c1818x2.m5481f(c9056u);
                c1818x2.m5481f(new C9059x(false));
                break;
            default:
                C9056u c9056u2 = new C9056u(false);
                C1818x c1818x3 = this.f4924b;
                c1818x3.m5481f(c9056u2);
                c1818x3.m5481f(new C9059x(false));
                break;
        }
        return qw.a0.f30746a;
    }
}
