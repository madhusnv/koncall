package p001o;

/* loaded from: classes3.dex */
public final class dxc {

    /* renamed from: a */
    public final int f20628a;

    /* renamed from: b */
    public final Object f20629b;

    public dxc(int i, Object obj) {
        this.f20628a = i;
        this.f20629b = obj;
    }

    /* renamed from: a */
    public final int m23922a() {
        return this.f20628a;
    }

    /* renamed from: b */
    public final Object m23923b() {
        return this.f20629b;
    }

    /* renamed from: c */
    public final int m23924c() {
        return this.f20628a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxc)) {
            return false;
        }
        dxc dxcVar = (dxc) obj;
        return this.f20628a == dxcVar.f20628a && sq8.m48644c(this.f20629b, dxcVar.f20629b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f20628a) * 31;
        Object obj = this.f20629b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ParseResult(pos=" + this.f20628a + ", result=" + this.f20629b + ')';
    }
}
