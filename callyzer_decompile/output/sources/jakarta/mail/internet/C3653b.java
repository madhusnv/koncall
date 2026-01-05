package jakarta.mail.internet;

import bj.C0669a;
import com.sun.mail.util.PropUtil;
import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.b */
/* loaded from: classes3.dex */
public final class C3653b {

    /* renamed from: c */
    public static final boolean f19342c = PropUtil.getBooleanSystemProperty("mail.mime.contentdisposition.strict", true);

    /* renamed from: a */
    public String f19343a;

    /* renamed from: b */
    public C3675x f19344b;

    public C3653b(String str) throws ParseException {
        C3654c c3654c = new C3654c(str);
        C0669a c0669aM8205c = c3654c.m8205c((char) 0, false);
        String str2 = c0669aM8205c.f4226c;
        int i10 = c0669aM8205c.f4225b;
        boolean z6 = f19342c;
        if (i10 == -1) {
            this.f19343a = str2;
        } else if (z6) {
            throw new ParseException(m0.m7378k("Expected disposition, got ", str2));
        }
        int i11 = c3654c.f19349d;
        String str3 = c3654c.f19346a;
        String strSubstring = i11 >= str3.length() ? null : str3.substring(c3654c.f19349d);
        if (strSubstring != null) {
            try {
                this.f19344b = new C3675x(strSubstring);
            } catch (ParseException e2) {
                if (z6) {
                    throw e2;
                }
            }
        }
    }

    public final String toString() {
        String str = this.f19343a;
        if (str == null) {
            return "";
        }
        if (this.f19344b == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(this.f19344b.m8265i(sb2.length() + 21));
        return sb2.toString();
    }
}
