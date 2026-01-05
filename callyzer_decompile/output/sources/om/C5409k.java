package om;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.k */
/* loaded from: classes3.dex */
public final class C5409k {

    /* renamed from: a */
    public final int f27161a;

    /* renamed from: b */
    public final LocalDateTime f27162b;

    public C5409k(int i10, LocalDateTime localDateTime) {
        this.f27161a = i10;
        this.f27162b = localDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5409k)) {
            return false;
        }
        C5409k c5409k = (C5409k) obj;
        return this.f27161a == c5409k.f27161a && AbstractC4154l.m8918a(this.f27162b, c5409k.f27162b);
    }

    public final int hashCode() {
        return this.f27162b.hashCode() + (Integer.hashCode(this.f27161a) * 31);
    }

    public final String toString() {
        return "FrequentTalk(callCount=" + this.f27161a + ", datetime=" + this.f27162b + ")";
    }
}
