package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k2 extends l2 {

    /* renamed from: b */
    public final String f23269b;

    public k2(String str) {
        this.f23269b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2) && AbstractC4154l.m8918a(this.f23269b, ((k2) obj).f23269b);
    }

    public final int hashCode() {
        return this.f23269b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f23269b, ')');
    }
}
