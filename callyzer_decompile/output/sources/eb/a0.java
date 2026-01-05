package eb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends h0 {

    /* renamed from: b */
    public final String f9269b;

    public a0(String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f9269b = value;
    }

    @Override // eb.h0
    /* renamed from: a */
    public final String mo5713a() {
        return this.f9269b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && AbstractC4154l.m8918a(this.f9269b, ((a0) obj).f9269b);
    }

    public final int hashCode() {
        return this.f9269b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f9269b, ')');
    }
}
