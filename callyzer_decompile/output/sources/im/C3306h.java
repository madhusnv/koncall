package im;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.h */
/* loaded from: classes3.dex */
public final class C3306h implements InterfaceC3307i {

    /* renamed from: a */
    public final LinkedHashSet f17558a;

    public C3306h(LinkedHashSet linkedHashSet) {
        this.f17558a = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3306h) && this.f17558a.equals(((C3306h) obj).f17558a);
    }

    public final int hashCode() {
        return this.f17558a.hashCode();
    }

    public final String toString() {
        return "NewCallLogSyncWithCallType(callTypes=" + this.f17558a + ")";
    }
}
