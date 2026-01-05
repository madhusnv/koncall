package p001o;

/* loaded from: classes6.dex */
public final class a05 {

    /* renamed from: a */
    public final e05 f14002a;

    /* renamed from: b */
    public final int f14003b;

    /* renamed from: c */
    public final uh1 f14004c;

    public a05(e05 e05Var, int i, uh1 uh1Var) {
        sq8.m48649h(e05Var, "daySize");
        sq8.m48649h(uh1Var, "dayBinder");
        this.f14002a = e05Var;
        this.f14003b = i;
        this.f14004c = uh1Var;
    }

    /* renamed from: a */
    public final uh1 m16286a() {
        return this.f14004c;
    }

    /* renamed from: b */
    public final e05 m16287b() {
        return this.f14002a;
    }

    /* renamed from: c */
    public final int m16288c() {
        return this.f14003b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a05)) {
            return false;
        }
        a05 a05Var = (a05) obj;
        return this.f14002a == a05Var.f14002a && this.f14003b == a05Var.f14003b && sq8.m48644c(this.f14004c, a05Var.f14004c);
    }

    public int hashCode() {
        return (((this.f14002a.hashCode() * 31) + Integer.hashCode(this.f14003b)) * 31) + this.f14004c.hashCode();
    }

    public String toString() {
        return "DayConfig(daySize=" + this.f14002a + ", dayViewRes=" + this.f14003b + ", dayBinder=" + this.f14004c + ")";
    }
}
