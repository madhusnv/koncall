package ja;

import a2.AbstractC0030c;
import ex.InterfaceC2137a;
import pg.a8;
import pg.d8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.d */
/* loaded from: classes.dex */
public final class C3610d implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f19243a;

    /* renamed from: b */
    public final /* synthetic */ C3619m f19244b;

    /* renamed from: c */
    public final /* synthetic */ b0 f19245c;

    public /* synthetic */ C3610d(C3619m c3619m, b0 b0Var, int i10) {
        this.f19243a = i10;
        this.f19244b = c3619m;
        this.f19245c = b0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f19243a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("Ignoring invalid ");
                C3632z c3632z = (C3632z) this.f19245c;
                sb2.append(a8.m11536a(c3632z));
                sb2.append(" '");
                return d8.m11583a(AbstractC0030c.m123n(sb2, c3632z.f19273a, '\''), Integer.valueOf(this.f19244b.f19260a));
            case 1:
                return d8.m11583a(AbstractC0030c.m123n(new StringBuilder("Ignoring invalid property '"), ((C3631y) this.f19245c).f19271a, '\''), Integer.valueOf(this.f19244b.f19260a));
            case 2:
                return d8.m11583a(AbstractC0030c.m123n(new StringBuilder("Overwriting previously-defined property '"), ((C3631y) this.f19245c).f19271a, '\''), Integer.valueOf(this.f19244b.f19260a));
            case 3:
                return d8.m11583a(AbstractC0030c.m123n(new StringBuilder("Ignoring invalid sub-property '"), ((a0) this.f19245c).f19237a, '\''), Integer.valueOf(this.f19244b.f19260a));
            default:
                return d8.m11583a(AbstractC0030c.m123n(new StringBuilder("Overwriting previously-defined property '"), ((a0) this.f19245c).f19237a, '\''), Integer.valueOf(this.f19244b.f19260a));
        }
    }
}
