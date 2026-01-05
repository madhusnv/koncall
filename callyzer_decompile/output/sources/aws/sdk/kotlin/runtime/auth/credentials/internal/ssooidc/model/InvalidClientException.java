package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import eb.p1;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InvalidClientException extends SsoOidcException {

    /* renamed from: d */
    public final String f3479d;

    /* renamed from: e */
    public final String f3480e;

    public InvalidClientException(p1 p1Var) {
        this.f3479d = p1Var.f9409a;
        this.f3480e = p1Var.f9410b;
        this.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidClientException.class != obj.getClass()) {
            return false;
        }
        InvalidClientException invalidClientException = (InvalidClientException) obj;
        return AbstractC4154l.m8918a(this.f3479d, invalidClientException.f3479d) && AbstractC4154l.m8918a(this.f3480e, invalidClientException.f3480e);
    }

    public final int hashCode() {
        String str = this.f3479d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3480e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InvalidClientException(");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("error="), this.f3479d, ',', sb2, "errorDescription="), this.f3480e, sb2, ")");
    }
}
