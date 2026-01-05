package og;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class x1 {
    /* renamed from: a */
    public static final boolean m11035a(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: b */
    public static String m11036b(long j6) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + z1.m11079a(Float.intBitsToFloat(i10)) + ')';
        }
        return "CornerRadius.elliptical(" + z1.m11079a(Float.intBitsToFloat(i10)) + ", " + z1.m11079a(Float.intBitsToFloat(i11)) + ')';
    }

    /* renamed from: c */
    public static String m11037c(String str, Object... objArr) {
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
}
