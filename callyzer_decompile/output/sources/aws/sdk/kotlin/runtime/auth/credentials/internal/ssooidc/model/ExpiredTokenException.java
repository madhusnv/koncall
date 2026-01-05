package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mb.d0;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ExpiredTokenException extends SsoOidcException {

    /* renamed from: d */
    public final String f3475d;

    /* renamed from: e */
    public final String f3476e;

    public ExpiredTokenException(d0 d0Var) {
        this.f3475d = d0Var.f23224a;
        this.f3476e = d0Var.f23225b;
        this.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExpiredTokenException.class != obj.getClass()) {
            return false;
        }
        ExpiredTokenException expiredTokenException = (ExpiredTokenException) obj;
        return AbstractC4154l.m8918a(this.f3475d, expiredTokenException.f3475d) && AbstractC4154l.m8918a(this.f3476e, expiredTokenException.f3476e);
    }

    public final int hashCode() {
        String str = this.f3475d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3476e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpiredTokenException(");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("error="), this.f3475d, ',', sb2, "errorDescription="), this.f3476e, sb2, ")");
    }
}
