package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;

/* loaded from: classes5.dex */
public interface HostedUIActions {
    Action fetchHostedUISignInToken(HostedUIEvent.EventType.FetchToken fetchToken, String str);

    Action showHostedUI(HostedUIEvent.EventType.ShowHostedUI showHostedUI);
}
