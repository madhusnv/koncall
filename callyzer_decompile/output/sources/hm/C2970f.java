package hm;

import android.content.Context;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.f */
/* loaded from: classes3.dex */
public final class C2970f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16056a;

    /* renamed from: b */
    public int f16057b;

    /* renamed from: c */
    public final /* synthetic */ PhoneStateReceiver f16058c;

    /* renamed from: d */
    public final /* synthetic */ Context f16059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2970f(PhoneStateReceiver phoneStateReceiver, Context context, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f16056a = i10;
        this.f16058c = phoneStateReceiver;
        this.f16059d = context;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f16056a) {
            case 0:
                return new C2970f(this.f16058c, this.f16059d, interfaceC7559c, 0);
            default:
                return new C2970f(this.f16058c, this.f16059d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f16056a) {
        }
        return ((C2970f) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f16056a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f16057b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f16057b = 1;
                    if (PhoneStateReceiver.m4596f(this.f16058c, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f16057b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f16057b = 1;
                    if (PhoneStateReceiver.m4596f(this.f16058c, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
