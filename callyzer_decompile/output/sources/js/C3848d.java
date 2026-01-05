package js;

import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: js.d */
/* loaded from: classes3.dex */
public final class C3848d extends AbstractC3849e {

    /* renamed from: a */
    public final LastCallDetails f19809a;

    /* renamed from: b */
    public final String f19810b;

    public C3848d(LastCallDetails callDetail, String leadId) {
        AbstractC4154l.m8923f(callDetail, "callDetail");
        AbstractC4154l.m8923f(leadId, "leadId");
        this.f19809a = callDetail;
        this.f19810b = leadId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3848d)) {
            return false;
        }
        C3848d c3848d = (C3848d) obj;
        return AbstractC4154l.m8918a(this.f19809a, c3848d.f19809a) && AbstractC4154l.m8918a(this.f19810b, c3848d.f19810b);
    }

    public final int hashCode() {
        return this.f19810b.hashCode() + (this.f19809a.hashCode() * 31);
    }

    public final String toString() {
        return "Note(callDetail=" + this.f19809a + ", leadId=" + this.f19810b + ")";
    }
}
