package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a */
    public final String f9296a;

    public d3(w0 w0Var) {
        this.f9296a = w0Var.f9503a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d3.class == obj.getClass() && AbstractC4154l.m8918a(this.f9296a, ((d3) obj).f9296a);
    }

    public final int hashCode() {
        String str = this.f9296a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StartWebAuthnRegistrationRequest(accessToken=*** Sensitive Data Redacted ***)";
    }
}
