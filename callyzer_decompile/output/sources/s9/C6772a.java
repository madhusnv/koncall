package s9;

import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s9.a */
/* loaded from: classes.dex */
public final class C6772a {

    /* renamed from: a */
    public final String f32226a;

    /* renamed from: b */
    public final String f32227b;

    /* renamed from: c */
    public final Boolean f32228c;

    /* renamed from: d */
    public final Boolean f32229d;

    public C6772a(C8090p c8090p) {
        this.f32226a = (String) c8090p.f38723a;
        this.f32227b = (String) c8090p.f38726d;
        Boolean bool = (Boolean) c8090p.f38724b;
        if (bool == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required");
        }
        this.f32228c = bool;
        Boolean bool2 = (Boolean) c8090p.f38725c;
        if (bool2 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required");
        }
        this.f32229d = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6772a)) {
            return false;
        }
        C6772a c6772a = (C6772a) obj;
        return AbstractC4154l.m8918a(this.f32226a, c6772a.f32226a) && AbstractC4154l.m8918a(this.f32227b, c6772a.f32227b) && AbstractC4154l.m8918a(this.f32228c, c6772a.f32228c) && AbstractC4154l.m8918a(this.f32229d, c6772a.f32229d);
    }

    public final int hashCode() {
        String str = this.f32226a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32227b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f32228c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f32229d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SsoOidcEndpointParameters(");
        StringBuilder sbM7384q = m0.m7384q(m0.m7385r(m0.m7385r(new StringBuilder("endpoint="), this.f32226a, ',', sb2, "region="), this.f32227b, ',', sb2, "useDualStack="), this.f32228c, ',', sb2, "useFips=");
        sbM7384q.append(this.f32229d);
        sbM7384q.append(')');
        sb2.append(sbM7384q.toString());
        return sb2.toString();
    }
}
