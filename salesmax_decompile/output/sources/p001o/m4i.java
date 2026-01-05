package p001o;

import java.util.Arrays;
import p001o.bdj;

/* loaded from: classes4.dex */
public final class m4i {

    /* renamed from: f */
    public static final m4i f34794f = new m4i(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f34795a;

    /* renamed from: b */
    public int[] f34796b;

    /* renamed from: c */
    public Object[] f34797c;

    /* renamed from: d */
    public int f34798d;

    /* renamed from: e */
    public boolean f34799e;

    public m4i() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static boolean m38360c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m38361d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static m4i m38362e() {
        return f34794f;
    }

    /* renamed from: h */
    public static int m38363h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public static int m38364i(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    /* renamed from: k */
    public static m4i m38365k(m4i m4iVar, m4i m4iVar2) {
        int i = m4iVar.f34795a + m4iVar2.f34795a;
        int[] iArrCopyOf = Arrays.copyOf(m4iVar.f34796b, i);
        System.arraycopy(m4iVar2.f34796b, 0, iArrCopyOf, m4iVar.f34795a, m4iVar2.f34795a);
        Object[] objArrCopyOf = Arrays.copyOf(m4iVar.f34797c, i);
        System.arraycopy(m4iVar2.f34797c, 0, objArrCopyOf, m4iVar.f34795a, m4iVar2.f34795a);
        return new m4i(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* renamed from: l */
    public static m4i m38366l() {
        return new m4i();
    }

    /* renamed from: p */
    public static void m38367p(int i, Object obj, bdj bdjVar) {
        int iM24741a = ebj.m24741a(i);
        int iM24742b = ebj.m24742b(i);
        if (iM24742b == 0) {
            bdjVar.mo18721u(iM24741a, ((Long) obj).longValue());
            return;
        }
        if (iM24742b == 1) {
            bdjVar.mo18719s(iM24741a, ((Long) obj).longValue());
            return;
        }
        if (iM24742b == 2) {
            bdjVar.mo18695J(iM24741a, (yq1) obj);
            return;
        }
        if (iM24742b != 3) {
            if (iM24742b != 5) {
                throw new RuntimeException(bt8.m19719d());
            }
            bdjVar.mo18703c(iM24741a, ((Integer) obj).intValue());
        } else if (bdjVar.mo18720t() == bdj.EnumC12361a.ASCENDING) {
            bdjVar.mo18724x(iM24741a);
            ((m4i) obj).m38376q(bdjVar);
            bdjVar.mo18688C(iM24741a);
        } else {
            bdjVar.mo18688C(iM24741a);
            ((m4i) obj).m38376q(bdjVar);
            bdjVar.mo18724x(iM24741a);
        }
    }

    /* renamed from: a */
    public void m38368a() {
        if (!this.f34799e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void m38369b() {
        int i = this.f34795a;
        int[] iArr = this.f34796b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f34796b = Arrays.copyOf(iArr, i2);
            this.f34797c = Arrays.copyOf(this.f34797c, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m4i)) {
            return false;
        }
        m4i m4iVar = (m4i) obj;
        int i = this.f34795a;
        return i == m4iVar.f34795a && m38360c(this.f34796b, m4iVar.f34796b, i) && m38361d(this.f34797c, m4iVar.f34797c, this.f34795a);
    }

    /* renamed from: f */
    public int m38370f() {
        int iM38883O;
        int i = this.f34798d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f34795a; i3++) {
            int i4 = this.f34796b[i3];
            int iM24741a = ebj.m24741a(i4);
            int iM24742b = ebj.m24742b(i4);
            if (iM24742b == 0) {
                iM38883O = mf3.m38883O(iM24741a, ((Long) this.f34797c[i3]).longValue());
            } else if (iM24742b == 1) {
                iM38883O = mf3.m38900n(iM24741a, ((Long) this.f34797c[i3]).longValue());
            } else if (iM24742b == 2) {
                iM38883O = mf3.m38892f(iM24741a, (yq1) this.f34797c[i3]);
            } else if (iM24742b == 3) {
                iM38883O = (mf3.m38880L(iM24741a) * 2) + ((m4i) this.f34797c[i3]).m38370f();
            } else {
                if (iM24742b != 5) {
                    throw new IllegalStateException(bt8.m19719d());
                }
                iM38883O = mf3.m38898l(iM24741a, ((Integer) this.f34797c[i3]).intValue());
            }
            i2 += iM38883O;
        }
        this.f34798d = i2;
        return i2;
    }

    /* renamed from: g */
    public int m38371g() {
        int i = this.f34798d;
        if (i != -1) {
            return i;
        }
        int iM38869A = 0;
        for (int i2 = 0; i2 < this.f34795a; i2++) {
            iM38869A += mf3.m38869A(ebj.m24741a(this.f34796b[i2]), (yq1) this.f34797c[i2]);
        }
        this.f34798d = iM38869A;
        return iM38869A;
    }

    public int hashCode() {
        int i = this.f34795a;
        return ((((527 + i) * 31) + m38363h(this.f34796b, i)) * 31) + m38364i(this.f34797c, this.f34795a);
    }

    /* renamed from: j */
    public void m38372j() {
        this.f34799e = false;
    }

    /* renamed from: m */
    public final void m38373m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f34795a; i2++) {
            wcb.m54217c(sb, i, String.valueOf(ebj.m24741a(this.f34796b[i2])), this.f34797c[i2]);
        }
    }

    /* renamed from: n */
    public void m38374n(int i, Object obj) {
        m38368a();
        m38369b();
        int[] iArr = this.f34796b;
        int i2 = this.f34795a;
        iArr[i2] = i;
        this.f34797c[i2] = obj;
        this.f34795a = i2 + 1;
    }

    /* renamed from: o */
    public void m38375o(bdj bdjVar) {
        if (bdjVar.mo18720t() == bdj.EnumC12361a.DESCENDING) {
            for (int i = this.f34795a - 1; i >= 0; i--) {
                bdjVar.mo18702b(ebj.m24741a(this.f34796b[i]), this.f34797c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f34795a; i2++) {
            bdjVar.mo18702b(ebj.m24741a(this.f34796b[i2]), this.f34797c[i2]);
        }
    }

    /* renamed from: q */
    public void m38376q(bdj bdjVar) {
        if (this.f34795a == 0) {
            return;
        }
        if (bdjVar.mo18720t() == bdj.EnumC12361a.ASCENDING) {
            for (int i = 0; i < this.f34795a; i++) {
                m38367p(this.f34796b[i], this.f34797c[i], bdjVar);
            }
            return;
        }
        for (int i2 = this.f34795a - 1; i2 >= 0; i2--) {
            m38367p(this.f34796b[i2], this.f34797c[i2], bdjVar);
        }
    }

    public m4i(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f34798d = -1;
        this.f34795a = i;
        this.f34796b = iArr;
        this.f34797c = objArr;
        this.f34799e = z;
    }
}
