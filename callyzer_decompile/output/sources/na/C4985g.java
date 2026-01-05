package na;

import hq.d0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6356f;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: na.g */
/* loaded from: classes.dex */
public final class C4985g {

    /* renamed from: a */
    public final String f24722a;

    /* renamed from: b */
    public final Map f24723b;

    public C4985g(Map extras) {
        C6356f.f30752b.getClass();
        AbstractC4154l.m8923f(extras, "extras");
        this.f24722a = "2.2.20";
        this.f24723b = extras;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4985g)) {
            return false;
        }
        C4985g c4985g = (C4985g) obj;
        return AbstractC4154l.m8918a(this.f24722a, c4985g.f24722a) && AbstractC4154l.m8918a(this.f24723b, c4985g.f24723b);
    }

    public final int hashCode() {
        return this.f24723b.hashCode() + (this.f24722a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC4982d.m9897b("lang", "kotlin", this.f24722a));
        Map map = this.f24723b;
        if (!map.isEmpty()) {
            sb2.append(" " + ((Object) AbstractC6663m.m12748L(map.entrySet(), " ", null, null, new d0(26), 30)));
        }
        return sb2.toString();
    }
}
