package rv;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.h */
/* loaded from: classes3.dex */
public final class C6632h extends AbstractC6650z {

    /* renamed from: a */
    public final String f31834a;

    /* renamed from: b */
    public final Integer f31835b;

    public C6632h(String str, Integer num) {
        this.f31834a = str;
        this.f31835b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6632h)) {
            return false;
        }
        C6632h c6632h = (C6632h) obj;
        return AbstractC4154l.m8918a(this.f31834a, c6632h.f31834a) && AbstractC4154l.m8918a(this.f31835b, c6632h.f31835b);
    }

    public final int hashCode() {
        String str = this.f31834a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f31835b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectedSimDetails(simNumber=" + this.f31834a + ", countryCode=" + this.f31835b + ")";
    }
}
