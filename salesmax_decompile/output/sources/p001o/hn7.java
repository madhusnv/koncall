package p001o;

/* loaded from: classes5.dex */
public final class hn7 {

    /* renamed from: a */
    public final String f27205a;

    /* renamed from: b */
    public final boolean f27206b;

    public hn7(String str, boolean z) {
        sq8.m48649h(str, "name");
        this.f27205a = str;
        this.f27206b = z;
    }

    /* renamed from: a */
    public final String m30846a() {
        return this.f27205a;
    }

    /* renamed from: b */
    public final boolean m30847b() {
        return this.f27206b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn7)) {
            return false;
        }
        hn7 hn7Var = (hn7) obj;
        return sq8.m48644c(this.f27205a, hn7Var.f27205a) && this.f27206b == hn7Var.f27206b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f27205a.hashCode() * 31;
        boolean z = this.f27206b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f27205a + ", value=" + this.f27206b + ')';
    }
}
