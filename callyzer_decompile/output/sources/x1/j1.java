package x1;

import c3.C0847b;
import ex.InterfaceC2142f;
import g2.pa;
import i1.C3122a;
import m1.InterfaceC4630l;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public int f39564a;

    /* renamed from: b */
    public /* synthetic */ k1.a1 f39565b;

    /* renamed from: c */
    public /* synthetic */ long f39566c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC7266z f39567d;

    /* renamed from: e */
    public final /* synthetic */ k2.w0 f39568e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC4630l f39569f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(InterfaceC7266z interfaceC7266z, k2.w0 w0Var, InterfaceC4630l interfaceC4630l, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f39567d = interfaceC7266z;
        this.f39568e = w0Var;
        this.f39569f = interfaceC4630l;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j6 = ((C0847b) obj2).f5352a;
        k2.w0 w0Var = this.f39568e;
        InterfaceC4630l interfaceC4630l = this.f39569f;
        j1 j1Var = new j1(this.f39567d, w0Var, interfaceC4630l, (InterfaceC7559c) obj3);
        j1Var.f39565b = (k1.a1) obj;
        j1Var.f39566c = j6;
        return j1Var.invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f39564a;
        InterfaceC7266z interfaceC7266z = this.f39567d;
        if (i10 == 0) {
            od.m10798c(obj);
            k1.a1 a1Var = this.f39565b;
            tx.c0.m13502y(interfaceC7266z, null, null, new C3122a(this.f39568e, this.f39566c, this.f39569f, null, 3), 3);
            this.f39564a = 1;
            obj = a1Var.m8440f(this);
            if (obj == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        tx.c0.m13502y(interfaceC7266z, null, null, new pa(this.f39568e, ((Boolean) obj).booleanValue(), this.f39569f, null), 3);
        return qw.a0.f30746a;
    }
}
