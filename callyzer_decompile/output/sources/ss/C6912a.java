package ss;

import im.EnumC3310l;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.a */
/* loaded from: classes3.dex */
public final class C6912a {

    /* renamed from: a */
    public final EnumC3310l f33398a;

    public C6912a(EnumC3310l selectedSortingState) {
        AbstractC4154l.m8923f(selectedSortingState, "selectedSortingState");
        this.f33398a = selectedSortingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6912a) && this.f33398a == ((C6912a) obj).f33398a;
    }

    public final int hashCode() {
        return this.f33398a.hashCode();
    }

    public final String toString() {
        return "ContactOptionalMenuState(selectedSortingState=" + this.f33398a + ")";
    }
}
