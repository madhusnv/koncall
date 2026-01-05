package p001o;

/* loaded from: classes2.dex */
public final class g79 {

    /* renamed from: a */
    public final Object f24679a;

    /* renamed from: b */
    public final Object f24680b;

    public g79(Object obj, Object obj2) {
        this.f24679a = obj;
        this.f24680b = obj2;
    }

    /* renamed from: a */
    public final int m28137a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g79)) {
            return false;
        }
        g79 g79Var = (g79) obj;
        return sq8.m48644c(this.f24679a, g79Var.f24679a) && sq8.m48644c(this.f24680b, g79Var.f24680b);
    }

    public int hashCode() {
        return (m28137a(this.f24679a) * 31) + m28137a(this.f24680b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f24679a + ", right=" + this.f24680b + ')';
    }
}
