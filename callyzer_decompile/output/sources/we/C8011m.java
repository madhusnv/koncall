package we;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.m */
/* loaded from: classes.dex */
public final class C8011m extends AbstractC8021w {

    /* renamed from: a */
    public final ArrayList f38514a;

    public C8011m(ArrayList arrayList) {
        this.f38514a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8021w)) {
            return false;
        }
        return this.f38514a.equals(((C8011m) ((AbstractC8021w) obj)).f38514a);
    }

    public final int hashCode() {
        return this.f38514a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f38514a + "}";
    }
}
