package wi;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.u */
/* loaded from: classes.dex */
public final class C8071u {

    /* renamed from: a */
    public final String f38653a;

    /* renamed from: b */
    public final String f38654b;

    public C8071u(String str, String str2) {
        this.f38653a = str;
        this.f38654b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8071u)) {
            return false;
        }
        C8071u c8071u = (C8071u) obj;
        return AbstractC4154l.m8918a(this.f38653a, c8071u.f38653a) && AbstractC4154l.m8918a(this.f38654b, c8071u.f38654b);
    }

    public final int hashCode() {
        String str = this.f38653a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38654b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f38653a);
        sb2.append(", authToken=");
        return AbstractC0030c.m123n(sb2, this.f38654b, ')');
    }
}
