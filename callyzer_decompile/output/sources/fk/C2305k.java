package fk;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.k */
/* loaded from: classes.dex */
public final class C2305k {

    /* renamed from: a */
    public final EnumC2304j f10444a;

    /* renamed from: b */
    public final EnumC2304j f10445b;

    /* renamed from: c */
    public final double f10446c;

    public C2305k(EnumC2304j performance, EnumC2304j crashlytics, double d2) {
        AbstractC4154l.m8923f(performance, "performance");
        AbstractC4154l.m8923f(crashlytics, "crashlytics");
        this.f10444a = performance;
        this.f10445b = crashlytics;
        this.f10446c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2305k)) {
            return false;
        }
        C2305k c2305k = (C2305k) obj;
        return this.f10444a == c2305k.f10444a && this.f10445b == c2305k.f10445b && Double.compare(this.f10446c, c2305k.f10446c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f10446c) + ((this.f10445b.hashCode() + (this.f10444a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f10444a + ", crashlytics=" + this.f10445b + ", sessionSamplingRate=" + this.f10446c + ')';
    }
}
