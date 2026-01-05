package nc;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nc.m */
/* loaded from: classes.dex */
public final class C5002m {

    /* renamed from: a */
    public final String f24755a;

    /* renamed from: b */
    public final Integer f24756b;

    public C5002m(String hostMatch, Integer num) {
        AbstractC4154l.m8923f(hostMatch, "hostMatch");
        this.f24755a = hostMatch;
        this.f24756b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5002m)) {
            return false;
        }
        C5002m c5002m = (C5002m) obj;
        return AbstractC4154l.m8918a(this.f24755a, c5002m.f24755a) && AbstractC4154l.m8918a(this.f24756b, c5002m.f24756b);
    }

    public final int hashCode() {
        int iHashCode = this.f24755a.hashCode() * 31;
        Integer num = this.f24756b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "NonProxyHost(hostMatch=" + this.f24755a + ", port=" + this.f24756b + ')';
    }
}
