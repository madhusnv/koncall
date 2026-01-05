package cp;

import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import bt.w0;
import cv.C1516l;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import ex.InterfaceC2143g;
import g1.C2433m;
import g2.p9;
import g2.v1;
import g2.y1;
import hq.C3002g;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kq.AbstractC4179i;
import kr.C4187b;
import l7.C4409i;
import l7.a0;
import lq.C4506a;
import og.fb;
import og.gb;
import or.C5454q;
import qp.C6264a;
import qr.e0;
import qv.AbstractC6327b;
import qv.C6334i;
import r1.C6428m;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.g2;
import sq.h3;
import t1.C6994s;
import w2.C7876o;
import zp.C9002b;
import zp.C9010j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cp.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1472c implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f7526a;

    /* renamed from: b */
    public final /* synthetic */ Object f7527b;

    /* renamed from: c */
    public final /* synthetic */ Object f7528c;

    public /* synthetic */ C1472c(int i10, Object obj, Object obj2) {
        this.f7526a = i10;
        this.f7528c = obj;
        this.f7527b = obj2;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f7526a) {
            case 0:
                C6264a c6264a = (C6264a) this.f7528c;
                a0 a0Var = (a0) this.f7527b;
                C6428m items = (C6428m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                AbstractC4154l.m8923f(items, "$this$items");
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((C3966o) interfaceC3962k).m8612e(iIntValue) ? 32 : 16;
                }
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    C9002b c9002b = (C9002b) c6264a.f30358b.get(iIntValue);
                    boolean zM8616i = c3966o.m8616i(c6264a) | ((iIntValue2 & 112) == 32) | c3966o.m8616i(a0Var);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8616i || objM8596M == C3961j.f20408a) {
                        objM8596M = new w0(c6264a, iIntValue, a0Var, 1);
                        c3966o.j0(objM8596M);
                    }
                    fb.m10647a(c9002b, (InterfaceC2137a) objM8596M, c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            case 1:
                List list = (List) this.f7528c;
                a0 a0Var2 = (a0) this.f7527b;
                C6428m items2 = (C6428m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                AbstractC4154l.m8923f(items2, "$this$items");
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= ((C3966o) interfaceC3962k2).m8612e(iIntValue3) ? 32 : 16;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    C9010j c9010j = (C9010j) list.get(iIntValue3);
                    boolean zM8616i2 = c3966o2.m8616i(list) | ((iIntValue4 & 112) == 32) | c3966o2.m8616i(a0Var2);
                    Object objM8596M2 = c3966o2.m8596M();
                    if (zM8616i2 || objM8596M2 == C3961j.f20408a) {
                        objM8596M2 = new w0(list, iIntValue3, a0Var2, 2);
                        c3966o2.j0(objM8596M2);
                    }
                    gb.m10668e(c9010j, (InterfaceC2137a) objM8596M2, c3966o2, 0);
                } else {
                    c3966o2.m8601S();
                }
                return qw.a0.f30746a;
            case 2:
                C4506a c4506a = (C4506a) this.f7528c;
                a0 a0Var3 = (a0) this.f7527b;
                C6994s HorizontalPager = (C6994s) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                AbstractC4154l.m8923f(HorizontalPager, "$this$HorizontalPager");
                C6734c c6734c = ((AbstractC4179i) c4506a.f22414a.get(iIntValue5)).f21186c;
                C3966o c3966o3 = (C3966o) ((InterfaceC3962k) obj3);
                boolean zM8616i3 = c3966o3.m8616i(a0Var3);
                Object objM8596M3 = c3966o3.m8596M();
                if (zM8616i3 || objM8596M3 == C3961j.f20408a) {
                    objM8596M3 = new C3002g(a0Var3, 0);
                    c3966o3.j0(objM8596M3);
                }
                c6734c.invoke((InterfaceC2139c) objM8596M3, c3966o3, 0);
                break;
            case 3:
                List list2 = (List) this.f7528c;
                Object obj5 = (InterfaceC2141e) this.f7527b;
                InterfaceC0246a items3 = (InterfaceC0246a) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                AbstractC4154l.m8923f(items3, "$this$items");
                if ((iIntValue7 & 48) == 0) {
                    iIntValue7 |= ((C3966o) interfaceC3962k3).m8612e(iIntValue6) ? 32 : 16;
                }
                C3966o c3966o4 = (C3966o) interfaceC3962k3;
                if (c3966o4.m8598P(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                    C5454q c5454q = (C5454q) list2.get(iIntValue6);
                    boolean z6 = c5454q.f27493c;
                    C6734c c6734cM12902d = AbstractC6740i.m12902d(374948955, new C4187b(c5454q, 2), c3966o4);
                    boolean zM8614g = c3966o4.m8614g(obj5) | c3966o4.m8614g(c5454q);
                    Object objM8596M4 = c3966o4.m8596M();
                    if (zM8614g || objM8596M4 == C3961j.f20408a) {
                        objM8596M4 = new C6334i(2, obj5, c5454q);
                        c3966o4.j0(objM8596M4);
                    }
                    g2.m13170v(z6, null, null, null, c6734cM12902d, (InterfaceC2139c) objM8596M4, c3966o4, 24576, 14);
                    if (iIntValue6 + 1 < list2.size()) {
                        c3966o4.m8607Y(-563121047);
                        p9.m6245i(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 1, ((v1) c3966o4.m8618k(y1.f13286a)).f12928A, c3966o4, 54, 0);
                    } else {
                        c3966o4.m8607Y(-569036498);
                    }
                    c3966o4.m8623p(false);
                } else {
                    c3966o4.m8601S();
                }
                return qw.a0.f30746a;
            case 4:
                List list3 = (List) this.f7528c;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f7527b;
                C6994s HorizontalPager2 = (C6994s) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                AbstractC4154l.m8923f(HorizontalPager2, "$this$HorizontalPager");
                InterfaceC2142f interfaceC2142f = ((h3) list3.get(iIntValue8)).f32941b;
                C3966o c3966o5 = (C3966o) ((InterfaceC3962k) obj3);
                boolean zM8614g2 = c3966o5.m8614g(interfaceC2139c);
                Object objM8596M5 = c3966o5.m8596M();
                if (zM8614g2 || objM8596M5 == C3961j.f20408a) {
                    objM8596M5 = new C1516l(16, interfaceC2139c);
                    c3966o5.j0(objM8596M5);
                }
                interfaceC2142f.invoke((InterfaceC2139c) objM8596M5, c3966o5, 0);
                break;
            default:
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f7528c;
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f7527b;
                C2433m composable = (C2433m) obj;
                C4409i it = (C4409i) obj2;
                ((Integer) obj4).getClass();
                AbstractC4154l.m8923f(composable, "$this$composable");
                AbstractC4154l.m8923f(it, "it");
                C3966o c3966o6 = (C3966o) ((InterfaceC3962k) obj3);
                boolean zM8614g3 = c3966o6.m8614g(interfaceC2137a) | c3966o6.m8614g(interfaceC2139c2);
                Object objM8596M6 = c3966o6.m8596M();
                if (zM8614g3 || objM8596M6 == C3961j.f20408a) {
                    objM8596M6 = new e0(2, interfaceC2137a, interfaceC2139c2);
                    c3966o6.j0(objM8596M6);
                }
                AbstractC6327b.m12355t((InterfaceC2139c) objM8596M6, c3966o6, 0);
                break;
        }
        return qw.a0.f30746a;
    }
}
