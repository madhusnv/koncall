package g2;

import a2.C0037j;
import androidx.compose.foundation.gestures.AbstractC0241a;
import androidx.compose.foundation.layout.AbstractC0245d;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1586n;
import e1.C1921w;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import k1.C3938m;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import m1.InterfaceC4630l;
import rw.C6669s;
import s1.C6725t;
import s2.AbstractC6740i;
import s4.AbstractC6746b;
import s4.C6745a;
import s4.EnumC6757m;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k5 extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f11909a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean f11910b;

    /* renamed from: c */
    public final /* synthetic */ Object f11911c;

    /* renamed from: d */
    public final /* synthetic */ Object f11912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(vc vcVar, C2460n c2460n, boolean z6) {
        super(3);
        this.f11911c = vcVar;
        this.f11912d = c2460n;
        this.f11910b = z6;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f11909a;
        Object obj4 = this.f11912d;
        boolean z6 = this.f11910b;
        Object obj5 = this.f11911c;
        switch (i10) {
            case 0:
                t3.l0 l0Var = (t3.l0) obj;
                t3.i0 i0Var = (t3.i0) obj2;
                long j6 = ((C6745a) obj3).f32195a;
                float f6 = p5.f12407a;
                int iM12929g = AbstractC6746b.m12929g(((k2.b1) obj5).m8526f(), j6);
                int iM12928f = AbstractC6746b.m12928f(((k2.b1) obj4).m8526f(), j6);
                int iM12920k = z6 ? iM12929g : C6745a.m12920k(j6);
                if (!z6) {
                    iM12929g = C6745a.m12918i(j6);
                }
                t3.w0 w0VarMo13314z = i0Var.mo13314z(C6745a.m12911b(j6, iM12920k, iM12929g, 0, iM12928f, 4));
                return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0037j(w0VarMo13314z, 6));
            case 1:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                ((Number) obj3).intValue();
                pd.m6276l(AbstractC1586n.m5204b(AbstractC0245d.m678o(C7876o.f37669a, j2.n0.f18680b), false, p0.f12351H), pd.f12442a, AbstractC6740i.m12902d(-320307952, new j5((vc) obj5, (C1921w) obj, (C2460n) obj4, z6), interfaceC3962k), interfaceC3962k, 432);
                return qw.a0.f30746a;
            default:
                ((Number) obj3).intValue();
                x1.p1 p1Var = (x1.p1) obj5;
                k2.e1 e1Var = p1Var.f39640f;
                C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
                c3966o.m8607Y(805428266);
                boolean z10 = ((k1.x0) e1Var.getValue()) == k1.x0.Vertical || !(c3966o.m8618k(w3.k1.f37842n) == EnumC6757m.Rtl);
                boolean zM8614g = c3966o.m8614g(p1Var);
                Object objM8596M = c3966o.m8596M();
                k2.s0 s0Var = C3961j.f20408a;
                if (zM8614g || objM8596M == s0Var) {
                    objM8596M = new C6725t(16, p1Var);
                    c3966o.j0(objM8596M);
                }
                k2.w0 w0VarM8520w = C3953b.m8520w((InterfaceC2139c) objM8596M, c3966o);
                Object objM8596M2 = c3966o.m8596M();
                if (objM8596M2 == s0Var) {
                    C3938m c3938m = new C3938m(new p2(w0VarM8520w, 2));
                    c3966o.j0(c3938m);
                    objM8596M2 = c3938m;
                }
                k1.q1 q1Var = (k1.q1) objM8596M2;
                boolean zM8614g2 = c3966o.m8614g(q1Var) | c3966o.m8614g(p1Var);
                Object objM8596M3 = c3966o.m8596M();
                if (zM8614g2 || objM8596M3 == s0Var) {
                    objM8596M3 = new x1.n1(q1Var, p1Var);
                    c3966o.j0(objM8596M3);
                }
                InterfaceC7879r interfaceC7879rM646b = AbstractC0241a.m646b((x1.n1) objM8596M3, (k1.x0) e1Var.getValue(), z6 && p1Var.f39636b.m8490f() != DefinitionKt.NO_Float_VALUE, z10, (InterfaceC4630l) obj4);
                c3966o.m8623p(false);
                return interfaceC7879rM646b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(x1.p1 p1Var, boolean z6, InterfaceC4630l interfaceC4630l) {
        super(3);
        this.f11911c = p1Var;
        this.f11910b = z6;
        this.f11912d = interfaceC4630l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(boolean z6, k2.b1 b1Var, k2.b1 b1Var2) {
        super(3);
        this.f11910b = z6;
        this.f11911c = b1Var;
        this.f11912d = b1Var2;
    }
}
