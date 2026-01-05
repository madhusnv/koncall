package eb;

import c9.C0908c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a */
    public final ArrayList f9337a;

    /* renamed from: b */
    public final String f9338b;

    public i2(C0908c c0908c) {
        this.f9337a = (ArrayList) c0908c.f5574b;
        this.f9338b = (String) c0908c.f5575c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i2.class != obj.getClass()) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return AbstractC4154l.m8918a(this.f9337a, i2Var.f9337a) && AbstractC4154l.m8918a(this.f9338b, i2Var.f9338b);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f9337a;
        int iHashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        String str = this.f9338b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListDevicesResponse(");
        sb2.append("devices=" + this.f9337a + ',');
        return AbstractC4801l.m9737k(new StringBuilder("paginationToken="), this.f9338b, sb2, ")");
    }
}
