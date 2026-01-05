package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public abstract class tx7 {
    /* renamed from: a */
    public static final String m50746a(String str) {
        sq8.m48649h(str, "value");
        if (f9g.Z0(str).toString().length() == str.length()) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= "\",()".length()) {
                    break;
                }
                if (f9g.m26305O(str, "\",()".charAt(i), false, 2, null)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                return str;
            }
        }
        return TokenParser.DQUOTE + e9g.m24593G(e9g.m24593G(str, "\\", "\\\\", false, 4, null), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "\\\"", false, 4, null) + TokenParser.DQUOTE;
    }
}
