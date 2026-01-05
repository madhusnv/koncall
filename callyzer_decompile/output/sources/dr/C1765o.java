package dr;

import android.content.Context;
import bu.C0782a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import tx.InterfaceC7266z;
import tx.c0;
import ur.i0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import xm.q4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.o */
/* loaded from: classes3.dex */
public final class C1765o extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8575a;

    /* renamed from: b */
    public final /* synthetic */ C1775y f8576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1765o(C1775y c1775y, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8575a = i10;
        this.f8576b = c1775y;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8575a) {
            case 0:
                return new C1765o(this.f8576b, interfaceC7559c, 0);
            case 1:
                return new C1765o(this.f8576b, interfaceC7559c, 1);
            case 2:
                return new C1765o(this.f8576b, interfaceC7559c, 2);
            case 3:
                return new C1765o(this.f8576b, interfaceC7559c, 3);
            default:
                return new C1765o(this.f8576b, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8575a) {
            case 0:
                return ((C1765o) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                C1765o c1765o = (C1765o) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c1765o.invokeSuspend(a0Var);
                return a0Var;
            case 2:
                C1765o c1765o2 = (C1765o) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c1765o2.invokeSuspend(a0Var2);
                return a0Var2;
            case 3:
                C1765o c1765o3 = (C1765o) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                c1765o3.invokeSuspend(a0Var3);
                return a0Var3;
            default:
                C1765o c1765o4 = (C1765o) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var4 = qw.a0.f30746a;
                c1765o4.invokeSuspend(a0Var4);
                return a0Var4;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f8575a;
        qw.a0 a0Var = qw.a0.f30746a;
        C1775y c1775y = this.f8576b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c1775y.f36252b;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, i0.m14293a((i0) value, null, null, null, c1775y.f8620D, null, 23)));
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var2 = c1775y.f36252b;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, i0.m14293a((i0) value2, null, null, null, null, null, 23)));
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = c1775y.f8623f;
                AbstractC5601a.m11254y(context, R.string.subscription_expired, "getString(...)", context);
                break;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                q4 q4Var = c1775y.f8633p.f22367a;
                c0.m13502y(q4Var.f40743c, null, null, new C0782a(q4Var, null, 29), 3);
                break;
        }
        return a0Var;
    }
}
