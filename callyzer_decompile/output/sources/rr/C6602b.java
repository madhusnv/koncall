package rr;

import android.content.Context;
import bt.C0768m;
import bt.l0;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import g2.u9;
import g2.v4;
import k2.C3966o;
import k2.InterfaceC3962k;
import qw.a0;
import s2.AbstractC6740i;
import sq.g2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rr.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6602b implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f31723a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f31724b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2141e f31725c;

    /* renamed from: d */
    public final /* synthetic */ v4 f31726d;

    /* renamed from: e */
    public final /* synthetic */ Context f31727e;

    public /* synthetic */ C6602b(InterfaceC2137a interfaceC2137a, InterfaceC2141e interfaceC2141e, v4 v4Var, Context context, int i10) {
        this.f31723a = i10;
        this.f31724b = interfaceC2137a;
        this.f31725c = interfaceC2141e;
        this.f31726d = v4Var;
        this.f31727e = context;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31723a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC2137a interfaceC2137a = this.f31724b;
                    InterfaceC2141e interfaceC2141e = this.f31725c;
                    v4 v4Var = this.f31726d;
                    u9.m6323a(null, AbstractC6740i.m12902d(-1802288672, new C6602b(interfaceC2137a, interfaceC2141e, v4Var, this.f31727e, 1), c3966o), null, null, null, 0, 0L, 0L, null, AbstractC6740i.m12902d(-1462991125, new l0(19, v4Var), c3966o), c3966o, 805306416, 509);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC2137a interfaceC2137a2 = this.f31724b;
                    g2.m13157i(null, null, false, "", 0L, 0, false, AbstractC6740i.m12902d(-1515414194, new C0768m(interfaceC2137a2, this.f31725c, this.f31726d, this.f31727e, 16), c3966o2), interfaceC2137a2, c3966o2, 12585984, 119);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
