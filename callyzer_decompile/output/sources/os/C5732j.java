package os;

import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: os.j */
/* loaded from: classes3.dex */
public final class C5732j {

    /* renamed from: a */
    public final int f28256a;

    /* renamed from: b */
    public final LastCallDetails f28257b;

    public C5732j(int i10, LastCallDetails lastCallDetails) {
        this.f28256a = i10;
        this.f28257b = lastCallDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5732j)) {
            return false;
        }
        C5732j c5732j = (C5732j) obj;
        return this.f28256a == c5732j.f28256a && AbstractC4154l.m8918a(this.f28257b, c5732j.f28257b);
    }

    public final int hashCode() {
        return this.f28257b.hashCode() + (Integer.hashCode(this.f28256a) * 31);
    }

    public final String toString() {
        return "NoteParam(id=" + this.f28256a + ", callLog=" + this.f28257b + ")";
    }
}
