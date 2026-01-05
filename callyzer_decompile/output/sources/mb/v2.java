package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v2 extends w2 {

    /* renamed from: b */
    public final String f23503b;

    public v2(String str) {
        this.f23503b = str;
    }

    @Override // mb.w2
    /* renamed from: a */
    public final String mo9583a() {
        return this.f23503b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2) && AbstractC4154l.m8918a(this.f23503b, ((v2) obj).f23503b);
    }

    public final int hashCode() {
        return this.f23503b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f23503b, ')');
    }
}
