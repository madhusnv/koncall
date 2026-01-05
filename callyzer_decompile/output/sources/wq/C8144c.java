package wq;

import j$.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import vq.EnumC7729a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wq.c */
/* loaded from: classes3.dex */
public final class C8144c {

    /* renamed from: a */
    public final List f39017a;

    /* renamed from: b */
    public final EnumC7729a f39018b;

    /* renamed from: c */
    public final LocalDate f39019c;

    /* renamed from: d */
    public final LocalDate f39020d;

    public C8144c(List list, EnumC7729a selectedDurationForCompare, LocalDate localDate, LocalDate localDate2) {
        AbstractC4154l.m8923f(selectedDurationForCompare, "selectedDurationForCompare");
        this.f39017a = list;
        this.f39018b = selectedDurationForCompare;
        this.f39019c = localDate;
        this.f39020d = localDate2;
    }

    /* renamed from: a */
    public static C8144c m15321a(C8144c c8144c, EnumC7729a selectedDurationForCompare, LocalDate localDate, LocalDate localDate2, int i10) {
        List list = c8144c.f39017a;
        if ((i10 & 2) != 0) {
            selectedDurationForCompare = c8144c.f39018b;
        }
        if ((i10 & 4) != 0) {
            localDate = c8144c.f39019c;
        }
        if ((i10 & 8) != 0) {
            localDate2 = c8144c.f39020d;
        }
        c8144c.getClass();
        AbstractC4154l.m8923f(selectedDurationForCompare, "selectedDurationForCompare");
        return new C8144c(list, selectedDurationForCompare, localDate, localDate2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8144c)) {
            return false;
        }
        C8144c c8144c = (C8144c) obj;
        return AbstractC4154l.m8918a(this.f39017a, c8144c.f39017a) && this.f39018b == c8144c.f39018b && AbstractC4154l.m8918a(this.f39019c, c8144c.f39019c) && AbstractC4154l.m8918a(this.f39020d, c8144c.f39020d);
    }

    public final int hashCode() {
        return this.f39020d.hashCode() + ((this.f39019c.hashCode() + ((this.f39018b.hashCode() + (this.f39017a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DurationFilterState(durationSelectionSet=" + this.f39017a + ", selectedDurationForCompare=" + this.f39018b + ", customStartDate=" + this.f39019c + ", customEndDate=" + this.f39020d + ")";
    }
}
