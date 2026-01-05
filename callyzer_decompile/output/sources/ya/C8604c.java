package ya;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ya.c */
/* loaded from: classes.dex */
public final class C8604c {

    /* renamed from: a */
    public final String f41864a;

    /* renamed from: b */
    public final Map f41865b;

    public C8604c(C8603b c8603b) {
        this.f41864a = c8603b.f41862a;
        this.f41865b = c8603b.f41863b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8604c.class != obj.getClass()) {
            return false;
        }
        C8604c c8604c = (C8604c) obj;
        return AbstractC4154l.m8918a(this.f41864a, c8604c.f41864a) && AbstractC4154l.m8918a(this.f41865b, c8604c.f41865b);
    }

    public final int hashCode() {
        String str = this.f41864a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f41865b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetCredentialsForIdentityRequest(customRoleArn=null,");
        sb2.append("identityId=" + this.f41864a + ',');
        sb2.append("logins=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
