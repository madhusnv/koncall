package an;

import ex.InterfaceC2139c;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c3 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f696a;

    /* renamed from: b */
    public int f697b;

    /* renamed from: c */
    public final /* synthetic */ h3 f698c;

    /* renamed from: d */
    public final /* synthetic */ int f699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(h3 h3Var, int i10, InterfaceC7559c interfaceC7559c, int i11) {
        super(1, interfaceC7559c);
        this.f696a = i11;
        this.f698c = h3Var;
        this.f699d = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f696a) {
            case 0:
                return new c3(this.f698c, this.f699d, interfaceC7559c, 0);
            default:
                return new c3(this.f698c, this.f699d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f696a) {
        }
        return ((c3) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f696a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f697b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f697b = 1;
                h3 h3Var = this.f698c;
                h3Var.getClass();
                Object objM451A = h3.m451A(h3Var, this.f699d, this);
                return objM451A == enumC7794a ? enumC7794a : objM451A;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f697b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f697b = 1;
                h3 h3Var2 = this.f698c;
                h3Var2.getClass();
                Object objM453C = h3.m453C(h3Var2, this.f699d, this);
                return objM453C == enumC7794a2 ? enumC7794a2 : objM453C;
        }
    }
}
