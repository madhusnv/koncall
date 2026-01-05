package zi;

import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 extends i2 {

    /* renamed from: a */
    public final List f43088a;

    public g1(List list) {
        this.f43088a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return this.f43088a.equals(((g1) ((i2) obj)).f43088a);
    }

    public final int hashCode() {
        return this.f43088a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC5601a.m11240k("}", new StringBuilder("RolloutsState{rolloutAssignments="), this.f43088a);
    }
}
