package p001o;

import java.util.Map;
import p001o.ak6;

/* loaded from: classes5.dex */
public final class n41 extends ak6 {

    /* renamed from: a */
    public final String f36332a;

    /* renamed from: b */
    public final Integer f36333b;

    /* renamed from: c */
    public final d76 f36334c;

    /* renamed from: d */
    public final long f36335d;

    /* renamed from: e */
    public final long f36336e;

    /* renamed from: f */
    public final Map f36337f;

    /* renamed from: o.n41$b */
    public static final class C15485b extends ak6.AbstractC12211a {

        /* renamed from: a */
        public String f36338a;

        /* renamed from: b */
        public Integer f36339b;

        /* renamed from: c */
        public d76 f36340c;

        /* renamed from: d */
        public Long f36341d;

        /* renamed from: e */
        public Long f36342e;

        /* renamed from: f */
        public Map f36343f;

        @Override // p001o.ak6.AbstractC12211a
        /* renamed from: d */
        public ak6 mo17321d() {
            String str = "";
            if (this.f36338a == null) {
                str = " transportName";
            }
            if (this.f36340c == null) {
                str = str + " encodedPayload";
            }
            if (this.f36341d == null) {
                str = str + " eventMillis";
            }
            if (this.f36342e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f36343f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new n41(this.f36338a, this.f36339b, this.f36340c, this.f36341d.longValue(), this.f36342e.longValue(), this.f36343f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.ak6.AbstractC12211a
        /* renamed from: e */
        public Map mo17322e() {
            Map map = this.f36343f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p001o.ak6.AbstractC12211a
        /* renamed from: f */
        public ak6.AbstractC12211a mo17323f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f36343f = map;
            return this;
        }

        @Override // p001o.ak6.AbstractC12211a
        /* renamed from: g */
        public ak6.AbstractC12211a mo17324g(Integer num) {
            this.f36339b = num;
            return this;
        }

        @Override // p001o.ak6.AbstractC12211a
        /* renamed from: h */
        public ak6.AbstractC12211a mo17325h(d76 d76Var) {
            if (d76Var == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f36340c = d76Var;
            return this;
        }

        @Override // p001o.ak6.AbstractC12211a
        /* renamed from: i */
        public ak6.AbstractC12211a mo17326i(long j) {
            this.f36341d = Long.valueOf(j);
            return this;
        }

        @Override // p001o.ak6.AbstractC12211a
        /* renamed from: j */
        public ak6.AbstractC12211a mo17327j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f36338a = str;
            return this;
        }

        @Override // p001o.ak6.AbstractC12211a
        /* renamed from: k */
        public ak6.AbstractC12211a mo17328k(long j) {
            this.f36342e = Long.valueOf(j);
            return this;
        }
    }

    @Override // p001o.ak6
    /* renamed from: c */
    public Map mo17308c() {
        return this.f36337f;
    }

    @Override // p001o.ak6
    /* renamed from: d */
    public Integer mo17309d() {
        return this.f36333b;
    }

    @Override // p001o.ak6
    /* renamed from: e */
    public d76 mo17310e() {
        return this.f36334c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ak6)) {
            return false;
        }
        ak6 ak6Var = (ak6) obj;
        return this.f36332a.equals(ak6Var.mo17315j()) && ((num = this.f36333b) != null ? num.equals(ak6Var.mo17309d()) : ak6Var.mo17309d() == null) && this.f36334c.equals(ak6Var.mo17310e()) && this.f36335d == ak6Var.mo17311f() && this.f36336e == ak6Var.mo17316k() && this.f36337f.equals(ak6Var.mo17308c());
    }

    @Override // p001o.ak6
    /* renamed from: f */
    public long mo17311f() {
        return this.f36335d;
    }

    public int hashCode() {
        int iHashCode = (this.f36332a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f36333b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f36334c.hashCode()) * 1000003;
        long j = this.f36335d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f36336e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f36337f.hashCode();
    }

    @Override // p001o.ak6
    /* renamed from: j */
    public String mo17315j() {
        return this.f36332a;
    }

    @Override // p001o.ak6
    /* renamed from: k */
    public long mo17316k() {
        return this.f36336e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f36332a + ", code=" + this.f36333b + ", encodedPayload=" + this.f36334c + ", eventMillis=" + this.f36335d + ", uptimeMillis=" + this.f36336e + ", autoMetadata=" + this.f36337f + "}";
    }

    public n41(String str, Integer num, d76 d76Var, long j, long j2, Map map) {
        this.f36332a = str;
        this.f36333b = num;
        this.f36334c = d76Var;
        this.f36335d = j;
        this.f36336e = j2;
        this.f36337f = map;
    }
}
