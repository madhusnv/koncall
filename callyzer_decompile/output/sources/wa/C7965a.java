package wa;

import c9.C0914i;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wa.a */
/* loaded from: classes.dex */
public final class C7965a {

    /* renamed from: a */
    public final String f38324a;

    /* renamed from: b */
    public final String f38325b;

    /* renamed from: c */
    public final Boolean f38326c;

    /* renamed from: d */
    public final Boolean f38327d;

    public C7965a(C0914i c0914i) {
        this.f38324a = (String) c0914i.f5585a;
        this.f38325b = (String) c0914i.f5586b;
        Boolean bool = (Boolean) c0914i.f5587c;
        if (bool == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required");
        }
        this.f38326c = bool;
        Boolean bool2 = (Boolean) c0914i.f5588d;
        if (bool2 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required");
        }
        this.f38327d = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7965a)) {
            return false;
        }
        C7965a c7965a = (C7965a) obj;
        return AbstractC4154l.m8918a(this.f38324a, c7965a.f38324a) && AbstractC4154l.m8918a(this.f38325b, c7965a.f38325b) && AbstractC4154l.m8918a(this.f38326c, c7965a.f38326c) && AbstractC4154l.m8918a(this.f38327d, c7965a.f38327d);
    }

    public final int hashCode() {
        String str = this.f38324a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f38325b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f38326c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f38327d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CognitoIdentityEndpointParameters(");
        StringBuilder sbM7384q = m0.m7384q(m0.m7385r(m0.m7385r(new StringBuilder("endpoint="), this.f38324a, ',', sb2, "region="), this.f38325b, ',', sb2, "useDualStack="), this.f38326c, ',', sb2, "useFips=");
        sbM7384q.append(this.f38327d);
        sbM7384q.append(')');
        sb2.append(sbM7384q.toString());
        return sb2.toString();
    }
}
