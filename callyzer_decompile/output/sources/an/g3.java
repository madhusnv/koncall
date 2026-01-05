package an;

import ex.InterfaceC2139c;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g3 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f855a;

    /* renamed from: b */
    public int f856b;

    /* renamed from: c */
    public final /* synthetic */ h3 f857c;

    /* renamed from: d */
    public final /* synthetic */ int f858d;

    /* renamed from: e */
    public final /* synthetic */ String f859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(h3 h3Var, int i10, String str, InterfaceC7559c interfaceC7559c, int i11) {
        super(1, interfaceC7559c);
        this.f855a = i11;
        this.f857c = h3Var;
        this.f858d = i10;
        this.f859e = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f855a) {
            case 0:
                return new g3(this.f857c, this.f858d, this.f859e, interfaceC7559c, 0);
            default:
                return new g3(this.f857c, this.f858d, this.f859e, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f855a) {
        }
        return ((g3) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f855a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f856b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f856b = 1;
                    h3 h3Var = this.f857c;
                    h3Var.getClass();
                    if (h3.m459I(h3Var, this.f858d, this.f859e, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f856b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f856b = 1;
                    h3 h3Var2 = this.f857c;
                    h3Var2.getClass();
                    if (h3.m460J(h3Var2, this.f858d, this.f859e, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
