package p001o;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.Map;
import p001o.q8d;
import p001o.zh9;

/* loaded from: classes2.dex */
public final class di9 {

    /* renamed from: a */
    public final zh9 f19966a;

    /* renamed from: b */
    public zh9.EnumC18640e f19967b;

    /* renamed from: c */
    public boolean f19968c;

    /* renamed from: d */
    public boolean f19969d;

    /* renamed from: e */
    public boolean f19970e;

    /* renamed from: f */
    public boolean f19971f;

    /* renamed from: g */
    public boolean f19972g;

    /* renamed from: h */
    public boolean f19973h;

    /* renamed from: i */
    public int f19974i;

    /* renamed from: j */
    public int f19975j;

    /* renamed from: k */
    public boolean f19976k;

    /* renamed from: l */
    public boolean f19977l;

    /* renamed from: m */
    public int f19978m;

    /* renamed from: n */
    public final C12943b f19979n;

    /* renamed from: o */
    public C12942a f19980o;

    /* renamed from: o.di9$a */
    public final class C12942a extends q8d implements y0b, v90 {

        /* renamed from: H */
        public bu3 f19981H;

        /* renamed from: M */
        public float f19983M;

        /* renamed from: Q */
        public xk7 f19984Q;

        /* renamed from: X */
        public boolean f19985X;

        /* renamed from: f */
        public boolean f19988f;
        public boolean i0;

        /* renamed from: s */
        public boolean f19992s;

        /* renamed from: x */
        public boolean f19993x;

        /* renamed from: y */
        public boolean f19994y;

        /* renamed from: g */
        public int f19989g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: h */
        public int f19990h = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: q */
        public zh9.EnumC18642g f19991q = zh9.EnumC18642g.NotUsed;

        /* renamed from: L */
        public long f19982L = gl8.f25414a.m29003a();

        /* renamed from: Y */
        public final u90 f19986Y = new ula(this);

        /* renamed from: Z */
        public final fqb f19987Z = new fqb(new C12942a[16], 0);
        public boolean h0 = true;
        public boolean j0 = true;
        public Object k0 = c0().d0();

        /* renamed from: o.di9$a$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f19995a;

            /* renamed from: b */
            public static final /* synthetic */ int[] f19996b;

