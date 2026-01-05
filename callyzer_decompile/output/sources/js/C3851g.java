package js;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: js.g */
/* loaded from: classes3.dex */
public final class C3851g {

    /* renamed from: a */
    public final int f19835a;

    /* renamed from: b */
    public final ArrayList f19836b;

    public C3851g(int i10, ArrayList arrayList) {
        this.f19835a = i10;
        this.f19836b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3851g)) {
            return false;
        }
        C3851g c3851g = (C3851g) obj;
        return this.f19835a == c3851g.f19835a && this.f19836b.equals(c3851g.f19836b);
    }

    public final int hashCode() {
        return this.f19836b.hashCode() + (Integer.hashCode(this.f19835a) * 31);
    }

    public final String toString() {
        return "LeadUIModel(totalLead=" + this.f19835a + ", leadList=" + this.f19836b + ")";
    }
}
