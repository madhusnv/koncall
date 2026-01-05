package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: a */
    public final String f9362a;

    public l3(k3 k3Var) {
        this.f9362a = k3Var.f9353a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l3.class == obj.getClass() && AbstractC4154l.m8918a(this.f9362a, ((l3) obj).f9362a);
    }

    public final int hashCode() {
        String str = this.f9362a;
        return (str != null ? str.hashCode() : 0) * 31;
    }

    public final String toString() {
        return "UserContextDataType(*** Sensitive Data Redacted ***)";
    }
}
