package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a */
    public final String f23569a;

    /* renamed from: b */
    public final C7126c f23570b;

    /* renamed from: c */
    public final String f23571c;

    /* renamed from: d */
    public final String f23572d;

    public y2(x2 x2Var) {
        String str = x2Var.f23537a;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for accessKeyId");
        }
        this.f23569a = str;
        C7126c c7126c = x2Var.f23538b;
        if (c7126c == null) {
            throw new IllegalArgumentException("A non-null value must be provided for expiration");
        }
        this.f23570b = c7126c;
        String str2 = x2Var.f23539c;
        if (str2 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for secretAccessKey");
        }
        this.f23571c = str2;
        String str3 = x2Var.f23540d;
        if (str3 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for sessionToken");
        }
        this.f23572d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y2.class != obj.getClass()) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return AbstractC4154l.m8918a(this.f23569a, y2Var.f23569a) && AbstractC4154l.m8918a(this.f23570b, y2Var.f23570b) && AbstractC4154l.m8918a(this.f23571c, y2Var.f23571c) && AbstractC4154l.m8918a(this.f23572d, y2Var.f23572d);
    }

    public final int hashCode() {
        return this.f23572d.hashCode() + AbstractC0030c.m113d((this.f23570b.f34346a.hashCode() + (this.f23569a.hashCode() * 31)) * 31, 31, this.f23571c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionCredentials(");
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("accessKeyId="), this.f23569a, ',', sb2, "expiration=");
        sbM7385r.append(this.f23570b);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("secretAccessKey=*** Sensitive Data Redacted ***,sessionToken=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
