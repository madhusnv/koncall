package yi;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yi.b */
/* loaded from: classes.dex */
public final class C8673b extends AbstractC8685n {

    /* renamed from: b */
    public final String f42003b;

    /* renamed from: c */
    public final String f42004c;

    /* renamed from: d */
    public final String f42005d;

    /* renamed from: e */
    public final String f42006e;

    /* renamed from: f */
    public final long f42007f;

    public C8673b(String str, String str2, String str3, String str4, long j6) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f42003b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f42004c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f42005d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f42006e = str4;
        this.f42007f = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8685n) {
            C8673b c8673b = (C8673b) ((AbstractC8685n) obj);
            if (this.f42003b.equals(c8673b.f42003b) && this.f42004c.equals(c8673b.f42004c) && this.f42005d.equals(c8673b.f42005d) && this.f42006e.equals(c8673b.f42006e) && this.f42007f == c8673b.f42007f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f42003b.hashCode() ^ 1000003) * 1000003) ^ this.f42004c.hashCode()) * 1000003) ^ this.f42005d.hashCode()) * 1000003) ^ this.f42006e.hashCode()) * 1000003;
        long j6 = this.f42007f;
        return iHashCode ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f42003b);
        sb2.append(", parameterKey=");
        sb2.append(this.f42004c);
        sb2.append(", parameterValue=");
        sb2.append(this.f42005d);
        sb2.append(", variantId=");
        sb2.append(this.f42006e);
        sb2.append(", templateVersion=");
        return AbstractC0030c.m116g(this.f42007f, "}", sb2);
    }
}
