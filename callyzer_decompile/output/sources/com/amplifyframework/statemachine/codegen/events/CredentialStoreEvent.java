package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialStoreEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ClearCredentialStore extends EventType {
            private final CredentialType credentialType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClearCredentialStore(CredentialType credentialType) {
                super(null);
                AbstractC4154l.m8923f(credentialType, "credentialType");
                this.credentialType = credentialType;
            }

            public static /* synthetic */ ClearCredentialStore copy$default(ClearCredentialStore clearCredentialStore, CredentialType credentialType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    credentialType = clearCredentialStore.credentialType;
                }
                return clearCredentialStore.copy(credentialType);
            }

            public final CredentialType component1() {
                return this.credentialType;
            }

            public final ClearCredentialStore copy(CredentialType credentialType) {
                AbstractC4154l.m8923f(credentialType, "credentialType");
                return new ClearCredentialStore(credentialType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClearCredentialStore) && AbstractC4154l.m8918a(this.credentialType, ((ClearCredentialStore) obj).credentialType);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class CompletedOperation extends EventType {
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompletedOperation(AmplifyCredential storedCredentials) {
                super(null);
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                this.storedCredentials = storedCredentials;
            }

            public static /* synthetic */ CompletedOperation copy$default(CompletedOperation completedOperation, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    amplifyCredential = completedOperation.storedCredentials;
                }
                return completedOperation.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.storedCredentials;
            }

            public final CompletedOperation copy(AmplifyCredential storedCredentials) {
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                return new CompletedOperation(storedCredentials);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CompletedOperation) && AbstractC4154l.m8918a(this.storedCredentials, ((CompletedOperation) obj).storedCredentials);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class LoadCredentialStore extends EventType {
            private final CredentialType credentialType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadCredentialStore(CredentialType credentialType) {
                super(null);
                AbstractC4154l.m8923f(credentialType, "credentialType");
                this.credentialType = credentialType;
            }

            public static /* synthetic */ LoadCredentialStore copy$default(LoadCredentialStore loadCredentialStore, CredentialType credentialType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    credentialType = loadCredentialStore.credentialType;
                }
                return loadCredentialStore.copy(credentialType);
            }

            public final CredentialType component1() {
                return this.credentialType;
            }

            public final LoadCredentialStore copy(CredentialType credentialType) {
                AbstractC4154l.m8923f(credentialType, "credentialType");
                return new LoadCredentialStore(credentialType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadCredentialStore) && AbstractC4154l.m8918a(this.credentialType, ((LoadCredentialStore) obj).credentialType);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class MigrateLegacyCredentialStore extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43786id;

            /* JADX WARN: Multi-variable type inference failed */
            public MigrateLegacyCredentialStore() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ MigrateLegacyCredentialStore copy$default(MigrateLegacyCredentialStore migrateLegacyCredentialStore, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = migrateLegacyCredentialStore.f43786id;
                }
                return migrateLegacyCredentialStore.copy(str);
            }

            public final String component1() {
                return this.f43786id;
            }

            public final MigrateLegacyCredentialStore copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new MigrateLegacyCredentialStore(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MigrateLegacyCredentialStore) && AbstractC4154l.m8918a(this.f43786id, ((MigrateLegacyCredentialStore) obj).f43786id);
            }

            public final String getId() {
                return this.f43786id;
            }

            public int hashCode() {
                return this.f43786id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("MigrateLegacyCredentialStore(id=", this.f43786id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MigrateLegacyCredentialStore(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43786id = id2;
            }

            public /* synthetic */ MigrateLegacyCredentialStore(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class MoveToIdleState extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43787id;

            /* JADX WARN: Multi-variable type inference failed */
            public MoveToIdleState() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ MoveToIdleState copy$default(MoveToIdleState moveToIdleState, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = moveToIdleState.f43787id;
                }
                return moveToIdleState.copy(str);
            }

            public final String component1() {
                return this.f43787id;
            }

            public final MoveToIdleState copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new MoveToIdleState(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MoveToIdleState) && AbstractC4154l.m8918a(this.f43787id, ((MoveToIdleState) obj).f43787id);
            }

            public final String getId() {
                return this.f43787id;
            }

            public int hashCode() {
                return this.f43787id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("MoveToIdleState(id=", this.f43787id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoveToIdleState(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43787id = id2;
            }

            public /* synthetic */ MoveToIdleState(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class StoreCredentials extends EventType {
            private final CredentialType credentialType;
            private final AmplifyCredential credentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StoreCredentials(CredentialType credentialType, AmplifyCredential credentials) {
                super(null);
                AbstractC4154l.m8923f(credentialType, "credentialType");
                AbstractC4154l.m8923f(credentials, "credentials");
                this.credentialType = credentialType;
                this.credentials = credentials;
            }

            public static /* synthetic */ StoreCredentials copy$default(StoreCredentials storeCredentials, CredentialType credentialType, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    credentialType = storeCredentials.credentialType;
                }
                if ((i10 & 2) != 0) {
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

            public final StoreCredentials copy(CredentialType credentialType, AmplifyCredential credentials) {
                AbstractC4154l.m8923f(credentialType, "credentialType");
                AbstractC4154l.m8923f(credentials, "credentials");
                return new StoreCredentials(credentialType, credentials);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StoreCredentials)) {
                    return false;
                }
                StoreCredentials storeCredentials = (StoreCredentials) obj;
                return AbstractC4154l.m8918a(this.credentialType, storeCredentials.credentialType) && AbstractC4154l.m8918a(this.credentials, storeCredentials.credentials);
            }

            public final CredentialType getCredentialType() {
                return this.credentialType;
            }

            public final AmplifyCredential getCredentials() {
                return this.credentials;
            }

            public int hashCode() {
                return this.credentials.hashCode() + (this.credentialType.hashCode() * 31);
            }

            public String toString() {
                return "StoreCredentials(credentialType=" + this.credentialType + ", credentials=" + this.credentials + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowError extends EventType {
            private final CredentialStoreError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(CredentialStoreError error) {
                super(null);
                AbstractC4154l.m8923f(error, "error");
                this.error = error;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, CredentialStoreError credentialStoreError, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    credentialStoreError = throwError.error;
                }
                return throwError.copy(credentialStoreError);
            }

            public final CredentialStoreError component1() {
                return this.error;
            }

            public final ThrowError copy(CredentialStoreError error) {
                AbstractC4154l.m8923f(error, "error");
                return new ThrowError(error);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && AbstractC4154l.m8918a(this.error, ((ThrowError) obj).error);
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

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public CredentialStoreEvent(EventType eventType, Date date) {
        AbstractC4154l.m8923f(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        this.type = eventType.getClass().getSimpleName();
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return super.getId();
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.type;
    }

    public /* synthetic */ CredentialStoreEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
