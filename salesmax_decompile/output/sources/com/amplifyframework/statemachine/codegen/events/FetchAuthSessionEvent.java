package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class FetchAuthSessionEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58126type;

    public static abstract class EventType {

        public static final class FetchAwsCredentials extends EventType {
            private final String identityId;
            private final LoginsMapProvider logins;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchAwsCredentials(String str, LoginsMapProvider loginsMapProvider) {
                super(null);
                sq8.m48649h(str, "identityId");
                sq8.m48649h(loginsMapProvider, "logins");
                this.identityId = str;
                this.logins = loginsMapProvider;
            }

            public static /* synthetic */ FetchAwsCredentials copy$default(FetchAwsCredentials fetchAwsCredentials, String str, LoginsMapProvider loginsMapProvider, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fetchAwsCredentials.identityId;
                }
                if ((i & 2) != 0) {
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

            public final FetchAwsCredentials copy(String str, LoginsMapProvider loginsMapProvider) {
                sq8.m48649h(str, "identityId");
                sq8.m48649h(loginsMapProvider, "logins");
                return new FetchAwsCredentials(str, loginsMapProvider);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FetchAwsCredentials)) {
                    return false;
                }
                FetchAwsCredentials fetchAwsCredentials = (FetchAwsCredentials) obj;
                return sq8.m48644c(this.identityId, fetchAwsCredentials.identityId) && sq8.m48644c(this.logins, fetchAwsCredentials.logins);
            }

            public final String getIdentityId() {
                return this.identityId;
            }

            public final LoginsMapProvider getLogins() {
                return this.logins;
            }

            public int hashCode() {
                return (this.identityId.hashCode() * 31) + this.logins.hashCode();
            }

            public String toString() {
                return "FetchAwsCredentials(identityId=" + this.identityId + ", logins=" + this.logins + ")";
            }
        }

        public static final class FetchIdentity extends EventType {
            private final LoginsMapProvider logins;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchIdentity(LoginsMapProvider loginsMapProvider) {
                super(null);
                sq8.m48649h(loginsMapProvider, "logins");
                this.logins = loginsMapProvider;
            }

            public static /* synthetic */ FetchIdentity copy$default(FetchIdentity fetchIdentity, LoginsMapProvider loginsMapProvider, int i, Object obj) {
                if ((i & 1) != 0) {
                    loginsMapProvider = fetchIdentity.logins;
                }
                return fetchIdentity.copy(loginsMapProvider);
            }

            public final LoginsMapProvider component1() {
                return this.logins;
            }

            public final FetchIdentity copy(LoginsMapProvider loginsMapProvider) {
                sq8.m48649h(loginsMapProvider, "logins");
                return new FetchIdentity(loginsMapProvider);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchIdentity) && sq8.m48644c(this.logins, ((FetchIdentity) obj).logins);
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

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public FetchAuthSessionEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58126type = simpleName;
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
        return this.f58126type;
    }

    public /* synthetic */ FetchAuthSessionEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
