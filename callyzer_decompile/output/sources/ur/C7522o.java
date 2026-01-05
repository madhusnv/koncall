package ur;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.o */
/* loaded from: classes3.dex */
public final class C7522o extends AbstractC7523p {

    /* renamed from: a */
    public final int f36247a;

    public C7522o(int i10) {
        this.f36247a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7522o) && this.f36247a == ((C7522o) obj).f36247a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36247a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f36247a, "UpdateSortingSelection(position=", ")");
    }
}
