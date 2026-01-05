package or;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.b */
/* loaded from: classes3.dex */
public final class C5439b {

    /* renamed from: a */
    public final ArrayList f27348a;

    /* renamed from: b */
    public final String f27349b;

    public C5439b(String versionId, ArrayList arrayList) {
        AbstractC4154l.m8923f(versionId, "versionId");
        this.f27348a = arrayList;
        this.f27349b = versionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5439b)) {
            return false;
        }
        C5439b c5439b = (C5439b) obj;
        return this.f27348a.equals(c5439b.f27348a) && AbstractC4154l.m8918a(this.f27349b, c5439b.f27349b);
    }

    public final int hashCode() {
        return this.f27349b.hashCode() + (this.f27348a.hashCode() * 31);
    }

    public final String toString() {
        return "DynamicLeadFormUiModel(dynamicLeadField=" + this.f27348a + ", versionId=" + this.f27349b + ")";
    }
}
