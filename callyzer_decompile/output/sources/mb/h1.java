package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 extends i1 {

    /* renamed from: b */
    public final String f23249b;

    public h1(String str) {
        this.f23249b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && AbstractC4154l.m8918a(this.f23249b, ((h1) obj).f23249b);
    }

    public final int hashCode() {
        return this.f23249b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f23249b, ')');
    }
}
