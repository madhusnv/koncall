package xp;

import ar.C0413c;
import br.C0739b;
import br.C0740c;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import jp.C3830k;
import og.od;
import qp.C6273j;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xp.b */
/* loaded from: classes3.dex */
public final class C8421b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41106a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f41107b;

    /* renamed from: c */
    public final /* synthetic */ Integer f41108c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f41109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8421b(InterfaceC2137a interfaceC2137a, Integer num, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41106a = i10;
        this.f41107b = interfaceC2137a;
        this.f41108c = num;
        this.f41109d = interfaceC2139c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41106a) {
            case 0:
                return new C8421b(this.f41107b, this.f41108c, this.f41109d, interfaceC7559c, 0);
            default:
                return new C8421b(this.f41107b, this.f41108c, this.f41109d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41106a) {
            case 0:
                C8421b c8421b = (C8421b) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c8421b.invokeSuspend(a0Var);
                return a0Var;
            default:
                C8421b c8421b2 = (C8421b) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c8421b2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f41106a;
        a0 a0Var = a0.f30746a;
        InterfaceC2139c interfaceC2139c = this.f41109d;
        Integer num = this.f41108c;
        InterfaceC2137a interfaceC2137a = this.f41107b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6273j c6273j = (C6273j) interfaceC2137a.invoke();
                if (!c6273j.f30447d && !c6273j.f30446c && num.intValue() >= c6273j.f30444a.size() - 5) {
                    interfaceC2139c.invoke(C3830k.f19782a);
                    break;
                }
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C0739b c0739b = ((C0740c) interfaceC2137a.invoke()).f4669c;
                if (!c0739b.f4659b && !c0739b.f4663f && num.intValue() >= r6.f4669c.f4658a.size() - 5) {
                    interfaceC2139c.invoke(C0413c.f3130a);
                    break;
                }
                break;
        }
        return a0Var;
    }
}
