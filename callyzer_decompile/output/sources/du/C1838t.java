package du;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: du.t */
/* loaded from: classes3.dex */
public final class C1838t extends AbstractC1839u {

    /* renamed from: a */
    public final LocalDateTime f8816a;

    /* renamed from: b */
    public final LocalDateTime f8817b;

    public C1838t(LocalDateTime from, LocalDateTime to2) {
        AbstractC4154l.m8923f(from, "from");
        AbstractC4154l.m8923f(to2, "to");
        this.f8816a = from;
        this.f8817b = to2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1838t)) {
            return false;
        }
        C1838t c1838t = (C1838t) obj;
        return AbstractC4154l.m8918a(this.f8816a, c1838t.f8816a) && AbstractC4154l.m8918a(this.f8817b, c1838t.f8817b);
    }

    public final int hashCode() {
        return this.f8817b.hashCode() + (this.f8816a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateSyncDates(from=" + this.f8816a + ", to=" + this.f8817b + ")";
    }
}
