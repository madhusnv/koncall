package p001o;

/* loaded from: classes5.dex */
public final class m41 extends xj6 {

    /* renamed from: a */
    public final Integer f34738a;

    /* renamed from: b */
    public final Object f34739b;

    /* renamed from: c */
    public final fid f34740c;

    public m41(Integer num, Object obj, fid fidVar) {
        this.f34738a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f34739b = obj;
        if (fidVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f34740c = fidVar;
    }

    @Override // p001o.xj6
    /* renamed from: a */
    public Integer mo38281a() {
        return this.f34738a;
    }

    @Override // p001o.xj6
    /* renamed from: b */
    public Object mo38282b() {
        return this.f34739b;
    }

    @Override // p001o.xj6
    /* renamed from: c */
    public fid mo38283c() {
        return this.f34740c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xj6)) {
            return false;
        }
        xj6 xj6Var = (xj6) obj;
        Integer num = this.f34738a;
        if (num != null ? num.equals(xj6Var.mo38281a()) : xj6Var.mo38281a() == null) {
            if (this.f34739b.equals(xj6Var.mo38282b()) && this.f34740c.equals(xj6Var.mo38283c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f34738a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f34739b.hashCode()) * 1000003) ^ this.f34740c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f34738a + ", payload=" + this.f34739b + ", priority=" + this.f34740c + "}";
    }
}
