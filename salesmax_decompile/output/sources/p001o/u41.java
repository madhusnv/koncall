package p001o;

import p001o.j79;
import p001o.sc8;

/* loaded from: classes2.dex */
public final class u41 extends j79.AbstractC14469a {

    /* renamed from: a */
    public final lic f48305a;

    /* renamed from: b */
    public final sc8.C16803g f48306b;

    public u41(lic licVar, sc8.C16803g c16803g) {
        if (licVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f48305a = licVar;
        if (c16803g == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f48306b = c16803g;
    }

    @Override // p001o.j79.AbstractC14469a
    /* renamed from: a */
    public sc8.C16803g mo33377a() {
        return this.f48306b;
    }

    @Override // p001o.j79.AbstractC14469a
    /* renamed from: b */
    public lic mo33378b() {
        return this.f48305a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j79.AbstractC14469a)) {
            return false;
        }
        j79.AbstractC14469a abstractC14469a = (j79.AbstractC14469a) obj;
        return this.f48305a.equals(abstractC14469a.mo33378b()) && this.f48306b.equals(abstractC14469a.mo33377a());
    }

    public int hashCode() {
        return ((this.f48305a.hashCode() ^ 1000003) * 1000003) ^ this.f48306b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f48305a + ", outputFileOptions=" + this.f48306b + "}";
    }
}
