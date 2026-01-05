package xm;

import com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4791b;
import og.od;
import qw.C6366p;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40403a;

    /* renamed from: b */
    public int f40404b;

    /* renamed from: c */
    public /* synthetic */ Object f40405c;

    /* renamed from: d */
    public final /* synthetic */ x1 f40406d;

    /* renamed from: e */
    public final /* synthetic */ CallRecordingResponse f40407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(x1 x1Var, CallRecordingResponse callRecordingResponse, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40403a = i10;
        this.f40406d = x1Var;
        this.f40407e = callRecordingResponse;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40403a) {
            case 0:
                i1 i1Var = new i1(this.f40406d, this.f40407e, interfaceC7559c, 0);
                i1Var.f40405c = obj;
                return i1Var;
            case 1:
                i1 i1Var2 = new i1(this.f40406d, this.f40407e, interfaceC7559c, 1);
                i1Var2.f40405c = obj;
                return i1Var2;
            default:
                i1 i1Var3 = new i1(this.f40406d, this.f40407e, interfaceC7559c, 2);
                i1Var3.f40405c = obj;
                return i1Var3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40403a) {
        }
        return ((i1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f40403a;
        qw.a0 a0Var = qw.a0.f30746a;
        x1 x1Var = this.f40406d;
        CallRecordingResponse callRecordingResponse = this.f40407e;
        switch (i10) {
            case 0:
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f40405c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40404b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f40405c = interfaceC7266z;
                    this.f40404b = 1;
                    obj = x1.m15643c(x1Var, callRecordingResponse, this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return a0Var;
                }
                C4791b c4791b = callRecordingResponse.f7376a;
                if (c4791b != null) {
                    String str = c4791b.f23838g;
                    AbstractC4154l.m8920c(str);
                    C6366p c6366p = x1.f40986k;
                    x1Var.m15660h(str, c4791b);
                    return a0Var;
                }
                x1Var.f41000j.m16232g("callRecordingDelete", "can't delete recording file >>> callLog is null >>> callRecordingResposne :=" + callRecordingResponse + " ");
                return a0Var;
            case 1:
                InterfaceC7266z interfaceC7266z2 = (InterfaceC7266z) this.f40405c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f40404b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    this.f40405c = interfaceC7266z2;
                    this.f40404b = 1;
                    obj = x1.m15643c(x1Var, callRecordingResponse, this);
                    if (obj == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return a0Var;
                }
                C4791b c4791b2 = callRecordingResponse.f7376a;
                if (c4791b2 != null) {
                    String str2 = c4791b2.f23838g;
                    AbstractC4154l.m8920c(str2);
                    C6366p c6366p2 = x1.f40986k;
                    x1Var.m15660h(str2, c4791b2);
                    return a0Var;
                }
                x1Var.f41000j.m16232g("callRecordingDelete", "can't delete recording file >>> callLog is null >>> callRecordingResposne :=" + callRecordingResponse + " ");
                return a0Var;
            default:
                InterfaceC7266z interfaceC7266z3 = (InterfaceC7266z) this.f40405c;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f40404b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f40405c = interfaceC7266z3;
                    this.f40404b = 1;
                    obj = x1.m15643c(x1Var, callRecordingResponse, this);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return a0Var;
                }
                C4791b c4791b3 = callRecordingResponse.f7376a;
                if (c4791b3 != null) {
                    String str3 = c4791b3.f23838g;
                    AbstractC4154l.m8920c(str3);
                    C6366p c6366p3 = x1.f40986k;
                    x1Var.m15660h(str3, c4791b3);
                    return a0Var;
                }
                x1Var.f41000j.m16232g("callRecordingDelete", "can't delete recording file >>> callLog is null >>> callRecordingResponse :=" + callRecordingResponse + " ");
                return a0Var;
        }
    }
}
