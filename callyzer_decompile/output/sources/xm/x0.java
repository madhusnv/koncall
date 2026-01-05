package xm;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import mm.C4791b;
import mm.C4803n;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40982a;

    /* renamed from: b */
    public int f40983b;

    /* renamed from: c */
    public final /* synthetic */ x1 f40984c;

    /* renamed from: d */
    public final /* synthetic */ List f40985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(List list, x1 x1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40982a = i10;
        this.f40985d = list;
        this.f40984c = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40982a) {
            case 0:
                return new x0(this.f40985d, this.f40984c, interfaceC7559c, 0);
            case 1:
                return new x0(this.f40984c, this.f40985d, interfaceC7559c, 1);
            case 2:
                return new x0(this.f40984c, this.f40985d, interfaceC7559c, 2);
            default:
                return new x0(this.f40985d, this.f40984c, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40982a) {
        }
        return ((x0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f40982a;
        qw.a0 a0Var = qw.a0.f30746a;
        x1 x1Var = this.f40984c;
        List list = this.f40985d;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40983b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                C8800o c8800o = C8800o.f42459a;
                LocalDateTime localDateTimeM16204m = C8800o.m16204m();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C4791b) it.next()).f23834c = localDateTimeM16204m;
                }
                gn.x2 x2Var = x1Var.f40991a;
                this.f40983b = 1;
                return x2Var.m6679Y(list, this) == enumC7794a ? enumC7794a : a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f40983b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                gn.x2 x2Var2 = x1Var.f40991a;
                this.f40983b = 1;
                return x2Var2.b0(list, this) == enumC7794a2 ? enumC7794a2 : a0Var;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f40983b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                gn.x2 x2Var3 = x1Var.f40991a;
                this.f40983b = 1;
                return x2Var3.d0(list, this) == enumC7794a3 ? enumC7794a3 : a0Var;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f40983b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                C8800o c8800o2 = C8800o.f42459a;
                LocalDateTime localDateTimeM16204m2 = C8800o.m16204m();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((C4803n) it2.next()).f23915d = localDateTimeM16204m2;
                }
                gn.x2 x2Var4 = x1Var.f40991a;
                this.f40983b = 1;
                return x2Var4.j0(list, this) == enumC7794a4 ? enumC7794a4 : a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(x1 x1Var, List list, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40982a = i10;
        this.f40984c = x1Var;
        this.f40985d = list;
    }
}
