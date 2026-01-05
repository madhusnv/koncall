package p001o;

/* loaded from: classes3.dex */
public final class lre {

    /* renamed from: c */
    public static final C15144b f34315c = new C15144b(null);

    /* renamed from: a */
    public final Boolean f34316a;

    /* renamed from: b */
    public final gk8 f34317b;

    /* renamed from: o.lre$a */
    public static final class C15143a {

        /* renamed from: a */
        public Boolean f34318a;

        /* renamed from: b */
        public gk8 f34319b;

        /* renamed from: a */
        public final lre m37824a() {
            return new lre(this, null);
        }

        /* renamed from: b */
        public final C15143a m37825b() {
            return this;
        }

        /* renamed from: c */
        public final gk8 m37826c() {
            return this.f34319b;
        }

        /* renamed from: d */
        public final Boolean m37827d() {
            return this.f34318a;
        }

        /* renamed from: e */
        public final void m37828e(gk8 gk8Var) {
            this.f34319b = gk8Var;
        }

        /* renamed from: f */
        public final void m37829f(Boolean bool) {
            this.f34318a = bool;
        }
    }

    /* renamed from: o.lre$b */
    public static final class C15144b {
        public C15144b() {
        }

        public /* synthetic */ C15144b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ lre(C15143a c15143a, id5 id5Var) {
        this(c15143a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lre.class != obj.getClass()) {
            return false;
        }
        lre lreVar = (lre) obj;
        return sq8.m48644c(this.f34316a, lreVar.f34316a) && sq8.m48644c(this.f34317b, lreVar.f34317b);
    }

    public int hashCode() {
        Boolean bool = this.f34316a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        gk8 gk8Var = this.f34317b;
        return iHashCode + (gk8Var != null ? gk8Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RestoreStatus(");
        sb.append("isRestoreInProgress=" + this.f34316a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("restoreExpiryDate=");
        sb2.append(this.f34317b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lre(C15143a c15143a) {
        this.f34316a = c15143a.m37827d();
        this.f34317b = c15143a.m37826c();
    }
}
