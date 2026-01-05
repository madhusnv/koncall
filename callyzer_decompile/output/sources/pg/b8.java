package pg;

import ad.C0108o;
import ad.C0109p;
import aws.sdk.kotlin.runtime.ConfigurationException;
import ja.C3617k;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import xw.C8494b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b8 {
    /* renamed from: a */
    public static final String m11547a(String str, String str2) {
        return AbstractC6663m.m12748L(AbstractC6662l.m12729s(new String[]{str, str2}), ".", null, null, null, 62);
    }

    /* renamed from: b */
    public static final C8494b m11548b(Enum[] entries) {
        AbstractC4154l.m8923f(entries, "entries");
        return new C8494b(entries);
    }

    /* renamed from: c */
    public static Boolean m11549c(C3617k c3617k, String str) {
        String strM8168a = c3617k.m8168a(str, null);
        if (strM8168a == null) {
            return null;
        }
        String lowerCase = strM8168a.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        Boolean bool = lowerCase.equals("true") ? Boolean.TRUE : lowerCase.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            return bool;
        }
        throw new ConfigurationException("Failed to parse config property " + m11547a(str, null) + " as a boolean");
    }

    /* renamed from: d */
    public static final C0109p m11550d(C3617k c3617k, String str, String str2) {
        String strM8168a = c3617k.m8168a(str, str2);
        if (strM8168a == null) {
            return null;
        }
        try {
            return C0108o.m297a(C0109p.f374i, strM8168a);
        } catch (Exception e2) {
            throw new ConfigurationException("Failed to parse config property " + m11547a(str, str2) + " as a URL", e2);
        }
    }
}
