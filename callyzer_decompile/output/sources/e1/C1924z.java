package e1;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.z */
/* loaded from: classes.dex */
public final class C1924z {

    /* renamed from: a */
    public long[] f9091a;

    /* renamed from: b */
    public int f9092b;

    public C1924z(int i10) {
        this.f9091a = i10 == 0 ? AbstractC1914p.f9034a : new long[i10];
    }

    /* renamed from: a */
    public final void m5670a(long j6) {
        int i10 = this.f9092b + 1;
        long[] jArr = this.f9091a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            AbstractC4154l.m8922e(jArrCopyOf, "copyOf(...)");
            this.f9091a = jArrCopyOf;
        }
        long[] jArr2 = this.f9091a;
        int i11 = this.f9092b;
        jArr2[i11] = j6;
        this.f9092b = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1924z) {
            C1924z c1924z = (C1924z) obj;
            int i10 = c1924z.f9092b;
            int i11 = this.f9092b;
            if (i10 == i11) {
                long[] jArr = this.f9091a;
                long[] jArr2 = c1924z.f9091a;
                C4266h c4266hM11919j = w9.m11919j(0, i11);
                int i12 = c4266hM11919j.f21646a;
                int i13 = c4266hM11919j.f21647b;
                if (i12 > i13) {
                    return true;
                }
                while (jArr[i12] == jArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f9091a;
        int i10 = this.f9092b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f9091a;
        int i10 = this.f9092b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            long j6 = jArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j6);
            i11++;
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
