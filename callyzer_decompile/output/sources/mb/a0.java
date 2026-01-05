package mb;

import c9.C0925t;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public final C7126c f23160a;

    /* renamed from: b */
    public final String f23161b;

    /* renamed from: c */
    public final String f23162c;

    /* renamed from: d */
    public final Boolean f23163d;

    /* renamed from: e */
    public final AbstractC4697m f23164e;

    /* renamed from: f */
    public final AbstractC4701q f23165f;

    /* renamed from: g */
    public final String f23166g;

    /* renamed from: h */
    public final l2 f23167h;

    /* renamed from: i */
    public final w2 f23168i;

    /* renamed from: j */
    public final String f23169j;

    /* renamed from: k */
    public final String f23170k;

    /* renamed from: l */
    public final String f23171l;

    /* renamed from: m */
    public final String f23172m;

    /* renamed from: n */
    public final String f23173n;

    public a0(C0925t c0925t) {
        this.f23160a = (C7126c) c0925t.f5651a;
        this.f23161b = (String) c0925t.f5652b;
        this.f23162c = (String) c0925t.f5653c;
        this.f23163d = (Boolean) c0925t.f5654d;
        this.f23164e = (AbstractC4697m) c0925t.f5655e;
        this.f23165f = (AbstractC4701q) c0925t.f5656f;
        this.f23166g = (String) c0925t.f5657g;
        this.f23167h = (l2) c0925t.f5658h;
        this.f23168i = (w2) c0925t.f5659i;
        this.f23169j = (String) c0925t.f5660j;
        this.f23170k = (String) c0925t.f5661k;
        this.f23171l = (String) c0925t.f5662l;
        this.f23172m = (String) c0925t.f5663m;
        this.f23173n = (String) c0925t.f5664n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return AbstractC4154l.m8918a(this.f23160a, a0Var.f23160a) && AbstractC4154l.m8918a(this.f23161b, a0Var.f23161b) && AbstractC4154l.m8918a(this.f23162c, a0Var.f23162c) && AbstractC4154l.m8918a(this.f23163d, a0Var.f23163d) && AbstractC4154l.m8918a(this.f23164e, a0Var.f23164e) && AbstractC4154l.m8918a(this.f23165f, a0Var.f23165f) && AbstractC4154l.m8918a(this.f23166g, a0Var.f23166g) && AbstractC4154l.m8918a(this.f23167h, a0Var.f23167h) && AbstractC4154l.m8918a(this.f23168i, a0Var.f23168i) && AbstractC4154l.m8918a(this.f23169j, a0Var.f23169j) && AbstractC4154l.m8918a(this.f23170k, a0Var.f23170k) && AbstractC4154l.m8918a(this.f23171l, a0Var.f23171l) && AbstractC4154l.m8918a(this.f23172m, a0Var.f23172m) && AbstractC4154l.m8918a(this.f23173n, a0Var.f23173n);
    }

    public final int hashCode() {
        C7126c c7126c = this.f23160a;
        int iHashCode = (c7126c != null ? c7126c.f34346a.hashCode() : 0) * 31;
        String str = this.f23161b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23162c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f23163d;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        AbstractC4697m abstractC4697m = this.f23164e;
        int iHashCode5 = (iHashCode4 + (abstractC4697m != null ? abstractC4697m.hashCode() : 0)) * 31;
        AbstractC4701q abstractC4701q = this.f23165f;
        int iHashCode6 = (iHashCode5 + (abstractC4701q != null ? abstractC4701q.hashCode() : 0)) * 31;
        String str3 = this.f23166g;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        l2 l2Var = this.f23167h;
        int iHashCode8 = (iHashCode7 + (l2Var != null ? l2Var.hashCode() : 0)) * 31;
        w2 w2Var = this.f23168i;
        int iHashCode9 = (iHashCode8 + (w2Var != null ? w2Var.hashCode() : 0)) * 31;
        String str4 = this.f23169j;
        int iHashCode10 = (iHashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f23170k;
        int iHashCode11 = (iHashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f23171l;
        int iHashCode12 = (iHashCode11 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f23172m;
        int iHashCode13 = (iHashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f23173n;
        return iHashCode13 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateMultipartUploadResponse(");
        sb2.append("abortDate=" + this.f23160a + ',');
        StringBuilder sbM7384q = i0.m0.m7384q(i0.m0.m7385r(i0.m0.m7385r(new StringBuilder("abortRuleId="), this.f23161b, ',', sb2, "bucket="), this.f23162c, ',', sb2, "bucketKeyEnabled="), this.f23163d, ',', sb2, "checksumAlgorithm=");
        sbM7384q.append(this.f23164e);
        sbM7384q.append(',');
        sb2.append(sbM7384q.toString());
        sb2.append("checksumType=" + this.f23165f + ',');
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("key="), this.f23166g, ',', sb2, "requestCharged=");
        sbM7385r.append(this.f23167h);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("serverSideEncryption=" + this.f23168i + ',');
        StringBuilder sbM7385r2 = i0.m0.m7385r(new StringBuilder("sseCustomerAlgorithm="), this.f23169j, ',', sb2, "sseCustomerKeyMd5=");
        sbM7385r2.append(this.f23170k);
        sbM7385r2.append(',');
        sb2.append(sbM7385r2.toString());
        sb2.append("ssekmsEncryptionContext=*** Sensitive Data Redacted ***,ssekmsKeyId=*** Sensitive Data Redacted ***,");
        return AbstractC4801l.m9737k(new StringBuilder("uploadId="), this.f23173n, sb2, ")");
    }
}
