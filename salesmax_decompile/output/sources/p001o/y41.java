package p001o;

/* loaded from: classes5.dex */
public final class y41 extends jja {

    /* renamed from: a */
    public final long f54830a;

    public y41(long j) {
        this.f54830a = j;
    }

    @Override // p001o.jja
    /* renamed from: c */
    public long mo33878c() {
        return this.f54830a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof jja) && this.f54830a == ((jja) obj).mo33878c();
    }

    public int hashCode() {
        long j = this.f54830a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f54830a + "}";
    }
}
