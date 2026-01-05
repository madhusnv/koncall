package p001o;

/* loaded from: classes3.dex */
public final class bd9 {

    /* renamed from: e */
    public static final C12358b f15959e = new C12358b(null);

    /* renamed from: a */
    public final Integer f15960a;

    /* renamed from: b */
    public final Integer f15961b;

    /* renamed from: c */
    public final Float f15962c;

    /* renamed from: d */
    public final String f15963d;

    /* renamed from: o.bd9$a */
    public static final class C12357a {

        /* renamed from: a */
        public Integer f15964a;

        /* renamed from: b */
        public Integer f15965b;

        /* renamed from: c */
        public Float f15966c;

        /* renamed from: d */
        public String f15967d;

        /* renamed from: a */
        public final bd9 m18643a() {
            return new bd9(this, null);
        }

        /* renamed from: b */
        public final C12357a m18644b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m18645c() {
            return this.f15964a;
        }

        /* renamed from: d */
        public final Integer m18646d() {
            return this.f15965b;
        }

        /* renamed from: e */
        public final Float m18647e() {
            return this.f15966c;
        }

        /* renamed from: f */
        public final String m18648f() {
            return this.f15967d;
        }

        /* renamed from: g */
        public final void m18649g(Integer num) {
            this.f15964a = num;
        }

        /* renamed from: h */
        public final void m18650h(Integer num) {
            this.f15965b = num;
        }

        /* renamed from: i */
        public final void m18651i(Float f) {
            this.f15966c = f;
        }

        /* renamed from: j */
        public final void m18652j(String str) {
            this.f15967d = str;
        }
    }

    /* renamed from: o.bd9$b */
    public static final class C12358b {
        public C12358b() {
        }

        public /* synthetic */ C12358b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ bd9(C12357a c12357a, id5 id5Var) {
        this(c12357a);
    }

    /* renamed from: a */
    public final Integer m18640a() {
        return this.f15960a;
    }

    /* renamed from: b */
    public final Float m18641b() {
        return this.f15962c;
    }

    /* renamed from: c */
    public final String m18642c() {
        return this.f15963d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bd9.class != obj.getClass()) {
            return false;
        }
        bd9 bd9Var = (bd9) obj;
        if (!sq8.m48644c(this.f15960a, bd9Var.f15960a) || !sq8.m48644c(this.f15961b, bd9Var.f15961b)) {
            return false;
        }
        Float f = this.f15962c;
        return (f != null ? f.equals(bd9Var.f15962c) : bd9Var.f15962c == null) && sq8.m48644c(this.f15963d, bd9Var.f15963d);
    }

    public int hashCode() {
        Integer num = this.f15960a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f15961b;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Float f = this.f15962c;
        int iHashCode = (iIntValue2 + (f != null ? f.hashCode() : 0)) * 31;
        String str = this.f15963d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPhrase(");
        sb.append("beginOffset=" + this.f15960a + ',');
        sb.append("endOffset=" + this.f15961b + ',');
        sb.append("score=" + this.f15962c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("text=");
        sb2.append(this.f15963d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public bd9(C12357a c12357a) {
        this.f15960a = c12357a.m18645c();
        this.f15961b = c12357a.m18646d();
        this.f15962c = c12357a.m18647e();
        this.f15963d = c12357a.m18648f();
    }
}
