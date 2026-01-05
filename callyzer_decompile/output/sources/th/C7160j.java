package th;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: th.j */
/* loaded from: classes.dex */
public final class C7160j {

    /* renamed from: a */
    public final int f34409a;

    public C7160j(int i10) {
        this.f34409a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C7160j) && this.f34409a == ((C7160j) obj).f34409a;
    }

    public final int hashCode() {
        return ((this.f34409a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f34409a, "AppUpdateOptions{appUpdateType=", ", allowAssetPackDeletion=false}");
    }
}
