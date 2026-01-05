package vr;

import ex.InterfaceC2141e;
import k2.w0;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vr.e */
/* loaded from: classes3.dex */
public final class C7737e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f37302a;

    /* renamed from: b */
    public final /* synthetic */ w0 f37303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7737e(w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f37302a = i10;
        this.f37303b = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f37302a) {
            case 0:
                return new C7737e(this.f37303b, interfaceC7559c, 0);
            case 1:
                return new C7737e(this.f37303b, interfaceC7559c, 1);
            default:
                return new C7737e(this.f37303b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f37302a) {
            case 0:
                C7737e c7737e = (C7737e) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                c7737e.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C7737e c7737e2 = (C7737e) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c7737e2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C7737e c7737e3 = (C7737e) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var3 = qw.a0.f30746a;
                c7737e3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f37302a;
        qw.a0 a0Var = qw.a0.f30746a;
        w0 w0Var = this.f37303b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (((Boolean) w0Var.getValue()).booleanValue()) {
                    w0Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (((Boolean) w0Var.getValue()).booleanValue()) {
                    w0Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (((Boolean) w0Var.getValue()).booleanValue()) {
                    w0Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
        return a0Var;
    }
}
