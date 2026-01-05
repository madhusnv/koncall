package k1;

import ex.InterfaceC2141e;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b2 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f20029a;

    /* renamed from: b */
    public final /* synthetic */ a1 f20030b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(a1 a1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f20029a = i10;
        this.f20030b = a1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20029a) {
            case 0:
                return new b2(this.f20030b, interfaceC7559c, 0);
            case 1:
                return new b2(this.f20030b, interfaceC7559c, 1);
            case 2:
                return new b2(this.f20030b, interfaceC7559c, 2);
            case 3:
                return new b2(this.f20030b, interfaceC7559c, 3);
            case 4:
                return new b2(this.f20030b, interfaceC7559c, 4);
            case 5:
                return new b2(this.f20030b, interfaceC7559c, 5);
            case 6:
                return new b2(this.f20030b, interfaceC7559c, 6);
            default:
                return new b2(this.f20030b, interfaceC7559c, 7);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f20029a) {
            case 0:
                b2 b2Var = (b2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                b2Var.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                b2 b2Var2 = (b2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                b2Var2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                b2 b2Var3 = (b2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var3 = qw.a0.f30746a;
                b2Var3.invokeSuspend(a0Var3);
                return a0Var3;
            case 3:
                b2 b2Var4 = (b2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var4 = qw.a0.f30746a;
                b2Var4.invokeSuspend(a0Var4);
                return a0Var4;
            case 4:
                b2 b2Var5 = (b2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var5 = qw.a0.f30746a;
                b2Var5.invokeSuspend(a0Var5);
                return a0Var5;
            case 5:
                b2 b2Var6 = (b2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var6 = qw.a0.f30746a;
                b2Var6.invokeSuspend(a0Var6);
                return a0Var6;
            case 6:
                b2 b2Var7 = (b2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var7 = qw.a0.f30746a;
                b2Var7.invokeSuspend(a0Var7);
                return a0Var7;
            default:
                b2 b2Var8 = (b2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var8 = qw.a0.f30746a;
                b2Var8.invokeSuspend(a0Var8);
                return a0Var8;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f20029a;
        qw.a0 a0Var = qw.a0.f30746a;
        a1 a1Var = this.f20030b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1Var.m8437b();
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1Var.m8438c();
                break;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1Var.m8438c();
                break;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1Var.m8437b();
                break;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1Var.m8438c();
                break;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1Var.m8438c();
                break;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1Var.m8437b();
                break;
            default:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1Var.m8438c();
                break;
        }
        return a0Var;
    }
}
