package c0;

import q0.C6070k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.h */
/* loaded from: classes.dex */
public final class C0815h {

    /* renamed from: a */
    public final C6070k f5103a;

    public C0815h(C6070k c6070k) {
        this.f5103a = c6070k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0815h) && this.f5103a.equals(((C0815h) obj).f5103a);
    }

    public final int hashCode() {
        return this.f5103a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f5103a + "}";
    }
}
