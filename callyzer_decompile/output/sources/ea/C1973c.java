package ea;

import dy.AbstractC1856d;
import ex.InterfaceC2139c;
import gc.AbstractC2562f;
import ja.C3616j;
import og.od;
import pg.z7;
import qw.a0;
import ud.InterfaceC7411o;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ea.c */
/* loaded from: classes.dex */
public final class C1973c extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f9231a;

    /* renamed from: b */
    public int f9232b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7411o f9233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1973c(InterfaceC7411o interfaceC7411o, InterfaceC7559c interfaceC7559c, int i10) {
        super(1, interfaceC7559c);
        this.f9231a = i10;
        this.f9233c = interfaceC7411o;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f9231a) {
            case 0:
                return new C1973c(this.f9233c, interfaceC7559c, 0);
            case 1:
                return new C1973c(this.f9233c, interfaceC7559c, 1);
            case 2:
                return new C1973c(this.f9233c, interfaceC7559c, 2);
            case 3:
                return new C1973c(this.f9233c, interfaceC7559c, 3);
            case 4:
                return new C1973c(this.f9233c, interfaceC7559c, 4);
            case 5:
                return new C1973c(this.f9233c, interfaceC7559c, 5);
            default:
                return new C1973c(this.f9233c, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f9231a) {
        }
        return ((C1973c) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9231a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f9232b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f9232b = 1;
                Object objM11964a = z7.m11964a(this.f9233c, this);
                return objM11964a == enumC7794a ? enumC7794a : objM11964a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f9232b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f9232b = 1;
                    InterfaceC7411o interfaceC7411o = this.f9233c;
                    new C1973c(interfaceC7411o, null, 4);
                    AbstractC1856d.m5490a();
                    obj = AbstractC2562f.m6572a(AbstractC1976f.f9254m, interfaceC7411o);
                    if (obj == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return (String) obj;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f9232b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    this.f9232b = 1;
                    InterfaceC7411o interfaceC7411o2 = this.f9233c;
                    new C1973c(interfaceC7411o2, null, 3);
                    AbstractC1856d.m5490a();
                    obj = AbstractC2562f.m6572a(AbstractC1976f.f9251j, interfaceC7411o2);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f9232b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f9232b = 1;
                    obj = z7.m11964a(this.f9233c, this);
                    if (obj == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return ((C3616j) obj).m8167a();
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f9232b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    this.f9232b = 1;
                    obj = z7.m11964a(this.f9233c, this);
                    if (obj == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return ((C3616j) obj).m8167a();
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f9232b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    this.f9232b = 1;
                    obj = z7.m11964a(this.f9233c, this);
                    if (obj == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return ((C3616j) obj).m8167a();
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f9232b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    this.f9232b = 1;
                    obj = z7.m11964a(this.f9233c, this);
                    if (obj == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return ((C3616j) obj).m8167a();
        }
    }
}
