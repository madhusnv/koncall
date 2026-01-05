package dt;

import ex.InterfaceC2141e;
import og.od;
import pg.y8;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.m */
/* loaded from: classes3.dex */
public final class C1807m extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8741a;

    /* renamed from: b */
    public final /* synthetic */ C1813s f8742b;

    /* renamed from: c */
    public final /* synthetic */ String f8743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1807m(int i10, C1813s c1813s, String str, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8741a = i10;
        this.f8742b = c1813s;
        this.f8743c = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8741a) {
            case 0:
                return new C1807m(0, this.f8742b, this.f8743c, interfaceC7559c);
            case 1:
                return new C1807m(1, this.f8742b, this.f8743c, interfaceC7559c);
            default:
                return new C1807m(2, this.f8742b, this.f8743c, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8741a) {
            case 0:
                C1807m c1807m = (C1807m) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c1807m.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C1807m c1807m2 = (C1807m) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c1807m2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C1807m c1807m3 = (C1807m) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var3 = a0.f30746a;
                c1807m3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f8741a;
        a0 a0Var = a0.f30746a;
        String str = this.f8743c;
        C1813s c1813s = this.f8742b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                y8.m11952g(c1813s.f8762f, str);
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                y8.m11952g(c1813s.f8762f, str);
                break;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                y8.m11952g(c1813s.f8762f, str);
                break;
        }
        return a0Var;
    }
}
