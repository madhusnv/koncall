package du;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: du.r */
/* loaded from: classes3.dex */
public final class C1836r extends AbstractC1839u {

    /* renamed from: a */
    public final int f8814a;

    public C1836r(int i10) {
        this.f8814a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1836r) && this.f8814a == ((C1836r) obj).f8814a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8814a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f8814a, "UpdateDefaultScreen(position=", ")");
    }
}
