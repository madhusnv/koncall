package gp;

import dr.C1768r;
import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import java.util.List;
import og.od;
import qp.C6266c;
import qw.a0;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gp.k */
/* loaded from: classes3.dex */
public final class C2700k extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15074a;

    /* renamed from: b */
    public /* synthetic */ Object f15075b;

    /* renamed from: c */
    public final /* synthetic */ C2703n f15076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2700k(C2703n c2703n, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15074a = i10;
        this.f15076c = c2703n;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15074a) {
            case 0:
                C2700k c2700k = new C2700k(this.f15076c, interfaceC7559c, 0);
                c2700k.f15075b = obj;
                return c2700k;
            default:
                C2700k c2700k2 = new C2700k(this.f15076c, interfaceC7559c, 1);
                c2700k2.f15075b = obj;
                return c2700k2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15074a) {
            case 0:
                C2700k c2700k = (C2700k) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2700k.invokeSuspend(a0Var);
                return a0Var;
            default:
                C2700k c2700k2 = (C2700k) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c2700k2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        C6266c c6266c;
        int size;
        int i10 = this.f15074a;
        a0 a0Var = a0.f30746a;
        C2703n c2703n = this.f15076c;
        switch (i10) {
            case 0:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f15075b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c2703n.f15086i, null, null, new C1768r(interfaceC3307i, c2703n, null, 1), 3);
                break;
            default:
                List list = (List) this.f15075b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c2703n.f15094q;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6266c.m12271a((C6266c) value, C6668r.f31943a, false, null, null, null, null, null, false, false, false, false, false, false, 0, false, false, 262142)));
                do {
                    value2 = m1Var.getValue();
                    c6266c = (C6266c) value2;
                    size = list.size();
                    c2703n.f15084g.getClass();
                } while (!m1Var.m15397i(value2, C6266c.m12271a(c6266c, list, size < 50, null, null, null, null, null, false, false, false, false, false, false, 0, false, false, 262140)));
        }
        return a0Var;
    }
}
