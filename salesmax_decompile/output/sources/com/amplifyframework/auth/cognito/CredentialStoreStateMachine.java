package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.StateMachine;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.codegen.states.CredentialStoreState;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CredentialStoreStateMachine extends StateMachine<CredentialStoreState, Environment> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final CredentialStoreStateMachine logging(Environment environment) {
            sq8.m48649h(environment, "environment");
            return new CredentialStoreStateMachine(StateMachineResolver.DefaultImpls.logging$default(new CredentialStoreState.Resolver(CredentialStoreCognitoActions.INSTANCE), null, null, 3, null), environment);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialStoreStateMachine(StateMachineResolver<CredentialStoreState> stateMachineResolver, Environment environment) {
        super(stateMachineResolver, environment, null, null, null, 28, null);
        sq8.m48649h(stateMachineResolver, "resolver");
        sq8.m48649h(environment, "environment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CredentialStoreStateMachine(Environment environment) {
        this(new CredentialStoreState.Resolver(CredentialStoreCognitoActions.INSTANCE), environment);
        sq8.m48649h(environment, "environment");
    }
}
