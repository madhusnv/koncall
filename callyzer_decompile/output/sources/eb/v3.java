package eb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: a */
    public final String f9496a;

    /* renamed from: b */
    public final Object f9497b;

    /* renamed from: c */
    public final C7126c f9498c;

    /* renamed from: d */
    public final String f9499d;

    /* renamed from: e */
    public final String f9500e;

    /* renamed from: f */
    public final String f9501f;

    public v3(p020v.x0 x0Var) {
        this.f9496a = (String) x0Var.f36754b;
        Object obj = x0Var.f36755c;
        if (obj == null) {
            throw new IllegalArgumentException("A non-null value must be provided for authenticatorTransports");
        }
        this.f9497b = obj;
        C7126c c7126c = (C7126c) x0Var.f36756d;
        if (c7126c == null) {
            throw new IllegalArgumentException("A non-null value must be provided for createdAt");
        }
        this.f9498c = c7126c;
        String str = (String) x0Var.f36757e;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for credentialId");
        }
        this.f9499d = str;
        String str2 = (String) x0Var.f36758f;
        if (str2 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for friendlyCredentialName");
        }
        this.f9500e = str2;
        String str3 = (String) x0Var.f36759g;
        if (str3 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for relyingPartyId");
        }
        this.f9501f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v3.class != obj.getClass()) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return AbstractC4154l.m8918a(this.f9496a, v3Var.f9496a) && AbstractC4154l.m8918a(this.f9497b, v3Var.f9497b) && AbstractC4154l.m8918a(this.f9498c, v3Var.f9498c) && AbstractC4154l.m8918a(this.f9499d, v3Var.f9499d) && AbstractC4154l.m8918a(this.f9500e, v3Var.f9500e) && AbstractC4154l.m8918a(this.f9501f, v3Var.f9501f);
    }

    public final int hashCode() {
        String str = this.f9496a;
        return this.f9501f.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d((this.f9498c.f34346a.hashCode() + ((this.f9497b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31, 31, this.f9499d), 31, this.f9500e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebAuthnCredentialDescription(");
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("authenticatorAttachment="), this.f9496a, ',', sb2, "authenticatorTransports=");
        sbM7385r.append(this.f9497b);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("createdAt=" + this.f9498c + ',');
        return AbstractC4801l.m9737k(i0.m0.m7385r(i0.m0.m7385r(new StringBuilder("credentialId="), this.f9499d, ',', sb2, "friendlyCredentialName="), this.f9500e, ',', sb2, "relyingPartyId="), this.f9501f, sb2, ")");
    }
}
