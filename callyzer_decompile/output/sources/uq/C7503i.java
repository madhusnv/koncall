package uq;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uq.i */
/* loaded from: classes3.dex */
public final class C7503i extends AbstractC7507m {

    /* renamed from: a */
    public final int f36197a;

    public C7503i(int i10) {
        this.f36197a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7503i) && this.f36197a == ((C7503i) obj).f36197a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36197a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f36197a, "OnSelectCompareDuration(index=", ")");
    }
}
