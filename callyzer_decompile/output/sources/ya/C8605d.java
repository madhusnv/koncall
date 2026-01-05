package ya;

import c9.C0927v;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ya.d */
/* loaded from: classes.dex */
public final class C8605d {

    /* renamed from: a */
    public final C8602a f41866a;

    /* renamed from: b */
    public final String f41867b;

    public C8605d(C0927v c0927v) {
        this.f41866a = (C8602a) c0927v.f5668b;
        this.f41867b = (String) c0927v.f5669c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8605d.class != obj.getClass()) {
            return false;
        }
        C8605d c8605d = (C8605d) obj;
        return AbstractC4154l.m8918a(this.f41866a, c8605d.f41866a) && AbstractC4154l.m8918a(this.f41867b, c8605d.f41867b);
    }

    public final int hashCode() {
        C8602a c8602a = this.f41866a;
        int iHashCode = (c8602a != null ? c8602a.hashCode() : 0) * 31;
        String str = this.f41867b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetCredentialsForIdentityResponse(");
        sb2.append("credentials=" + this.f41866a + ',');
        return AbstractC4801l.m9737k(new StringBuilder("identityId="), this.f41867b, sb2, ")");
    }
}
