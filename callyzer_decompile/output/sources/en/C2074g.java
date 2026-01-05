package en;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5415q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: en.g */
/* loaded from: classes3.dex */
public final class C2074g {

    /* renamed from: a */
    public final C5415q f9694a;

    /* renamed from: b */
    public final boolean f9695b;

    /* renamed from: c */
    public final boolean f9696c;

    /* renamed from: d */
    public final List f9697d;

    public C2074g(C5415q c5415q, boolean z6, boolean z10, List leadNumberDetails) {
        AbstractC4154l.m8923f(leadNumberDetails, "leadNumberDetails");
        this.f9694a = c5415q;
        this.f9695b = z6;
        this.f9696c = z10;
        this.f9697d = leadNumberDetails;
    }

    /* renamed from: a */
    public static C2074g m5791a(C2074g c2074g, C5415q c5415q, boolean z6, boolean z10, List leadNumberDetails, int i10) {
        if ((i10 & 1) != 0) {
            c5415q = c2074g.f9694a;
        }
        if ((i10 & 2) != 0) {
            z6 = c2074g.f9695b;
        }
        if ((i10 & 4) != 0) {
            z10 = c2074g.f9696c;
        }
        if ((i10 & 8) != 0) {
            leadNumberDetails = c2074g.f9697d;
        }
        c2074g.getClass();
        AbstractC4154l.m8923f(leadNumberDetails, "leadNumberDetails");
        return new C2074g(c5415q, z6, z10, leadNumberDetails);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2074g)) {
            return false;
        }
        C2074g c2074g = (C2074g) obj;
        return AbstractC4154l.m8918a(this.f9694a, c2074g.f9694a) && this.f9695b == c2074g.f9695b && this.f9696c == c2074g.f9696c && AbstractC4154l.m8918a(this.f9697d, c2074g.f9697d);
    }

    public final int hashCode() {
        C5415q c5415q = this.f9694a;
        return this.f9697d.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e((c5415q == null ? 0 : c5415q.hashCode()) * 31, 31, this.f9695b), 31, this.f9696c);
    }

    public final String toString() {
        return "SessionNotePopupState(notePopUpCallLogDetail=" + this.f9694a + ", isLeadNumberApiCalling=" + this.f9695b + ", isShowRetryButton=" + this.f9696c + ", leadNumberDetails=" + this.f9697d + ")";
    }
}
