package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aa.C0078e;
import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UnauthorizedClientException extends SsoOidcException {

    /* renamed from: d */
    public final String f3489d;

    /* renamed from: e */
    public final String f3490e;

    public UnauthorizedClientException(C0078e c0078e) {
        this.f3489d = c0078e.f291a;
        this.f3490e = c0078e.f292b;
        this.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UnauthorizedClientException.class != obj.getClass()) {
            return false;
        }
        UnauthorizedClientException unauthorizedClientException = (UnauthorizedClientException) obj;
        return AbstractC4154l.m8918a(this.f3489d, unauthorizedClientException.f3489d) && AbstractC4154l.m8918a(this.f3490e, unauthorizedClientException.f3490e);
    }

    public final int hashCode() {
        String str = this.f3489d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3490e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnauthorizedClientException(");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("error="), this.f3489d, ',', sb2, "errorDescription="), this.f3490e, sb2, ")");
    }
}
