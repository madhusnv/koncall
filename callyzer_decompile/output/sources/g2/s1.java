package g2;

import a2.C0036i;
import a3.C0045d;
import cp.C1475f;
import ex.InterfaceC2141e;
import k1.AbstractC3951z;
import k1.C3929d;
import k1.C3947v;
import k1.C3948w;
import k1.C3949x;
import kotlin.jvm.internal.C4167y;
import p3.InterfaceC5822t;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12649a;

    /* renamed from: b */
    public int f12650b;

    /* renamed from: c */
    public /* synthetic */ Object f12651c;

    /* renamed from: d */
    public final /* synthetic */ u1 f12652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(u1 u1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f12649a = i10;
        this.f12652d = u1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f12649a) {
            case 0:
                s1 s1Var = new s1(this.f12652d, interfaceC7559c, 0);
                s1Var.f12651c = obj;
                return s1Var;
            default:
                s1 s1Var2 = new s1(this.f12652d, interfaceC7559c, 1);
                s1Var2.f12651c = obj;
                return s1Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC5822t interfaceC5822t = (InterfaceC5822t) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f12649a) {
        }
        return ((s1) create(interfaceC5822t, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f12649a;
        qw.a0 a0Var = qw.a0.f30746a;
        u1 u1Var = this.f12652d;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f12650b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return a0Var;
                }
                og.od.m10798c(obj);
                InterfaceC5822t interfaceC5822t = (InterfaceC5822t) this.f12651c;
                C0036i c0036i = new C0036i(6, u1Var);
                C1475f c1475f = new C1475f(2, u1Var);
                this.f12650b = 1;
                float f6 = AbstractC3951z.f20334a;
                C3929d c3929d = C3929d.f20047c;
                Object objM8472c = k1.r1.m8472c(interfaceC5822t, new C3949x(C3947v.f20272c, new C4167y(), null, new C3948w(0, c3929d), c1475f, C3947v.f20271b, new b2.d1(6, c0036i), null), this);
                if (objM8472c != enumC7794a) {
                    objM8472c = a0Var;
                }
                if (objM8472c != enumC7794a) {
                    objM8472c = a0Var;
                }
                return objM8472c == enumC7794a ? enumC7794a : a0Var;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f12650b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                    return a0Var;
                }
                og.od.m10798c(obj);
                InterfaceC5822t interfaceC5822t2 = (InterfaceC5822t) this.f12651c;
                t1 t1Var = new t1(u1Var, null);
                C0045d c0045d = new C0045d(8, u1Var);
                this.f12650b = 1;
                return k1.i2.m8450d(interfaceC5822t2, t1Var, c0045d, this, 3) == enumC7794a2 ? enumC7794a2 : a0Var;
        }
    }
}
