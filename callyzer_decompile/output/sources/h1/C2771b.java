package h1;

import ex.InterfaceC2139c;
import og.od;
import t8.AbstractC7075u;
import tx.C7251k;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.b */
/* loaded from: classes.dex */
public final class C2771b extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f15351a;

    /* renamed from: b */
    public final /* synthetic */ Object f15352b;

    /* renamed from: c */
    public final /* synthetic */ Object f15353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2771b(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(1, interfaceC7559c);
        this.f15351a = i10;
        this.f15352b = obj;
        this.f15353c = obj2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f15351a) {
            case 0:
                return new C2771b((C2772c) this.f15352b, this.f15353c, interfaceC7559c, 0);
            default:
                return new C2771b((rn.h0) this.f15352b, (C7251k) this.f15353c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f15351a) {
            case 0:
                C2771b c2771b = (C2771b) create(interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                c2771b.invokeSuspend(a0Var);
                return a0Var;
            default:
                C2771b c2771b2 = (C2771b) create(interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c2771b2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f15351a;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj2 = this.f15353c;
        Object obj3 = this.f15352b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2772c c2772c = (C2772c) obj3;
                C2772c.m6773b(c2772c);
                Object objM6772a = C2772c.m6772a(c2772c, obj2);
                c2772c.f15360c.f15490b.setValue(objM6772a);
                c2772c.f15362e.setValue(objM6772a);
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((rn.h0) obj3).f31531m.m16231f("uploadList is null");
                ((C7251k) obj2).resumeWith(AbstractC7075u.m13370b());
                break;
        }
        return a0Var;
    }
}
