package yr;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.z */
/* loaded from: classes3.dex */
public final class C8767z extends a0 {

    /* renamed from: a */
    public final int f42385a;

    public C8767z(int i10) {
        this.f42385a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8767z) && this.f42385a == ((C8767z) obj).f42385a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42385a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f42385a, "UpdateTempEmployee(index=", ")");
    }
}
