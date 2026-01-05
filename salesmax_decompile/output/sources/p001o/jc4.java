package p001o;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class jc4 {

    /* renamed from: a */
    public static final jc4 f30134a = new jc4();

    /* renamed from: a */
    public static final String m33496a(String str, String str2, Charset charset) {
        sq8.m48649h(str, "username");
        sq8.m48649h(str2, "password");
        sq8.m48649h(charset, "charset");
        return "Basic " + zq1.f57497d.m59706b(str + ':' + str2, charset).mo38694a();
    }

    /* renamed from: b */
    public static /* synthetic */ String m33497b(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = sh2.f45427g;
        }
        return m33496a(str, str2, charset);
    }
}
