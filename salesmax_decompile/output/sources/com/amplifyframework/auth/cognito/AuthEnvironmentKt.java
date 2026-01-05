package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import p001o.kg3;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthEnvironmentKt {
    public static final AuthEvent.EventType isAuthEvent(StateMachineEvent stateMachineEvent) {
        sq8.m48649h(stateMachineEvent, "<this>");
        AuthEvent authEvent = stateMachineEvent instanceof AuthEvent ? (AuthEvent) stateMachineEvent : null;
        if (authEvent != null) {
            return authEvent.getEventType();
        }
        return null;
    }

    public static final AuthenticationEvent.EventType isAuthenticationEvent(StateMachineEvent stateMachineEvent) {
        sq8.m48649h(stateMachineEvent, "<this>");
        AuthenticationEvent authenticationEvent = stateMachineEvent instanceof AuthenticationEvent ? (AuthenticationEvent) stateMachineEvent : null;
        if (authenticationEvent != null) {
            return authenticationEvent.getEventType();
        }
        return null;
    }

    public static final AuthorizationEvent.EventType isAuthorizationEvent(StateMachineEvent stateMachineEvent) {
        sq8.m48649h(stateMachineEvent, "<this>");
        AuthorizationEvent authorizationEvent = stateMachineEvent instanceof AuthorizationEvent ? (AuthorizationEvent) stateMachineEvent : null;
        if (authorizationEvent != null) {
            return authorizationEvent.getEventType();
        }
        return null;
    }

    public static final DeleteUserEvent.EventType isDeleteUserEvent(StateMachineEvent stateMachineEvent) {
        sq8.m48649h(stateMachineEvent, "<this>");
        DeleteUserEvent deleteUserEvent = stateMachineEvent instanceof DeleteUserEvent ? (DeleteUserEvent) stateMachineEvent : null;
        if (deleteUserEvent != null) {
            return deleteUserEvent.getEventType();
        }
        return null;
    }

    public static final SignOutEvent.EventType isSignOutEvent(StateMachineEvent stateMachineEvent) {
        sq8.m48649h(stateMachineEvent, "<this>");
        SignOutEvent signOutEvent = stateMachineEvent instanceof SignOutEvent ? (SignOutEvent) stateMachineEvent : null;
        if (signOutEvent != null) {
            return signOutEvent.getEventType();
        }
        return null;
    }

    public static final SignUpEvent.EventType isSignUpEvent(StateMachineEvent stateMachineEvent) {
        sq8.m48649h(stateMachineEvent, "<this>");
        SignUpEvent signUpEvent = stateMachineEvent instanceof SignUpEvent ? (SignUpEvent) stateMachineEvent : null;
        if (signUpEvent != null) {
            return signUpEvent.getEventType();
        }
        return null;
    }

    public static final kg3 requireIdentityProviderClient(AuthEnvironment authEnvironment) throws InvalidStateException {
        sq8.m48649h(authEnvironment, "<this>");
        kg3 cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient != null) {
            return cognitoIdentityProviderClient;
        }
        throw new InvalidStateException("No Cognito identity provider client available", null, null, 6, null);
    }
}
