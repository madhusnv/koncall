package p001o;

import p001o.hc8;

/* loaded from: classes2.dex */
public final class r41 extends hc8.AbstractC13915a {

    /* renamed from: a */
    public final lic f42903a;

    /* renamed from: b */
    public final int f42904b;

    public r41(lic licVar, int i) {
        if (licVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f42903a = licVar;
        this.f42904b = i;
    }

    @Override // p001o.hc8.AbstractC13915a
    /* renamed from: a */
    public int mo30221a() {
        return this.f42904b;
    }

    @Override // p001o.hc8.AbstractC13915a
    /* renamed from: b */
    public lic mo30222b() {
        return this.f42903a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hc8.AbstractC13915a)) {
            return false;
        }
        hc8.AbstractC13915a abstractC13915a = (hc8.AbstractC13915a) obj;
        return this.f42903a.equals(abstractC13915a.mo30222b()) && this.f42904b == abstractC13915a.mo30221a();
    }

    public int hashCode() {
        return ((this.f42903a.hashCode() ^ 1000003) * 1000003) ^ this.f42904b;
    }

    public String toString() {
        return "In{packet=" + this.f42903a + ", jpegQuality=" + this.f42904b + "}";
    }
}
