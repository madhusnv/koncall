package k1;

import b2.C0566x;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import h1.C2780k;
import h1.C2790u;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C4165w;
import l1.AbstractC4323l;
import l1.C4316e;
import l1.C4319h;
import l1.InterfaceC4324m;
import n1.AbstractC4941a;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.j */
/* loaded from: classes.dex */
public final class C3935j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f20133a = 0;

    /* renamed from: b */
    public C4165w f20134b;

    /* renamed from: c */
    public int f20135c;

    /* renamed from: d */
    public final /* synthetic */ float f20136d;

    /* renamed from: e */
    public Object f20137e;

    /* renamed from: f */
    public final /* synthetic */ Object f20138f;

    /* renamed from: g */
    public final /* synthetic */ d1 f20139g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3935j(float f6, C3936k c3936k, t1 t1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20136d = f6;
        this.f20138f = c3936k;
        this.f20139g = t1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20133a) {
            case 0:
                return new C3935j(this.f20136d, (C3936k) this.f20138f, (t1) this.f20139g, interfaceC7559c);
            default:
                return new C3935j((C4319h) this.f20137e, this.f20136d, (InterfaceC2139c) this.f20138f, this.f20139g, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f20133a) {
        }
        return ((C3935j) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C4165w c4165w;
        C2780k c2780k;
        C4165w c4165w2;
        Object objM9038b;
        int i10 = this.f20133a;
        float f6 = this.f20136d;
        Object obj2 = this.f20138f;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f20135c;
                if (i11 == 0) {
                    od.m10798c(obj);
                    if (Math.abs(f6) > 1.0f) {
                        c4165w = new C4165w();
                        c4165w.f21161a = f6;
                        C4165w c4165w3 = new C4165w();
                        C2780k c2780kM6779b = AbstractC2773d.m6779b(DefinitionKt.NO_Float_VALUE, f6, 28);
                        try {
                            C3936k c3936k = (C3936k) obj2;
                            C2790u c2790u = c3936k.f20152a;
                            C0566x c0566x = new C0566x(c4165w3, (t1) this.f20139g, c4165w, c3936k);
                            this.f20134b = c4165w;
                            this.f20137e = c2780kM6779b;
                            this.f20135c = 1;
                            if (AbstractC2773d.m6783f(c2780kM6779b, c2790u, false, c0566x, this) == enumC7794a) {
                                return enumC7794a;
                            }
                        } catch (CancellationException unused) {
                            c2780k = c2780kM6779b;
                            c4165w.f21161a = ((Number) c2780k.m6828b()).floatValue();
                            f6 = c4165w.f21161a;
                            return new Float(f6);
                        }
                        f6 = c4165w.f21161a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2780k = (C2780k) this.f20137e;
                    c4165w = this.f20134b;
                    try {
                        od.m10798c(obj);
                    } catch (CancellationException unused2) {
                        c4165w.f21161a = ((Number) c2780k.m6828b()).floatValue();
                        f6 = c4165w.f21161a;
                        return new Float(f6);
                    }
                    f6 = c4165w.f21161a;
                }
                return new Float(f6);
            default:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) obj2;
                C4319h c4319h = (C4319h) this.f20137e;
                InterfaceC4324m interfaceC4324m = c4319h.f21763a;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f20135c;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C2790u c2790u2 = c4319h.f21764b;
                    h1.x1 x1Var = h1.y1.f15664a;
                    float fMo6336a = interfaceC4324m.mo6336a(f6, c2790u2.f15616a.mo6104U(DefinitionKt.NO_Float_VALUE, f6));
                    if (Float.isNaN(fMo6336a)) {
                        AbstractC4941a.m9886c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    c4165w2 = new C4165w();
                    float fSignum = Math.signum(f6) * Math.abs(fMo6336a);
                    c4165w2.f21161a = fSignum;
                    interfaceC2139c.invoke(new Float(fSignum));
                    float f10 = c4165w2.f21161a;
                    C4316e c4316e = new C4316e(c4165w2, interfaceC2139c, 1);
                    this.f20134b = c4165w2;
                    this.f20135c = 1;
                    objM9038b = C4319h.m9038b(c4319h, this.f20139g, f10, this.f20136d, c4316e, this);
                    if (objM9038b != enumC7794a2) {
                    }
                    return enumC7794a2;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                C4165w c4165w4 = this.f20134b;
                od.m10798c(obj);
                c4165w2 = c4165w4;
                objM9038b = obj;
                C2780k c2780k2 = (C2780k) objM9038b;
                float fMo6337b = interfaceC4324m.mo6337b(((Number) c2780k2.m6828b()).floatValue());
                if (Float.isNaN(fMo6337b)) {
                    AbstractC4941a.m9886c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                c4165w2.f21161a = fMo6337b;
                C2780k c2780kM6789l = AbstractC2773d.m6789l(c2780k2, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 30);
                h1.a1 a1Var = c4319h.f21765c;
                C4316e c4316e2 = new C4316e(c4165w2, interfaceC2139c, 0);
                this.f20134b = null;
                this.f20135c = 2;
                Object objM9043c = AbstractC4323l.m9043c(this.f20139g, fMo6337b, fMo6337b, c2780kM6789l, a1Var, c4316e2, this);
                if (objM9043c != enumC7794a2) {
                    return objM9043c;
                }
                return enumC7794a2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3935j(C4319h c4319h, float f6, InterfaceC2139c interfaceC2139c, d1 d1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20137e = c4319h;
        this.f20136d = f6;
        this.f20138f = interfaceC2139c;
        this.f20139g = d1Var;
    }
}
