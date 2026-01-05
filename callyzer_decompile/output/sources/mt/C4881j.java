package mt;

import og.c1;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mt.j */
/* loaded from: classes3.dex */
public final class C4881j extends c1 {

    /* renamed from: a */
    public final int f24395a;

    public C4881j(int i10) {
        this.f24395a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4881j) && this.f24395a == ((C4881j) obj).f24395a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24395a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f24395a, "UpdateExpendStatus(id=", ")");
    }
}
