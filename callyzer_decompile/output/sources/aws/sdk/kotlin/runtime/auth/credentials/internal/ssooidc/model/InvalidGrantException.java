package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import eb.f2;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InvalidGrantException extends SsoOidcException {

    /* renamed from: d */
    public final String f3481d;

    /* renamed from: e */
    public final String f3482e;

    public InvalidGrantException(f2 f2Var) {
        this.f3481d = f2Var.f9311a;
        this.f3482e = f2Var.f9312b;
        this.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidGrantException.class != obj.getClass()) {
            return false;
        }
        InvalidGrantException invalidGrantException = (InvalidGrantException) obj;
        return AbstractC4154l.m8918a(this.f3481d, invalidGrantException.f3481d) && AbstractC4154l.m8918a(this.f3482e, invalidGrantException.f3482e);
    }

    public final int hashCode() {
        String str = this.f3481d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3482e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InvalidGrantException(");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("error="), this.f3481d, ',', sb2, "errorDescription="), this.f3482e, sb2, ")");
    }
}
