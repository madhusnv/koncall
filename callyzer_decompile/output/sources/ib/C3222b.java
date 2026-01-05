package ib;

import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ib.b */
/* loaded from: classes.dex */
public final class C3222b {

    /* renamed from: a */
    public final Boolean f17374a;

    /* renamed from: b */
    public final String f17375b;

    /* renamed from: c */
    public final Boolean f17376c;

    /* renamed from: d */
    public final Boolean f17377d;

    /* renamed from: e */
    public final String f17378e;

    /* renamed from: f */
    public final Boolean f17379f;

    /* renamed from: g */
    public final String f17380g;

    /* renamed from: h */
    public final String f17381h;

    /* renamed from: i */
    public final String f17382i;

    /* renamed from: j */
    public final Boolean f17383j;

    /* renamed from: k */
    public final Boolean f17384k;

    /* renamed from: l */
    public final Boolean f17385l;

    /* renamed from: m */
    public final Boolean f17386m;

    /* renamed from: n */
    public final Boolean f17387n;

    /* renamed from: o */
    public final Boolean f17388o;

    public C3222b(C3221a c3221a) {
        Boolean bool = c3221a.f17359a;
        if (bool == null) {
            throw new IllegalArgumentException("endpoint provider parameter #accelerate is required");
        }
        this.f17374a = bool;
        this.f17375b = c3221a.f17360b;
        Boolean bool2 = c3221a.f17361c;
        if (bool2 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #disableMultiRegionAccessPoints is required");
        }
        this.f17376c = bool2;
        this.f17377d = c3221a.f17362d;
        this.f17378e = c3221a.f17363e;
        Boolean bool3 = c3221a.f17364f;
        if (bool3 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #forcePathStyle is required");
        }
        this.f17379f = bool3;
        this.f17380g = c3221a.f17365g;
        this.f17381h = c3221a.f17366h;
        this.f17382i = c3221a.f17367i;
        this.f17383j = c3221a.f17368j;
        Boolean bool4 = c3221a.f17369k;
        if (bool4 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required");
        }
        this.f17384k = bool4;
        Boolean bool5 = c3221a.f17370l;
        if (bool5 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required");
        }
        this.f17385l = bool5;
        Boolean bool6 = c3221a.f17371m;
        if (bool6 == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useGlobalEndpoint is required");
        }
        this.f17386m = bool6;
        this.f17387n = c3221a.f17372n;
        this.f17388o = c3221a.f17373o;
    }

    /* renamed from: a */
    public final Boolean m7567a() {
        return this.f17374a;
    }

    /* renamed from: b */
    public final String m7568b() {
        return this.f17375b;
    }

    /* renamed from: c */
    public final Boolean m7569c() {
        return this.f17376c;
    }

    /* renamed from: d */
    public final Boolean m7570d() {
        return this.f17377d;
    }

    /* renamed from: e */
    public final String m7571e() {
        return this.f17378e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3222b)) {
            return false;
        }
        C3222b c3222b = (C3222b) obj;
        return AbstractC4154l.m8918a(this.f17374a, c3222b.f17374a) && AbstractC4154l.m8918a(this.f17375b, c3222b.f17375b) && AbstractC4154l.m8918a(this.f17376c, c3222b.f17376c) && AbstractC4154l.m8918a(this.f17377d, c3222b.f17377d) && AbstractC4154l.m8918a(this.f17378e, c3222b.f17378e) && AbstractC4154l.m8918a(this.f17379f, c3222b.f17379f) && AbstractC4154l.m8918a(this.f17380g, c3222b.f17380g) && AbstractC4154l.m8918a(this.f17381h, c3222b.f17381h) && AbstractC4154l.m8918a(this.f17382i, c3222b.f17382i) && AbstractC4154l.m8918a(this.f17383j, c3222b.f17383j) && AbstractC4154l.m8918a(this.f17384k, c3222b.f17384k) && AbstractC4154l.m8918a(this.f17385l, c3222b.f17385l) && AbstractC4154l.m8918a(this.f17386m, c3222b.f17386m) && AbstractC4154l.m8918a(this.f17387n, c3222b.f17387n) && AbstractC4154l.m8918a(this.f17388o, c3222b.f17388o);
    }

    /* renamed from: f */
    public final String m7572f() {
        return this.f17382i;
    }

    /* renamed from: g */
    public final Boolean m7573g() {
        return this.f17383j;
    }

    /* renamed from: h */
    public final Boolean m7574h() {
        return this.f17384k;
    }

    public final int hashCode() {
        Boolean bool = this.f17374a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f17375b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 29791;
        Boolean bool2 = this.f17376c;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f17377d;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str2 = this.f17378e;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool4 = this.f17379f;
        int iHashCode6 = (iHashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        String str3 = this.f17380g;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f17381h;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f17382i;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool5 = this.f17383j;
        int iHashCode10 = (iHashCode9 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.f17384k;
        int iHashCode11 = (iHashCode10 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Boolean bool7 = this.f17385l;
        int iHashCode12 = (iHashCode11 + (bool7 != null ? bool7.hashCode() : 0)) * 31;
        Boolean bool8 = this.f17386m;
        int iHashCode13 = (iHashCode12 + (bool8 != null ? bool8.hashCode() : 0)) * 31;
        Boolean bool9 = this.f17387n;
        int iHashCode14 = (iHashCode13 + (bool9 != null ? bool9.hashCode() : 0)) * 31;
        Boolean bool10 = this.f17388o;
        return iHashCode14 + (bool10 != null ? bool10.hashCode() : 0);
    }

    /* renamed from: i */
    public final Boolean m7575i() {
        return this.f17385l;
    }

    /* renamed from: j */
    public final Boolean m7576j() {
        return this.f17386m;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("S3EndpointParameters(");
        StringBuilder sbM7384q = m0.m7384q(new StringBuilder("accelerate="), this.f17374a, ',', sb2, "bucket=");
        sbM7384q.append(this.f17375b);
        sbM7384q.append(',');
        sb2.append(sbM7384q.toString());
        sb2.append("copySource=null,disableAccessPoints=null,");
        StringBuilder sbM7384q2 = m0.m7384q(m0.m7384q(m0.m7384q(m0.m7384q(m0.m7384q(m0.m7385r(m0.m7385r(m0.m7385r(m0.m7384q(m0.m7385r(m0.m7384q(m0.m7384q(new StringBuilder("disableMultiRegionAccessPoints="), this.f17376c, ',', sb2, "disableS3ExpressSessionAuth="), this.f17377d, ',', sb2, "endpoint="), this.f17378e, ',', sb2, "forcePathStyle="), this.f17379f, ',', sb2, "key="), this.f17380g, ',', sb2, "prefix="), this.f17381h, ',', sb2, "region="), this.f17382i, ',', sb2, "useArnRegion="), this.f17383j, ',', sb2, "useDualStack="), this.f17384k, ',', sb2, "useFips="), this.f17385l, ',', sb2, "useGlobalEndpoint="), this.f17386m, ',', sb2, "useObjectLambdaEndpoint="), this.f17387n, ',', sb2, "useS3ExpressControlEndpoint=");
        sbM7384q2.append(this.f17388o);
        sbM7384q2.append(')');
        sb2.append(sbM7384q2.toString());
        return sb2.toString();
    }
}
