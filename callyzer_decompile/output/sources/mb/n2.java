package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n2 extends o2 {

    /* renamed from: b */
    public final String f23361b;

    public n2(String str) {
        this.f23361b = str;
    }

    @Override // mb.o2
    /* renamed from: a */
    public final String mo9581a() {
        return this.f23361b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2) && AbstractC4154l.m8918a(this.f23361b, ((n2) obj).f23361b);
    }

    public final int hashCode() {
        return this.f23361b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f23361b, ')');
    }
}
