package p001o;

import p001o.kcb;

/* loaded from: classes6.dex */
public final class z41 extends kcb {

    /* renamed from: a */
    public final kcb.EnumC14783b f56477a;

    /* renamed from: b */
    public final long f56478b;

    /* renamed from: c */
    public final long f56479c;

    /* renamed from: d */
    public final long f56480d;

    /* renamed from: o.z41$b */
    public static final class C18550b extends kcb.AbstractC14782a {

        /* renamed from: a */
        public kcb.EnumC14783b f56481a;

        /* renamed from: b */
        public Long f56482b;

        /* renamed from: c */
        public Long f56483c;

        /* renamed from: d */
        public Long f56484d;

        @Override // p001o.kcb.AbstractC14782a
        /* renamed from: a */
        public kcb mo35405a() {
            String str = "";
            if (this.f56481a == null) {
                str = " type";
            }
            if (this.f56482b == null) {
                str = str + " messageId";
            }
            if (this.f56483c == null) {
                str = str + " uncompressedMessageSize";
            }
            if (this.f56484d == null) {
                str = str + " compressedMessageSize";
            }
            if (str.isEmpty()) {
                return new z41(this.f56481a, this.f56482b.longValue(), this.f56483c.longValue(), this.f56484d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.kcb.AbstractC14782a
        /* renamed from: b */
        public kcb.AbstractC14782a mo35406b(long j) {
            this.f56484d = Long.valueOf(j);
            return this;
        }

        @Override // p001o.kcb.AbstractC14782a
        /* renamed from: c */
        public kcb.AbstractC14782a mo35407c(long j) {
            this.f56482b = Long.valueOf(j);
            return this;
        }

        @Override // p001o.kcb.AbstractC14782a
        /* renamed from: d */
        public kcb.AbstractC14782a mo35408d(long j) {
            this.f56483c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public kcb.AbstractC14782a m58682e(kcb.EnumC14783b enumC14783b) {
            if (enumC14783b == null) {
                throw new NullPointerException("Null type");
            }
            this.f56481a = enumC14783b;
            return this;
        }
    }

    @Override // p001o.kcb
    /* renamed from: b */
    public long mo35401b() {
        return this.f56480d;
    }

    @Override // p001o.kcb
    /* renamed from: c */
    public long mo35402c() {
        return this.f56478b;
    }

    @Override // p001o.kcb
    /* renamed from: d */
    public kcb.EnumC14783b mo35403d() {
        return this.f56477a;
    }

    @Override // p001o.kcb
    /* renamed from: e */
    public long mo35404e() {
        return this.f56479c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kcb)) {
            return false;
        }
        kcb kcbVar = (kcb) obj;
        return this.f56477a.equals(kcbVar.mo35403d()) && this.f56478b == kcbVar.mo35402c() && this.f56479c == kcbVar.mo35404e() && this.f56480d == kcbVar.mo35401b();
    }

    public int hashCode() {
        long jHashCode = (this.f56477a.hashCode() ^ 1000003) * 1000003;
        long j = this.f56478b;
        long j2 = ((int) (jHashCode ^ (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f56479c;
        long j4 = this.f56480d;
        return (int) ((((int) (j2 ^ (j3 ^ (j3 >>> 32)))) * 1000003) ^ (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "MessageEvent{type=" + this.f56477a + ", messageId=" + this.f56478b + ", uncompressedMessageSize=" + this.f56479c + ", compressedMessageSize=" + this.f56480d + "}";
    }

    public z41(kcb.EnumC14783b enumC14783b, long j, long j2, long j3) {
        this.f56477a = enumC14783b;
        this.f56478b = j;
        this.f56479c = j2;
        this.f56480d = j3;
    }
}
