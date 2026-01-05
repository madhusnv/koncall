package eb;

import a1.C0005d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: a */
    public final String f9326a;

    /* renamed from: b */
    public final Map f9327b;

    /* renamed from: c */
    public final ArrayList f9328c;

    public h3(C0005d c0005d) {
        this.f9326a = (String) c0005d.f25c;
        this.f9327b = (Map) c0005d.f26d;
        this.f9328c = (ArrayList) c0005d.f24b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h3.class != obj.getClass()) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return AbstractC4154l.m8918a(this.f9326a, h3Var.f9326a) && AbstractC4154l.m8918a(this.f9327b, h3Var.f9327b) && AbstractC4154l.m8918a(this.f9328c, h3Var.f9328c);
    }

    public final int hashCode() {
        String str = this.f9326a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f9327b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        ArrayList arrayList = this.f9328c;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateUserAttributesRequest(accessToken=*** Sensitive Data Redacted ***,");
        sb2.append("clientMetadata=" + this.f9327b + ',');
        StringBuilder sb3 = new StringBuilder("userAttributes=");
        sb3.append(this.f9328c);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
