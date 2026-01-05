package ks;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import is.C3348b;
import java.util.List;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import wx.m1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21467a;

    /* renamed from: b */
    public final /* synthetic */ q0 f21468b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(q0 q0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f21467a = i10;
        this.f21468b = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21467a) {
            case 0:
                return new m0(this.f21468b, interfaceC7559c, 0);
            case 1:
                return new m0(this.f21468b, interfaceC7559c, 1);
            case 2:
                return new m0(this.f21468b, interfaceC7559c, 2);
            default:
                return new m0(this.f21468b, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21467a) {
            case 0:
                return ((m0) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                m0 m0Var = (m0) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                m0Var.invokeSuspend(a0Var);
                return a0Var;
            case 2:
                m0 m0Var2 = (m0) create((Throwable) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                m0Var2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                m0 m0Var3 = (m0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                m0Var3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f21467a;
        qw.a0 a0Var = qw.a0.f30746a;
        q0 q0Var = this.f21468b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                w0 w0Var = q0Var.f21513x;
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                q0Var.f21510u = true;
                break;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = q0Var.f21512w;
                if (((C3348b) q0Var.f21513x.f39340a.getValue()).f17723k) {
                    do {
                        value2 = m1Var.getValue();
                    } while (!m1Var.m15397i(value2, C3348b.m7669a((C3348b) value2, null, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1047551)));
                }
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, null, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048573)));
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = q0Var.f21501l;
                AbstractC5601a.m11254y(context, R.string.subscription_expired, "getString(...)", context);
                break;
        }
        return a0Var;
    }
}
