package xm;

import b8.C0615j;
import ex.InterfaceC2141e;
import fn.C2336i;
import j$.time.LocalDateTime;
import km.C4120o;
import og.od;
import og.pe;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.C8800o;
import zc.C8930g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y4 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41046a;

    /* renamed from: b */
    public int f41047b;

    /* renamed from: c */
    public final /* synthetic */ y5 f41048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(y5 y5Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41046a = i10;
        this.f41048c = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41046a) {
            case 0:
                return new y4(this.f41048c, interfaceC7559c, 0);
            case 1:
                return new y4(this.f41048c, interfaceC7559c, 1);
            case 2:
                return new y4(this.f41048c, interfaceC7559c, 2);
            case 3:
                return new y4(this.f41048c, interfaceC7559c, 3);
            case 4:
                return new y4(this.f41048c, interfaceC7559c, 4);
            case 5:
                return new y4(this.f41048c, interfaceC7559c, 5);
            case 6:
                return new y4(this.f41048c, interfaceC7559c, 6);
            default:
                return new y4(this.f41048c, interfaceC7559c, 7);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41046a) {
        }
        return ((y4) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f41046a;
        InterfaceC7559c interfaceC7559c = null;
        int i11 = 3;
        int i12 = 0;
        y5 y5Var = this.f41048c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f41047b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    gn.x2 x2Var = y5Var.f41049a;
                    this.f41047b = 1;
                    obj = x2Var.m6704x(this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                String str = (String) obj;
                return str == null ? "" : str;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f41047b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    C0615j c0615jM15690f = y5Var.m15690f();
                    b5 b5Var = new b5(y5Var, interfaceC7559c, i12);
                    this.f41047b = 1;
                    if (wx.c1.m15379j(c0615jM15690f, b5Var, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f41047b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    this.f41047b = 1;
                    obj = tx.c0.m13475K(y5Var.f41052d.f42488a, new y4(y5Var, interfaceC7559c, i11), this);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                LocalDateTime localDateTime = (LocalDateTime) obj;
                if (localDateTime != null) {
                    return localDateTime;
                }
                C8800o c8800o = C8800o.f42459a;
                return C8800o.m16204m();
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f41047b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var2 = y5Var.f41049a;
                this.f41047b = 1;
                Object objM10839n = pe.m10839n(this, x2Var2.f14944d.f1209a, true, false, new an.j5(4));
                return objM10839n == enumC7794a4 ? enumC7794a4 : objM10839n;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f41047b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var3 = y5Var.f41049a;
                this.f41047b = 1;
                Object objM10839n2 = pe.m10839n(this, x2Var3.f14944d.f1209a, true, false, new an.j5(i11));
                return objM10839n2 == enumC7794a5 ? enumC7794a5 : objM10839n2;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f41047b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var4 = y5Var.f41049a;
                this.f41047b = 1;
                Object objM10839n3 = pe.m10839n(this, x2Var4.f14944d.f1209a, true, false, new C8930g(1));
                return objM10839n3 == enumC7794a6 ? enumC7794a6 : objM10839n3;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f41047b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C2336i c2336i = y5Var.f41050b;
                this.f41047b = 1;
                Object objM6022b = c2336i.m6022b("sim_state_change", this);
                return objM6022b == enumC7794a7 ? enumC7794a7 : objM6022b;
            default:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i20 = this.f41047b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C2336i c2336i2 = y5Var.f41050b;
                this.f41047b = 1;
                Object objM8879a = ((C4120o) c2336i2.f10585a).m8879a("is_sync_only_lead_numbers", this);
                return objM8879a == enumC7794a8 ? enumC7794a8 : objM8879a;
        }
    }
}
