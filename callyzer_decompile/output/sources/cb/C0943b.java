package cb;

import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cb.b */
/* loaded from: classes.dex */
public final class C0943b {

    /* renamed from: a */
    public final String f5703a;

    /* renamed from: b */
    public final String f5704b;

    /* renamed from: c */
    public final Boolean f5705c;

    /* renamed from: d */
    public final Boolean f5706d;

    public C0943b(C0942a c0942a) {
        this.f5703a = c0942a.f5699a;
        this.f5704b = c0942a.f5700b;
        Boolean bool = c0942a.f5701c;
        if (bool == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required");
        }
        this.f5705c = bool;
        Boolean bool2 = c0942a.f5702d;
        if (bool2 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required");
        }
        this.f5706d = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0943b)) {
            return false;
        }
        C0943b c0943b = (C0943b) obj;
        return AbstractC4154l.m8918a(this.f5703a, c0943b.f5703a) && AbstractC4154l.m8918a(this.f5704b, c0943b.f5704b) && AbstractC4154l.m8918a(this.f5705c, c0943b.f5705c) && AbstractC4154l.m8918a(this.f5706d, c0943b.f5706d);
    }

    public final int hashCode() {
        String str = this.f5703a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5704b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f5705c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f5706d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CognitoIdentityProviderEndpointParameters(");
        StringBuilder sbM7384q = m0.m7384q(m0.m7385r(m0.m7385r(new StringBuilder("endpoint="), this.f5703a, ',', sb2, "region="), this.f5704b, ',', sb2, "useDualStack="), this.f5705c, ',', sb2, "useFips=");
        sbM7384q.append(this.f5706d);
        sbM7384q.append(')');
        sb2.append(sbM7384q.toString());
        return sb2.toString();
    }
}
