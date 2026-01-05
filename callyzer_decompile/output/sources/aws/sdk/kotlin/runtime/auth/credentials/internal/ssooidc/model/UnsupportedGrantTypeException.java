package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import eb.p1;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UnsupportedGrantTypeException extends SsoOidcException {

    /* renamed from: d */
    public final String f3491d;

    /* renamed from: e */
    public final String f3492e;

    public UnsupportedGrantTypeException(p1 p1Var) {
        this.f3491d = p1Var.f9409a;
        this.f3492e = p1Var.f9410b;
        this.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UnsupportedGrantTypeException.class != obj.getClass()) {
            return false;
        }
        UnsupportedGrantTypeException unsupportedGrantTypeException = (UnsupportedGrantTypeException) obj;
        return AbstractC4154l.m8918a(this.f3491d, unsupportedGrantTypeException.f3491d) && AbstractC4154l.m8918a(this.f3492e, unsupportedGrantTypeException.f3492e);
    }

    public final int hashCode() {
        String str = this.f3491d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3492e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnsupportedGrantTypeException(");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("error="), this.f3491d, ',', sb2, "errorDescription="), this.f3492e, sb2, ")");
    }
}
