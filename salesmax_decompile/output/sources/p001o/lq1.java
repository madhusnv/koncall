package p001o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p001o.x89;

/* loaded from: classes5.dex */
public final class lq1 {

    /* renamed from: a */
    public final lq1 f34207a;

    /* renamed from: b */
    public final AtomicReference f34208b;

    /* renamed from: c */
    public final int f34209c;

    /* renamed from: d */
    public boolean f34210d;

    /* renamed from: e */
    public final boolean f34211e;

    /* renamed from: f */
    public int[] f34212f;

    /* renamed from: g */
    public int f34213g;

    /* renamed from: h */
    public int f34214h;

    /* renamed from: i */
    public int f34215i;

    /* renamed from: j */
    public int f34216j;

    /* renamed from: k */
    public int f34217k;

    /* renamed from: l */
    public String[] f34218l;

    /* renamed from: m */
    public int f34219m;

    /* renamed from: n */
    public int f34220n;

    /* renamed from: o */
    public boolean f34221o;

    public lq1(int i, boolean z, int i2, boolean z2) {
        this.f34207a = null;
        this.f34209c = i2;
        this.f34210d = z;
        this.f34211e = z2;
        int i3 = 16;
        if (i < 16) {
            i = i3;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this.f34208b = new AtomicReference(C15127a.m37738a(i));
    }

    /* renamed from: B */
    public static lq1 m37694B() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return m37695C((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: C */
    public static lq1 m37695C(int i) {
        return new lq1(64, true, i, true);
    }

    /* renamed from: c */
    public static int m37696c(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    /* renamed from: A */
    public int m37704A(int[] iArr, int i) {
        if (i < 4) {
            throw new IllegalArgumentException();
        }
        int i2 = iArr[0] ^ this.f34209c;
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i5 = i4 + (i4 >>> 4);
        for (int i6 = 3; i6 < i; i6++) {
            int i7 = iArr[i6];
            i5 += i7 ^ (i7 >> 21);
        }
        int i8 = i5 * 65599;
        int i9 = i8 + (i8 >>> 19);
        return (i9 << 5) ^ i9;
    }

    /* renamed from: D */
    public String m37705D(int i) {
        int iM37721b = m37721b(m37735x(i));
        int[] iArr = this.f34212f;
        int i2 = iArr[iM37721b + 3];
        if (i2 == 1) {
            if (iArr[iM37721b] == i) {
                return this.f34218l[iM37721b >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        int i3 = this.f34214h + ((iM37721b >> 3) << 2);
        int i4 = iArr[i3 + 3];
        if (i4 == 1) {
            if (iArr[i3] == i) {
                return this.f34218l[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        return m37724f(iM37721b, i);
    }

    /* renamed from: E */
    public String m37706E(int i, int i2) {
        int iM37721b = m37721b(m37736y(i, i2));
        int[] iArr = this.f34212f;
        int i3 = iArr[iM37721b + 3];
        if (i3 == 2) {
            if (i == iArr[iM37721b] && i2 == iArr[iM37721b + 1]) {
                return this.f34218l[iM37721b >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.f34214h + ((iM37721b >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.f34218l[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return m37725g(iM37721b, i, i2);
    }

    /* renamed from: F */
    public String m37707F(int i, int i2, int i3) {
        int iM37721b = m37721b(m37737z(i, i2, i3));
        int[] iArr = this.f34212f;
        int i4 = iArr[iM37721b + 3];
        if (i4 == 3) {
            if (i == iArr[iM37721b] && iArr[iM37721b + 1] == i2 && iArr[iM37721b + 2] == i3) {
                return this.f34218l[iM37721b >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.f34214h + ((iM37721b >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.f34218l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return m37726h(iM37721b, i, i2, i3);
    }

    /* renamed from: G */
    public String m37708G(int[] iArr, int i) {
        if (i < 4) {
            return i != 1 ? i != 2 ? i != 3 ? "" : m37707F(iArr[0], iArr[1], iArr[2]) : m37706E(iArr[0], iArr[1]) : m37705D(iArr[0]);
        }
        int iM37704A = m37704A(iArr, i);
        int iM37721b = m37721b(iM37704A);
        int[] iArr2 = this.f34212f;
        int i2 = iArr2[iM37721b + 3];
        if (iM37704A == iArr2[iM37721b] && i2 == i && m37731m(iArr, i, iArr2[iM37721b + 1])) {
            return this.f34218l[iM37721b >> 2];
        }
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f34214h + ((iM37721b >> 3) << 2);
        return (iM37704A == iArr2[i3] && iArr2[i3 + 3] == i && m37731m(iArr, i, iArr2[i3 + 1])) ? this.f34218l[i3 >> 2] : m37727i(iM37721b, iM37704A, iArr, i);
    }

    /* renamed from: H */
    public lq1 m37709H(int i) {
        return new lq1(this, x89.EnumC18074a.INTERN_FIELD_NAMES.enabledIn(i), this.f34209c, x89.EnumC18074a.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), (C15127a) this.f34208b.get());
    }

    /* renamed from: I */
    public boolean m37710I() {
        return !this.f34221o;
    }

    /* renamed from: J */
    public final void m37711J(C15127a c15127a) {
        int i = c15127a.f34223b;
        C15127a c15127a2 = (C15127a) this.f34208b.get();
        if (i == c15127a2.f34223b) {
            return;
        }
        if (i > 6000) {
            c15127a = C15127a.m37738a(64);
        }
        ec3.m24748a(this.f34208b, c15127a2, c15127a);
    }

    /* renamed from: K */
    public final void m37712K(boolean z) {
        this.f34217k = 0;
        this.f34219m = m37730l();
        this.f34220n = this.f34213g << 3;
        if (z) {
            Arrays.fill(this.f34212f, 0);
            Arrays.fill(this.f34218l, (Object) null);
        }
    }

    /* renamed from: L */
    public int m37713L() {
        int i = this.f34214h;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f34212f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: M */
    public final void m37714M() {
        this.f34221o = false;
        int[] iArr = this.f34212f;
        String[] strArr = this.f34218l;
        int i = this.f34213g;
        int i2 = this.f34217k;
        int i3 = i + i;
        int i4 = this.f34219m;
        if (i3 > 65536) {
            m37712K(true);
            return;
        }
        this.f34212f = new int[iArr.length + (i << 3)];
        this.f34213g = i3;
        int i5 = i3 << 2;
        this.f34214h = i5;
        this.f34215i = i5 + (i5 >> 1);
        this.f34216j = m37696c(i3);
        this.f34218l = new String[strArr.length << 1];
        m37712K(false);
        int[] iArr2 = new int[16];
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i8 != 0) {
                i6++;
                String str = strArr[i7 >> 2];
                if (i8 == 1) {
                    iArr2[0] = iArr[i7];
                    m37734w(str, iArr2, 1);
                } else if (i8 == 2) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    m37734w(str, iArr2, 2);
                } else if (i8 != 3) {
                    if (i8 > iArr2.length) {
                        iArr2 = new int[i8];
                    }
                    System.arraycopy(iArr, iArr[i7 + 1], iArr2, 0, i8);
                    m37734w(str, iArr2, i8);
                } else {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    iArr2[2] = iArr[i7 + 2];
                    m37734w(str, iArr2, 3);
                }
            }
        }
        if (i6 == i2) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i2 + ", copyCount=" + i6);
    }

    /* renamed from: N */
    public void m37715N() {
        if (this.f34207a == null || !m37710I()) {
            return;
        }
        this.f34207a.m37711J(new C15127a(this));
        this.f34221o = true;
    }

    /* renamed from: O */
    public int m37716O() {
        int i = this.f34215i;
        int i2 = 0;
        for (int i3 = this.f34214h + 3; i3 < i; i3 += 4) {
            if (this.f34212f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: P */
    public int m37717P() {
        return (this.f34219m - m37730l()) >> 2;
    }

    /* renamed from: Q */
    public int m37718Q() {
        int i = this.f34215i + 3;
        int i2 = this.f34213g + i;
        int i3 = 0;
        while (i < i2) {
            if (this.f34212f[i] != 0) {
                i3++;
            }
            i += 4;
        }
        return i3;
    }

    /* renamed from: R */
    public int m37719R() {
        int i = this.f34213g << 3;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f34212f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final int m37720a(int[] iArr, int i) {
        int i2 = this.f34220n;
        int i3 = i2 + i;
        int[] iArr2 = this.f34212f;
        if (i3 > iArr2.length) {
            this.f34212f = Arrays.copyOf(this.f34212f, this.f34212f.length + Math.max(i3 - iArr2.length, Math.min(4096, this.f34213g)));
        }
        System.arraycopy(iArr, 0, this.f34212f, i2, i);
        this.f34220n += i;
        return i2;
    }

    /* renamed from: b */
    public final int m37721b(int i) {
        return (i & (this.f34213g - 1)) << 2;
    }

    /* renamed from: d */
    public final boolean m37722d() {
        if (this.f34217k <= (this.f34213g >> 1)) {
            return false;
        }
        int iM37730l = (this.f34219m - m37730l()) >> 2;
        int i = this.f34217k;
        return iM37730l > ((i + 1) >> 7) || ((double) i) > ((double) this.f34213g) * 0.8d;
    }

    /* renamed from: e */
    public final int m37723e(int i) {
        int iM37721b = m37721b(i);
        int[] iArr = this.f34212f;
        if (iArr[iM37721b + 3] == 0) {
            return iM37721b;
        }
        if (m37722d()) {
            return m37729k(i);
        }
        int i2 = this.f34214h + ((iM37721b >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.f34215i;
        int i4 = this.f34216j;
        int i5 = i3 + ((iM37721b >> (i4 + 2)) << i4);
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            if (iArr[i5 + 3] == 0) {
                return i5;
            }
            i5 += 4;
        }
        int i7 = this.f34219m;
        int i8 = i7 + 4;
        this.f34219m = i8;
        if (i8 < (this.f34213g << 3)) {
            return i7;
        }
        if (this.f34211e) {
            m37728j();
        }
        return m37729k(i);
    }

    /* renamed from: f */
    public final String m37724f(int i, int i2) {
        int i3 = this.f34215i;
        int i4 = this.f34216j;
        int i5 = i3 + ((i >> (i4 + 2)) << i4);
        int[] iArr = this.f34212f;
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            int i7 = iArr[i5 + 3];
            if (i2 == iArr[i5] && 1 == i7) {
                return this.f34218l[i5 >> 2];
            }
            if (i7 == 0) {
                return null;
            }
            i5 += 4;
        }
        for (int iM37730l = m37730l(); iM37730l < this.f34219m; iM37730l += 4) {
            if (i2 == iArr[iM37730l] && 1 == iArr[iM37730l + 3]) {
                return this.f34218l[iM37730l >> 2];
            }
        }
        return null;
    }

    /* renamed from: g */
    public final String m37725g(int i, int i2, int i3) {
        int i4 = this.f34215i;
        int i5 = this.f34216j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr = this.f34212f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr[i6 + 3];
            if (i2 == iArr[i6] && i3 == iArr[i6 + 1] && 2 == i8) {
                return this.f34218l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int iM37730l = m37730l(); iM37730l < this.f34219m; iM37730l += 4) {
            if (i2 == iArr[iM37730l] && i3 == iArr[iM37730l + 1] && 2 == iArr[iM37730l + 3]) {
                return this.f34218l[iM37730l >> 2];
            }
        }
        return null;
    }

    /* renamed from: h */
    public final String m37726h(int i, int i2, int i3, int i4) {
        int i5 = this.f34215i;
        int i6 = this.f34216j;
        int i7 = i5 + ((i >> (i6 + 2)) << i6);
        int[] iArr = this.f34212f;
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            int i9 = iArr[i7 + 3];
            if (i2 == iArr[i7] && i3 == iArr[i7 + 1] && i4 == iArr[i7 + 2] && 3 == i9) {
                return this.f34218l[i7 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
            i7 += 4;
        }
        for (int iM37730l = m37730l(); iM37730l < this.f34219m; iM37730l += 4) {
            if (i2 == iArr[iM37730l] && i3 == iArr[iM37730l + 1] && i4 == iArr[iM37730l + 2] && 3 == iArr[iM37730l + 3]) {
                return this.f34218l[iM37730l >> 2];
            }
        }
        return null;
    }

    /* renamed from: i */
    public final String m37727i(int i, int i2, int[] iArr, int i3) {
        int i4 = this.f34215i;
        int i5 = this.f34216j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr2 = this.f34212f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr2[i6 + 3];
            if (i2 == iArr2[i6] && i3 == i8 && m37731m(iArr, i3, iArr2[i6 + 1])) {
                return this.f34218l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int iM37730l = m37730l(); iM37730l < this.f34219m; iM37730l += 4) {
            if (i2 == iArr2[iM37730l] && i3 == iArr2[iM37730l + 3] && m37731m(iArr, i3, iArr2[iM37730l + 1])) {
                return this.f34218l[iM37730l >> 2];
            }
        }
        return null;
    }

    /* renamed from: j */
    public void m37728j() {
        if (this.f34213g <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this.f34217k + " entries, hash area of " + this.f34213g + " slots is now full (all " + (this.f34213g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    /* renamed from: k */
    public final int m37729k(int i) {
        m37714M();
        int iM37721b = m37721b(i);
        int[] iArr = this.f34212f;
        if (iArr[iM37721b + 3] == 0) {
            return iM37721b;
        }
        int i2 = this.f34214h + ((iM37721b >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.f34215i;
        int i4 = this.f34216j;
        int i5 = i3 + ((iM37721b >> (i4 + 2)) << i4);
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            if (iArr[i5 + 3] == 0) {
                return i5;
            }
            i5 += 4;
        }
        int i7 = this.f34219m;
        this.f34219m = i7 + 4;
        return i7;
    }

    /* renamed from: l */
    public final int m37730l() {
        int i = this.f34213g;
        return (i << 3) - i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m37731m(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr2 = this.f34212f;
        switch (i) {
            case 4:
                i3 = 0;
                int i7 = i3 + 1;
                int i8 = i2 + 1;
                if (iArr[i3] == iArr2[i2]) {
                    return false;
                }
                int i9 = i7 + 1;
                int i10 = i8 + 1;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                return iArr[i9] == iArr2[i10] && iArr[i9 + 1] == iArr2[i10 + 1];
            case 5:
                i4 = 0;
                i3 = i4 + 1;
                int i11 = i2 + 1;
                if (iArr[i4] == iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                int i72 = i3 + 1;
                int i82 = i2 + 1;
                if (iArr[i3] == iArr2[i2]) {
                }
                break;
            case 6:
                i5 = 0;
                i4 = i5 + 1;
                int i12 = i2 + 1;
                if (iArr[i5] == iArr2[i2]) {
                    return false;
                }
                i2 = i12;
                i3 = i4 + 1;
                int i112 = i2 + 1;
                if (iArr[i4] == iArr2[i2]) {
                }
                break;
            case 7:
                i6 = 0;
                i5 = i6 + 1;
                int i13 = i2 + 1;
                if (iArr[i6] == iArr2[i2]) {
                    return false;
                }
                i2 = i13;
                i4 = i5 + 1;
                int i122 = i2 + 1;
                if (iArr[i5] == iArr2[i2]) {
                }
                break;
            case 8:
                int i14 = i2 + 1;
                if (iArr[0] != iArr2[i2]) {
                    return false;
                }
                i6 = 1;
                i2 = i14;
                i5 = i6 + 1;
                int i132 = i2 + 1;
                if (iArr[i6] == iArr2[i2]) {
                }
                break;
            default:
                return m37732n(iArr, i, i2);
        }
    }

    /* renamed from: n */
    public final boolean m37732n(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            if (iArr[i3] != this.f34212f[i2]) {
                return false;
            }
            if (i4 >= i) {
                return true;
            }
            i3 = i4;
            i2 = i5;
        }
    }

    /* renamed from: o */
    public final void m37733o() {
        if (this.f34221o) {
            int[] iArr = this.f34212f;
            this.f34212f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f34218l;
            this.f34218l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f34221o = false;
        }
    }

    public String toString() {
        int iM37713L = m37713L();
        int iM37716O = m37716O();
        int iM37718Q = m37718Q();
        int iM37717P = m37717P();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", lq1.class.getName(), Integer.valueOf(this.f34217k), Integer.valueOf(this.f34213g), Integer.valueOf(iM37713L), Integer.valueOf(iM37716O), Integer.valueOf(iM37718Q), Integer.valueOf(iM37717P), Integer.valueOf(iM37713L + iM37716O + iM37718Q + iM37717P), Integer.valueOf(m37719R()));
    }

    /* renamed from: w */
    public String m37734w(String str, int[] iArr, int i) {
        int iM37723e;
        m37733o();
        if (this.f34210d) {
            str = wn8.f52388b.m54745a(str);
        }
        if (i == 1) {
            iM37723e = m37723e(m37735x(iArr[0]));
            int[] iArr2 = this.f34212f;
            iArr2[iM37723e] = iArr[0];
            iArr2[iM37723e + 3] = 1;
        } else if (i == 2) {
            iM37723e = m37723e(m37736y(iArr[0], iArr[1]));
            int[] iArr3 = this.f34212f;
            iArr3[iM37723e] = iArr[0];
            iArr3[iM37723e + 1] = iArr[1];
            iArr3[iM37723e + 3] = 2;
        } else if (i != 3) {
            int iM37704A = m37704A(iArr, i);
            iM37723e = m37723e(iM37704A);
            this.f34212f[iM37723e] = iM37704A;
            int iM37720a = m37720a(iArr, i);
            int[] iArr4 = this.f34212f;
            iArr4[iM37723e + 1] = iM37720a;
            iArr4[iM37723e + 3] = i;
        } else {
            int iM37723e2 = m37723e(m37737z(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this.f34212f;
            iArr5[iM37723e2] = iArr[0];
            iArr5[iM37723e2 + 1] = iArr[1];
            iArr5[iM37723e2 + 2] = iArr[2];
            iArr5[iM37723e2 + 3] = 3;
            iM37723e = iM37723e2;
        }
        this.f34218l[iM37723e >> 2] = str;
        this.f34217k++;
        return str;
    }

    /* renamed from: x */
    public int m37735x(int i) {
        int i2 = i ^ this.f34209c;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        return i4 + (i4 >>> 12);
    }

    /* renamed from: y */
    public int m37736y(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = ((i3 ^ (i3 >>> 9)) + (i2 * 33)) ^ this.f34209c;
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    /* renamed from: z */
    public int m37737z(int i, int i2, int i3) {
        int i4 = i ^ this.f34209c;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public lq1(lq1 lq1Var, boolean z, int i, boolean z2, C15127a c15127a) {
        this.f34207a = lq1Var;
        this.f34209c = i;
        this.f34210d = z;
        this.f34211e = z2;
        this.f34208b = null;
        this.f34217k = c15127a.f34223b;
        int i2 = c15127a.f34222a;
        this.f34213g = i2;
        int i3 = i2 << 2;
        this.f34214h = i3;
        this.f34215i = i3 + (i3 >> 1);
        this.f34216j = c15127a.f34224c;
        this.f34212f = c15127a.f34225d;
        this.f34218l = c15127a.f34226e;
        this.f34219m = c15127a.f34227f;
        this.f34220n = c15127a.f34228g;
        this.f34221o = true;
    }

    /* renamed from: o.lq1$a */
    public static final class C15127a {

        /* renamed from: a */
        public final int f34222a;

        /* renamed from: b */
        public final int f34223b;

        /* renamed from: c */
        public final int f34224c;

        /* renamed from: d */
        public final int[] f34225d;

        /* renamed from: e */
        public final String[] f34226e;

        /* renamed from: f */
        public final int f34227f;

        /* renamed from: g */
        public final int f34228g;

        public C15127a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.f34222a = i;
            this.f34223b = i2;
            this.f34224c = i3;
            this.f34225d = iArr;
            this.f34226e = strArr;
            this.f34227f = i4;
            this.f34228g = i5;
        }

        /* renamed from: a */
        public static C15127a m37738a(int i) {
            int i2 = i << 3;
            return new C15127a(i, 0, lq1.m37696c(i), new int[i2], new String[i << 1], i2 - i, i2);
        }

        public C15127a(lq1 lq1Var) {
            this.f34222a = lq1Var.f34213g;
            this.f34223b = lq1Var.f34217k;
            this.f34224c = lq1Var.f34216j;
            this.f34225d = lq1Var.f34212f;
            this.f34226e = lq1Var.f34218l;
            this.f34227f = lq1Var.f34219m;
            this.f34228g = lq1Var.f34220n;
        }
    }
}
