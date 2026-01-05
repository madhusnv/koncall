package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends i0 {

    /* renamed from: b */
    public final String f23243b;

    public g0(String str) {
        this.f23243b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && AbstractC4154l.m8918a(this.f23243b, ((g0) obj).f23243b);
    }

    public final int hashCode() {
        return this.f23243b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f23243b, ')');
    }
}
