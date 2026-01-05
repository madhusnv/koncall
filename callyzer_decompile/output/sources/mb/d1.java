package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 extends e1 {

    /* renamed from: b */
    public final String f23226b;

    public d1(String str) {
        this.f23226b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && AbstractC4154l.m8918a(this.f23226b, ((d1) obj).f23226b);
    }

    public final int hashCode() {
        return this.f23226b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f23226b, ')');
    }
}
