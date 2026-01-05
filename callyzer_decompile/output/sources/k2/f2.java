package k2;

import ex.InterfaceC2141e;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f2 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f20382a;

    /* renamed from: b */
    public int f20383b;

    /* renamed from: c */
    public /* synthetic */ Object f20384c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2141e f20385d;

    /* renamed from: e */
    public final /* synthetic */ w0 f20386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(InterfaceC2141e interfaceC2141e, w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f20382a = i10;
        this.f20385d = interfaceC2141e;
        this.f20386e = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20382a) {
            case 0:
                f2 f2Var = new f2(this.f20385d, this.f20386e, interfaceC7559c, 0);
                f2Var.f20384c = obj;
                return f2Var;
            case 1:
                f2 f2Var2 = new f2(this.f20385d, this.f20386e, interfaceC7559c, 1);
                f2Var2.f20384c = obj;
                return f2Var2;
            default:
                f2 f2Var3 = new f2(this.f20385d, this.f20386e, interfaceC7559c, 2);
                f2Var3.f20384c = obj;
                return f2Var3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f20382a) {
        }
        return ((f2) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f20382a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f20383b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    k1 k1Var = new k1(this.f20386e, ((InterfaceC7266z) this.f20384c).mo1865w());
                    this.f20383b = 1;
                    if (this.f20385d.invoke(k1Var, this) == enumC7794a) {
                        return enumC7794a;
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
                int i11 = this.f20383b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    k1 k1Var2 = new k1(this.f20386e, ((InterfaceC7266z) this.f20384c).mo1865w());
                    this.f20383b = 1;
                    if (this.f20385d.invoke(k1Var2, this) == enumC7794a2) {
                        return enumC7794a2;
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
                int i12 = this.f20383b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    k1 k1Var3 = new k1(this.f20386e, ((InterfaceC7266z) this.f20384c).mo1865w());
                    this.f20383b = 1;
                    if (this.f20385d.invoke(k1Var3, this) == enumC7794a3) {
                        return enumC7794a3;
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
