package com.amplifyframework.util;

import a2.AbstractC0030c;
import com.amplifyframework.core.model.ModelIdentifier;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Wrap {
    private Wrap() {
    }

    public static String inBackticks(String str) {
        return Empty.check(str) ? str : AbstractC5601a.m11238i("`", str, "`");
    }

    public static String inBraces(String str) {
        if (str == null) {
            return null;
        }
        return AbstractC5601a.m11238i("{", str, "}");
    }

    public static String inDoubleQuotes(String str) {
        if (str == null) {
            return null;
        }
        return AbstractC5601a.m11238i(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    public static String inParentheses(String str) {
        if (str == null) {
            return null;
        }
        return AbstractC5601a.m11238i("(", str, ")");
    }

    public static String inPrettyBraces(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(" ");
        StringBuilder sbM127r = AbstractC0030c.m127r("\n", str2, str3, str, "\n");
        sbM127r.append(str2);
        sb2.append(inBraces(sbM127r.toString()));
        return sb2.toString();
    }

    public static String inSingleQuotes(String str) {
        if (str == null) {
            return null;
        }
        return AbstractC5601a.m11238i("'", str, "'");
    }
}
