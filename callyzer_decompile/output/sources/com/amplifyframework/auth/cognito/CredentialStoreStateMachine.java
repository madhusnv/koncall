package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.StateMachine;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.codegen.states.CredentialStoreState;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialStoreStateMachine extends StateMachine<CredentialStoreState, Environment> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final CredentialStoreStateMachine logging(Environment environment) {
            AbstractC4154l.m8923f(environment, "environment");
            return new CredentialStoreStateMachine(StateMachineResolver.logging$default(new CredentialStoreState.Resolver(CredentialStoreCognitoActions.INSTANCE), null, null, 3, null), environment);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialStoreStateMachine(StateMachineResolver<CredentialStoreState> resolver, Environment environment) {
        super(resolver, environment, null, null, null, 28, null);
        AbstractC4154l.m8923f(resolver, "resolver");
        AbstractC4154l.m8923f(environment, "environment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CredentialStoreStateMachine(Environment environment) {
        this(new CredentialStoreState.Resolver(CredentialStoreCognitoActions.INSTANCE), environment);
        AbstractC4154l.m8923f(environment, "environment");
    }
}
