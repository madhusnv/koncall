package t3;

import s4.EnumC6757m;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends v0 {

    /* renamed from: b */
    public final /* synthetic */ int f34001b;

    /* renamed from: c */
    public final Object f34002c;

    public /* synthetic */ g0(int i10, Object obj) {
        this.f34001b = i10;
        this.f34002c = obj;
    }

    @Override // t3.v0
    /* renamed from: b */
    public final EnumC6757m mo13293b() {
        switch (this.f34001b) {
            case 0:
                return ((v3.n0) this.f34002c).getLayoutDirection();
            default:
                return ((C7904v) this.f34002c).getLayoutDirection();
        }
    }

    @Override // t3.v0
    /* renamed from: c */
    public final int mo13294c() {
        switch (this.f34001b) {
            case 0:
                return ((v3.n0) this.f34002c).h0();
            default:
                return ((C7904v) this.f34002c).getRoot().f36833L.f36943p.f34030a;
        }
    }
}
