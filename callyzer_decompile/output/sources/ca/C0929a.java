package ca;

import og.la;
import sb.C6778e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.a */
/* loaded from: classes.dex */
public final class C0929a extends la {

    /* renamed from: a */
    public final C6778e f5674a;

    public C0929a(C6778e c6778e) {
        this.f5674a = c6778e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0929a) && this.f5674a.equals(((C0929a) obj).f5674a);
    }

    public final int hashCode() {
        return this.f5674a.hashCode();
    }

    public final String toString() {
        return "AccessKey(credentials=" + this.f5674a + ')';
    }
}
