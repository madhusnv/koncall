package p001o;

/* loaded from: classes3.dex */
public final class ryc {

    /* renamed from: c */
    public static final C16680b f44258c = new C16680b(null);

    /* renamed from: a */
    public final Float f44259a;

    /* renamed from: b */
    public final tyc f44260b;

    /* renamed from: o.ryc$a */
    public static final class C16679a {

        /* renamed from: a */
        public Float f44261a;

        /* renamed from: b */
        public tyc f44262b;

        /* renamed from: a */
        public final ryc m47292a() {
            return new ryc(this, null);
        }

        /* renamed from: b */
        public final C16679a m47293b() {
            return this;
        }

        /* renamed from: c */
        public final Float m47294c() {
            return this.f44261a;
        }

        /* renamed from: d */
        public final tyc m47295d() {
            return this.f44262b;
        }

        /* renamed from: e */
        public final void m47296e(Float f) {
            this.f44261a = f;
        }

        /* renamed from: f */
        public final void m47297f(tyc tycVar) {
            this.f44262b = tycVar;
        }
    }

    /* renamed from: o.ryc$b */
    public static final class C16680b {
        public C16680b() {
        }

        public /* synthetic */ C16680b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ryc(C16679a c16679a, id5 id5Var) {
        this(c16679a);
    }

    /* renamed from: a */
    public final Float m47290a() {
        return this.f44259a;
    }

    /* renamed from: b */
    public final tyc m47291b() {
        return this.f44260b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ryc.class != obj.getClass()) {
            return false;
        }
        ryc rycVar = (ryc) obj;
        Float f = this.f44259a;
        return (f != null ? f.equals(rycVar.f44259a) : rycVar.f44259a == null) && sq8.m48644c(this.f44260b, rycVar.f44260b);
    }

    public int hashCode() {
        Float f = this.f44259a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        tyc tycVar = this.f44260b;
        return iHashCode + (tycVar != null ? tycVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartOfSpeechTag(");
        sb.append("score=" + this.f44259a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("tag=");
        sb2.append(this.f44260b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ryc(C16679a c16679a) {
        this.f44259a = c16679a.m47294c();
        this.f44260b = c16679a.m47295d();
    }
}
