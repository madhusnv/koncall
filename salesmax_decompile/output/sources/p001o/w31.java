package p001o;

import p001o.p91;

/* loaded from: classes5.dex */
public final class w31 extends p91 {

    /* renamed from: a */
    public final p91.EnumC16032a f51364a;

    /* renamed from: b */
    public final long f51365b;

    public w31(p91.EnumC16032a enumC16032a, long j) {
        if (enumC16032a == null) {
            throw new NullPointerException("Null status");
        }
        this.f51364a = enumC16032a;
        this.f51365b = j;
    }

    @Override // p001o.p91
    /* renamed from: b */
    public long mo43208b() {
        return this.f51365b;
    }

    @Override // p001o.p91
    /* renamed from: c */
    public p91.EnumC16032a mo43209c() {
        return this.f51364a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p91)) {
            return false;
        }
        p91 p91Var = (p91) obj;
        return this.f51364a.equals(p91Var.mo43209c()) && this.f51365b == p91Var.mo43208b();
    }

    public int hashCode() {
        int iHashCode = (this.f51364a.hashCode() ^ 1000003) * 1000003;
        long j = this.f51365b;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f51364a + ", nextRequestWaitMillis=" + this.f51365b + "}";
    }
}
