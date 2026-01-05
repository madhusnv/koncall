package cv;

import androidx.compose.material3.internal.AbstractC0257a;
import c9.C0925t;
import ex.InterfaceC2141e;
import g2.ja;
import g2.ka;
import h2.d0;
import k2.a1;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.x */
/* loaded from: classes3.dex */
public final class C1528x extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7694a;

    /* renamed from: b */
    public int f7695b;

    /* renamed from: c */
    public final /* synthetic */ ja f7696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1528x(ja jaVar, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f7694a = i10;
        this.f7696c = jaVar;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f7694a) {
            case 0:
                return new C1528x(this.f7696c, interfaceC7559c, 0);
            case 1:
                return new C1528x(this.f7696c, interfaceC7559c, 1);
            case 2:
                return new C1528x(this.f7696c, interfaceC7559c, 2);
            case 3:
                return new C1528x(this.f7696c, interfaceC7559c, 3);
            case 4:
                return new C1528x(this.f7696c, interfaceC7559c, 4);
            case 5:
                return new C1528x(this.f7696c, interfaceC7559c, 5);
            case 6:
                return new C1528x(this.f7696c, interfaceC7559c, 6);
            case 7:
                return new C1528x(this.f7696c, interfaceC7559c, 7);
            case 8:
                return new C1528x(this.f7696c, interfaceC7559c, 8);
            case 9:
                return new C1528x(this.f7696c, interfaceC7559c, 9);
            case 10:
                return new C1528x(this.f7696c, interfaceC7559c, 10);
            case 11:
                return new C1528x(this.f7696c, interfaceC7559c, 11);
            case 12:
                return new C1528x(this.f7696c, interfaceC7559c, 12);
            default:
                return new C1528x(this.f7696c, interfaceC7559c, 13);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f7694a) {
        }
        return ((C1528x) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f7694a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f7695b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f7695b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6182d(this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f7695b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f7695b;
                a0 a0Var = a0.f30746a;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    ja jaVar = this.f7696c;
                    d0 d0VarM2679h = jaVar.f11872b.m2679h();
                    ka kaVar = ka.PartiallyExpanded;
                    if (!d0VarM2679h.f15693a.containsKey(kaVar)) {
                        kaVar = ka.Expanded;
                    }
                    Object objM6179a = ja.m6179a(jaVar, kaVar, this);
                    if (objM6179a != enumC7794a4) {
                        objM6179a = a0Var;
                    }
                    if (objM6179a == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f7695b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f7695b;
                a0 a0Var2 = a0.f30746a;
                if (i15 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    C0925t c0925t = this.f7696c.f11872b;
                    Object objM705b = AbstractC0257a.m705b(c0925t, ka.Expanded, ((a1) c0925t.f5661k).m8490f(), this);
                    if (objM705b != enumC7794a6) {
                        objM705b = a0Var2;
                    }
                    if (objM705b == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var2;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f7695b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6182d(this) == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f7695b;
                if (i17 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a8) {
                        return enumC7794a8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 8:
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f7695b;
                if (i18 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a9) {
                        return enumC7794a9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 9:
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f7695b;
                if (i19 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a10) {
                        return enumC7794a10;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 10:
                EnumC7794a enumC7794a11 = EnumC7794a.COROUTINE_SUSPENDED;
                int i20 = this.f7695b;
                if (i20 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a11) {
                        return enumC7794a11;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 11:
                EnumC7794a enumC7794a12 = EnumC7794a.COROUTINE_SUSPENDED;
                int i21 = this.f7695b;
                if (i21 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a12) {
                        return enumC7794a12;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 12:
                EnumC7794a enumC7794a13 = EnumC7794a.COROUTINE_SUSPENDED;
                int i22 = this.f7695b;
                if (i22 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a13) {
                        return enumC7794a13;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a14 = EnumC7794a.COROUTINE_SUSPENDED;
                int i23 = this.f7695b;
                if (i23 == 0) {
                    od.m10798c(obj);
                    this.f7695b = 1;
                    if (this.f7696c.m6180b(this) == enumC7794a14) {
                        return enumC7794a14;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
