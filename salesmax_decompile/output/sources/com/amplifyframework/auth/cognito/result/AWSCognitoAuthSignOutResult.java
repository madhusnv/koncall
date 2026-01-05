package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.result.AuthSignOutResult;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class AWSCognitoAuthSignOutResult extends AuthSignOutResult {

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

    public static final class FailedSignOut extends AWSCognitoAuthSignOutResult {
        private final AuthException exception;
        private final boolean signedOutLocally;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedSignOut(AuthException authException) {
            super(null);
            sq8.m48649h(authException, "exception");
            this.exception = authException;
        }

        public static /* synthetic */ FailedSignOut copy$default(FailedSignOut failedSignOut, AuthException authException, int i, Object obj) {
            if ((i & 1) != 0) {
                authException = failedSignOut.exception;
            }
            return failedSignOut.copy(authException);
        }

        public final AuthException component1() {
            return this.exception;
        }

        public final FailedSignOut copy(AuthException authException) {
            sq8.m48649h(authException, "exception");
            return new FailedSignOut(authException);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FailedSignOut) && sq8.m48644c(this.exception, ((FailedSignOut) obj).exception);
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

    public static final class PartialSignOut extends AWSCognitoAuthSignOutResult {
        private final GlobalSignOutError globalSignOutError;
        private final HostedUIError hostedUIError;
        private final RevokeTokenError revokeTokenError;
        private final boolean signedOutLocally;

        public PartialSignOut() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ PartialSignOut copy$default(PartialSignOut partialSignOut, HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError, int i, Object obj) {
            if ((i & 1) != 0) {
                hostedUIError = partialSignOut.hostedUIError;
            }
            if ((i & 2) != 0) {
                globalSignOutError = partialSignOut.globalSignOutError;
            }
            if ((i & 4) != 0) {
                revokeTokenError = partialSignOut.revokeTokenError;
            }
            return partialSignOut.copy(hostedUIError, globalSignOutError, revokeTokenError);
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

        public final PartialSignOut copy(HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError) {
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
            return sq8.m48644c(this.hostedUIError, partialSignOut.hostedUIError) && sq8.m48644c(this.globalSignOutError, partialSignOut.globalSignOutError) && sq8.m48644c(this.revokeTokenError, partialSignOut.revokeTokenError);
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

        public /* synthetic */ PartialSignOut(HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError, int i, id5 id5Var) {
            this((i & 1) != 0 ? null : hostedUIError, (i & 2) != 0 ? null : globalSignOutError, (i & 4) != 0 ? null : revokeTokenError);
        }

        public PartialSignOut(HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError) {
            super(null);
            this.hostedUIError = hostedUIError;
            this.globalSignOutError = globalSignOutError;
            this.revokeTokenError = revokeTokenError;
            this.signedOutLocally = true;
        }
    }

    public /* synthetic */ AWSCognitoAuthSignOutResult(id5 id5Var) {
        this();
    }

    public abstract boolean getSignedOutLocally();

    private AWSCognitoAuthSignOutResult() {
    }
}
