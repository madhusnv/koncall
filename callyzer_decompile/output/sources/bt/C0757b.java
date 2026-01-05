package bt;

import ex.InterfaceC2137a;
import ex.InterfaceC2142f;
import g2.AbstractC2465s;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.InterfaceC5262u;
import og.kf;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0757b implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f4773a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f4774b;

    /* renamed from: c */
    public final /* synthetic */ k2.w0 f4775c;

    public /* synthetic */ C0757b(InterfaceC2137a interfaceC2137a, k2.w0 w0Var, int i10) {
        this.f4773a = i10;
        this.f4774b = interfaceC2137a;
        this.f4775c = w0Var;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f4773a;
        InterfaceC5262u DropdownMenu = (InterfaceC5262u) obj;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                AbstractC4154l.m8923f(DropdownMenu, "$this$DropdownMenu");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C6734c c6734c = b0.f4779d;
                    InterfaceC2137a interfaceC2137a = this.f4774b;
                    boolean zM8614g = c3966o.m8614g(interfaceC2137a);
                    k2.w0 w0Var = this.f4775c;
                    boolean zM8614g2 = zM8614g | c3966o.m8614g(w0Var);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8614g2 || objM8596M == C3961j.f20408a) {
                        objM8596M = new C0763h(interfaceC2137a, w0Var, 0);
                        c3966o.j0(objM8596M);
                    }
                    AbstractC2465s.m6299b(c6734c, (InterfaceC2137a) objM8596M, null, b0.f4780e, null, false, null, null, null, c3966o, 3078, 500);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                AbstractC4154l.m8923f(DropdownMenu, "$this$BottomSheet");
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC2137a interfaceC2137a2 = this.f4774b;
                    boolean zM8614g3 = c3966o2.m8614g(interfaceC2137a2);
                    Object objM8596M2 = c3966o2.m8596M();
                    if (zM8614g3 || objM8596M2 == C3961j.f20408a) {
                        objM8596M2 = new C0763h(interfaceC2137a2, this.f4775c, 2);
                        c3966o2.j0(objM8596M2);
                    }
                    kf.m10736a((InterfaceC2137a) objM8596M2, c3966o2, 0);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
