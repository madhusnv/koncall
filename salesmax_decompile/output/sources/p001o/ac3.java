package p001o;

/* loaded from: classes3.dex */
public final class ac3 {

    /* renamed from: a */
    public final Throwable f14467a;

    public ac3(Throwable th) {
        this.f14467a = th;
    }

    /* renamed from: a */
    public final Throwable m16847a() {
        return this.f14467a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac3) && sq8.m48644c(this.f14467a, ((ac3) obj).f14467a);
    }

    public int hashCode() {
        Throwable th = this.f14467a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public String toString() {
        return "ClosedSentinel(cause=" + this.f14467a + ')';
    }
}
