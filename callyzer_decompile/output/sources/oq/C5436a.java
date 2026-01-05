package oq;

import og.va;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oq.a */
/* loaded from: classes3.dex */
public final class C5436a extends va {

    /* renamed from: a */
    public final int f27344a;

    public C5436a(int i10) {
        this.f27344a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5436a) && this.f27344a == ((C5436a) obj).f27344a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27344a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f27344a, "OnCallLogSelected(id=", ")");
    }
}
