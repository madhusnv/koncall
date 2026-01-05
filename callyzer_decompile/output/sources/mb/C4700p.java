package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mb.p */
/* loaded from: classes.dex */
public final class C4700p extends AbstractC4701q {

    /* renamed from: b */
    public final String f23384b;

    public C4700p(String str) {
        this.f23384b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4700p) && AbstractC4154l.m8918a(this.f23384b, ((C4700p) obj).f23384b);
    }

    public final int hashCode() {
        return this.f23384b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f23384b, ')');
    }
}
