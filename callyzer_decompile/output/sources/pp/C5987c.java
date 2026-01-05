package pp;

import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import qp.C6270g;
import qw.a0;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pp.c */
/* loaded from: classes3.dex */
public final class C5987c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29261a;

    /* renamed from: b */
    public final /* synthetic */ C5995k f29262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5987c(C5995k c5995k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f29261a = i10;
        this.f29262b = c5995k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29261a) {
            case 0:
                return new C5987c(this.f29262b, interfaceC7559c, 0);
            default:
                return new C5987c(this.f29262b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29261a) {
            case 0:
                C5987c c5987c = (C5987c) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c5987c.invokeSuspend(a0Var);
                return a0Var;
            default:
                return ((C5987c) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f29261a;
        C5995k c5995k = this.f29262b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c5995k.f29300k, null, null, new C5988d(c5995k, null, 1), 3);
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(((C6270g) c5995k.f29307r.f39340a.getValue()).f30421j + 1);
        }
    }
}
