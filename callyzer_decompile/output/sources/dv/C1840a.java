package dv;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import og.id;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dv.a */
/* loaded from: classes3.dex */
public final class C1840a extends id {

    /* renamed from: b */
    public final LocalDateTime f8818b;

    public C1840a(LocalDateTime localDateTime) {
        this.f8818b = localDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1840a) && AbstractC4154l.m8918a(this.f8818b, ((C1840a) obj).f8818b);
    }

    public final int hashCode() {
        LocalDateTime localDateTime = this.f8818b;
        if (localDateTime == null) {
            return 0;
        }
        return localDateTime.hashCode();
    }

    public final String toString() {
        return "ChangeReminderDateTime(reminderDateTime=" + this.f8818b + ")";
    }
}
