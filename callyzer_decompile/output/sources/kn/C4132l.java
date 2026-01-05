package kn;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.l */
/* loaded from: classes3.dex */
public final class C4132l {

    /* renamed from: a */
    public final boolean f21088a;

    /* renamed from: b */
    public final Integer f21089b;

    public /* synthetic */ C4132l() {
        this(true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4132l)) {
            return false;
        }
        C4132l c4132l = (C4132l) obj;
        return this.f21088a == c4132l.f21088a && AbstractC4154l.m8918a(this.f21089b, c4132l.f21089b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f21088a) * 31;
        Integer num = this.f21089b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ValidationResult(successful=" + this.f21088a + ", errorMessage=" + this.f21089b + ")";
    }

    public C4132l(boolean z6, Integer num) {
        this.f21088a = z6;
        this.f21089b = num;
    }
}
