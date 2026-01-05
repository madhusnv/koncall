package ps;

import be.C0652g;
import bq.C0724d;
import ex.InterfaceC2141e;
import og.od;
import ss.C6921j;
import ss.z0;
import tq.EnumC7204p;
import ts.C7216c;
import ts.C7217d;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vu.C7788a;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29333a;

    /* renamed from: b */
    public /* synthetic */ Object f29334b;

    /* renamed from: c */
    public final /* synthetic */ z0 f29335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(z0 z0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f29333a = i10;
        this.f29335c = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29333a) {
            case 0:
                b0 b0Var = new b0(this.f29335c, interfaceC7559c, 0);
                b0Var.f29334b = obj;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(this.f29335c, interfaceC7559c, 1);
                b0Var2.f29334b = obj;
                return b0Var2;
            case 2:
                b0 b0Var3 = new b0(this.f29335c, interfaceC7559c, 2);
                b0Var3.f29334b = obj;
                return b0Var3;
            case 3:
                b0 b0Var4 = new b0(this.f29335c, interfaceC7559c, 3);
                b0Var4.f29334b = obj;
                return b0Var4;
            default:
                b0 b0Var5 = new b0(this.f29335c, interfaceC7559c, 4);
                b0Var5.f29334b = obj;
                return b0Var5;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29333a) {
            case 0:
                b0 b0Var = (b0) create((C7788a) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                b0Var.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                b0 b0Var2 = (b0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                b0Var2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                b0 b0Var3 = (b0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                b0Var3.invokeSuspend(a0Var3);
                return a0Var3;
            case 3:
                b0 b0Var4 = (b0) create((EnumC7204p) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var4 = qw.a0.f30746a;
                b0Var4.invokeSuspend(a0Var4);
                return a0Var4;
            default:
                b0 b0Var5 = (b0) create((EnumC7204p) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var5 = qw.a0.f30746a;
                b0Var5.invokeSuspend(a0Var5);
                return a0Var5;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i10 = this.f29333a;
        int i11 = 1;
        int i12 = 0;
        InterfaceC7559c interfaceC7559c = null;
        qw.a0 a0Var = qw.a0.f30746a;
        int i13 = 3;
        z0 z0Var = this.f29335c;
        switch (i10) {
            case 0:
                C7788a c7788a = (C7788a) this.f29334b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                z0Var.m13196s(new C6921j(c7788a));
                break;
            case 1:
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f29334b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                tx.c0.m13502y(interfaceC7266z, null, null, new C0724d(z0Var, interfaceC7559c, 15), 3);
                tx.c0.m13502y(interfaceC7266z, null, null, new ss.b0(z0Var, interfaceC7559c, i12), 3);
                tx.c0.m13502y(interfaceC7266z, null, null, new ss.b0(z0Var, interfaceC7559c, i11), 3);
                break;
            case 2:
                InterfaceC7266z interfaceC7266z2 = (InterfaceC7266z) this.f29334b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                int i14 = 2;
                tx.c0.m13502y(interfaceC7266z2, null, null, new ss.b0(z0Var, interfaceC7559c, i14), 3);
                tx.c0.m13502y(interfaceC7266z2, null, null, new ss.c0(z0Var, interfaceC7559c, i12), 3);
                tx.c0.m13502y(interfaceC7266z2, null, null, new ss.c0(z0Var, interfaceC7559c, i11), 3);
                tx.c0.m13502y(interfaceC7266z2, null, null, new ss.b0(z0Var, interfaceC7559c, i13), 3);
                tx.c0.m13502y(interfaceC7266z2, null, null, new ss.b0(z0Var, interfaceC7559c, 4), 3);
                tx.c0.m13502y(interfaceC7266z2, null, null, new ss.b0(z0Var, interfaceC7559c, 5), 3);
                tx.c0.m13502y(interfaceC7266z2, null, null, new ss.b0(z0Var, interfaceC7559c, 6), 3);
                tx.c0.m13502y(interfaceC7266z2, null, null, new ss.c0(z0Var, interfaceC7559c, i14), 3);
                break;
            case 3:
                EnumC7204p enumC7204p = (EnumC7204p) this.f29334b;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = z0Var.f33541J;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C7216c.m13448a((C7216c) value, null, C7217d.m13449a(((C7216c) m1Var.getValue()).f34514b, null, null, enumC7204p, 3), false, null, null, null, false, false, null, null, 2045)));
            default:
                EnumC7204p enumC7204p2 = (EnumC7204p) this.f29334b;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                tx.c0.m13502y(z0Var.f33539H, null, null, new C0652g(z0Var, enumC7204p2, null), 3);
                break;
        }
        return a0Var;
    }
}
