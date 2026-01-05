package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class bk3 {
    /* renamed from: a */
    public static Object m19267a(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    /* renamed from: b */
    public static int m19268b(int i, int i2) {
        return i & (~i2);
    }

    /* renamed from: c */
    public static int m19269c(int i, int i2) {
        return i & i2;
    }

    /* renamed from: d */
    public static int m19270d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* renamed from: e */
    public static int m19271e(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: f */
    public static int m19272f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iM27711c = fx7.m27711c(obj);
        int i4 = iM27711c & i;
        int iM19274h = m19274h(obj3, i4);
        if (iM19274h == 0) {
            return -1;
        }
        int iM19268b = m19268b(iM27711c, i);
        int i5 = -1;
        while (true) {
            i2 = iM19274h - 1;
            i3 = iArr[i2];
            if (m19268b(i3, i) == iM19268b && r6c.m46255a(obj, objArr[i2]) && (objArr2 == null || r6c.m46255a(obj2, objArr2[i2]))) {
                break;
            }
            int iM19269c = m19269c(i3, i);
            if (iM19269c == 0) {
                return -1;
            }
            i5 = i2;
            iM19274h = iM19269c;
        }
        int iM19269c2 = m19269c(i3, i);
        if (i5 == -1) {
            m19275i(obj3, i4, iM19269c2);
        } else {
            iArr[i5] = m19270d(iArr[i5], iM19269c2, i);
        }
        return i2;
    }

    /* renamed from: g */
    public static void m19273g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* renamed from: h */
    public static int m19274h(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* renamed from: i */
    public static void m19275i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: j */
    public static int m19276j(int i) {
        return Math.max(4, fx7.m27709a(i + 1, 1.0d));
    }
}
