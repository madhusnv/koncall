package p001o;

import androidx.compose.ui.focus.C1932f;
import androidx.compose.ui.node.C1939a;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.firebase.messaging.Constants;
import java.util.Comparator;
import java.util.List;
import p001o.alb;
import p001o.di9;
import p001o.q8d;
import p001o.sgc;

/* loaded from: classes2.dex */
public final class zh9 implements sn3, vgc, th9, sgc.InterfaceC16840b {

    /* renamed from: H */
    public boolean f57194H;

    /* renamed from: L */
    public kcf f57195L;

    /* renamed from: M */
    public final fqb f57196M;

    /* renamed from: Q */
    public boolean f57197Q;

    /* renamed from: X */
    public a1b f57198X;

    /* renamed from: Y */
    public final vq8 f57199Y;

    /* renamed from: Z */
    public zl5 f57200Z;

    /* renamed from: a */
    public final boolean f57201a;

    /* renamed from: b */
    public int f57202b;

    /* renamed from: c */
    public boolean f57203c;

    /* renamed from: d */
    public zh9 f57204d;

    /* renamed from: e */
    public int f57205e;

    /* renamed from: f */
    public final hqb f57206f;

    /* renamed from: g */
    public fqb f57207g;

    /* renamed from: h */
    public boolean f57208h;
    public qh9 h0;
    public zvi i0;
    public kp3 j0;
    public EnumC18642g k0;
    public EnumC18642g l0;
    public boolean m0;
    public final C1939a n0;
    public final di9 o0;
    public xzb p0;

    /* renamed from: q */
    public zh9 f57209q;
    public boolean q0;
    public alb r0;

    /* renamed from: s */
    public sgc f57210s;
    public xk7 s0;
    public xk7 t0;
    public boolean u0;
    public boolean v0;

    /* renamed from: x */
    public AndroidViewHolder f57211x;

