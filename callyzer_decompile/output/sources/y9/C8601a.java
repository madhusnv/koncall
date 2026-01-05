package y9;

import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import xm.b0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y9.a */
/* loaded from: classes.dex */
public final class C8601a {

    /* renamed from: a */
    public final String f41853a;

    /* renamed from: b */
    public final String f41854b;

    /* renamed from: c */
    public final Boolean f41855c;

    /* renamed from: d */
    public final Boolean f41856d;

    /* renamed from: e */
    public final Boolean f41857e;

    public C8601a(b0 b0Var) {
        this.f41853a = (String) b0Var.f40150d;
        this.f41854b = (String) b0Var.f40151e;
        Boolean bool = (Boolean) b0Var.f40147a;
        if (bool == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required");
        }
        this.f41855c = bool;
        Boolean bool2 = (Boolean) b0Var.f40148b;
        if (bool2 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required");
        }
        this.f41856d = bool2;
        Boolean bool3 = (Boolean) b0Var.f40149c;
        if (bool3 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useGlobalEndpoint is required");
        }
        this.f41857e = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8601a)) {
            return false;
        }
        C8601a c8601a = (C8601a) obj;
        return AbstractC4154l.m8918a(this.f41853a, c8601a.f41853a) && AbstractC4154l.m8918a(this.f41854b, c8601a.f41854b) && AbstractC4154l.m8918a(this.f41855c, c8601a.f41855c) && AbstractC4154l.m8918a(this.f41856d, c8601a.f41856d) && AbstractC4154l.m8918a(this.f41857e, c8601a.f41857e);
    }

    public final int hashCode() {
        String str = this.f41853a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f41854b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f41855c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f41856d;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f41857e;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StsEndpointParameters(");
        StringBuilder sbM7384q = m0.m7384q(m0.m7384q(m0.m7385r(m0.m7385r(new StringBuilder("endpoint="), this.f41853a, ',', sb2, "region="), this.f41854b, ',', sb2, "useDualStack="), this.f41855c, ',', sb2, "useFips="), this.f41856d, ',', sb2, "useGlobalEndpoint=");
        sbM7384q.append(this.f41857e);
        sbM7384q.append(')');
        sb2.append(sbM7384q.toString());
        return sb2.toString();
    }
}
