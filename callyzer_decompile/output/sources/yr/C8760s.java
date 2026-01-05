package yr;

import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.s */
/* loaded from: classes3.dex */
public final class C8760s extends AbstractC8761t {

    /* renamed from: a */
    public final C4802m f42379a;

    public C8760s(C4802m userSimDetails) {
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        this.f42379a = userSimDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8760s) && AbstractC4154l.m8918a(this.f42379a, ((C8760s) obj).f42379a);
    }

    public final int hashCode() {
        return this.f42379a.hashCode();
    }

    public final String toString() {
        return "UpdateSIMSelection(userSimDetails=" + this.f42379a + ")";
    }
}
