package ur;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.l */
/* loaded from: classes3.dex */
public final class C7519l extends AbstractC7523p {

    /* renamed from: a */
    public final List f36237a;

    /* renamed from: b */
    public final h0 f36238b;

    public C7519l(List position, h0 filterItemIdentificationMode) {
        AbstractC4154l.m8923f(position, "position");
        AbstractC4154l.m8923f(filterItemIdentificationMode, "filterItemIdentificationMode");
        this.f36237a = position;
        this.f36238b = filterItemIdentificationMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7519l)) {
            return false;
        }
        C7519l c7519l = (C7519l) obj;
        return AbstractC4154l.m8918a(this.f36237a, c7519l.f36237a) && this.f36238b == c7519l.f36238b;
    }

    public final int hashCode() {
        return this.f36238b.hashCode() + (this.f36237a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateMultiAllFilters(position=" + this.f36237a + ", filterItemIdentificationMode=" + this.f36238b + ")";
    }
}
