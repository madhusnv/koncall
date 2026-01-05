package eb;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: a */
    public final ArrayList f9347a;

    public j3(i3 i3Var) {
        this.f9347a = i3Var.f9339a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j3.class == obj.getClass() && AbstractC4154l.m8918a(this.f9347a, ((j3) obj).f9347a);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f9347a;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateUserAttributesResponse(");
        sb2.append("codeDeliveryDetailsList=" + this.f9347a);
        sb2.append(")");
        return sb2.toString();
    }
}
