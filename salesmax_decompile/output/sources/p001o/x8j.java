package p001o;

/* loaded from: classes6.dex */
public final class x8j {

    /* renamed from: a */
    public final int f53370a;

    /* renamed from: b */
    public long f53371b;

    /* renamed from: c */
    public long f53372c;

    public x8j(int i) {
        this.f53370a = i;
    }

    /* renamed from: c */
    public static /* synthetic */ void m55853c(x8j x8jVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        x8jVar.m55855b(j, j2);
    }

    /* renamed from: a */
    public final synchronized long m55854a() {
        return this.f53371b - this.f53372c;
    }

    /* renamed from: b */
    public final synchronized void m55855b(long j, long j2) {
        if (!(j >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(j2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        long j3 = this.f53371b + j;
        this.f53371b = j3;
        long j4 = this.f53372c + j2;
        this.f53372c = j4;
        if (!(j4 <= j3)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.f53370a + ", total=" + this.f53371b + ", acknowledged=" + this.f53372c + ", unacknowledged=" + m55854a() + ')';
    }
}
