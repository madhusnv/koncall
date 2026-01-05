package aws.sdk.kotlin.services.cognitoidentityprovider.model;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UsernameExistsException extends CognitoIdentityProviderException {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && UsernameExistsException.class == obj.getClass() && AbstractC4154l.m8918a(getMessage(), ((UsernameExistsException) obj).getMessage());
    }

    public final int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UsernameExistsException(");
        sb2.append("message=" + getMessage());
        sb2.append(")");
        return sb2.toString();
    }
}
