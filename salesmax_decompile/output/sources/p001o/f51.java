package p001o;

import p001o.fjd;

/* loaded from: classes2.dex */
public final class f51 extends fjd.AbstractC13463a {

    /* renamed from: a */
    public final b36 f22689a;

    /* renamed from: b */
    public final b36 f22690b;

    /* renamed from: c */
    public final int f22691c;

    /* renamed from: d */
    public final int f22692d;

    public f51(b36 b36Var, b36 b36Var2, int i, int i2) {
        if (b36Var == null) {
            throw new NullPointerException("Null edge");
        }
        this.f22689a = b36Var;
        if (b36Var2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f22690b = b36Var2;
        this.f22691c = i;
        this.f22692d = i2;
    }

    @Override // p001o.fjd.AbstractC13463a
    /* renamed from: a */
    public b36 mo26074a() {
        return this.f22689a;
    }

    @Override // p001o.fjd.AbstractC13463a
    /* renamed from: b */
    public int mo26075b() {
        return this.f22691c;
    }

    @Override // p001o.fjd.AbstractC13463a
    /* renamed from: c */
    public int mo26076c() {
        return this.f22692d;
    }

    @Override // p001o.fjd.AbstractC13463a
    /* renamed from: d */
    public b36 mo26077d() {
        return this.f22690b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fjd.AbstractC13463a)) {
            return false;
        }
        fjd.AbstractC13463a abstractC13463a = (fjd.AbstractC13463a) obj;
        return this.f22689a.equals(abstractC13463a.mo26074a()) && this.f22690b.equals(abstractC13463a.mo26077d()) && this.f22691c == abstractC13463a.mo26075b() && this.f22692d == abstractC13463a.mo26076c();
    }

    public int hashCode() {
        return ((((((this.f22689a.hashCode() ^ 1000003) * 1000003) ^ this.f22690b.hashCode()) * 1000003) ^ this.f22691c) * 1000003) ^ this.f22692d;
    }

    public String toString() {
        return "In{edge=" + this.f22689a + ", postviewEdge=" + this.f22690b + ", inputFormat=" + this.f22691c + ", outputFormat=" + this.f22692d + "}";
    }
}
