package r0;

import java.util.ArrayList;
import q0.C6069j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r0.b */
/* loaded from: classes.dex */
public final class C6411b {

    /* renamed from: a */
    public final C6069j f30921a;

    /* renamed from: b */
    public final C6069j f30922b;

    /* renamed from: c */
    public final ArrayList f30923c;

    public C6411b(C6069j c6069j, C6069j c6069j2, ArrayList arrayList) {
        if (c6069j == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f30921a = c6069j;
        if (c6069j2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f30922b = c6069j2;
        this.f30923c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6411b)) {
            return false;
        }
        C6411b c6411b = (C6411b) obj;
        return this.f30921a.equals(c6411b.f30921a) && this.f30922b.equals(c6411b.f30922b) && this.f30923c.equals(c6411b.f30923c);
    }

    public final int hashCode() {
        return ((((this.f30921a.hashCode() ^ 1000003) * 1000003) ^ this.f30922b.hashCode()) * 1000003) ^ this.f30923c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f30921a + ", secondarySurfaceEdge=" + this.f30922b + ", outConfigs=" + this.f30923c + "}";
    }
}
