package xt;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import br.C0739b;
import br.C0740c;
import com.websoptimization.callyzerbiz.R;
import d7.w0;
import dr.C1751a;
import dr.C1752b;
import dr.C1775y;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.p9;
import im.EnumC3311m;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;
import k2.s0;
import l7.a0;
import ls.C4512c;
import lx.InterfaceC4566e;
import pg.f9;
import qw.InterfaceC6355e;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.g2;
import tp.C7188i;
import tq.EnumC7204p;
import vr.b0;
import w1.AbstractC7861e;
import w2.C7876o;
import yt.C8770b;
import yt.C8774f;
import yu.AbstractC8775a;
import zq.AbstractC9018a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xt.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8453d implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41237a;

    /* renamed from: b */
    public final /* synthetic */ Object f41238b;

    /* renamed from: c */
    public final /* synthetic */ Object f41239c;

    public /* synthetic */ C8453d(Object obj, w0 w0Var, int i10) {
        this.f41237a = i10;
        this.f41238b = obj;
        this.f41239c = w0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41237a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC8450a.m15757d((C8770b) this.f41238b, (InterfaceC2137a) this.f41239c, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC8450a.m15765l((h2) this.f41239c, (C8770b) this.f41238b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 2:
                a0 a0Var = (a0) this.f41238b;
                C8774f c8774f = (C8774f) this.f41239c;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strM11629c = f9.m11629c(c3966o, R.string.linked_quick_call);
                    C6734c c6734cM12902d = AbstractC6740i.m12902d(-763368650, new C8459j(0, c8774f), c3966o);
                    boolean zM8616i = c3966o.m8616i(a0Var);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8616i || objM8596M == C3961j.f20408a) {
                        objM8596M = new C7188i(a0Var, 6);
                        c3966o.j0(objM8596M);
                    }
                    g2.m13157i(null, null, false, strM11629c, 0L, 0, false, c6734cM12902d, (InterfaceC2137a) objM8596M, c3966o, 12582912, 119);
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            case 3:
                h2 h2Var = (h2) this.f41238b;
                C8774f c8774f2 = (C8774f) this.f41239c;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f6 = 16;
                    p9.m6240d(AbstractC0242a.m656j(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), f6), AbstractC7861e.m14841b(f6), null, p9.m6254r(8, 62), null, AbstractC6740i.m12902d(-107488734, new C4512c(24, h2Var, c8774f2), c3966o2), c3966o2, 196614, 20);
                } else {
                    c3966o2.m8601S();
                }
                return qw.a0.f30746a;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC8775a.m16143n((EnumC3311m) this.f41238b, (InterfaceC2139c) this.f41239c, (InterfaceC3962k) obj, C3953b.m8496A(7));
                break;
            default:
                C0740c c0740c = (C0740c) this.f41238b;
                C1775y c1775y = (C1775y) this.f41239c;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C0739b c0739b = c0740c.f4669c;
                    List list = c0739b.f4658a;
                    boolean zM8616i2 = c3966o3.m8616i(c1775y);
                    Object objM8596M2 = c3966o3.m8596M();
                    s0 s0Var = C3961j.f20408a;
                    if (zM8616i2 || objM8596M2 == s0Var) {
                        objM8596M2 = new C1752b(c1775y, 4);
                        c3966o3.j0(objM8596M2);
                    }
                    InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M2;
                    EnumC7204p enumC7204p = c0740c.f4675i;
                    boolean zM8616i3 = c3966o3.m8616i(c1775y);
                    Object objM8596M3 = c3966o3.m8596M();
                    if (zM8616i3 || objM8596M3 == s0Var) {
                        objM8596M3 = new C1751a(c1775y, 2);
                        c3966o3.j0(objM8596M3);
                    }
                    InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M3;
                    boolean zM8616i4 = c3966o3.m8616i(c1775y);
                    Object objM8596M4 = c3966o3.m8596M();
                    if (zM8616i4 || objM8596M4 == s0Var) {
                        objM8596M4 = new C1751a(c1775y, 3);
                        c3966o3.j0(objM8596M4);
                    }
                    InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) objM8596M4;
                    boolean zM8616i5 = c3966o3.m8616i(c1775y);
                    Object objM8596M5 = c3966o3.m8596M();
                    if (zM8616i5 || objM8596M5 == s0Var) {
                        b0 b0Var = new b0(1, c1775y, C1775y.class, "onAction", "onAction(Lcom/websoptimization/callyzerbiz/ui/contact_detail/event/ContactDetailEvent;)V", 0, 27);
                        c3966o3.j0(b0Var);
                        objM8596M5 = b0Var;
                    }
                    AbstractC9018a.m16486f(list, c0739b, interfaceC2137a, enumC7204p, interfaceC2139c, interfaceC2139c2, (InterfaceC2139c) ((InterfaceC4566e) objM8596M5), c3966o3, 0);
                } else {
                    c3966o3.m8601S();
                }
                return qw.a0.f30746a;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C8453d(Object obj, InterfaceC6355e interfaceC6355e, int i10, int i11) {
        this.f41237a = i11;
        this.f41238b = obj;
        this.f41239c = interfaceC6355e;
    }

    public /* synthetic */ C8453d(h2 h2Var, C8770b c8770b, int i10) {
        this.f41237a = 1;
        this.f41239c = h2Var;
        this.f41238b = c8770b;
    }
}
