package ps;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import cv.C1516l;
import d3.n0;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.v1;
import g2.y1;
import g4.o0;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.l1;
import l4.C4381z;
import og.af;
import p1.AbstractC5788a;
import pg.v8;
import pg.x8;
import w2.InterfaceC7879r;
import x1.AbstractC8261k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29358a = 0;

    /* renamed from: b */
    public final /* synthetic */ C4381z f29359b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f29360c;

    public /* synthetic */ g0(int i10, InterfaceC2139c interfaceC2139c, C4381z c4381z) {
        this.f29359b = c4381z;
        this.f29360c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29358a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6009i.m12035e(this.f29359b, this.f29360c, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            default:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC2139c interfaceC2139c = this.f29360c;
                    boolean zM8614g = c3966o.m8614g(interfaceC2139c);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C1516l(6, interfaceC2139c);
                        c3966o.j0(objM8596M);
                    }
                    InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) objM8596M;
                    if (1.0f <= 0.0d) {
                        AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                    }
                    InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(new LayoutWeightElement(1.0f, true), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14, DefinitionKt.NO_Float_VALUE, 11);
                    l1 l1Var = y1.f13286a;
                    AbstractC8261k.m15438b(this.f29359b, interfaceC2139c2, interfaceC7879rM660n, false, false, new o0(((v1) c3966o.m8618k(l1Var)).f12970q, af.m10534c(18), null, null, v8.m11898a(x8.m11932a(R.font.montserrat_bold)), 0L, 3, 0L, 16744412), null, null, false, 1, 0, null, null, null, new n0(((v1) c3966o.m8618k(l1Var)).f12954a), null, c3966o, 805306368, 0, 48600);
                } else {
                    c3966o.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ g0(C4381z c4381z, InterfaceC2139c interfaceC2139c) {
        this.f29359b = c4381z;
        this.f29360c = interfaceC2139c;
    }
}
