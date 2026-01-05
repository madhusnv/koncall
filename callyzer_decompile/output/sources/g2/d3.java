package g2;

import ex.InterfaceC2141e;
import q1.C6097y;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d3 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11363a;

    /* renamed from: b */
    public int f11364b;

    /* renamed from: c */
    public final /* synthetic */ C6097y f11365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(C6097y c6097y, int i10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f11363a = 4;
        this.f11365c = c6097y;
        this.f11364b = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f11363a) {
            case 0:
                return new d3(this.f11365c, interfaceC7559c, 0);
            case 1:
                return new d3(this.f11365c, interfaceC7559c, 1);
            case 2:
                return new d3(this.f11365c, interfaceC7559c, 2);
            case 3:
                return new d3(this.f11365c, interfaceC7559c, 3);
            default:
                return new d3(this.f11365c, this.f11364b, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11363a) {
            case 0:
                return ((d3) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((d3) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 2:
                return ((d3) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 3:
                return ((d3) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                d3 d3Var = (d3) create((k1.d1) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                d3Var.invokeSuspend(a0Var);
                return a0Var;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f11363a;
        Object obj2 = qw.a0.f30746a;
        C6097y c6097y = this.f11365c;
        switch (i10) {
            case 0:
                Object obj3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f11364b;
                try {
                    if (i11 == 0) {
                        og.od.m10798c(obj);
                        int iM8526f = c6097y.f29773d.f29752b.m8526f() + 1;
                        this.f11364b = 1;
                        if (C6097y.m12131f(c6097y, iM8526f, this) == obj3) {
                            obj2 = obj3;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        og.od.m10798c(obj);
                    }
                } catch (IllegalArgumentException unused) {
                }
                return obj2;
            case 1:
                Object obj4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f11364b;
                try {
                    if (i12 == 0) {
                        og.od.m10798c(obj);
                        int iM8526f2 = c6097y.f29773d.f29752b.m8526f() - 1;
                        this.f11364b = 1;
                        if (C6097y.m12131f(c6097y, iM8526f2, this) == obj4) {
                            obj2 = obj4;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        og.od.m10798c(obj);
                    }
                } catch (IllegalArgumentException unused2) {
                }
                return obj2;
            case 2:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f11364b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return obj2;
                }
                og.od.m10798c(obj);
                int iM8526f3 = c6097y.f29773d.f29752b.m8526f() + 1;
                this.f11364b = 1;
                return C6097y.m12132j(c6097y, iM8526f3, this) == enumC7794a ? enumC7794a : obj2;
            case 3:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f11364b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return obj2;
                }
                og.od.m10798c(obj);
                int iM8526f4 = c6097y.f29773d.f29752b.m8526f() - 1;
                this.f11364b = 1;
                return C6097y.m12132j(c6097y, iM8526f4, this) == enumC7794a2 ? enumC7794a2 : obj2;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                og.od.m10798c(obj);
                c6097y.m12136k(this.f11364b);
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(C6097y c6097y, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f11363a = i10;
        this.f11365c = c6097y;
    }
}
