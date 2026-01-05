package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import eb.C1979c;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AccessDeniedException extends SsoOidcException {

    /* renamed from: d */
    public final String f3471d;

    /* renamed from: e */
    public final String f3472e;

    public AccessDeniedException(C1979c c1979c) {
        this.f3471d = c1979c.f9280a;
        this.f3472e = c1979c.f9281b;
        this.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccessDeniedException.class != obj.getClass()) {
            return false;
        }
        AccessDeniedException accessDeniedException = (AccessDeniedException) obj;
        return AbstractC4154l.m8918a(this.f3471d, accessDeniedException.f3471d) && AbstractC4154l.m8918a(this.f3472e, accessDeniedException.f3472e);
    }

    public final int hashCode() {
        String str = this.f3471d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3472e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessDeniedException(");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("error="), this.f3471d, ',', sb2, "errorDescription="), this.f3472e, sb2, ")");
    }
}
