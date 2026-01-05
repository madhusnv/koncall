package p001o;

/* loaded from: classes2.dex */
public final class hui extends Exception {

    /* renamed from: a */
    public final long f27571a;

    public hui(Throwable th, long j) {
        super(th);
        this.f27571a = j;
    }

    /* renamed from: a */
    public static hui m31158a(Exception exc) {
        return m31159b(exc, -9223372036854775807L);
    }

    /* renamed from: b */
    public static hui m31159b(Exception exc, long j) {
        return exc instanceof hui ? (hui) exc : new hui(exc, j);
    }
}
