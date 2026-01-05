package aa;

import cj.C0979e;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aa.d */
/* loaded from: classes.dex */
public final class C0077d {

    /* renamed from: a */
    public final C0079f f284a;

    /* renamed from: b */
    public final String f285b;

    /* renamed from: c */
    public final C0080g f286c;

    /* renamed from: d */
    public final Integer f287d;

    /* renamed from: e */
    public final String f288e;

    /* renamed from: f */
    public final String f289f;

    /* renamed from: g */
    public final String f290g;

    public C0077d(C0979e c0979e) {
        this.f284a = (C0079f) c0979e.f5803b;
        this.f285b = (String) c0979e.f5802a;
        this.f286c = (C0080g) c0979e.f5804c;
        this.f287d = (Integer) c0979e.f5805d;
        this.f288e = (String) c0979e.f5806e;
        this.f289f = (String) c0979e.f5807f;
        this.f290g = (String) c0979e.f5808g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0077d.class != obj.getClass()) {
            return false;
        }
        C0077d c0077d = (C0077d) obj;
        return AbstractC4154l.m8918a(this.f284a, c0077d.f284a) && AbstractC4154l.m8918a(this.f285b, c0077d.f285b) && AbstractC4154l.m8918a(this.f286c, c0077d.f286c) && AbstractC4154l.m8918a(this.f287d, c0077d.f287d) && AbstractC4154l.m8918a(this.f288e, c0077d.f288e) && AbstractC4154l.m8918a(this.f289f, c0077d.f289f) && AbstractC4154l.m8918a(this.f290g, c0077d.f290g);
    }

    public final int hashCode() {
        C0079f c0079f = this.f284a;
        int iHashCode = (c0079f != null ? c0079f.hashCode() : 0) * 31;
        String str = this.f285b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        C0080g c0080g = this.f286c;
        int iHashCode3 = (iHashCode2 + (c0080g != null ? c0080g.hashCode() : 0)) * 31;
        Integer num = this.f287d;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        String str2 = this.f288e;
        int iHashCode4 = (iIntValue + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f289f;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f290g;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssumeRoleWithWebIdentityResponse(");
        sb2.append("assumedRoleUser=" + this.f284a + ',');
        StringBuilder sbM7385r = m0.m7385r(new StringBuilder("audience="), this.f285b, ',', sb2, "credentials=");
        sbM7385r.append(this.f286c);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("packedPolicySize=" + this.f287d + ',');
        return AbstractC4801l.m9737k(m0.m7385r(m0.m7385r(new StringBuilder("provider="), this.f288e, ',', sb2, "sourceIdentity="), this.f289f, ',', sb2, "subjectFromWebIdentityToken="), this.f290g, sb2, ")");
    }
}
