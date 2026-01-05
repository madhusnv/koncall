package p001o;

import java.util.Arrays;
import p001o.cdj;
import p001o.ct8;

/* loaded from: classes6.dex */
public final class l4i {

    /* renamed from: f */
    public static final l4i f33257f = new l4i(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f33258a;

    /* renamed from: b */
    public int[] f33259b;

    /* renamed from: c */
    public Object[] f33260c;

    /* renamed from: d */
    public int f33261d;

    /* renamed from: e */
    public boolean f33262e;

    public l4i() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static l4i m36562c() {
        return f33257f;
    }

    /* renamed from: f */
    public static int m36563f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    public static int m36564g(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    /* renamed from: m */
    public static l4i m36565m(l4i l4iVar, l4i l4iVar2) {
        int i = l4iVar.f33258a + l4iVar2.f33258a;
        int[] iArrCopyOf = Arrays.copyOf(l4iVar.f33259b, i);
        System.arraycopy(l4iVar2.f33259b, 0, iArrCopyOf, l4iVar.f33258a, l4iVar2.f33258a);
        Object[] objArrCopyOf = Arrays.copyOf(l4iVar.f33260c, i);
        System.arraycopy(l4iVar2.f33260c, 0, objArrCopyOf, l4iVar.f33258a, l4iVar2.f33258a);
        return new l4i(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* renamed from: n */
    public static l4i m36566n() {
        return new l4i();
    }

    /* renamed from: o */
    public static boolean m36567o(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m36568r(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public static void m36569t(int i, Object obj, cdj cdjVar) {
        int iM26425a = fbj.m26425a(i);
        int iM26426b = fbj.m26426b(i);
        if (iM26426b == 0) {
            cdjVar.mo21026u(iM26425a, ((Long) obj).longValue());
            return;
        }
        if (iM26426b == 1) {
            cdjVar.mo21024s(iM26425a, ((Long) obj).longValue());
            return;
        }
        if (iM26426b == 2) {
            cdjVar.mo21003M(iM26425a, (xq1) obj);
            return;
        }
        if (iM26426b != 3) {
            if (iM26426b != 5) {
                throw new RuntimeException(ct8.m21767e());
            }
            cdjVar.mo21008c(iM26425a, ((Integer) obj).intValue());
        } else if (cdjVar.mo21025t() == cdj.EnumC12647a.ASCENDING) {
            cdjVar.mo21029x(iM26425a);
            ((l4i) obj).m36582u(cdjVar);
            cdjVar.mo20993C(iM26425a);
        } else {
            cdjVar.mo20993C(iM26425a);
            ((l4i) obj).m36582u(cdjVar);
            cdjVar.mo21029x(iM26425a);
        }
    }

    /* renamed from: a */
    public void m36570a() {
        if (!this.f33262e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void m36571b() {
        int i = this.f33258a;
        int[] iArr = this.f33259b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f33259b = Arrays.copyOf(iArr, i2);
            this.f33260c = Arrays.copyOf(this.f33260c, i2);
        }
    }

    /* renamed from: d */
    public int m36572d() {
        int iM40460W;
        int i = this.f33261d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f33258a; i3++) {
            int i4 = this.f33259b[i3];
            int iM26425a = fbj.m26425a(i4);
            int iM26426b = fbj.m26426b(i4);
            if (iM26426b == 0) {
                iM40460W = nf3.m40460W(iM26425a, ((Long) this.f33260c[i3]).longValue());
            } else if (iM26426b == 1) {
                iM40460W = nf3.m40476p(iM26425a, ((Long) this.f33260c[i3]).longValue());
            } else if (iM26426b == 2) {
                iM40460W = nf3.m40468h(iM26425a, (xq1) this.f33260c[i3]);
            } else if (iM26426b == 3) {
                iM40460W = (nf3.m40457T(iM26425a) * 2) + ((l4i) this.f33260c[i3]).m36572d();
            } else {
                if (iM26426b != 5) {
                    throw new IllegalStateException(ct8.m21767e());
                }
                iM40460W = nf3.m40474n(iM26425a, ((Integer) this.f33260c[i3]).intValue());
            }
            i2 += iM40460W;
        }
        this.f33261d = i2;
        return i2;
    }

    /* renamed from: e */
    public int m36573e() {
        int i = this.f33261d;
        if (i != -1) {
            return i;
        }
        int iM40445H = 0;
        for (int i2 = 0; i2 < this.f33258a; i2++) {
            iM40445H += nf3.m40445H(fbj.m26425a(this.f33259b[i2]), (xq1) this.f33260c[i2]);
        }
        this.f33261d = iM40445H;
        return iM40445H;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l4i)) {
            return false;
        }
        l4i l4iVar = (l4i) obj;
        int i = this.f33258a;
        return i == l4iVar.f33258a && m36568r(this.f33259b, l4iVar.f33259b, i) && m36567o(this.f33260c, l4iVar.f33260c, this.f33258a);
    }

    /* renamed from: h */
    public void m36574h() {
        this.f33262e = false;
    }

    public int hashCode() {
        int i = this.f33258a;
        return ((((527 + i) * 31) + m36563f(this.f33259b, i)) * 31) + m36564g(this.f33260c, this.f33258a);
    }

    /* renamed from: i */
    public boolean m36575i(int i, jf3 jf3Var) throws ct8.C12741a {
        m36570a();
        int iM26425a = fbj.m26425a(i);
        int iM26426b = fbj.m26426b(i);
        if (iM26426b == 0) {
            m36580q(i, Long.valueOf(jf3Var.mo33712w()));
            return true;
        }
        if (iM26426b == 1) {
            m36580q(i, Long.valueOf(jf3Var.mo33709t()));
            return true;
        }
        if (iM26426b == 2) {
            m36580q(i, jf3Var.mo33705p());
            return true;
        }
        if (iM26426b == 3) {
            l4i l4iVar = new l4i();
            l4iVar.m36576j(jf3Var);
            jf3Var.mo33699a(fbj.m26427c(iM26425a, 4));
            m36580q(i, l4iVar);
            return true;
        }
        if (iM26426b == 4) {
            return false;
        }
        if (iM26426b != 5) {
            throw ct8.m21767e();
        }
        m36580q(i, Integer.valueOf(jf3Var.mo33708s()));
        return true;
    }

    /* renamed from: j */
    public final l4i m36576j(jf3 jf3Var) {
        int iMo33695E;
        do {
            iMo33695E = jf3Var.mo33695E();
            if (iMo33695E == 0) {
                break;
            }
        } while (m36575i(iMo33695E, jf3Var));
        return this;
    }

    /* renamed from: k */
    public l4i m36577k(int i, xq1 xq1Var) {
        m36570a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        m36580q(fbj.m26427c(i, 2), xq1Var);
        return this;
    }

    /* renamed from: l */
    public l4i m36578l(int i, int i2) {
        m36570a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        m36580q(fbj.m26427c(i, 0), Long.valueOf(i2));
        return this;
    }

    /* renamed from: p */
    public final void m36579p(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f33258a; i2++) {
            vcb.m52518c(sb, i, String.valueOf(fbj.m26425a(this.f33259b[i2])), this.f33260c[i2]);
        }
    }

    /* renamed from: q */
    public void m36580q(int i, Object obj) {
        m36570a();
        m36571b();
        int[] iArr = this.f33259b;
        int i2 = this.f33258a;
        iArr[i2] = i;
        this.f33260c[i2] = obj;
        this.f33258a = i2 + 1;
    }

    /* renamed from: s */
    public void m36581s(cdj cdjVar) {
        if (cdjVar.mo21025t() == cdj.EnumC12647a.DESCENDING) {
            for (int i = this.f33258a - 1; i >= 0; i--) {
                cdjVar.mo21007b(fbj.m26425a(this.f33259b[i]), this.f33260c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f33258a; i2++) {
            cdjVar.mo21007b(fbj.m26425a(this.f33259b[i2]), this.f33260c[i2]);
        }
    }

    /* renamed from: u */
    public void m36582u(cdj cdjVar) {
        if (this.f33258a == 0) {
            return;
        }
        if (cdjVar.mo21025t() == cdj.EnumC12647a.ASCENDING) {
            for (int i = 0; i < this.f33258a; i++) {
                m36569t(this.f33259b[i], this.f33260c[i], cdjVar);
            }
            return;
        }
        for (int i2 = this.f33258a - 1; i2 >= 0; i2--) {
            m36569t(this.f33259b[i2], this.f33260c[i2], cdjVar);
        }
    }

    public l4i(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f33261d = -1;
        this.f33258a = i;
        this.f33259b = iArr;
        this.f33260c = objArr;
        this.f33262e = z;
    }
}
