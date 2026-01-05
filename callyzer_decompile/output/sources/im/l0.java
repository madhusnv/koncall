package im;

import com.websoptimization.callyzerbiz.data.model.response.lead.Leads;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l0 extends m0 {

    /* renamed from: a */
    public final Leads f17565a;

    public l0(Leads leads) {
        this.f17565a = leads;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && AbstractC4154l.m8918a(this.f17565a, ((l0) obj).f17565a);
    }

    public final int hashCode() {
        return this.f17565a.hashCode();
    }

    public final String toString() {
        return "UpdateLead(leads=" + this.f17565a + ")";
    }
}
