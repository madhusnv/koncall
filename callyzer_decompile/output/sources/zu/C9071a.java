package zu;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.a */
/* loaded from: classes3.dex */
public final class C9071a extends AbstractC9092v {

    /* renamed from: a */
    public final LocalDateTime f43603a;

    public C9071a(LocalDateTime localDateTime) {
        this.f43603a = localDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9071a) && AbstractC4154l.m8918a(this.f43603a, ((C9071a) obj).f43603a);
    }

    public final int hashCode() {
        LocalDateTime localDateTime = this.f43603a;
        if (localDateTime == null) {
            return 0;
        }
        return localDateTime.hashCode();
    }

    public final String toString() {
        return "ChangeReminderDateTime(reminderDateTime=" + this.f43603a + ")";
    }
}
