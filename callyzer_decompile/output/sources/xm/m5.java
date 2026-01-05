package xm;

import ex.InterfaceC2141e;
import fn.C2336i;
import km.C4120o;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m5 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40586a;

    /* renamed from: b */
    public int f40587b;

    /* renamed from: c */
    public final /* synthetic */ y5 f40588c;

    /* renamed from: d */
    public final /* synthetic */ boolean f40589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(y5 y5Var, boolean z6, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40586a = i10;
        this.f40588c = y5Var;
        this.f40589d = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40586a) {
            case 0:
                return new m5(this.f40588c, this.f40589d, interfaceC7559c, 0);
            case 1:
                return new m5(this.f40588c, this.f40589d, interfaceC7559c, 1);
            default:
                return new m5(this.f40588c, this.f40589d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40586a) {
        }
        return ((m5) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40586a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f40587b;
                qw.a0 a0Var = qw.a0.f30746a;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2336i c2336i = this.f40588c.f41050b;
                    this.f40587b = 1;
                    Object objM8887i = ((C4120o) c2336i.f10585a).m8887i("sim_state_change", this.f40589d, this);
                    if (objM8887i != enumC7794a) {
                        objM8887i = a0Var;
                    }
                    if (objM8887i == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40587b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C2336i c2336i2 = this.f40588c.f41050b;
                    this.f40587b = 1;
                    if (c2336i2.m6031k("is_device_deleted", this.f40589d, this) == enumC7794a2) {
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
                int i12 = this.f40587b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f40588c.f41054f;
                    Boolean boolValueOf = Boolean.valueOf(this.f40589d);
                    this.f40587b = 1;
                    if (c7806h.mo14775g(boolValueOf, this) == enumC7794a3) {
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
