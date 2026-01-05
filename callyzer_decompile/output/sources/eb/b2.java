package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a */
    public final String f9277a;

    public b2(a2 a2Var) {
        this.f9277a = a2Var.f9270a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b2.class == obj.getClass() && AbstractC4154l.m8918a(this.f9277a, ((b2) obj).f9277a);
    }

    public final int hashCode() {
        String str = this.f9277a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GlobalSignOutRequest(accessToken=*** Sensitive Data Redacted ***)";
    }
}
