package mb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mb.y */
/* loaded from: classes.dex */
public final class C4709y {

    /* renamed from: a */
    public final String f23541a;

    /* renamed from: b */
    public final Integer f23542b;

    public C4709y(C4708x c4708x) {
        this.f23541a = c4708x.f23520a;
        this.f23542b = c4708x.f23521b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4709y.class != obj.getClass()) {
            return false;
        }
        C4709y c4709y = (C4709y) obj;
        return AbstractC4154l.m8918a(this.f23541a, c4709y.f23541a) && AbstractC4154l.m8918a(this.f23542b, c4709y.f23542b);
    }

    public final int hashCode() {
        String str = this.f23541a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f23542b;
        return iHashCode + (num != null ? num.intValue() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompletedPart(checksumCrc32=null,checksumCrc32C=null,checksumCrc64Nvme=null,checksumSha1=null,checksumSha256=null,");
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("eTag="), this.f23541a, ',', sb2, "partNumber=");
        sbM7385r.append(this.f23542b);
        sb2.append(sbM7385r.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
