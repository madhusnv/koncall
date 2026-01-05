package o1;

import ex.InterfaceC2142f;
import java.util.WeakHashMap;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z1 extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f25898a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(int i10, int i11) {
        super(i10);
        this.f25898a = i11;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f25898a;
        k2.s0 s0Var = C3961j.f20408a;
        switch (i10) {
            case 0:
                ((Number) obj3).intValue();
                C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
                c3966o.m8607Y(359872873);
                WeakHashMap weakHashMap = w1.f25863v;
                w1 w1VarM10315e = C5243b.m10315e(c3966o);
                boolean zM8614g = c3966o.m8614g(w1VarM10315e);
                Object objM8596M = c3966o.m8596M();
                if (zM8614g || objM8596M == s0Var) {
                    objM8596M = new x0(w1VarM10315e.f25866c);
                    c3966o.j0(objM8596M);
                }
                x0 x0Var = (x0) objM8596M;
                c3966o.m8623p(false);
                return x0Var;
            default:
                ((Number) obj3).intValue();
                C3966o c3966o2 = (C3966o) ((InterfaceC3962k) obj2);
                c3966o2.m8607Y(359872873);
                WeakHashMap weakHashMap2 = w1.f25863v;
                w1 w1VarM10315e2 = C5243b.m10315e(c3966o2);
                boolean zM8614g2 = c3966o2.m8614g(w1VarM10315e2);
                Object objM8596M2 = c3966o2.m8596M();
                if (zM8614g2 || objM8596M2 == s0Var) {
                    objM8596M2 = new x0(w1VarM10315e2.f25868e);
                    c3966o2.j0(objM8596M2);
                }
                x0 x0Var2 = (x0) objM8596M2;
                c3966o2.m8623p(false);
                return x0Var2;
        }
    }
}
