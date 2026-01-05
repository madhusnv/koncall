package ut;

import a2.AbstractC0030c;
import pg.f0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ut.e */
/* loaded from: classes3.dex */
public final class C7541e extends f0 {

    /* renamed from: a */
    public final boolean f36301a;

    public C7541e(boolean z6) {
        this.f36301a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7541e) && this.f36301a == ((C7541e) obj).f36301a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36301a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("SubscriptionBottomSheet(isBottomSheetVisible=", ")", this.f36301a);
    }
}
