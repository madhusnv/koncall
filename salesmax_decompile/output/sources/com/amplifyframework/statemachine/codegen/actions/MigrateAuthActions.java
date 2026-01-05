package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;

/* loaded from: classes5.dex */
public interface MigrateAuthActions {
    Action initiateMigrateAuthAction(SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth);
}
