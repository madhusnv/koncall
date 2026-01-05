package p001o;

import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import p001o.x89;

/* loaded from: classes5.dex */
public final class rh2 {

    /* renamed from: a */
    public final rh2 f43609a;

    /* renamed from: b */
    public final AtomicReference f43610b;

    /* renamed from: c */
    public final int f43611c;

    /* renamed from: d */
    public final int f43612d;

    /* renamed from: e */
    public boolean f43613e;

    /* renamed from: f */
    public String[] f43614f;

    /* renamed from: g */
    public C16612a[] f43615g;

    /* renamed from: h */
    public int f43616h;

    /* renamed from: i */
    public int f43617i;

    /* renamed from: j */
    public int f43618j;

    /* renamed from: k */
    public int f43619k;

    /* renamed from: l */
    public boolean f43620l;

    /* renamed from: m */
    public BitSet f43621m;

    /* renamed from: o.rh2$a */
    public static final class C16612a {

        /* renamed from: a */
        public final String f43622a;

        /* renamed from: b */
        public final C16612a f43623b;

        /* renamed from: c */
        public final int f43624c;

        public C16612a(String str, C16612a c16612a) {
            this.f43622a = str;
            this.f43623b = c16612a;
            this.f43624c = c16612a != null ? 1 + c16612a.f43624c : 1;
        }

