package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.result.AuthSignOutResult;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AWSCognitoAuthSignOutResult extends AuthSignOutResult {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CompleteSignOut extends AWSCognitoAuthSignOutResult {
        public static final CompleteSignOut INSTANCE = new CompleteSignOut();
        private static final boolean signedOutLocally = true;

        private CompleteSignOut() {
            super(null);
        }

        @Override // com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult
        public boolean getSignedOutLocally() {
            return signedOutLocally;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class FailedSignOut extends AWSCognitoAuthSignOutResult {
        private final AuthException exception;
        private final boolean signedOutLocally;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedSignOut(AuthException exception) {
            super(null);
            AbstractC4154l.m8923f(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ FailedSignOut copy$aws_auth_cognito_release$default(FailedSignOut failedSignOut, AuthException authException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                authException = failedSignOut.exception;
            }
            return failedSignOut.copy$aws_auth_cognito_release(authException);
        }

        public final AuthException component1() {
            return this.exception;
        }

        public final FailedSignOut copy$aws_auth_cognito_release(AuthException exception) {
            AbstractC4154l.m8923f(exception, "exception");
            return new FailedSignOut(exception);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FailedSignOut) && AbstractC4154l.m8918a(this.exception, ((FailedSignOut) obj).exception);
        }

        public final AuthException getException() {
            return this.exception;
        }

        @Override // com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult
        public boolean getSignedOutLocally() {
            return this.signedOutLocally;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "FailedSignOut(exception=" + this.exception + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class PartialSignOut extends AWSCognitoAuthSignOutResult {
        private final GlobalSignOutError globalSignOutError;
        private final HostedUIError hostedUIError;
        private final RevokeTokenError revokeTokenError;
        private final boolean signedOutLocally;

        public PartialSignOut() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ PartialSignOut copy$aws_auth_cognito_release$default(PartialSignOut partialSignOut, HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                hostedUIError = partialSignOut.hostedUIError;
            }
            if ((i10 & 2) != 0) {
                globalSignOutError = partialSignOut.globalSignOutError;
            }
            if ((i10 & 4) != 0) {
                revokeTokenError = partialSignOut.revokeTokenError;
            }
            return partialSignOut.copy$aws_auth_cognito_release(hostedUIError, globalSignOutError, revokeTokenError);
        }

        public final HostedUIError component1() {
            return this.hostedUIError;
        }

        public final GlobalSignOutError component2() {
            return this.globalSignOutError;
        }

        public final RevokeTokenError component3() {
            return this.revokeTokenError;
        }

        public final PartialSignOut copy$aws_auth_cognito_release(HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError) {
            return new PartialSignOut(hostedUIError, globalSignOutError, revokeTokenError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PartialSignOut)) {
                return false;
            }
            PartialSignOut partialSignOut = (PartialSignOut) obj;
            return AbstractC4154l.m8918a(this.hostedUIError, partialSignOut.hostedUIError) && AbstractC4154l.m8918a(this.globalSignOutError, partialSignOut.globalSignOutError) && AbstractC4154l.m8918a(this.revokeTokenError, partialSignOut.revokeTokenError);
        }

        public final GlobalSignOutError getGlobalSignOutError() {
            return this.globalSignOutError;
        }

        public final HostedUIError getHostedUIError() {
            return this.hostedUIError;
        }

        public final RevokeTokenError getRevokeTokenError() {
            return this.revokeTokenError;
        }

        @Override // com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult
        public boolean getSignedOutLocally() {
            return this.signedOutLocally;
        }

        public int hashCode() {
            HostedUIError hostedUIError = this.hostedUIError;
            int iHashCode = (hostedUIError == null ? 0 : hostedUIError.hashCode()) * 31;
            GlobalSignOutError globalSignOutError = this.globalSignOutError;
            int iHashCode2 = (iHashCode + (globalSignOutError == null ? 0 : globalSignOutError.hashCode())) * 31;
            RevokeTokenError revokeTokenError = this.revokeTokenError;
            return iHashCode2 + (revokeTokenError != null ? revokeTokenError.hashCode() : 0);
        }

        public String toString() {
            return "PartialSignOut(hostedUIError=" + this.hostedUIError + ", globalSignOutError=" + this.globalSignOutError + ", revokeTokenError=" + this.revokeTokenError + ")";
        }

        public /* synthetic */ PartialSignOut(HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? null : hostedUIError, (i10 & 2) != 0 ? null : globalSignOutError, (i10 & 4) != 0 ? null : revokeTokenError);
        }

        public PartialSignOut(HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError) {
            super(null);
            this.hostedUIError = hostedUIError;
            this.globalSignOutError = globalSignOutError;
            this.revokeTokenError = revokeTokenError;
            this.signedOutLocally = true;
        }
    }

    public /* synthetic */ AWSCognitoAuthSignOutResult(AbstractC4148f abstractC4148f) {
        this();
    }

    public abstract boolean getSignedOutLocally();

    private AWSCognitoAuthSignOutResult() {
    }
}
