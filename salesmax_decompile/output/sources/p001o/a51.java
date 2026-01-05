package p001o;

import p001o.ltb;

/* loaded from: classes5.dex */
public final class a51 extends ltb {

    /* renamed from: a */
    public final ltb.EnumC15152c f14136a;

    /* renamed from: b */
    public final ltb.EnumC15151b f14137b;

    /* renamed from: o.a51$b */
    public static final class C12084b extends ltb.AbstractC15150a {

        /* renamed from: a */
        public ltb.EnumC15152c f14138a;

        /* renamed from: b */
        public ltb.EnumC15151b f14139b;

        @Override // p001o.ltb.AbstractC15150a
        /* renamed from: a */
        public ltb mo16421a() {
            return new a51(this.f14138a, this.f14139b);
        }

        @Override // p001o.ltb.AbstractC15150a
        /* renamed from: b */
        public ltb.AbstractC15150a mo16422b(ltb.EnumC15151b enumC15151b) {
            this.f14139b = enumC15151b;
            return this;
        }

        @Override // p001o.ltb.AbstractC15150a
        /* renamed from: c */
        public ltb.AbstractC15150a mo16423c(ltb.EnumC15152c enumC15152c) {
            this.f14138a = enumC15152c;
            return this;
        }
    }

    @Override // p001o.ltb
    /* renamed from: b */
    public ltb.EnumC15151b mo16419b() {
        return this.f14137b;
    }

    @Override // p001o.ltb
    /* renamed from: c */
    public ltb.EnumC15152c mo16420c() {
        return this.f14136a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ltb)) {
            return false;
        }
        ltb ltbVar = (ltb) obj;
        ltb.EnumC15152c enumC15152c = this.f14136a;
        if (enumC15152c != null ? enumC15152c.equals(ltbVar.mo16420c()) : ltbVar.mo16420c() == null) {
            ltb.EnumC15151b enumC15151b = this.f14137b;
            if (enumC15151b == null) {
                if (ltbVar.mo16419b() == null) {
                    return true;
                }
            } else if (enumC15151b.equals(ltbVar.mo16419b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ltb.EnumC15152c enumC15152c = this.f14136a;
        int iHashCode = ((enumC15152c == null ? 0 : enumC15152c.hashCode()) ^ 1000003) * 1000003;
        ltb.EnumC15151b enumC15151b = this.f14137b;
        return iHashCode ^ (enumC15151b != null ? enumC15151b.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f14136a + ", mobileSubtype=" + this.f14137b + "}";
    }

    public a51(ltb.EnumC15152c enumC15152c, ltb.EnumC15151b enumC15151b) {
        this.f14136a = enumC15152c;
        this.f14137b = enumC15151b;
    }
}
