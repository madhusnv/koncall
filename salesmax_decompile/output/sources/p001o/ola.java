package p001o;

/* loaded from: classes2.dex */
public final class ola {

    /* renamed from: a */
    public final long f38541a;

    /* renamed from: b */
    public final long f38542b;

    public ola(long j, long j2) {
        this.f38541a = j;
        this.f38542b = j2;
    }

    /* renamed from: a */
    public long m42389a() {
        return this.f38542b;
    }

    /* renamed from: b */
    public long m42390b() {
        return this.f38541a;
    }

    public String toString() {
        return this.f38541a + "/" + this.f38542b;
    }

    public ola(double d) {
        this((long) (d * 10000.0d), 10000L);
    }
}
