package au;

import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.p */
/* loaded from: classes3.dex */
public final class C0452p extends AbstractC0453q {

    /* renamed from: a */
    public final C4802m f3252a;

    public C0452p(C4802m simDetails) {
        AbstractC4154l.m8923f(simDetails, "simDetails");
        this.f3252a = simDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0452p) && AbstractC4154l.m8918a(this.f3252a, ((C0452p) obj).f3252a);
    }

    public final int hashCode() {
        return this.f3252a.hashCode();
    }

    public final String toString() {
        return "SelectedSIM(simDetails=" + this.f3252a + ")";
    }
}
