package aw;

import ap.C0388a;
import com.websoptimization.callyzerbiz.workManager.SyncCallLogNotificationManager;
import ex.InterfaceC2141e;
import im.EnumC3320v;
import og.od;
import t8.EnumC7068n;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.c1;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3360a;

    /* renamed from: b */
    public int f3361b;

    /* renamed from: c */
    public final /* synthetic */ SyncCallLogNotificationManager f3362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(SyncCallLogNotificationManager syncCallLogNotificationManager, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3360a = i10;
        this.f3362c = syncCallLogNotificationManager;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3360a) {
            case 0:
                return new g0(this.f3362c, interfaceC7559c, 0);
            default:
                return new g0(this.f3362c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3360a) {
        }
        return ((g0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3360a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f3361b;
                SyncCallLogNotificationManager syncCallLogNotificationManager = this.f3362c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    ao.c0 c0Var = syncCallLogNotificationManager.f7512e;
                    this.f3361b = 1;
                    obj = c0Var.m1394i("SyncNotificationManager", this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
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
                C0388a c0388a = new C0388a(syncCallLogNotificationManager, null, 4);
                this.f3361b = 2;
                if (c1.m15379j((InterfaceC8209j) obj, c0388a, this) == enumC7794a) {
                    return enumC7794a;
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f3361b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C9000c c9000c = this.f3362c.f7510c;
                    EnumC3320v enumC3320v = EnumC3320v.IDEAL_SYNC;
                    EnumC7068n enumC7068n = EnumC7068n.APPEND_OR_REPLACE;
                    this.f3361b = 1;
                    if (c9000c.m16472h(0L, true, enumC3320v, enumC7068n, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
