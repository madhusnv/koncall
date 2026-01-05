package bt;

import at.C0431b;
import dt.C1813s;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import zs.C9048m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4830a;

    /* renamed from: b */
    public final /* synthetic */ C0431b f4831b;

    /* renamed from: c */
    public final /* synthetic */ C1813s f4832c;

    /* renamed from: d */
    public final /* synthetic */ l7.a0 f4833d;

    public /* synthetic */ g0(C0431b c0431b, C1813s c1813s, l7.a0 a0Var, int i10) {
        this.f4830a = i10;
        this.f4831b = c0431b;
        this.f4832c = c1813s;
        this.f4833d = a0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4830a) {
            case 0:
                C0431b c0431b = this.f4831b;
                if (AbstractC4154l.m8918a(c0431b.f3169a, c0431b.f3185q) && AbstractC4154l.m8918a(c0431b.f3171c, c0431b.f3186r)) {
                    this.f4833d.m9188g();
                } else {
                    this.f4832c.m5479f(new C9048m(!c0431b.f3178j));
                }
                break;
            default:
                C0431b c0431b2 = this.f4831b;
                if (AbstractC4154l.m8918a(c0431b2.f3169a, c0431b2.f3185q) && AbstractC4154l.m8918a(c0431b2.f3171c, c0431b2.f3186r)) {
                    this.f4833d.m9188g();
                } else {
                    boolean z6 = c0431b2.f3178j;
                    C1813s c1813s = this.f4832c;
                    if (z6) {
                        c1813s.m5479f(new C9048m(false));
                    } else {
                        c1813s.m5479f(new C9048m(true));
                    }
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
