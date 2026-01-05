package nq;

import android.app.Activity;
import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import d9.AbstractC1666k;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nq.c */
/* loaded from: classes3.dex */
public final class C5131c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f25129a;

    /* renamed from: b */
    public /* synthetic */ boolean f25130b;

    /* renamed from: c */
    public final /* synthetic */ Context f25131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5131c(Context context, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f25129a = i10;
        this.f25131c = context;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f25129a) {
            case 0:
                C5131c c5131c = new C5131c(this.f25131c, interfaceC7559c, 0);
                c5131c.f25130b = ((Boolean) obj).booleanValue();
                return c5131c;
            default:
                C5131c c5131c2 = new C5131c(this.f25131c, interfaceC7559c, 1);
                c5131c2.f25130b = ((Boolean) obj).booleanValue();
                return c5131c2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f25129a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
            case 0:
                C5131c c5131c = (C5131c) create(bool, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c5131c.invokeSuspend(a0Var);
                return a0Var;
            default:
                C5131c c5131c2 = (C5131c) create(bool, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c5131c2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f25129a;
        a0 a0Var = a0.f30746a;
        Context context = this.f25131c;
        switch (i10) {
            case 0:
                boolean z6 = this.f25130b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (z6) {
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity != null) {
                        activity.finishAndRemoveTask();
                        break;
                    }
                }
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                AbstractC1666k.m5378a(context, RescheduleReceiver.class, this.f25130b);
                break;
        }
        return a0Var;
    }
}
