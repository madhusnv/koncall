package tr;

import j$.time.LocalDate;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tr.e */
/* loaded from: classes3.dex */
public final class C7209e extends AbstractC7213i {

    /* renamed from: a */
    public final LocalDate f34502a;

    /* renamed from: b */
    public final LocalDate f34503b;

    public C7209e(LocalDate localDate, LocalDate localDate2) {
        this.f34502a = localDate;
        this.f34503b = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7209e)) {
            return false;
        }
        C7209e c7209e = (C7209e) obj;
        return AbstractC4154l.m8918a(this.f34502a, c7209e.f34502a) && AbstractC4154l.m8918a(this.f34503b, c7209e.f34503b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f34502a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f34503b;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateDateRange(start=" + this.f34502a + ", end=" + this.f34503b + ")";
    }
}
