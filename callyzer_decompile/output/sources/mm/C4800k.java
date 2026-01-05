package mm;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.k */
/* loaded from: classes3.dex */
public final class C4800k {

    /* renamed from: a */
    public final int f23885a;

    /* renamed from: b */
    public final String f23886b;

    /* renamed from: c */
    public final String f23887c;

    /* renamed from: d */
    public final boolean f23888d;

    public C4800k(int i10, String str, String str2, boolean z6) {
        this.f23885a = i10;
        this.f23886b = str;
        this.f23887c = str2;
        this.f23888d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4800k)) {
            return false;
        }
        C4800k c4800k = (C4800k) obj;
        return this.f23885a == c4800k.f23885a && AbstractC4154l.m8918a(this.f23886b, c4800k.f23886b) && AbstractC4154l.m8918a(this.f23887c, c4800k.f23887c) && this.f23888d == c4800k.f23888d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f23885a) * 31;
        String str = this.f23886b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23887c;
        return Boolean.hashCode(this.f23888d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f23885a, "LeadStatus(id=", ", status=", this.f23886b, ", description=");
        sbM14337q.append(this.f23887c);
        sbM14337q.append(", isReminderMandatory=");
        sbM14337q.append(this.f23888d);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }
}
