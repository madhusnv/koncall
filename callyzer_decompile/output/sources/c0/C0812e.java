package c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.e */
/* loaded from: classes.dex */
public final class C0812e {

    /* renamed from: a */
    public final int f5074a;

    /* renamed from: b */
    public final Throwable f5075b;

    public C0812e(Throwable th2, int i10) {
        this.f5074a = i10;
        this.f5075b = th2;
    }

    public final boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0812e) {
            C0812e c0812e = (C0812e) obj;
            Throwable th3 = c0812e.f5075b;
            if (this.f5074a == c0812e.f5074a && ((th2 = this.f5075b) != null ? th2.equals(th3) : th3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f5074a ^ 1000003) * 1000003;
        Throwable th2 = this.f5075b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f5074a + ", cause=" + this.f5075b + "}";
    }
}
