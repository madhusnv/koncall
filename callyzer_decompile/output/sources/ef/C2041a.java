package ef;

import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ef.a */
/* loaded from: classes.dex */
public final class C2041a {

    /* renamed from: f */
    public static final C2041a f9607f = new C2041a(10485760, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 10000, 604800000, 81920);

    /* renamed from: a */
    public final long f9608a;

    /* renamed from: b */
    public final int f9609b;

    /* renamed from: c */
    public final int f9610c;

    /* renamed from: d */
    public final long f9611d;

    /* renamed from: e */
    public final int f9612e;

    public C2041a(long j6, int i10, int i11, long j10, int i12) {
        this.f9608a = j6;
        this.f9609b = i10;
        this.f9610c = i11;
        this.f9611d = j10;
        this.f9612e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2041a) {
            C2041a c2041a = (C2041a) obj;
            if (this.f9608a == c2041a.f9608a && this.f9609b == c2041a.f9609b && this.f9610c == c2041a.f9610c && this.f9611d == c2041a.f9611d && this.f9612e == c2041a.f9612e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f9608a;
        int i10 = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f9609b) * 1000003) ^ this.f9610c) * 1000003;
        long j10 = this.f9611d;
        return ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f9612e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f9608a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f9609b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f9610c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f9611d);
        sb2.append(", maxBlobByteSizePerRow=");
        return AbstractC5601a.m11233d(this.f9612e, "}", sb2);
    }
}
