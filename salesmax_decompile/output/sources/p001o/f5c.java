package p001o;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import java.math.BigDecimal;

/* loaded from: classes5.dex */
public abstract class f5c {

    /* renamed from: a */
    public static final String f22758a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* renamed from: b */
    public static final String f22759b = String.valueOf(Long.MAX_VALUE);

    /* renamed from: a */
    public static NumberFormatException m26172a(String str) {
        return new NumberFormatException("Value \"" + str + "\" can not be represented as BigDecimal");
    }

    /* renamed from: b */
    public static boolean m26173b(char[] cArr, int i, int i2, boolean z) {
        String str = z ? f22758a : f22759b;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int iCharAt = cArr[i + i3] - str.charAt(i3);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static BigDecimal m26174c(String str) {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw m26172a(str);
        }
    }

    /* renamed from: d */
    public static BigDecimal m26175d(char[] cArr) {
        return m26176e(cArr, 0, cArr.length);
    }

    /* renamed from: e */
    public static BigDecimal m26176e(char[] cArr, int i, int i2) {
        try {
            return new BigDecimal(cArr, i, i2);
        } catch (NumberFormatException unused) {
            throw m26172a(new String(cArr, i, i2));
        }
    }

    /* renamed from: f */
    public static double m26177f(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* renamed from: g */
    public static int m26178g(char[] cArr, int i, int i2) {
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
            case 7:
                i3 += (cArr[i] - '0') * 1000000;
                i++;
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
            case 5:
                i3 += (cArr[i] - '0') * TransferRecord.MAXIMUM_UPLOAD_PARTS;
                i++;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
            case 2:
                return i3 + ((cArr[i] - '0') * 10);
            default:
                return i3;
        }
    }

    /* renamed from: h */
    public static long m26179h(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (m26178g(cArr, i, i3) * 1000000000) + m26178g(cArr, i + i3, 9);
    }
}
