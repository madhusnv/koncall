package mg;

import c9.C0908c;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import ty.C7274h;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.b */
/* loaded from: classes.dex */
public abstract class AbstractC4723b {

    /* renamed from: b */
    public static volatile C4722a f23629b;

    /* renamed from: a */
    public static final Object f23628a = new Object();

    /* renamed from: c */
    public static final b1 f23630c = new b1("id");

    /* renamed from: d */
    public static final b1 f23631d = new b1(TransferTable.COLUMN_TYPE);

    /* renamed from: a */
    public static int m9599a(int i10, int i11) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (p0.f23687a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i12;
                }
                if (iAbs2 <= 0) {
                    return i12;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i12 + i14;
    }

    /* renamed from: b */
    public static int m9600b(AbstractC4737p abstractC4737p) {
        Iterator it = abstractC4737p.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* renamed from: c */
    public static String m9601c(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM14333m;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strM14333m = "null";
            } else {
                try {
                    strM14333m = obj.toString();
                } catch (Exception e2) {
                    String strM7379l = i0.m0.m7379l(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM7379l), (Throwable) e2);
                    strM14333m = p020v.a1.m14333m("<", strM7379l, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i11] = strM14333m;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static String m9602d(u0 u0Var) {
        StringBuilder sb2 = new StringBuilder(u0Var.mo9647e());
        for (int i10 = 0; i10 < u0Var.mo9647e(); i10++) {
            byte bMo9644a = u0Var.mo9644a(i10);
            if (bMo9644a == 34) {
                sb2.append("\\\"");
            } else if (bMo9644a == 39) {
                sb2.append("\\'");
            } else if (bMo9644a != 92) {
                switch (bMo9644a) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo9644a < 32 || bMo9644a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo9644a >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo9644a >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo9644a & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bMo9644a);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* renamed from: e */
    public static void m9603e(int i10, int i11) {
        String strM9601c;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM9601c = m9601c("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "negative size: "));
                }
                strM9601c = m9601c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM9601c);
        }
    }

    /* renamed from: f */
    public static void m9604f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC5601a.m11238i("null value in entry: ", obj.toString(), "=null"));
        }
    }

    /* renamed from: g */
    public static final void m9605g(StringBuilder sb2, Iterator it, C8687a c8687a) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(C8687a.m16044u(entry.getKey()));
            sb2.append(" : ");
            sb2.append(C8687a.m16044u(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(C8687a.m16044u(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(C8687a.m16044u(entry2.getValue()));
            }
        }
    }

    /* renamed from: h */
    public static boolean m9606h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m9607i(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = C4744w.f23706b;
            }
        } else {
            if (!(collection instanceof d0)) {
                return false;
            }
            objComparator = ((AbstractC4741t) ((d0) collection)).f23696d;
        }
        return comparator.equals(objComparator);
    }

    /* renamed from: j */
    public static byte[] m9608j(byte[]... bArr) {
        int i10 = 0;
        int length = 0;
        while (true) {
            if (i10 >= bArr.length) {
                break;
            }
            length += bArr[i10].length;
            i10++;
        }
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length2);
            i11 += length2;
        }
        return bArr2;
    }

    /* renamed from: k */
    public static final c1 m9609k(C7274h c7274h) throws zzhf, zzhj {
        try {
            d1 d1VarM13590u = c7274h.m13590u();
            if (d1VarM13590u == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                try {
                    byte b10 = d1VarM13590u.f23636a;
                    byte b11 = d1VarM13590u.f23637b;
                    int i10 = 0;
                    if (b10 == -128) {
                        long jM13587h = c7274h.m13587h();
                        if (jM13587h > 1000) {
                            throw new zzhj("Parser being asked to read a large CBOR array");
                        }
                        m9610l(b11, jM13587h);
                        c1[] c1VarArr = new c1[(int) jM13587h];
                        while (i10 < jM13587h) {
                            c1VarArr[i10] = m9609k(c7274h);
                            i10++;
                        }
                        return new w0(AbstractC4735n.m9627m(c1VarArr));
                    }
                    if (b10 != -96) {
                        if (b10 == -64) {
                            throw new zzhj("Tags are currently unsupported");
                        }
                        if (b10 == -32) {
                            return new x0(c7274h.m13591w());
                        }
                        if (b10 == 0 || b10 == 32) {
                            long jM13588j = c7274h.m13588j();
                            m9610l(b11, jM13588j > 0 ? jM13588j : ~jM13588j);
                            return new z0(jM13588j);
                        }
                        if (b10 == 64) {
                            c7274h.m13584H((byte) 64);
                            byte[] bArrM13586P = c7274h.m13586P();
                            int length = bArrM13586P.length;
                            m9610l(b11, length);
                            return new y0(u0.m9650k(length, bArrM13586P));
                        }
                        if (b10 == 96) {
                            c7274h.m13584H((byte) 96);
                            String str = new String(c7274h.m13586P(), StandardCharsets.UTF_8);
                            m9610l(b11, str.length());
                            return new b1(str);
                        }
                        throw new zzhj("Unidentifiable major type: " + ((b10 >> 5) & 7));
                    }
                    long jM13589n = c7274h.m13589n();
                    if (jM13589n > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR map");
                    }
                    m9610l(b11, jM13589n);
                    int i11 = (int) jM13589n;
                    C0908c[] c0908cArr = new C0908c[i11];
                    c1 c1Var = null;
                    int i12 = 0;
                    while (i12 < jM13589n) {
                        c1 c1VarM9609k = m9609k(c7274h);
                        if (c1Var != null && c1VarM9609k.compareTo(c1Var) <= 0) {
                            throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + c1Var.toString() + "\nCurrent key: " + c1VarM9609k.toString());
                        }
                        c0908cArr[i12] = new C0908c(11, c1VarM9609k, m9609k(c7274h), false);
                        i12++;
                        c1Var = c1VarM9609k;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i10 < i11) {
                        C0908c c0908c = c0908cArr[i10];
                        if (treeMap.containsKey((c1) c0908c.f5574b)) {
                            throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((c1) c0908c.f5574b, (c1) c0908c.f5575c);
                        i10++;
                    }
                    return new a1(C4740s.m9635d(treeMap));
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    throw new zzhj(e);
                }
            } catch (RuntimeException e10) {
                e = e10;
                throw new zzhj(e);
            }
        } catch (IOException e11) {
            throw new zzhj(e11);
        }
    }

    /* renamed from: l */
    public static final void m9610l(byte b10, long j6) throws zzhf {
        switch (b10) {
            case 24:
                if (j6 >= 24) {
                    return;
                }
                throw new zzhf("Integer value " + j6 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j6 >= 256) {
                    return;
                }
                throw new zzhf("Integer value " + j6 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j6 >= 65536) {
                    return;
                }
                throw new zzhf("Integer value " + j6 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j6 >= 4294967296L) {
                    return;
                }
                throw new zzhf("Integer value " + j6 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }

    /* renamed from: m */
    public static void m9611m(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? m9612n(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? m9612n(i11, i12, "end index") : m9601c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    /* renamed from: n */
    public static String m9612n(int i10, int i11, String str) {
        if (i10 < 0) {
            return m9601c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return m9601c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "negative size: "));
    }
}
