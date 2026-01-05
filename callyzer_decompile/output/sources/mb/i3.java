package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i3 extends m3 {

    /* renamed from: b */
    public final String f23256b;

    public i3(String str) {
        this.f23256b = str;
    }

    @Override // mb.m3
    /* renamed from: a */
    public final String mo9580a() {
        return this.f23256b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3) && AbstractC4154l.m8918a(this.f23256b, ((i3) obj).f23256b);
    }

    public final int hashCode() {
        return this.f23256b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f23256b, ')');
    }
}
