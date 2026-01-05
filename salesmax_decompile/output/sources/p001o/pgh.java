package p001o;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class pgh {

    /* renamed from: l */
    public static final char[] f40042l = new char[0];

    /* renamed from: a */
    public final xl1 f40043a;

    /* renamed from: b */
    public char[] f40044b;

    /* renamed from: c */
    public int f40045c;

    /* renamed from: d */
    public int f40046d;

    /* renamed from: e */
    public ArrayList f40047e;

    /* renamed from: f */
    public boolean f40048f;

    /* renamed from: g */
    public int f40049g;

    /* renamed from: h */
    public char[] f40050h;

    /* renamed from: i */
    public int f40051i;

    /* renamed from: j */
    public String f40052j;

    /* renamed from: k */
    public char[] f40053k;

    public pgh(xl1 xl1Var) {
        this.f40043a = xl1Var;
    }

    /* renamed from: A */
    public final void m43612A(int i) {
        int i2 = this.f40046d;
        this.f40046d = 0;
        char[] cArr = this.f40044b;
        this.f40044b = null;
        int i3 = this.f40045c;
        this.f40045c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.f40050h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.f40050h = m43614b(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.f40050h, 0, i2);
        }
        this.f40049g = 0;
        this.f40051i = i2;
    }

    /* renamed from: a */
    public void m43613a(char[] cArr, int i, int i2) {
        if (this.f40045c >= 0) {
            m43612A(i2);
        }
        this.f40052j = null;
        this.f40053k = null;
        char[] cArr2 = this.f40050h;
        int length = cArr2.length;
        int i3 = this.f40051i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.f40051i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            m43624l(i2);
            int iMin = Math.min(this.f40050h.length, i2);
            System.arraycopy(cArr, i, this.f40050h, 0, iMin);
            this.f40051i += iMin;
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    /* renamed from: b */
    public final char[] m43614b(int i) {
        xl1 xl1Var = this.f40043a;
        return xl1Var != null ? xl1Var.m56439d(2, i) : new char[Math.max(i, 500)];
    }

    /* renamed from: c */
    public final char[] m43615c(int i) {
        return new char[i];
    }

    /* renamed from: d */
    public final void m43616d() {
        this.f40048f = false;
        this.f40047e.clear();
        this.f40049g = 0;
        this.f40051i = 0;
    }

    /* renamed from: e */
    public char[] m43617e() {
        char[] cArr = this.f40053k;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrM43635w = m43635w();
        this.f40053k = cArrM43635w;
        return cArrM43635w;
    }

    /* renamed from: f */
    public BigDecimal m43618f() {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f40053k;
        if (cArr3 != null) {
            return f5c.m26175d(cArr3);
        }
        int i = this.f40045c;
        return (i < 0 || (cArr2 = this.f40044b) == null) ? (this.f40049g != 0 || (cArr = this.f40050h) == null) ? f5c.m26175d(m43617e()) : f5c.m26176e(cArr, 0, this.f40051i) : f5c.m26176e(cArr2, i, this.f40046d);
    }

    /* renamed from: g */
    public double m43619g() {
        return f5c.m26177f(m43622j());
    }

    /* renamed from: h */
    public int m43620h(boolean z) {
        char[] cArr;
        int i = this.f40045c;
        return (i < 0 || (cArr = this.f40044b) == null) ? z ? -f5c.m26178g(this.f40050h, 1, this.f40051i - 1) : f5c.m26178g(this.f40050h, 0, this.f40051i) : z ? -f5c.m26178g(cArr, i + 1, this.f40046d - 1) : f5c.m26178g(cArr, i, this.f40046d);
    }

    /* renamed from: i */
    public long m43621i(boolean z) {
        char[] cArr;
        int i = this.f40045c;
        return (i < 0 || (cArr = this.f40044b) == null) ? z ? -f5c.m26179h(this.f40050h, 1, this.f40051i - 1) : f5c.m26179h(this.f40050h, 0, this.f40051i) : z ? -f5c.m26179h(cArr, i + 1, this.f40046d - 1) : f5c.m26179h(cArr, i, this.f40046d);
    }

    /* renamed from: j */
    public String m43622j() {
        if (this.f40052j == null) {
            char[] cArr = this.f40053k;
            if (cArr != null) {
                this.f40052j = new String(cArr);
            } else {
                int i = this.f40045c;
                if (i >= 0) {
                    int i2 = this.f40046d;
                    if (i2 < 1) {
                        this.f40052j = "";
                        return "";
                    }
                    this.f40052j = new String(this.f40044b, i, i2);
                } else {
                    int i3 = this.f40049g;
                    int i4 = this.f40051i;
                    if (i3 == 0) {
                        this.f40052j = i4 != 0 ? new String(this.f40050h, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList arrayList = this.f40047e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = (char[]) this.f40047e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.f40050h, 0, this.f40051i);
                        this.f40052j = sb.toString();
                    }
                }
            }
        }
        return this.f40052j;
    }

    /* renamed from: k */
    public char[] m43623k() {
        this.f40045c = -1;
        this.f40051i = 0;
        this.f40046d = 0;
        this.f40044b = null;
        this.f40052j = null;
        this.f40053k = null;
        if (this.f40048f) {
            m43616d();
        }
        char[] cArr = this.f40050h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrM43614b = m43614b(0);
        this.f40050h = cArrM43614b;
        return cArrM43614b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026 A[PHI: r0
      0x0026: PHI (r0v8 int) = (r0v6 int), (r0v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m43624l(int i) {
        if (this.f40047e == null) {
            this.f40047e = new ArrayList();
        }
        char[] cArr = this.f40050h;
        this.f40048f = true;
        this.f40047e.add(cArr);
        this.f40049g += cArr.length;
        this.f40051i = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        int i3 = 500;
        if (i2 < 500) {
            i2 = i3;
        } else {
            i3 = 65536;
            if (i2 > 65536) {
            }
        }
        this.f40050h = m43615c(i2);
    }

    /* renamed from: m */
    public char[] m43625m() {
        char[] cArr = this.f40050h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i);
        this.f40050h = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public char[] m43626n() {
        if (this.f40047e == null) {
            this.f40047e = new ArrayList();
        }
        this.f40048f = true;
        this.f40047e.add(this.f40050h);
        int length = this.f40050h.length;
        this.f40049g += length;
        this.f40051i = 0;
        int i = length + (length >> 1);
        int i2 = 500;
        if (i < 500) {
            i = i2;
        } else {
            i2 = 65536;
            if (i > 65536) {
            }
        }
        char[] cArrM43615c = m43615c(i);
        this.f40050h = cArrM43615c;
        return cArrM43615c;
    }

    /* renamed from: o */
    public char[] m43627o() {
        if (this.f40045c >= 0) {
            m43612A(1);
        } else {
            char[] cArr = this.f40050h;
            if (cArr == null) {
                this.f40050h = m43614b(0);
            } else if (this.f40051i >= cArr.length) {
                m43624l(1);
            }
        }
        return this.f40050h;
    }

    /* renamed from: p */
    public int m43628p() {
        return this.f40051i;
    }

    /* renamed from: q */
    public char[] m43629q() {
        if (this.f40045c >= 0) {
            return this.f40044b;
        }
        char[] cArr = this.f40053k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f40052j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f40053k = charArray;
            return charArray;
        }
        if (this.f40048f) {
            return m43617e();
        }
        char[] cArr2 = this.f40050h;
        return cArr2 == null ? f40042l : cArr2;
    }

    /* renamed from: r */
    public int m43630r() {
        int i = this.f40045c;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: s */
    public void m43631s() {
        char[] cArr;
        this.f40045c = -1;
        this.f40051i = 0;
        this.f40046d = 0;
        this.f40044b = null;
        this.f40053k = null;
        if (this.f40048f) {
            m43616d();
        }
        xl1 xl1Var = this.f40043a;
        if (xl1Var == null || (cArr = this.f40050h) == null) {
            return;
        }
        this.f40050h = null;
        xl1Var.m56445j(2, cArr);
    }

    /* renamed from: t */
    public void m43632t(char[] cArr, int i, int i2) {
        this.f40044b = null;
        this.f40045c = -1;
        this.f40046d = 0;
        this.f40052j = null;
        this.f40053k = null;
        if (this.f40048f) {
            m43616d();
        } else if (this.f40050h == null) {
            this.f40050h = m43614b(i2);
        }
        this.f40049g = 0;
        this.f40051i = 0;
        m43613a(cArr, i, i2);
    }

    public String toString() {
        return m43622j();
    }

    /* renamed from: u */
    public void m43633u(char[] cArr, int i, int i2) {
        this.f40052j = null;
        this.f40053k = null;
        this.f40044b = cArr;
        this.f40045c = i;
        this.f40046d = i2;
        if (this.f40048f) {
            m43616d();
        }
    }

    /* renamed from: v */
    public void m43634v(String str) {
        this.f40044b = null;
        this.f40045c = -1;
        this.f40046d = 0;
        this.f40052j = str;
        this.f40053k = null;
        if (this.f40048f) {
            m43616d();
        }
        this.f40051i = 0;
    }

    /* renamed from: w */
    public final char[] m43635w() {
        int i;
        String str = this.f40052j;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.f40045c;
        if (i2 >= 0) {
            int i3 = this.f40046d;
            return i3 < 1 ? f40042l : i2 == 0 ? Arrays.copyOf(this.f40044b, i3) : Arrays.copyOfRange(this.f40044b, i2, i3 + i2);
        }
        int iM43638z = m43638z();
        if (iM43638z < 1) {
            return f40042l;
        }
        char[] cArrM43615c = m43615c(iM43638z);
        ArrayList arrayList = this.f40047e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = (char[]) this.f40047e.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, cArrM43615c, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.f40050h, 0, cArrM43615c, i, this.f40051i);
        return cArrM43615c;
    }

    /* renamed from: x */
    public String m43636x(int i) {
        this.f40051i = i;
        if (this.f40049g > 0) {
            return m43622j();
        }
        String str = i == 0 ? "" : new String(this.f40050h, 0, i);
        this.f40052j = str;
        return str;
    }

    /* renamed from: y */
    public void m43637y(int i) {
        this.f40051i = i;
    }

    /* renamed from: z */
    public int m43638z() {
        if (this.f40045c >= 0) {
            return this.f40046d;
        }
        char[] cArr = this.f40053k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f40052j;
        return str != null ? str.length() : this.f40049g + this.f40051i;
    }
}
