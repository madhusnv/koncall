package im;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g1 extends k1 {

    /* renamed from: a */
    public final f1 f17557a;

    public g1(f1 responseError) {
        AbstractC4154l.m8923f(responseError, "responseError");
        this.f17557a = responseError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && AbstractC4154l.m8918a(this.f17557a, ((g1) obj).f17557a);
    }

    public final int hashCode() {
        return this.f17557a.hashCode();
    }

    public final String toString() {
        return "Failure(responseError=" + this.f17557a + ")";
    }
}
