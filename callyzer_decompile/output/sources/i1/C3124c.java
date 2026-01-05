package i1;

import ex.InterfaceC2141e;
import m1.C4632n;
import m1.C4633o;
import m1.C4634p;
import m1.InterfaceC4630l;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.c */
/* loaded from: classes.dex */
public final class C3124c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16808a;

    /* renamed from: b */
    public int f16809b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3126e f16810c;

    /* renamed from: d */
    public final /* synthetic */ C4633o f16811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3124c(AbstractC3126e abstractC3126e, C4633o c4633o, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f16808a = i10;
        this.f16810c = abstractC3126e;
        this.f16811d = c4633o;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f16808a) {
            case 0:
                return new C3124c(this.f16810c, this.f16811d, interfaceC7559c, 0);
            case 1:
                return new C3124c(this.f16810c, this.f16811d, interfaceC7559c, 1);
            default:
                return new C3124c(this.f16810c, this.f16811d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f16808a) {
        }
        return ((C3124c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f16808a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f16809b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    InterfaceC4630l interfaceC4630l = this.f16810c.f16841s;
                    if (interfaceC4630l != null) {
                        C4632n c4632n = new C4632n(this.f16811d);
                        this.f16809b = 1;
                        if (interfaceC4630l.mo9501a(c4632n, this) == enumC7794a) {
                            return enumC7794a;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f16809b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    InterfaceC4630l interfaceC4630l2 = this.f16810c.f16841s;
                    if (interfaceC4630l2 != null) {
                        this.f16809b = 1;
                        if (interfaceC4630l2.mo9501a(this.f16811d, this) == enumC7794a2) {
                            return enumC7794a2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f16809b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    InterfaceC4630l interfaceC4630l3 = this.f16810c.f16841s;
                    if (interfaceC4630l3 != null) {
                        C4634p c4634p = new C4634p(this.f16811d);
                        this.f16809b = 1;
                        if (interfaceC4630l3.mo9501a(c4634p, this) == enumC7794a3) {
                            return enumC7794a3;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
