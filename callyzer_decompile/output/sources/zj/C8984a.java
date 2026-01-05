package zj;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zj.a */
/* loaded from: classes.dex */
public final class C8984a {

    /* renamed from: a */
    public final String f43329a;

    /* renamed from: b */
    public final String f43330b;

    public C8984a(String str, String str2) {
        this.f43329a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f43330b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8984a) {
            C8984a c8984a = (C8984a) obj;
            if (this.f43329a.equals(c8984a.f43329a) && this.f43330b.equals(c8984a.f43330b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f43329a.hashCode() ^ 1000003) * 1000003) ^ this.f43330b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f43329a);
        sb2.append(", version=");
        return AbstractC1452a.m4564k(sb2, this.f43330b, "}");
    }
}
