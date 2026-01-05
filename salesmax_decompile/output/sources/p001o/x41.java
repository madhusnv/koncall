package p001o;

import java.util.List;
import p001o.ija;

/* loaded from: classes5.dex */
public final class x41 extends ija {

    /* renamed from: a */
    public final long f53151a;

    /* renamed from: b */
    public final long f53152b;

    /* renamed from: c */
    public final ab3 f53153c;

    /* renamed from: d */
    public final Integer f53154d;

    /* renamed from: e */
    public final String f53155e;

    /* renamed from: f */
    public final List f53156f;

    /* renamed from: g */
    public final z3e f53157g;

    /* renamed from: o.x41$b */
    public static final class C18045b extends ija.AbstractC14304a {

        /* renamed from: a */
        public Long f53158a;

        /* renamed from: b */
        public Long f53159b;

        /* renamed from: c */
        public ab3 f53160c;

        /* renamed from: d */
        public Integer f53161d;

        /* renamed from: e */
        public String f53162e;

        /* renamed from: f */
        public List f53163f;

        /* renamed from: g */
        public z3e f53164g;

        @Override // p001o.ija.AbstractC14304a
        /* renamed from: a */
        public ija mo32197a() {
            String str = "";
            if (this.f53158a == null) {
                str = " requestTimeMs";
            }
            if (this.f53159b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new x41(this.f53158a.longValue(), this.f53159b.longValue(), this.f53160c, this.f53161d, this.f53162e, this.f53163f, this.f53164g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.ija.AbstractC14304a
        /* renamed from: b */
        public ija.AbstractC14304a mo32198b(ab3 ab3Var) {
            this.f53160c = ab3Var;
            return this;
        }

        @Override // p001o.ija.AbstractC14304a
        /* renamed from: c */
        public ija.AbstractC14304a mo32199c(List list) {
            this.f53163f = list;
            return this;
        }

        @Override // p001o.ija.AbstractC14304a
        /* renamed from: d */
        public ija.AbstractC14304a mo32200d(Integer num) {
            this.f53161d = num;
            return this;
        }

        @Override // p001o.ija.AbstractC14304a
        /* renamed from: e */
        public ija.AbstractC14304a mo32201e(String str) {
            this.f53162e = str;
            return this;
        }

        @Override // p001o.ija.AbstractC14304a
        /* renamed from: f */
        public ija.AbstractC14304a mo32202f(z3e z3eVar) {
            this.f53164g = z3eVar;
            return this;
        }

        @Override // p001o.ija.AbstractC14304a
        /* renamed from: g */
        public ija.AbstractC14304a mo32203g(long j) {
            this.f53158a = Long.valueOf(j);
            return this;
        }

        @Override // p001o.ija.AbstractC14304a
        /* renamed from: h */
        public ija.AbstractC14304a mo32204h(long j) {
            this.f53159b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p001o.ija
    /* renamed from: b */
    public ab3 mo32190b() {
        return this.f53153c;
    }

    @Override // p001o.ija
    /* renamed from: c */
    public List mo32191c() {
        return this.f53156f;
    }

    @Override // p001o.ija
    /* renamed from: d */
    public Integer mo32192d() {
        return this.f53154d;
    }

    @Override // p001o.ija
    /* renamed from: e */
    public String mo32193e() {
        return this.f53155e;
    }

    public boolean equals(Object obj) {
        ab3 ab3Var;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ija)) {
            return false;
        }
        ija ijaVar = (ija) obj;
        if (this.f53151a == ijaVar.mo32195g() && this.f53152b == ijaVar.mo32196h() && ((ab3Var = this.f53153c) != null ? ab3Var.equals(ijaVar.mo32190b()) : ijaVar.mo32190b() == null) && ((num = this.f53154d) != null ? num.equals(ijaVar.mo32192d()) : ijaVar.mo32192d() == null) && ((str = this.f53155e) != null ? str.equals(ijaVar.mo32193e()) : ijaVar.mo32193e() == null) && ((list = this.f53156f) != null ? list.equals(ijaVar.mo32191c()) : ijaVar.mo32191c() == null)) {
            z3e z3eVar = this.f53157g;
            if (z3eVar == null) {
                if (ijaVar.mo32194f() == null) {
                    return true;
                }
            } else if (z3eVar.equals(ijaVar.mo32194f())) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.ija
    /* renamed from: f */
    public z3e mo32194f() {
        return this.f53157g;
    }

    @Override // p001o.ija
    /* renamed from: g */
    public long mo32195g() {
        return this.f53151a;
    }

    @Override // p001o.ija
    /* renamed from: h */
    public long mo32196h() {
        return this.f53152b;
    }

    public int hashCode() {
        long j = this.f53151a;
        long j2 = this.f53152b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ab3 ab3Var = this.f53153c;
        int iHashCode = (i ^ (ab3Var == null ? 0 : ab3Var.hashCode())) * 1000003;
        Integer num = this.f53154d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f53155e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f53156f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        z3e z3eVar = this.f53157g;
        return iHashCode4 ^ (z3eVar != null ? z3eVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f53151a + ", requestUptimeMs=" + this.f53152b + ", clientInfo=" + this.f53153c + ", logSource=" + this.f53154d + ", logSourceName=" + this.f53155e + ", logEvents=" + this.f53156f + ", qosTier=" + this.f53157g + "}";
    }

    public x41(long j, long j2, ab3 ab3Var, Integer num, String str, List list, z3e z3eVar) {
        this.f53151a = j;
        this.f53152b = j2;
        this.f53153c = ab3Var;
        this.f53154d = num;
        this.f53155e = str;
        this.f53156f = list;
        this.f53157g = z3eVar;
    }
}
