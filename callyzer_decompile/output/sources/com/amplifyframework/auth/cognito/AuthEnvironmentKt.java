package com.amplifyframework.auth.cognito;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthEnvironmentKt {
    public static final AuthEvent.EventType isAuthEvent(StateMachineEvent stateMachineEvent) {
        AbstractC4154l.m8923f(stateMachineEvent, "<this>");
        AuthEvent authEvent = stateMachineEvent instanceof AuthEvent ? (AuthEvent) stateMachineEvent : null;
        if (authEvent != null) {
            return authEvent.getEventType();
        }
        return null;
    }

    public static final AuthenticationEvent.EventType isAuthenticationEvent(StateMachineEvent stateMachineEvent) {
        AbstractC4154l.m8923f(stateMachineEvent, "<this>");
        AuthenticationEvent authenticationEvent = stateMachineEvent instanceof AuthenticationEvent ? (AuthenticationEvent) stateMachineEvent : null;
        if (authenticationEvent != null) {
            return authenticationEvent.getEventType();
        }
        return null;
    }

    public static final AuthorizationEvent.EventType isAuthorizationEvent(StateMachineEvent stateMachineEvent) {
        AbstractC4154l.m8923f(stateMachineEvent, "<this>");
        AuthorizationEvent authorizationEvent = stateMachineEvent instanceof AuthorizationEvent ? (AuthorizationEvent) stateMachineEvent : null;
        if (authorizationEvent != null) {
            return authorizationEvent.getEventType();
        }
        return null;
    }

    public static final DeleteUserEvent.EventType isDeleteUserEvent(StateMachineEvent stateMachineEvent) {
        AbstractC4154l.m8923f(stateMachineEvent, "<this>");
        DeleteUserEvent deleteUserEvent = stateMachineEvent instanceof DeleteUserEvent ? (DeleteUserEvent) stateMachineEvent : null;
        if (deleteUserEvent != null) {
            return deleteUserEvent.getEventType();
        }
        return null;
    }

    public static final SignOutEvent.EventType isSignOutEvent(StateMachineEvent stateMachineEvent) {
        AbstractC4154l.m8923f(stateMachineEvent, "<this>");
        SignOutEvent signOutEvent = stateMachineEvent instanceof SignOutEvent ? (SignOutEvent) stateMachineEvent : null;
        if (signOutEvent != null) {
            return signOutEvent.getEventType();
        }
        return null;
    }

    public static final SignUpEvent.EventType isSignUpEvent(StateMachineEvent stateMachineEvent) {
        AbstractC4154l.m8923f(stateMachineEvent, "<this>");
        SignUpEvent signUpEvent = stateMachineEvent instanceof SignUpEvent ? (SignUpEvent) stateMachineEvent : null;
        if (signUpEvent != null) {
            return signUpEvent.getEventType();
        }
        return null;
    }

    public static final InterfaceC0086d requireIdentityProviderClient(AuthEnvironment authEnvironment) throws InvalidStateException {
        AbstractC4154l.m8923f(authEnvironment, "<this>");
        InterfaceC0086d cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient != null) {
            return cognitoIdentityProviderClient;
        }
        throw new InvalidStateException("No Cognito identity provider client available", null, null, 6, null);
    }
}
