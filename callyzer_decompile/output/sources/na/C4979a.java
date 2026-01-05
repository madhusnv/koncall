package na;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: na.a */
/* loaded from: classes.dex */
public final class C4979a {

    /* renamed from: a */
    public final String f24707a;

    /* renamed from: b */
    public final String f24708b;

    public C4979a(String str, String str2) {
        this.f24707a = str;
        this.f24708b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4979a)) {
            return false;
        }
        C4979a c4979a = (C4979a) obj;
        return AbstractC4154l.m8918a(this.f24707a, c4979a.f24707a) && AbstractC4154l.m8918a(this.f24708b, c4979a.f24708b);
    }

    public final int hashCode() {
        return this.f24708b.hashCode() + (this.f24707a.hashCode() * 31);
    }

    public final String toString() {
        String lowerCase = AbstractC5185w.m10136r(this.f24707a, " ", "-").toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        return AbstractC4982d.m9897b("api", lowerCase, this.f24708b);
    }
}
