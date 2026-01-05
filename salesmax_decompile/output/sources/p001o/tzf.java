package p001o;

/* loaded from: classes6.dex */
public final class tzf implements Comparable {

    /* renamed from: b */
    public static final tzf f48121b = new tzf(0);

    /* renamed from: a */
    public final long f48122a;

    public tzf(long j) {
        this.f48122a = j;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(tzf tzfVar) {
        long j = this.f48122a;
        long j2 = tzfVar.f48122a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: c */
    public void m50811c(char[] cArr, int i) {
        nh1.m40571d(this.f48122a, cArr, i);
    }

    /* renamed from: d */
    public byte[] m50812d() {
        byte[] bArr = new byte[8];
        nh1.m40572e(this.f48122a, bArr, 0);
        return bArr;
    }

    /* renamed from: e */
    public String m50813e() {
        char[] cArr = new char[16];
        m50811c(cArr, 0);
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof tzf) && this.f48122a == ((tzf) obj).f48122a;
    }

    public int hashCode() {
        long j = this.f48122a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "SpanId{spanId=" + m50813e() + "}";
    }
}
