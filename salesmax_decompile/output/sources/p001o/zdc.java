package p001o;

/* loaded from: classes3.dex */
public final class zdc {

    /* renamed from: a */
    public final jl6 f56977a;

    /* renamed from: b */
    public final Object f56978b;

    public zdc(jl6 jl6Var, Object obj) {
        sq8.m48649h(jl6Var, "context");
        this.f56977a = jl6Var;
        this.f56978b = obj;
    }

    /* renamed from: b */
    public static /* synthetic */ zdc m59252b(zdc zdcVar, jl6 jl6Var, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            jl6Var = zdcVar.f56977a;
        }
        if ((i & 2) != 0) {
            obj = zdcVar.f56978b;
        }
        return zdcVar.m59253a(jl6Var, obj);
    }

    /* renamed from: a */
    public final zdc m59253a(jl6 jl6Var, Object obj) {
        sq8.m48649h(jl6Var, "context");
        return new zdc(jl6Var, obj);
    }

    /* renamed from: c */
    public final jl6 m59254c() {
        return this.f56977a;
    }

    /* renamed from: d */
    public final Object m59255d() {
        return this.f56978b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdc)) {
            return false;
        }
        zdc zdcVar = (zdc) obj;
        return sq8.m48644c(this.f56977a, zdcVar.f56977a) && sq8.m48644c(this.f56978b, zdcVar.f56978b);
    }

    public int hashCode() {
        int iHashCode = this.f56977a.hashCode() * 31;
        Object obj = this.f56978b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "OperationRequest(context=" + this.f56977a + ", subject=" + this.f56978b + ')';
    }

    public zdc(Object obj) {
        this(new jl6(), obj);
    }
}
