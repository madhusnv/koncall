package zi;

import a2.AbstractC0030c;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t1 {
    /* renamed from: a */
    public static l7.k0 m16454a(TypedValue typedValue, l7.k0 k0Var, l7.k0 k0Var2, String str, String str2) throws XmlPullParserException {
        if (k0Var == null || k0Var == k0Var2) {
            return k0Var == null ? k0Var2 : k0Var;
        }
        StringBuilder sbM127r = AbstractC0030c.m127r("Type is ", str, " but found ", str2, ": ");
        sbM127r.append(typedValue.data);
        throw new XmlPullParserException(sbM127r.toString());
    }
}
