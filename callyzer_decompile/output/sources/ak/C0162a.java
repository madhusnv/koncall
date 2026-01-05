package ak;

import java.util.HashSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ak.a */
/* loaded from: classes.dex */
public final class C0162a {

    /* renamed from: a */
    public final HashSet f500a;

    public C0162a(HashSet hashSet) {
        this.f500a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0162a) {
            return this.f500a.equals(((C0162a) obj).f500a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f500a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f500a + "}";
    }
}
