package dt;

import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.u */
/* loaded from: classes3.dex */
public final class C1815u extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8779a;

    /* renamed from: b */
    public final /* synthetic */ C1818x f8780b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1815u(C1818x c1818x, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8779a = i10;
        this.f8780b = c1818x;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8779a) {
            case 0:
                return new C1815u(this.f8780b, interfaceC7559c, 0);
            case 1:
                return new C1815u(this.f8780b, interfaceC7559c, 1);
            default:
                return new C1815u(this.f8780b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8779a) {
            case 0:
                C1815u c1815u = (C1815u) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c1815u.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C1815u c1815u2 = (C1815u) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c1815u2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C1815u c1815u3 = (C1815u) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var3 = a0.f30746a;
                c1815u3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f8779a;
        a0 a0Var = a0.f30746a;
        C1818x c1818x = this.f8780b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                AbstractC5601a.m11254y(c1818x.f8791e, R.string.subscription_expired, "getString(...)", c1818x.f8789c);
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                AbstractC5601a.m11254y(c1818x.f8791e, R.string.subscription_expired, "getString(...)", c1818x.f8789c);
                break;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                AbstractC5601a.m11254y(c1818x.f8791e, R.string.copied_to_Clipboard, "getString(...)", c1818x.f8789c);
                break;
        }
        return a0Var;
    }
}
