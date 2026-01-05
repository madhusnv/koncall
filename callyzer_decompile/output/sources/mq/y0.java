package mq;

import ex.InterfaceC2141e;
import og.od;
import qw.C6364n;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24355a;

    /* renamed from: b */
    public int f24356b;

    /* renamed from: c */
    public /* synthetic */ int f24357c;

    /* renamed from: d */
    public final /* synthetic */ a1 f24358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(a1 a1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24355a = i10;
        this.f24358d = a1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24355a) {
            case 0:
                y0 y0Var = new y0(this.f24358d, interfaceC7559c, 0);
                y0Var.f24357c = ((Number) obj).intValue();
                return y0Var;
            default:
                y0 y0Var2 = new y0(this.f24358d, interfaceC7559c, 1);
                y0Var2.f24357c = ((Number) obj).intValue();
                return y0Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f24355a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((y0) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM9789f;
        Object objM9789f2;
        switch (this.f24355a) {
            case 0:
                int i10 = this.f24357c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f24356b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    a1 a1Var = this.f24358d;
                    int i12 = a1Var.f24150q;
                    if (a1Var.f24144k) {
                        this.f24357c = i10;
                        this.f24356b = 1;
                        objM9789f = a1.m9788e(a1Var, i10 * i12, i12, this);
                        if (objM9789f == enumC7794a) {
                            return enumC7794a;
                        }
                    } else {
                        this.f24357c = i10;
                        this.f24356b = 2;
                        objM9789f = a1.m9789f(a1Var, i10 * i12, i12, this);
                        if (objM9789f == enumC7794a) {
                            return enumC7794a;
                        }
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM9789f = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM9789f);
            default:
                int i13 = this.f24357c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f24356b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    a1 a1Var2 = this.f24358d;
                    int i15 = a1Var2.f24150q;
                    if (a1Var2.f24144k) {
                        this.f24357c = i13;
                        this.f24356b = 1;
                        objM9789f2 = a1.m9788e(a1Var2, 0, i15 * i13, this);
                        if (objM9789f2 == enumC7794a2) {
                            return enumC7794a2;
                        }
                    } else {
                        this.f24357c = i13;
                        this.f24356b = 2;
                        objM9789f2 = a1.m9789f(a1Var2, 0, i15 * i13, this);
                        if (objM9789f2 == enumC7794a2) {
                            return enumC7794a2;
                        }
                    }
                } else {
                    if (i14 != 1 && i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM9789f2 = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM9789f2);
        }
    }
}
