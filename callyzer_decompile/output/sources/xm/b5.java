package xm;

import ex.InterfaceC2141e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import og.od;
import tx.InterfaceC7266z;
import uw.C7565i;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b5 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40179a;

    /* renamed from: b */
    public int f40180b;

    /* renamed from: c */
    public /* synthetic */ Object f40181c;

    /* renamed from: d */
    public final /* synthetic */ y5 f40182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5(y5 y5Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40179a = i10;
        this.f40182d = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40179a) {
            case 0:
                b5 b5Var = new b5(this.f40182d, interfaceC7559c, 0);
                b5Var.f40181c = obj;
                return b5Var;
            default:
                b5 b5Var2 = new b5(this.f40182d, interfaceC7559c, 1);
                b5Var2.f40181c = obj;
                return b5Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40179a) {
            case 0:
                return ((b5) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((b5) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        List list;
        switch (this.f40179a) {
            case 0:
                y5 y5Var = this.f40182d;
                List list2 = (List) this.f40181c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f40180b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    if (!list2.isEmpty()) {
                        this.f40181c = null;
                        this.f40180b = 1;
                        if (y5.m15680b(y5Var, list2, this) == enumC7794a) {
                            return enumC7794a;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return qw.a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                this.f40181c = null;
                this.f40180b = 2;
                if (y5.m15681c(y5Var, this) == enumC7794a) {
                    return enumC7794a;
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40180b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    int i12 = c5.f40205a[this.f40182d.f41065q.ordinal()];
                    InterfaceC7559c interfaceC7559c = null;
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y5 y5Var2 = this.f40182d;
                        synchronized (y5Var2) {
                            list = (List) tx.c0.m13468D(C7565i.f36440a, new o6.s0(y5Var2, interfaceC7559c, 26));
                        }
                        return list;
                    }
                    List list3 = this.f40182d.f41067s;
                    if (list3 != null) {
                        if (list3.isEmpty()) {
                            list3 = null;
                        }
                        if (list3 != null) {
                            return list3;
                        }
                    }
                    y5 y5Var3 = this.f40182d;
                    y5Var3.f41065q = u4.FROM_DATABASE;
                    this.f40181c = null;
                    this.f40180b = 1;
                    obj = y5Var3.m15696l(this);
                    if (obj == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return (List) obj;
        }
    }
}
