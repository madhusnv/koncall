package zi;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends s1 {

    /* renamed from: a */
    public final List f43086a;

    /* renamed from: b */
    public final String f43087b;

    public g0(List list, String str) {
        this.f43086a = list;
        this.f43087b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            g0 g0Var = (g0) ((s1) obj);
            String str2 = g0Var.f43087b;
            if (this.f43086a.equals(g0Var.f43086a) && ((str = this.f43087b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f43086a.hashCode() ^ 1000003) * 1000003;
        String str = this.f43087b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f43086a);
        sb2.append(", orgId=");
        return AbstractC1452a.m4564k(sb2, this.f43087b, "}");
    }
}
