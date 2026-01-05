package i0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a */
    public final boolean f16582a;

    /* renamed from: b */
    public final Set f16583b;

    /* renamed from: c */
    public final Set f16584c;

    public t1(boolean z6, HashSet hashSet, HashSet hashSet2) {
        this.f16582a = z6;
        this.f16583b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.f16584c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    /* renamed from: a */
    public final boolean m7415a(Class cls, boolean z6) {
        if (this.f16583b.contains(cls)) {
            return true;
        }
        return !this.f16584c.contains(cls) && this.f16582a && z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        t1 t1Var = (t1) obj;
        return this.f16582a == t1Var.f16582a && Objects.equals(this.f16583b, t1Var.f16583b) && Objects.equals(this.f16584c, t1Var.f16584c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f16582a), this.f16583b, this.f16584c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f16582a + ", forceEnabledQuirks=" + this.f16583b + ", forceDisabledQuirks=" + this.f16584c + '}';
    }
}
