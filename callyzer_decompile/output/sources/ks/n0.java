package ks;

import aq.C0405h;
import cs.AbstractC1500s;
import cs.C1495n;
import cs.C1496o;
import ex.InterfaceC2141e;
import im.p1;
import java.util.ArrayList;
import java.util.List;
import js.C3850f;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4799j;
import og.od;
import rw.AbstractC6663m;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21471a;

    /* renamed from: b */
    public final /* synthetic */ q0 f21472b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC1500s f21473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i10, AbstractC1500s abstractC1500s, q0 q0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21471a = i10;
        this.f21472b = q0Var;
        this.f21473c = abstractC1500s;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21471a) {
            case 0:
                return new n0(0, this.f21473c, this.f21472b, interfaceC7559c);
            default:
                return new n0(1, this.f21473c, this.f21472b, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f21471a) {
            case 0:
                n0 n0Var = (n0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                n0Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                n0 n0Var2 = (n0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                n0Var2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f21471a;
        qw.a0 a0Var = qw.a0.f30746a;
        AbstractC1500s abstractC1500s = this.f21473c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                q0 q0Var = this.f21472b;
                List list = (List) q0Var.f21504o.m9336a(p1.LEAD_NUMBERS_LIST);
                ArrayList arrayListD0 = list != null ? AbstractC6663m.d0(list) : new ArrayList();
                C1496o c1496o = (C1496o) abstractC1500s;
                for (String str : c1496o.f7582d.f19819i) {
                    C3850f c3850f = c1496o.f7582d;
                    C4799j c4799j = new C4799j(c3850f.f19811a, c3850f.f19813c, str, c3850f.f19812b);
                    if (!arrayListD0.isEmpty()) {
                        int size = arrayListD0.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = arrayListD0.get(i11);
                            i11++;
                            C4799j c4799j2 = (C4799j) obj2;
                            if (!AbstractC4154l.m8918a(c4799j2.f23881a, c4799j.f23881a) || !AbstractC4154l.m8918a(c4799j2.f23883c, c4799j.f23883c)) {
                            }
                        }
                    }
                    arrayListD0.add(c4799j);
                }
                q0Var.f21504o.m9337b(p1.LEAD_NUMBERS_LIST, arrayListD0);
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C1495n c1495n = (C1495n) abstractC1500s;
                int i12 = c1495n.f7578c;
                q0 q0Var2 = this.f21472b;
                q0Var2.f21509t = i12;
                tx.c0.m13502y(q0Var2.f21498i, null, null, new C0405h(q0Var2, c1495n.f7576a, c1495n.f7577b, (InterfaceC7559c) null, 11), 3);
                break;
        }
        return a0Var;
    }
}
