package p001o;

/* loaded from: classes6.dex */
public final class bth implements Comparable {

    /* renamed from: c */
    public static final bth f16816c = new bth(0, 0);

    /* renamed from: a */
    public final long f16817a;

    /* renamed from: b */
    public final long f16818b;

    public bth(long j, long j2) {
        this.f16817a = j;
        this.f16818b = j2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(bth bthVar) {
        long j = this.f16817a;
        long j2 = bthVar.f16817a;
        if (j != j2) {
            return j < j2 ? -1 : 1;
        }
        long j3 = this.f16818b;
        long j4 = bthVar.f16818b;
        if (j3 == j4) {
            return 0;
        }
        return j3 < j4 ? -1 : 1;
    }

    /* renamed from: c */
    public void m19786c(char[] cArr, int i) {
        nh1.m40571d(this.f16817a, cArr, i);
        nh1.m40571d(this.f16818b, cArr, i + 16);
    }

    /* renamed from: d */
    public String m19787d() {
        char[] cArr = new char[32];
        m19786c(cArr, 0);
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bth)) {
            return false;
        }
        bth bthVar = (bth) obj;
        return this.f16817a == bthVar.f16817a && this.f16818b == bthVar.f16818b;
    }

    public int hashCode() {
        long j = this.f16817a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        long j2 = this.f16818b;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public String toString() {
        return "TraceId{traceId=" + m19787d() + "}";
    }
}
