package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;

/* loaded from: classes5.dex */
public interface SignUpActions {
    Action confirmSignUpAction(SignUpEvent.EventType.ConfirmSignUp confirmSignUp);

    Action initiateSignUpAction(SignUpEvent.EventType.InitiateSignUp initiateSignUp);
}
