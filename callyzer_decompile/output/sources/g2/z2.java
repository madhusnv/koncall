package g2;

import h2.AbstractC2812q;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a */
    public final LinkedHashMap f13355a = new LinkedHashMap();

    /* renamed from: a */
    public final String m6349a(Long l9, Locale locale, boolean z6) {
        if (l9 == null) {
            return null;
        }
        return AbstractC2812q.m6915g(l9.longValue(), z6 ? "yMMMMEEEEd" : "yMMMd", locale, this.f13355a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof z2;
    }

    public final int hashCode() {
        return 436998964;
    }
}
