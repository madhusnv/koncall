package rv;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.o */
/* loaded from: classes3.dex */
public final class C6639o extends AbstractC6650z {

    /* renamed from: a */
    public final int f31857a;

    public C6639o(int i10) {
        this.f31857a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6639o) && this.f31857a == ((C6639o) obj).f31857a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31857a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f31857a, "RegistrationMode(index=", ")");
    }
}
