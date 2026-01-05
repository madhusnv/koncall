package su;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import im.p1;
import iu.C3349a;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.y8;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: su.g */
/* loaded from: classes3.dex */
public final class C6948g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33590a;

    /* renamed from: b */
    public final /* synthetic */ C6952k f33591b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6948g(C6952k c6952k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f33590a = i10;
        this.f33591b = c6952k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f33590a) {
            case 0:
                return new C6948g(this.f33591b, interfaceC7559c, 0);
            case 1:
                return new C6948g(this.f33591b, interfaceC7559c, 1);
            default:
                return new C6948g(this.f33591b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f33590a) {
            case 0:
                C6948g c6948g = (C6948g) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c6948g.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C6948g c6948g2 = (C6948g) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c6948g2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C6948g c6948g3 = (C6948g) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var3 = a0.f30746a;
                c6948g3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f33590a;
        a0 a0Var = a0.f30746a;
        C6952k c6952k = this.f33591b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = c6952k.f33624b;
                String string = context.getString(R.string.call_recording_folder_already_finding);
                AbstractC4154l.m8922e(string, "getString(...)");
                y8.m11950e(context, string);
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context2 = c6952k.f33624b;
                String string2 = context2.getString(R.string.call_recording_subscription_expired_notification_description);
                AbstractC4154l.m8922e(string2, "getString(...)");
                y8.m11950e(context2, string2);
                break;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c6952k.f33635m.m9337b(p1.LOG_FILE_UPLOAD_STATE, C3349a.f17731a);
                break;
        }
        return a0Var;
    }
}
