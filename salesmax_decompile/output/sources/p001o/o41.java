package p001o;

import p001o.ok6;

/* loaded from: classes5.dex */
public final class o41 extends ok6 {

    /* renamed from: b */
    public final long f37701b;

    /* renamed from: c */
    public final int f37702c;

    /* renamed from: d */
    public final int f37703d;

    /* renamed from: e */
    public final long f37704e;

    /* renamed from: f */
    public final int f37705f;

    /* renamed from: o.o41$b */
    public static final class C15704b extends ok6.AbstractC15831a {

        /* renamed from: a */
        public Long f37706a;

        /* renamed from: b */
        public Integer f37707b;

        /* renamed from: c */
        public Integer f37708c;

        /* renamed from: d */
        public Long f37709d;

        /* renamed from: e */
        public Integer f37710e;

        @Override // p001o.ok6.AbstractC15831a
        /* renamed from: a */
        public ok6 mo41505a() {
            String str = "";
            if (this.f37706a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f37707b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f37708c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f37709d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f37710e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new o41(this.f37706a.longValue(), this.f37707b.intValue(), this.f37708c.intValue(), this.f37709d.longValue(), this.f37710e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.ok6.AbstractC15831a
        /* renamed from: b */
        public ok6.AbstractC15831a mo41506b(int i) {
            this.f37708c = Integer.valueOf(i);
            return this;
        }

        @Override // p001o.ok6.AbstractC15831a
        /* renamed from: c */
        public ok6.AbstractC15831a mo41507c(long j) {
            this.f37709d = Long.valueOf(j);
            return this;
        }

        @Override // p001o.ok6.AbstractC15831a
        /* renamed from: d */
        public ok6.AbstractC15831a mo41508d(int i) {
            this.f37707b = Integer.valueOf(i);
            return this;
        }

        @Override // p001o.ok6.AbstractC15831a
        /* renamed from: e */
        public ok6.AbstractC15831a mo41509e(int i) {
            this.f37710e = Integer.valueOf(i);
            return this;
        }

        @Override // p001o.ok6.AbstractC15831a
        /* renamed from: f */
        public ok6.AbstractC15831a mo41510f(long j) {
            this.f37706a = Long.valueOf(j);
            return this;
        }
    }

    @Override // p001o.ok6
    /* renamed from: b */
    public int mo41500b() {
        return this.f37703d;
    }

    @Override // p001o.ok6
    /* renamed from: c */
    public long mo41501c() {
        return this.f37704e;
    }

    @Override // p001o.ok6
    /* renamed from: d */
    public int mo41502d() {
        return this.f37702c;
    }

    @Override // p001o.ok6
    /* renamed from: e */
    public int mo41503e() {
        return this.f37705f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ok6)) {
            return false;
        }
        ok6 ok6Var = (ok6) obj;
        return this.f37701b == ok6Var.mo41504f() && this.f37702c == ok6Var.mo41502d() && this.f37703d == ok6Var.mo41500b() && this.f37704e == ok6Var.mo41501c() && this.f37705f == ok6Var.mo41503e();
    }

    @Override // p001o.ok6
    /* renamed from: f */
    public long mo41504f() {
        return this.f37701b;
    }

    public int hashCode() {
        long j = this.f37701b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f37702c) * 1000003) ^ this.f37703d) * 1000003;
        long j2 = this.f37704e;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f37705f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f37701b + ", loadBatchSize=" + this.f37702c + ", criticalSectionEnterTimeoutMs=" + this.f37703d + ", eventCleanUpAge=" + this.f37704e + ", maxBlobByteSizePerRow=" + this.f37705f + "}";
    }

    public o41(long j, int i, int i2, long j2, int i3) {
        this.f37701b = j;
        this.f37702c = i;
        this.f37703d = i2;
        this.f37704e = j2;
        this.f37705f = i3;
    }
}
