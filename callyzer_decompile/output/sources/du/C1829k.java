package du;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: du.k */
/* loaded from: classes3.dex */
public final class C1829k extends AbstractC1839u {

    /* renamed from: a */
    public final boolean f8806a;

    public C1829k(boolean z6) {
        this.f8806a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1829k) && this.f8806a == ((C1829k) obj).f8806a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8806a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("OnReSyncDialogAction(proceed=", ")", this.f8806a);
    }
}
