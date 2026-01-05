package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes6.dex */
public abstract class w89 {
    /* renamed from: a */
    public static final d89 m54053a(Number number, String str, String str2) {
        sq8.m48649h(number, "value");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "output");
        return m54056d(-1, m54064l(number, str, str2));
    }

    /* renamed from: b */
    public static final t89 m54054b(Number number, String str) {
        sq8.m48649h(number, "value");
        sq8.m48649h(str, "output");
        return new t89("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m54062j(str, 0, 1, null)));
    }

    /* renamed from: c */
    public static final t89 m54055c(uef uefVar) {
        sq8.m48649h(uefVar, "keyDescriptor");
        return new t89("Value of type '" + uefVar.mo16766h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + uefVar.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* renamed from: d */
    public static final d89 m54056d(int i, String str) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new d89(str);
    }

    /* renamed from: e */
    public static final d89 m54057e(int i, String str, CharSequence charSequence) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(charSequence, "input");
        return m54056d(i, str + "\nJSON input: " + ((Object) m54061i(charSequence, i)));
    }

    /* renamed from: f */
    public static final d89 m54058f(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "input");
        return m54056d(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) m54062j(str2, 0, 1, null)));
    }

    /* renamed from: g */
    public static final Void m54059g(a8 a8Var, String str) {
        sq8.m48649h(a8Var, "<this>");
        sq8.m48649h(str, "entity");
        a8Var.m16621w("Trailing comma before the end of JSON " + str, a8Var.f14266a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new qe9();
    }

    /* renamed from: h */
    public static /* synthetic */ Void m54060h(a8 a8Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "object";
        }
        return m54059g(a8Var, str);
    }

    /* renamed from: i */
    public static final CharSequence m54061i(CharSequence charSequence, int i) {
        sq8.m48649h(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        return (i2 <= 0 ? "" : ".....") + charSequence.subSequence(bce.m18601d(i2, 0), bce.m18604g(i3, charSequence.length())).toString() + (i3 >= charSequence.length() ? "" : ".....");
    }

    /* renamed from: j */
    public static /* synthetic */ CharSequence m54062j(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return m54061i(charSequence, i);
    }

    /* renamed from: k */
    public static final Void m54063k(a8 a8Var, Number number) {
        sq8.m48649h(a8Var, "<this>");
        sq8.m48649h(number, "result");
        a8.m16582x(a8Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new qe9();
    }

    /* renamed from: l */
    public static final String m54064l(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m54062j(str2, 0, 1, null));
    }
}
