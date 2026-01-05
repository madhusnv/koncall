package p001o;

import java.util.List;
import java.util.Map;
import p001o.bdj;
import p001o.ebj;
import p001o.mra;

/* loaded from: classes4.dex */
public final class of3 implements bdj {

    /* renamed from: a */
    public final mf3 f38271a;

    /* renamed from: o.of3$a */
    public static /* synthetic */ class C15790a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38272a;

        static {
            int[] iArr = new int[ebj.EnumC13155b.values().length];
            f38272a = iArr;
            try {
                iArr[ebj.EnumC13155b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38272a[ebj.EnumC13155b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38272a[ebj.EnumC13155b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38272a[ebj.EnumC13155b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38272a[ebj.EnumC13155b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38272a[ebj.EnumC13155b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38272a[ebj.EnumC13155b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38272a[ebj.EnumC13155b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38272a[ebj.EnumC13155b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38272a[ebj.EnumC13155b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38272a[ebj.EnumC13155b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38272a[ebj.EnumC13155b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public of3(mf3 mf3Var) {
        mf3 mf3Var2 = (mf3) xn8.m56500b(mf3Var, "output");
        this.f38271a = mf3Var2;
        mf3Var2.f35332a = this;
    }

    /* renamed from: P */
    public static of3 m42166P(mf3 mf3Var) {
        of3 of3Var = mf3Var.f35332a;
        return of3Var != null ? of3Var : new of3(mf3Var);
    }

    @Override // p001o.bdj
    /* renamed from: A */
    public void mo18686A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.mo38917Y(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38891e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38891e += mf3.m38891e(((Boolean) list.get(i3)).booleanValue());
        }
        this.f38271a.F0(iM38891e);
        while (i2 < list.size()) {
            this.f38271a.m38918Z(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: B */
    public void mo18687B(int i, float f) {
        this.f38271a.j0(i, f);
    }

    @Override // p001o.bdj
    /* renamed from: C */
    public void mo18688C(int i) {
        this.f38271a.D0(i, 4);
    }

    @Override // p001o.bdj
    /* renamed from: D */
    public void mo18689D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.y0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38875G = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38875G += mf3.m38875G(((Integer) list.get(i3)).intValue());
        }
        this.f38271a.F0(iM38875G);
        while (i2 < list.size()) {
            this.f38271a.z0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: E */
    public void mo18690E(int i, int i2) {
        this.f38271a.d0(i, i2);
    }

    @Override // p001o.bdj
    /* renamed from: F */
    public void mo18691F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.p0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38909w = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38909w += mf3.m38909w(((Long) list.get(i3)).longValue());
        }
        this.f38271a.F0(iM38909w);
        while (i2 < list.size()) {
            this.f38271a.q0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: G */
    public void mo18692G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.b0(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38895i = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38895i += mf3.m38895i(((Double) list.get(i3)).doubleValue());
        }
        this.f38271a.F0(iM38895i);
        while (i2 < list.size()) {
            this.f38271a.c0(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: H */
    public void mo18693H(int i, int i2) {
        this.f38271a.y0(i, i2);
    }

    @Override // p001o.bdj
    /* renamed from: I */
    public void mo18694I(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f38271a.a0(i, (yq1) list.get(i2));
        }
    }

    @Override // p001o.bdj
    /* renamed from: J */
    public void mo18695J(int i, yq1 yq1Var) {
        this.f38271a.a0(i, yq1Var);
    }

    @Override // p001o.bdj
    /* renamed from: K */
    public void mo18696K(int i, Object obj, o5f o5fVar) {
        this.f38271a.r0(i, (rcb) obj, o5fVar);
    }

    @Override // p001o.bdj
    /* renamed from: L */
    public void mo18697L(int i, List list, o5f o5fVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo18698M(i, list.get(i2), o5fVar);
        }
    }

    @Override // p001o.bdj
    /* renamed from: M */
    public void mo18698M(int i, Object obj, o5f o5fVar) {
        this.f38271a.l0(i, (rcb) obj, o5fVar);
    }

    @Override // p001o.bdj
    /* renamed from: N */
    public void mo18699N(int i, List list, o5f o5fVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo18696K(i, list.get(i2), o5fVar);
        }
    }

    @Override // p001o.bdj
    /* renamed from: O */
    public void mo18700O(int i, mra.C15407a c15407a, Map map) {
        if (this.f38271a.m38914T()) {
            m42167Q(i, c15407a, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f38271a.D0(i, 2);
            this.f38271a.F0(mra.m39524a(c15407a, entry.getKey(), entry.getValue()));
            mra.m39525b(this.f38271a, c15407a, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: Q */
    public final void m42167Q(int i, mra.C15407a c15407a, Map map) {
        int[] iArr = C15790a.f38272a;
        throw null;
    }

    /* renamed from: R */
    public final void m42168R(int i, Object obj) {
        if (obj instanceof String) {
            this.f38271a.C0(i, (String) obj);
        } else {
            this.f38271a.a0(i, (yq1) obj);
        }
    }

    @Override // p001o.bdj
    /* renamed from: a */
    public void mo18701a(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.j0(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38903q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38903q += mf3.m38903q(((Float) list.get(i3)).floatValue());
        }
        this.f38271a.F0(iM38903q);
        while (i2 < list.size()) {
            this.f38271a.k0(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: b */
    public final void mo18702b(int i, Object obj) {
        if (obj instanceof yq1) {
            this.f38271a.t0(i, (yq1) obj);
        } else {
            this.f38271a.s0(i, (rcb) obj);
        }
    }

    @Override // p001o.bdj
    /* renamed from: c */
    public void mo18703c(int i, int i2) {
        this.f38271a.f0(i, i2);
    }

    @Override // p001o.bdj
    /* renamed from: d */
    public void mo18704d(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zi9)) {
            while (i2 < list.size()) {
                this.f38271a.C0(i, (String) list.get(i2));
                i2++;
            }
        } else {
            zi9 zi9Var = (zi9) list;
            while (i2 < list.size()) {
                m42168R(i, zi9Var.mo47846u(i2));
                i2++;
            }
        }
    }

    @Override // p001o.bdj
    /* renamed from: e */
    public void mo18705e(int i, String str) {
        this.f38271a.C0(i, str);
    }

    @Override // p001o.bdj
    /* renamed from: f */
    public void mo18706f(int i, long j) {
        this.f38271a.G0(i, j);
    }

    @Override // p001o.bdj
    /* renamed from: g */
    public void mo18707g(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.n0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38907u = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38907u += mf3.m38907u(((Integer) list.get(i3)).intValue());
        }
        this.f38271a.F0(iM38907u);
        while (i2 < list.size()) {
            this.f38271a.o0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: h */
    public void mo18708h(int i, int i2) {
        this.f38271a.n0(i, i2);
    }

    @Override // p001o.bdj
    /* renamed from: i */
    public void mo18709i(int i, long j) {
        this.f38271a.w0(i, j);
    }

    @Override // p001o.bdj
    /* renamed from: j */
    public void mo18710j(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.f0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38899m = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38899m += mf3.m38899m(((Integer) list.get(i3)).intValue());
        }
        this.f38271a.F0(iM38899m);
        while (i2 < list.size()) {
            this.f38271a.g0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: k */
    public void mo18711k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.E0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38882N = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38882N += mf3.m38882N(((Integer) list.get(i3)).intValue());
        }
        this.f38271a.F0(iM38882N);
        while (i2 < list.size()) {
            this.f38271a.F0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: l */
    public void mo18712l(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.A0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38877I = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38877I += mf3.m38877I(((Long) list.get(i3)).longValue());
        }
        this.f38271a.F0(iM38877I);
        while (i2 < list.size()) {
            this.f38271a.B0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: m */
    public void mo18713m(int i, long j) {
        this.f38271a.A0(i, j);
    }

    @Override // p001o.bdj
    /* renamed from: n */
    public void mo18714n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.d0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38897k = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38897k += mf3.m38897k(((Integer) list.get(i3)).intValue());
        }
        this.f38271a.F0(iM38897k);
        while (i2 < list.size()) {
            this.f38271a.e0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: o */
    public void mo18715o(int i, int i2) {
        this.f38271a.E0(i, i2);
    }

    @Override // p001o.bdj
    /* renamed from: p */
    public void mo18716p(int i, double d) {
        this.f38271a.b0(i, d);
    }

    @Override // p001o.bdj
    /* renamed from: q */
    public void mo18717q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.w0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38873E = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38873E += mf3.m38873E(((Long) list.get(i3)).longValue());
        }
        this.f38271a.F0(iM38873E);
        while (i2 < list.size()) {
            this.f38271a.x0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: r */
    public void mo18718r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.G0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38884P = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38884P += mf3.m38884P(((Long) list.get(i3)).longValue());
        }
        this.f38271a.F0(iM38884P);
        while (i2 < list.size()) {
            this.f38271a.H0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: s */
    public void mo18719s(int i, long j) {
        this.f38271a.h0(i, j);
    }

    @Override // p001o.bdj
    /* renamed from: t */
    public bdj.EnumC12361a mo18720t() {
        return bdj.EnumC12361a.ASCENDING;
    }

    @Override // p001o.bdj
    /* renamed from: u */
    public void mo18721u(int i, long j) {
        this.f38271a.p0(i, j);
    }

    @Override // p001o.bdj
    /* renamed from: v */
    public void mo18722v(int i, boolean z) {
        this.f38271a.mo38917Y(i, z);
    }

    @Override // p001o.bdj
    /* renamed from: w */
    public void mo18723w(int i, int i2) {
        this.f38271a.u0(i, i2);
    }

    @Override // p001o.bdj
    /* renamed from: x */
    public void mo18724x(int i) {
        this.f38271a.D0(i, 3);
    }

    @Override // p001o.bdj
    /* renamed from: y */
    public void mo18725y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.h0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38901o = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38901o += mf3.m38901o(((Long) list.get(i3)).longValue());
        }
        this.f38271a.F0(iM38901o);
        while (i2 < list.size()) {
            this.f38271a.i0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.bdj
    /* renamed from: z */
    public void mo18726z(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f38271a.u0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f38271a.D0(i, 2);
        int iM38871C = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM38871C += mf3.m38871C(((Integer) list.get(i3)).intValue());
        }
        this.f38271a.F0(iM38871C);
        while (i2 < list.size()) {
            this.f38271a.v0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
