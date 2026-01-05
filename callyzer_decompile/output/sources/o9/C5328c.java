package o9;

import com.sun.mail.util.AbstractC1452a;
import ec.C2019q;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o9.c */
/* loaded from: classes.dex */
public final class C5328c {

    /* renamed from: a */
    public final String f26218a;

    /* renamed from: b */
    public final long f26219b;

    /* renamed from: c */
    public final String f26220c;

    /* renamed from: d */
    public final String f26221d;

    public C5328c(C2019q c2019q) {
        this.f26218a = (String) c2019q.f9566c;
        this.f26219b = c2019q.f9565b;
        this.f26220c = (String) c2019q.f9567d;
        this.f26221d = (String) c2019q.f9568e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5328c.class != obj.getClass()) {
            return false;
        }
        C5328c c5328c = (C5328c) obj;
        return AbstractC4154l.m8918a(this.f26218a, c5328c.f26218a) && this.f26219b == c5328c.f26219b && AbstractC4154l.m8918a(this.f26220c, c5328c.f26220c) && AbstractC4154l.m8918a(this.f26221d, c5328c.f26221d);
    }

    public final int hashCode() {
        String str = this.f26218a;
        int iM4557d = AbstractC1452a.m4557d((str != null ? str.hashCode() : 0) * 31, 31, this.f26219b);
        String str2 = this.f26220c;
        int iHashCode = (iM4557d + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26221d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RoleCredentials(");
        StringBuilder sbM7385r = m0.m7385r(new StringBuilder("accessKeyId="), this.f26218a, ',', sb2, "expiration=");
        sbM7385r.append(this.f26219b);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("secretAccessKey=*** Sensitive Data Redacted ***,sessionToken=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
