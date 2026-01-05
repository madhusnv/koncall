package p001o;

import java.security.MessageDigest;

/* loaded from: classes5.dex */
public final class bu4 implements ic9 {

    /* renamed from: b */
    public final ic9 f16827b;

    /* renamed from: c */
    public final ic9 f16828c;

    public bu4(ic9 ic9Var, ic9 ic9Var2) {
        this.f16827b = ic9Var;
        this.f16828c = ic9Var2;
    }

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        this.f16827b.mo19806a(messageDigest);
        this.f16828c.mo19806a(messageDigest);
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        if (!(obj instanceof bu4)) {
            return false;
        }
        bu4 bu4Var = (bu4) obj;
        return this.f16827b.equals(bu4Var.f16827b) && this.f16828c.equals(bu4Var.f16828c);
    }

    @Override // p001o.ic9
    public int hashCode() {
        return (this.f16827b.hashCode() * 31) + this.f16828c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f16827b + ", signature=" + this.f16828c + '}';
    }
}
