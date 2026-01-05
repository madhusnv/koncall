package ur;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.m */
/* loaded from: classes3.dex */
public final class C7520m extends AbstractC7523p {

    /* renamed from: a */
    public final List f36240a;

    /* renamed from: b */
    public final h0 f36241b;

    public C7520m(List position, h0 filterItemIdentificationMode) {
        AbstractC4154l.m8923f(position, "position");
        AbstractC4154l.m8923f(filterItemIdentificationMode, "filterItemIdentificationMode");
        this.f36240a = position;
        this.f36241b = filterItemIdentificationMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7520m)) {
            return false;
        }
        C7520m c7520m = (C7520m) obj;
        return AbstractC4154l.m8918a(this.f36240a, c7520m.f36240a) && this.f36241b == c7520m.f36241b;
    }

    public final int hashCode() {
        return this.f36241b.hashCode() + (this.f36240a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateMultiFilterSelection(position=" + this.f36240a + ", filterItemIdentificationMode=" + this.f36241b + ")";
    }
}
