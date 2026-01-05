package p001o;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a8i {
    /* renamed from: a */
    public static String m16683a(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (!(scheme != null ? !(scheme2 == null || !kp0.m35991a(scheme, scheme2)) : scheme2 == null) || !sqi.m48724c(uri.getAuthority(), uri2.getAuthority())) {
            return uri2.toString();
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = uri2.getPathSegments();
        int iMin = Math.min(pathSegments.size(), pathSegments2.size());
        int i = 0;
        for (int i2 = 0; i2 < iMin && pathSegments.get(i2).equals(pathSegments2.get(i2)); i2++) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < pathSegments.size(); i3++) {
            sb.append("../");
        }
        while (i < pathSegments2.size()) {
            sb.append(pathSegments2.get(i));
            if (i < pathSegments2.size() - 1) {
                sb.append("/");
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static int[] m16684b(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: c */
    public static boolean m16685c(String str) {
        return (str == null || m16684b(str)[0] == -1) ? false : true;
    }

    /* renamed from: d */
    public static String m16686d(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m16687e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM16684b = m16684b(str2);
        if (iArrM16684b[0] != -1) {
            sb.append(str2);
            m16686d(sb, iArrM16684b[1], iArrM16684b[2]);
            return sb.toString();
        }
        int[] iArrM16684b2 = m16684b(str);
        if (iArrM16684b[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM16684b2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM16684b[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM16684b2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrM16684b[1];
        if (i != 0) {
            int i2 = iArrM16684b2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return m16686d(sb, iArrM16684b[1] + i2, i2 + iArrM16684b[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrM16684b2[1]);
            sb.append(str2);
            int i3 = iArrM16684b2[1];
            return m16686d(sb, i3, iArrM16684b[2] + i3);
        }
        int i4 = iArrM16684b2[0] + 2;
        int i5 = iArrM16684b2[1];
        if (i4 >= i5 || i5 != iArrM16684b2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM16684b2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrM16684b2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return m16686d(sb, iArrM16684b2[1], i6 + iArrM16684b[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrM16684b2[1];
        return m16686d(sb, i7, iArrM16684b[2] + i7 + 1);
    }

    /* renamed from: f */
    public static Uri m16688f(String str, String str2) {
        return Uri.parse(m16687e(str, str2));
    }
}
