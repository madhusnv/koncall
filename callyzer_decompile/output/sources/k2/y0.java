package k2;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a */
    public final String f20609a;

    public y0(String str) {
        this.f20609a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && AbstractC4154l.m8918a(this.f20609a, ((y0) obj).f20609a);
    }

    public final int hashCode() {
        return this.f20609a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("OpaqueKey(key="), this.f20609a, ')');
    }
}
