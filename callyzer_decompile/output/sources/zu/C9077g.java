package zu;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.g */
/* loaded from: classes3.dex */
public final class C9077g extends AbstractC9092v {

    /* renamed from: a */
    public final int f43609a;

    public C9077g(int i10) {
        this.f43609a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9077g) && this.f43609a == ((C9077g) obj).f43609a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43609a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f43609a, "OnCallTypeChange(index=", ")");
    }
}
