package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aa.C0078e;
import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InternalServerException extends SsoOidcException {

    /* renamed from: d */
    public final String f3477d;

    /* renamed from: e */
    public final String f3478e;

    public InternalServerException(C0078e c0078e) {
        this.f3477d = c0078e.f291a;
        this.f3478e = c0078e.f292b;
        this.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Server);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalServerException.class != obj.getClass()) {
            return false;
        }
        InternalServerException internalServerException = (InternalServerException) obj;
        return AbstractC4154l.m8918a(this.f3477d, internalServerException.f3477d) && AbstractC4154l.m8918a(this.f3478e, internalServerException.f3478e);
    }

    public final int hashCode() {
        String str = this.f3477d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3478e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InternalServerException(");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("error="), this.f3477d, ',', sb2, "errorDescription="), this.f3478e, sb2, ")");
    }
}
