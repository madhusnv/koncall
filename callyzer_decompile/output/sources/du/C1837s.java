package du;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: du.s */
/* loaded from: classes3.dex */
public final class C1837s extends AbstractC1839u {

    /* renamed from: a */
    public final int f8815a;

    public C1837s(int i10) {
        this.f8815a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1837s) && this.f8815a == ((C1837s) obj).f8815a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8815a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f8815a, "UpdateNotePopUp(position=", ")");
    }
}
