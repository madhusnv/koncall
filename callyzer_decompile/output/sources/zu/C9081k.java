package zu;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.k */
/* loaded from: classes3.dex */
public final class C9081k extends AbstractC9092v {

    /* renamed from: a */
    public final int f43613a;

    public C9081k(int i10) {
        this.f43613a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9081k) && this.f43613a == ((C9081k) obj).f43613a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43613a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f43613a, "OnSimChange(index=", ")");
    }
}
