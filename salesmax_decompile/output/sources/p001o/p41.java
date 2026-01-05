package p001o;

import p001o.av7;

/* loaded from: classes2.dex */
public final class p41 extends av7 {

    /* renamed from: a */
    public final String f39292a;

    /* renamed from: b */
    public final String f39293b;

    /* renamed from: c */
    public final String f39294c;

    /* renamed from: d */
    public final String f39295d;

    /* renamed from: o.p41$b */
    public static final class C15955b extends av7.AbstractC12255a {

        /* renamed from: a */
        public String f39296a;

        /* renamed from: b */
        public String f39297b;

        /* renamed from: c */
        public String f39298c;

        /* renamed from: d */
        public String f39299d;

        @Override // p001o.av7.AbstractC12255a
        /* renamed from: a */
        public av7 mo17870a() {
            String str = "";
            if (this.f39296a == null) {
                str = " glVersion";
            }
            if (this.f39297b == null) {
                str = str + " eglVersion";
            }
            if (this.f39298c == null) {
                str = str + " glExtensions";
            }
            if (this.f39299d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new p41(this.f39296a, this.f39297b, this.f39298c, this.f39299d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.av7.AbstractC12255a
        /* renamed from: b */
        public av7.AbstractC12255a mo17871b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f39299d = str;
            return this;
        }

        @Override // p001o.av7.AbstractC12255a
        /* renamed from: c */
        public av7.AbstractC12255a mo17872c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f39297b = str;
            return this;
        }

        @Override // p001o.av7.AbstractC12255a
        /* renamed from: d */
        public av7.AbstractC12255a mo17873d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f39298c = str;
            return this;
        }

        @Override // p001o.av7.AbstractC12255a
        /* renamed from: e */
        public av7.AbstractC12255a mo17874e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f39296a = str;
            return this;
        }
    }

    @Override // p001o.av7
    /* renamed from: b */
    public String mo17866b() {
        return this.f39295d;
    }

    @Override // p001o.av7
    /* renamed from: c */
    public String mo17867c() {
        return this.f39293b;
    }

    @Override // p001o.av7
    /* renamed from: d */
    public String mo17868d() {
        return this.f39294c;
    }

    @Override // p001o.av7
    /* renamed from: e */
    public String mo17869e() {
        return this.f39292a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av7)) {
            return false;
        }
        av7 av7Var = (av7) obj;
        return this.f39292a.equals(av7Var.mo17869e()) && this.f39293b.equals(av7Var.mo17867c()) && this.f39294c.equals(av7Var.mo17868d()) && this.f39295d.equals(av7Var.mo17866b());
    }

    public int hashCode() {
        return ((((((this.f39292a.hashCode() ^ 1000003) * 1000003) ^ this.f39293b.hashCode()) * 1000003) ^ this.f39294c.hashCode()) * 1000003) ^ this.f39295d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f39292a + ", eglVersion=" + this.f39293b + ", glExtensions=" + this.f39294c + ", eglExtensions=" + this.f39295d + "}";
    }

    public p41(String str, String str2, String str3, String str4) {
        this.f39292a = str;
        this.f39293b = str2;
        this.f39294c = str3;
        this.f39295d = str4;
    }
}