            static {
                int[] iArr = new int[zh9.EnumC18640e.values().length];
                try {
                    iArr[zh9.EnumC18640e.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[zh9.EnumC18640e.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[zh9.EnumC18640e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[zh9.EnumC18640e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f19995a = iArr;
                int[] iArr2 = new int[zh9.EnumC18642g.values().length];
                try {
                    iArr2[zh9.EnumC18642g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[zh9.EnumC18642g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f19996b = iArr2;
            }
        }

        /* renamed from: o.di9$a$b */
        public static final class b extends kf9 implements uk7 {

            /* renamed from: b */
            public final /* synthetic */ wla f19998b;

            /* renamed from: o.di9$a$b$a */
            public static final class a extends kf9 implements xk7 {

                /* renamed from: a */
                public static final a f19999a = new a();

                public a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m23289a(v90 v90Var) {
                    sq8.m48649h(v90Var, "child");
                    v90Var.mo23283b().m51231t(false);
                }

                @Override // p001o.xk7
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m23289a((v90) obj);
                    return y3i.f54824a;
                }
            }

            /* renamed from: o.di9$a$b$b, reason: collision with other inner class name */
            public static final class C19586b extends kf9 implements xk7 {

                /* renamed from: a */
                public static final C19586b f20000a = new C19586b();

                public C19586b() {
                    super(1);
                }

                /* renamed from: a */
                public final void m23290a(v90 v90Var) {
                    sq8.m48649h(v90Var, "child");
                    v90Var.mo23283b().m51228q(v90Var.mo23283b().m51223l());
                }

                @Override // p001o.xk7
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m23290a((v90) obj);
                    return y3i.f54824a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wla wlaVar) {
                super(0);
                this.f19998b = wlaVar;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68992invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68992invoke() {
                C12942a.this.m23280Y();
                C12942a.this.mo23288v(a.f19999a);
                this.f19998b.b0().mo18090a();
                C12942a.this.m23279X();
                C12942a.this.mo23288v(C19586b.f20000a);
            }
        }

        /* renamed from: o.di9$a$c */
        public static final class c extends kf9 implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ di9 f20001a;

            /* renamed from: b */
            public final /* synthetic */ long f20002b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(di9 di9Var, long j) {
                super(0);
                this.f20001a = di9Var;
                this.f20002b = j;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68993invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68993invoke() {
                q8d.AbstractC16323a.a aVar = q8d.AbstractC16323a.f41476a;
                di9 di9Var = this.f20001a;
                long j = this.f20002b;
                wla wlaVarK0 = di9Var.m23248F().K0();
                sq8.m48646e(wlaVarK0);
                q8d.AbstractC16323a.m44989p(aVar, wlaVarK0, j, 0.0f, 2, null);
            }
        }

        /* renamed from: o.di9$a$d */
        public static final class d extends kf9 implements xk7 {

            /* renamed from: a */
            public static final d f20003a = new d();

            public d() {
                super(1);
            }

            /* renamed from: a */
            public final void m23291a(v90 v90Var) {
                sq8.m48649h(v90Var, "it");
                v90Var.mo23283b().m51232u(false);
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m23291a((v90) obj);
                return y3i.f54824a;
            }
        }

        public C12942a() {
        }

        @Override // p001o.v90
        /* renamed from: H */
        public void mo23278H() {
            zh9.Q0(di9.this.f19966a, false, false, 3, null);
        }

        @Override // p001o.q8d
        /* renamed from: S */
        public void mo21320S(long j, float f, xk7 xk7Var) {
            di9.this.f19967b = zh9.EnumC18640e.LookaheadLayingOut;
            this.f19993x = true;
            if (!gl8.m29000e(j, this.f19982L)) {
                if (di9.this.m23268s() || di9.this.m23269t()) {
                    di9.this.f19972g = true;
                }
                j0();
            }
            sgc sgcVarM21298b = ci9.m21298b(di9.this.f19966a);
            if (di9.this.m23243A() || !mo23282a()) {
                di9.this.m23262T(false);
                mo23283b().m51229r(false);
                wgc.m54361c(sgcVarM21298b.getSnapshotObserver(), di9.this.f19966a, false, new c(di9.this, j), 2, null);
            } else {
                m0();
            }
            this.f19982L = j;
            this.f19983M = f;
            this.f19984Q = xk7Var;
            di9.this.f19967b = zh9.EnumC18640e.Idle;
        }

        /* renamed from: X */
        public final void m23279X() {
            fqb fqbVarE0 = di9.this.f19966a.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                int i = 0;
                do {
                    C12942a c12942aM23245C = ((zh9) objArrM27353n[i]).m59413F().m23245C();
                    sq8.m48646e(c12942aM23245C);
                    int i2 = c12942aM23245C.f19989g;
                    int i3 = c12942aM23245C.f19990h;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        c12942aM23245C.i0();
                    }
                    i++;
                } while (i < iM27354o);
            }
        }

        /* renamed from: Y */
        public final void m23280Y() {
            int i = 0;
            di9.this.f19974i = 0;
            fqb fqbVarE0 = di9.this.f19966a.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                do {
                    C12942a c12942aM23245C = ((zh9) objArrM27353n[i]).m59413F().m23245C();
                    sq8.m48646e(c12942aM23245C);
                    c12942aM23245C.f19989g = c12942aM23245C.f19990h;
                    c12942aM23245C.f19990h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    if (c12942aM23245C.f19991q == zh9.EnumC18642g.InLayoutBlock) {
                        c12942aM23245C.f19991q = zh9.EnumC18642g.NotUsed;
                    }
                    i++;
                } while (i < iM27354o);
            }
        }

        /* renamed from: Z */
        public final List m23281Z() {
            di9.this.f19966a.m59445w();
            if (!this.h0) {
                return this.f19987Z.m27348h();
            }
            zh9 zh9Var = di9.this.f19966a;
            fqb fqbVar = this.f19987Z;
            fqb fqbVarE0 = zh9Var.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                int i = 0;
                do {
                    zh9 zh9Var2 = (zh9) objArrM27353n[i];
                    if (fqbVar.m27354o() <= i) {
                        C12942a c12942aM23245C = zh9Var2.m59413F().m23245C();
                        sq8.m48646e(c12942aM23245C);
                        fqbVar.m27344c(c12942aM23245C);
                    } else {
                        C12942a c12942aM23245C2 = zh9Var2.m59413F().m23245C();
                        sq8.m48646e(c12942aM23245C2);
                        fqbVar.m27364y(i, c12942aM23245C2);
                    }
                    i++;
                } while (i < iM27354o);
            }
            fqbVar.m27362w(zh9Var.m59445w().size(), fqbVar.m27354o());
            this.h0 = false;
            return this.f19987Z.m27348h();
        }

        @Override // p001o.v90
        /* renamed from: a */
        public boolean mo23282a() {
            return this.f19985X;
        }

        public final bu3 a0() {
            return this.f19981H;
        }

        @Override // p001o.v90
        /* renamed from: b */
        public u90 mo23283b() {
            return this.f19986Y;
        }

        public final boolean b0() {
            return this.i0;
        }

        public final C12943b c0() {
            return di9.this.m23246D();
        }

        @Override // p001o.v90
        /* renamed from: d */
        public Map mo23284d() {
            if (!this.f19992s) {
                if (di9.this.m23274y() == zh9.EnumC18640e.LookaheadMeasuring) {
                    mo23283b().m51230s(true);
                    if (mo23283b().m51219g()) {
                        di9.this.m23254L();
                    }
                } else {
                    mo23283b().m51229r(true);
                }
            }
            wla wlaVarK0 = mo23287t().K0();
            if (wlaVarK0 != null) {
                wlaVarK0.i0(true);
            }
            mo23286n();
            wla wlaVarK02 = mo23287t().K0();
            if (wlaVarK02 != null) {
                wlaVarK02.i0(false);
            }
            return mo23283b().m51220h();
        }

        public final zh9.EnumC18642g d0() {
            return this.f19991q;
        }

        @Override // p001o.v90
        /* renamed from: e */
        public v90 mo23285e() {
            di9 di9VarM59413F;
            zh9 zh9VarM59431X = di9.this.f19966a.m59431X();
            if (zh9VarM59431X == null || (di9VarM59413F = zh9VarM59431X.m59413F()) == null) {
                return null;
            }
            return di9VarM59413F.m23275z();
        }

        public Object e0() {
            return this.k0;
        }

        public final void f0(boolean z) {
            zh9 zh9VarM59431X;
            zh9 zh9VarM59431X2 = di9.this.f19966a.m59431X();
            zh9.EnumC18642g enumC18642gM59412E = di9.this.f19966a.m59412E();
            if (zh9VarM59431X2 == null || enumC18642gM59412E == zh9.EnumC18642g.NotUsed) {
                return;
            }
            while (zh9VarM59431X2.m59412E() == enumC18642gM59412E && (zh9VarM59431X = zh9VarM59431X2.m59431X()) != null) {
                zh9VarM59431X2 = zh9VarM59431X;
            }
            int i = a.f19996b[enumC18642gM59412E.ordinal()];
            if (i == 1) {
                if (zh9VarM59431X2.m59419L() != null) {
                    zh9.Q0(zh9VarM59431X2, z, false, 2, null);
                    return;
                } else {
                    zh9.U0(zh9VarM59431X2, z, false, 2, null);
                    return;
                }
            }
            if (i != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            if (zh9VarM59431X2.m59419L() != null) {
                zh9VarM59431X2.N0(z);
            } else {
                zh9VarM59431X2.R0(z);
            }
        }

        public final void g0() {
            this.j0 = true;
        }

        public final void h0() {
            boolean zMo23282a = mo23282a();
            s0(true);
            int i = 0;
            if (!zMo23282a && di9.this.m23244B()) {
                zh9.Q0(di9.this.f19966a, true, false, 2, null);
            }
            fqb fqbVarE0 = di9.this.f19966a.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                do {
                    zh9 zh9Var = (zh9) objArrM27353n[i];
                    if (zh9Var.m59432Y() != Integer.MAX_VALUE) {
                        C12942a c12942aM59418K = zh9Var.m59418K();
                        sq8.m48646e(c12942aM59418K);
                        c12942aM59418K.h0();
                        zh9Var.V0(zh9Var);
                    }
                    i++;
                } while (i < iM27354o);
            }
        }

        public final void i0() {
            if (mo23282a()) {
                int i = 0;
                s0(false);
                fqb fqbVarE0 = di9.this.f19966a.e0();
                int iM27354o = fqbVarE0.m27354o();
                if (iM27354o > 0) {
                    Object[] objArrM27353n = fqbVarE0.m27353n();
                    do {
                        C12942a c12942aM23245C = ((zh9) objArrM27353n[i]).m59413F().m23245C();
                        sq8.m48646e(c12942aM23245C);
                        c12942aM23245C.i0();
                        i++;
                    } while (i < iM27354o);
                }
            }
        }

        public final void j0() {
            fqb fqbVarE0;
            int iM27354o;
            if (di9.this.m23267r() <= 0 || (iM27354o = (fqbVarE0 = di9.this.f19966a.e0()).m27354o()) <= 0) {
                return;
            }
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i = 0;
            do {
                zh9 zh9Var = (zh9) objArrM27353n[i];
                di9 di9VarM59413F = zh9Var.m59413F();
                if ((di9VarM59413F.m23269t() || di9VarM59413F.m23268s()) && !di9VarM59413F.m23273x()) {
                    zh9.O0(zh9Var, false, 1, null);
                }
                C12942a c12942aM23245C = di9VarM59413F.m23245C();
                if (c12942aM23245C != null) {
                    c12942aM23245C.j0();
                }
                i++;
            } while (i < iM27354o);
        }

        public final void k0() {
            zh9 zh9Var = di9.this.f19966a;
            di9 di9Var = di9.this;
            fqb fqbVarE0 = zh9Var.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                int i = 0;
                do {
                    zh9 zh9Var2 = (zh9) objArrM27353n[i];
                    if (zh9Var2.m59417J() && zh9Var2.m59425R() == zh9.EnumC18642g.InMeasureBlock) {
                        C12942a c12942aM23245C = zh9Var2.m59413F().m23245C();
                        sq8.m48646e(c12942aM23245C);
                        bu3 bu3VarA0 = a0();
                        sq8.m48646e(bu3VarA0);
                        if (c12942aM23245C.n0(bu3VarA0.m19803o())) {
                            zh9.Q0(di9Var.f19966a, false, false, 3, null);
                        }
                    }
                    i++;
                } while (i < iM27354o);
            }
        }

        public final void l0() {
            this.f19990h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f19989g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            s0(false);
        }

        public final void m0() {
            zh9 zh9VarM59431X = di9.this.f19966a.m59431X();
            if (!mo23282a()) {
                h0();
            }
            if (zh9VarM59431X == null) {
                this.f19990h = 0;
            } else if (!this.f19988f && (zh9VarM59431X.m59415H() == zh9.EnumC18640e.LayingOut || zh9VarM59431X.m59415H() == zh9.EnumC18640e.LookaheadLayingOut)) {
                if (!(this.f19990h == Integer.MAX_VALUE)) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                this.f19990h = zh9VarM59431X.m59413F().f19974i;
                zh9VarM59431X.m59413F().f19974i++;
            }
            mo23286n();
        }

        @Override // p001o.v90
        /* renamed from: n */
        public void mo23286n() {
            this.i0 = true;
            mo23283b().m51226o();
            if (di9.this.m23243A()) {
                k0();
            }
            wla wlaVarK0 = mo23287t().K0();
            sq8.m48646e(wlaVarK0);
            if (di9.this.f19973h || (!this.f19992s && !wlaVarK0.f0() && di9.this.m23243A())) {
                di9.this.f19972g = false;
                zh9.EnumC18640e enumC18640eM23274y = di9.this.m23274y();
                di9.this.f19967b = zh9.EnumC18640e.LookaheadLayingOut;
                sgc sgcVarM21298b = ci9.m21298b(di9.this.f19966a);
                di9.this.m23263U(false);
                wgc.m54362e(sgcVarM21298b.getSnapshotObserver(), di9.this.f19966a, false, new b(wlaVarK0), 2, null);
                di9.this.f19967b = enumC18640eM23274y;
                if (di9.this.m23269t() && wlaVarK0.f0()) {
                    requestLayout();
                }
                di9.this.f19973h = false;
            }
            if (mo23283b().m51223l()) {
                mo23283b().m51228q(true);
            }
            if (mo23283b().m51219g() && mo23283b().m51222k()) {
                mo23283b().m51225n();
            }
            this.i0 = false;
        }

        public final boolean n0(long j) {
            zh9 zh9VarM59431X = di9.this.f19966a.m59431X();
            di9.this.f19966a.Y0(di9.this.f19966a.m59442t() || (zh9VarM59431X != null && zh9VarM59431X.m59442t()));
            if (!di9.this.f19966a.m59417J()) {
                bu3 bu3Var = this.f19981H;
                if (bu3Var == null ? false : bu3.m19793e(bu3Var.m19803o(), j)) {
                    sgc sgcVarM59430W = di9.this.f19966a.m59430W();
                    if (sgcVarM59430W != null) {
                        sgcVarM59430W.mo5066e(di9.this.f19966a, true);
                    }
                    di9.this.f19966a.X0();
                    return false;
                }
            }
            this.f19981H = bu3.m19790b(j);
            mo23283b().m51230s(false);
            mo23288v(d.f20003a);
            this.f19994y = true;
            wla wlaVarK0 = di9.this.m23248F().K0();
            if (!(wlaVarK0 != null)) {
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            long jM40749a = nl8.m40749a(wlaVarK0.m44974Q(), wlaVarK0.m44970L());
            di9.this.m23258P(j);
            m44976T(nl8.m40749a(wlaVarK0.m44974Q(), wlaVarK0.m44970L()));
            return (ml8.m39312e(jM40749a) == wlaVarK0.m44974Q() && ml8.m39311d(jM40749a) == wlaVarK0.m44970L()) ? false : true;
        }

        public final void o0() {
            try {
                this.f19988f = true;
                if (!this.f19993x) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                mo21320S(this.f19982L, 0.0f, null);
            } finally {
                this.f19988f = false;
            }
        }

        public final void p0(boolean z) {
            this.h0 = z;
        }

        public final void q0(zh9.EnumC18642g enumC18642g) {
            sq8.m48649h(enumC18642g, "<set-?>");
            this.f19991q = enumC18642g;
        }

        public final void r0(int i) {
            this.f19990h = i;
        }

        @Override // p001o.v90
        public void requestLayout() {
            zh9.O0(di9.this.f19966a, false, 1, null);
        }

        public void s0(boolean z) {
            this.f19985X = z;
        }

        @Override // p001o.v90
        /* renamed from: t */
        public xzb mo23287t() {
            return di9.this.f19966a.m59410C();
        }

        public final void t0(zh9 zh9Var) {
            zh9.EnumC18642g enumC18642g;
            zh9 zh9VarM59431X = zh9Var.m59431X();
            if (zh9VarM59431X == null) {
                this.f19991q = zh9.EnumC18642g.NotUsed;
                return;
            }
            if (!(this.f19991q == zh9.EnumC18642g.NotUsed || zh9Var.m59442t())) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            int i = a.f19995a[zh9VarM59431X.m59415H().ordinal()];
            if (i == 1 || i == 2) {
                enumC18642g = zh9.EnumC18642g.InMeasureBlock;
            } else {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + zh9VarM59431X.m59415H());
                }
                enumC18642g = zh9.EnumC18642g.InLayoutBlock;
            }
            this.f19991q = enumC18642g;
        }

        public final boolean u0() {
            if (e0() == null) {
                wla wlaVarK0 = di9.this.m23248F().K0();
                sq8.m48646e(wlaVarK0);
                if (wlaVarK0.r0() == null) {
                    return false;
                }
            }
            if (!this.j0) {
                return false;
            }
            this.j0 = false;
            wla wlaVarK02 = di9.this.m23248F().K0();
            sq8.m48646e(wlaVarK02);
            this.k0 = wlaVarK02.r0();
            return true;
        }

        @Override // p001o.v90
        /* renamed from: v */
        public void mo23288v(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            fqb fqbVarE0 = di9.this.f19966a.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                int i = 0;
                do {
                    v90 v90VarM23275z = ((zh9) objArrM27353n[i]).m59413F().m23275z();
                    sq8.m48646e(v90VarM23275z);
                    xk7Var.invoke(v90VarM23275z);
                    i++;
                } while (i < iM27354o);
            }
        }

