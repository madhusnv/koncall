package m9;

import cb.C0942a;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m9.a */
/* loaded from: classes.dex */
public final class C4681a {

    /* renamed from: a */
    public final String f23138a;

    /* renamed from: b */
    public final String f23139b;

    /* renamed from: c */
    public final Boolean f23140c;

    /* renamed from: d */
    public final Boolean f23141d;

    public C4681a(C0942a c0942a) {
        this.f23138a = c0942a.f5699a;
        this.f23139b = c0942a.f5700b;
        Boolean bool = c0942a.f5701c;
        if (bool == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required");
        }
        this.f23140c = bool;
        Boolean bool2 = c0942a.f5702d;
        if (bool2 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required");
        }
        this.f23141d = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4681a)) {
            return false;
        }
        C4681a c4681a = (C4681a) obj;
        return AbstractC4154l.m8918a(this.f23138a, c4681a.f23138a) && AbstractC4154l.m8918a(this.f23139b, c4681a.f23139b) && AbstractC4154l.m8918a(this.f23140c, c4681a.f23140c) && AbstractC4154l.m8918a(this.f23141d, c4681a.f23141d);
    }

    public final int hashCode() {
        String str = this.f23138a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23139b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f23140c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f23141d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SsoEndpointParameters(");
        StringBuilder sbM7384q = m0.m7384q(m0.m7385r(m0.m7385r(new StringBuilder("endpoint="), this.f23138a, ',', sb2, "region="), this.f23139b, ',', sb2, "useDualStack="), this.f23140c, ',', sb2, "useFips=");
        sbM7384q.append(this.f23141d);
        sbM7384q.append(')');
        sb2.append(sbM7384q.toString());
        return sb2.toString();
    }
}
