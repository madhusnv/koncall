package xp;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xp.c */
/* loaded from: classes3.dex */
public final class C8422c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41110a;

    /* renamed from: b */
    public /* synthetic */ Object f41111b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7266z f41112c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f41113d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f41114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8422c(InterfaceC7266z interfaceC7266z, InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41110a = i10;
        this.f41112c = interfaceC7266z;
        this.f41113d = interfaceC2137a;
        this.f41114e = interfaceC2139c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41110a) {
            case 0:
                C8422c c8422c = new C8422c(this.f41112c, this.f41113d, this.f41114e, interfaceC7559c, 0);
                c8422c.f41111b = obj;
                return c8422c;
            default:
                C8422c c8422c2 = new C8422c(this.f41112c, this.f41113d, this.f41114e, interfaceC7559c, 1);
                c8422c2.f41111b = obj;
                return c8422c2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41110a) {
            case 0:
                C8422c c8422c = (C8422c) create(num, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c8422c.invokeSuspend(a0Var);
                return a0Var;
            default:
                C8422c c8422c2 = (C8422c) create(num, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c8422c2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f41110a;
        a0 a0Var = a0.f30746a;
        InterfaceC7266z interfaceC7266z = this.f41112c;
        switch (i10) {
            case 0:
                Integer num = (Integer) this.f41111b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (num != null) {
                    c0.m13502y(interfaceC7266z, null, null, new C8421b(this.f41113d, num, this.f41114e, null, 0), 3);
                    break;
                }
                break;
            default:
                Integer num2 = (Integer) this.f41111b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (num2 != null) {
                    c0.m13502y(interfaceC7266z, null, null, new C8421b(this.f41113d, num2, this.f41114e, null, 1), 3);
                    break;
                }
                break;
        }
        return a0Var;
    }
}
