package x1;

import aq.C0405h;
import cp.C1475f;
import ex.InterfaceC2141e;
import k1.AbstractC3951z;
import k1.C3947v;
import k1.C3948w;
import k1.C3949x;
import kotlin.jvm.internal.C4167y;
import og.od;
import p3.InterfaceC5822t;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f39502a;

    /* renamed from: b */
    public int f39503b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5822t f39504c;

    /* renamed from: d */
    public final /* synthetic */ d1 f39505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(InterfaceC5822t interfaceC5822t, d1 d1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f39502a = i10;
        this.f39504c = interfaceC5822t;
        this.f39505d = d1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f39502a) {
            case 0:
                return new h0(this.f39504c, this.f39505d, interfaceC7559c, 0);
            case 1:
                return new h0(this.f39504c, this.f39505d, interfaceC7559c, 1);
            default:
                return new h0(this.f39504c, this.f39505d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f39502a) {
        }
        return ((h0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f39502a;
        InterfaceC7559c interfaceC7559c = null;
        d1 d1Var = this.f39505d;
        InterfaceC5822t interfaceC5822t = this.f39504c;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f39503b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                this.f39503b = 1;
                Object objM13488k = tx.c0.m13488k(new C0405h(interfaceC5822t, d1Var, interfaceC7559c, 23), this);
                if (objM13488k != enumC7794a) {
                    objM13488k = a0Var;
                }
                return objM13488k == enumC7794a ? enumC7794a : a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f39503b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                this.f39503b = 1;
                Object objM8472c = k1.r1.m8472c(interfaceC5822t, new k1.m0(d1Var, (InterfaceC7559c) null, 4), this);
                if (objM8472c != enumC7794a2) {
                    objM8472c = a0Var;
                }
                return objM8472c == enumC7794a2 ? enumC7794a2 : a0Var;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f39503b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                this.f39503b = 1;
                b2.b0 b0Var = new b2.b0(d1Var, 1);
                x0 x0Var = new x0(d1Var, 0);
                x0 x0Var2 = new x0(d1Var, 1);
                C1475f c1475f = new C1475f(26, d1Var);
                float f6 = AbstractC3951z.f20334a;
                Object objM8472c2 = k1.r1.m8472c(interfaceC5822t, new C3949x(C3947v.f20272c, new C4167y(), null, new C3948w(0, b0Var), c1475f, x0Var2, new b2.d1(6, x0Var), null), this);
                if (objM8472c2 != enumC7794a3) {
                    objM8472c2 = a0Var;
                }
                if (objM8472c2 != enumC7794a3) {
                    objM8472c2 = a0Var;
                }
                if (objM8472c2 != enumC7794a3) {
                    objM8472c2 = a0Var;
                }
                return objM8472c2 == enumC7794a3 ? enumC7794a3 : a0Var;
        }
    }
}
