package p001o;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class br8 extends cr8 {

    /* renamed from: o.br8$a */
    public static class C12481a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a */
        public final int[] f16730a;

        /* renamed from: b */
        public final int f16731b;

        /* renamed from: c */
        public final int f16732c;

        public C12481a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            dgd.m23060m(i, size());
            return Integer.valueOf(this.f16730a[this.f16731b + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && br8.m19643j(this.f16730a, ((Integer) obj).intValue(), this.f16731b, this.f16732c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer set(int i, Integer num) {
            dgd.m23060m(i, size());
            int[] iArr = this.f16730a;
            int i2 = this.f16731b;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) dgd.m23062o(num)).intValue();
            return Integer.valueOf(i3);
        }

        /* renamed from: e */
        public int[] m19651e() {
            return Arrays.copyOfRange(this.f16730a, this.f16731b, this.f16732c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C12481a)) {
                return super.equals(obj);
            }
            C12481a c12481a = (C12481a) obj;
            int size = size();
            if (c12481a.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f16730a[this.f16731b + i] != c12481a.f16730a[c12481a.f16731b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM19642i = 1;
            for (int i = this.f16731b; i < this.f16732c; i++) {
                iM19642i = (iM19642i * 31) + br8.m19642i(this.f16730a[i]);
            }
            return iM19642i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM19643j;
            if (!(obj instanceof Integer) || (iM19643j = br8.m19643j(this.f16730a, ((Integer) obj).intValue(), this.f16731b, this.f16732c)) < 0) {
                return -1;
            }
            return iM19643j - this.f16731b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM19644k;
            if (!(obj instanceof Integer) || (iM19644k = br8.m19644k(this.f16730a, ((Integer) obj).intValue(), this.f16731b, this.f16732c)) < 0) {
                return -1;
            }
            return iM19644k - this.f16731b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f16732c - this.f16731b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i, int i2) {
            dgd.m23067t(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f16730a;
            int i3 = this.f16731b;
            return new C12481a(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f16730a[this.f16731b]);
            int i = this.f16731b;
            while (true) {
                i++;
                if (i >= this.f16732c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f16730a[i]);
            }
        }

        public C12481a(int[] iArr, int i, int i2) {
            this.f16730a = iArr;
            this.f16731b = i;
            this.f16732c = i2;
        }
    }

    /* renamed from: c */
    public static List m19636c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new C12481a(iArr);
    }

    /* renamed from: d */
    public static int m19637d(long j) {
        int i = (int) j;
        dgd.m23056i(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: e */
    public static int m19638e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: f */
    public static int m19639f(int i, int i2, int i3) {
        dgd.m23055h(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: g */
    public static int m19640g(byte[] bArr) {
        dgd.m23055h(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return m19641h(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    /* renamed from: h */
    public static int m19641h(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* renamed from: i */
    public static int m19642i(int i) {
        return i;
    }

    /* renamed from: j */
    public static int m19643j(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: k */
    public static int m19644k(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public static int m19645l(long j) {
        if (j > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: m */
    public static int[] m19646m(Collection collection) {
        if (collection instanceof C12481a) {
            return ((C12481a) collection).m19651e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) dgd.m23062o(array[i])).intValue();
        }
        return iArr;
    }

    /* renamed from: n */
    public static Integer m19647n(String str) {
        return m19648o(str, 10);
    }

    /* renamed from: o */
    public static Integer m19648o(String str, int i) {
        Long lM50162d = tla.m50162d(str, i);
        if (lM50162d == null || lM50162d.longValue() != lM50162d.intValue()) {
            return null;
        }
        return Integer.valueOf(lM50162d.intValue());
    }
}
