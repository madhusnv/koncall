package rn;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.y8;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f31491a;

    /* renamed from: b */
    public final /* synthetic */ h0 f31492b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(h0 h0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f31491a = i10;
        this.f31492b = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f31491a) {
            case 0:
                return new e0(this.f31492b, interfaceC7559c, 0);
            default:
                return new e0(this.f31492b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f31491a) {
            case 0:
                e0 e0Var = (e0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                e0Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                e0 e0Var2 = (e0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                e0Var2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f31491a;
        qw.a0 a0Var = qw.a0.f30746a;
        h0 h0Var = this.f31492b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = h0Var.f31519a;
                AbstractC5601a.m11254y(context, R.string.find_recording_already_running, "getString(...)", context);
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context2 = h0Var.f31519a;
                String string = context2.getString(R.string.recording_process_in_background);
                AbstractC4154l.m8922e(string, "getString(...)");
                y8.m11950e(context2, string);
                break;
        }
        return a0Var;
    }
}
