package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.exceptions.service.AliasExistsException;
import com.amplifyframework.auth.cognito.exceptions.service.CodeDeliveryFailureException;
import com.amplifyframework.auth.cognito.exceptions.service.CodeExpiredException;
import com.amplifyframework.auth.cognito.exceptions.service.CodeMismatchException;
import com.amplifyframework.auth.cognito.exceptions.service.EnableSoftwareTokenMFAException;
import com.amplifyframework.auth.cognito.exceptions.service.FailedAttemptsLimitExceededException;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidParameterException;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidPasswordException;
import com.amplifyframework.auth.cognito.exceptions.service.LimitExceededException;
import com.amplifyframework.auth.cognito.exceptions.service.MFAMethodNotFoundException;
import com.amplifyframework.auth.cognito.exceptions.service.PasswordResetRequiredException;
import com.amplifyframework.auth.cognito.exceptions.service.ResourceNotFoundException;
import com.amplifyframework.auth.cognito.exceptions.service.SoftwareTokenMFANotFoundException;
import com.amplifyframework.auth.cognito.exceptions.service.TooManyRequestsException;
import com.amplifyframework.auth.cognito.exceptions.service.UserLambdaValidationException;
import com.amplifyframework.auth.cognito.exceptions.service.UserNotConfirmedException;
import com.amplifyframework.auth.cognito.exceptions.service.UserNotFoundException;
import com.amplifyframework.auth.cognito.exceptions.service.UsernameExistsException;
import com.amplifyframework.auth.cognito.exceptions.service.WebAuthnNotEnabledException;
import com.amplifyframework.auth.exceptions.NotAuthorizedException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.google.firebase.messaging.Constants;
import p001o.bf3;
import p001o.dda;
import p001o.ef3;
import p001o.id5;
import p001o.krh;
import p001o.m0c;
import p001o.nei;
import p001o.no6;
import p001o.ns8;
import p001o.p90;
import p001o.peb;
import p001o.rrh;
import p001o.rzc;
import p001o.soe;
import p001o.sq8;
import p001o.tpi;
import p001o.uhi;
import p001o.v66;
import p001o.xhi;
import p001o.y4j;
import p001o.ys8;
import p001o.zyf;

/* loaded from: classes5.dex */
public final class CognitoAuthExceptionConverter {
    public static final Companion Companion = new Companion(null);
    private static final String defaultRecoveryMessage = "See attached exception for more details.";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final AuthException lookup(Exception exc, String str) {
            AuthException webAuthnNotEnabledException;
            sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            sq8.m48649h(str, "fallbackMessage");
            if (exc instanceof AuthException) {
                return (AuthException) exc;
            }
            if (exc instanceof xhi) {
                webAuthnNotEnabledException = new UserNotFoundException(exc);
            } else if (exc instanceof uhi) {
                webAuthnNotEnabledException = new UserNotConfirmedException(exc);
            } else if (exc instanceof tpi) {
                webAuthnNotEnabledException = new UsernameExistsException(exc);
            } else if (exc instanceof p90) {
                webAuthnNotEnabledException = new AliasExistsException(exc);
            } else if (exc instanceof ys8) {
                webAuthnNotEnabledException = new InvalidPasswordException(exc);
            } else if (exc instanceof ns8) {
                webAuthnNotEnabledException = new InvalidParameterException(null, exc, 1, null);
            } else if (exc instanceof no6) {
                webAuthnNotEnabledException = new CodeExpiredException(exc);
            } else if (exc instanceof ef3) {
                webAuthnNotEnabledException = new CodeMismatchException(exc);
            } else if (exc instanceof bf3) {
                webAuthnNotEnabledException = new CodeDeliveryFailureException(exc);
            } else if (exc instanceof dda) {
                webAuthnNotEnabledException = new LimitExceededException(exc);
            } else if (exc instanceof peb) {
                webAuthnNotEnabledException = new MFAMethodNotFoundException(exc);
            } else if (exc instanceof m0c) {
                webAuthnNotEnabledException = new NotAuthorizedException(null, null, exc, 3, null);
            } else if (exc instanceof soe) {
                webAuthnNotEnabledException = new ResourceNotFoundException(exc);
            } else if (exc instanceof zyf) {
                webAuthnNotEnabledException = new SoftwareTokenMFANotFoundException(exc);
            } else if (exc instanceof krh) {
                webAuthnNotEnabledException = new FailedAttemptsLimitExceededException(exc);
            } else if (exc instanceof rrh) {
                webAuthnNotEnabledException = new TooManyRequestsException(exc);
            } else if (exc instanceof rzc) {
                webAuthnNotEnabledException = new PasswordResetRequiredException(exc);
            } else if (exc instanceof v66) {
                webAuthnNotEnabledException = new EnableSoftwareTokenMFAException(exc);
            } else if (exc instanceof nei) {
                webAuthnNotEnabledException = new UserLambdaValidationException(((nei) exc).getMessage(), exc);
            } else {
                if (!(exc instanceof y4j)) {
                    return new UnknownException(str, exc);
                }
                webAuthnNotEnabledException = new WebAuthnNotEnabledException(exc);
            }
            return webAuthnNotEnabledException;
        }
    }
}