        @Override // p001o.y0b
        /* renamed from: w */
        public q8d mo21322w(long j) {
            t0(di9.this.f19966a);
            if (di9.this.f19966a.m59412E() == zh9.EnumC18642g.NotUsed) {
                di9.this.f19966a.m59435k();
            }
            n0(j);
            return this;
        }
    }

    /* renamed from: o.di9$b */
    public final class C12943b extends q8d implements y0b, v90 {

        /* renamed from: L */
        public xk7 f20005L;

        /* renamed from: M */
        public float f20006M;

        /* renamed from: X */
        public Object f20008X;

        /* renamed from: Y */
        public boolean f20009Y;

        /* renamed from: f */
        public boolean f20011f;
        public boolean j0;
        public float k0;

        /* renamed from: q */
        public boolean f20014q;

        /* renamed from: s */
        public boolean f20015s;

        /* renamed from: y */
        public boolean f20017y;

        /* renamed from: g */
        public int f20012g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: h */
        public int f20013h = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: x */
        public zh9.EnumC18642g f20016x = zh9.EnumC18642g.NotUsed;

        /* renamed from: H */
        public long f20004H = gl8.f25414a.m29003a();

        /* renamed from: Q */
        public boolean f20007Q = true;

        /* renamed from: Z */
        public final u90 f20010Z = new ai9(this);
        public final fqb h0 = new fqb(new C12943b[16], 0);
        public boolean i0 = true;

