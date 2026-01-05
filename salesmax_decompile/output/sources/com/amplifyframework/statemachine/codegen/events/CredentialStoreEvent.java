package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CredentialStoreEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58122type;

    public static abstract class EventType {

        public static final class ClearCredentialStore extends EventType {
            private final CredentialType credentialType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClearCredentialStore(CredentialType credentialType) {
                super(null);
                sq8.m48649h(credentialType, "credentialType");
                this.credentialType = credentialType;
            }

            public static /* synthetic */ ClearCredentialStore copy$default(ClearCredentialStore clearCredentialStore, CredentialType credentialType, int i, Object obj) {
                if ((i & 1) != 0) {
                    credentialType = clearCredentialStore.credentialType;
                }
                return clearCredentialStore.copy(credentialType);
            }

            public final CredentialType component1() {
                return this.credentialType;
            }

            public final ClearCredentialStore copy(CredentialType credentialType) {
                sq8.m48649h(credentialType, "credentialType");
                return new ClearCredentialStore(credentialType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClearCredentialStore) && sq8.m48644c(this.credentialType, ((ClearCredentialStore) obj).credentialType);
            }

            public final CredentialType getCredentialType() {
                return this.credentialType;
            }

            public int hashCode() {
                return this.credentialType.hashCode();
            }

            public String toString() {
                return "ClearCredentialStore(credentialType=" + this.credentialType + ")";
            }
        }

        public static final class CompletedOperation extends EventType {
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompletedOperation(AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(amplifyCredential, "storedCredentials");
                this.storedCredentials = amplifyCredential;
            }

            public static /* synthetic */ CompletedOperation copy$default(CompletedOperation completedOperation, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = completedOperation.storedCredentials;
                }
                return completedOperation.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.storedCredentials;
            }

            public final CompletedOperation copy(AmplifyCredential amplifyCredential) {
                sq8.m48649h(amplifyCredential, "storedCredentials");
                return new CompletedOperation(amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CompletedOperation) && sq8.m48644c(this.storedCredentials, ((CompletedOperation) obj).storedCredentials);
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return this.storedCredentials.hashCode();
            }

            public String toString() {
                return "CompletedOperation(storedCredentials=" + this.storedCredentials + ")";
            }
        }

        public static final class LoadCredentialStore extends EventType {
            private final CredentialType credentialType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadCredentialStore(CredentialType credentialType) {
                super(null);
                sq8.m48649h(credentialType, "credentialType");
                this.credentialType = credentialType;
            }

            public static /* synthetic */ LoadCredentialStore copy$default(LoadCredentialStore loadCredentialStore, CredentialType credentialType, int i, Object obj) {
                if ((i & 1) != 0) {
                    credentialType = loadCredentialStore.credentialType;
                }
                return loadCredentialStore.copy(credentialType);
            }

            public final CredentialType component1() {
                return this.credentialType;
            }

            public final LoadCredentialStore copy(CredentialType credentialType) {
                sq8.m48649h(credentialType, "credentialType");
                return new LoadCredentialStore(credentialType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadCredentialStore) && sq8.m48644c(this.credentialType, ((LoadCredentialStore) obj).credentialType);
            }

            public final CredentialType getCredentialType() {
                return this.credentialType;
            }

            public int hashCode() {
                return this.credentialType.hashCode();
            }

            public String toString() {
                return "LoadCredentialStore(credentialType=" + this.credentialType + ")";
            }
        }

        public static final class MigrateLegacyCredentialStore extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public MigrateLegacyCredentialStore() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ MigrateLegacyCredentialStore copy$default(MigrateLegacyCredentialStore migrateLegacyCredentialStore, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = migrateLegacyCredentialStore.id;
                }
                return migrateLegacyCredentialStore.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final MigrateLegacyCredentialStore copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new MigrateLegacyCredentialStore(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MigrateLegacyCredentialStore) && sq8.m48644c(this.id, ((MigrateLegacyCredentialStore) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "MigrateLegacyCredentialStore(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MigrateLegacyCredentialStore(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ MigrateLegacyCredentialStore(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class MoveToIdleState extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public MoveToIdleState() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ MoveToIdleState copy$default(MoveToIdleState moveToIdleState, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = moveToIdleState.id;
                }
                return moveToIdleState.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final MoveToIdleState copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new MoveToIdleState(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MoveToIdleState) && sq8.m48644c(this.id, ((MoveToIdleState) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "MoveToIdleState(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoveToIdleState(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ MoveToIdleState(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class StoreCredentials extends EventType {
            private final CredentialType credentialType;
            private final AmplifyCredential credentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StoreCredentials(CredentialType credentialType, AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(credentialType, "credentialType");
                sq8.m48649h(amplifyCredential, "credentials");
                this.credentialType = credentialType;
                this.credentials = amplifyCredential;
            }

            public static /* synthetic */ StoreCredentials copy$default(StoreCredentials storeCredentials, CredentialType credentialType, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    credentialType = storeCredentials.credentialType;
                }
                if ((i & 2) != 0) {
                    amplifyCredential = storeCredentials.credentials;
                }
                return storeCredentials.copy(credentialType, amplifyCredential);
            }

            public final CredentialType component1() {
                return this.credentialType;
            }

            public final AmplifyCredential component2() {
                return this.credentials;
            }

            public final StoreCredentials copy(CredentialType credentialType, AmplifyCredential amplifyCredential) {
                sq8.m48649h(credentialType, "credentialType");
                sq8.m48649h(amplifyCredential, "credentials");
                return new StoreCredentials(credentialType, amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StoreCredentials)) {
                    return false;
                }
                StoreCredentials storeCredentials = (StoreCredentials) obj;
                return sq8.m48644c(this.credentialType, storeCredentials.credentialType) && sq8.m48644c(this.credentials, storeCredentials.credentials);
            }

            public final CredentialType getCredentialType() {
                return this.credentialType;
            }

            public final AmplifyCredential getCredentials() {
                return this.credentials;
            }

            public int hashCode() {
                return (this.credentialType.hashCode() * 31) + this.credentials.hashCode();
            }

            public String toString() {
                return "StoreCredentials(credentialType=" + this.credentialType + ", credentials=" + this.credentials + ")";
            }
        }

        public static final class ThrowError extends EventType {
            private final CredentialStoreError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(CredentialStoreError credentialStoreError) {
                super(null);
                sq8.m48649h(credentialStoreError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                this.error = credentialStoreError;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, CredentialStoreError credentialStoreError, int i, Object obj) {
                if ((i & 1) != 0) {
                    credentialStoreError = throwError.error;
                }
                return throwError.copy(credentialStoreError);
            }

            public final CredentialStoreError component1() {
                return this.error;
            }

            public final ThrowError copy(CredentialStoreError credentialStoreError) {
                sq8.m48649h(credentialStoreError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                return new ThrowError(credentialStoreError);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && sq8.m48644c(this.error, ((ThrowError) obj).error);
            }

            public final CredentialStoreError getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "ThrowError(error=" + this.error + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public CredentialStoreEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58122type = simpleName;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.f58122type;
    }

    public /* synthetic */ CredentialStoreEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
