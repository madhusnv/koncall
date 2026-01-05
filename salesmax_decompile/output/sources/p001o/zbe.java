package p001o;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zbe {

    /* renamed from: a */
    public final long f56911a;

    /* renamed from: b */
    public final long f56912b;

    /* renamed from: c */
    public final String f56913c;

    /* renamed from: d */
    public int f56914d;

    public zbe(String str, long j, long j2) {
        this.f56913c = str == null ? "" : str;
        this.f56911a = j;
        this.f56912b = j2;
    }

    /* renamed from: a */
    public zbe m59162a(zbe zbeVar, String str) {
        String strM59164c = m59164c(str);
        if (zbeVar != null && strM59164c.equals(zbeVar.m59164c(str))) {
            long j = this.f56912b;
            if (j != -1) {
                long j2 = this.f56911a;
                if (j2 + j == zbeVar.f56911a) {
                    long j3 = zbeVar.f56912b;
                    return new zbe(strM59164c, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = zbeVar.f56912b;
            if (j4 != -1) {
                long j5 = zbeVar.f56911a;
                if (j5 + j4 == this.f56911a) {
                    return new zbe(strM59164c, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri m59163b(String str) {
        return a8i.m16688f(str, this.f56913c);
    }

    /* renamed from: c */
    public String m59164c(String str) {
        return a8i.m16687e(str, this.f56913c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zbe.class != obj.getClass()) {
            return false;
        }
        zbe zbeVar = (zbe) obj;
        return this.f56911a == zbeVar.f56911a && this.f56912b == zbeVar.f56912b && this.f56913c.equals(zbeVar.f56913c);
    }

    public int hashCode() {
        if (this.f56914d == 0) {
            this.f56914d = ((((527 + ((int) this.f56911a)) * 31) + ((int) this.f56912b)) * 31) + this.f56913c.hashCode();
        }
        return this.f56914d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f56913c + ", start=" + this.f56911a + ", length=" + this.f56912b + ")";
    }
}
