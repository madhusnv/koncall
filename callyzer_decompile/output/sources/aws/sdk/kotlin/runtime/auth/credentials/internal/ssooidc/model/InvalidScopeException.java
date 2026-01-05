package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import eb.C1981e;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InvalidScopeException extends SsoOidcException {

    /* renamed from: d */
    public final String f3485d;

    /* renamed from: e */
    public final String f3486e;

    public InvalidScopeException(C1981e c1981e) {
        this.f3485d = c1981e.f9297a;
        this.f3486e = c1981e.f9298b;
        this.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidScopeException.class != obj.getClass()) {
            return false;
        }
        InvalidScopeException invalidScopeException = (InvalidScopeException) obj;
        return AbstractC4154l.m8918a(this.f3485d, invalidScopeException.f3485d) && AbstractC4154l.m8918a(this.f3486e, invalidScopeException.f3486e);
    }

    public final int hashCode() {
        String str = this.f3485d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3486e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InvalidScopeException(");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("error="), this.f3485d, ',', sb2, "errorDescription="), this.f3486e, sb2, ")");
    }
}
