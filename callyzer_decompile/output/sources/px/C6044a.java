package px;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.lc;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: px.a */
/* loaded from: classes3.dex */
public final class C6044a implements Comparable, Serializable {

    /* renamed from: c */
    public static final C6044a f29503c = new C6044a(0, 0);

    /* renamed from: a */
    public final long f29504a;

    /* renamed from: b */
    public final long f29505b;

    public C6044a(long j6, long j10) {
        this.f29504a = j6;
        this.f29505b = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6044a other = (C6044a) obj;
        AbstractC4154l.m8923f(other, "other");
        long j6 = other.f29504a;
        long j10 = this.f29504a;
        if (j10 != j6) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f29505b ^ Long.MIN_VALUE, other.f29505b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6044a)) {
            return false;
        }
        C6044a c6044a = (C6044a) obj;
        return this.f29504a == c6044a.f29504a && this.f29505b == c6044a.f29505b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29504a ^ this.f29505b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        lc.m10748b(this.f29504a, bArr, 0, 0, 4);
        bArr[8] = 45;
        lc.m10748b(this.f29504a, bArr, 9, 4, 6);
        bArr[13] = 45;
        lc.m10748b(this.f29504a, bArr, 14, 6, 8);
        bArr[18] = 45;
        lc.m10748b(this.f29505b, bArr, 19, 0, 2);
        bArr[23] = 45;
        lc.m10748b(this.f29505b, bArr, 24, 2, 8);
        return AbstractC5185w.m10126h(bArr);
    }
}
