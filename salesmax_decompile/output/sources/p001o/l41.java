package p001o;

import p001o.z76;

/* loaded from: classes6.dex */
public final class l41 extends z76 {

    /* renamed from: b */
    public final boolean f33236b;

    /* renamed from: c */
    public final p5g f33237c;

    /* renamed from: o.l41$b */
    public static final class C14996b extends z76.AbstractC18566a {

        /* renamed from: a */
        public Boolean f33238a;

        /* renamed from: b */
        public p5g f33239b;

        @Override // p001o.z76.AbstractC18566a
        /* renamed from: a */
        public z76 mo36550a() {
            String str = "";
            if (this.f33238a == null) {
                str = " sampleToLocalSpanStore";
            }
            if (str.isEmpty()) {
                return new l41(this.f33238a.booleanValue(), this.f33239b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.z76.AbstractC18566a
        /* renamed from: b */
        public z76.AbstractC18566a mo36551b(p5g p5gVar) {
            this.f33239b = p5gVar;
            return this;
        }

        /* renamed from: c */
        public z76.AbstractC18566a m36552c(boolean z) {
            this.f33238a = Boolean.valueOf(z);
            return this;
        }
    }

    @Override // p001o.z76
    /* renamed from: b */
    public boolean mo36548b() {
        return this.f33236b;
    }

    @Override // p001o.z76
    /* renamed from: c */
    public p5g mo36549c() {
        return this.f33237c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z76)) {
            return false;
        }
        z76 z76Var = (z76) obj;
        if (this.f33236b == z76Var.mo36548b()) {
            p5g p5gVar = this.f33237c;
            if (p5gVar == null) {
                if (z76Var.mo36549c() == null) {
                    return true;
                }
            } else if (p5gVar.equals(z76Var.mo36549c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.f33236b ? 1231 : 1237) ^ 1000003) * 1000003;
        p5g p5gVar = this.f33237c;
        return i ^ (p5gVar == null ? 0 : p5gVar.hashCode());
    }

    public String toString() {
        return "EndSpanOptions{sampleToLocalSpanStore=" + this.f33236b + ", status=" + this.f33237c + "}";
    }

    public l41(boolean z, p5g p5gVar) {
        this.f33236b = z;
        this.f33237c = p5gVar;
    }
}
