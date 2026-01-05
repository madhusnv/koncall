package an;

import ex.InterfaceC2139c;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e3 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public int f779a;

    /* renamed from: b */
    public final /* synthetic */ h3 f780b;

    /* renamed from: c */
    public final /* synthetic */ int f781c;

    /* renamed from: d */
    public final /* synthetic */ boolean f782d;

    /* renamed from: e */
    public final /* synthetic */ boolean f783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(h3 h3Var, int i10, boolean z6, boolean z10, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f780b = h3Var;
        this.f781c = i10;
        this.f782d = z6;
        this.f783e = z10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new e3(this.f780b, this.f781c, this.f782d, this.f783e, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((e3) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f779a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        this.f779a = 1;
        h3 h3Var = this.f780b;
        h3Var.getClass();
        Object objM456F = h3.m456F(h3Var, this.f781c, this.f782d, this.f783e, this);
        return objM456F == enumC7794a ? enumC7794a : objM456F;
    }
}
