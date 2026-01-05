package sq;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import n1.AbstractC4941a;
import og.od;
import t1.AbstractC7000y;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m3 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33068a;

    /* renamed from: b */
    public int f33069b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7000y f33070c;

    /* renamed from: d */
    public final /* synthetic */ int f33071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(AbstractC7000y abstractC7000y, int i10, InterfaceC7559c interfaceC7559c, int i11) {
        super(2, interfaceC7559c);
        this.f33068a = i11;
        this.f33070c = abstractC7000y;
        this.f33071d = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f33068a) {
            case 0:
                return new m3(this.f33070c, this.f33071d, interfaceC7559c, 0);
            case 1:
                return new m3(this.f33070c, this.f33071d, interfaceC7559c, 1);
            case 2:
                return new m3(this.f33070c, this.f33071d, interfaceC7559c, 2);
            default:
                return new m3(this.f33070c, this.f33071d, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33068a) {
            case 0:
                return ((m3) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((m3) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 2:
                return ((m3) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((m3) create((k1.d1) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f33068a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f33069b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f33069b = 1;
                    if (AbstractC7000y.m13259s(this.f33070c, this.f33071d, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f33069b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f33069b = 1;
                    if (this.f33070c.m13260f(this.f33071d, AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7), this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f33069b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    this.f33069b = 1;
                    if (this.f33070c.m13260f(this.f33071d, AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7), this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f33069b;
                qw.a0 a0Var = qw.a0.f30746a;
                AbstractC7000y abstractC7000y = this.f33070c;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f33069b = 1;
                    Object objM12844h = abstractC7000y.f33920w.m12844h(this);
                    if (objM12844h != enumC7794a4) {
                        objM12844h = a0Var;
                    }
                    if (objM12844h == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                double d2 = DefinitionKt.NO_Float_VALUE;
                if (-0.5d > d2 || d2 > 0.5d) {
                    AbstractC4941a.m9884a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                abstractC7000y.m13270t(abstractC7000y.m13262i(this.f33071d), DefinitionKt.NO_Float_VALUE, true);
                return a0Var;
        }
    }
}
