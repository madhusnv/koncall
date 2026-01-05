package om;

import com.sun.mail.util.AbstractC1452a;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.b */
/* loaded from: classes3.dex */
public final class C5400b {

    /* renamed from: a */
    public final int f27092a;

    /* renamed from: b */
    public final long f27093b;

    /* renamed from: c */
    public final EnumC8994d f27094c;

    public C5400b(int i10, long j6, EnumC8994d enumC8994d) {
        this.f27092a = i10;
        this.f27093b = j6;
        this.f27094c = enumC8994d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5400b)) {
            return false;
        }
        C5400b c5400b = (C5400b) obj;
        return this.f27092a == c5400b.f27092a && this.f27093b == c5400b.f27093b && this.f27094c == c5400b.f27094c;
    }

    public final int hashCode() {
        return this.f27094c.hashCode() + AbstractC1452a.m4557d(Integer.hashCode(this.f27092a) * 31, 31, this.f27093b);
    }

    public final String toString() {
        return "AverageCallData(count=" + this.f27092a + ", duration=" + this.f27093b + ", callType=" + this.f27094c + ")";
    }
}
