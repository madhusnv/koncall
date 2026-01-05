package qw;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.f */
/* loaded from: classes3.dex */
public final class C6356f implements Comparable {

    /* renamed from: b */
    public static final C6356f f30752b = new C6356f();

    /* renamed from: a */
    public final int f30753a = 131604;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6356f other = (C6356f) obj;
        AbstractC4154l.m8923f(other, "other");
        return this.f30753a - other.f30753a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C6356f c6356f = obj instanceof C6356f ? (C6356f) obj : null;
        return c6356f != null && this.f30753a == c6356f.f30753a;
    }

    public final int hashCode() {
        return this.f30753a;
    }

    public final String toString() {
        return "2.2.20";
    }
}
