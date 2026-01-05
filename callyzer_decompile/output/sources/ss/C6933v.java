package ss;

import im.EnumC3310l;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.v */
/* loaded from: classes3.dex */
public final class C6933v extends a0 {

    /* renamed from: a */
    public final EnumC3310l f33506a;

    public C6933v(EnumC3310l contactSortingState) {
        AbstractC4154l.m8923f(contactSortingState, "contactSortingState");
        this.f33506a = contactSortingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6933v) && this.f33506a == ((C6933v) obj).f33506a;
    }

    public final int hashCode() {
        return this.f33506a.hashCode();
    }

    public final String toString() {
        return "SelectListType(contactSortingState=" + this.f33506a + ")";
    }
}
