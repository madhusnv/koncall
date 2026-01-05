package df;

import gf.InterfaceC2585a;
import java.util.HashMap;
import ue.EnumC7422d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: df.b */
/* loaded from: classes.dex */
public final class C1703b {

    /* renamed from: a */
    public final InterfaceC2585a f8309a;

    /* renamed from: b */
    public final HashMap f8310b;

    public C1703b(InterfaceC2585a interfaceC2585a, HashMap map) {
        this.f8309a = interfaceC2585a;
        this.f8310b = map;
    }

    /* renamed from: a */
    public final long m5397a(EnumC7422d enumC7422d, long j6, int i10) {
        long time = j6 - this.f8309a.getTime();
        C1704c c1704c = (C1704c) this.f8310b.get(enumC7422d);
        long j10 = c1704c.f8311a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r12))), time), c1704c.f8312b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1703b)) {
            return false;
        }
        C1703b c1703b = (C1703b) obj;
        return this.f8309a.equals(c1703b.f8309a) && this.f8310b.equals(c1703b.f8310b);
    }

    public final int hashCode() {
        return ((this.f8309a.hashCode() ^ 1000003) * 1000003) ^ this.f8310b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f8309a + ", values=" + this.f8310b + "}";
    }
}
