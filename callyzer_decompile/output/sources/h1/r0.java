package h1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f15573a = 0;

    /* renamed from: b */
    public int f15574b;

    /* renamed from: c */
    public final /* synthetic */ x0 f15575c;

    /* renamed from: d */
    public final /* synthetic */ Object f15576d;

    /* renamed from: e */
    public final /* synthetic */ s1 f15577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x0 x0Var, Object obj, s1 s1Var, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f15575c = x0Var;
        this.f15576d = obj;
        this.f15577e = s1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f15573a) {
            case 0:
                return new r0(this.f15577e, this.f15575c, this.f15576d, interfaceC7559c);
            default:
                return new r0(this.f15575c, this.f15576d, this.f15577e, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f15573a) {
        }
        return ((r0) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f15573a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f15574b;
                s1 s1Var = this.f15577e;
                if (i10 == 0) {
                    od.m10798c(obj);
                    aw.d0 d0Var = new aw.d0(this.f15575c, this.f15576d, s1Var, (InterfaceC7559c) null, 6);
                    this.f15574b = 1;
                    if (tx.c0.m13488k(d0Var, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                s1Var.m6860i();
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f15574b;
                s1 s1Var2 = this.f15577e;
                if (i11 == 0) {
                    od.m10798c(obj);
                    x0 x0Var = this.f15575c;
                    x0Var.m6879T();
                    k2.e1 e1Var = x0Var.f15645b;
                    x0Var.f15655m = Long.MIN_VALUE;
                    x0Var.m6882W(DefinitionKt.NO_Float_VALUE);
                    Object value = x0Var.f15646c.getValue();
                    Object obj2 = this.f15576d;
                    float f6 = obj2.equals(value) ? -4.0f : obj2.equals(e1Var.getValue()) ? -5.0f : -3.0f;
                    s1Var2.m6867p(obj2);
                    s1Var2.m6865n(0L);
                    e1Var.setValue(obj2);
                    x0Var.m6882W(DefinitionKt.NO_Float_VALUE);
                    x0Var.mo319G(obj2);
                    s1Var2.m6861j(f6);
                    if (f6 == -3.0f) {
                        this.f15574b = 1;
                        if (x0.m6877R(x0Var, this) == enumC7794a2) {
                            return enumC7794a2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                s1Var2.m6860i();
                return qw.a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s1 s1Var, x0 x0Var, Object obj, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f15577e = s1Var;
        this.f15575c = x0Var;
        this.f15576d = obj;
    }
}
