package a5;

import a2.AbstractC0030c;
import com.amplifyframework.core.model.ModelIdentifier;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a5.a */
/* loaded from: classes.dex */
public final class C0052a {

    /* renamed from: a */
    public String f214a;

    /* renamed from: b */
    public int f215b;

    /* renamed from: c */
    public int f216c;

    /* renamed from: d */
    public float f217d;

    /* renamed from: a */
    public static String m157a(int i10) {
        return ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + ("00000000" + Integer.toHexString(i10)).substring(r2.length() - 8);
    }

    public final String toString() {
        String strM123n = AbstractC0030c.m123n(new StringBuilder(), this.f214a, ':');
        switch (this.f215b) {
            case 900:
                StringBuilder sbM4568o = AbstractC1452a.m4568o(strM123n);
                sbM4568o.append(this.f216c);
                return sbM4568o.toString();
            case 901:
                StringBuilder sbM4568o2 = AbstractC1452a.m4568o(strM123n);
                sbM4568o2.append(this.f217d);
                return sbM4568o2.toString();
            case 902:
                StringBuilder sbM4568o3 = AbstractC1452a.m4568o(strM123n);
                sbM4568o3.append(m157a(this.f216c));
                return sbM4568o3.toString();
            case 903:
                return AbstractC1452a.m4561h(strM123n, null);
            default:
                return AbstractC1452a.m4561h(strM123n, "????");
        }
    }
}
