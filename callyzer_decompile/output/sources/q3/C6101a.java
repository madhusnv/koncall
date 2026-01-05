package q3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q3.a */
/* loaded from: classes.dex */
public final class C6101a {

    /* renamed from: a */
    public long f29799a;

    /* renamed from: b */
    public float f29800b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6101a)) {
            return false;
        }
        C6101a c6101a = (C6101a) obj;
        return this.f29799a == c6101a.f29799a && Float.compare(this.f29800b, c6101a.f29800b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29800b) + (Long.hashCode(this.f29799a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f29799a);
        sb2.append(", dataPoint=");
        return AbstractC1452a.m4562i(sb2, this.f29800b, ')');
    }
}