    /* renamed from: y */
    public int f57212y;
    public static final C18639d w0 = new C18639d(null);
    public static final AbstractC18641f x0 = new C18638c();
    public static final uk7 y0 = C18636a.f57213a;
    public static final zvi z0 = new C18637b();
    public static final Comparator A0 = new Comparator() { // from class: o.yh9
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return zh9.m59404g((zh9) obj, (zh9) obj2);
        }
    };

    /* renamed from: o.zh9$a */
    public static final class C18636a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C18636a f57213a = new C18636a();

        public C18636a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zh9 invoke() {
            return new zh9(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    /* renamed from: o.zh9$b */
    public static final class C18637b implements zvi {
        @Override // p001o.zvi
        /* renamed from: a */
        public long mo59450a() {
            return wx5.f52831a.m55324b();
        }
    }

    /* renamed from: o.zh9$c */
    public static final class C18638c extends AbstractC18641f {
        public C18638c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // p001o.a1b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ b1b mo16327a(c1b c1bVar, List list, long j) {
            return (b1b) m59451b(c1bVar, list, j);
        }

        /* renamed from: b */
        public Void m59451b(c1b c1bVar, List list, long j) {
            sq8.m48649h(c1bVar, "$this$measure");
            sq8.m48649h(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* renamed from: o.zh9$d */
    public static final class C18639d {
        public C18639d() {
        }

        public /* synthetic */ C18639d(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Comparator m59452a() {
            return zh9.A0;
        }
    }

    /* renamed from: o.zh9$e */
    public enum EnumC18640e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* renamed from: o.zh9$f */
    public static abstract class AbstractC18641f implements a1b {

        /* renamed from: a */
        public final String f57214a;

        public AbstractC18641f(String str) {
            sq8.m48649h(str, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f57214a = str;
        }
    }

    /* renamed from: o.zh9$g */
    public enum EnumC18642g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* renamed from: o.zh9$h */
    public /* synthetic */ class C18643h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57215a;

        static {
            int[] iArr = new int[EnumC18640e.values().length];
            try {
                iArr[EnumC18640e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f57215a = iArr;
        }
    }

    /* renamed from: o.zh9$i */
    public static final class C18644i extends kf9 implements uk7 {
        public C18644i() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69056invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69056invoke() {
            zh9.this.m59413F().m23252J();
        }
    }

    /* renamed from: o.zh9$j */
    public static final class C18645j extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ gge f57218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18645j(gge ggeVar) {
            super(0);
            this.f57218b = ggeVar;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69057invoke();
            return y3i.f54824a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69057invoke() {
            C1939a c1939aM59428U = zh9.this.m59428U();
            int iM60153a = zzb.m60153a(8);
            gge ggeVar = this.f57218b;
            if ((c1939aM59428U.m4985i() & iM60153a) != 0) {
                for (alb.AbstractC12216c abstractC12216cM4991o = c1939aM59428U.m4991o(); abstractC12216cM4991o != null; abstractC12216cM4991o = abstractC12216cM4991o.m17358G()) {
                    if ((abstractC12216cM4991o.m17356E() & iM60153a) != 0) {
                        for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM4991o; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                            if (abstractC12216cM48434f instanceof ncf) {
                                ncf ncfVar = (ncf) abstractC12216cM48434f;
                                if (ncfVar.m40330d()) {
                                    kcf kcfVar = new kcf();
                                    ggeVar.f25106a = kcfVar;
                                    kcfVar.m35422y(true);
                                }
                                if (ncfVar.m40331z()) {
                                    ((kcf) ggeVar.f25106a).m35412A(true);
                                }
                                ncfVar.mo40256c((kcf) ggeVar.f25106a);
                            } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                            }
                        }
                    }
                }
            }
        }
    }

    public zh9(boolean z, int i) {
        this.f57201a = z;
        this.f57202b = i;
        this.f57206f = new hqb(new fqb(new zh9[16], 0), new C18644i());
        this.f57196M = new fqb(new zh9[16], 0);
        this.f57197Q = true;
        this.f57198X = x0;
        this.f57199Y = new vq8(this);
        this.f57200Z = ci9.f18226a;
        this.h0 = qh9.Ltr;
        this.i0 = z0;
        this.j0 = kp3.f32523n.m35997a();
        EnumC18642g enumC18642g = EnumC18642g.NotUsed;
        this.k0 = enumC18642g;
        this.l0 = enumC18642g;
        this.n0 = new C1939a(this);
        this.o0 = new di9(this);
        this.q0 = true;
        this.r0 = alb.f14913a;
    }

    public static /* synthetic */ boolean J0(zh9 zh9Var, bu3 bu3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            bu3Var = zh9Var.o0.m23271v();
        }
        return zh9Var.I0(bu3Var);
    }

    public static /* synthetic */ void O0(zh9 zh9Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        zh9Var.N0(z);
    }

    public static /* synthetic */ void Q0(zh9 zh9Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        zh9Var.P0(z, z2);
    }

    public static /* synthetic */ void S0(zh9 zh9Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        zh9Var.R0(z);
    }

    public static /* synthetic */ void U0(zh9 zh9Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        zh9Var.T0(z, z2);
    }

    /* renamed from: g */
    public static final int m59404g(zh9 zh9Var, zh9 zh9Var2) {
        return (zh9Var.c0() > zh9Var2.c0() ? 1 : (zh9Var.c0() == zh9Var2.c0() ? 0 : -1)) == 0 ? sq8.m48651j(zh9Var.m59432Y(), zh9Var2.m59432Y()) : Float.compare(zh9Var.c0(), zh9Var2.c0());
    }

    public static /* synthetic */ void g0(zh9 zh9Var, long j, uy7 uy7Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        zh9Var.f0(j, uy7Var, z3, z2);
    }

    /* renamed from: n */
    public static /* synthetic */ String m59407n(zh9 zh9Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return zh9Var.m59437m(i);
    }

    public static /* synthetic */ boolean w0(zh9 zh9Var, bu3 bu3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            bu3Var = zh9Var.o0.m23272w();
        }
        return zh9Var.v0(bu3Var);
    }

    /* renamed from: A */
    public final boolean m59408A() {
        long jI0 = m59410C().I0();
        return bu3.m19796h(jI0) && bu3.m19795g(jI0);
    }

    public final void A0() {
        this.o0.m23255M();
    }

    /* renamed from: B */
    public int m59409B() {
        return this.o0.m23270u();
    }

    public final void B0() {
        this.o0.m23256N();
    }

    /* renamed from: C */
    public final xzb m59410C() {
        return this.n0.m4988l();
    }

    public final void C0(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this.f57206f.m30995a(i > i2 ? i2 + i4 : (i2 + i3) - 2, (zh9) this.f57206f.m31000f(i > i2 ? i + i4 : i));
        }
        F0();
        r0();
        o0();
    }

    /* renamed from: D */
    public final xzb m59411D() {
        if (this.q0) {
            xzb xzbVarM59410C = m59410C();
            xzb xzbVarR0 = m59429V().R0();
            this.p0 = null;
            while (true) {
                if (sq8.m48644c(xzbVarM59410C, xzbVarR0)) {
                    break;
                }
                if ((xzbVarM59410C != null ? xzbVarM59410C.J0() : null) != null) {
                    this.p0 = xzbVarM59410C;
                    break;
                }
                xzbVarM59410C = xzbVarM59410C != null ? xzbVarM59410C.R0() : null;
            }
        }
        xzb xzbVar = this.p0;
        if (xzbVar == null || xzbVar.J0() != null) {
            return xzbVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void D0(zh9 zh9Var) {
        if (zh9Var.o0.m23267r() > 0) {
            this.o0.m23261S(r0.m23267r() - 1);
        }
        if (this.f57210s != null) {
            zh9Var.m59438o();
        }
        zh9Var.f57209q = null;
        zh9Var.m59429V().u1(null);
        if (zh9Var.f57201a) {
            this.f57205e--;
            fqb fqbVarM30999e = zh9Var.f57206f.m30999e();
            int iM27354o = fqbVarM30999e.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarM30999e.m27353n();
                int i = 0;
                do {
                    ((zh9) objArrM27353n[i]).m59429V().u1(null);
                    i++;
                } while (i < iM27354o);
            }
        }
        r0();
        F0();
    }

    /* renamed from: E */
    public final EnumC18642g m59412E() {
        return this.k0;
    }

    public final void E0() {
        o0();
        zh9 zh9VarM59431X = m59431X();
        if (zh9VarM59431X != null) {
            zh9VarM59431X.m0();
        }
        n0();
    }

    /* renamed from: F */
    public final di9 m59413F() {
        return this.o0;
    }

    public final void F0() {
        if (!this.f57201a) {
            this.f57197Q = true;
            return;
        }
        zh9 zh9VarM59431X = m59431X();
        if (zh9VarM59431X != null) {
            zh9VarM59431X.F0();
        }
    }

    /* renamed from: G */
    public final boolean m59414G() {
        return this.o0.m23273x();
    }

    public final void G0(int i, int i2) {
        if (this.k0 == EnumC18642g.NotUsed) {
            m59436l();
        }
        di9.C12943b c12943bM59421N = m59421N();
        q8d.AbstractC16323a.a aVar = q8d.AbstractC16323a.f41476a;
        int iMo23294O = c12943bM59421N.mo23294O();
        qh9 layoutDirection = getLayoutDirection();
        zh9 zh9VarM59431X = m59431X();
        xzb xzbVarM59410C = zh9VarM59431X != null ? zh9VarM59431X.m59410C() : null;
        mh9 mh9Var = q8d.AbstractC16323a.f41479d;
        int iMo44993l = aVar.mo44993l();
        qh9 qh9VarMo44992k = aVar.mo44992k();
        di9 di9Var = q8d.AbstractC16323a.f41480e;
        q8d.AbstractC16323a.f41478c = iMo23294O;
        q8d.AbstractC16323a.f41477b = layoutDirection;
        boolean zM45002y = aVar.m45002y(xzbVarM59410C);
        q8d.AbstractC16323a.m44990r(aVar, c12943bM59421N, i, i2, 0.0f, 4, null);
        if (xzbVarM59410C != null) {
            xzbVarM59410C.i0(zM45002y);
        }
        q8d.AbstractC16323a.f41478c = iMo44993l;
        q8d.AbstractC16323a.f41477b = qh9VarMo44992k;
        q8d.AbstractC16323a.f41479d = mh9Var;
        q8d.AbstractC16323a.f41480e = di9Var;
    }

    /* renamed from: H */
    public final EnumC18640e m59415H() {
        return this.o0.m23274y();
    }

    public final void H0() {
        if (this.f57208h) {
            int i = 0;
            this.f57208h = false;
            fqb fqbVar = this.f57207g;
            if (fqbVar == null) {
                fqbVar = new fqb(new zh9[16], 0);
                this.f57207g = fqbVar;
            }
            fqbVar.m27349i();
            fqb fqbVarM30999e = this.f57206f.m30999e();
            int iM27354o = fqbVarM30999e.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarM30999e.m27353n();
                do {
                    zh9 zh9Var = (zh9) objArrM27353n[i];
                    if (zh9Var.f57201a) {
                        fqbVar.m27346e(fqbVar.m27354o(), zh9Var.e0());
                    } else {
                        fqbVar.m27344c(zh9Var);
                    }
                    i++;
                } while (i < iM27354o);
            }
            this.o0.m23252J();
        }
    }

    /* renamed from: I */
    public final boolean m59416I() {
        return this.o0.m23243A();
    }

    public final boolean I0(bu3 bu3Var) {
        if (bu3Var == null) {
            return false;
        }
        if (this.k0 == EnumC18642g.NotUsed) {
            m59435k();
        }
        return m59421N().p0(bu3Var.m19803o());
    }

    /* renamed from: J */
    public final boolean m59417J() {
        return this.o0.m23244B();
    }

    /* renamed from: K */
    public final di9.C12942a m59418K() {
        return this.o0.m23245C();
    }

    public final void K0() {
        int iM30998d = this.f57206f.m30998d();
        while (true) {
            iM30998d--;
            if (-1 >= iM30998d) {
                this.f57206f.m30996b();
                return;
            }
            D0((zh9) this.f57206f.m30997c(iM30998d));
        }
    }

    /* renamed from: L */
    public final zh9 m59419L() {
        return this.f57204d;
    }

    public final void L0(int i, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            D0((zh9) this.f57206f.m31000f(i3));
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    /* renamed from: M */
    public final bi9 m59420M() {
        return ci9.m21298b(this).getSharedDrawScope();
    }

    public final void M0() {
        if (this.k0 == EnumC18642g.NotUsed) {
            m59436l();
        }
        m59421N().q0();
    }

    /* renamed from: N */
    public final di9.C12943b m59421N() {
        return this.o0.m23246D();
    }

    public final void N0(boolean z) {
        sgc sgcVar;
        if (this.f57201a || (sgcVar = this.f57210s) == null) {
            return;
        }
        sgcVar.mo5070m(this, true, z);
    }

    /* renamed from: O */
    public final boolean m59422O() {
        return this.o0.m23247E();
    }

    /* renamed from: P */
    public a1b m59423P() {
        return this.f57198X;
    }

    public final void P0(boolean z, boolean z2) {
        if (!(this.f57204d != null)) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
        }
        sgc sgcVar = this.f57210s;
        if (sgcVar == null || this.f57194H || this.f57201a) {
            return;
        }
        sgcVar.mo5063b(this, true, z, z2);
        di9.C12942a c12942aM59418K = m59418K();
        sq8.m48646e(c12942aM59418K);
        c12942aM59418K.f0(z);
    }

    /* renamed from: Q */
    public final EnumC18642g m59424Q() {
        return m59421N().c0();
    }

    /* renamed from: R */
    public final EnumC18642g m59425R() {
        EnumC18642g enumC18642gD0;
        di9.C12942a c12942aM59418K = m59418K();
        return (c12942aM59418K == null || (enumC18642gD0 = c12942aM59418K.d0()) == null) ? EnumC18642g.NotUsed : enumC18642gD0;
    }

    public final void R0(boolean z) {
        sgc sgcVar;
        if (this.f57201a || (sgcVar = this.f57210s) == null) {
            return;
        }
        sgc.m48315f(sgcVar, this, false, z, 2, null);
    }

    /* renamed from: S */
    public alb m59426S() {
        return this.r0;
    }

    /* renamed from: T */
    public final boolean m59427T() {
        return this.u0;
    }

    public final void T0(boolean z, boolean z2) {
        sgc sgcVar;
        if (this.f57194H || this.f57201a || (sgcVar = this.f57210s) == null) {
            return;
        }
        sgc.m48317j(sgcVar, this, false, z, z2, 2, null);
        m59421N().g0(z);
    }

    /* renamed from: U */
    public final C1939a m59428U() {
        return this.n0;
    }

    /* renamed from: V */
    public final xzb m59429V() {
        return this.n0.m4990n();
    }

    public final void V0(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "it");
        if (C18643h.f57215a[zh9Var.m59415H().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + zh9Var.m59415H());
        }
        if (zh9Var.m59422O()) {
            U0(zh9Var, true, false, 2, null);
            return;
        }
        if (zh9Var.m59414G()) {
            zh9Var.R0(true);
        } else if (zh9Var.m59417J()) {
            Q0(zh9Var, true, false, 2, null);
        } else if (zh9Var.m59416I()) {
            zh9Var.N0(true);
        }
    }

    /* renamed from: W */
    public final sgc m59430W() {
        return this.f57210s;
    }

    public final void W0() {
        this.n0.m5000x();
    }

    /* renamed from: X */
    public final zh9 m59431X() {
        zh9 zh9Var = this.f57209q;
        while (true) {
            boolean z = false;
            if (zh9Var != null && zh9Var.f57201a) {
                z = true;
            }
            if (!z) {
                return zh9Var;
            }
            zh9Var = zh9Var.f57209q;
        }
    }

    public final void X0() {
        fqb fqbVarE0 = e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i = 0;
            do {
                zh9 zh9Var = (zh9) objArrM27353n[i];
                EnumC18642g enumC18642g = zh9Var.l0;
                zh9Var.k0 = enumC18642g;
                if (enumC18642g != EnumC18642g.NotUsed) {
                    zh9Var.X0();
                }
                i++;
            } while (i < iM27354o);
        }
    }

    /* renamed from: Y */
    public final int m59432Y() {
        return m59421N().e0();
    }

    public final void Y0(boolean z) {
        this.m0 = z;
    }

    /* renamed from: Z */
    public int m59433Z() {
        return this.f57202b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Z0(zl5 zl5Var) {
        sq8.m48649h(zl5Var, "value");
        if (sq8.m48644c(this.f57200Z, zl5Var)) {
            return;
        }
        this.f57200Z = zl5Var;
        E0();
        C1939a c1939a = this.n0;
        int iM60153a = zzb.m60153a(16);
        if ((c1939a.m4985i() & iM60153a) != 0) {
            for (alb.AbstractC12216c abstractC12216cM4987k = c1939a.m4987k(); abstractC12216cM4987k != null; abstractC12216cM4987k = abstractC12216cM4987k.m17353B()) {
                if ((abstractC12216cM4987k.m17356E() & iM60153a) != 0) {
                    for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM4987k; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                        if (abstractC12216cM48434f instanceof bdd) {
                            ((bdd) abstractC12216cM48434f).m18662v();
                        } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        }
                    }
                }
                if ((abstractC12216cM4987k.m17352A() & iM60153a) == 0) {
                    return;
                }
            }
        }
    }

    @Override // p001o.th9
    /* renamed from: a */
    public boolean mo49883a() {
        return m59421N().mo23282a();
    }

    public zvi a0() {
        return this.i0;
    }

    public final void a1(boolean z) {
        this.q0 = z;
    }

    @Override // p001o.sn3
    /* renamed from: b */
    public void mo5284b() {
        AndroidViewHolder androidViewHolder = this.f57211x;
        if (androidViewHolder != null) {
            androidViewHolder.mo5284b();
        }
        xzb xzbVarQ0 = m59410C().Q0();
        for (xzb xzbVarM59429V = m59429V(); !sq8.m48644c(xzbVarM59429V, xzbVarQ0) && xzbVarM59429V != null; xzbVarM59429V = xzbVarM59429V.Q0()) {
            xzbVarM59429V.l1();
        }
    }

    public int b0() {
        return this.o0.m23249G();
    }

    public final void b1(zh9 zh9Var) {
        if (sq8.m48644c(zh9Var, this.f57204d)) {
            return;
        }
        this.f57204d = zh9Var;
        if (zh9Var != null) {
            this.o0.m23265p();
            xzb xzbVarQ0 = m59410C().Q0();
            for (xzb xzbVarM59429V = m59429V(); !sq8.m48644c(xzbVarM59429V, xzbVarQ0) && xzbVarM59429V != null; xzbVarM59429V = xzbVarM59429V.Q0()) {
                xzbVarM59429V.C0();
            }
        }
        o0();
    }

    @Override // p001o.sn3
    /* renamed from: c */
    public void mo5285c() {
        AndroidViewHolder androidViewHolder = this.f57211x;
        if (androidViewHolder != null) {
            androidViewHolder.mo5285c();
        }
        this.v0 = true;
        W0();
    }

    public final float c0() {
        return m59421N().f0();
    }

    public void c1(a1b a1bVar) {
        sq8.m48649h(a1bVar, "value");
        if (sq8.m48644c(this.f57198X, a1bVar)) {
            return;
        }
        this.f57198X = a1bVar;
        this.f57199Y.m53215b(m59423P());
        o0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.sgc.InterfaceC16840b
    /* renamed from: d */
    public void mo48320d() {
        xzb xzbVarM59410C = m59410C();
        int iM60153a = zzb.m60153a(128);
        boolean zM16306i = a0c.m16306i(iM60153a);
        alb.AbstractC12216c abstractC12216cP0 = xzbVarM59410C.P0();
        if (!zM16306i && (abstractC12216cP0 = abstractC12216cP0.m17358G()) == null) {
            return;
        }
        for (alb.AbstractC12216c abstractC12216cV0 = xzbVarM59410C.V0(zM16306i); abstractC12216cV0 != null && (abstractC12216cV0.m17352A() & iM60153a) != 0; abstractC12216cV0 = abstractC12216cV0.m17353B()) {
            if ((abstractC12216cV0.m17356E() & iM60153a) != 0) {
                for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cV0; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                    if (abstractC12216cM48434f instanceof lh9) {
                        ((lh9) abstractC12216cM48434f).mo37218w(m59410C());
                    } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                    }
                }
            }
            if (abstractC12216cV0 == abstractC12216cP0) {
                return;
            }
        }
    }

    public final fqb d0() {
        if (this.f57197Q) {
            this.f57196M.m27349i();
            fqb fqbVar = this.f57196M;
            fqbVar.m27346e(fqbVar.m27354o(), e0());
            this.f57196M.m27365z(A0);
            this.f57197Q = false;
        }
        return this.f57196M;
    }

    public void d1(alb albVar) {
        sq8.m48649h(albVar, "value");
        if (!(!this.f57201a || m59426S() == alb.f14913a)) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.r0 = albVar;
        this.n0.m4981E(albVar);
        this.o0.m23264V();
        if (this.n0.m4993q(zzb.m60153a(512)) && this.f57204d == null) {
            b1(this);
        }
    }

    @Override // p001o.th9
    /* renamed from: e */
    public mh9 mo49884e() {
        return m59410C();
    }

    public final fqb e0() {
        f1();
        if (this.f57205e == 0) {
            return this.f57206f.m30999e();
        }
        fqb fqbVar = this.f57207g;
        sq8.m48646e(fqbVar);
        return fqbVar;
    }

    public final void e1(boolean z) {
        this.u0 = z;
    }

    public final void f0(long j, uy7 uy7Var, boolean z, boolean z2) {
        sq8.m48649h(uy7Var, "hitTestResult");
        m59429V().Y0(xzb.n0.m57041a(), m59429V().E0(j), uy7Var, z, z2);
    }

    public final void f1() {
        if (this.f57205e > 0) {
            H0();
        }
    }

    @Override // p001o.th9
    public qh9 getLayoutDirection() {
        return this.h0;
    }

    public final void h0(long j, uy7 uy7Var, boolean z, boolean z2) {
        sq8.m48649h(uy7Var, "hitSemanticsEntities");
        m59429V().Y0(xzb.n0.m57042b(), m59429V().E0(j), uy7Var, true, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m59434j(sgc sgcVar) {
        Object[] objArr;
        zh9 zh9Var;
        sq8.m48649h(sgcVar, "owner");
        int i = 0;
        if ((this.f57210s == null) != true) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + m59407n(this, 0, 1, null)).toString());
        }
        zh9 zh9Var2 = this.f57209q;
        if (zh9Var2 == null) {
            objArr = true;
        } else if (!sq8.m48644c(zh9Var2 != null ? zh9Var2.f57210s : null, sgcVar)) {
            objArr = false;
        }
        if (objArr != true) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attaching to a different owner(");
            sb.append(sgcVar);
            sb.append(") than the parent's owner(");
            zh9 zh9VarM59431X = m59431X();
            sb.append(zh9VarM59431X != null ? zh9VarM59431X.f57210s : null);
            sb.append("). This tree: ");
            sb.append(m59407n(this, 0, 1, null));
            sb.append(" Parent tree: ");
            zh9 zh9Var3 = this.f57209q;
            sb.append(zh9Var3 != null ? m59407n(zh9Var3, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        zh9 zh9VarM59431X2 = m59431X();
        if (zh9VarM59431X2 == null) {
            m59421N().t0(true);
            di9.C12942a c12942aM59418K = m59418K();
            if (c12942aM59418K != null) {
                c12942aM59418K.s0(true);
            }
        }
        m59429V().u1(zh9VarM59431X2 != null ? zh9VarM59431X2.m59410C() : null);
        this.f57210s = sgcVar;
        this.f57212y = (zh9VarM59431X2 != null ? zh9VarM59431X2.f57212y : -1) + 1;
        if (this.n0.m4993q(zzb.m60153a(8))) {
            q0();
        }
        sgcVar.mo5068k(this);
        if (this.f57203c) {
            b1(this);
        } else {
            zh9 zh9Var4 = this.f57209q;
            if (zh9Var4 == null || (zh9Var = zh9Var4.f57204d) == null) {
                zh9Var = this.f57204d;
            }
            b1(zh9Var);
        }
        if (!this.v0) {
            this.n0.m4995s();
        }
        fqb fqbVarM30999e = this.f57206f.m30999e();
        int iM27354o = fqbVarM30999e.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarM30999e.m27353n();
            do {
                ((zh9) objArrM27353n[i]).m59434j(sgcVar);
                i++;
            } while (i < iM27354o);
        }
        if (!this.v0) {
            this.n0.m5001y();
        }
        o0();
        if (zh9VarM59431X2 != null) {
            zh9VarM59431X2.o0();
        }
        xzb xzbVarQ0 = m59410C().Q0();
        for (xzb xzbVarM59429V = m59429V(); !sq8.m48644c(xzbVarM59429V, xzbVarQ0) && xzbVarM59429V != null; xzbVarM59429V = xzbVarM59429V.Q0()) {
            xzbVarM59429V.h1();
        }
        xk7 xk7Var = this.s0;
        if (xk7Var != null) {
            xk7Var.invoke(sgcVar);
        }
        this.o0.m23264V();
        if (this.v0) {
            return;
        }
        k0();
    }

    public final void j0(int i, zh9 zh9Var) {
        sq8.m48649h(zh9Var, "instance");
        if (!(zh9Var.f57209q == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(zh9Var);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(m59407n(this, 0, 1, null));
            sb.append(" Other tree: ");
            zh9 zh9Var2 = zh9Var.f57209q;
            sb.append(zh9Var2 != null ? m59407n(zh9Var2, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (!(zh9Var.f57210s == null)) {
            throw new IllegalStateException(("Cannot insert " + zh9Var + " because it already has an owner. This tree: " + m59407n(this, 0, 1, null) + " Other tree: " + m59407n(zh9Var, 0, 1, null)).toString());
        }
        zh9Var.f57209q = this;
        this.f57206f.m30995a(i, zh9Var);
        F0();
        if (zh9Var.f57201a) {
            this.f57205e++;
        }
        r0();
        sgc sgcVar = this.f57210s;
        if (sgcVar != null) {
            zh9Var.m59434j(sgcVar);
        }
        if (zh9Var.o0.m23267r() > 0) {
            di9 di9Var = this.o0;
            di9Var.m23261S(di9Var.m23267r() + 1);
        }
    }

    /* renamed from: k */
    public final void m59435k() {
        this.l0 = this.k0;
        this.k0 = EnumC18642g.NotUsed;
        fqb fqbVarE0 = e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i = 0;
            do {
                zh9 zh9Var = (zh9) objArrM27353n[i];
                if (zh9Var.k0 != EnumC18642g.NotUsed) {
                    zh9Var.m59435k();
                }
                i++;
            } while (i < iM27354o);
        }
    }

    public final void k0() {
        if (this.n0.m4992p(zzb.m60153a(1024) | zzb.m60153a(2048) | zzb.m60153a(4096))) {
            for (alb.AbstractC12216c abstractC12216cM4987k = this.n0.m4987k(); abstractC12216cM4987k != null; abstractC12216cM4987k = abstractC12216cM4987k.m17353B()) {
                if (((zzb.m60153a(1024) & abstractC12216cM4987k.m17356E()) != 0) | ((zzb.m60153a(2048) & abstractC12216cM4987k.m17356E()) != 0) | ((zzb.m60153a(4096) & abstractC12216cM4987k.m17356E()) != 0)) {
                    a0c.m16298a(abstractC12216cM4987k);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m59436l() {
        this.l0 = this.k0;
        this.k0 = EnumC18642g.NotUsed;
        fqb fqbVarE0 = e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i = 0;
            do {
                zh9 zh9Var = (zh9) objArrM27353n[i];
                if (zh9Var.k0 == EnumC18642g.InLayoutBlock) {
                    zh9Var.m59436l();
                }
                i++;
            } while (i < iM27354o);
        }
    }

    public final void l0() {
        C1939a c1939a = this.n0;
        int iM60153a = zzb.m60153a(1024);
        if ((c1939a.m4985i() & iM60153a) != 0) {
            for (alb.AbstractC12216c abstractC12216cM4991o = c1939a.m4991o(); abstractC12216cM4991o != null; abstractC12216cM4991o = abstractC12216cM4991o.m17358G()) {
                if ((abstractC12216cM4991o.m17356E() & iM60153a) != 0) {
                    for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM4991o; abstractC12216cM48434f != null; abstractC12216cM48434f = sk5.m48434f(null)) {
                        if (abstractC12216cM48434f instanceof C1932f) {
                            C1932f c1932f = (C1932f) abstractC12216cM48434f;
                            if (c1932f.g0().isFocused()) {
                                ci9.m21298b(this).getFocusOwner().mo4848c(true, false);
                                c1932f.i0();
                            }
                        } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final String m59437m(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        fqb fqbVarE0 = e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i3 = 0;
            do {
                sb.append(((zh9) objArrM27353n[i3]).m59437m(i + 1));
                i3++;
            } while (i3 < iM27354o);
        }
        String string = sb.toString();
        sq8.m48648g(string, "tree.toString()");
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        sq8.m48648g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final void m0() {
        xzb xzbVarM59411D = m59411D();
        if (xzbVarM59411D != null) {
            xzbVarM59411D.a1();
            return;
        }
        zh9 zh9VarM59431X = m59431X();
        if (zh9VarM59431X != null) {
            zh9VarM59431X.m0();
        }
    }

    public final void n0() {
        xzb xzbVarM59429V = m59429V();
        xzb xzbVarM59410C = m59410C();
        while (xzbVarM59429V != xzbVarM59410C) {
            sq8.m48647f(xzbVarM59429V, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            vh9 vh9Var = (vh9) xzbVarM59429V;
            rgc rgcVarJ0 = vh9Var.J0();
            if (rgcVarJ0 != null) {
                rgcVarJ0.invalidate();
            }
            xzbVarM59429V = vh9Var.Q0();
        }
        rgc rgcVarJ02 = m59410C().J0();
        if (rgcVarJ02 != null) {
            rgcVarJ02.invalidate();
        }
    }

    /* renamed from: o */
    public final void m59438o() {
        sgc sgcVar = this.f57210s;
        if (sgcVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            zh9 zh9VarM59431X = m59431X();
            sb.append(zh9VarM59431X != null ? m59407n(zh9VarM59431X, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        l0();
        zh9 zh9VarM59431X2 = m59431X();
        if (zh9VarM59431X2 != null) {
            zh9VarM59431X2.m0();
            zh9VarM59431X2.o0();
            di9.C12943b c12943bM59421N = m59421N();
            EnumC18642g enumC18642g = EnumC18642g.NotUsed;
            c12943bM59421N.s0(enumC18642g);
            di9.C12942a c12942aM59418K = m59418K();
            if (c12942aM59418K != null) {
                c12942aM59418K.q0(enumC18642g);
            }
        }
        this.o0.m23260R();
        xk7 xk7Var = this.t0;
        if (xk7Var != null) {
            xk7Var.invoke(sgcVar);
        }
        if (this.n0.m4993q(zzb.m60153a(8))) {
            q0();
        }
        this.n0.m5002z();
        this.f57194H = true;
        fqb fqbVarM30999e = this.f57206f.m30999e();
        int iM27354o = fqbVarM30999e.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarM30999e.m27353n();
            int i = 0;
            do {
                ((zh9) objArrM27353n[i]).m59438o();
                i++;
            } while (i < iM27354o);
        }
        this.f57194H = false;
        this.n0.m4996t();
        sgcVar.mo5071n(this);
        this.f57210s = null;
        b1(null);
        this.f57212y = 0;
        m59421N().m0();
        di9.C12942a c12942aM59418K2 = m59418K();
        if (c12942aM59418K2 != null) {
            c12942aM59418K2.l0();
        }
    }

    public final void o0() {
        if (this.f57204d != null) {
            Q0(this, false, false, 3, null);
        } else {
            U0(this, false, false, 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final void m59439p() {
        if (m59415H() != EnumC18640e.Idle || m59414G() || m59422O() || !mo49883a()) {
            return;
        }
        C1939a c1939a = this.n0;
        int iM60153a = zzb.m60153a(256);
        if ((c1939a.m4985i() & iM60153a) != 0) {
            for (alb.AbstractC12216c abstractC12216cM4987k = c1939a.m4987k(); abstractC12216cM4987k != null; abstractC12216cM4987k = abstractC12216cM4987k.m17353B()) {
                if ((abstractC12216cM4987k.m17356E() & iM60153a) != 0) {
                    for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM4987k; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                        if (abstractC12216cM48434f instanceof it7) {
                            it7 it7Var = (it7) abstractC12216cM48434f;
                            it7Var.mo32721r(sk5.m48435g(it7Var, zzb.m60153a(256)));
                        } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        }
                    }
                }
                if ((abstractC12216cM4987k.m17352A() & iM60153a) == 0) {
                    return;
                }
            }
        }
    }

    public final void p0() {
        this.o0.m23250H();
    }

    /* renamed from: q */
    public final void m59440q(mc2 mc2Var) {
        sq8.m48649h(mc2Var, "canvas");
        m59429V().z0(mc2Var);
    }

    public final void q0() {
        this.f57195L = null;
        ci9.m21298b(this).mo5074s();
    }

    /* renamed from: r */
    public final boolean m59441r() {
        u90 u90VarMo23283b;
        di9 di9Var = this.o0;
        if (di9Var.m23266q().mo23283b().m51222k()) {
            return true;
        }
        v90 v90VarM23275z = di9Var.m23275z();
        return v90VarM23275z != null && (u90VarMo23283b = v90VarM23275z.mo23283b()) != null && u90VarMo23283b.m51222k();
    }

    public final void r0() {
        zh9 zh9Var;
        if (this.f57205e > 0) {
            this.f57208h = true;
        }
        if (!this.f57201a || (zh9Var = this.f57209q) == null) {
            return;
        }
        zh9Var.r0();
    }

    @Override // p001o.vgc
    /* renamed from: s */
    public boolean mo40261s() {
        return s0();
    }

    public boolean s0() {
        return this.f57210s != null;
    }

    /* renamed from: t */
    public final boolean m59442t() {
        return this.m0;
    }

    public final Boolean t0() {
        di9.C12942a c12942aM59418K = m59418K();
        if (c12942aM59418K != null) {
            return Boolean.valueOf(c12942aM59418K.mo23282a());
        }
        return null;
    }

    public String toString() {
        return gb9.m28310a(this, null) + " children: " + m59445w().size() + " measurePolicy: " + m59423P();
    }

    /* renamed from: u */
    public final List m59443u() {
        di9.C12942a c12942aM59418K = m59418K();
        sq8.m48646e(c12942aM59418K);
        return c12942aM59418K.m23281Z();
    }

    public final boolean u0() {
        return this.f57203c;
    }

    /* renamed from: v */
    public final List m59444v() {
        return m59421N().m23297Z();
    }

    public final boolean v0(bu3 bu3Var) {
        if (bu3Var == null || this.f57204d == null) {
            return false;
        }
        di9.C12942a c12942aM59418K = m59418K();
        sq8.m48646e(c12942aM59418K);
        return c12942aM59418K.n0(bu3Var.m19803o());
    }

    /* renamed from: w */
    public final List m59445w() {
        return e0().m27348h();
    }

    /* renamed from: x */
    public final kcf m59446x() {
        if (!this.n0.m4993q(zzb.m60153a(8)) || this.f57195L != null) {
            return this.f57195L;
        }
        gge ggeVar = new gge();
        ggeVar.f25106a = new kcf();
        ci9.m21298b(this).getSnapshotObserver().m54369i(this, new C18645j(ggeVar));
        Object obj = ggeVar.f25106a;
        this.f57195L = (kcf) obj;
        return (kcf) obj;
    }

    public final void x0() {
        if (this.k0 == EnumC18642g.NotUsed) {
            m59436l();
        }
        di9.C12942a c12942aM59418K = m59418K();
        sq8.m48646e(c12942aM59418K);
        c12942aM59418K.o0();
    }

    /* renamed from: y */
    public zl5 m59447y() {
        return this.f57200Z;
    }

    public final void y0() {
        this.o0.m23253K();
    }

    /* renamed from: z */
    public final int m59448z() {
        return this.f57212y;
    }

    public final void z0() {
        this.o0.m23254L();
    }

    public /* synthetic */ zh9(boolean z, int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? mcf.m38748a() : i);
    }
}
