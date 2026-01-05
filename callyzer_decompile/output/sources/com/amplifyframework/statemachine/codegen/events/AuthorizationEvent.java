package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthorizationEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class CachedCredentialsAvailable extends EventType {
            private final AmplifyCredential amplifyCredential;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CachedCredentialsAvailable(AmplifyCredential amplifyCredential) {
                super(null);
                AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
                this.amplifyCredential = amplifyCredential;
            }

            public static /* synthetic */ CachedCredentialsAvailable copy$default(CachedCredentialsAvailable cachedCredentialsAvailable, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    amplifyCredential = cachedCredentialsAvailable.amplifyCredential;
                }
                return cachedCredentialsAvailable.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.amplifyCredential;
            }

            public final CachedCredentialsAvailable copy(AmplifyCredential amplifyCredential) {
                AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
                return new CachedCredentialsAvailable(amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CachedCredentialsAvailable) && AbstractC4154l.m8918a(this.amplifyCredential, ((CachedCredentialsAvailable) obj).amplifyCredential);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Configure extends EventType {
            public static final Configure INSTANCE = new Configure();

            private Configure() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FetchAuthSession extends EventType {
            public static final FetchAuthSession INSTANCE = new FetchAuthSession();

            private FetchAuthSession() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FetchUnAuthSession extends EventType {
            public static final FetchUnAuthSession INSTANCE = new FetchUnAuthSession();

            private FetchUnAuthSession() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Fetched extends EventType {
            private final AWSCredentials awsCredentials;
            private final String identityId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fetched(String identityId, AWSCredentials awsCredentials) {
                super(null);
                AbstractC4154l.m8923f(identityId, "identityId");
                AbstractC4154l.m8923f(awsCredentials, "awsCredentials");
                this.identityId = identityId;
                this.awsCredentials = awsCredentials;
            }

            public static /* synthetic */ Fetched copy$default(Fetched fetched, String str, AWSCredentials aWSCredentials, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = fetched.identityId;
                }
                if ((i10 & 2) != 0) {
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

            public final Fetched copy(String identityId, AWSCredentials awsCredentials) {
                AbstractC4154l.m8923f(identityId, "identityId");
                AbstractC4154l.m8923f(awsCredentials, "awsCredentials");
                return new Fetched(identityId, awsCredentials);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fetched)) {
                    return false;
                }
                Fetched fetched = (Fetched) obj;
                return AbstractC4154l.m8918a(this.identityId, fetched.identityId) && AbstractC4154l.m8918a(this.awsCredentials, fetched.awsCredentials);
            }

            public final AWSCredentials getAwsCredentials() {
                return this.awsCredentials;
            }

            public final String getIdentityId() {
                return this.identityId;
            }

            public int hashCode() {
                return this.awsCredentials.hashCode() + (this.identityId.hashCode() * 31);
            }

            public String toString() {
                return "Fetched(identityId=" + this.identityId + ", awsCredentials=" + this.awsCredentials + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RefreshSession extends EventType {
            private final AmplifyCredential amplifyCredential;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshSession(AmplifyCredential amplifyCredential) {
                super(null);
                AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
                this.amplifyCredential = amplifyCredential;
            }

            public static /* synthetic */ RefreshSession copy$default(RefreshSession refreshSession, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    amplifyCredential = refreshSession.amplifyCredential;
                }
                return refreshSession.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.amplifyCredential;
            }

            public final RefreshSession copy(AmplifyCredential amplifyCredential) {
                AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
                return new RefreshSession(amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RefreshSession) && AbstractC4154l.m8918a(this.amplifyCredential, ((RefreshSession) obj).amplifyCredential);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Refreshed extends EventType {
            private final AmplifyCredential amplifyCredential;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Refreshed(AmplifyCredential amplifyCredential) {
                super(null);
                AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
                this.amplifyCredential = amplifyCredential;
            }

            public static /* synthetic */ Refreshed copy$default(Refreshed refreshed, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    amplifyCredential = refreshed.amplifyCredential;
                }
                return refreshed.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.amplifyCredential;
            }

            public final Refreshed copy(AmplifyCredential amplifyCredential) {
                AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
                return new Refreshed(amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Refreshed) && AbstractC4154l.m8918a(this.amplifyCredential, ((Refreshed) obj).amplifyCredential);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class StartFederationToIdentityPool extends EventType {
            private final AmplifyCredential existingCredential;
            private final String identityId;
            private final FederatedToken token;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartFederationToIdentityPool(FederatedToken token, String str, AmplifyCredential amplifyCredential) {
                super(null);
                AbstractC4154l.m8923f(token, "token");
                this.token = token;
                this.identityId = str;
                this.existingCredential = amplifyCredential;
            }

            public static /* synthetic */ StartFederationToIdentityPool copy$default(StartFederationToIdentityPool startFederationToIdentityPool, FederatedToken federatedToken, String str, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    federatedToken = startFederationToIdentityPool.token;
                }
                if ((i10 & 2) != 0) {
                    str = startFederationToIdentityPool.identityId;
                }
                if ((i10 & 4) != 0) {
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

            public final StartFederationToIdentityPool copy(FederatedToken token, String str, AmplifyCredential amplifyCredential) {
                AbstractC4154l.m8923f(token, "token");
                return new StartFederationToIdentityPool(token, str, amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StartFederationToIdentityPool)) {
                    return false;
                }
                StartFederationToIdentityPool startFederationToIdentityPool = (StartFederationToIdentityPool) obj;
                return AbstractC4154l.m8918a(this.token, startFederationToIdentityPool.token) && AbstractC4154l.m8918a(this.identityId, startFederationToIdentityPool.identityId) && AbstractC4154l.m8918a(this.existingCredential, startFederationToIdentityPool.existingCredential);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exception) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwError.exception;
                }
                return throwError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowError copy(Exception exception) {
                AbstractC4154l.m8923f(exception, "exception");
                return new ThrowError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && AbstractC4154l.m8918a(this.exception, ((ThrowError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11237h("ThrowError(exception=", ")", this.exception);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class UserDeleted extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43785id;

            /* JADX WARN: Multi-variable type inference failed */
            public UserDeleted() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ UserDeleted copy$default(UserDeleted userDeleted, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = userDeleted.f43785id;
                }
                return userDeleted.copy(str);
            }

            public final String component1() {
                return this.f43785id;
            }

            public final UserDeleted copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new UserDeleted(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserDeleted) && AbstractC4154l.m8918a(this.f43785id, ((UserDeleted) obj).f43785id);
            }

            public final String getId() {
                return this.f43785id;
            }

            public int hashCode() {
                return this.f43785id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("UserDeleted(id=", this.f43785id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserDeleted(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43785id = id2;
            }

            public /* synthetic */ UserDeleted(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public AuthorizationEvent(EventType eventType, Date date) {
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

    public /* synthetic */ AuthorizationEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
