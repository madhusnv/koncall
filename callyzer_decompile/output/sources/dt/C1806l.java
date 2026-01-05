package dt;

import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import og.od;
import pg.f9;
import pg.y8;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.l */
/* loaded from: classes3.dex */
public final class C1806l extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8739a;

    /* renamed from: b */
    public final /* synthetic */ C1813s f8740b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1806l(C1813s c1813s, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8739a = i10;
        this.f8740b = c1813s;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8739a) {
            case 0:
                return new C1806l(this.f8740b, interfaceC7559c, 0);
            case 1:
                return new C1806l(this.f8740b, interfaceC7559c, 1);
            default:
                return new C1806l(this.f8740b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8739a) {
            case 0:
                C1806l c1806l = (C1806l) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c1806l.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C1806l c1806l2 = (C1806l) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c1806l2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C1806l c1806l3 = (C1806l) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var3 = a0.f30746a;
                c1806l3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f8739a;
        a0 a0Var = a0.f30746a;
        C1813s c1813s = this.f8740b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                y8.m11952g(c1813s.f8762f, f9.m11628b(c1813s.f8763g, R.string.subscription_expired));
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                y8.m11952g(c1813s.f8762f, f9.m11628b(c1813s.f8763g, R.string.subscription_expired));
                break;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                y8.m11952g(c1813s.f8762f, f9.m11628b(c1813s.f8763g, R.string.subscription_expired));
                break;
        }
        return a0Var;
    }
}
