package kb;

import ox.C5774e;
import sb.C6778e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kb.e */
/* loaded from: classes.dex */
public final class C4041e {

    /* renamed from: a */
    public final C6778e f20877a;

    /* renamed from: b */
    public final C5774e f20878b;

    public C4041e(C6778e c6778e, C5774e c5774e) {
        this.f20877a = c6778e;
        this.f20878b = c5774e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4041e)) {
            return false;
        }
        C4041e c4041e = (C4041e) obj;
        return this.f20877a.equals(c4041e.f20877a) && this.f20878b.equals(c4041e.f20878b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f20878b.f28340a) + (this.f20877a.hashCode() * 31);
    }

    public final String toString() {
        return "ExpiringValue(value=" + this.f20877a + ", expiresAt=" + this.f20878b + ')';
    }
}
