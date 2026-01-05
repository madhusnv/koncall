package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eb.h */
/* loaded from: classes.dex */
public final class C1984h {

    /* renamed from: a */
    public final String f9321a;

    /* renamed from: b */
    public final String f9322b;

    public C1984h(C1983g c1983g) {
        String str = c1983g.f9316a;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for name");
        }
        this.f9321a = str;
        this.f9322b = c1983g.f9317b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1984h.class != obj.getClass()) {
            return false;
        }
        C1984h c1984h = (C1984h) obj;
        return AbstractC4154l.m8918a(this.f9321a, c1984h.f9321a) && AbstractC4154l.m8918a(this.f9322b, c1984h.f9322b);
    }

    public final int hashCode() {
        int iHashCode = this.f9321a.hashCode() * 31;
        String str = this.f9322b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttributeType(");
        sb2.append("name=" + this.f9321a + ',');
        sb2.append("value=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
