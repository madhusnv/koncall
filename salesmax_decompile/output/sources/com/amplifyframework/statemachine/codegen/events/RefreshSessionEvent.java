package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class RefreshSessionEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58128type;

    public static abstract class EventType {

        public static final class RefreshAuthSession extends EventType {
            private final LoginsMapProvider logins;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshAuthSession(SignedInData signedInData, LoginsMapProvider loginsMapProvider) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                sq8.m48649h(loginsMapProvider, "logins");
                this.signedInData = signedInData;
                this.logins = loginsMapProvider;
            }

            public static /* synthetic */ RefreshAuthSession copy$default(RefreshAuthSession refreshAuthSession, SignedInData signedInData, LoginsMapProvider loginsMapProvider, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = refreshAuthSession.signedInData;
                }
                if ((i & 2) != 0) {
                    loginsMapProvider = refreshAuthSession.logins;
                }
                return refreshAuthSession.copy(signedInData, loginsMapProvider);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final LoginsMapProvider component2() {
                return this.logins;
            }

            public final RefreshAuthSession copy(SignedInData signedInData, LoginsMapProvider loginsMapProvider) {
                sq8.m48649h(signedInData, "signedInData");
                sq8.m48649h(loginsMapProvider, "logins");
                return new RefreshAuthSession(signedInData, loginsMapProvider);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RefreshAuthSession)) {
                    return false;
                }
                RefreshAuthSession refreshAuthSession = (RefreshAuthSession) obj;
                return sq8.m48644c(this.signedInData, refreshAuthSession.signedInData) && sq8.m48644c(this.logins, refreshAuthSession.logins);
            }

            public final LoginsMapProvider getLogins() {
                return this.logins;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return (this.signedInData.hashCode() * 31) + this.logins.hashCode();
            }

            public String toString() {
                return "RefreshAuthSession(signedInData=" + this.signedInData + ", logins=" + this.logins + ")";
            }
        }

        public static final class RefreshUnAuthSession extends EventType {
            private final String identityId;
            private final LoginsMapProvider logins;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshUnAuthSession(String str, LoginsMapProvider loginsMapProvider) {
                super(null);
                sq8.m48649h(str, "identityId");
                sq8.m48649h(loginsMapProvider, "logins");
                this.identityId = str;
                this.logins = loginsMapProvider;
            }

            public static /* synthetic */ RefreshUnAuthSession copy$default(RefreshUnAuthSession refreshUnAuthSession, String str, LoginsMapProvider loginsMapProvider, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = refreshUnAuthSession.identityId;
                }
                if ((i & 2) != 0) {
                    loginsMapProvider = refreshUnAuthSession.logins;
                }
                return refreshUnAuthSession.copy(str, loginsMapProvider);
            }

            public final String component1() {
                return this.identityId;
            }

            public final LoginsMapProvider component2() {
                return this.logins;
            }

            public final RefreshUnAuthSession copy(String str, LoginsMapProvider loginsMapProvider) {
                sq8.m48649h(str, "identityId");
                sq8.m48649h(loginsMapProvider, "logins");
                return new RefreshUnAuthSession(str, loginsMapProvider);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RefreshUnAuthSession)) {
                    return false;
                }
                RefreshUnAuthSession refreshUnAuthSession = (RefreshUnAuthSession) obj;
                return sq8.m48644c(this.identityId, refreshUnAuthSession.identityId) && sq8.m48644c(this.logins, refreshUnAuthSession.logins);
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
                return "RefreshUnAuthSession(identityId=" + this.identityId + ", logins=" + this.logins + ")";
            }
        }

        public static final class RefreshUserPoolTokens extends EventType {
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshUserPoolTokens(SignedInData signedInData) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                this.signedInData = signedInData;
            }

            public static /* synthetic */ RefreshUserPoolTokens copy$default(RefreshUserPoolTokens refreshUserPoolTokens, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = refreshUserPoolTokens.signedInData;
                }
                return refreshUserPoolTokens.copy(signedInData);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final RefreshUserPoolTokens copy(SignedInData signedInData) {
                sq8.m48649h(signedInData, "signedInData");
                return new RefreshUserPoolTokens(signedInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RefreshUserPoolTokens) && sq8.m48644c(this.signedInData, ((RefreshUserPoolTokens) obj).signedInData);
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return this.signedInData.hashCode();
            }

            public String toString() {
                return "RefreshUserPoolTokens(signedInData=" + this.signedInData + ")";
            }
        }

        public static final class Refreshed extends EventType {
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Refreshed(SignedInData signedInData) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                this.signedInData = signedInData;
            }

            public static /* synthetic */ Refreshed copy$default(Refreshed refreshed, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = refreshed.signedInData;
                }
                return refreshed.copy(signedInData);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final Refreshed copy(SignedInData signedInData) {
                sq8.m48649h(signedInData, "signedInData");
                return new Refreshed(signedInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Refreshed) && sq8.m48644c(this.signedInData, ((Refreshed) obj).signedInData);
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return this.signedInData.hashCode();
            }

            public String toString() {
                return "Refreshed(signedInData=" + this.signedInData + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public RefreshSessionEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58128type = simpleName;
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
        return this.f58128type;
    }

    public /* synthetic */ RefreshSessionEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
