package ma;

import i0.m0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import nx.C5176n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ma.b */
/* loaded from: classes.dex */
public final class C4683b {

    /* renamed from: a */
    public final String f23147a;

    /* renamed from: b */
    public final Map f23148b;

    /* renamed from: c */
    public final C5176n f23149c;

    /* renamed from: d */
    public final C4684c f23150d;

    public C4683b(String str, Map map, C5176n c5176n, C4684c c4684c) {
        this.f23147a = str;
        this.f23148b = map;
        this.f23149c = c5176n;
        this.f23150d = c4684c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4683b)) {
            return false;
        }
        C4683b c4683b = (C4683b) obj;
        return AbstractC4154l.m8918a(this.f23147a, c4683b.f23147a) && AbstractC4154l.m8918a(this.f23148b, c4683b.f23148b) && AbstractC4154l.m8918a(this.f23149c, c4683b.f23149c) && AbstractC4154l.m8918a(this.f23150d, c4683b.f23150d);
    }

    public final int hashCode() {
        return this.f23150d.hashCode() + ((this.f23149c.hashCode() + m0.m7369b(this.f23147a.hashCode() * 31, 31, this.f23148b)) * 31);
    }

    public final String toString() {
        return "Partition(id=" + this.f23147a + ", regions=" + this.f23148b + ", regionRegex=" + this.f23149c + ", baseConfig=" + this.f23150d + ')';
    }
}
