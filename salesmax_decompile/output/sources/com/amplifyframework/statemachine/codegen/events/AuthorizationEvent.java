package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthorizationEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58121type;

    public static abstract class EventType {

        public static final class CachedCredentialsAvailable extends EventType {
            private final AmplifyCredential amplifyCredential;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CachedCredentialsAvailable(AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(amplifyCredential, "amplifyCredential");
                this.amplifyCredential = amplifyCredential;
            }

            public static /* synthetic */ CachedCredentialsAvailable copy$default(CachedCredentialsAvailable cachedCredentialsAvailable, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = cachedCredentialsAvailable.amplifyCredential;
                }
                return cachedCredentialsAvailable.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.amplifyCredential;
            }

            public final CachedCredentialsAvailable copy(AmplifyCredential amplifyCredential) {
                sq8.m48649h(amplifyCredential, "amplifyCredential");
                return new CachedCredentialsAvailable(amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CachedCredentialsAvailable) && sq8.m48644c(this.amplifyCredential, ((CachedCredentialsAvailable) obj).amplifyCredential);
            }

            public final AmplifyCredential getAmplifyCredential() {
                return this.amplifyCredential;
            }

            public int hashCode() {
                return this.amplifyCredential.hashCode();
            }

            public String toString() {
                return "CachedCredentialsAvailable(amplifyCredential=" + this.amplifyCredential + ")";
            }
        }

        public static final class Configure extends EventType {
            public static final Configure INSTANCE = new Configure();

            private Configure() {
                super(null);
            }
        }

        public static final class FetchAuthSession extends EventType {
            public static final FetchAuthSession INSTANCE = new FetchAuthSession();

            private FetchAuthSession() {
                super(null);
            }
        }

        public static final class FetchUnAuthSession extends EventType {
            public static final FetchUnAuthSession INSTANCE = new FetchUnAuthSession();

            private FetchUnAuthSession() {
                super(null);
            }
        }

        public static final class Fetched extends EventType {
            private final AWSCredentials awsCredentials;
            private final String identityId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fetched(String str, AWSCredentials aWSCredentials) {
                super(null);
                sq8.m48649h(str, "identityId");
                sq8.m48649h(aWSCredentials, "awsCredentials");
                this.identityId = str;
                this.awsCredentials = aWSCredentials;
            }

            public static /* synthetic */ Fetched copy$default(Fetched fetched, String str, AWSCredentials aWSCredentials, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fetched.identityId;
                }
                if ((i & 2) != 0) {
                    aWSCredentials = fetched.awsCredentials;
                }
                return fetched.copy(str, aWSCredentials);
            }

            public final String component1() {
                return this.identityId;
            }

            public final AWSCredentials component2() {
                return this.awsCredentials;
            }

            public final Fetched copy(String str, AWSCredentials aWSCredentials) {
                sq8.m48649h(str, "identityId");
                sq8.m48649h(aWSCredentials, "awsCredentials");
                return new Fetched(str, aWSCredentials);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fetched)) {
                    return false;
                }
                Fetched fetched = (Fetched) obj;
                return sq8.m48644c(this.identityId, fetched.identityId) && sq8.m48644c(this.awsCredentials, fetched.awsCredentials);
            }

            public final AWSCredentials getAwsCredentials() {
                return this.awsCredentials;
            }

            public final String getIdentityId() {
                return this.identityId;
            }

            public int hashCode() {
                return (this.identityId.hashCode() * 31) + this.awsCredentials.hashCode();
            }

            public String toString() {
                return "Fetched(identityId=" + this.identityId + ", awsCredentials=" + this.awsCredentials + ")";
            }
        }

        public static final class RefreshSession extends EventType {
            private final AmplifyCredential amplifyCredential;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshSession(AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(amplifyCredential, "amplifyCredential");
                this.amplifyCredential = amplifyCredential;
            }

            public static /* synthetic */ RefreshSession copy$default(RefreshSession refreshSession, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = refreshSession.amplifyCredential;
                }
                return refreshSession.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.amplifyCredential;
            }

            public final RefreshSession copy(AmplifyCredential amplifyCredential) {
                sq8.m48649h(amplifyCredential, "amplifyCredential");
                return new RefreshSession(amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RefreshSession) && sq8.m48644c(this.amplifyCredential, ((RefreshSession) obj).amplifyCredential);
            }

            public final AmplifyCredential getAmplifyCredential() {
                return this.amplifyCredential;
            }

            public int hashCode() {
                return this.amplifyCredential.hashCode();
            }

            public String toString() {
                return "RefreshSession(amplifyCredential=" + this.amplifyCredential + ")";
            }
        }

        public static final class Refreshed extends EventType {
            private final AmplifyCredential amplifyCredential;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Refreshed(AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(amplifyCredential, "amplifyCredential");
                this.amplifyCredential = amplifyCredential;
            }

            public static /* synthetic */ Refreshed copy$default(Refreshed refreshed, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = refreshed.amplifyCredential;
                }
                return refreshed.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.amplifyCredential;
            }

            public final Refreshed copy(AmplifyCredential amplifyCredential) {
                sq8.m48649h(amplifyCredential, "amplifyCredential");
                return new Refreshed(amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Refreshed) && sq8.m48644c(this.amplifyCredential, ((Refreshed) obj).amplifyCredential);
            }

            public final AmplifyCredential getAmplifyCredential() {
                return this.amplifyCredential;
            }

            public int hashCode() {
                return this.amplifyCredential.hashCode();
            }

            public String toString() {
                return "Refreshed(amplifyCredential=" + this.amplifyCredential + ")";
            }
        }

        public static final class StartFederationToIdentityPool extends EventType {
            private final AmplifyCredential existingCredential;
            private final String identityId;
            private final FederatedToken token;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartFederationToIdentityPool(FederatedToken federatedToken, String str, AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(federatedToken, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
                this.token = federatedToken;
                this.identityId = str;
                this.existingCredential = amplifyCredential;
            }

            public static /* synthetic */ StartFederationToIdentityPool copy$default(StartFederationToIdentityPool startFederationToIdentityPool, FederatedToken federatedToken, String str, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    federatedToken = startFederationToIdentityPool.token;
                }
                if ((i & 2) != 0) {
                    str = startFederationToIdentityPool.identityId;
                }
                if ((i & 4) != 0) {
                    amplifyCredential = startFederationToIdentityPool.existingCredential;
                }
                return startFederationToIdentityPool.copy(federatedToken, str, amplifyCredential);
            }

            public final FederatedToken component1() {
                return this.token;
            }

            public final String component2() {
                return this.identityId;
            }

            public final AmplifyCredential component3() {
                return this.existingCredential;
            }

            public final StartFederationToIdentityPool copy(FederatedToken federatedToken, String str, AmplifyCredential amplifyCredential) {
                sq8.m48649h(federatedToken, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
                return new StartFederationToIdentityPool(federatedToken, str, amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StartFederationToIdentityPool)) {
                    return false;
                }
                StartFederationToIdentityPool startFederationToIdentityPool = (StartFederationToIdentityPool) obj;
                return sq8.m48644c(this.token, startFederationToIdentityPool.token) && sq8.m48644c(this.identityId, startFederationToIdentityPool.identityId) && sq8.m48644c(this.existingCredential, startFederationToIdentityPool.existingCredential);
            }

            public final AmplifyCredential getExistingCredential() {
                return this.existingCredential;
            }

            public final String getIdentityId() {
                return this.identityId;
            }

            public final FederatedToken getToken() {
                return this.token;
            }

            public int hashCode() {
                int iHashCode = this.token.hashCode() * 31;
                String str = this.identityId;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AmplifyCredential amplifyCredential = this.existingCredential;
                return iHashCode2 + (amplifyCredential != null ? amplifyCredential.hashCode() : 0);
            }

            public String toString() {
                return "StartFederationToIdentityPool(token=" + this.token + ", identityId=" + this.identityId + ", existingCredential=" + this.existingCredential + ")";
            }
        }

        public static final class ThrowError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exc) {
                super(null);
                sq8.m48649h(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwError.exception;
                }
                return throwError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowError copy(Exception exc) {
                sq8.m48649h(exc, "exception");
                return new ThrowError(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && sq8.m48644c(this.exception, ((ThrowError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrowError(exception=" + this.exception + ")";
            }
        }

        public static final class UserDeleted extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public UserDeleted() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ UserDeleted copy$default(UserDeleted userDeleted, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = userDeleted.id;
                }
                return userDeleted.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final UserDeleted copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new UserDeleted(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserDeleted) && sq8.m48644c(this.id, ((UserDeleted) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "UserDeleted(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserDeleted(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ UserDeleted(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public AuthorizationEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58121type = simpleName;
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
        return this.f58121type;
    }

    public /* synthetic */ AuthorizationEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
