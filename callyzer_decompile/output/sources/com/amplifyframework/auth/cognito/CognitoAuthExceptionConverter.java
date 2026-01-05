package com.amplifyframework.auth.cognito;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.AliasExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeDeliveryFailureException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeMismatchException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.EnableSoftwareTokenMfaException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ExpiredCodeException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidPasswordException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.LimitExceededException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.MfaMethodNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordResetRequiredException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.SoftwareTokenMfaNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyFailedAttemptsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserLambdaValidationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UsernameExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.WebAuthnNotEnabledException;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.exceptions.service.CodeExpiredException;
import com.amplifyframework.auth.cognito.exceptions.service.EnableSoftwareTokenMFAException;
import com.amplifyframework.auth.cognito.exceptions.service.FailedAttemptsLimitExceededException;
import com.amplifyframework.auth.cognito.exceptions.service.MFAMethodNotFoundException;
import com.amplifyframework.auth.cognito.exceptions.service.SoftwareTokenMFANotFoundException;
import com.amplifyframework.auth.exceptions.UnknownException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CognitoAuthExceptionConverter {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final AuthException lookup(Exception error, String fallbackMessage) {
            AbstractC4154l.m8923f(error, "error");
            AbstractC4154l.m8923f(fallbackMessage, "fallbackMessage");
            return error instanceof AuthException ? (AuthException) error : error instanceof UserNotFoundException ? new com.amplifyframework.auth.cognito.exceptions.service.UserNotFoundException(error) : error instanceof UserNotConfirmedException ? new com.amplifyframework.auth.cognito.exceptions.service.UserNotConfirmedException(error) : error instanceof UsernameExistsException ? new com.amplifyframework.auth.cognito.exceptions.service.UsernameExistsException(error) : error instanceof AliasExistsException ? new com.amplifyframework.auth.cognito.exceptions.service.AliasExistsException(error) : error instanceof InvalidPasswordException ? new com.amplifyframework.auth.cognito.exceptions.service.InvalidPasswordException(error) : error instanceof InvalidParameterException ? new com.amplifyframework.auth.cognito.exceptions.service.InvalidParameterException(null, error, 1, null) : error instanceof ExpiredCodeException ? new CodeExpiredException(error) : error instanceof CodeMismatchException ? new com.amplifyframework.auth.cognito.exceptions.service.CodeMismatchException(error) : error instanceof CodeDeliveryFailureException ? new com.amplifyframework.auth.cognito.exceptions.service.CodeDeliveryFailureException(error) : error instanceof LimitExceededException ? new com.amplifyframework.auth.cognito.exceptions.service.LimitExceededException(error) : error instanceof MfaMethodNotFoundException ? new MFAMethodNotFoundException(error) : error instanceof NotAuthorizedException ? new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, null, error, 3, null) : error instanceof ResourceNotFoundException ? new com.amplifyframework.auth.cognito.exceptions.service.ResourceNotFoundException(error) : error instanceof SoftwareTokenMfaNotFoundException ? new SoftwareTokenMFANotFoundException(error) : error instanceof TooManyFailedAttemptsException ? new FailedAttemptsLimitExceededException(error) : error instanceof TooManyRequestsException ? new com.amplifyframework.auth.cognito.exceptions.service.TooManyRequestsException(error) : error instanceof PasswordResetRequiredException ? new com.amplifyframework.auth.cognito.exceptions.service.PasswordResetRequiredException(error) : error instanceof EnableSoftwareTokenMfaException ? new EnableSoftwareTokenMFAException(error) : error instanceof UserLambdaValidationException ? new com.amplifyframework.auth.cognito.exceptions.service.UserLambdaValidationException(((UserLambdaValidationException) error).getMessage(), error) : error instanceof WebAuthnNotEnabledException ? new com.amplifyframework.auth.cognito.exceptions.service.WebAuthnNotEnabledException(error) : new UnknownException(fallbackMessage, error);
        }

        private Companion() {
        }
    }
}
