package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FetchAuthSessionEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FetchAwsCredentials extends EventType {
            private final String identityId;
            private final LoginsMapProvider logins;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchAwsCredentials(String identityId, LoginsMapProvider logins) {
                super(null);
                AbstractC4154l.m8923f(identityId, "identityId");
                AbstractC4154l.m8923f(logins, "logins");
                this.identityId = identityId;
                this.logins = logins;
            }

            public static /* synthetic */ FetchAwsCredentials copy$default(FetchAwsCredentials fetchAwsCredentials, String str, LoginsMapProvider loginsMapProvider, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = fetchAwsCredentials.identityId;
                }
                if ((i10 & 2) != 0) {
                    loginsMapProvider = fetchAwsCredentials.logins;
                }
                return fetchAwsCredentials.copy(str, loginsMapProvider);
            }

            public final String component1() {
                return this.identityId;
            }

            public final LoginsMapProvider component2() {
                return this.logins;
            }

            public final FetchAwsCredentials copy(String identityId, LoginsMapProvider logins) {
                AbstractC4154l.m8923f(identityId, "identityId");
                AbstractC4154l.m8923f(logins, "logins");
                return new FetchAwsCredentials(identityId, logins);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FetchAwsCredentials)) {
                    return false;
                }
                FetchAwsCredentials fetchAwsCredentials = (FetchAwsCredentials) obj;
                return AbstractC4154l.m8918a(this.identityId, fetchAwsCredentials.identityId) && AbstractC4154l.m8918a(this.logins, fetchAwsCredentials.logins);
            }

            public final String getIdentityId() {
                return this.identityId;
            }

            public final LoginsMapProvider getLogins() {
                return this.logins;
            }

            public int hashCode() {
                return this.logins.hashCode() + (this.identityId.hashCode() * 31);
            }

            public String toString() {
                return "FetchAwsCredentials(identityId=" + this.identityId + ", logins=" + this.logins + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FetchIdentity extends EventType {
            private final LoginsMapProvider logins;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchIdentity(LoginsMapProvider logins) {
                super(null);
                AbstractC4154l.m8923f(logins, "logins");
                this.logins = logins;
            }

            public static /* synthetic */ FetchIdentity copy$default(FetchIdentity fetchIdentity, LoginsMapProvider loginsMapProvider, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    loginsMapProvider = fetchIdentity.logins;
                }
                return fetchIdentity.copy(loginsMapProvider);
            }

            public final LoginsMapProvider component1() {
                return this.logins;
            }

            public final FetchIdentity copy(LoginsMapProvider logins) {
                AbstractC4154l.m8923f(logins, "logins");
                return new FetchIdentity(logins);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchIdentity) && AbstractC4154l.m8918a(this.logins, ((FetchIdentity) obj).logins);
            }

            public final LoginsMapProvider getLogins() {
                return this.logins;
            }

            public int hashCode() {
                return this.logins.hashCode();
            }

            public String toString() {
                return "FetchIdentity(logins=" + this.logins + ")";
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

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public FetchAuthSessionEvent(EventType eventType, Date date) {
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

    public /* synthetic */ FetchAuthSessionEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
