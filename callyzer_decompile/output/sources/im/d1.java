package im;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d1 extends f1 {

    /* renamed from: a */
    public final Object f17545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Object response) {
        super(0);
        AbstractC4154l.m8923f(response, "response");
        this.f17545a = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && AbstractC4154l.m8918a(this.f17545a, ((d1) obj).f17545a);
    }

    public final int hashCode() {
        return this.f17545a.hashCode();
    }

    public final String toString() {
        return "Success(response=" + this.f17545a + ")";
    }
}
