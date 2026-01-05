package ud;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.j */
/* loaded from: classes.dex */
public final class C7406j {

    /* renamed from: a */
    public final EnumC7408l f35195a;

    /* renamed from: b */
    public final String f35196b;

    public C7406j(EnumC7408l family, String str) {
        AbstractC4154l.m8923f(family, "family");
        this.f35195a = family;
        this.f35196b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7406j)) {
            return false;
        }
        C7406j c7406j = (C7406j) obj;
        return this.f35195a == c7406j.f35195a && AbstractC4154l.m8918a(this.f35196b, c7406j.f35196b);
    }

    public final int hashCode() {
        int iHashCode = this.f35195a.hashCode() * 31;
        String str = this.f35196b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem(family=");
        sb2.append(this.f35195a);
        sb2.append(", version=");
        return AbstractC0030c.m123n(sb2, this.f35196b, ')');
    }
}
