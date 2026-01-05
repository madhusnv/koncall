package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class zi1 {

    /* renamed from: e */
    public static final C18649b f57233e = new C18649b(null);

    /* renamed from: a */
    public final Integer f57234a;

    /* renamed from: b */
    public final String f57235b;

    /* renamed from: c */
    public final List f57236c;

    /* renamed from: d */
    public final Integer f57237d;

    /* renamed from: o.zi1$a */
    public static final class C18648a {

        /* renamed from: a */
        public Integer f57238a;

        /* renamed from: b */
        public String f57239b;

        /* renamed from: c */
        public List f57240c;

        /* renamed from: d */
        public Integer f57241d;

        /* renamed from: a */
        public final zi1 m59470a() {
            return new zi1(this, null);
        }

        /* renamed from: b */
        public final C18648a m59471b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m59472c() {
            return this.f57238a;
        }

        /* renamed from: d */
        public final String m59473d() {
            return this.f57239b;
        }

        /* renamed from: e */
        public final List m59474e() {
            return this.f57240c;
        }

        /* renamed from: f */
        public final Integer m59475f() {
            return this.f57241d;
        }

        /* renamed from: g */
        public final void m59476g(Integer num) {
            this.f57238a = num;
        }

        /* renamed from: h */
        public final void m59477h(String str) {
            this.f57239b = str;
        }

        /* renamed from: i */
        public final void m59478i(List list) {
            this.f57240c = list;
        }

        /* renamed from: j */
        public final void m59479j(Integer num) {
            this.f57241d = num;
        }
    }

    /* renamed from: o.zi1$b */
    public static final class C18649b {
        public C18649b() {
        }

        public /* synthetic */ C18649b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ zi1(C18648a c18648a, id5 id5Var) {
        this(c18648a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zi1.class != obj.getClass()) {
            return false;
        }
        zi1 zi1Var = (zi1) obj;
        return sq8.m48644c(this.f57234a, zi1Var.f57234a) && sq8.m48644c(this.f57235b, zi1Var.f57235b) && sq8.m48644c(this.f57236c, zi1Var.f57236c) && sq8.m48644c(this.f57237d, zi1Var.f57237d);
    }

    public int hashCode() {
        Integer num = this.f57234a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        String str = this.f57235b;
        int iHashCode = (iIntValue + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f57236c;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num2 = this.f57237d;
        return iHashCode2 + (num2 != null ? num2.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BlockReference(");
        sb.append("beginOffset=" + this.f57234a + ',');
        sb.append("blockId=" + this.f57235b + ',');
        sb.append("childBlocks=" + this.f57236c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("endOffset=");
        sb2.append(this.f57237d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public zi1(C18648a c18648a) {
        this.f57234a = c18648a.m59472c();
        this.f57235b = c18648a.m59473d();
        this.f57236c = c18648a.m59474e();
        this.f57237d = c18648a.m59475f();
    }
}
