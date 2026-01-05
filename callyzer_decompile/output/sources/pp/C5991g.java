package pp;

import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import java.util.List;
import lp.C4504f;
import og.od;
import qp.C6270g;
import qw.a0;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pp.g */
/* loaded from: classes3.dex */
public final class C5991g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29286a;

    /* renamed from: b */
    public /* synthetic */ Object f29287b;

    /* renamed from: c */
    public final /* synthetic */ C5995k f29288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5991g(C5995k c5995k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f29286a = i10;
        this.f29288c = c5995k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29286a) {
            case 0:
                C5991g c5991g = new C5991g(this.f29288c, interfaceC7559c, 0);
                c5991g.f29287b = obj;
                return c5991g;
            default:
                C5991g c5991g2 = new C5991g(this.f29288c, interfaceC7559c, 1);
                c5991g2.f29287b = obj;
                return c5991g2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29286a) {
            case 0:
                C5991g c5991g = (C5991g) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c5991g.invokeSuspend(a0Var);
                return a0Var;
            default:
                C5991g c5991g2 = (C5991g) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c5991g2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f29286a;
        a0 a0Var = a0.f30746a;
        C5995k c5995k = this.f29288c;
        switch (i10) {
            case 0:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f29287b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c5995k.f29300k, null, null, new C4504f(interfaceC3307i, c5995k, null, 26), 3);
                break;
            default:
                List list = (List) this.f29287b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c5995k.f29306q;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6270g.m12274a((C6270g) value, C6668r.f31943a, false, null, null, null, null, false, false, 0, false, false, false, false, 16382)));
                do {
                    value2 = m1Var.getValue();
                } while (!m1Var.m15397i(value2, C6270g.m12274a((C6270g) value2, list, list.isEmpty(), null, null, null, null, false, false, 0, false, false, false, false, 16380)));
        }
        return a0Var;
    }
}
