package yr;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.g */
/* loaded from: classes3.dex */
public final class C8748g extends AbstractC8761t {

    /* renamed from: a */
    public final LocalDateTime f42362a;

    public C8748g(LocalDateTime localDateTime) {
        this.f42362a = localDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8748g) && AbstractC4154l.m8918a(this.f42362a, ((C8748g) obj).f42362a);
    }

    public final int hashCode() {
        return this.f42362a.hashCode();
    }

    public final String toString() {
        return "ChangeReminderDateTime(selectedDateTimeLocal=" + this.f42362a + ")";
    }
}
