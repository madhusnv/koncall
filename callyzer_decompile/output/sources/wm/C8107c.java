package wm;

import android.content.Context;
import com.websoptimization.callyzerbiz.services.CallMonitorService;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import rn.h0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wm.c */
/* loaded from: classes3.dex */
public final class C8107c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f38788a;

    /* renamed from: b */
    public int f38789b;

    /* renamed from: c */
    public final /* synthetic */ C8114j f38790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8107c(C8114j c8114j, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f38788a = i10;
        this.f38790c = c8114j;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f38788a) {
            case 0:
                return new C8107c(this.f38790c, interfaceC7559c, 0);
            case 1:
                return new C8107c(this.f38790c, interfaceC7559c, 1);
            case 2:
                return new C8107c(this.f38790c, interfaceC7559c, 2);
            default:
                return new C8107c(this.f38790c, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38788a) {
            case 0:
                return ((C8107c) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 1:
                return ((C8107c) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 2:
                return ((C8107c) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                return ((C8107c) create((Context) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f38788a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f38789b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f38789b = 1;
                    if (C8114j.m15290e(this.f38790c, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f38789b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f38789b = 1;
                    if (C8114j.m15290e(this.f38790c, this) == enumC7794a2) {
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
                h0 h0Var = this.f38790c.f38834i;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f38789b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    this.f38789b = 1;
                    obj = h0Var.f31523e.m15619b(this);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f38789b = 2;
                    if (h0Var.m12609J(this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f38789b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C8114j c8114j = this.f38790c;
                    CallMonitorService callMonitorService = c8114j.f38826a;
                    this.f38789b = 1;
                    if (C8114j.m15288c(c8114j, callMonitorService, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
