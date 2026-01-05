package com.amplifyframework.auth.cognito.actions;

import a2.AbstractC0030c;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.DeleteUserActions;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeleteUserCognitoActions implements DeleteUserActions {
    public static final DeleteUserCognitoActions INSTANCE = new DeleteUserCognitoActions();

    private DeleteUserCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.DeleteUserActions
    public Action initDeleteUserAction(String accessToken) {
        AbstractC4154l.m8923f(accessToken, "accessToken");
        Action.Companion companion = Action.Companion;
        return new DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1("DeleteUser", accessToken);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.DeleteUserActions
    public Action initiateSignOut() {
        Action.Companion companion = Action.Companion;
        final String str = "Sign Out Deleted User";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions$initiateSignOut$$inlined$invoke$1

            /* renamed from: id, reason: collision with root package name */
            private final String f43736id;

            {
                this.f43736id = str == null ? super.getId() : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.UserDeleted(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(true, null, true, 2, null)), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", authorizationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authorizationEvent);
                AbstractC0030c.m132w(id2, " Sending event ", authenticationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authenticationEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43736id;
            }
        };
    }
}
