package eb;

import a9.C0073l;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a */
    public final ArrayList f9366a;

    /* renamed from: b */
    public final C7126c f9367b;

    /* renamed from: c */
    public final String f9368c;

    /* renamed from: d */
    public final C7126c f9369d;

    /* renamed from: e */
    public final C7126c f9370e;

    public m1(C0073l c0073l) {
        this.f9366a = (ArrayList) c0073l.f264a;
        this.f9367b = (C7126c) c0073l.f265b;
        this.f9368c = (String) c0073l.f266c;
        this.f9369d = (C7126c) c0073l.f267d;
        this.f9370e = (C7126c) c0073l.f268e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m1.class != obj.getClass()) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return AbstractC4154l.m8918a(this.f9366a, m1Var.f9366a) && AbstractC4154l.m8918a(this.f9367b, m1Var.f9367b) && AbstractC4154l.m8918a(this.f9368c, m1Var.f9368c) && AbstractC4154l.m8918a(this.f9369d, m1Var.f9369d) && AbstractC4154l.m8918a(this.f9370e, m1Var.f9370e);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f9366a;
        int iHashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        C7126c c7126c = this.f9367b;
        int iHashCode2 = (iHashCode + (c7126c != null ? c7126c.f34346a.hashCode() : 0)) * 31;
        String str = this.f9368c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C7126c c7126c2 = this.f9369d;
        int iHashCode4 = (iHashCode3 + (c7126c2 != null ? c7126c2.f34346a.hashCode() : 0)) * 31;
        C7126c c7126c3 = this.f9370e;
        return iHashCode4 + (c7126c3 != null ? c7126c3.f34346a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceType(");
        sb2.append("deviceAttributes=" + this.f9366a + ',');
        sb2.append("deviceCreateDate=" + this.f9367b + ',');
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("deviceKey="), this.f9368c, ',', sb2, "deviceLastAuthenticatedDate=");
        sbM7385r.append(this.f9369d);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("deviceLastModifiedDate=" + this.f9370e);
        sb2.append(")");
        return sb2.toString();
    }
}
