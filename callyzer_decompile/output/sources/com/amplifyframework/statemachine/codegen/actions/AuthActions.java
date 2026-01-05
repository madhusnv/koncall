package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface AuthActions {
    Action initializeAuthConfigurationAction(AuthEvent.EventType.ConfigureAuth configureAuth);

    Action initializeAuthenticationConfigurationAction(AuthEvent.EventType.ConfigureAuthentication configureAuthentication);

    Action initializeAuthorizationConfigurationAction(AuthEvent.EventType eventType);
}