        /* renamed from: a */
        public String m46764a(char[] cArr, int i, int i2) {
            if (this.f43622a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.f43622a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.f43622a;
                }
            }
            return null;
        }
    }

    public rh2(int i) {
        this.f43609a = null;
        this.f43611c = i;
        this.f43613e = true;
        this.f43612d = -1;
        this.f43620l = false;
        this.f43619k = 0;
        this.f43610b = new AtomicReference(C16613b.m46765a(64));
    }

    /* renamed from: e */
    public static int m46742e(int i) {
        return i - (i >> 2);
    }

    /* renamed from: m */
    public static rh2 m46747m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return m46748n((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: n */
    public static rh2 m46748n(int i) {
        return new rh2(i);
    }

    /* renamed from: a */
    public final String m46749a(char[] cArr, int i, int i2, int i3, int i4) {
        if (this.f43620l) {
            m46755l();
            this.f43620l = false;
        } else if (this.f43616h >= this.f43617i) {
            m46761t();
            i4 = m46752d(m46754k(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (x89.EnumC18074a.INTERN_FIELD_NAMES.enabledIn(this.f43612d)) {
            str = wn8.f52388b.m54745a(str);
        }
        this.f43616h++;
        String[] strArr = this.f43614f;
        if (strArr[i4] == null) {
            strArr[i4] = str;
        } else {
            int i5 = i4 >> 1;
            C16612a c16612a = new C16612a(str, this.f43615g[i5]);
            int i6 = c16612a.f43624c;
            if (i6 > 100) {
                m46751c(i5, c16612a, i4);
            } else {
                this.f43615g[i5] = c16612a;
                this.f43619k = Math.max(i6, this.f43619k);
            }
        }
        return str;
    }

    /* renamed from: b */
    public final String m46750b(char[] cArr, int i, int i2, C16612a c16612a) {
        while (c16612a != null) {
            String strM46764a = c16612a.m46764a(cArr, i, i2);
            if (strM46764a != null) {
                return strM46764a;
            }
            c16612a = c16612a.f43623b;
        }
        return null;
    }

    /* renamed from: c */
    public final void m46751c(int i, C16612a c16612a, int i2) {
        BitSet bitSet = this.f43621m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.f43621m = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (x89.EnumC18074a.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.f43612d)) {
                m46763v(100);
            }
            this.f43613e = false;
        } else {
            this.f43621m.set(i);
        }
        this.f43614f[i2] = c16612a.f43622a;
        this.f43615g[i] = null;
        this.f43616h -= c16612a.f43624c;
        this.f43619k = -1;
    }

    /* renamed from: d */
    public int m46752d(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.f43618j;
    }

    /* renamed from: j */
    public int m46753j(String str) {
        int length = str.length();
        int iCharAt = this.f43611c;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 33) + str.charAt(i);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    /* renamed from: k */
    public int m46754k(char[] cArr, int i, int i2) {
        int i3 = this.f43611c;
        int i4 = i2 + i;
        while (i < i4) {
            i3 = (i3 * 33) + cArr[i];
            i++;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: l */
    public final void m46755l() {
        String[] strArr = this.f43614f;
        this.f43614f = (String[]) Arrays.copyOf(strArr, strArr.length);
        C16612a[] c16612aArr = this.f43615g;
        this.f43615g = (C16612a[]) Arrays.copyOf(c16612aArr, c16612aArr.length);
    }

    /* renamed from: o */
    public String m46756o(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this.f43613e) {
            return new String(cArr, i, i2);
        }
        int iM46752d = m46752d(i3);
        String str = this.f43614f[iM46752d];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            C16612a c16612a = this.f43615g[iM46752d >> 1];
            if (c16612a != null) {
                String strM46764a = c16612a.m46764a(cArr, i, i2);
                if (strM46764a != null) {
                    return strM46764a;
                }
                String strM46750b = m46750b(cArr, i, i2, c16612a.f43623b);
                if (strM46750b != null) {
                    return strM46750b;
                }
            }
        }
        return m46749a(cArr, i, i2, i3, iM46752d);
    }

    /* renamed from: p */
    public int m46757p() {
        return this.f43611c;
    }

    /* renamed from: q */
    public rh2 m46758q(int i) {
        return new rh2(this, i, this.f43611c, (C16613b) this.f43610b.get());
    }

    /* renamed from: r */
    public boolean m46759r() {
        return !this.f43620l;
    }

    /* renamed from: s */
    public final void m46760s(C16613b c16613b) {
        int i = c16613b.f43625a;
        C16613b c16613b2 = (C16613b) this.f43610b.get();
        if (i == c16613b2.f43625a) {
            return;
        }
        if (i > 12000) {
            c16613b = C16613b.m46765a(64);
        }
        ec3.m24748a(this.f43610b, c16613b2, c16613b);
    }

    /* renamed from: t */
    public final void m46761t() {
        String[] strArr = this.f43614f;
        int length = strArr.length;
        int i = length + length;
        if (i > 65536) {
            this.f43616h = 0;
            this.f43613e = false;
            this.f43614f = new String[64];
            this.f43615g = new C16612a[32];
            this.f43618j = 63;
            this.f43620l = false;
            return;
        }
        C16612a[] c16612aArr = this.f43615g;
        this.f43614f = new String[i];
        this.f43615g = new C16612a[i >> 1];
        this.f43618j = i - 1;
        this.f43617i = m46742e(i);
        int i2 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i2++;
                int iM46752d = m46752d(m46753j(str));
                String[] strArr2 = this.f43614f;
                if (strArr2[iM46752d] == null) {
                    strArr2[iM46752d] = str;
                } else {
                    int i3 = iM46752d >> 1;
                    C16612a c16612a = new C16612a(str, this.f43615g[i3]);
                    this.f43615g[i3] = c16612a;
                    iMax = Math.max(iMax, c16612a.f43624c);
                }
            }
        }
        int i4 = length >> 1;
        for (int i5 = 0; i5 < i4; i5++) {
            for (C16612a c16612a2 = c16612aArr[i5]; c16612a2 != null; c16612a2 = c16612a2.f43623b) {
                i2++;
                String str2 = c16612a2.f43622a;
                int iM46752d2 = m46752d(m46753j(str2));
                String[] strArr3 = this.f43614f;
                if (strArr3[iM46752d2] == null) {
                    strArr3[iM46752d2] = str2;
                } else {
                    int i6 = iM46752d2 >> 1;
                    C16612a c16612a3 = new C16612a(str2, this.f43615g[i6]);
                    this.f43615g[i6] = c16612a3;
                    iMax = Math.max(iMax, c16612a3.f43624c);
                }
            }
        }
        this.f43619k = iMax;
        this.f43621m = null;
        if (i2 != this.f43616h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.f43616h), Integer.valueOf(i2)));
        }
    }

    /* renamed from: u */
    public void m46762u() {
        rh2 rh2Var;
        if (m46759r() && (rh2Var = this.f43609a) != null && this.f43613e) {
            rh2Var.m46760s(new C16613b(this));
            this.f43620l = true;
        }
    }

    /* renamed from: v */
    public void m46763v(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f43616h + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    /* renamed from: o.rh2$b */
    public static final class C16613b {

        /* renamed from: a */
        public final int f43625a;

        /* renamed from: b */
        public final int f43626b;

        /* renamed from: c */
        public final String[] f43627c;

        /* renamed from: d */
        public final C16612a[] f43628d;

        public C16613b(int i, int i2, String[] strArr, C16612a[] c16612aArr) {
            this.f43625a = i;
            this.f43626b = i2;
            this.f43627c = strArr;
            this.f43628d = c16612aArr;
        }

        /* renamed from: a */
        public static C16613b m46765a(int i) {
            return new C16613b(0, 0, new String[i], new C16612a[i >> 1]);
        }

        public C16613b(rh2 rh2Var) {
            this.f43625a = rh2Var.f43616h;
            this.f43626b = rh2Var.f43619k;
            this.f43627c = rh2Var.f43614f;
            this.f43628d = rh2Var.f43615g;
        }
    }

    public rh2(rh2 rh2Var, int i, int i2, C16613b c16613b) {
        this.f43609a = rh2Var;
        this.f43611c = i2;
        this.f43610b = null;
        this.f43612d = i;
        this.f43613e = x89.EnumC18074a.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        String[] strArr = c16613b.f43627c;
        this.f43614f = strArr;
        this.f43615g = c16613b.f43628d;
        this.f43616h = c16613b.f43625a;
        this.f43619k = c16613b.f43626b;
        int length = strArr.length;
        this.f43617i = m46742e(length);
        this.f43618j = length - 1;
        this.f43620l = true;
    }
}
