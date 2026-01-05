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
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class CredentialStoreState implements State {
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ClearingCredentials extends CredentialStoreState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43806id;

        /* JADX WARN: Multi-variable type inference failed */
        public ClearingCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ClearingCredentials copy$default(ClearingCredentials clearingCredentials, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = clearingCredentials.f43806id;
            }
            return clearingCredentials.copy(str);
        }

        public final String component1() {
            return this.f43806id;
        }

        public final ClearingCredentials copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new ClearingCredentials(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClearingCredentials) && AbstractC4154l.m8918a(this.f43806id, ((ClearingCredentials) obj).f43806id);
        }

        public final String getId() {
            return this.f43806id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43806id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("ClearingCredentials(id=", this.f43806id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearingCredentials(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43806id = id2;
        }

        public /* synthetic */ ClearingCredentials(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends CredentialStoreState {
        private final CredentialStoreError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(CredentialStoreError error) {
            super(null);
            AbstractC4154l.m8923f(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, CredentialStoreError credentialStoreError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                credentialStoreError = error.error;
            }
            return error.copy(credentialStoreError);
        }

        public final CredentialStoreError component1() {
            return this.error;
        }

        public final Error copy(CredentialStoreError error) {
            AbstractC4154l.m8923f(error, "error");
            return new Error(error);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && AbstractC4154l.m8918a(this.error, ((Error) obj).error);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Idle extends CredentialStoreState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43807id;

        /* JADX WARN: Multi-variable type inference failed */
        public Idle() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Idle copy$default(Idle idle, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = idle.f43807id;
            }
            return idle.copy(str);
        }

        public final String component1() {
            return this.f43807id;
        }

        public final Idle copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Idle(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Idle) && AbstractC4154l.m8918a(this.f43807id, ((Idle) obj).f43807id);
        }

        public final String getId() {
            return this.f43807id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43807id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Idle(id=", this.f43807id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Idle(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43807id = id2;
        }

        public /* synthetic */ Idle(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class LoadingStoredCredentials extends CredentialStoreState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43808id;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadingStoredCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ LoadingStoredCredentials copy$default(LoadingStoredCredentials loadingStoredCredentials, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = loadingStoredCredentials.f43808id;
            }
            return loadingStoredCredentials.copy(str);
        }

        public final String component1() {
            return this.f43808id;
        }

        public final LoadingStoredCredentials copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new LoadingStoredCredentials(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingStoredCredentials) && AbstractC4154l.m8918a(this.f43808id, ((LoadingStoredCredentials) obj).f43808id);
        }

        public final String getId() {
            return this.f43808id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43808id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("LoadingStoredCredentials(id=", this.f43808id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingStoredCredentials(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43808id = id2;
        }

        public /* synthetic */ LoadingStoredCredentials(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class MigratingLegacyStore extends CredentialStoreState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43809id;

        /* JADX WARN: Multi-variable type inference failed */
        public MigratingLegacyStore() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ MigratingLegacyStore copy$default(MigratingLegacyStore migratingLegacyStore, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = migratingLegacyStore.f43809id;
            }
            return migratingLegacyStore.copy(str);
        }

        public final String component1() {
            return this.f43809id;
        }

        public final MigratingLegacyStore copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new MigratingLegacyStore(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MigratingLegacyStore) && AbstractC4154l.m8918a(this.f43809id, ((MigratingLegacyStore) obj).f43809id);
        }

        public final String getId() {
            return this.f43809id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43809id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("MigratingLegacyStore(id=", this.f43809id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MigratingLegacyStore(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43809id = id2;
        }

        public /* synthetic */ MigratingLegacyStore(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotConfigured extends CredentialStoreState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43810id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotConfigured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotConfigured copy$default(NotConfigured notConfigured, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notConfigured.f43810id;
            }
            return notConfigured.copy(str);
        }

        public final String component1() {
            return this.f43810id;
        }

        public final NotConfigured copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new NotConfigured(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotConfigured) && AbstractC4154l.m8918a(this.f43810id, ((NotConfigured) obj).f43810id);
        }

        public final String getId() {
            return this.f43810id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43810id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotConfigured(id=", this.f43810id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConfigured(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43810id = id2;
        }

        public /* synthetic */ NotConfigured(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<CredentialStoreState> {
        private final CredentialStoreActions credentialStoreActions;
        private final NotConfigured defaultState;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(CredentialStoreActions credentialStoreActions) {
            AbstractC4154l.m8923f(credentialStoreActions, "credentialStoreActions");
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
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<CredentialStoreState, StateMachineResolver<CredentialStoreState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<CredentialStoreState> resolve(CredentialStoreState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
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
            StateResolution<CredentialStoreState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            CredentialStoreEvent.EventType eventTypeAsCredentialStoreEvent = asCredentialStoreEvent(event);
            int i10 = 1;
            if (oldState instanceof NotConfigured) {
                if ((eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.MigrateLegacyCredentialStore) || (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.LoadCredentialStore)) {
                    return new StateResolution<>(new MigratingLegacyStore(str, i10, objArr11 == true ? 1 : 0), pe.m10833h(this.credentialStoreActions.migrateLegacyCredentialStoreAction()));
                }
            } else if (oldState instanceof MigratingLegacyStore) {
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.LoadCredentialStore) {
                    return new StateResolution<>(new LoadingStoredCredentials(objArr10 == true ? 1 : 0, i10, objArr9 == true ? 1 : 0), pe.m10833h(this.credentialStoreActions.loadCredentialStoreAction(((CredentialStoreEvent.EventType.LoadCredentialStore) eventTypeAsCredentialStoreEvent).getCredentialType())));
                }
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(((CredentialStoreEvent.EventType.ThrowError) eventTypeAsCredentialStoreEvent).getError()), pe.m10833h(this.credentialStoreActions.moveToIdleStateAction()));
                }
            } else {
                if (!(oldState instanceof LoadingStoredCredentials) && !(oldState instanceof StoringCredentials) && !(oldState instanceof ClearingCredentials)) {
                    if (!(oldState instanceof Idle)) {
                        if ((oldState instanceof Success) || (oldState instanceof Error)) {
                            return eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.MoveToIdleState ? new StateResolution<>(new Idle(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), C6668r.f31943a) : new StateResolution<>(oldState, null, 2, null);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.ClearCredentialStore) {
                        return new StateResolution<>(new ClearingCredentials(objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0), pe.m10833h(this.credentialStoreActions.clearCredentialStoreAction(((CredentialStoreEvent.EventType.ClearCredentialStore) eventTypeAsCredentialStoreEvent).getCredentialType())));
                    }
                    if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.LoadCredentialStore) {
                        return new StateResolution<>(new LoadingStoredCredentials(objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0), pe.m10833h(this.credentialStoreActions.loadCredentialStoreAction(((CredentialStoreEvent.EventType.LoadCredentialStore) eventTypeAsCredentialStoreEvent).getCredentialType())));
                    }
                    if (!(eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.StoreCredentials)) {
                        return new StateResolution<>(oldState, null, 2, null);
                    }
                    CredentialStoreEvent.EventType.StoreCredentials storeCredentials = (CredentialStoreEvent.EventType.StoreCredentials) eventTypeAsCredentialStoreEvent;
                    return new StateResolution<>(new StoringCredentials(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), pe.m10833h(this.credentialStoreActions.storeCredentialsAction(storeCredentials.getCredentialType(), storeCredentials.getCredentials())));
                }
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.CompletedOperation) {
                    return new StateResolution<>(new Success(((CredentialStoreEvent.EventType.CompletedOperation) eventTypeAsCredentialStoreEvent).getStoredCredentials()), pe.m10833h(this.credentialStoreActions.moveToIdleStateAction()));
                }
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(((CredentialStoreEvent.EventType.ThrowError) eventTypeAsCredentialStoreEvent).getError()), null, 2, null);
                }
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class StoringCredentials extends CredentialStoreState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43811id;

        /* JADX WARN: Multi-variable type inference failed */
        public StoringCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ StoringCredentials copy$default(StoringCredentials storingCredentials, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = storingCredentials.f43811id;
            }
            return storingCredentials.copy(str);
        }

        public final String component1() {
            return this.f43811id;
        }

        public final StoringCredentials copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new StoringCredentials(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StoringCredentials) && AbstractC4154l.m8918a(this.f43811id, ((StoringCredentials) obj).f43811id);
        }

        public final String getId() {
            return this.f43811id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43811id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("StoringCredentials(id=", this.f43811id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoringCredentials(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43811id = id2;
        }

        public /* synthetic */ StoringCredentials(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Success extends CredentialStoreState {
        private final AmplifyCredential storedCredentials;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(AmplifyCredential storedCredentials) {
            super(null);
            AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
            this.storedCredentials = storedCredentials;
        }

        public static /* synthetic */ Success copy$default(Success success, AmplifyCredential amplifyCredential, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                amplifyCredential = success.storedCredentials;
            }
            return success.copy(amplifyCredential);
        }

        public final AmplifyCredential component1() {
            return this.storedCredentials;
        }

        public final Success copy(AmplifyCredential storedCredentials) {
            AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
            return new Success(storedCredentials);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && AbstractC4154l.m8918a(this.storedCredentials, ((Success) obj).storedCredentials);
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

    public /* synthetic */ CredentialStoreState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return this.type;
    }

    private CredentialStoreState() {
        this.type = toString();
    }
}
