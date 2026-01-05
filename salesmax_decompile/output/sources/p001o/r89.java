package p001o;

/* loaded from: classes3.dex */
public abstract class r89 {
    /* renamed from: a */
    public static final String m46340a(String str) {
        boolean z;
        sq8.m48649h(str, "<this>");
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                break;
            }
            if (m46341b(str.charAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 1);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\b') {
                sb.append("\\b");
            } else if (cCharAt == '\f') {
                sb.append("\\f");
            } else if (cCharAt >= 0 && cCharAt < ' ') {
                String string = Integer.toString(cCharAt, ph2.m43651a(16));
                sq8.m48648g(string, "toString(...)");
                sb.append("\\u");
                sb.append(f9g.o0(string, 4, '0'));
            } else {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        sq8.m48648g(string2, "toString(...)");
        return string2;
    }

    /* renamed from: b */
    public static final boolean m46341b(char c) {
        if (c == '\"' || c == '\\') {
            return true;
        }
        return c >= 0 && c < ' ';
    }
}
