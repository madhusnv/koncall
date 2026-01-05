package eb;

import cj.C0979e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a */
    public final C1978b f9289a;

    /* renamed from: b */
    public final AbstractC1991o f9290b;

    /* renamed from: c */
    public final Map f9291c;

    /* renamed from: d */
    public final String f9292d;

    /* renamed from: e */
    public final Map f9293e;

    /* renamed from: f */
    public final String f9294f;

    /* renamed from: g */
    public final l3 f9295g;

    public d2(C0979e c0979e) {
        this.f9289a = (C1978b) c0979e.f5803b;
        this.f9290b = (AbstractC1991o) c0979e.f5804c;
        this.f9291c = (Map) c0979e.f5805d;
        this.f9292d = (String) c0979e.f5802a;
        this.f9293e = (Map) c0979e.f5806e;
        this.f9294f = (String) c0979e.f5807f;
        this.f9295g = (l3) c0979e.f5808g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d2.class != obj.getClass()) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return AbstractC4154l.m8918a(this.f9289a, d2Var.f9289a) && AbstractC4154l.m8918a(this.f9290b, d2Var.f9290b) && AbstractC4154l.m8918a(this.f9291c, d2Var.f9291c) && AbstractC4154l.m8918a(this.f9292d, d2Var.f9292d) && AbstractC4154l.m8918a(this.f9293e, d2Var.f9293e) && AbstractC4154l.m8918a(this.f9294f, d2Var.f9294f) && AbstractC4154l.m8918a(this.f9295g, d2Var.f9295g);
    }

    public final int hashCode() {
        C1978b c1978b = this.f9289a;
        int iHashCode = (c1978b != null ? c1978b.hashCode() : 0) * 31;
        AbstractC1991o abstractC1991o = this.f9290b;
        int iHashCode2 = (iHashCode + (abstractC1991o != null ? abstractC1991o.hashCode() : 0)) * 31;
        Map map = this.f9291c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.f9292d;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Map map2 = this.f9293e;
        int iHashCode5 = (iHashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31;
        String str2 = this.f9294f;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        l3 l3Var = this.f9295g;
        return iHashCode6 + (l3Var != null ? l3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InitiateAuthRequest(");
        sb2.append("analyticsMetadata=" + this.f9289a + ',');
        sb2.append("authFlow=" + this.f9290b + ',');
        sb2.append("authParameters=*** Sensitive Data Redacted ***,clientId=*** Sensitive Data Redacted ***,");
        sb2.append("clientMetadata=" + this.f9293e + ',');
        sb2.append("session=*** Sensitive Data Redacted ***,userContextData=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
