package p001o;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class y48 {

    /* renamed from: a */
    public static final Pattern f54861a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b */
    public static final Pattern f54862b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: a */
    public static String m57196a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static long m57197b(String str, String str2) throws NumberFormatException {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                ria.m46819c("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f54861a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) op0.m42515e(matcher.group(2))) - Long.parseLong((String) op0.m42515e(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            ria.m46824h("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            ria.m46819c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    /* renamed from: c */
    public static long m57198c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f54862b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) op0.m42515e(matcher.group(1)));
        }
        return -1L;
    }
}
