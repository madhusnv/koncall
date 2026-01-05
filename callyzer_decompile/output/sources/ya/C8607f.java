package ya;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ya.f */
/* loaded from: classes.dex */
public final class C8607f {

    /* renamed from: a */
    public final String f41870a;

    /* renamed from: b */
    public final Map f41871b;

    public C8607f(C8606e c8606e) {
        this.f41870a = c8606e.f41868a;
        this.f41871b = c8606e.f41869b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8607f.class != obj.getClass()) {
            return false;
        }
        C8607f c8607f = (C8607f) obj;
        return AbstractC4154l.m8918a(this.f41870a, c8607f.f41870a) && AbstractC4154l.m8918a(this.f41871b, c8607f.f41871b);
    }

    public final int hashCode() {
        String str = this.f41870a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f41871b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetIdRequest(accountId=null,");
        sb2.append("identityPoolId=" + this.f41870a + ',');
        sb2.append("logins=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
