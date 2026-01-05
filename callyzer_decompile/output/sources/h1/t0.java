package h1;

import ab.C0084b;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f15608a;

    /* renamed from: b */
    public /* synthetic */ Object f15609b;

    /* renamed from: c */
    public final /* synthetic */ Object f15610c;

    /* renamed from: d */
    public final /* synthetic */ Object f15611d;

    /* renamed from: e */
    public final /* synthetic */ x0 f15612e;

    /* renamed from: f */
    public final /* synthetic */ s1 f15613f;

    /* renamed from: g */
    public final /* synthetic */ float f15614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Object obj, Object obj2, x0 x0Var, s1 s1Var, float f6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f15610c = obj;
        this.f15611d = obj2;
        this.f15612e = x0Var;
        this.f15613f = s1Var;
        this.f15614g = f6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        t0 t0Var = new t0(this.f15610c, this.f15611d, this.f15612e, this.f15613f, this.f15614g, interfaceC7559c);
        t0Var.f15609b = obj;
        return t0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15608a;
        qw.a0 a0Var = qw.a0.f30746a;
        x0 x0Var = this.f15612e;
        if (i10 == 0) {
            od.m10798c(obj);
            InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f15609b;
            Object obj2 = this.f15610c;
            Object obj3 = this.f15611d;
            InterfaceC7559c interfaceC7559c = null;
            if (AbstractC4154l.m8918a(obj2, obj3)) {
                x0Var.f15657p = null;
                if (AbstractC4154l.m8918a(x0Var.f15646c.getValue(), obj2)) {
                    return a0Var;
                }
            } else {
                x0.m6873N(x0Var);
            }
            boolean zM8918a = AbstractC4154l.m8918a(obj2, obj3);
            float f6 = this.f15614g;
            if (!zM8918a) {
                s1 s1Var = this.f15613f;
                s1Var.m6867p(obj2);
                s1Var.m6865n(0L);
                x0Var.f15645b.setValue(obj2);
                s1Var.m6861j(f6);
            }
            x0Var.m6882W(f6);
            if (x0Var.f15656n.m5550h()) {
                tx.c0.m13502y(interfaceC7266z, null, null, new C0084b(x0Var, interfaceC7559c, 18), 3);
            } else {
                x0Var.f15655m = Long.MIN_VALUE;
            }
            this.f15608a = 1;
            if (x0.m6877R(x0Var, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        x0Var.m6881V();
        return a0Var;
    }
}
