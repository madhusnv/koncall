package ks;

import cs.AbstractC1500s;
import cs.C1495n;
import cs.C1496o;
import ex.InterfaceC2141e;
import hp.C2995b;
import im.p1;
import java.util.ArrayList;
import java.util.List;
import js.C3850f;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import mm.C4799j;
import og.od;
import rw.AbstractC6663m;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.y */
/* loaded from: classes3.dex */
public final class C4236y extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21540a;

    /* renamed from: b */
    public final /* synthetic */ c0 f21541b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC1500s f21542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4236y(int i10, AbstractC1500s abstractC1500s, c0 c0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21540a = i10;
        this.f21541b = c0Var;
        this.f21542c = abstractC1500s;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21540a) {
            case 0:
                return new C4236y(0, this.f21542c, this.f21541b, interfaceC7559c);
            default:
                return new C4236y(1, this.f21542c, this.f21541b, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f21540a) {
            case 0:
                C4236y c4236y = (C4236y) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                c4236y.invokeSuspend(a0Var);
                return a0Var;
            default:
                C4236y c4236y2 = (C4236y) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c4236y2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f21540a;
        qw.a0 a0Var = qw.a0.f30746a;
        AbstractC1500s abstractC1500s = this.f21542c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C4494g c4494g = this.f21541b.f21375p;
                List list = (List) c4494g.m9336a(p1.LEAD_NUMBERS_LIST);
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
                c4494g.m9337b(p1.LEAD_NUMBERS_LIST, arrayListD0);
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C1495n c1495n = (C1495n) abstractC1500s;
                int i12 = c1495n.f7578c;
                c0 c0Var = this.f21541b;
                c0Var.f21382w = i12;
                tx.c0.m13502y(c0Var.f21369j, null, null, new C2995b(c0Var, c1495n.f7576a, c1495n.f7577b, null, 19), 3);
                break;
        }
        return a0Var;
    }
}