        /* renamed from: o.di9$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f20018a;

            /* renamed from: b */
            public static final /* synthetic */ int[] f20019b;

            static {
                int[] iArr = new int[zh9.EnumC18640e.values().length];
                try {
                    iArr[zh9.EnumC18640e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[zh9.EnumC18640e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f20018a = iArr;
                int[] iArr2 = new int[zh9.EnumC18642g.values().length];
                try {
                    iArr2[zh9.EnumC18642g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[zh9.EnumC18642g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f20019b = iArr2;
            }
        }

        /* renamed from: o.di9$b$b */
        public static final class b extends kf9 implements uk7 {

            /* renamed from: b */
            public final /* synthetic */ zh9 f20021b;

            /* renamed from: o.di9$b$b$a */
            public static final class a extends kf9 implements xk7 {

                /* renamed from: a */
                public static final a f20022a = new a();

                public a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m23298a(v90 v90Var) {
                    sq8.m48649h(v90Var, "it");
                    v90Var.mo23283b().m51231t(false);
                }

                @Override // p001o.xk7
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m23298a((v90) obj);
                    return y3i.f54824a;
                }
            }

            /* renamed from: o.di9$b$b$b, reason: collision with other inner class name */
            public static final class C19587b extends kf9 implements xk7 {

                /* renamed from: a */
                public static final C19587b f20023a = new C19587b();

                public C19587b() {
                    super(1);
                }

                /* renamed from: a */
                public final void m23299a(v90 v90Var) {
                    sq8.m48649h(v90Var, "it");
                    v90Var.mo23283b().m51228q(v90Var.mo23283b().m51223l());
                }

                @Override // p001o.xk7
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m23299a((v90) obj);
                    return y3i.f54824a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(zh9 zh9Var) {
                super(0);
                this.f20021b = zh9Var;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68994invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68994invoke() {
                C12943b.this.m23296Y();
                C12943b.this.mo23288v(a.f20022a);
                this.f20021b.m59410C().b0().mo18090a();
                C12943b.this.m23295X();
                C12943b.this.mo23288v(C19587b.f20023a);
            }
        }

        /* renamed from: o.di9$b$c */
        public static final class c extends kf9 implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ xk7 f20024a;

            /* renamed from: b */
            public final /* synthetic */ di9 f20025b;

            /* renamed from: c */
            public final /* synthetic */ long f20026c;

            /* renamed from: d */
            public final /* synthetic */ float f20027d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(xk7 xk7Var, di9 di9Var, long j, float f) {
                super(0);
                this.f20024a = xk7Var;
                this.f20025b = di9Var;
                this.f20026c = j;
                this.f20027d = f;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68995invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68995invoke() {
                q8d.AbstractC16323a.a aVar = q8d.AbstractC16323a.f41476a;
                xk7 xk7Var = this.f20024a;
                di9 di9Var = this.f20025b;
                long j = this.f20026c;
                float f = this.f20027d;
                if (xk7Var == null) {
                    aVar.m44995o(di9Var.m23248F(), j, f);
                } else {
                    aVar.m44998u(di9Var.m23248F(), j, f, xk7Var);
                }
            }
        }

        /* renamed from: o.di9$b$d */
        public static final class d extends kf9 implements xk7 {

            /* renamed from: a */
            public static final d f20028a = new d();

            public d() {
                super(1);
            }

            /* renamed from: a */
            public final void m23300a(v90 v90Var) {
                sq8.m48649h(v90Var, "it");
                v90Var.mo23283b().m51232u(false);
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m23300a((v90) obj);
                return y3i.f54824a;
            }
        }

        public C12943b() {
        }

        @Override // p001o.v90
        /* renamed from: H */
        public void mo23278H() {
            zh9.U0(di9.this.f19966a, false, false, 3, null);
        }

        @Override // p001o.q8d
        /* renamed from: O */
        public int mo23294O() {
            return di9.this.m23248F().mo23294O();
        }

        @Override // p001o.q8d
        /* renamed from: S */
        public void mo21320S(long j, float f, xk7 xk7Var) {
            if (!gl8.m29000e(j, this.f20004H)) {
                if (di9.this.m23268s() || di9.this.m23269t()) {
                    di9.this.f19969d = true;
                }
                k0();
            }
            di9 di9Var = di9.this;
            if (di9Var.m23251I(di9Var.f19966a)) {
                q8d.AbstractC16323a.a aVar = q8d.AbstractC16323a.f41476a;
                di9 di9Var2 = di9.this;
                C12942a c12942aM23245C = di9Var2.m23245C();
                sq8.m48646e(c12942aM23245C);
                zh9 zh9VarM59431X = di9Var2.f19966a.m59431X();
                if (zh9VarM59431X != null) {
                    zh9VarM59431X.m59413F().f19974i = 0;
                }
                c12942aM23245C.r0(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                q8d.AbstractC16323a.m44988n(aVar, c12942aM23245C, gl8.m29001f(j), gl8.m29002g(j), 0.0f, 4, null);
            }
            o0(j, f, xk7Var);
        }

        /* renamed from: X */
        public final void m23295X() {
            zh9 zh9Var = di9.this.f19966a;
            fqb fqbVarE0 = zh9Var.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                int i = 0;
                do {
                    zh9 zh9Var2 = (zh9) objArrM27353n[i];
                    if (zh9Var2.m59421N().f20012g != zh9Var2.m59432Y()) {
                        zh9Var.F0();
                        zh9Var.m0();
                        if (zh9Var2.m59432Y() == Integer.MAX_VALUE) {
                            zh9Var2.m59421N().j0();
                        }
                    }
                    i++;
                } while (i < iM27354o);
            }
        }

        /* renamed from: Y */
        public final void m23296Y() {
            int i = 0;
            di9.this.f19975j = 0;
            fqb fqbVarE0 = di9.this.f19966a.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                do {
                    C12943b c12943bM59421N = ((zh9) objArrM27353n[i]).m59421N();
                    c12943bM59421N.f20012g = c12943bM59421N.f20013h;
                    c12943bM59421N.f20013h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    if (c12943bM59421N.f20016x == zh9.EnumC18642g.InLayoutBlock) {
                        c12943bM59421N.f20016x = zh9.EnumC18642g.NotUsed;
                    }
                    i++;
                } while (i < iM27354o);
            }
        }

        /* renamed from: Z */
        public final List m23297Z() {
            di9.this.f19966a.f1();
            if (!this.i0) {
                return this.h0.m27348h();
            }
            zh9 zh9Var = di9.this.f19966a;
            fqb fqbVar = this.h0;
            fqb fqbVarE0 = zh9Var.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                int i = 0;
                do {
                    zh9 zh9Var2 = (zh9) objArrM27353n[i];
                    if (fqbVar.m27354o() <= i) {
                        fqbVar.m27344c(zh9Var2.m59413F().m23246D());
                    } else {
                        fqbVar.m27364y(i, zh9Var2.m59413F().m23246D());
                    }
                    i++;
                } while (i < iM27354o);
            }
            fqbVar.m27362w(zh9Var.m59445w().size(), fqbVar.m27354o());
            this.i0 = false;
            return this.h0.m27348h();
        }

        @Override // p001o.v90
        /* renamed from: a */
        public boolean mo23282a() {
            return this.f20009Y;
        }

        public final bu3 a0() {
            if (this.f20014q) {
                return bu3.m19790b(m44973P());
            }
            return null;
        }

        @Override // p001o.v90
        /* renamed from: b */
        public u90 mo23283b() {
            return this.f20010Z;
        }

        public final boolean b0() {
            return this.j0;
        }

        public final zh9.EnumC18642g c0() {
            return this.f20016x;
        }

        @Override // p001o.v90
        /* renamed from: d */
        public Map mo23284d() {
            if (!this.f20017y) {
                if (di9.this.m23274y() == zh9.EnumC18640e.Measuring) {
                    mo23283b().m51230s(true);
                    if (mo23283b().m51219g()) {
                        di9.this.m23253K();
                    }
                } else {
                    mo23283b().m51229r(true);
                }
            }
            mo23287t().i0(true);
            mo23286n();
            mo23287t().i0(false);
            return mo23283b().m51220h();
        }

        public Object d0() {
            return this.f20008X;
        }

        @Override // p001o.v90
        /* renamed from: e */
        public v90 mo23285e() {
            di9 di9VarM59413F;
            zh9 zh9VarM59431X = di9.this.f19966a.m59431X();
            if (zh9VarM59431X == null || (di9VarM59413F = zh9VarM59431X.m59413F()) == null) {
                return null;
            }
            return di9VarM59413F.m23266q();
        }

        public final int e0() {
            return this.f20013h;
        }

        public final float f0() {
            return this.k0;
        }

        public final void g0(boolean z) {
            zh9 zh9VarM59431X;
            zh9 zh9VarM59431X2 = di9.this.f19966a.m59431X();
            zh9.EnumC18642g enumC18642gM59412E = di9.this.f19966a.m59412E();
            if (zh9VarM59431X2 == null || enumC18642gM59412E == zh9.EnumC18642g.NotUsed) {
                return;
            }
            while (zh9VarM59431X2.m59412E() == enumC18642gM59412E && (zh9VarM59431X = zh9VarM59431X2.m59431X()) != null) {
                zh9VarM59431X2 = zh9VarM59431X;
            }
            int i = a.f20019b[enumC18642gM59412E.ordinal()];
            if (i == 1) {
                zh9.U0(zh9VarM59431X2, z, false, 2, null);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                zh9VarM59431X2.R0(z);
            }
        }

        public final void h0() {
            this.f20007Q = true;
        }

        public final void i0() {
            boolean zMo23282a = mo23282a();
            t0(true);
            zh9 zh9Var = di9.this.f19966a;
            int i = 0;
            if (!zMo23282a) {
                if (zh9Var.m59422O()) {
                    zh9.U0(zh9Var, true, false, 2, null);
                } else if (zh9Var.m59417J()) {
                    zh9.Q0(zh9Var, true, false, 2, null);
                }
            }
            xzb xzbVarQ0 = zh9Var.m59410C().Q0();
            for (xzb xzbVarM59429V = zh9Var.m59429V(); !sq8.m48644c(xzbVarM59429V, xzbVarQ0) && xzbVarM59429V != null; xzbVarM59429V = xzbVarM59429V.Q0()) {
                if (xzbVarM59429V.H0()) {
                    xzbVarM59429V.a1();
                }
            }
            fqb fqbVarE0 = zh9Var.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                do {
                    zh9 zh9Var2 = (zh9) objArrM27353n[i];
                    if (zh9Var2.m59432Y() != Integer.MAX_VALUE) {
                        zh9Var2.m59421N().i0();
                        zh9Var.V0(zh9Var2);
                    }
                    i++;
                } while (i < iM27354o);
            }
        }

        public final void j0() {
            if (mo23282a()) {
                int i = 0;
                t0(false);
                fqb fqbVarE0 = di9.this.f19966a.e0();
                int iM27354o = fqbVarE0.m27354o();
                if (iM27354o > 0) {
                    Object[] objArrM27353n = fqbVarE0.m27353n();
                    do {
                        ((zh9) objArrM27353n[i]).m59421N().j0();
                        i++;
                    } while (i < iM27354o);
                }
            }
        }

        public final void k0() {
            fqb fqbVarE0;
            int iM27354o;
            if (di9.this.m23267r() <= 0 || (iM27354o = (fqbVarE0 = di9.this.f19966a.e0()).m27354o()) <= 0) {
                return;
            }
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i = 0;
            do {
                zh9 zh9Var = (zh9) objArrM27353n[i];
                di9 di9VarM59413F = zh9Var.m59413F();
                if ((di9VarM59413F.m23269t() || di9VarM59413F.m23268s()) && !di9VarM59413F.m23273x()) {
                    zh9.S0(zh9Var, false, 1, null);
                }
                di9VarM59413F.m23246D().k0();
                i++;
            } while (i < iM27354o);
        }

        public final void l0() {
            zh9 zh9Var = di9.this.f19966a;
            di9 di9Var = di9.this;
            fqb fqbVarE0 = zh9Var.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                int i = 0;
                do {
                    zh9 zh9Var2 = (zh9) objArrM27353n[i];
                    if (zh9Var2.m59422O() && zh9Var2.m59424Q() == zh9.EnumC18642g.InMeasureBlock && zh9.J0(zh9Var2, null, 1, null)) {
                        zh9.U0(di9Var.f19966a, false, false, 3, null);
                    }
                    i++;
                } while (i < iM27354o);
            }
        }

        public final void m0() {
            this.f20013h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f20012g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            t0(false);
        }

        @Override // p001o.v90
        /* renamed from: n */
        public void mo23286n() {
            this.j0 = true;
            mo23283b().m51226o();
            if (di9.this.m23273x()) {
                l0();
            }
            if (di9.this.f19970e || (!this.f20017y && !mo23287t().f0() && di9.this.m23273x())) {
                di9.this.f19969d = false;
                zh9.EnumC18640e enumC18640eM23274y = di9.this.m23274y();
                di9.this.f19967b = zh9.EnumC18640e.LayingOut;
                di9.this.m23263U(false);
                zh9 zh9Var = di9.this.f19966a;
                ci9.m21298b(zh9Var).getSnapshotObserver().m54366d(zh9Var, false, new b(zh9Var));
                di9.this.f19967b = enumC18640eM23274y;
                if (mo23287t().f0() && di9.this.m23269t()) {
                    requestLayout();
                }
                di9.this.f19970e = false;
            }
            if (mo23283b().m51223l()) {
                mo23283b().m51228q(true);
            }
            if (mo23283b().m51219g() && mo23283b().m51222k()) {
                mo23283b().m51225n();
            }
            this.j0 = false;
        }

        public final void n0() {
            zh9 zh9VarM59431X = di9.this.f19966a.m59431X();
            float fS0 = mo23287t().S0();
            zh9 zh9Var = di9.this.f19966a;
            xzb xzbVarM59429V = zh9Var.m59429V();
            xzb xzbVarM59410C = zh9Var.m59410C();
            while (xzbVarM59429V != xzbVarM59410C) {
                sq8.m48647f(xzbVarM59429V, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                vh9 vh9Var = (vh9) xzbVarM59429V;
                fS0 += vh9Var.S0();
                xzbVarM59429V = vh9Var.Q0();
            }
            if (!(fS0 == this.k0)) {
                this.k0 = fS0;
                if (zh9VarM59431X != null) {
                    zh9VarM59431X.F0();
                }
                if (zh9VarM59431X != null) {
                    zh9VarM59431X.m0();
                }
            }
            if (!mo23282a()) {
                if (zh9VarM59431X != null) {
                    zh9VarM59431X.m0();
                }
                i0();
            }
            if (zh9VarM59431X == null) {
                this.f20013h = 0;
            } else if (!this.f20011f && zh9VarM59431X.m59415H() == zh9.EnumC18640e.LayingOut) {
                if (!(this.f20013h == Integer.MAX_VALUE)) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                this.f20013h = zh9VarM59431X.m59413F().f19975j;
                zh9VarM59431X.m59413F().f19975j++;
            }
            mo23286n();
        }

        public final void o0(long j, float f, xk7 xk7Var) {
            di9.this.f19967b = zh9.EnumC18640e.LayingOut;
            this.f20004H = j;
            this.f20006M = f;
            this.f20005L = xk7Var;
            this.f20015s = true;
            sgc sgcVarM21298b = ci9.m21298b(di9.this.f19966a);
            if (di9.this.m23273x() || !mo23282a()) {
                mo23283b().m51229r(false);
                di9.this.m23262T(false);
                sgcVarM21298b.getSnapshotObserver().m54365b(di9.this.f19966a, false, new c(xk7Var, di9.this, j, f));
            } else {
                di9.this.m23248F().o1(j, f, xk7Var);
                n0();
            }
            di9.this.f19967b = zh9.EnumC18640e.Idle;
        }

        public final boolean p0(long j) {
            sgc sgcVarM21298b = ci9.m21298b(di9.this.f19966a);
            zh9 zh9VarM59431X = di9.this.f19966a.m59431X();
            boolean z = true;
            di9.this.f19966a.Y0(di9.this.f19966a.m59442t() || (zh9VarM59431X != null && zh9VarM59431X.m59442t()));
            if (!di9.this.f19966a.m59422O() && bu3.m19793e(m44973P(), j)) {
                sgc.m48318q(sgcVarM21298b, di9.this.f19966a, false, 2, null);
                di9.this.f19966a.X0();
                return false;
            }
            mo23283b().m51230s(false);
            mo23288v(d.f20028a);
            this.f20014q = true;
            long jMo39063i = di9.this.m23248F().mo39063i();
            m44977U(j);
            di9.this.m23259Q(j);
            if (ml8.m39310c(di9.this.m23248F().mo39063i(), jMo39063i) && di9.this.m23248F().m44974Q() == m44974Q() && di9.this.m23248F().m44970L() == m44970L()) {
                z = false;
            }
            m44976T(nl8.m40749a(di9.this.m23248F().m44974Q(), di9.this.m23248F().m44970L()));
            return z;
        }

        public final void q0() {
            try {
                this.f20011f = true;
                if (!this.f20015s) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                o0(this.f20004H, this.f20006M, this.f20005L);
            } finally {
                this.f20011f = false;
            }
        }

        public final void r0(boolean z) {
            this.i0 = z;
        }

        @Override // p001o.v90
        public void requestLayout() {
            zh9.S0(di9.this.f19966a, false, 1, null);
        }

        public final void s0(zh9.EnumC18642g enumC18642g) {
            sq8.m48649h(enumC18642g, "<set-?>");
            this.f20016x = enumC18642g;
        }

        @Override // p001o.v90
        /* renamed from: t */
        public xzb mo23287t() {
            return di9.this.f19966a.m59410C();
        }

        public void t0(boolean z) {
            this.f20009Y = z;
        }

        public final void u0(zh9 zh9Var) {
            zh9.EnumC18642g enumC18642g;
            zh9 zh9VarM59431X = zh9Var.m59431X();
            if (zh9VarM59431X == null) {
                this.f20016x = zh9.EnumC18642g.NotUsed;
                return;
            }
            if (!(this.f20016x == zh9.EnumC18642g.NotUsed || zh9Var.m59442t())) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            int i = a.f20018a[zh9VarM59431X.m59415H().ordinal()];
            if (i == 1) {
                enumC18642g = zh9.EnumC18642g.InMeasureBlock;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + zh9VarM59431X.m59415H());
                }
                enumC18642g = zh9.EnumC18642g.InLayoutBlock;
            }
            this.f20016x = enumC18642g;
        }

        @Override // p001o.v90
        /* renamed from: v */
        public void mo23288v(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            fqb fqbVarE0 = di9.this.f19966a.e0();
            int iM27354o = fqbVarE0.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVarE0.m27353n();
                int i = 0;
                do {
                    xk7Var.invoke(((zh9) objArrM27353n[i]).m59413F().m23266q());
                    i++;
                } while (i < iM27354o);
            }
        }

