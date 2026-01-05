package wr;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import g2.fb;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.InterfaceC5262u;
import o1.h1;
import og.nc;
import og.t0;
import ps.C6014n;
import qv.C6334i;
import qw.a0;
import s2.AbstractC6740i;
import sq.b1;
import w2.C7876o;
import w2.InterfaceC7879r;
import zr.C9031a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wr.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8155k implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f39061a;

    /* renamed from: b */
    public final /* synthetic */ C9031a f39062b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f39063c;

    public /* synthetic */ C8155k(C9031a c9031a, InterfaceC2139c interfaceC2139c, int i10) {
        this.f39061a = i10;
        this.f39062b = c9031a;
        this.f39063c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f39061a) {
            case 0:
                InterfaceC5262u Card = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card, "$this$Card");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C9031a c9031a = this.f39062b;
                    if (c9031a.f43487d.isEmpty()) {
                        c3966o.m8607Y(1802472582);
                        b1.m13072B(0, 2, t0.m10920c(c3966o, R.string.no_employee_found), c3966o, null);
                        c3966o.m8623p(false);
                    } else {
                        c3966o.m8607Y(1802616360);
                        InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(C7876o.f37669a, 20, 10);
                        boolean zM8616i = c3966o.m8616i(c9031a);
                        InterfaceC2139c interfaceC2139c = this.f39063c;
                        boolean zM8614g = zM8616i | c3966o.m8614g(interfaceC2139c);
                        Object objM8596M = c3966o.m8596M();
                        if (zM8614g || objM8596M == C3961j.f20408a) {
                            objM8596M = new C6334i(9, interfaceC2139c, (Object) c9031a);
                            c3966o.j0(objM8596M);
                        }
                        nc.m10775b(interfaceC7879rM657k, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 6, 510);
                        c3966o.m8623p(false);
                    }
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                h1 it = (h1) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(it, "it");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C3966o) interfaceC3962k2).m8614g(it) ? 4 : 2;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    fb.m6164a(AbstractC0242a.m660n(AbstractC0245d.f1971c, DefinitionKt.NO_Float_VALUE, it.mo10344d(), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13), null, 0L, 0L, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, AbstractC6740i.m12902d(-868176199, new C6014n(25, this.f39062b, this.f39063c), c3966o2), c3966o2, 12582912, 126);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
