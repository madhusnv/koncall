package h1;

import ex.InterfaceC2139c;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public int f15617a;

    /* renamed from: b */
    public final /* synthetic */ Object f15618b;

    /* renamed from: c */
    public final /* synthetic */ Object f15619c;

    /* renamed from: d */
    public final /* synthetic */ x0 f15620d;

    /* renamed from: e */
    public final /* synthetic */ s1 f15621e;

    /* renamed from: f */
    public final /* synthetic */ float f15622f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Object obj, Object obj2, x0 x0Var, s1 s1Var, float f6, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f15618b = obj;
        this.f15619c = obj2;
        this.f15620d = x0Var;
        this.f15621e = s1Var;
        this.f15622f = f6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new u0(this.f15618b, this.f15619c, this.f15620d, this.f15621e, this.f15622f, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((u0) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15617a;
        if (i10 == 0) {
            od.m10798c(obj);
            t0 t0Var = new t0(this.f15618b, this.f15619c, this.f15620d, this.f15621e, this.f15622f, null);
            this.f15617a = 1;
            if (tx.c0.m13488k(t0Var, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }
}
