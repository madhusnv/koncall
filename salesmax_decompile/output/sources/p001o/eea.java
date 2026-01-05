package p001o;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class eea {
    /* renamed from: d */
    public static final Object[] m24851d(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: e */
    public static final Object[] m24852e(Object[] objArr, int i) {
        sq8.m48649h(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i);
        sq8.m48648g(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    /* renamed from: f */
    public static final void m24853f(Object[] objArr, int i) {
        sq8.m48649h(objArr, "<this>");
        objArr[i] = null;
    }

    /* renamed from: g */
    public static final void m24854g(Object[] objArr, int i, int i2) {
        sq8.m48649h(objArr, "<this>");
        while (i < i2) {
            m24853f(objArr, i);
            i++;
        }
    }

    /* renamed from: h */
    public static final boolean m24855h(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!sq8.m48644c(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static final int m24856i(Object[] objArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* renamed from: j */
    public static final String m24857j(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }
}
