package p001o;

import java.util.Set;
import p001o.e5f;

/* loaded from: classes5.dex */
public final class j51 extends e5f.AbstractC13103b {

    /* renamed from: a */
    public final long f29788a;

    /* renamed from: b */
    public final long f29789b;

    /* renamed from: c */
    public final Set f29790c;

    /* renamed from: o.j51$b */
    public static final class C14450b extends e5f.AbstractC13103b.a {

        /* renamed from: a */
        public Long f29791a;

        /* renamed from: b */
        public Long f29792b;

        /* renamed from: c */
        public Set f29793c;

        @Override // p001o.e5f.AbstractC13103b.a
        /* renamed from: a */
        public e5f.AbstractC13103b mo24334a() {
            String str = "";
            if (this.f29791a == null) {
                str = " delta";
            }
            if (this.f29792b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f29793c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new j51(this.f29791a.longValue(), this.f29792b.longValue(), this.f29793c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.e5f.AbstractC13103b.a
        /* renamed from: b */
        public e5f.AbstractC13103b.a mo24335b(long j) {
            this.f29791a = Long.valueOf(j);
            return this;
        }

        @Override // p001o.e5f.AbstractC13103b.a
        /* renamed from: c */
        public e5f.AbstractC13103b.a mo24336c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f29793c = set;
            return this;
        }

        @Override // p001o.e5f.AbstractC13103b.a
        /* renamed from: d */
        public e5f.AbstractC13103b.a mo24337d(long j) {
            this.f29792b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p001o.e5f.AbstractC13103b
    /* renamed from: b */
    public long mo24331b() {
        return this.f29788a;
    }

    @Override // p001o.e5f.AbstractC13103b
    /* renamed from: c */
    public Set mo24332c() {
        return this.f29790c;
    }

    @Override // p001o.e5f.AbstractC13103b
    /* renamed from: d */
    public long mo24333d() {
        return this.f29789b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e5f.AbstractC13103b)) {
            return false;
        }
        e5f.AbstractC13103b abstractC13103b = (e5f.AbstractC13103b) obj;
        return this.f29788a == abstractC13103b.mo24331b() && this.f29789b == abstractC13103b.mo24333d() && this.f29790c.equals(abstractC13103b.mo24332c());
    }

    public int hashCode() {
        long j = this.f29788a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f29789b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f29790c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f29788a + ", maxAllowedDelay=" + this.f29789b + ", flags=" + this.f29790c + "}";
    }

    public j51(long j, long j2, Set set) {
        this.f29788a = j;
        this.f29789b = j2;
        this.f29790c = set;
    }
}
