package ek;

import java.util.HashSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ek.d */
/* loaded from: classes.dex */
public final class C2064d {

    /* renamed from: a */
    public final HashSet f9676a;

    public C2064d(HashSet hashSet) {
        this.f9676a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2064d) {
            return this.f9676a.equals(((C2064d) obj).f9676a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9676a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f9676a + "}";
    }
}
