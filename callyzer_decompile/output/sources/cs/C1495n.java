package cs;

import a2.AbstractC0030c;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.n */
/* loaded from: classes3.dex */
public final class C1495n extends AbstractC1500s {

    /* renamed from: a */
    public final LastCallDetails f7576a;

    /* renamed from: b */
    public final String f7577b;

    /* renamed from: c */
    public final int f7578c;

    public C1495n(LastCallDetails callLogDetail, String leadId, int i10) {
        AbstractC4154l.m8923f(callLogDetail, "callLogDetail");
        AbstractC4154l.m8923f(leadId, "leadId");
        this.f7576a = callLogDetail;
        this.f7577b = leadId;
        this.f7578c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1495n)) {
            return false;
        }
        C1495n c1495n = (C1495n) obj;
        return AbstractC4154l.m8918a(this.f7576a, c1495n.f7576a) && AbstractC4154l.m8918a(this.f7577b, c1495n.f7577b) && this.f7578c == c1495n.f7578c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7578c) + AbstractC0030c.m113d(this.f7576a.hashCode() * 31, 31, this.f7577b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NoteEdit(callLogDetail=");
        sb2.append(this.f7576a);
        sb2.append(", leadId=");
        sb2.append(this.f7577b);
        sb2.append(", lastEditNotePosition=");
        return AbstractC5601a.m11233d(this.f7578c, ")", sb2);
    }
}
