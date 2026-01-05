package eb;

import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eb.b */
/* loaded from: classes.dex */
public final class C1978b {

    /* renamed from: a */
    public final String f9273a;

    public C1978b(C1977a c1977a) {
        this.f9273a = c1977a.f9268a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1978b.class == obj.getClass() && AbstractC4154l.m8918a(this.f9273a, ((C1978b) obj).f9273a);
    }

    public final int hashCode() {
        String str = this.f9273a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC4801l.m9737k(new StringBuilder("analyticsEndpointId="), this.f9273a, new StringBuilder("AnalyticsMetadataType("), ")");
    }
}
