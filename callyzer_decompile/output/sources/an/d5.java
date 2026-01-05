package an;

import ex.InterfaceC2139c;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d5 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public int f747a;

    /* renamed from: b */
    public final /* synthetic */ g5 f748b;

    /* renamed from: c */
    public final /* synthetic */ int f749c;

    /* renamed from: d */
    public final /* synthetic */ int f750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(g5 g5Var, int i10, int i11, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f748b = g5Var;
        this.f749c = i10;
        this.f750d = i11;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new d5(this.f748b, this.f749c, this.f750d, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((d5) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f747a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        this.f747a = 1;
        g5 g5Var = this.f748b;
        g5Var.getClass();
        Object objM446b = g5.m446b(g5Var, this.f749c, this.f750d, this);
        return objM446b == enumC7794a ? enumC7794a : objM446b;
    }
}
