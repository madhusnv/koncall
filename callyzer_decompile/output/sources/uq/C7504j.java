package uq;

import j$.time.LocalDate;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uq.j */
/* loaded from: classes3.dex */
public final class C7504j extends AbstractC7507m {

    /* renamed from: a */
    public final boolean f36198a;

    /* renamed from: b */
    public final LocalDate f36199b;

    public C7504j(boolean z6, LocalDate localDate) {
        this.f36198a = z6;
        this.f36199b = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7504j)) {
            return false;
        }
        C7504j c7504j = (C7504j) obj;
        return this.f36198a == c7504j.f36198a && this.f36199b.equals(c7504j.f36199b);
    }

    public final int hashCode() {
        return this.f36199b.hashCode() + (Boolean.hashCode(this.f36198a) * 31);
    }

    public final String toString() {
        return "OnUpdateSelectedDate(updateStartDate=" + this.f36198a + ", newDate=" + this.f36199b + ")";
    }
}
