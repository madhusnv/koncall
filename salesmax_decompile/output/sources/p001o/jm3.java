package p001o;

/* loaded from: classes6.dex */
public final class jm3 {

    /* renamed from: a */
    public final Object f30680a;

    /* renamed from: b */
    public final tb2 f30681b;

    /* renamed from: c */
    public final ql7 f30682c;

    /* renamed from: d */
    public final Object f30683d;

    /* renamed from: e */
    public final Throwable f30684e;

    public jm3(Object obj, tb2 tb2Var, ql7 ql7Var, Object obj2, Throwable th) {
        this.f30680a = obj;
        this.f30681b = tb2Var;
        this.f30682c = ql7Var;
        this.f30683d = obj2;
        this.f30684e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ jm3 m34011b(jm3 jm3Var, Object obj, tb2 tb2Var, ql7 ql7Var, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = jm3Var.f30680a;
        }
        if ((i & 2) != 0) {
            tb2Var = jm3Var.f30681b;
        }
        tb2 tb2Var2 = tb2Var;
        if ((i & 4) != 0) {
            ql7Var = jm3Var.f30682c;
        }
        ql7 ql7Var2 = ql7Var;
        if ((i & 8) != 0) {
            obj2 = jm3Var.f30683d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = jm3Var.f30684e;
        }
        return jm3Var.m34012a(obj, tb2Var2, ql7Var2, obj4, th);
    }

    /* renamed from: a */
    public final jm3 m34012a(Object obj, tb2 tb2Var, ql7 ql7Var, Object obj2, Throwable th) {
        return new jm3(obj, tb2Var, ql7Var, obj2, th);
    }

    /* renamed from: c */
    public final boolean m34013c() {
        return this.f30684e != null;
    }

    /* renamed from: d */
    public final void m34014d(zb2 zb2Var, Throwable th) {
        tb2 tb2Var = this.f30681b;
        if (tb2Var != null) {
            zb2Var.m59132l(tb2Var, th);
        }
        ql7 ql7Var = this.f30682c;
        if (ql7Var != null) {
            zb2Var.m59133m(ql7Var, th, this.f30680a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm3)) {
            return false;
        }
        jm3 jm3Var = (jm3) obj;
        return sq8.m48644c(this.f30680a, jm3Var.f30680a) && sq8.m48644c(this.f30681b, jm3Var.f30681b) && sq8.m48644c(this.f30682c, jm3Var.f30682c) && sq8.m48644c(this.f30683d, jm3Var.f30683d) && sq8.m48644c(this.f30684e, jm3Var.f30684e);
    }

    public int hashCode() {
        Object obj = this.f30680a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        tb2 tb2Var = this.f30681b;
        int iHashCode2 = (iHashCode + (tb2Var == null ? 0 : tb2Var.hashCode())) * 31;
        ql7 ql7Var = this.f30682c;
        int iHashCode3 = (iHashCode2 + (ql7Var == null ? 0 : ql7Var.hashCode())) * 31;
        Object obj2 = this.f30683d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f30684e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f30680a + ", cancelHandler=" + this.f30681b + ", onCancellation=" + this.f30682c + ", idempotentResume=" + this.f30683d + ", cancelCause=" + this.f30684e + ')';
    }

    public /* synthetic */ jm3(Object obj, tb2 tb2Var, ql7 ql7Var, Object obj2, Throwable th, int i, id5 id5Var) {
        this(obj, (i & 2) != 0 ? null : tb2Var, (i & 4) != 0 ? null : ql7Var, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
