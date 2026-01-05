package ao;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ao.d */
/* loaded from: classes3.dex */
public final class C0365d extends AbstractC0366e {

    /* renamed from: a */
    public final int f2945a;

    public C0365d(int i10) {
        this.f2945a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0365d) && this.f2945a == ((C0365d) obj).f2945a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2945a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f2945a, "ProgressUpdate(processPercentage=", ")");
    }
}
