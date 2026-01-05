package j$.time.format;

/* loaded from: classes9.dex */
abstract class DateTimeFormatterBuilderHelper {
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String rewriteIcuDateTimePattern(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        char c = ' ';
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ') {
                if (cCharAt != 'B' && cCharAt != 'b') {
                    sb.append(cCharAt);
                }
            } else if (i == 0 || (c != 'B' && c != 'b')) {
            }
            i++;
            c = cCharAt;
        }
        int length = sb.length() - 1;
        if (length >= 0 && sb.charAt(length) == ' ') {
            sb.deleteCharAt(length);
        }
        return sb.toString();
    }

    static String transformAndroidJavaTextDateTimePattern(String str) {
        if (str == null) {
            return null;
        }
        return ((str.indexOf(66) != -1) || (str.indexOf(98) != -1)) ? rewriteIcuDateTimePattern(str) : str;
    }
}
