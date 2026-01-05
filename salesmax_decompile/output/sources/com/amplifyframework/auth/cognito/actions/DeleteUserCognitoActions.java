package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.DeleteUserActions;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import p001o.n64;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class DeleteUserCognitoActions implements DeleteUserActions {
    public static final DeleteUserCognitoActions INSTANCE = new DeleteUserCognitoActions();

    private DeleteUserCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.DeleteUserActions
    public Action initDeleteUserAction(String str) {
        sq8.m48649h(str, "accessToken");
        Action.Companion companion = Action.Companion;
        return new DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1("DeleteUser", str);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.DeleteUserActions
    public Action initiateSignOut() {
        Action.Companion companion = Action.Companion;
        final String str = "Sign Out Deleted User";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions$initiateSignOut$$inlined$invoke$1
            private final String id;

            {
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.UserDeleted(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(true, null, true, 2, null)), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
                eventDispatcher.send(authorizationEvent);
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher.send(authenticationEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }
}
