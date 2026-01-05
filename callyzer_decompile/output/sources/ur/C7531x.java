package ur;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.x */
/* loaded from: classes3.dex */
public final class C7531x {

    /* renamed from: a */
    public final List f36273a;

    /* renamed from: b */
    public final List f36274b;

    public C7531x(List list, List list2) {
        this.f36273a = list;
        this.f36274b = list2;
    }

    /* renamed from: a */
    public static C7531x m14296a(C7531x c7531x, List selectedIndex, int i10) {
        List list = c7531x.f36273a;
        if ((i10 & 2) != 0) {
            selectedIndex = c7531x.f36274b;
        }
        c7531x.getClass();
        AbstractC4154l.m8923f(selectedIndex, "selectedIndex");
        return new C7531x(list, selectedIndex);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7531x)) {
            return false;
        }
        C7531x c7531x = (C7531x) obj;
        return AbstractC4154l.m8918a(this.f36273a, c7531x.f36273a) && AbstractC4154l.m8918a(this.f36274b, c7531x.f36274b);
    }

    public final int hashCode() {
        return this.f36274b.hashCode() + (this.f36273a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonMultiFilters(filtersOptionsData=" + this.f36273a + ", selectedIndex=" + this.f36274b + ")";
    }
}
