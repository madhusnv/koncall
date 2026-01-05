package aws.sdk.kotlin.services.cognitoidentityprovider.model;

import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import eb.f2;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InvalidParameterException extends CognitoIdentityProviderException {

    /* renamed from: d */
    public final String f3494d;

    public InvalidParameterException(f2 f2Var) {
        super(f2Var.f9311a);
        this.f3494d = f2Var.f9312b;
        this.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidParameterException.class != obj.getClass()) {
            return false;
        }
        InvalidParameterException invalidParameterException = (InvalidParameterException) obj;
        return AbstractC4154l.m8918a(getMessage(), invalidParameterException.getMessage()) && AbstractC4154l.m8918a(this.f3494d, invalidParameterException.f3494d);
    }

    public final int hashCode() {
        String message = getMessage();
        int iHashCode = (message != null ? message.hashCode() : 0) * 31;
        String str = this.f3494d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InvalidParameterException(");
        sb2.append("message=" + getMessage() + ',');
        return AbstractC4801l.m9737k(new StringBuilder("reasonCode="), this.f3494d, sb2, ")");
    }
}
