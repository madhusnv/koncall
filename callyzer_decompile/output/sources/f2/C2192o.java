package f2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import h1.C2772c;
import h1.InterfaceC2779j;
import h1.m0;
import h1.q1;
import h1.r0;
import h1.s1;
import h1.x0;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.o */
/* loaded from: classes.dex */
public final class C2192o extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10105a = 2;

    /* renamed from: b */
    public float f10106b;

    /* renamed from: c */
    public int f10107c;

    /* renamed from: d */
    public /* synthetic */ Object f10108d;

    /* renamed from: e */
    public final /* synthetic */ Object f10109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192o(float f6, x0 x0Var, C4409i c4409i, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f10106b = f6;
        this.f10108d = x0Var;
        this.f10109e = c4409i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10105a) {
            case 0:
                return new C2192o((C2193p) this.f10108d, this.f10106b, (InterfaceC2779j) this.f10109e, interfaceC7559c);
            case 1:
                C2192o c2192o = new C2192o((s1) this.f10109e, interfaceC7559c);
                c2192o.f10108d = obj;
                return c2192o;
            default:
                return new C2192o(this.f10106b, (x0) this.f10108d, (C4409i) this.f10109e, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f10105a) {
        }
        return ((C2192o) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        float fM6791n;
        InterfaceC7266z interfaceC7266z;
        Object objM6837a;
        switch (this.f10105a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f10107c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2772c c2772c = (C2772c) ((C2193p) this.f10108d).f10112c;
                    Float f6 = new Float(this.f10106b);
                    InterfaceC2779j interfaceC2779j = (InterfaceC2779j) this.f10109e;
                    this.f10107c = 1;
                    if (C2772c.m6774c(c2772c, f6, interfaceC2779j, this, 12) == enumC7794a) {
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
                int i11 = this.f10107c;
                if (i11 == 0) {
                    od.m10798c(obj);
                    InterfaceC7266z interfaceC7266z2 = (InterfaceC7266z) this.f10108d;
                    fM6791n = AbstractC2773d.m6791n(interfaceC7266z2.mo1865w());
                    interfaceC7266z = interfaceC7266z2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fM6791n = this.f10106b;
                    interfaceC7266z = (InterfaceC7266z) this.f10108d;
                    od.m10798c(obj);
                }
                while (c0.m13499v(interfaceC7266z)) {
                    q1 q1Var = new q1((s1) this.f10109e, fM6791n);
                    this.f10108d = interfaceC7266z;
                    this.f10106b = fM6791n;
                    this.f10107c = 1;
                    if (C3953b.m8515r(getContext()).mo8536u(q1Var, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                }
                return a0.f30746a;
            default:
                x0 x0Var = (x0) this.f10108d;
                float f10 = this.f10106b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f10107c;
                a0 a0Var = a0.f30746a;
                if (i12 == 0) {
                    od.m10798c(obj);
                    if (f10 > DefinitionKt.NO_Float_VALUE) {
                        this.f10107c = 1;
                        if (x0Var.m6880U(f10, x0Var.f15645b.getValue(), this) == enumC7794a3) {
                            return enumC7794a3;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0Var;
                    }
                    od.m10798c(obj);
                }
                if (f10 == DefinitionKt.NO_Float_VALUE) {
                    C4409i c4409i = (C4409i) this.f10109e;
                    this.f10107c = 2;
                    s1 s1Var = x0Var.f15648e;
                    if (s1Var == null || ((AbstractC4154l.m8918a(x0Var.f15646c.getValue(), c4409i) && AbstractC4154l.m8918a(x0Var.f15645b.getValue(), c4409i)) || (objM6837a = m0.m6837a(x0Var.f15654l, new r0(x0Var, c4409i, s1Var, (InterfaceC7559c) null), this)) != enumC7794a3)) {
                        objM6837a = a0Var;
                    }
                    if (objM6837a == enumC7794a3) {
                        return enumC7794a3;
                    }
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192o(C2193p c2193p, float f6, InterfaceC2779j interfaceC2779j, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f10108d = c2193p;
        this.f10106b = f6;
        this.f10109e = interfaceC2779j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192o(s1 s1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f10109e = s1Var;
    }
}
