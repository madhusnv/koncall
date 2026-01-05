package hm;

import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import ex.InterfaceC2141e;
import im.p1;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pv.C6042b;
import qw.a0;
import rn.h0;
import rw.C6668r;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import xm.C8418z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.d */
/* loaded from: classes3.dex */
public final class C2968d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16042a;

    /* renamed from: b */
    public int f16043b;

    /* renamed from: c */
    public final /* synthetic */ PhoneStateReceiver f16044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2968d(PhoneStateReceiver phoneStateReceiver, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f16042a = i10;
        this.f16044c = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f16042a) {
            case 0:
                return new C2968d(this.f16044c, interfaceC7559c, 0);
            case 1:
                return new C2968d(this.f16044c, interfaceC7559c, 1);
            case 2:
                return new C2968d(this.f16044c, interfaceC7559c, 2);
            case 3:
                return new C2968d(this.f16044c, interfaceC7559c, 3);
            default:
                return new C2968d(this.f16044c, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f16042a) {
        }
        return ((C2968d) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f16042a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f16043b;
                a0 a0Var = a0.f30746a;
                if (i10 == 0) {
                    od.m10798c(obj);
                    PhoneStateReceiver phoneStateReceiver = this.f16044c;
                    C8418z c8418zM4599i = phoneStateReceiver.m4599i();
                    List list = ((C6042b) phoneStateReceiver.f7306z.f39340a.getValue()).f29500a;
                    this.f16043b = 1;
                    Object objM6038r = c8418zM4599i.f41069a.m6038r(list, this);
                    if (objM6038r != enumC7794a) {
                        objM6038r = a0Var;
                    }
                    if (objM6038r == enumC7794a) {
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
                int i11 = this.f16043b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C8418z c8418zM4599i2 = this.f16044c.m4599i();
                    this.f16043b = 1;
                    if (c8418zM4599i2.m15721k(false, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f16043b;
                PhoneStateReceiver phoneStateReceiver2 = this.f16044c;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C8418z c8418zM4599i3 = phoneStateReceiver2.m4599i();
                    this.f16043b = 1;
                    if (c8418zM4599i3.m15721k(false, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                phoneStateReceiver2.m4603m().m9337b(p1.LEAD_NUMBERS_LIST, C6668r.f31943a);
                return a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f16043b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    PhoneStateReceiver phoneStateReceiver3 = this.f16044c;
                    String str = phoneStateReceiver3.f7285e;
                    this.f16043b = 1;
                    if (PhoneStateReceiver.m4594d(phoneStateReceiver3, str, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f16043b;
                PhoneStateReceiver phoneStateReceiver4 = this.f16044c;
                if (i14 == 0) {
                    od.m10798c(obj);
                    h0 h0Var = phoneStateReceiver4.f7287g;
                    if (h0Var == null) {
                        AbstractC4154l.m8928k("callRecordingUseCase");
                        throw null;
                    }
                    this.f16043b = 1;
                    obj = h0Var.f31523e.m15619b(this);
                    if (obj == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    h0 h0Var2 = phoneStateReceiver4.f7287g;
                    if (h0Var2 == null) {
                        AbstractC4154l.m8928k("callRecordingUseCase");
                        throw null;
                    }
                    this.f16043b = 2;
                    if (h0Var2.m12609J(this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                }
                return a0.f30746a;
        }
    }
}
