package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    public final String f9506a;

    public x0(w0 w0Var) {
        this.f9506a = w0Var.f9503a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x0.class == obj.getClass() && AbstractC4154l.m8918a(this.f9506a, ((x0) obj).f9506a);
    }

    public final int hashCode() {
        String str = this.f9506a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ConfirmSignUpResponse(session=*** Sensitive Data Redacted ***)";
    }
}
