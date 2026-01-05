package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;

/* loaded from: classes5.dex */
public interface AuthActions {
    Action initializeAuthConfigurationAction(AuthEvent.EventType.ConfigureAuth configureAuth);

    Action initializeAuthenticationConfigurationAction(AuthEvent.EventType.ConfigureAuthentication configureAuthentication);

    Action initializeAuthorizationConfigurationAction(AuthEvent.EventType eventType);
}
