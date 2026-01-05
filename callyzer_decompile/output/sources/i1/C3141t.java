package i1;

import c3.C0847b;
import ex.InterfaceC2142f;
import m1.InterfaceC4630l;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.t */
/* loaded from: classes.dex */
public final class C3141t extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f16989a;

    /* renamed from: b */
    public int f16990b;

    /* renamed from: c */
    public /* synthetic */ k1.a1 f16991c;

    /* renamed from: d */
    public /* synthetic */ long f16992d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC3126e f16993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3141t(AbstractC3126e abstractC3126e, InterfaceC7559c interfaceC7559c, int i10) {
        super(3, interfaceC7559c);
        this.f16989a = i10;
        this.f16993e = abstractC3126e;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k1.a1 a1Var = (k1.a1) obj;
        C0847b c0847b = (C0847b) obj2;
        switch (this.f16989a) {
            case 0:
                long j6 = c0847b.f5352a;
                C3141t c3141t = new C3141t((C3142u) this.f16993e, (InterfaceC7559c) obj3, 0);
                c3141t.f16991c = a1Var;
                c3141t.f16992d = j6;
                return c3141t.invokeSuspend(qw.a0.f30746a);
            default:
                long j10 = c0847b.f5352a;
                C3141t c3141t2 = new C3141t((C3147z) this.f16993e, (InterfaceC7559c) obj3, 1);
                c3141t2.f16991c = a1Var;
                c3141t2.f16992d = j10;
                return c3141t2.invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM13488k;
        Object objM13488k2;
        switch (this.f16989a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f16990b;
                qw.a0 a0Var = qw.a0.f30746a;
                if (i10 == 0) {
                    od.m10798c(obj);
                    k1.a1 a1Var = this.f16991c;
                    long j6 = this.f16992d;
                    C3142u c3142u = (C3142u) this.f16993e;
                    if (c3142u.f16845x) {
                        this.f16990b = 1;
                        InterfaceC4630l interfaceC4630l = c3142u.f16841s;
                        if (interfaceC4630l == null || (objM13488k = tx.c0.m13488k(new C3123b(a1Var, j6, interfaceC4630l, c3142u, null), this)) != enumC7794a) {
                            objM13488k = a0Var;
                        }
                        if (objM13488k == enumC7794a) {
                            return enumC7794a;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f16990b;
                qw.a0 a0Var2 = qw.a0.f30746a;
                if (i11 == 0) {
                    od.m10798c(obj);
                    k1.a1 a1Var2 = this.f16991c;
                    long j10 = this.f16992d;
                    C3147z c3147z = (C3147z) this.f16993e;
                    if (c3147z.f16845x) {
                        this.f16990b = 1;
                        InterfaceC4630l interfaceC4630l2 = c3147z.f16841s;
                        if (interfaceC4630l2 == null || (objM13488k2 = tx.c0.m13488k(new C3123b(a1Var2, j10, interfaceC4630l2, c3147z, null), this)) != enumC7794a2) {
                            objM13488k2 = a0Var2;
                        }
                        if (objM13488k2 == enumC7794a2) {
                            return enumC7794a2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var2;
        }
    }
}
