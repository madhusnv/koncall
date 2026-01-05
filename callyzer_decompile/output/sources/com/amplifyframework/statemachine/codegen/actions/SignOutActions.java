package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface SignOutActions {
    Action buildRevokeTokenErrorAction(SignOutEvent.EventType.SignOutGloballyError signOutGloballyError);

    Action globalSignOutAction(SignOutEvent.EventType.SignOutGlobally signOutGlobally);

    Action hostedUISignOutAction(SignOutEvent.EventType.InvokeHostedUISignOut invokeHostedUISignOut);

    Action localSignOutAction(SignOutEvent.EventType.SignOutLocally signOutLocally);

    Action revokeTokenAction(SignOutEvent.EventType.RevokeToken revokeToken);

    Action userCancelledAction(SignOutEvent.EventType.UserCancelled userCancelled);
}
