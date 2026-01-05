package og;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class sg {

    /* renamed from: a */
    public final String f26803a;

    /* renamed from: b */
    public final int f26804b;

    public sg(String str, int i10) {
        this.f26803a = str;
        this.f26804b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj;
        return this.f26803a.equals(sgVar.f26803a) && this.f26804b == sgVar.f26804b;
    }

    public final int hashCode() {
        return ((((this.f26803a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ this.f26804b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(this.f26803a);
        sb2.append(", enableFirelog=true, firelogEventType=");
        return AbstractC5601a.m11233d(this.f26804b, "}", sb2);
    }
}
