package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a */
    public final String f9525a;

    public z0(y0 y0Var) {
        this.f9525a = y0Var.f9518a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z0.class == obj.getClass() && AbstractC4154l.m8918a(this.f9525a, ((z0) obj).f9525a);
    }

    public final int hashCode() {
        String str = this.f9525a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DeleteUserRequest(accessToken=*** Sensitive Data Redacted ***)";
    }
}
