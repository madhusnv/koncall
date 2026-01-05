package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import p001o.fz5;
import p001o.mz5;
import p001o.nz5;
import p001o.s0f;
import p001o.uth;

/* loaded from: classes2.dex */
public class s0f implements uth {

    /* renamed from: A */
    public C2181a f44385A;

    /* renamed from: B */
    public C2181a f44386B;

    /* renamed from: C */
    public long f44387C;

    /* renamed from: E */
    public boolean f44389E;

    /* renamed from: F */
    public long f44390F;

    /* renamed from: G */
    public boolean f44391G;

    /* renamed from: a */
    public final q0f f44392a;

    /* renamed from: d */
    public final nz5 f44395d;

    /* renamed from: e */
    public final mz5.C15451a f44396e;

    /* renamed from: f */
    public InterfaceC16711d f44397f;

    /* renamed from: g */
    public C2181a f44398g;

    /* renamed from: h */
    public fz5 f44399h;

    /* renamed from: p */
    public int f44407p;

    /* renamed from: q */
    public int f44408q;

    /* renamed from: r */
    public int f44409r;

    /* renamed from: s */
    public int f44410s;

    /* renamed from: w */
    public boolean f44414w;

    /* renamed from: z */
    public boolean f44417z;

    /* renamed from: b */
    public final C16709b f44393b = new C16709b();

    /* renamed from: i */
    public int f44400i = 1000;

    /* renamed from: j */
    public long[] f44401j = new long[1000];

    /* renamed from: k */
    public long[] f44402k = new long[1000];

    /* renamed from: n */
    public long[] f44405n = new long[1000];

    /* renamed from: m */
    public int[] f44404m = new int[1000];

    /* renamed from: l */
    public int[] f44403l = new int[1000];

    /* renamed from: o */
    public uth.C17452a[] f44406o = new uth.C17452a[1000];

    /* renamed from: c */
    public final a0g f44394c = new a0g(new fu3() { // from class: o.r0f
        @Override // p001o.fu3
        public final void accept(Object obj) {
            s0f.m47393M((s0f.C16710c) obj);
        }
    });

    /* renamed from: t */
    public long f44411t = Long.MIN_VALUE;

    /* renamed from: u */
    public long f44412u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f44413v = Long.MIN_VALUE;

    /* renamed from: y */
    public boolean f44416y = true;

    /* renamed from: x */
    public boolean f44415x = true;

    /* renamed from: D */
    public boolean f44388D = true;

    /* renamed from: o.s0f$b */
    public static final class C16709b {

        /* renamed from: a */
        public int f44418a;

        /* renamed from: b */
        public long f44419b;

        /* renamed from: c */
        public uth.C17452a f44420c;
    }

    /* renamed from: o.s0f$c */
    public static final class C16710c {

        /* renamed from: a */
        public final C2181a f44421a;

        /* renamed from: b */
        public final nz5.InterfaceC15682b f44422b;

        public C16710c(C2181a c2181a, nz5.InterfaceC15682b interfaceC15682b) {
            this.f44421a = c2181a;
            this.f44422b = interfaceC15682b;
        }
    }

    /* renamed from: o.s0f$d */
    public interface InterfaceC16711d {
        /* renamed from: a */
        void mo32486a(C2181a c2181a);
    }

    public s0f(ob0 ob0Var, nz5 nz5Var, mz5.C15451a c15451a) {
        this.f44395d = nz5Var;
        this.f44396e = c15451a;
        this.f44392a = new q0f(ob0Var);
    }

    /* renamed from: M */
    public static /* synthetic */ void m47393M(C16710c c16710c) {
        c16710c.f44422b.release();
    }

    /* renamed from: k */
    public static s0f m47395k(ob0 ob0Var, nz5 nz5Var, mz5.C15451a c15451a) {
        return new s0f(ob0Var, (nz5) op0.m42515e(nz5Var), (mz5.C15451a) op0.m42515e(c15451a));
    }

    /* renamed from: l */
    public static s0f m47396l(ob0 ob0Var) {
        return new s0f(ob0Var, null, null);
    }

    /* renamed from: A */
    public final synchronized long m47397A() {
        return this.f44413v;
    }

    /* renamed from: B */
    public final synchronized long m47398B() {
        return Math.max(this.f44412u, m47399C(this.f44410s));
    }

