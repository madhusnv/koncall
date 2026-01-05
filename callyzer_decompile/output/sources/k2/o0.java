package k2;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a */
    public final Integer f20490a;

    /* renamed from: b */
    public final Object f20491b;

    public o0(Integer num, Object obj) {
        this.f20490a = num;
        this.f20491b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f20490a.equals(o0Var.f20490a) && AbstractC4154l.m8918a(this.f20491b, o0Var.f20491b);
    }

    public final int hashCode() {
        int iHashCode = this.f20490a.hashCode() * 31;
        Object obj = this.f20491b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f20490a + ", right=" + this.f20491b + ')';
    }
}
