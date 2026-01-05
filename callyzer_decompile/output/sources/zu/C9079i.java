package zu;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.i */
/* loaded from: classes3.dex */
public final class C9079i extends AbstractC9092v {

    /* renamed from: a */
    public final boolean f43611a;

    public C9079i(boolean z6) {
        this.f43611a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9079i) && this.f43611a == ((C9079i) obj).f43611a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43611a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("OnSave(isNavigateToLead=", ")", this.f43611a);
    }
}
