package dj;

import aj.C0161a;
import d6.C1612b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dj.a */
/* loaded from: classes.dex */
public final class C1728a {

    /* renamed from: b */
    public static final C0161a f8372b = new C0161a();

    /* renamed from: c */
    public static final String f8373c = m5427a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    public static final String f8374d = m5427a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    public static final C1612b f8375e = new C1612b(12);

    /* renamed from: a */
    public final C1731d f8376a;

    public C1728a(C1731d c1731d) {
        this.f8376a = c1731d;
    }

    /* renamed from: a */
    public static String m5427a(String str, String str2) {
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
}
