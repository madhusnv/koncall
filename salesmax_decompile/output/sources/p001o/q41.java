package p001o;

/* loaded from: classes2.dex */
public final class q41 extends cb8 {

    /* renamed from: a */
    public final Object f41271a;

    public q41(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f41271a = obj;
    }

    @Override // p001o.cb8
    /* renamed from: b */
    public Object mo20645b() {
        return this.f41271a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cb8) {
            return this.f41271a.equals(((cb8) obj).mo20645b());
        }
        return false;
    }

    public int hashCode() {
        return this.f41271a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f41271a + "}";
    }
}
