package ya;

import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mb.x2;
import mm.AbstractC4801l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ya.a */
/* loaded from: classes.dex */
public final class C8602a {

    /* renamed from: a */
    public final String f41858a;

    /* renamed from: b */
    public final C7126c f41859b;

    /* renamed from: c */
    public final String f41860c;

    /* renamed from: d */
    public final String f41861d;

    public C8602a(x2 x2Var) {
        this.f41858a = x2Var.f23537a;
        this.f41859b = x2Var.f23538b;
        this.f41860c = x2Var.f23539c;
        this.f41861d = x2Var.f23540d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8602a.class != obj.getClass()) {
            return false;
        }
        C8602a c8602a = (C8602a) obj;
        return AbstractC4154l.m8918a(this.f41858a, c8602a.f41858a) && AbstractC4154l.m8918a(this.f41859b, c8602a.f41859b) && AbstractC4154l.m8918a(this.f41860c, c8602a.f41860c) && AbstractC4154l.m8918a(this.f41861d, c8602a.f41861d);
    }

    public final int hashCode() {
        String str = this.f41858a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        C7126c c7126c = this.f41859b;
        int iHashCode2 = (iHashCode + (c7126c != null ? c7126c.f34346a.hashCode() : 0)) * 31;
        String str2 = this.f41860c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f41861d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Credentials(");
        StringBuilder sbM7385r = m0.m7385r(new StringBuilder("accessKeyId="), this.f41858a, ',', sb2, "expiration=");
        sbM7385r.append(this.f41859b);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("secretKey=*** Sensitive Data Redacted ***,");
        return AbstractC4801l.m9737k(new StringBuilder("sessionToken="), this.f41861d, sb2, ")");
    }
}
