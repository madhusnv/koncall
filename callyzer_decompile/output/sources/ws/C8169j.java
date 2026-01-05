package ws;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.j */
/* loaded from: classes3.dex */
public final class C8169j extends AbstractC8175p {

    /* renamed from: a */
    public final int f39092a;

    public C8169j(int i10) {
        this.f39092a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8169j) && this.f39092a == ((C8169j) obj).f39092a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39092a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f39092a, "SkipCorruptCall(callId=", ")");
    }
}
