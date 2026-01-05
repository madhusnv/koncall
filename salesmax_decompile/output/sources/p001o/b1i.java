package p001o;

import com.google.firebase.perf.util.Constants;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public abstract class b1i implements Cloneable {

    /* renamed from: a */
    public static final String f15461a = System.getProperty("org.mortbay.util.URI.charset", HTTP.UTF_8);

    /* renamed from: a */
    public static String m18098a(String str, String str2) {
        if (str == null || str.length() == 0) {
            return (str == null || str2 != null) ? str2 : str;
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(63);
        }
        if (iIndexOf == 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str2);
            stringBuffer.append(str);
            return stringBuffer.toString();
        }
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        StringBuffer stringBuffer2 = new StringBuffer(str.length() + str2.length() + 2);
        stringBuffer2.append(str);
        int i = iIndexOf - 1;
        if (stringBuffer2.charAt(i) == '/') {
            if (str2.startsWith("/")) {
                stringBuffer2.deleteCharAt(i);
                stringBuffer2.insert(i, str2);
            } else {
                stringBuffer2.insert(iIndexOf, str2);
            }
        } else if (str2.startsWith("/")) {
            stringBuffer2.insert(iIndexOf, str2);
        } else {
            stringBuffer2.insert(iIndexOf, '/');
            stringBuffer2.insert(iIndexOf + 1, str2);
        }
        return stringBuffer2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072 A[PHI: r8 r10
      0x0072: PHI (r8v5 int) = (r8v2 int), (r8v7 int), (r8v8 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r10v18 int) = (r10v11 int), (r10v22 int), (r10v25 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m18099b(String str) {
        int i;
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        int iLastIndexOf = str.lastIndexOf(47, length);
        while (length > 0) {
            int i2 = length - iLastIndexOf;
            if (i2 == 2) {
                if (str.charAt(iLastIndexOf + 1) == '.') {
                    break;
                }
                int i3 = iLastIndexOf;
                iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
                length = i3;
            } else {
                if (i2 == 3 && str.charAt(iLastIndexOf + 1) == '.' && str.charAt(iLastIndexOf + 2) == '.') {
                    break;
                }
                int i32 = iLastIndexOf;
                iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
                length = i32;
            }
        }
        if (iLastIndexOf >= length) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (length > 0) {
            int i7 = length - iLastIndexOf;
            if (i7 == 2) {
                int i8 = iLastIndexOf + 1;
                if (stringBuffer.charAt(i8) != '.') {
                    if (i4 > 0 && i4 - 1 == 0) {
                        i6 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                        if (i6 > 0 && i5 == stringBuffer.length() && stringBuffer.charAt(i5 - 1) == '.') {
                        }
                    }
                } else if (iLastIndexOf >= 0 || stringBuffer.length() <= 2 || stringBuffer.charAt(1) != '/' || stringBuffer.charAt(2) != '/') {
                    if (i5 < 0) {
                        i5 = length;
                    }
                    if (iLastIndexOf < 0 || (iLastIndexOf == 0 && stringBuffer.charAt(iLastIndexOf) == '/')) {
                        if (i5 < stringBuffer.length() && stringBuffer.charAt(i5) == '/') {
                            i5++;
                        }
                        i6 = i8;
                    } else {
                        i6 = length == stringBuffer.length() ? i8 : iLastIndexOf;
                        i = iLastIndexOf - 1;
                        while (i >= 0 && stringBuffer.charAt(i) != '/') {
                            i--;
                        }
                        int i9 = iLastIndexOf;
                        iLastIndexOf = i;
                        length = i9;
                    }
                }
                if (i4 <= 0) {
                }
                i = iLastIndexOf - 1;
                while (i >= 0) {
                }
                int i92 = iLastIndexOf;
                iLastIndexOf = i;
                length = i92;
            } else if (i7 != 3) {
                if (i4 > 0 && i4 - 1 == 0) {
                    i6 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i5 == stringBuffer.length() && stringBuffer.charAt(i5 - 1) == '.') {
                        i6++;
                    }
                }
                if (i4 <= 0 && i6 >= 0 && i5 >= i6) {
                    stringBuffer.delete(i6, i5);
                    if (i4 <= 0) {
                        i5 = length;
                        i6 = -1;
                    } else {
                        i5 = -1;
                        i6 = -1;
                    }
                }
                i = iLastIndexOf - 1;
                while (i >= 0 && stringBuffer.charAt(i) != '/') {
                    i--;
                }
                int i922 = iLastIndexOf;
                iLastIndexOf = i;
                length = i922;
            } else if (stringBuffer.charAt(iLastIndexOf + 1) == '.' && stringBuffer.charAt(iLastIndexOf + 2) == '.') {
                if (i5 < 0) {
                    i5 = length;
                }
                i4++;
                int i10 = iLastIndexOf - 1;
                while (i10 >= 0 && stringBuffer.charAt(i10) != '/') {
                    i10--;
                }
                i6 = iLastIndexOf;
                iLastIndexOf = i10;
                length = i6;
            } else {
                if (i4 > 0 && i4 - 1 == 0) {
                    i6 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i6 > 0 && i5 == stringBuffer.length() && stringBuffer.charAt(i5 - 1) == '.') {
                    }
                }
                if (i4 <= 0) {
                    stringBuffer.delete(i6, i5);
                    if (i4 <= 0) {
                    }
                }
                i = iLastIndexOf - 1;
                while (i >= 0) {
                    i--;
                }
                int i9222 = iLastIndexOf;
                iLastIndexOf = i;
                length = i9222;
            }
        }
        if (i4 > 0) {
            return null;
        }
        if (i5 >= 0) {
            stringBuffer.delete(i6, i5);
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static String m18100c(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2 = null;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i4 + i;
            byte bM22142d = bArr[i6];
            if (bM22142d != 37 || (i3 = i4 + 2) >= i2) {
                if (bArr2 == null) {
                    i5++;
                }
                i4++;
            } else {
                bM22142d = (byte) (czh.m22142d(bArr, i6 + 1, 2, 16) & Constants.MAX_HOST_LENGTH);
                i4 = i3;
            }
            if (bArr2 == null) {
                bArr2 = new byte[i2];
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr2[i7] = bArr[i7 + i];
                }
            }
            bArr2[i5] = bM22142d;
            i5++;
            i4++;
        }
        return bArr2 == null ? s8g.m47998e(bArr, i, i2, f15461a) : s8g.m47998e(bArr2, 0, i5, f15461a);
    }

    /* renamed from: f */
    public static boolean m18101f(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ':') {
                return true;
            }
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && (i <= 0 || !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '.' || cCharAt == '+' || cCharAt == '-')))) {
                break;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static String m18102g(String str) {
        int iLastIndexOf;
        if (str == null || "/".equals(str) || (iLastIndexOf = str.lastIndexOf(47, str.length() - 2)) < 0) {
            return null;
        }
        return str.substring(0, iLastIndexOf + 1);
    }
}
