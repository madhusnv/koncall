package p001o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.cdj;
import p001o.fbj;
import p001o.nra;

/* loaded from: classes6.dex */
public final class pf3 implements cdj {

    /* renamed from: a */
    public final nf3 f39991a;

    /* renamed from: o.pf3$a */
    public static /* synthetic */ class C16100a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39992a;

        static {
            int[] iArr = new int[fbj.EnumC13396b.values().length];
            f39992a = iArr;
            try {
                iArr[fbj.EnumC13396b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39992a[fbj.EnumC13396b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39992a[fbj.EnumC13396b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39992a[fbj.EnumC13396b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39992a[fbj.EnumC13396b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39992a[fbj.EnumC13396b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39992a[fbj.EnumC13396b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39992a[fbj.EnumC13396b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39992a[fbj.EnumC13396b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39992a[fbj.EnumC13396b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39992a[fbj.EnumC13396b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39992a[fbj.EnumC13396b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public pf3(nf3 nf3Var) {
        nf3 nf3Var2 = (nf3) yn8.m58013b(nf3Var, "output");
        this.f39991a = nf3Var2;
        nf3Var2.f36764a = this;
    }

    /* renamed from: P */
    public static pf3 m43560P(nf3 nf3Var) {
        pf3 pf3Var = nf3Var.f36764a;
        return pf3Var != null ? pf3Var : new pf3(nf3Var);
    }

    @Override // p001o.cdj
    /* renamed from: A */
    public void mo20991A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.i0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40466f = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40466f += nf3.m40466f(((Boolean) list.get(i3)).booleanValue());
        }
        this.f39991a.X0(iM40466f);
        while (i2 < list.size()) {
            this.f39991a.j0(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: B */
    public void mo20992B(int i, float f) {
        this.f39991a.w0(i, f);
    }

    @Override // p001o.cdj
    /* renamed from: C */
    public void mo20993C(int i) {
        this.f39991a.V0(i, 4);
    }

    @Override // p001o.cdj
    /* renamed from: D */
    public void mo20994D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.P0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40452O = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40452O += nf3.m40452O(((Integer) list.get(i3)).intValue());
        }
        this.f39991a.X0(iM40452O);
        while (i2 < list.size()) {
            this.f39991a.Q0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: E */
    public void mo20995E(int i, int i2) {
        this.f39991a.q0(i, i2);
    }

    @Override // p001o.cdj
    /* renamed from: F */
    public void mo20996F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.E0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40486z = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40486z += nf3.m40486z(((Long) list.get(i3)).longValue());
        }
        this.f39991a.X0(iM40486z);
        while (i2 < list.size()) {
            this.f39991a.F0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: G */
    public void mo20997G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.o0(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40471k = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40471k += nf3.m40471k(((Double) list.get(i3)).doubleValue());
        }
        this.f39991a.X0(iM40471k);
        while (i2 < list.size()) {
            this.f39991a.p0(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: H */
    public void mo20998H(int i, int i2) {
        this.f39991a.P0(i, i2);
    }

    @Override // p001o.cdj
    /* renamed from: I */
    public void mo20999I(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f39991a.m0(i, (xq1) list.get(i2));
        }
    }

    @Override // p001o.cdj
    /* renamed from: J */
    public void mo21000J(int i, Object obj, n5f n5fVar) {
        this.f39991a.z0(i, (scb) obj, n5fVar);
    }

    @Override // p001o.cdj
    /* renamed from: K */
    public void mo21001K(int i, List list, n5f n5fVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo21002L(i, list.get(i2), n5fVar);
        }
    }

    @Override // p001o.cdj
    /* renamed from: L */
    public void mo21002L(int i, Object obj, n5f n5fVar) {
        this.f39991a.G0(i, (scb) obj, n5fVar);
    }

    @Override // p001o.cdj
    /* renamed from: M */
    public void mo21003M(int i, xq1 xq1Var) {
        this.f39991a.m0(i, xq1Var);
    }

    @Override // p001o.cdj
    /* renamed from: N */
    public void mo21004N(int i, List list, n5f n5fVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo21000J(i, list.get(i2), n5fVar);
        }
    }

    @Override // p001o.cdj
    /* renamed from: O */
    public void mo21005O(int i, nra.C15645a c15645a, Map map) {
        if (this.f39991a.c0()) {
            m43564T(i, c15645a, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f39991a.V0(i, 2);
            this.f39991a.X0(nra.m41004b(c15645a, entry.getKey(), entry.getValue()));
            nra.m41006e(this.f39991a, c15645a, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: Q */
    public final void m43561Q(int i, boolean z, Object obj, nra.C15645a c15645a) {
        this.f39991a.V0(i, 2);
        this.f39991a.X0(nra.m41004b(c15645a, Boolean.valueOf(z), obj));
        nra.m41006e(this.f39991a, c15645a, Boolean.valueOf(z), obj);
    }

    /* renamed from: R */
    public final void m43562R(int i, nra.C15645a c15645a, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            Object obj = map.get(Integer.valueOf(i4));
            this.f39991a.V0(i, 2);
            this.f39991a.X0(nra.m41004b(c15645a, Integer.valueOf(i4), obj));
            nra.m41006e(this.f39991a, c15645a, Integer.valueOf(i4), obj);
        }
    }

    /* renamed from: S */
    public final void m43563S(int i, nra.C15645a c15645a, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            Object obj = map.get(Long.valueOf(j));
            this.f39991a.V0(i, 2);
            this.f39991a.X0(nra.m41004b(c15645a, Long.valueOf(j), obj));
            nra.m41006e(this.f39991a, c15645a, Long.valueOf(j), obj);
        }
    }

    /* renamed from: T */
    public final void m43564T(int i, nra.C15645a c15645a, Map map) {
        switch (C16100a.f39992a[c15645a.f37205a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m43561Q(i, false, obj, c15645a);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m43561Q(i, true, obj2, c15645a);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m43562R(i, c15645a, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m43563S(i, c15645a, map);
                return;
            case 12:
                m43565U(i, c15645a, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + c15645a.f37205a);
        }
    }

    /* renamed from: U */
    public final void m43565U(int i, nra.C15645a c15645a, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = (String) it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            Object obj = map.get(str);
            this.f39991a.V0(i, 2);
            this.f39991a.X0(nra.m41004b(c15645a, str, obj));
            nra.m41006e(this.f39991a, c15645a, str, obj);
        }
    }

    /* renamed from: V */
    public final void m43566V(int i, Object obj) {
        if (obj instanceof String) {
            this.f39991a.T0(i, (String) obj);
        } else {
            this.f39991a.m0(i, (xq1) obj);
        }
    }

    @Override // p001o.cdj
    /* renamed from: a */
    public void mo21006a(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.w0(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40479s = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40479s += nf3.m40479s(((Float) list.get(i3)).floatValue());
        }
        this.f39991a.X0(iM40479s);
        while (i2 < list.size()) {
            this.f39991a.x0(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: b */
    public final void mo21007b(int i, Object obj) {
        if (obj instanceof xq1) {
            this.f39991a.J0(i, (xq1) obj);
        } else {
            this.f39991a.I0(i, (scb) obj);
        }
    }

    @Override // p001o.cdj
    /* renamed from: c */
    public void mo21008c(int i, int i2) {
        this.f39991a.s0(i, i2);
    }

    @Override // p001o.cdj
    /* renamed from: d */
    public void mo21009d(int i, List list) {
        int i2 = 0;
        if (!(list instanceof yi9)) {
            while (i2 < list.size()) {
                this.f39991a.T0(i, (String) list.get(i2));
                i2++;
            }
        } else {
            yi9 yi9Var = (yi9) list;
            while (i2 < list.size()) {
                m43566V(i, yi9Var.mo46223u(i2));
                i2++;
            }
        }
    }

    @Override // p001o.cdj
    /* renamed from: e */
    public void mo21010e(int i, String str) {
        this.f39991a.T0(i, str);
    }

    @Override // p001o.cdj
    /* renamed from: f */
    public void mo21011f(int i, long j) {
        this.f39991a.Y0(i, j);
    }

    @Override // p001o.cdj
    /* renamed from: g */
    public void mo21012g(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.C0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40484x = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40484x += nf3.m40484x(((Integer) list.get(i3)).intValue());
        }
        this.f39991a.X0(iM40484x);
        while (i2 < list.size()) {
            this.f39991a.D0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: h */
    public void mo21013h(int i, int i2) {
        this.f39991a.C0(i, i2);
    }

    @Override // p001o.cdj
    /* renamed from: i */
    public void mo21014i(int i, long j) {
        this.f39991a.N0(i, j);
    }

    @Override // p001o.cdj
    /* renamed from: j */
    public void mo21015j(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.s0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40475o = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40475o += nf3.m40475o(((Integer) list.get(i3)).intValue());
        }
        this.f39991a.X0(iM40475o);
        while (i2 < list.size()) {
            this.f39991a.t0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: k */
    public void mo21016k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.W0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40459V = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40459V += nf3.m40459V(((Integer) list.get(i3)).intValue());
        }
        this.f39991a.X0(iM40459V);
        while (i2 < list.size()) {
            this.f39991a.X0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: l */
    public void mo21017l(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.R0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40454Q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40454Q += nf3.m40454Q(((Long) list.get(i3)).longValue());
        }
        this.f39991a.X0(iM40454Q);
        while (i2 < list.size()) {
            this.f39991a.S0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: m */
    public void mo21018m(int i, long j) {
        this.f39991a.R0(i, j);
    }

    @Override // p001o.cdj
    /* renamed from: n */
    public void mo21019n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.q0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40473m = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40473m += nf3.m40473m(((Integer) list.get(i3)).intValue());
        }
        this.f39991a.X0(iM40473m);
        while (i2 < list.size()) {
            this.f39991a.r0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: o */
    public void mo21020o(int i, int i2) {
        this.f39991a.W0(i, i2);
    }

    @Override // p001o.cdj
    /* renamed from: p */
    public void mo21021p(int i, double d) {
        this.f39991a.o0(i, d);
    }

    @Override // p001o.cdj
    /* renamed from: q */
    public void mo21022q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.N0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40450M = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40450M += nf3.m40450M(((Long) list.get(i3)).longValue());
        }
        this.f39991a.X0(iM40450M);
        while (i2 < list.size()) {
            this.f39991a.O0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: r */
    public void mo21023r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.Y0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40461X = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40461X += nf3.m40461X(((Long) list.get(i3)).longValue());
        }
        this.f39991a.X0(iM40461X);
        while (i2 < list.size()) {
            this.f39991a.Z0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: s */
    public void mo21024s(int i, long j) {
        this.f39991a.u0(i, j);
    }

    @Override // p001o.cdj
    /* renamed from: t */
    public cdj.EnumC12647a mo21025t() {
        return cdj.EnumC12647a.ASCENDING;
    }

    @Override // p001o.cdj
    /* renamed from: u */
    public void mo21026u(int i, long j) {
        this.f39991a.E0(i, j);
    }

    @Override // p001o.cdj
    /* renamed from: v */
    public void mo21027v(int i, boolean z) {
        this.f39991a.i0(i, z);
    }

    @Override // p001o.cdj
    /* renamed from: w */
    public void mo21028w(int i, int i2) {
        this.f39991a.L0(i, i2);
    }

    @Override // p001o.cdj
    /* renamed from: x */
    public void mo21029x(int i) {
        this.f39991a.V0(i, 3);
    }

    @Override // p001o.cdj
    /* renamed from: y */
    public void mo21030y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.u0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40477q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40477q += nf3.m40477q(((Long) list.get(i3)).longValue());
        }
        this.f39991a.X0(iM40477q);
        while (i2 < list.size()) {
            this.f39991a.v0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p001o.cdj
    /* renamed from: z */
    public void mo21031z(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f39991a.L0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f39991a.V0(i, 2);
        int iM40448K = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM40448K += nf3.m40448K(((Integer) list.get(i3)).intValue());
        }
        this.f39991a.X0(iM40448K);
        while (i2 < list.size()) {
            this.f39991a.M0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
