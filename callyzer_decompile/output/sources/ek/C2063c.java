package ek;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ek.c */
/* loaded from: classes.dex */
public final class C2063c extends AbstractC2065e {

    /* renamed from: b */
    public final String f9671b;

    /* renamed from: c */
    public final String f9672c;

    /* renamed from: d */
    public final String f9673d;

    /* renamed from: e */
    public final String f9674e;

    /* renamed from: f */
    public final long f9675f;

    public C2063c(String str, String str2, String str3, String str4, long j6) {
        this.f9671b = str;
        this.f9672c = str2;
        this.f9673d = str3;
        this.f9674e = str4;
        this.f9675f = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2065e) {
            C2063c c2063c = (C2063c) ((AbstractC2065e) obj);
            if (this.f9671b.equals(c2063c.f9671b) && this.f9672c.equals(c2063c.f9672c) && this.f9673d.equals(c2063c.f9673d) && this.f9674e.equals(c2063c.f9674e) && this.f9675f == c2063c.f9675f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f9671b.hashCode() ^ 1000003) * 1000003) ^ this.f9672c.hashCode()) * 1000003) ^ this.f9673d.hashCode()) * 1000003) ^ this.f9674e.hashCode()) * 1000003;
        long j6 = this.f9675f;
        return iHashCode ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f9671b);
        sb2.append(", variantId=");
        sb2.append(this.f9672c);
        sb2.append(", parameterKey=");
        sb2.append(this.f9673d);
        sb2.append(", parameterValue=");
        sb2.append(this.f9674e);
        sb2.append(", templateVersion=");
        return AbstractC0030c.m116g(this.f9675f, "}", sb2);
    }
}
