package an;

import ex.InterfaceC2139c;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f3 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f817a;

    /* renamed from: b */
    public int f818b;

    /* renamed from: c */
    public final /* synthetic */ int f819c;

    /* renamed from: d */
    public final /* synthetic */ Object f820d;

    /* renamed from: e */
    public final /* synthetic */ Object f821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(Object obj, int i10, Object obj2, InterfaceC7559c interfaceC7559c, int i11) {
        super(1, interfaceC7559c);
        this.f817a = i11;
        this.f820d = obj;
        this.f819c = i10;
        this.f821e = obj2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f817a) {
            case 0:
                return new f3((h3) this.f820d, this.f819c, (EnumC8993c) this.f821e, interfaceC7559c, 0);
            default:
                return new f3((g4) this.f820d, this.f819c, (String) this.f821e, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f817a) {
        }
        return ((f3) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f817a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f818b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                h3 h3Var = (h3) this.f820d;
                EnumC8993c enumC8993c = (EnumC8993c) this.f821e;
                this.f818b = 1;
                h3Var.getClass();
                Object objM458H = h3.m458H(h3Var, this.f819c, enumC8993c, this);
                return objM458H == enumC7794a ? enumC7794a : objM458H;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f818b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                g4 g4Var = (g4) this.f820d;
                String str = (String) this.f821e;
                this.f818b = 1;
                g4Var.getClass();
                Object objM445a = g4.m445a(g4Var, this.f819c, str, this);
                return objM445a == enumC7794a2 ? enumC7794a2 : objM445a;
        }
    }
}