        public final boolean v0() {
            if ((d0() == null && di9.this.m23248F().M0() == null) || !this.f20007Q) {
                return false;
            }
            this.f20007Q = false;
            this.f20008X = di9.this.m23248F().M0();
            return true;
        }

        @Override // p001o.y0b
        /* renamed from: w */
        public q8d mo21322w(long j) {
            zh9.EnumC18642g enumC18642gM59412E = di9.this.f19966a.m59412E();
            zh9.EnumC18642g enumC18642g = zh9.EnumC18642g.NotUsed;
            if (enumC18642gM59412E == enumC18642g) {
                di9.this.f19966a.m59435k();
            }
            di9 di9Var = di9.this;
            if (di9Var.m23251I(di9Var.f19966a)) {
                this.f20014q = true;
                m44977U(j);
                C12942a c12942aM23245C = di9.this.m23245C();
                sq8.m48646e(c12942aM23245C);
                c12942aM23245C.q0(enumC18642g);
                c12942aM23245C.mo21322w(j);
            }
            u0(di9.this.f19966a);
            p0(j);
            return this;
        }
    }

    /* renamed from: o.di9$c */
    public static final class C12944c extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ long f20030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12944c(long j) {
            super(0);
            this.f20030b = j;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68996invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68996invoke() {
            wla wlaVarK0 = di9.this.m23248F().K0();
            sq8.m48646e(wlaVarK0);
            wlaVarK0.mo21322w(this.f20030b);
        }
    }

