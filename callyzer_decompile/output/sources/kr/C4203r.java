package kr;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import java.util.Iterator;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.InterfaceC5262u;
import o1.u0;
import or.C5454q;
import ps.AbstractC6009i;
import sq.g2;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.r */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4203r implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f21300a;

    /* renamed from: b */
    public final /* synthetic */ List f21301b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f21302c;

    public /* synthetic */ C4203r(int i10, InterfaceC2139c interfaceC2139c, List list) {
        this.f21300a = i10;
        this.f21301b = list;
        this.f21302c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f21300a) {
            case 0:
                u0 FlowRow = (u0) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(FlowRow, "$this$FlowRow");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (C5454q c5454q : this.f21301b) {
                        if (c5454q.f27493c) {
                            c3966o.m8607Y(1296337857);
                            String str = c5454q.f27491a;
                            InterfaceC2139c interfaceC2139c = this.f21302c;
                            boolean zM8614g = c3966o.m8614g(interfaceC2139c) | c3966o.m8614g(c5454q);
                            Object objM8596M = c3966o.m8596M();
                            if (zM8614g || objM8596M == C3961j.f20408a) {
                                objM8596M = new C4188c(interfaceC2139c, c5454q, 1);
                                c3966o.j0(objM8596M);
                            }
                            g2.m13171w(str, (InterfaceC2139c) objM8596M, c3966o, 0);
                        } else {
                            c3966o.m8607Y(1288320854);
                        }
                        c3966o.m8623p(false);
                    }
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                InterfaceC5262u BottomSheet = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(BottomSheet, "$this$BottomSheet");
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(AbstractC0245d.m685v(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 3), 20, 30);
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o2, 0);
                    int i10 = c3966o2.f20462P;
                    i1 i1VarM8620m = c3966o2.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM657k);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o2.c0();
                    if (c3966o2.f20461O) {
                        c3966o2.m8619l(c7637i);
                    } else {
                        c3966o2.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o2);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o2);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i10))) {
                        AbstractC1452a.m4577x(i10, c3966o2, i10, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o2);
                    AbstractC6009i.m12032b(this.f21301b, this.f21302c, c3966o2, 0);
                    c3966o2.m8623p(true);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                u0 FlowRow2 = (u0) obj;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(FlowRow2, "$this$FlowRow");
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    for (C5454q c5454q2 : this.f21301b) {
                        if (c5454q2.f27493c) {
                            c3966o3.m8607Y(-2026690103);
                            String str2 = c5454q2.f27491a;
                            InterfaceC2139c interfaceC2139c2 = this.f21302c;
                            boolean zM8614g2 = c3966o3.m8614g(interfaceC2139c2) | c3966o3.m8614g(c5454q2);
                            Object objM8596M2 = c3966o3.m8596M();
                            if (zM8614g2 || objM8596M2 == C3961j.f20408a) {
                                objM8596M2 = new C4188c(interfaceC2139c2, c5454q2, 2);
                                c3966o3.j0(objM8596M2);
                            }
                            g2.m13171w(str2, (InterfaceC2139c) objM8596M2, c3966o3, 0);
                        } else {
                            c3966o3.m8607Y(-2028707707);
                        }
                        c3966o3.m8623p(false);
                    }
                } else {
                    c3966o3.m8601S();
                }
                break;
            default:
                u0 FlowRow3 = (u0) obj;
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(FlowRow3, "$this$FlowRow");
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    Iterator it = this.f21301b.iterator();
                    while (it.hasNext()) {
                        g2.m13171w((String) it.next(), this.f21302c, c3966o4, 0);
                    }
                } else {
                    c3966o4.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
