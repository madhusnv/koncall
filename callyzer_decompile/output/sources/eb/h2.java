package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a */
    public final String f9325a;

    public h2(g2 g2Var) {
        this.f9325a = g2Var.f9320a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h2.class == obj.getClass() && AbstractC4154l.m8918a(this.f9325a, ((h2) obj).f9325a);
    }

    public final int hashCode() {
        String str = this.f9325a;
        return (str != null ? str.hashCode() : 0) * 961;
    }

    public final String toString() {
        return "ListDevicesRequest(accessToken=*** Sensitive Data Redacted ***,limit=null,paginationToken=null)";
    }
}
