package mt;

import og.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mt.k */
/* loaded from: classes3.dex */
public final class C4882k extends c1 {

    /* renamed from: a */
    public final long f24396a;

    public C4882k(long j6) {
        this.f24396a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4882k) && this.f24396a == ((C4882k) obj).f24396a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24396a);
    }

    public final String toString() {
        return "UpdateImageLoadingBar(id=" + this.f24396a + ")";
    }
}
