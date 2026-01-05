package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RefreshSessionEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RefreshAuthSession extends EventType {
            private final LoginsMapProvider logins;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshAuthSession(SignedInData signedInData, LoginsMapProvider logins) {
                super(null);
                AbstractC4154l.m8923f(signedInData, "signedInData");
                AbstractC4154l.m8923f(logins, "logins");
                this.signedInData = signedInData;
                this.logins = logins;
            }

            public static /* synthetic */ RefreshAuthSession copy$default(RefreshAuthSession refreshAuthSession, SignedInData signedInData, LoginsMapProvider loginsMapProvider, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signedInData = refreshAuthSession.signedInData;
                }
                if ((i10 & 2) != 0) {
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

            public final RefreshAuthSession copy(SignedInData signedInData, LoginsMapProvider logins) {
                AbstractC4154l.m8923f(signedInData, "signedInData");
                AbstractC4154l.m8923f(logins, "logins");
                return new RefreshAuthSession(signedInData, logins);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RefreshAuthSession)) {
                    return false;
                }
                RefreshAuthSession refreshAuthSession = (RefreshAuthSession) obj;
                return AbstractC4154l.m8918a(this.signedInData, refreshAuthSession.signedInData) && AbstractC4154l.m8918a(this.logins, refreshAuthSession.logins);
            }

            public final LoginsMapProvider getLogins() {
                return this.logins;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return this.logins.hashCode() + (this.signedInData.hashCode() * 31);
            }

            public String toString() {
                return "RefreshAuthSession(signedInData=" + this.signedInData + ", logins=" + this.logins + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RefreshUnAuthSession extends EventType {
            private final String identityId;
            private final LoginsMapProvider logins;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshUnAuthSession(String identityId, LoginsMapProvider logins) {
                super(null);
                AbstractC4154l.m8923f(identityId, "identityId");
                AbstractC4154l.m8923f(logins, "logins");
                this.identityId = identityId;
                this.logins = logins;
            }

            public static /* synthetic */ RefreshUnAuthSession copy$default(RefreshUnAuthSession refreshUnAuthSession, String str, LoginsMapProvider loginsMapProvider, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = refreshUnAuthSession.identityId;
                }
                if ((i10 & 2) != 0) {
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

            public final RefreshUnAuthSession copy(String identityId, LoginsMapProvider logins) {
                AbstractC4154l.m8923f(identityId, "identityId");
                AbstractC4154l.m8923f(logins, "logins");
                return new RefreshUnAuthSession(identityId, logins);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RefreshUnAuthSession)) {
                    return false;
                }
                RefreshUnAuthSession refreshUnAuthSession = (RefreshUnAuthSession) obj;
                return AbstractC4154l.m8918a(this.identityId, refreshUnAuthSession.identityId) && AbstractC4154l.m8918a(this.logins, refreshUnAuthSession.logins);
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
                return "RefreshUnAuthSession(identityId=" + this.identityId + ", logins=" + this.logins + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RefreshUserPoolTokens extends EventType {
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshUserPoolTokens(SignedInData signedInData) {
                super(null);
                AbstractC4154l.m8923f(signedInData, "signedInData");
                this.signedInData = signedInData;
            }

            public static /* synthetic */ RefreshUserPoolTokens copy$default(RefreshUserPoolTokens refreshUserPoolTokens, SignedInData signedInData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signedInData = refreshUserPoolTokens.signedInData;
                }
                return refreshUserPoolTokens.copy(signedInData);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final RefreshUserPoolTokens copy(SignedInData signedInData) {
                AbstractC4154l.m8923f(signedInData, "signedInData");
                return new RefreshUserPoolTokens(signedInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RefreshUserPoolTokens) && AbstractC4154l.m8918a(this.signedInData, ((RefreshUserPoolTokens) obj).signedInData);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Refreshed extends EventType {
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Refreshed(SignedInData signedInData) {
                super(null);
                AbstractC4154l.m8923f(signedInData, "signedInData");
                this.signedInData = signedInData;
            }

            public static /* synthetic */ Refreshed copy$default(Refreshed refreshed, SignedInData signedInData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signedInData = refreshed.signedInData;
                }
                return refreshed.copy(signedInData);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final Refreshed copy(SignedInData signedInData) {
                AbstractC4154l.m8923f(signedInData, "signedInData");
                return new Refreshed(signedInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Refreshed) && AbstractC4154l.m8918a(this.signedInData, ((Refreshed) obj).signedInData);
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

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public RefreshSessionEvent(EventType eventType, Date date) {
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

    public /* synthetic */ RefreshSessionEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
