package p001o;

import p001o.ab3;

/* loaded from: classes5.dex */
public final class f41 extends ab3 {

    /* renamed from: a */
    public final ab3.EnumC12132b f22647a;

    /* renamed from: b */
    public final od0 f22648b;

    /* renamed from: o.f41$b */
    public static final class C13322b extends ab3.AbstractC12131a {

        /* renamed from: a */
        public ab3.EnumC12132b f22649a;

        /* renamed from: b */
        public od0 f22650b;

        @Override // p001o.ab3.AbstractC12131a
        /* renamed from: a */
        public ab3 mo16809a() {
            return new f41(this.f22649a, this.f22650b);
        }

        @Override // p001o.ab3.AbstractC12131a
        /* renamed from: b */
        public ab3.AbstractC12131a mo16810b(od0 od0Var) {
            this.f22650b = od0Var;
            return this;
        }

        @Override // p001o.ab3.AbstractC12131a
        /* renamed from: c */
        public ab3.AbstractC12131a mo16811c(ab3.EnumC12132b enumC12132b) {
            this.f22649a = enumC12132b;
            return this;
        }
    }

    @Override // p001o.ab3
    /* renamed from: b */
    public od0 mo16807b() {
        return this.f22648b;
    }

    @Override // p001o.ab3
    /* renamed from: c */
    public ab3.EnumC12132b mo16808c() {
        return this.f22647a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab3)) {
            return false;
        }
        ab3 ab3Var = (ab3) obj;
        ab3.EnumC12132b enumC12132b = this.f22647a;
        if (enumC12132b != null ? enumC12132b.equals(ab3Var.mo16808c()) : ab3Var.mo16808c() == null) {
            od0 od0Var = this.f22648b;
            if (od0Var == null) {
                if (ab3Var.mo16807b() == null) {
                    return true;
                }
            } else if (od0Var.equals(ab3Var.mo16807b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ab3.EnumC12132b enumC12132b = this.f22647a;
        int iHashCode = ((enumC12132b == null ? 0 : enumC12132b.hashCode()) ^ 1000003) * 1000003;
        od0 od0Var = this.f22648b;
        return iHashCode ^ (od0Var != null ? od0Var.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f22647a + ", androidClientInfo=" + this.f22648b + "}";
    }

    public f41(ab3.EnumC12132b enumC12132b, od0 od0Var) {
        this.f22647a = enumC12132b;
        this.f22648b = od0Var;
    }
}
