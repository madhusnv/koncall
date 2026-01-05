package mt;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mt.i */
/* loaded from: classes3.dex */
public final class C4880i extends c1 {

    /* renamed from: a */
    public final Map f24393a;

    /* renamed from: b */
    public final boolean f24394b;

    public C4880i(Map map, boolean z6) {
        this.f24393a = map;
        this.f24394b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4880i)) {
            return false;
        }
        C4880i c4880i = (C4880i) obj;
        return AbstractC4154l.m8918a(this.f24393a, c4880i.f24393a) && this.f24394b == c4880i.f24394b;
    }

    public final int hashCode() {
        Map map = this.f24393a;
        return Boolean.hashCode(this.f24394b) + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "SetDynamicValues(map=" + this.f24393a + ", isSet=" + this.f24394b + ")";
    }
}
