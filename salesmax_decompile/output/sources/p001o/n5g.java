package p001o;

/* loaded from: classes2.dex */
public final class n5g implements p4g {

    /* renamed from: a */
    public final Object f36417a;

    public n5g(Object obj) {
        this.f36417a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5g) && sq8.m48644c(this.f36417a, ((n5g) obj).f36417a);
    }

    @Override // p001o.p4g
    public Object getValue() {
        return this.f36417a;
    }

    public int hashCode() {
        Object obj = this.f36417a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f36417a + ')';
    }
}