    /* renamed from: C */
    public final long m47399C(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM47401E = m47401E(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f44405n[iM47401E]);
            if ((this.f44404m[iM47401E] & 1) != 0) {
                break;
            }
            iM47401E--;
            if (iM47401E == -1) {
                iM47401E = this.f44400i - 1;
            }
        }
        return jMax;
    }

    /* renamed from: D */
    public final int m47400D() {
        return this.f44408q + this.f44410s;
    }

    /* renamed from: E */
    public final int m47401E(int i) {
        int i2 = this.f44409r + i;
        int i3 = this.f44400i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: F */
    public final synchronized int m47402F(long j, boolean z) {
        int iM47401E = m47401E(this.f44410s);
        if (m47405I() && j >= this.f44405n[iM47401E]) {
            if (j > this.f44413v && z) {
                return this.f44407p - this.f44410s;
            }
            int iM47435w = m47435w(iM47401E, this.f44407p - this.f44410s, j, true);
            if (iM47435w == -1) {
                return 0;
            }
            return iM47435w;
        }
        return 0;
    }

    /* renamed from: G */
    public final synchronized C2181a m47403G() {
        return this.f44416y ? null : this.f44386B;
    }

    /* renamed from: H */
    public final int m47404H() {
        return this.f44408q + this.f44407p;
    }

    /* renamed from: I */
    public final boolean m47405I() {
        return this.f44410s != this.f44407p;
    }

    /* renamed from: J */
    public final void m47406J() {
        this.f44417z = true;
    }

    /* renamed from: K */
    public final synchronized boolean m47407K() {
        return this.f44414w;
    }

    /* renamed from: L */
    public synchronized boolean m47408L(boolean z) {
        C2181a c2181a;
        boolean z2 = true;
        if (m47405I()) {
            if (((C16710c) this.f44394c.m16318e(m47400D())).f44421a != this.f44398g) {
                return true;
            }
            return m47409N(m47401E(this.f44410s));
        }
        if (!z && !this.f44414w && ((c2181a = this.f44386B) == null || c2181a == this.f44398g)) {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: N */
    public final boolean m47409N(int i) {
        fz5 fz5Var = this.f44399h;
        return fz5Var == null || fz5Var.getState() == 4 || ((this.f44404m[i] & 1073741824) == 0 && this.f44399h.mo27776b());
    }

    /* renamed from: O */
    public void m47410O() throws fz5.C13592a {
        fz5 fz5Var = this.f44399h;
        if (fz5Var != null && fz5Var.getState() == 1) {
            throw ((fz5.C13592a) op0.m42515e(this.f44399h.mo27777c()));
        }
    }

    /* renamed from: P */
    public final void m47411P(C2181a c2181a, if7 if7Var) {
        C2181a c2181a2 = this.f44398g;
        boolean z = c2181a2 == null;
        DrmInitData drmInitData = c2181a2 == null ? null : c2181a2.f7947r;
        this.f44398g = c2181a;
        DrmInitData drmInitData2 = c2181a.f7947r;
        nz5 nz5Var = this.f44395d;
        if7Var.f28594b = nz5Var != null ? c2181a.m6708b(nz5Var.mo41293d(c2181a)) : c2181a;
        if7Var.f28593a = this.f44399h;
        if (this.f44395d == null) {
            return;
        }
        if (z || !sqi.m48724c(drmInitData, drmInitData2)) {
            fz5 fz5Var = this.f44399h;
            fz5 fz5VarMo41290a = this.f44395d.mo41290a(this.f44396e, c2181a);
            this.f44399h = fz5VarMo41290a;
            if7Var.f28593a = fz5VarMo41290a;
            if (fz5Var != null) {
                fz5Var.mo27781h(this.f44396e);
            }
        }
    }

    /* renamed from: Q */
    public final synchronized int m47412Q(if7 if7Var, a85 a85Var, boolean z, boolean z2, C16709b c16709b) {
        a85Var.f14283e = false;
        if (!m47405I()) {
            if (!z2 && !this.f44414w) {
                C2181a c2181a = this.f44386B;
                if (c2181a == null || (!z && c2181a == this.f44398g)) {
                    return -3;
                }
                m47411P((C2181a) op0.m42515e(c2181a), if7Var);
                return -5;
            }
            a85Var.m50154t(4);
            a85Var.f14284f = Long.MIN_VALUE;
            return -4;
        }
        C2181a c2181a2 = ((C16710c) this.f44394c.m16318e(m47400D())).f44421a;
        if (!z && c2181a2 == this.f44398g) {
            int iM47401E = m47401E(this.f44410s);
            if (!m47409N(iM47401E)) {
                a85Var.f14283e = true;
                return -3;
            }
            a85Var.m50154t(this.f44404m[iM47401E]);
            if (this.f44410s == this.f44407p - 1 && (z2 || this.f44414w)) {
                a85Var.m50147g(536870912);
            }
            a85Var.f14284f = this.f44405n[iM47401E];
            c16709b.f44418a = this.f44403l[iM47401E];
            c16709b.f44419b = this.f44402k[iM47401E];
            c16709b.f44420c = this.f44406o[iM47401E];
            return -4;
        }
        m47411P(c2181a2, if7Var);
        return -5;
    }

    /* renamed from: R */
    public void m47413R() {
        m47430r();
        m47416U();
    }

    /* renamed from: S */
    public int m47414S(if7 if7Var, a85 a85Var, int i, boolean z) {
        int iM47412Q = m47412Q(if7Var, a85Var, (i & 2) != 0, z, this.f44393b);
        if (iM47412Q == -4 && !a85Var.m50150n()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.f44392a.m44616f(a85Var, this.f44393b);
                } else {
                    this.f44392a.m44619m(a85Var, this.f44393b);
                }
            }
            if (!z2) {
                this.f44410s++;
            }
        }
        return iM47412Q;
    }

    /* renamed from: T */
    public void m47415T() {
        m47418W(true);
        m47416U();
    }

    /* renamed from: U */
    public final void m47416U() {
        fz5 fz5Var = this.f44399h;
        if (fz5Var != null) {
            fz5Var.mo27781h(this.f44396e);
            this.f44399h = null;
            this.f44398g = null;
        }
    }

    /* renamed from: V */
    public final void m47417V() {
        m47418W(false);
    }

    /* renamed from: W */
    public void m47418W(boolean z) {
        this.f44392a.m44620n();
        this.f44407p = 0;
        this.f44408q = 0;
        this.f44409r = 0;
        this.f44410s = 0;
        this.f44415x = true;
        this.f44411t = Long.MIN_VALUE;
        this.f44412u = Long.MIN_VALUE;
        this.f44413v = Long.MIN_VALUE;
        this.f44414w = false;
        this.f44394c.m16315b();
        if (z) {
            this.f44385A = null;
            this.f44386B = null;
            this.f44416y = true;
            this.f44388D = true;
        }
    }

    /* renamed from: X */
    public final synchronized void m47419X() {
        this.f44410s = 0;
        this.f44392a.m44621o();
    }

    /* renamed from: Y */
    public final synchronized boolean m47420Y(int i) {
        m47419X();
        int i2 = this.f44408q;
        if (i >= i2 && i <= this.f44407p + i2) {
            this.f44411t = Long.MIN_VALUE;
            this.f44410s = i - i2;
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final synchronized boolean m47421Z(long j, boolean z) {
        m47419X();
        int iM47401E = m47401E(this.f44410s);
        if (m47405I() && j >= this.f44405n[iM47401E] && (j <= this.f44413v || z)) {
            int iM47434v = this.f44388D ? m47434v(iM47401E, this.f44407p - this.f44410s, j, z) : m47435w(iM47401E, this.f44407p - this.f44410s, j, true);
            if (iM47434v == -1) {
                return false;
            }
            this.f44411t = j;
            this.f44410s += iM47434v;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // p001o.uth
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo7071a(long j, int i, int i2, int i3, uth.C17452a c17452a) {
        int i4;
        if (this.f44417z) {
            mo7072b((C2181a) op0.m42519i(this.f44385A));
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.f44415x) {
            if (!z) {
                return;
            } else {
                this.f44415x = false;
            }
        }
        long j2 = this.f44390F + j;
        if (!this.f44388D) {
            i4 = i;
        } else {
            if (j2 < this.f44411t) {
                return;
            }
            if (i5 == 0) {
                if (!this.f44389E) {
                    ria.m46824h("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f44386B);
                    this.f44389E = true;
                }
                i4 = i | 1;
            }
        }
        if (this.f44391G) {
            if (!z || !m47422h(j2)) {
                return;
            } else {
                this.f44391G = false;
            }
        }
        m47423i(j2, i4, (this.f44392a.m44615e() - i2) - i3, i2, c17452a);
    }

    public final void a0(long j) {
        if (this.f44390F != j) {
            this.f44390F = j;
            m47406J();
        }
    }

    @Override // p001o.uth
    /* renamed from: b */
    public final void mo7072b(C2181a c2181a) {
        C2181a c2181aM47436x = m47436x(c2181a);
        this.f44417z = false;
        this.f44385A = c2181a;
        boolean zC0 = c0(c2181aM47436x);
        InterfaceC16711d interfaceC16711d = this.f44397f;
        if (interfaceC16711d == null || !zC0) {
            return;
        }
        interfaceC16711d.mo32486a(c2181aM47436x);
    }

    public final void b0(long j) {
        this.f44411t = j;
    }

    public final synchronized boolean c0(C2181a c2181a) {
        this.f44416y = false;
        if (sqi.m48724c(c2181a, this.f44386B)) {
            return false;
        }
        if (this.f44394c.m16320g() || !((C16710c) this.f44394c.m16319f()).f44421a.equals(c2181a)) {
            this.f44386B = c2181a;
        } else {
            this.f44386B = ((C16710c) this.f44394c.m16319f()).f44421a;
        }
        boolean z = this.f44388D;
        C2181a c2181a2 = this.f44386B;
        this.f44388D = z & xeb.m56173a(c2181a2.f7943n, c2181a2.f7939j);
        this.f44389E = false;
        return true;
    }

    @Override // p001o.uth
    /* renamed from: d */
    public final int mo7073d(pu4 pu4Var, int i, boolean z, int i2) {
        return this.f44392a.m44622p(pu4Var, i, z);
    }

    public final void d0(InterfaceC16711d interfaceC16711d) {
        this.f44397f = interfaceC16711d;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                z = this.f44410s + i <= this.f44407p;
            } catch (Throwable th) {
                throw th;
            }
        }
        op0.m42511a(z);
        this.f44410s += i;
    }

    @Override // p001o.uth
    /* renamed from: f */
    public final void mo7074f(zwc zwcVar, int i, int i2) {
        this.f44392a.m44623q(zwcVar, i);
    }

    /* renamed from: h */
    public final synchronized boolean m47422h(long j) {
        if (this.f44407p == 0) {
            return j > this.f44412u;
        }
        if (m47398B() >= j) {
            return false;
        }
        m47432t(this.f44408q + m47424j(j));
        return true;
    }

    /* renamed from: i */
    public final synchronized void m47423i(long j, int i, long j2, int i2, uth.C17452a c17452a) {
        int i3 = this.f44407p;
        if (i3 > 0) {
            int iM47401E = m47401E(i3 - 1);
            op0.m42511a(this.f44402k[iM47401E] + ((long) this.f44403l[iM47401E]) <= j2);
        }
        this.f44414w = (536870912 & i) != 0;
        this.f44413v = Math.max(this.f44413v, j);
        int iM47401E2 = m47401E(this.f44407p);
        this.f44405n[iM47401E2] = j;
        this.f44402k[iM47401E2] = j2;
        this.f44403l[iM47401E2] = i2;
        this.f44404m[iM47401E2] = i;
        this.f44406o[iM47401E2] = c17452a;
        this.f44401j[iM47401E2] = this.f44387C;
        if (this.f44394c.m16320g() || !((C16710c) this.f44394c.m16319f()).f44421a.equals(this.f44386B)) {
            C2181a c2181a = (C2181a) op0.m42515e(this.f44386B);
            nz5 nz5Var = this.f44395d;
            this.f44394c.m16314a(m47404H(), new C16710c(c2181a, nz5Var != null ? nz5Var.mo41291b(this.f44396e, c2181a) : nz5.InterfaceC15682b.f37468a));
        }
        int i4 = this.f44407p + 1;
        this.f44407p = i4;
        int i5 = this.f44400i;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            uth.C17452a[] c17452aArr = new uth.C17452a[i6];
            int i7 = this.f44409r;
            int i8 = i5 - i7;
            System.arraycopy(this.f44402k, i7, jArr2, 0, i8);
            System.arraycopy(this.f44405n, this.f44409r, jArr3, 0, i8);
            System.arraycopy(this.f44404m, this.f44409r, iArr, 0, i8);
            System.arraycopy(this.f44403l, this.f44409r, iArr2, 0, i8);
            System.arraycopy(this.f44406o, this.f44409r, c17452aArr, 0, i8);
            System.arraycopy(this.f44401j, this.f44409r, jArr, 0, i8);
            int i9 = this.f44409r;
            System.arraycopy(this.f44402k, 0, jArr2, i8, i9);
            System.arraycopy(this.f44405n, 0, jArr3, i8, i9);
            System.arraycopy(this.f44404m, 0, iArr, i8, i9);
            System.arraycopy(this.f44403l, 0, iArr2, i8, i9);
            System.arraycopy(this.f44406o, 0, c17452aArr, i8, i9);
            System.arraycopy(this.f44401j, 0, jArr, i8, i9);
            this.f44402k = jArr2;
            this.f44405n = jArr3;
            this.f44404m = iArr;
            this.f44403l = iArr2;
            this.f44406o = c17452aArr;
            this.f44401j = jArr;
            this.f44409r = 0;
            this.f44400i = i6;
        }
    }

    /* renamed from: j */
    public final int m47424j(long j) {
        int i = this.f44407p;
        int iM47401E = m47401E(i - 1);
        while (i > this.f44410s && this.f44405n[iM47401E] >= j) {
            i--;
            iM47401E--;
            if (iM47401E == -1) {
                iM47401E = this.f44400i - 1;
            }
        }
        return i;
    }

    /* renamed from: m */
    public final synchronized long m47425m(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.f44407p;
        if (i2 != 0) {
            long[] jArr = this.f44405n;
            int i3 = this.f44409r;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.f44410s) != i2) {
                    i2 = i + 1;
                }
                int iM47435w = m47435w(i3, i2, j, z);
                if (iM47435w == -1) {
                    return -1L;
                }
                return m47428p(iM47435w);
            }
        }
        return -1L;
    }

    /* renamed from: n */
    public final synchronized long m47426n() {
        int i = this.f44407p;
        if (i == 0) {
            return -1L;
        }
        return m47428p(i);
    }

    /* renamed from: o */
    public synchronized long m47427o() {
        int i = this.f44410s;
        if (i == 0) {
            return -1L;
        }
        return m47428p(i);
    }

    /* renamed from: p */
    public final long m47428p(int i) {
        this.f44412u = Math.max(this.f44412u, m47399C(i));
        this.f44407p -= i;
        int i2 = this.f44408q + i;
        this.f44408q = i2;
        int i3 = this.f44409r + i;
        this.f44409r = i3;
        int i4 = this.f44400i;
        if (i3 >= i4) {
            this.f44409r = i3 - i4;
        }
        int i5 = this.f44410s - i;
        this.f44410s = i5;
        if (i5 < 0) {
            this.f44410s = 0;
        }
        this.f44394c.m16317d(i2);
        if (this.f44407p != 0) {
            return this.f44402k[this.f44409r];
        }
        int i6 = this.f44409r;
        if (i6 == 0) {
            i6 = this.f44400i;
        }
        return this.f44402k[i6 - 1] + this.f44403l[r6];
    }

    /* renamed from: q */
    public final void m47429q(long j, boolean z, boolean z2) {
        this.f44392a.m44613b(m47425m(j, z, z2));
    }

    /* renamed from: r */
    public final void m47430r() {
        this.f44392a.m44613b(m47426n());
    }

    /* renamed from: s */
    public final void m47431s() {
        this.f44392a.m44613b(m47427o());
    }

    /* renamed from: t */
    public final long m47432t(int i) {
        int iM47404H = m47404H() - i;
        boolean z = false;
        op0.m42511a(iM47404H >= 0 && iM47404H <= this.f44407p - this.f44410s);
        int i2 = this.f44407p - iM47404H;
        this.f44407p = i2;
        this.f44413v = Math.max(this.f44412u, m47399C(i2));
        if (iM47404H == 0 && this.f44414w) {
            z = true;
        }
        this.f44414w = z;
        this.f44394c.m16316c(i);
        int i3 = this.f44407p;
        if (i3 == 0) {
            return 0L;
        }
        return this.f44402k[m47401E(i3 - 1)] + this.f44403l[r9];
    }

    /* renamed from: u */
    public final void m47433u(int i) {
        this.f44392a.m44614c(m47432t(i));
    }

    /* renamed from: v */
    public final int m47434v(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f44405n[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.f44400i) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    /* renamed from: w */
    public final int m47435w(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f44405n[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f44404m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f44400i) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: x */
    public C2181a m47436x(C2181a c2181a) {
        return (this.f44390F == 0 || c2181a.f7948s == Long.MAX_VALUE) ? c2181a : c2181a.m6707a().s0(c2181a.f7948s + this.f44390F).m6748K();
    }

    /* renamed from: y */
    public final int m47437y() {
        return this.f44408q;
    }

    /* renamed from: z */
    public final synchronized long m47438z() {
        return this.f44407p == 0 ? Long.MIN_VALUE : this.f44405n[this.f44409r];
    }
}
