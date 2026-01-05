package ty;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.g */
/* loaded from: classes3.dex */
public final class C7273g {

    /* renamed from: a */
    public final String f34719a;

    /* renamed from: b */
    public final String f34720b;

    /* renamed from: c */
    public final String f34721c;

    public C7273g(String str, String str2) {
        this.f34719a = str;
        this.f34720b = str2;
        if (!str2.startsWith("/")) {
            if (str.endsWith("/")) {
                str2 = str.concat(str2);
            } else if (!str.isEmpty()) {
                str2 = m0.m7379l(str, "/", str2);
            }
        }
        if (!"/".equals(str2) && str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        this.f34721c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7273g) {
            return this.f34721c.equals(((C7273g) obj).f34721c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34721c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[parent=");
        sb2.append(this.f34719a);
        sb2.append("; name=");
        sb2.append(this.f34720b);
        sb2.append("; path=");
        return AbstractC1452a.m4564k(sb2, this.f34721c, "]");
    }
}
