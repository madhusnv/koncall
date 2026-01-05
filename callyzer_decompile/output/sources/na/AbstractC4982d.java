package na;

import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: na.d */
/* loaded from: classes.dex */
public abstract class AbstractC4982d {

    /* renamed from: a */
    public static final Set f24718a = AbstractC6662l.m12710M(new Character[]{'!', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~'});

    /* renamed from: a */
    public static final String m9896a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == ' ') {
                sb2.append("_");
            } else if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || (('0' <= cCharAt && cCharAt < ':') || f24718a.contains(Character.valueOf(cCharAt))))) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static final String m9897b(String category, String key, String str) {
        AbstractC4154l.m8923f(category, "category");
        AbstractC4154l.m8923f(key, "key");
        if (str == null) {
            return m9896a(category) + '/' + m9896a(key);
        }
        return m9896a(category) + '/' + m9896a(key) + '#' + m9896a(str);
    }
}
