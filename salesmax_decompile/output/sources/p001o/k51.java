package p001o;

import p001o.zdf;

/* loaded from: classes5.dex */
public final class k51 extends zdf {

    /* renamed from: a */
    public final qwh f31471a;

    /* renamed from: b */
    public final String f31472b;

    /* renamed from: c */
    public final xj6 f31473c;

    /* renamed from: d */
    public final dvh f31474d;

    /* renamed from: e */
    public final n76 f31475e;

    /* renamed from: o.k51$b */
    public static final class C14714b extends zdf.AbstractC18619a {

        /* renamed from: a */
        public qwh f31476a;

        /* renamed from: b */
        public String f31477b;

        /* renamed from: c */
        public xj6 f31478c;

        /* renamed from: d */
        public dvh f31479d;

        /* renamed from: e */
        public n76 f31480e;

        @Override // p001o.zdf.AbstractC18619a
        /* renamed from: a */
        public zdf mo35000a() {
            String str = "";
            if (this.f31476a == null) {
                str = " transportContext";
            }
            if (this.f31477b == null) {
                str = str + " transportName";
            }
            if (this.f31478c == null) {
                str = str + " event";
            }
            if (this.f31479d == null) {
                str = str + " transformer";
            }
            if (this.f31480e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new k51(this.f31476a, this.f31477b, this.f31478c, this.f31479d, this.f31480e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.zdf.AbstractC18619a
        /* renamed from: b */
        public zdf.AbstractC18619a mo35001b(n76 n76Var) {
            if (n76Var == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f31480e = n76Var;
            return this;
        }

        @Override // p001o.zdf.AbstractC18619a
        /* renamed from: c */
        public zdf.AbstractC18619a mo35002c(xj6 xj6Var) {
            if (xj6Var == null) {
                throw new NullPointerException("Null event");
            }
            this.f31478c = xj6Var;
            return this;
        }

        @Override // p001o.zdf.AbstractC18619a
        /* renamed from: d */
        public zdf.AbstractC18619a mo35003d(dvh dvhVar) {
            if (dvhVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f31479d = dvhVar;
            return this;
        }

        @Override // p001o.zdf.AbstractC18619a
        /* renamed from: e */
        public zdf.AbstractC18619a mo35004e(qwh qwhVar) {
            if (qwhVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f31476a = qwhVar;
            return this;
        }

        @Override // p001o.zdf.AbstractC18619a
        /* renamed from: f */
        public zdf.AbstractC18619a mo35005f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f31477b = str;
            return this;
        }
    }

    @Override // p001o.zdf
    /* renamed from: b */
    public n76 mo34995b() {
        return this.f31475e;
    }

    @Override // p001o.zdf
    /* renamed from: c */
    public xj6 mo34996c() {
        return this.f31473c;
    }

    @Override // p001o.zdf
    /* renamed from: e */
    public dvh mo34997e() {
        return this.f31474d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zdf)) {
            return false;
        }
        zdf zdfVar = (zdf) obj;
        return this.f31471a.equals(zdfVar.mo34998f()) && this.f31472b.equals(zdfVar.mo34999g()) && this.f31473c.equals(zdfVar.mo34996c()) && this.f31474d.equals(zdfVar.mo34997e()) && this.f31475e.equals(zdfVar.mo34995b());
    }

    @Override // p001o.zdf
    /* renamed from: f */
    public qwh mo34998f() {
        return this.f31471a;
    }

    @Override // p001o.zdf
    /* renamed from: g */
    public String mo34999g() {
        return this.f31472b;
    }

    public int hashCode() {
        return ((((((((this.f31471a.hashCode() ^ 1000003) * 1000003) ^ this.f31472b.hashCode()) * 1000003) ^ this.f31473c.hashCode()) * 1000003) ^ this.f31474d.hashCode()) * 1000003) ^ this.f31475e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f31471a + ", transportName=" + this.f31472b + ", event=" + this.f31473c + ", transformer=" + this.f31474d + ", encoding=" + this.f31475e + "}";
    }

    public k51(qwh qwhVar, String str, xj6 xj6Var, dvh dvhVar, n76 n76Var) {
        this.f31471a = qwhVar;
        this.f31472b = str;
        this.f31473c = xj6Var;
        this.f31474d = dvhVar;
        this.f31475e = n76Var;
    }
}
