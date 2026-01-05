package rw;

import a2.AbstractC0030c;
import android.database.Cursor;
import android.os.Build;
import cv.C1517m;
import ex.InterfaceC2139c;
import i0.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import nx.AbstractC5179q;
import nx.AbstractC5185w;
import og.pe;
import og.qe;
import p020v.a1;
import qw.C6369s;
import qw.C6371u;
import qw.C6373w;
import qw.C6376z;
import zc.C8930g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.l */
/* loaded from: classes3.dex */
public abstract class AbstractC6662l {
    /* renamed from: A */
    public static int m12698A(Object[] objArr, Object obj) {
        AbstractC4154l.m8923f(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: B */
    public static final void m12699B(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC2139c interfaceC2139c) {
        AbstractC4154l.m8923f(objArr, "<this>");
        sb2.append(charSequence2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append(charSequence);
            }
            AbstractC5179q.m10119a(sb2, obj, interfaceC2139c);
        }
        sb2.append(charSequence3);
    }

    /* renamed from: D */
    public static String m12701D(byte[] bArr, String str, C8930g c8930g, int i10) {
        String str2 = (i10 & 2) != 0 ? "" : "[";
        String str3 = (i10 & 4) == 0 ? "]" : "";
        if ((i10 & 32) != 0) {
            c8930g = null;
        }
        AbstractC4154l.m8923f(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            if (c8930g != null) {
                sb2.append((CharSequence) c8930g.invoke(Byte.valueOf(b10)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b10));
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    /* renamed from: E */
    public static String m12702E(Object[] objArr, String str, C1517m c1517m, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str2 = str;
        if ((i10 & 32) != 0) {
            c1517m = null;
        }
        AbstractC4154l.m8923f(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        m12699B(objArr, sb2, str2, "", "", "...", c1517m);
        return sb2.toString();
    }

    /* renamed from: F */
    public static Object m12703F(Object[] objArr) {
        AbstractC4154l.m8923f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: G */
    public static int m12704G(Object[] objArr, Object obj) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    /* renamed from: H */
    public static byte[] m12705H(byte[] bArr, byte[] elements) {
        AbstractC4154l.m8923f(bArr, "<this>");
        AbstractC4154l.m8923f(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        AbstractC4154l.m8920c(bArrCopyOf);
        return bArrCopyOf;
    }

    /* renamed from: I */
    public static char m12706I(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: J */
    public static byte[] m12707J(byte[] bArr, C4266h indices) {
        AbstractC4154l.m8923f(bArr, "<this>");
        AbstractC4154l.m8923f(indices, "indices");
        return indices.isEmpty() ? new byte[0] : m12723m(bArr, indices.f21646a, indices.f21647b + 1);
    }

    /* renamed from: K */
    public static List m12708K(Object[] objArr) {
        AbstractC4154l.m8923f(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C6660j(objArr, false)) : pe.m10833h(objArr[0]) : C6668r.f31943a;
    }

    /* renamed from: L */
    public static ArrayList m12709L(int[] iArr) {
        AbstractC4154l.m8923f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    /* renamed from: M */
    public static Set m12710M(Object[] objArr) {
        AbstractC4154l.m8923f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C6670t.f31945a;
        }
        if (length == 1) {
            return qe.m10862h(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC6674x.m12776d(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public static List m12711a(Object[] objArr) {
        AbstractC4154l.m8923f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC4154l.m8922e(listAsList, "asList(...)");
        return listAsList;
    }

    /* renamed from: b */
    public static boolean m12712b(int[] iArr, int i10) {
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (i10 == iArr[i11]) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    /* renamed from: c */
    public static boolean m12713c(Object[] objArr, Object obj) {
        AbstractC4154l.m8923f(objArr, "<this>");
        return m12698A(objArr, obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    /* renamed from: d */
    public static boolean m12714d(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Object obj2 = objArr2[i10];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!m12714d((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof C6369s) && (obj2 instanceof C6369s)) {
                    byte[] bArr = ((C6369s) obj).f30769a;
                    byte[] bArr2 = ((C6369s) obj2).f30769a;
                    if (bArr == null) {
                        bArr = null;
                    }
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof C6376z) && (obj2 instanceof C6376z)) {
                    short[] sArr = ((C6376z) obj).f30776a;
                    ?? r52 = ((C6376z) obj2).f30776a;
                    if (sArr == null) {
                        sArr = null;
                    }
                    if (!Arrays.equals(sArr, (short[]) (r52 != 0 ? r52 : null))) {
                        return false;
                    }
                } else if ((obj instanceof C6371u) && (obj2 instanceof C6371u)) {
                    int[] iArr = ((C6371u) obj).f30771a;
                    ?? r53 = ((C6371u) obj2).f30771a;
                    if (iArr == null) {
                        iArr = null;
                    }
                    if (!Arrays.equals(iArr, (int[]) (r53 != 0 ? r53 : null))) {
                        return false;
                    }
                } else if ((obj instanceof C6373w) && (obj2 instanceof C6373w)) {
                    long[] jArr = ((C6373w) obj).f30773a;
                    ?? r54 = ((C6373w) obj2).f30773a;
                    if (jArr == null) {
                        jArr = null;
                    }
                    if (!Arrays.equals(jArr, (long[]) (r54 != 0 ? r54 : null))) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public static void m12715e(int i10, int i11, int i12, Object[] objArr, Object[] destination) {
        AbstractC4154l.m8923f(objArr, "<this>");
        AbstractC4154l.m8923f(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
    }

    /* renamed from: f */
    public static void m12716f(int i10, byte[] bArr, int i11, byte[] destination, int i12) {
        AbstractC4154l.m8923f(bArr, "<this>");
        AbstractC4154l.m8923f(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
    }

    /* renamed from: g */
    public static void m12717g(int i10, int[] iArr, int i11, int i12, int[] destination) {
        AbstractC4154l.m8923f(iArr, "<this>");
        AbstractC4154l.m8923f(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
    }

    /* renamed from: h */
    public static void m12718h(int i10, long[] jArr, int i11, long[] destination, int i12) {
        AbstractC4154l.m8923f(jArr, "<this>");
        AbstractC4154l.m8923f(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
    }

    /* renamed from: i */
    public static void m12719i(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        AbstractC4154l.m8923f(cArr, "<this>");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
    }

    /* renamed from: j */
    public static /* synthetic */ void m12720j(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        m12715e(0, i10, i11, objArr, objArr2);
    }

    /* renamed from: k */
    public static /* synthetic */ void m12721k(int i10, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = (i12 & 2) != 0 ? 0 : 1;
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        m12716f(i13, bArr, i10, bArr2, i11);
    }

    /* renamed from: l */
    public static /* synthetic */ void m12722l(int i10, int[] iArr, int i11, int i12, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        m12717g(i10, iArr, 0, i11, iArr2);
    }

    /* renamed from: m */
    public static byte[] m12723m(byte[] bArr, int i10, int i11) {
        AbstractC4154l.m8923f(bArr, "<this>");
        m12725o(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        AbstractC4154l.m8922e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* renamed from: n */
    public static Object[] m12724n(Object[] objArr, int i10, int i11) {
        AbstractC4154l.m8923f(objArr, "<this>");
        m12725o(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        AbstractC4154l.m8922e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* renamed from: o */
    public static final void m12725o(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(m0.m7377j(i10, i11, "toIndex (", ") is greater than size (", ")."));
        }
    }

    /* renamed from: p */
    public static void m12726p(Object[] objArr, int i10, int i11, Object obj) {
        AbstractC4154l.m8923f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    /* renamed from: q */
    public static void m12727q(long[] jArr, long j6) {
        int length = jArr.length;
        AbstractC4154l.m8923f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j6);
    }

    /* renamed from: s */
    public static ArrayList m12729s(Object[] objArr) {
        AbstractC4154l.m8923f(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    public static Object m12730t(Object[] objArr) {
        AbstractC4154l.m8923f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: u */
    public static final int m12731u(Cursor c2, String str) {
        AbstractC4154l.m8923f(c2, "c");
        int columnIndex = c2.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c2.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = c2.getColumnNames();
        AbstractC4154l.m8920c(columnNames);
        String strConcat = ".".concat(str);
        String strM14328h = a1.m14328h('`', ".", str);
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str2 = columnNames[i10];
            int i12 = i11 + 1;
            if (str2.length() >= str.length() + 2 && (AbstractC5185w.m10129k(str2, strConcat, false) || (str2.charAt(0) == '`' && AbstractC5185w.m10129k(str2, strM14328h, false)))) {
                return i11;
            }
            i10++;
            i11 = i12;
        }
        return -1;
    }

    /* renamed from: v */
    public static final int m12732v(Cursor c2, String str) {
        String strM12702E;
        AbstractC4154l.m8923f(c2, "c");
        int iM12731u = m12731u(c2, str);
        if (iM12731u >= 0) {
            return iM12731u;
        }
        try {
            String[] columnNames = c2.getColumnNames();
            AbstractC4154l.m8922e(columnNames, "getColumnNames(...)");
            strM12702E = m12702E(columnNames, null, null, 63);
        } catch (Exception unused) {
            strM12702E = "unknown";
        }
        throw new IllegalArgumentException(AbstractC0030c.m121l("column '", str, "' does not exist. Available columns: ", strM12702E));
    }

    /* renamed from: w */
    public static C4266h m12733w(int[] iArr) {
        return new C4266h(0, iArr.length - 1, 1);
    }

    /* renamed from: x */
    public static int m12734x(long[] jArr) {
        AbstractC4154l.m8923f(jArr, "<this>");
        return jArr.length - 1;
    }

    /* renamed from: y */
    public static int m12735y(Object[] objArr) {
        AbstractC4154l.m8923f(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: z */
    public static Object m12736z(int i10, Object[] objArr) {
        AbstractC4154l.m8923f(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }
}
