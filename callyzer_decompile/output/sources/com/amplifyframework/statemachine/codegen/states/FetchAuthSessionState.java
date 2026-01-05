package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class FetchAuthSessionState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends FetchAuthSessionState {
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception) {
            super(null);
            AbstractC4154l.m8923f(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Error copy(Exception exception) {
            AbstractC4154l.m8923f(exception, "exception");
            return new Error(exception);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && AbstractC4154l.m8918a(this.exception, ((Error) obj).exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11237h("Error(exception=", ")", this.exception);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Fetched extends FetchAuthSessionState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43822id;

        /* JADX WARN: Multi-variable type inference failed */
        public Fetched() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Fetched copy$default(Fetched fetched, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fetched.f43822id;
            }
            return fetched.copy(str);
        }

        public final String component1() {
            return this.f43822id;
        }

        public final Fetched copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Fetched(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fetched) && AbstractC4154l.m8918a(this.f43822id, ((Fetched) obj).f43822id);
        }

        public final String getId() {
            return this.f43822id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43822id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Fetched(id=", this.f43822id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fetched(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43822id = id2;
        }

        public /* synthetic */ Fetched(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class FetchingAWSCredentials extends FetchAuthSessionState {
        private final String identityId;
        private final LoginsMapProvider logins;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingAWSCredentials(String identityId, LoginsMapProvider logins) {
            super(null);
            AbstractC4154l.m8923f(identityId, "identityId");
            AbstractC4154l.m8923f(logins, "logins");
            this.identityId = identityId;
            this.logins = logins;
        }

        public static /* synthetic */ FetchingAWSCredentials copy$default(FetchingAWSCredentials fetchingAWSCredentials, String str, LoginsMapProvider loginsMapProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fetchingAWSCredentials.identityId;
            }
            if ((i10 & 2) != 0) {
                loginsMapProvider = fetchingAWSCredentials.logins;
            }
            return fetchingAWSCredentials.copy(str, loginsMapProvider);
        }

        public final String component1() {
            return this.identityId;
        }

        public final LoginsMapProvider component2() {
            return this.logins;
        }

        public final FetchingAWSCredentials copy(String identityId, LoginsMapProvider logins) {
            AbstractC4154l.m8923f(identityId, "identityId");
            AbstractC4154l.m8923f(logins, "logins");
            return new FetchingAWSCredentials(identityId, logins);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FetchingAWSCredentials)) {
                return false;
            }
            FetchingAWSCredentials fetchingAWSCredentials = (FetchingAWSCredentials) obj;
            return AbstractC4154l.m8918a(this.identityId, fetchingAWSCredentials.identityId) && AbstractC4154l.m8918a(this.logins, fetchingAWSCredentials.logins);
        }

        public final String getIdentityId() {
            return this.identityId;
        }

        public final LoginsMapProvider getLogins() {
            return this.logins;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.logins.hashCode() + (this.identityId.hashCode() * 31);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingAWSCredentials(identityId=" + this.identityId + ", logins=" + this.logins + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class FetchingIdentity extends FetchAuthSessionState {
        private final LoginsMapProvider logins;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingIdentity(LoginsMapProvider logins) {
            super(null);
            AbstractC4154l.m8923f(logins, "logins");
            this.logins = logins;
        }

        public static /* synthetic */ FetchingIdentity copy$default(FetchingIdentity fetchingIdentity, LoginsMapProvider loginsMapProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                loginsMapProvider = fetchingIdentity.logins;
            }
            return fetchingIdentity.copy(loginsMapProvider);
        }

        public final LoginsMapProvider component1() {
            return this.logins;
        }

        public final FetchingIdentity copy(LoginsMapProvider logins) {
            AbstractC4154l.m8923f(logins, "logins");
            return new FetchingIdentity(logins);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingIdentity) && AbstractC4154l.m8918a(this.logins, ((FetchingIdentity) obj).logins);
        }

        public final LoginsMapProvider getLogins() {
            return this.logins;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.logins.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingIdentity(logins=" + this.logins + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends FetchAuthSessionState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43823id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43823id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43823id;
        }

        public final NotStarted copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new NotStarted(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43823id, ((NotStarted) obj).f43823id);
        }

        public final String getId() {
            return this.f43823id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43823id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43823id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43823id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<FetchAuthSessionState> {
        private final NotStarted defaultState;
        private final FetchAuthSessionActions fetchAuthSessionActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(FetchAuthSessionActions fetchAuthSessionActions) {
            AbstractC4154l.m8923f(fetchAuthSessionActions, "fetchAuthSessionActions");
            this.fetchAuthSessionActions = fetchAuthSessionActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final FetchAuthSessionEvent.EventType asFetchAuthSessionEvent(StateMachineEvent stateMachineEvent) {
            FetchAuthSessionEvent fetchAuthSessionEvent = stateMachineEvent instanceof FetchAuthSessionEvent ? (FetchAuthSessionEvent) stateMachineEvent : null;
            if (fetchAuthSessionEvent != null) {
                return fetchAuthSessionEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<FetchAuthSessionState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<FetchAuthSessionState, StateMachineResolver<FetchAuthSessionState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<FetchAuthSessionState> resolve(FetchAuthSessionState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            FetchAuthSessionEvent.EventType eventTypeAsFetchAuthSessionEvent = asFetchAuthSessionEvent(event);
            String str = null;
            Object[] objArr = 0;
            StateResolution<FetchAuthSessionState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            if (oldState instanceof NotStarted) {
                if (eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.FetchIdentity) {
                    FetchAuthSessionEvent.EventType.FetchIdentity fetchIdentity = (FetchAuthSessionEvent.EventType.FetchIdentity) eventTypeAsFetchAuthSessionEvent;
                    return new StateResolution<>(new FetchingIdentity(fetchIdentity.getLogins()), pe.m10833h(this.fetchAuthSessionActions.fetchIdentityAction(fetchIdentity.getLogins())));
                }
                if (eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.FetchAwsCredentials) {
                    FetchAuthSessionEvent.EventType.FetchAwsCredentials fetchAwsCredentials = (FetchAuthSessionEvent.EventType.FetchAwsCredentials) eventTypeAsFetchAuthSessionEvent;
                    return new StateResolution<>(new FetchingAWSCredentials(fetchAwsCredentials.getIdentityId(), fetchAwsCredentials.getLogins()), pe.m10833h(this.fetchAuthSessionActions.fetchAWSCredentialsAction(fetchAwsCredentials.getIdentityId(), fetchAwsCredentials.getLogins())));
                }
            } else if (oldState instanceof FetchingIdentity) {
                if (eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.FetchAwsCredentials) {
                    FetchAuthSessionEvent.EventType.FetchAwsCredentials fetchAwsCredentials2 = (FetchAuthSessionEvent.EventType.FetchAwsCredentials) eventTypeAsFetchAuthSessionEvent;
                    return new StateResolution<>(new FetchingAWSCredentials(fetchAwsCredentials2.getIdentityId(), fetchAwsCredentials2.getLogins()), pe.m10833h(this.fetchAuthSessionActions.fetchAWSCredentialsAction(fetchAwsCredentials2.getIdentityId(), fetchAwsCredentials2.getLogins())));
                }
            } else if ((oldState instanceof FetchingAWSCredentials) && (eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.Fetched)) {
                FetchAuthSessionEvent.EventType.Fetched fetched = (FetchAuthSessionEvent.EventType.Fetched) eventTypeAsFetchAuthSessionEvent;
                return new StateResolution<>(new Fetched(str, 1, objArr == true ? 1 : 0), pe.m10833h(this.fetchAuthSessionActions.notifySessionEstablishedAction(fetched.getIdentityId(), fetched.getAwsCredentials())));
            }
            return stateResolution;
        }
    }

    public /* synthetic */ FetchAuthSessionState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private FetchAuthSessionState() {
    }
}
