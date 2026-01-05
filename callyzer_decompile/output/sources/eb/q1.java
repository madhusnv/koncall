package eb;

import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a */
    public final String f9421a;

    /* renamed from: b */
    public final String f9422b;

    public q1(p1 p1Var) {
        this.f9421a = p1Var.f9409a;
        this.f9422b = p1Var.f9410b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q1.class != obj.getClass()) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return AbstractC4154l.m8918a(this.f9421a, q1Var.f9421a) && AbstractC4154l.m8918a(this.f9422b, q1Var.f9422b);
    }

    public final int hashCode() {
        String str = this.f9421a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9422b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC4801l.m9737k(new StringBuilder("deviceKey="), this.f9422b, new StringBuilder("ForgetDeviceRequest(accessToken=*** Sensitive Data Redacted ***,"), ")");
    }
}
