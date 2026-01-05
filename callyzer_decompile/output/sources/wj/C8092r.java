package wj;

import i0.m0;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.r */
/* loaded from: classes.dex */
public final class C8092r {

    /* renamed from: d */
    public static final Pattern f38732d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f38733a;

    /* renamed from: b */
    public final String f38734b;

    /* renamed from: c */
    public final String f38735c;

    public C8092r(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !f38732d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(AbstractC5601a.m11238i("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f38733a = strSubstring;
        this.f38734b = str;
        this.f38735c = m0.m7379l(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8092r)) {
            return false;
        }
        C8092r c8092r = (C8092r) obj;
        return this.f38733a.equals(c8092r.f38733a) && this.f38734b.equals(c8092r.f38734b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38734b, this.f38733a});
    }
}
