package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.ch3;
import p001o.id5;
import p001o.sq8;
import p001o.szb;

/* loaded from: classes5.dex */
public abstract class CredentialStoreState implements State {

    /* renamed from: type, reason: collision with root package name */
    private final String f58137type;

    public static final class ClearingCredentials extends CredentialStoreState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public ClearingCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ClearingCredentials copy$default(ClearingCredentials clearingCredentials, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clearingCredentials.id;
            }
            return clearingCredentials.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final ClearingCredentials copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new ClearingCredentials(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClearingCredentials) && sq8.m48644c(this.id, ((ClearingCredentials) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ClearingCredentials(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearingCredentials(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ ClearingCredentials(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends CredentialStoreState {
        private final CredentialStoreError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(CredentialStoreError credentialStoreError) {
            super(null);
            sq8.m48649h(credentialStoreError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.error = credentialStoreError;
        }

        public static /* synthetic */ Error copy$default(Error error, CredentialStoreError credentialStoreError, int i, Object obj) {
            if ((i & 1) != 0) {
                credentialStoreError = error.error;
            }
            return error.copy(credentialStoreError);
        }

        public final CredentialStoreError component1() {
            return this.error;
        }

        public final Error copy(CredentialStoreError credentialStoreError) {
            sq8.m48649h(credentialStoreError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            return new Error(credentialStoreError);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && sq8.m48644c(this.error, ((Error) obj).error);
        }

        public final CredentialStoreError getError() {
            return this.error;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.error.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    public static final class Idle extends CredentialStoreState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Idle() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Idle copy$default(Idle idle, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idle.id;
            }
            return idle.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Idle copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Idle(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Idle) && sq8.m48644c(this.id, ((Idle) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Idle(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Idle(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Idle(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class LoadingStoredCredentials extends CredentialStoreState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadingStoredCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ LoadingStoredCredentials copy$default(LoadingStoredCredentials loadingStoredCredentials, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadingStoredCredentials.id;
            }
            return loadingStoredCredentials.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final LoadingStoredCredentials copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new LoadingStoredCredentials(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingStoredCredentials) && sq8.m48644c(this.id, ((LoadingStoredCredentials) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "LoadingStoredCredentials(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingStoredCredentials(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ LoadingStoredCredentials(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class MigratingLegacyStore extends CredentialStoreState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public MigratingLegacyStore() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ MigratingLegacyStore copy$default(MigratingLegacyStore migratingLegacyStore, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = migratingLegacyStore.id;
            }
            return migratingLegacyStore.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final MigratingLegacyStore copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new MigratingLegacyStore(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MigratingLegacyStore) && sq8.m48644c(this.id, ((MigratingLegacyStore) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "MigratingLegacyStore(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MigratingLegacyStore(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ MigratingLegacyStore(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class NotConfigured extends CredentialStoreState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotConfigured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotConfigured copy$default(NotConfigured notConfigured, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notConfigured.id;
            }
            return notConfigured.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final NotConfigured copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new NotConfigured(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotConfigured) && sq8.m48644c(this.id, ((NotConfigured) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "NotConfigured(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConfigured(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ NotConfigured(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Resolver implements StateMachineResolver<CredentialStoreState> {
        private final CredentialStoreActions credentialStoreActions;
        private final NotConfigured defaultState;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(CredentialStoreActions credentialStoreActions) {
            sq8.m48649h(credentialStoreActions, "credentialStoreActions");
            this.credentialStoreActions = credentialStoreActions;
            this.defaultState = new NotConfigured(null, 1, 0 == true ? 1 : 0);
        }

        private final CredentialStoreEvent.EventType asCredentialStoreEvent(StateMachineEvent stateMachineEvent) {
            CredentialStoreEvent credentialStoreEvent = stateMachineEvent instanceof CredentialStoreEvent ? (CredentialStoreEvent) stateMachineEvent : null;
            if (credentialStoreEvent != null) {
                return credentialStoreEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<CredentialStoreState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<CredentialStoreState, StateMachineResolver<CredentialStoreState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<CredentialStoreState> resolve(CredentialStoreState credentialStoreState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(credentialStoreState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            StateResolution<CredentialStoreState> stateResolution = new StateResolution<>(credentialStoreState, null, 2, null);
            CredentialStoreEvent.EventType eventTypeAsCredentialStoreEvent = asCredentialStoreEvent(stateMachineEvent);
            int i = 1;
            if (credentialStoreState instanceof NotConfigured) {
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.MigrateLegacyCredentialStore ? true : eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.LoadCredentialStore) {
                    return new StateResolution<>(new MigratingLegacyStore(str, i, objArr11 == true ? 1 : 0), bh3.m18963e(this.credentialStoreActions.migrateLegacyCredentialStoreAction()));
                }
                return stateResolution;
            }
            if (credentialStoreState instanceof MigratingLegacyStore) {
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.LoadCredentialStore) {
                    return new StateResolution<>(new LoadingStoredCredentials(objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0), bh3.m18963e(this.credentialStoreActions.loadCredentialStoreAction(((CredentialStoreEvent.EventType.LoadCredentialStore) eventTypeAsCredentialStoreEvent).getCredentialType())));
                }
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(((CredentialStoreEvent.EventType.ThrowError) eventTypeAsCredentialStoreEvent).getError()), bh3.m18963e(this.credentialStoreActions.moveToIdleStateAction()));
                }
                return stateResolution;
            }
            if (credentialStoreState instanceof LoadingStoredCredentials ? true : credentialStoreState instanceof StoringCredentials ? true : credentialStoreState instanceof ClearingCredentials) {
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.CompletedOperation) {
                    return new StateResolution<>(new Success(((CredentialStoreEvent.EventType.CompletedOperation) eventTypeAsCredentialStoreEvent).getStoredCredentials()), bh3.m18963e(this.credentialStoreActions.moveToIdleStateAction()));
                }
                return eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.ThrowError ? new StateResolution<>(new Error(((CredentialStoreEvent.EventType.ThrowError) eventTypeAsCredentialStoreEvent).getError()), null, 2, null) : stateResolution;
            }
            if (!(credentialStoreState instanceof Idle)) {
                if (credentialStoreState instanceof Success ? true : credentialStoreState instanceof Error) {
                    return eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.MoveToIdleState ? new StateResolution<>(new Idle(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), ch3.m21246k()) : new StateResolution<>(credentialStoreState, null, 2, null);
                }
                throw new szb();
            }
            if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.ClearCredentialStore) {
                return new StateResolution<>(new ClearingCredentials(objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0), bh3.m18963e(this.credentialStoreActions.clearCredentialStoreAction(((CredentialStoreEvent.EventType.ClearCredentialStore) eventTypeAsCredentialStoreEvent).getCredentialType())));
            }
            if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.LoadCredentialStore) {
                return new StateResolution<>(new LoadingStoredCredentials(objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), bh3.m18963e(this.credentialStoreActions.loadCredentialStoreAction(((CredentialStoreEvent.EventType.LoadCredentialStore) eventTypeAsCredentialStoreEvent).getCredentialType())));
            }
            if (!(eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.StoreCredentials)) {
                return new StateResolution<>(credentialStoreState, null, 2, null);
            }
            CredentialStoreEvent.EventType.StoreCredentials storeCredentials = (CredentialStoreEvent.EventType.StoreCredentials) eventTypeAsCredentialStoreEvent;
            return new StateResolution<>(new StoringCredentials(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), bh3.m18963e(this.credentialStoreActions.storeCredentialsAction(storeCredentials.getCredentialType(), storeCredentials.getCredentials())));
        }
    }

    public static final class StoringCredentials extends CredentialStoreState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public StoringCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ StoringCredentials copy$default(StoringCredentials storingCredentials, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = storingCredentials.id;
            }
            return storingCredentials.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final StoringCredentials copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new StoringCredentials(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StoringCredentials) && sq8.m48644c(this.id, ((StoringCredentials) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "StoringCredentials(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoringCredentials(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ StoringCredentials(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Success extends CredentialStoreState {
        private final AmplifyCredential storedCredentials;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(AmplifyCredential amplifyCredential) {
            super(null);
            sq8.m48649h(amplifyCredential, "storedCredentials");
            this.storedCredentials = amplifyCredential;
        }

        public static /* synthetic */ Success copy$default(Success success, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = success.storedCredentials;
            }
            return success.copy(amplifyCredential);
        }

        public final AmplifyCredential component1() {
            return this.storedCredentials;
        }

        public final Success copy(AmplifyCredential amplifyCredential) {
            sq8.m48649h(amplifyCredential, "storedCredentials");
            return new Success(amplifyCredential);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && sq8.m48644c(this.storedCredentials, ((Success) obj).storedCredentials);
        }

        public final AmplifyCredential getStoredCredentials() {
            return this.storedCredentials;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.storedCredentials.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Success(storedCredentials=" + this.storedCredentials + ")";
        }
    }

    public /* synthetic */ CredentialStoreState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return this.f58137type;
    }

    private CredentialStoreState() {
        this.f58137type = toString();
    }
}
