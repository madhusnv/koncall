package x1;

import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.relocation.AbstractC0250a;
import c9.AbstractC0911f;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4381z;
import l4.InterfaceC4374s;
import n3.AbstractC4949c;
import s2.AbstractC6740i;
import s4.C6750f;
import s4.InterfaceC6747c;
import u1.C7300b;
import w2.AbstractC7862a;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.z */
/* loaded from: classes.dex */
public final class C8276z extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ v0 f39778a;

    /* renamed from: b */
    public final /* synthetic */ g4.o0 f39779b;

    /* renamed from: c */
    public final /* synthetic */ int f39780c;

    /* renamed from: d */
    public final /* synthetic */ int f39781d;

    /* renamed from: e */
    public final /* synthetic */ p1 f39782e;

    /* renamed from: f */
    public final /* synthetic */ C4381z f39783f;

    /* renamed from: g */
    public final /* synthetic */ l4.k0 f39784g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC7879r f39785h;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC7879r f39786j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC7879r f39787k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC7879r f39788l;

    /* renamed from: m */
    public final /* synthetic */ C7300b f39789m;

    /* renamed from: n */
    public final /* synthetic */ b2.y0 f39790n;

    /* renamed from: p */
    public final /* synthetic */ boolean f39791p;

    /* renamed from: q */
    public final /* synthetic */ boolean f39792q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2139c f39793r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC4374s f39794s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC6747c f39795t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8276z(v0 v0Var, g4.o0 o0Var, int i10, int i11, p1 p1Var, C4381z c4381z, l4.k0 k0Var, InterfaceC7879r interfaceC7879r, InterfaceC7879r interfaceC7879r2, InterfaceC7879r interfaceC7879r3, InterfaceC7879r interfaceC7879r4, C7300b c7300b, b2.y0 y0Var, boolean z6, boolean z10, InterfaceC2139c interfaceC2139c, InterfaceC4374s interfaceC4374s, InterfaceC6747c interfaceC6747c) {
        super(2);
        this.f39778a = v0Var;
        this.f39779b = o0Var;
        this.f39780c = i10;
        this.f39781d = i11;
        this.f39782e = p1Var;
        this.f39783f = c4381z;
        this.f39784g = k0Var;
        this.f39785h = interfaceC7879r;
        this.f39786j = interfaceC7879r2;
        this.f39787k = interfaceC7879r3;
        this.f39788l = interfaceC7879r4;
        this.f39789m = c7300b;
        this.f39790n = y0Var;
        this.f39791p = z6;
        this.f39792q = z10;
        this.f39793r = interfaceC2139c;
        this.f39794s = interfaceC4374s;
        this.f39795t = interfaceC6747c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7879r w1Var;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        int iIntValue = ((Number) obj2).intValue();
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
            v0 v0Var = this.f39778a;
            InterfaceC7879r interfaceC7879rM672i = AbstractC0245d.m672i(C7876o.f37669a, ((C6750f) v0Var.f39709g.getValue()).f32201a, DefinitionKt.NO_Float_VALUE, 2);
            int i10 = this.f39780c;
            int i11 = this.f39781d;
            g4.o0 o0Var = this.f39779b;
            InterfaceC7879r interfaceC7879rM14843a = AbstractC7862a.m14843a(interfaceC7879rM672i, new l0(i10, i11, o0Var));
            boolean zM8616i = c3966o.m8616i(v0Var);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new o6.b0(17, v0Var);
                c3966o.j0(objM8596M);
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M;
            p1 p1Var = this.f39782e;
            k1.x0 x0Var = (k1.x0) p1Var.f39640f.getValue();
            C4381z c4381z = this.f39783f;
            long j6 = c4381z.f21946b;
            int i12 = g4.n0.f13685c;
            int iM6458e = (int) (j6 >> 32);
            long j10 = p1Var.f39639e;
            if (iM6458e == ((int) (j10 >> 32)) && (iM6458e = (int) (j6 & 4294967295L)) == ((int) (j10 & 4294967295L))) {
                iM6458e = g4.n0.m6458e(j6);
            }
            p1Var.f39639e = c4381z.f21946b;
            l4.i0 i0VarM15483a = v1.m15483a(this.f39784g, c4381z.f21945a);
            int i13 = l1.f39587a[x0Var.ordinal()];
            if (i13 == 1) {
                w1Var = new w1(p1Var, iM6458e, i0VarM15483a, interfaceC2137a);
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                w1Var = new m0(p1Var, iM6458e, i0VarM15483a, interfaceC2137a);
            }
            AbstractC4949c.m9889a(AbstractC0250a.m696a(AbstractC7862a.m14843a(AbstractC0911f.m2618b(interfaceC7879rM14843a).mo14852e(w1Var).mo14852e(this.f39785h).mo14852e(this.f39786j), new b2.f1(5, o0Var)).mo14852e(this.f39787k).mo14852e(this.f39788l), this.f39789m), AbstractC6740i.m12902d(-1172467467, new C8275y(this.f39790n, v0Var, this.f39791p, this.f39792q, this.f39793r, this.f39783f, this.f39794s, this.f39795t, this.f39781d), c3966o), c3966o, 48);
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
