package ok;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ok.a */
/* loaded from: classes.dex */
public abstract class AbstractC5397a {

    /* renamed from: a */
    public static final TimeZone f27086a = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static boolean m11119a(String str, int i10, char c2) {
        return i10 < str.length() && str.charAt(i10) == c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:41:0x00a8, B:43:0x00ae, B:48:0x00bb, B:51:0x00c6, B:62:0x00f1, B:64:0x00f7, B:90:0x01a9, B:72:0x0109, B:73:0x0124, B:74:0x0125, B:78:0x0142, B:80:0x014f, B:83:0x0158, B:85:0x0177, B:88:0x0186, B:89:0x01a8, B:77:0x0131, B:92:0x01da, B:93:0x01e1, B:55:0x00d6, B:56:0x00d9, B:50:0x00c2), top: B:104:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:41:0x00a8, B:43:0x00ae, B:48:0x00bb, B:51:0x00c6, B:62:0x00f1, B:64:0x00f7, B:90:0x01a9, B:72:0x0109, B:73:0x0124, B:74:0x0125, B:78:0x0142, B:80:0x014f, B:83:0x0158, B:85:0x0177, B:88:0x0186, B:89:0x01a8, B:77:0x0131, B:92:0x01da, B:93:0x01e1, B:55:0x00d6, B:56:0x00d9, B:50:0x00c2), top: B:104:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date m11120b(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ok.AbstractC5397a.m11120b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: c */
    public static int m11121c(int i10, int i11, String str) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}
