package ur;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.g */
/* loaded from: classes3.dex */
public final class C7514g extends AbstractC7523p {

    /* renamed from: a */
    public final int f36216a;

    /* renamed from: b */
    public final h0 f36217b;

    public C7514g(int i10, h0 filterItemIdentificationMode) {
        AbstractC4154l.m8923f(filterItemIdentificationMode, "filterItemIdentificationMode");
        this.f36216a = i10;
        this.f36217b = filterItemIdentificationMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7514g)) {
            return false;
        }
        C7514g c7514g = (C7514g) obj;
        return this.f36216a == c7514g.f36216a && this.f36217b == c7514g.f36217b;
    }

    public final int hashCode() {
        return this.f36217b.hashCode() + (Integer.hashCode(this.f36216a) * 31);
    }

    public final String toString() {
        return "UpdateAllFilters(position=" + this.f36216a + ", filterItemIdentificationMode=" + this.f36217b + ")";
    }
}
