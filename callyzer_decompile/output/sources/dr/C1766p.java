package dr;

import aw.d0;
import br.C0739b;
import br.C0740c;
import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import java.util.List;
import og.od;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.p */
/* loaded from: classes3.dex */
public final class C1766p extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8577a;

    /* renamed from: b */
    public /* synthetic */ Object f8578b;

    /* renamed from: c */
    public final /* synthetic */ C1775y f8579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1766p(C1775y c1775y, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8577a = i10;
        this.f8579c = c1775y;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8577a) {
            case 0:
                C1766p c1766p = new C1766p(this.f8579c, interfaceC7559c, 0);
                c1766p.f8578b = obj;
                return c1766p;
            case 1:
                C1766p c1766p2 = new C1766p(this.f8579c, interfaceC7559c, 1);
                c1766p2.f8578b = obj;
                return c1766p2;
            default:
                C1766p c1766p3 = new C1766p(this.f8579c, interfaceC7559c, 2);
                c1766p3.f8578b = obj;
                return c1766p3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8577a) {
            case 0:
                C1766p c1766p = (C1766p) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c1766p.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C1766p c1766p2 = (C1766p) create((Throwable) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c1766p2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C1766p c1766p3 = (C1766p) create((List) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                c1766p3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        C0740c c0740c;
        Object value2;
        C0740c c0740c2;
        Object value3;
        int i10 = this.f8577a;
        qw.a0 a0Var = qw.a0.f30746a;
        C1775y c1775y = this.f8579c;
        switch (i10) {
            case 0:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f8578b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c1775y.f8627j, null, null, new d0(interfaceC3307i, c1775y, null), 3);
                break;
            case 1:
                Throwable th2 = (Throwable) this.f8578b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c1775y.f8629l.m16235j(th2);
                th2.toString();
                m1 m1Var = c1775y.f8635r;
                do {
                    value = m1Var.getValue();
                    c0740c = (C0740c) value;
                } while (!m1Var.m15397i(value, C0740c.m2037a(c0740c, false, C0739b.m2036a(c0740c.f4669c, null, false, false, false, 0, false, false, false, null, 505), null, null, null, null, null, null, null, false, null, null, false, 1048571)));
            default:
                List list = (List) this.f8578b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var2 = c1775y.f8635r;
                do {
                    value2 = m1Var2.getValue();
                    c0740c2 = (C0740c) value2;
                } while (!m1Var2.m15397i(value2, C0740c.m2037a(c0740c2, false, C0739b.m2036a(c0740c2.f4669c, list, false, false, false, 0, list.isEmpty(), false, false, null, 478), null, null, null, null, null, null, null, false, null, null, false, 1048571)));
                C0739b c0739b = ((C0740c) c1775y.f8636s.f39340a.getValue()).f4669c;
                if (c0739b.f4663f && !c0739b.f4659b && !c0739b.f4660c && c0739b.f4658a.isEmpty()) {
                    do {
                        value3 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value3, C0740c.m2037a((C0740c) value3, false, null, null, null, null, null, null, null, null, false, null, null, false, 1048574)));
                }
                break;
        }
        return a0Var;
    }
}
