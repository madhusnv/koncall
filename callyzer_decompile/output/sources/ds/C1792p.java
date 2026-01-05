package ds;

import aw.C0473m;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import i1.y0;
import og.od;
import qw.a0;
import t1.AbstractC7000y;
import t1.b0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.p */
/* loaded from: classes3.dex */
public final class C1792p extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8690a;

    /* renamed from: b */
    public int f8691b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7000y f8692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1792p(AbstractC7000y abstractC7000y, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8690a = i10;
        this.f8692c = abstractC7000y;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8690a) {
            case 0:
                return new C1792p(this.f8692c, interfaceC7559c, 0);
            case 1:
                return new C1792p(this.f8692c, interfaceC7559c, 1);
            case 2:
                return new C1792p(this.f8692c, interfaceC7559c, 2);
            case 3:
                return new C1792p(this.f8692c, interfaceC7559c, 3);
            default:
                return new C1792p(this.f8692c, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8690a) {
        }
        return ((C1792p) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM13260f;
        Object objM13260f2;
        int i10 = this.f8690a;
        AbstractC7000y abstractC7000y = this.f8692c;
        a0 a0Var = a0.f30746a;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f8691b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f8691b = 1;
                    return AbstractC7000y.m13259s(abstractC7000y, 1, this) == enumC7794a ? enumC7794a : a0Var;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f8691b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    this.f8691b = 1;
                    return AbstractC7000y.m13259s(abstractC7000y, 1, this) == enumC7794a2 ? enumC7794a2 : a0Var;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return a0Var;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f8691b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                this.f8691b = 1;
                float f6 = b0.f33756a;
                if (abstractC7000y.m13263j() - 1 < 0 || (objM13260f = abstractC7000y.m13260f(abstractC7000y.m13263j() - 1, AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7), this)) != enumC7794a3) {
                    objM13260f = a0Var;
                }
                return objM13260f == enumC7794a3 ? enumC7794a3 : a0Var;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f8691b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                this.f8691b = 1;
                float f10 = b0.f33756a;
                if (abstractC7000y.m13263j() + 1 >= abstractC7000y.mo13252l() || (objM13260f2 = abstractC7000y.m13260f(abstractC7000y.m13263j() + 1, AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7), this)) != enumC7794a4) {
                    objM13260f2 = a0Var;
                }
                return objM13260f2 == enumC7794a4 ? enumC7794a4 : a0Var;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f8691b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                this.f8691b = 1;
                y0 y0Var = y0.Default;
                C0473m c0473m = new C0473m(2, 3, null);
                abstractC7000y.getClass();
                Object objM13258r = AbstractC7000y.m13258r(abstractC7000y, y0Var, c0473m, this);
                if (objM13258r != enumC7794a5) {
                    objM13258r = a0Var;
                }
                return objM13258r == enumC7794a5 ? enumC7794a5 : a0Var;
        }
    }
}
