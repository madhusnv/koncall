package pg;

import a1.C0005d;
import id.C3235e;
import id.C3241k;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class k6 {
    /* renamed from: a */
    public static String m11731a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static final void m11732b(C0005d c0005d, String str, C3235e c3235e) {
        if (c3235e != null) {
            c0005d.getClass();
            ((LinkedHashMap) c0005d.f25c).put(new C3241k("xmlns", null), "http://s3.amazonaws.com/doc/2006-03-01/");
        }
        C0005d.m0(c0005d, str);
    }
}