    /* renamed from: o.di9$d */
    public static final class C12945d extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ long f20032b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12945d(long j) {
            super(0);
            this.f20032b = j;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68997invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68997invoke() {
            di9.this.m23248F().mo21322w(this.f20032b);
        }
    }

    public di9(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "layoutNode");
        this.f19966a = zh9Var;
        this.f19967b = zh9.EnumC18640e.Idle;
        this.f19979n = new C12943b();
    }

    /* renamed from: A */
    public final boolean m23243A() {
        return this.f19972g;
    }

    /* renamed from: B */
    public final boolean m23244B() {
        return this.f19971f;
    }

    /* renamed from: C */
    public final C12942a m23245C() {
        return this.f19980o;
    }

    /* renamed from: D */
    public final C12943b m23246D() {
        return this.f19979n;
    }

    /* renamed from: E */
    public final boolean m23247E() {
        return this.f19968c;
    }

    /* renamed from: F */
    public final xzb m23248F() {
        return this.f19966a.m59428U().m4990n();
    }

    /* renamed from: G */
    public final int m23249G() {
        return this.f19979n.m44974Q();
    }

    /* renamed from: H */
    public final void m23250H() {
        this.f19979n.h0();
        C12942a c12942a = this.f19980o;
        if (c12942a != null) {
            c12942a.g0();
        }
    }

    /* renamed from: I */
    public final boolean m23251I(zh9 zh9Var) {
        if (zh9Var.m59419L() != null) {
            zh9 zh9VarM59431X = zh9Var.m59431X();
            if ((zh9VarM59431X != null ? zh9VarM59431X.m59419L() : null) == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final void m23252J() {
        this.f19979n.r0(true);
        C12942a c12942a = this.f19980o;
        if (c12942a != null) {
            c12942a.p0(true);
        }
    }

    /* renamed from: K */
    public final void m23253K() {
        this.f19969d = true;
        this.f19970e = true;
    }

    /* renamed from: L */
    public final void m23254L() {
        this.f19972g = true;
        this.f19973h = true;
    }

    /* renamed from: M */
    public final void m23255M() {
        this.f19971f = true;
    }

    /* renamed from: N */
    public final void m23256N() {
        this.f19968c = true;
    }

    /* renamed from: O */
    public final void m23257O() {
        zh9.EnumC18640e enumC18640eM59415H = this.f19966a.m59415H();
        if (enumC18640eM59415H == zh9.EnumC18640e.LayingOut || enumC18640eM59415H == zh9.EnumC18640e.LookaheadLayingOut) {
            if (this.f19979n.b0()) {
                m23263U(true);
            } else {
                m23262T(true);
            }
        }
        if (enumC18640eM59415H == zh9.EnumC18640e.LookaheadLayingOut) {
            C12942a c12942a = this.f19980o;
            boolean z = false;
            if (c12942a != null && c12942a.b0()) {
                z = true;
            }
            if (z) {
                m23263U(true);
            } else {
                m23262T(true);
            }
        }
    }

    /* renamed from: P */
    public final void m23258P(long j) {
        this.f19967b = zh9.EnumC18640e.LookaheadMeasuring;
        this.f19971f = false;
        wgc.m54363g(ci9.m21298b(this.f19966a).getSnapshotObserver(), this.f19966a, false, new C12944c(j), 2, null);
        m23254L();
        if (m23251I(this.f19966a)) {
            m23253K();
        } else {
            m23256N();
        }
        this.f19967b = zh9.EnumC18640e.Idle;
    }

    /* renamed from: Q */
    public final void m23259Q(long j) {
        zh9.EnumC18640e enumC18640e = this.f19967b;
        zh9.EnumC18640e enumC18640e2 = zh9.EnumC18640e.Idle;
        if (!(enumC18640e == enumC18640e2)) {
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        zh9.EnumC18640e enumC18640e3 = zh9.EnumC18640e.Measuring;
        this.f19967b = enumC18640e3;
        this.f19968c = false;
        ci9.m21298b(this.f19966a).getSnapshotObserver().m54367f(this.f19966a, false, new C12945d(j));
        if (this.f19967b == enumC18640e3) {
            m23253K();
            this.f19967b = enumC18640e2;
        }
    }

    /* renamed from: R */
    public final void m23260R() {
        u90 u90VarMo23283b;
        this.f19979n.mo23283b().m51227p();
        C12942a c12942a = this.f19980o;
        if (c12942a == null || (u90VarMo23283b = c12942a.mo23283b()) == null) {
            return;
        }
        u90VarMo23283b.m51227p();
    }

    /* renamed from: S */
    public final void m23261S(int i) {
        int i2 = this.f19978m;
        this.f19978m = i;
        if ((i2 == 0) != (i == 0)) {
            zh9 zh9VarM59431X = this.f19966a.m59431X();
            di9 di9VarM59413F = zh9VarM59431X != null ? zh9VarM59431X.m59413F() : null;
            if (di9VarM59413F != null) {
                if (i == 0) {
                    di9VarM59413F.m23261S(di9VarM59413F.f19978m - 1);
                } else {
                    di9VarM59413F.m23261S(di9VarM59413F.f19978m + 1);
                }
            }
        }
    }

    /* renamed from: T */
    public final void m23262T(boolean z) {
        if (this.f19977l != z) {
            this.f19977l = z;
            if (z && !this.f19976k) {
                m23261S(this.f19978m + 1);
            } else {
                if (z || this.f19976k) {
                    return;
                }
                m23261S(this.f19978m - 1);
            }
        }
    }

    /* renamed from: U */
    public final void m23263U(boolean z) {
        if (this.f19976k != z) {
            this.f19976k = z;
            if (z && !this.f19977l) {
                m23261S(this.f19978m + 1);
            } else {
                if (z || this.f19977l) {
                    return;
                }
                m23261S(this.f19978m - 1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m23264V() {
        boolean z;
        zh9 zh9VarM59431X;
        if (this.f19979n.v0() && (zh9VarM59431X = this.f19966a.m59431X()) != null) {
            zh9.U0(zh9VarM59431X, false, false, 3, null);
        }
        C12942a c12942a = this.f19980o;
        if (c12942a != null) {
            z = c12942a.u0();
        }
        if (z) {
            if (m23251I(this.f19966a)) {
                zh9 zh9VarM59431X2 = this.f19966a.m59431X();
                if (zh9VarM59431X2 != null) {
                    zh9.U0(zh9VarM59431X2, false, false, 3, null);
                    return;
                }
                return;
            }
            zh9 zh9VarM59431X3 = this.f19966a.m59431X();
            if (zh9VarM59431X3 != null) {
                zh9.Q0(zh9VarM59431X3, false, false, 3, null);
            }
        }
    }

    /* renamed from: p */
    public final void m23265p() {
        if (this.f19980o == null) {
            this.f19980o = new C12942a();
        }
    }

    /* renamed from: q */
    public final v90 m23266q() {
        return this.f19979n;
    }

    /* renamed from: r */
    public final int m23267r() {
        return this.f19978m;
    }

    /* renamed from: s */
    public final boolean m23268s() {
        return this.f19977l;
    }

    /* renamed from: t */
    public final boolean m23269t() {
        return this.f19976k;
    }

    /* renamed from: u */
    public final int m23270u() {
        return this.f19979n.m44970L();
    }

    /* renamed from: v */
    public final bu3 m23271v() {
        return this.f19979n.a0();
    }

    /* renamed from: w */
    public final bu3 m23272w() {
        C12942a c12942a = this.f19980o;
        if (c12942a != null) {
            return c12942a.a0();
        }
        return null;
    }

    /* renamed from: x */
    public final boolean m23273x() {
        return this.f19969d;
    }

    /* renamed from: y */
    public final zh9.EnumC18640e m23274y() {
        return this.f19967b;
    }

    /* renamed from: z */
    public final v90 m23275z() {
        return this.f19980o;
    }
}
