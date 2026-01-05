package rt;

import java.util.ArrayList;
import qm.C6245a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rt.f */
/* loaded from: classes3.dex */
public final class C6622f {

    /* renamed from: a */
    public final C6245a f31810a;

    /* renamed from: b */
    public final ArrayList f31811b;

    public C6622f(C6245a c6245a, ArrayList arrayList) {
        this.f31810a = c6245a;
        this.f31811b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6622f)) {
            return false;
        }
        C6622f c6622f = (C6622f) obj;
        return this.f31810a.equals(c6622f.f31810a) && this.f31811b.equals(c6622f.f31811b);
    }

    public final int hashCode() {
        return this.f31811b.hashCode() + (this.f31810a.hashCode() * 31);
    }

    public final String toString() {
        return "SubTemplateWithFieldsUpsert(subTemplate=" + this.f31810a + ", fields=" + this.f31811b + ")";
    }
}
