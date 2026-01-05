package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData;
import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignOutEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58133type;

    public static abstract class EventType {

        public static final class InvokeHostedUISignOut extends EventType {
            private final SignOutData signOutData;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvokeHostedUISignOut(SignOutData signOutData, SignedInData signedInData) {
                super(null);
                sq8.m48649h(signOutData, "signOutData");
                sq8.m48649h(signedInData, "signedInData");
                this.signOutData = signOutData;
                this.signedInData = signedInData;
            }

            public static /* synthetic */ InvokeHostedUISignOut copy$default(InvokeHostedUISignOut invokeHostedUISignOut, SignOutData signOutData, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signOutData = invokeHostedUISignOut.signOutData;
                }
                if ((i & 2) != 0) {
                    signedInData = invokeHostedUISignOut.signedInData;
                }
                return invokeHostedUISignOut.copy(signOutData, signedInData);
            }

            public final SignOutData component1() {
                return this.signOutData;
            }

            public final SignedInData component2() {
                return this.signedInData;
            }

            public final InvokeHostedUISignOut copy(SignOutData signOutData, SignedInData signedInData) {
                sq8.m48649h(signOutData, "signOutData");
                sq8.m48649h(signedInData, "signedInData");
                return new InvokeHostedUISignOut(signOutData, signedInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvokeHostedUISignOut)) {
                    return false;
                }
                InvokeHostedUISignOut invokeHostedUISignOut = (InvokeHostedUISignOut) obj;
                return sq8.m48644c(this.signOutData, invokeHostedUISignOut.signOutData) && sq8.m48644c(this.signedInData, invokeHostedUISignOut.signedInData);
            }

            public final SignOutData getSignOutData() {
                return this.signOutData;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return (this.signOutData.hashCode() * 31) + this.signedInData.hashCode();
            }

            public String toString() {
                return "InvokeHostedUISignOut(signOutData=" + this.signOutData + ", signedInData=" + this.signedInData + ")";
            }
        }

        public static final class RevokeToken extends EventType {
            private final GlobalSignOutErrorData globalSignOutErrorData;
            private final HostedUIErrorData hostedUIErrorData;
            private final SignedInData signedInData;

            public /* synthetic */ RevokeToken(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, int i, id5 id5Var) {
                this(signedInData, (i & 2) != 0 ? null : hostedUIErrorData, (i & 4) != 0 ? null : globalSignOutErrorData);
            }

            public static /* synthetic */ RevokeToken copy$default(RevokeToken revokeToken, SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = revokeToken.signedInData;
                }
                if ((i & 2) != 0) {
                    hostedUIErrorData = revokeToken.hostedUIErrorData;
                }
                if ((i & 4) != 0) {
                    globalSignOutErrorData = revokeToken.globalSignOutErrorData;
                }
                return revokeToken.copy(signedInData, hostedUIErrorData, globalSignOutErrorData);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final HostedUIErrorData component2() {
                return this.hostedUIErrorData;
            }

            public final GlobalSignOutErrorData component3() {
                return this.globalSignOutErrorData;
            }

            public final RevokeToken copy(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData) {
                sq8.m48649h(signedInData, "signedInData");
                return new RevokeToken(signedInData, hostedUIErrorData, globalSignOutErrorData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RevokeToken)) {
                    return false;
                }
                RevokeToken revokeToken = (RevokeToken) obj;
                return sq8.m48644c(this.signedInData, revokeToken.signedInData) && sq8.m48644c(this.hostedUIErrorData, revokeToken.hostedUIErrorData) && sq8.m48644c(this.globalSignOutErrorData, revokeToken.globalSignOutErrorData);
            }

            public final GlobalSignOutErrorData getGlobalSignOutErrorData() {
                return this.globalSignOutErrorData;
            }

            public final HostedUIErrorData getHostedUIErrorData() {
                return this.hostedUIErrorData;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                int iHashCode = this.signedInData.hashCode() * 31;
                HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
                int iHashCode2 = (iHashCode + (hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode())) * 31;
                GlobalSignOutErrorData globalSignOutErrorData = this.globalSignOutErrorData;
                return iHashCode2 + (globalSignOutErrorData != null ? globalSignOutErrorData.hashCode() : 0);
            }

            public String toString() {
                return "RevokeToken(signedInData=" + this.signedInData + ", hostedUIErrorData=" + this.hostedUIErrorData + ", globalSignOutErrorData=" + this.globalSignOutErrorData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RevokeToken(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                this.signedInData = signedInData;
                this.hostedUIErrorData = hostedUIErrorData;
                this.globalSignOutErrorData = globalSignOutErrorData;
            }
        }

        public static final class SignOutGlobally extends EventType {
            private final HostedUIErrorData hostedUIErrorData;
            private final SignedInData signedInData;

            public /* synthetic */ SignOutGlobally(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, int i, id5 id5Var) {
                this(signedInData, (i & 2) != 0 ? null : hostedUIErrorData);
            }

            public static /* synthetic */ SignOutGlobally copy$default(SignOutGlobally signOutGlobally, SignedInData signedInData, HostedUIErrorData hostedUIErrorData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = signOutGlobally.signedInData;
                }
                if ((i & 2) != 0) {
                    hostedUIErrorData = signOutGlobally.hostedUIErrorData;
                }
                return signOutGlobally.copy(signedInData, hostedUIErrorData);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final HostedUIErrorData component2() {
                return this.hostedUIErrorData;
            }

            public final SignOutGlobally copy(SignedInData signedInData, HostedUIErrorData hostedUIErrorData) {
                sq8.m48649h(signedInData, "signedInData");
                return new SignOutGlobally(signedInData, hostedUIErrorData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignOutGlobally)) {
                    return false;
                }
                SignOutGlobally signOutGlobally = (SignOutGlobally) obj;
                return sq8.m48644c(this.signedInData, signOutGlobally.signedInData) && sq8.m48644c(this.hostedUIErrorData, signOutGlobally.hostedUIErrorData);
            }

            public final HostedUIErrorData getHostedUIErrorData() {
                return this.hostedUIErrorData;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                int iHashCode = this.signedInData.hashCode() * 31;
                HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
                return iHashCode + (hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode());
            }

            public String toString() {
                return "SignOutGlobally(signedInData=" + this.signedInData + ", hostedUIErrorData=" + this.hostedUIErrorData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignOutGlobally(SignedInData signedInData, HostedUIErrorData hostedUIErrorData) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                this.signedInData = signedInData;
                this.hostedUIErrorData = hostedUIErrorData;
            }
        }

        public static final class SignOutGloballyError extends EventType {
            private final GlobalSignOutErrorData globalSignOutErrorData;
            private final HostedUIErrorData hostedUIErrorData;
            private final SignedInData signedInData;

            public /* synthetic */ SignOutGloballyError(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, int i, id5 id5Var) {
                this(signedInData, (i & 2) != 0 ? null : hostedUIErrorData, (i & 4) != 0 ? null : globalSignOutErrorData);
            }

            public static /* synthetic */ SignOutGloballyError copy$default(SignOutGloballyError signOutGloballyError, SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = signOutGloballyError.signedInData;
                }
                if ((i & 2) != 0) {
                    hostedUIErrorData = signOutGloballyError.hostedUIErrorData;
                }
                if ((i & 4) != 0) {
                    globalSignOutErrorData = signOutGloballyError.globalSignOutErrorData;
                }
                return signOutGloballyError.copy(signedInData, hostedUIErrorData, globalSignOutErrorData);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final HostedUIErrorData component2() {
                return this.hostedUIErrorData;
            }

            public final GlobalSignOutErrorData component3() {
                return this.globalSignOutErrorData;
            }

            public final SignOutGloballyError copy(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData) {
                sq8.m48649h(signedInData, "signedInData");
                return new SignOutGloballyError(signedInData, hostedUIErrorData, globalSignOutErrorData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignOutGloballyError)) {
                    return false;
                }
                SignOutGloballyError signOutGloballyError = (SignOutGloballyError) obj;
                return sq8.m48644c(this.signedInData, signOutGloballyError.signedInData) && sq8.m48644c(this.hostedUIErrorData, signOutGloballyError.hostedUIErrorData) && sq8.m48644c(this.globalSignOutErrorData, signOutGloballyError.globalSignOutErrorData);
            }

            public final GlobalSignOutErrorData getGlobalSignOutErrorData() {
                return this.globalSignOutErrorData;
            }

            public final HostedUIErrorData getHostedUIErrorData() {
                return this.hostedUIErrorData;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                int iHashCode = this.signedInData.hashCode() * 31;
                HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
                int iHashCode2 = (iHashCode + (hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode())) * 31;
                GlobalSignOutErrorData globalSignOutErrorData = this.globalSignOutErrorData;
                return iHashCode2 + (globalSignOutErrorData != null ? globalSignOutErrorData.hashCode() : 0);
            }

            public String toString() {
                return "SignOutGloballyError(signedInData=" + this.signedInData + ", hostedUIErrorData=" + this.hostedUIErrorData + ", globalSignOutErrorData=" + this.globalSignOutErrorData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignOutGloballyError(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                this.signedInData = signedInData;
                this.hostedUIErrorData = hostedUIErrorData;
                this.globalSignOutErrorData = globalSignOutErrorData;
            }
        }

        public static final class SignOutLocally extends EventType {
            private final GlobalSignOutErrorData globalSignOutErrorData;
            private final HostedUIErrorData hostedUIErrorData;
            private final RevokeTokenErrorData revokeTokenErrorData;
            private final SignedInData signedInData;

            public /* synthetic */ SignOutLocally(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i, id5 id5Var) {
                this(signedInData, (i & 2) != 0 ? null : hostedUIErrorData, (i & 4) != 0 ? null : globalSignOutErrorData, (i & 8) != 0 ? null : revokeTokenErrorData);
            }

            public static /* synthetic */ SignOutLocally copy$default(SignOutLocally signOutLocally, SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = signOutLocally.signedInData;
                }
                if ((i & 2) != 0) {
                    hostedUIErrorData = signOutLocally.hostedUIErrorData;
                }
                if ((i & 4) != 0) {
                    globalSignOutErrorData = signOutLocally.globalSignOutErrorData;
                }
                if ((i & 8) != 0) {
                    revokeTokenErrorData = signOutLocally.revokeTokenErrorData;
                }
                return signOutLocally.copy(signedInData, hostedUIErrorData, globalSignOutErrorData, revokeTokenErrorData);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final HostedUIErrorData component2() {
                return this.hostedUIErrorData;
            }

            public final GlobalSignOutErrorData component3() {
                return this.globalSignOutErrorData;
            }

            public final RevokeTokenErrorData component4() {
                return this.revokeTokenErrorData;
            }

            public final SignOutLocally copy(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData) {
                return new SignOutLocally(signedInData, hostedUIErrorData, globalSignOutErrorData, revokeTokenErrorData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignOutLocally)) {
                    return false;
                }
                SignOutLocally signOutLocally = (SignOutLocally) obj;
                return sq8.m48644c(this.signedInData, signOutLocally.signedInData) && sq8.m48644c(this.hostedUIErrorData, signOutLocally.hostedUIErrorData) && sq8.m48644c(this.globalSignOutErrorData, signOutLocally.globalSignOutErrorData) && sq8.m48644c(this.revokeTokenErrorData, signOutLocally.revokeTokenErrorData);
            }

            public final GlobalSignOutErrorData getGlobalSignOutErrorData() {
                return this.globalSignOutErrorData;
            }

            public final HostedUIErrorData getHostedUIErrorData() {
                return this.hostedUIErrorData;
            }

            public final RevokeTokenErrorData getRevokeTokenErrorData() {
                return this.revokeTokenErrorData;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                SignedInData signedInData = this.signedInData;
                int iHashCode = (signedInData == null ? 0 : signedInData.hashCode()) * 31;
                HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
                int iHashCode2 = (iHashCode + (hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode())) * 31;
                GlobalSignOutErrorData globalSignOutErrorData = this.globalSignOutErrorData;
                int iHashCode3 = (iHashCode2 + (globalSignOutErrorData == null ? 0 : globalSignOutErrorData.hashCode())) * 31;
                RevokeTokenErrorData revokeTokenErrorData = this.revokeTokenErrorData;
                return iHashCode3 + (revokeTokenErrorData != null ? revokeTokenErrorData.hashCode() : 0);
            }

            public String toString() {
                return "SignOutLocally(signedInData=" + this.signedInData + ", hostedUIErrorData=" + this.hostedUIErrorData + ", globalSignOutErrorData=" + this.globalSignOutErrorData + ", revokeTokenErrorData=" + this.revokeTokenErrorData + ")";
            }

            public SignOutLocally(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData) {
                super(null);
                this.signedInData = signedInData;
                this.hostedUIErrorData = hostedUIErrorData;
                this.globalSignOutErrorData = globalSignOutErrorData;
                this.revokeTokenErrorData = revokeTokenErrorData;
            }
        }

        public static final class SignedOutSuccess extends EventType {
            private final SignedOutData signedOutData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignedOutSuccess(SignedOutData signedOutData) {
                super(null);
                sq8.m48649h(signedOutData, "signedOutData");
                this.signedOutData = signedOutData;
            }

            public static /* synthetic */ SignedOutSuccess copy$default(SignedOutSuccess signedOutSuccess, SignedOutData signedOutData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedOutData = signedOutSuccess.signedOutData;
                }
                return signedOutSuccess.copy(signedOutData);
            }

            public final SignedOutData component1() {
                return this.signedOutData;
            }

            public final SignedOutSuccess copy(SignedOutData signedOutData) {
                sq8.m48649h(signedOutData, "signedOutData");
                return new SignedOutSuccess(signedOutData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignedOutSuccess) && sq8.m48644c(this.signedOutData, ((SignedOutSuccess) obj).signedOutData);
            }

            public final SignedOutData getSignedOutData() {
                return this.signedOutData;
            }

            public int hashCode() {
                return this.signedOutData.hashCode();
            }

            public String toString() {
                return "SignedOutSuccess(signedOutData=" + this.signedOutData + ")";
            }
        }

        public static final class UserCancelled extends EventType {
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserCancelled(SignedInData signedInData) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                this.signedInData = signedInData;
            }

            public static /* synthetic */ UserCancelled copy$default(UserCancelled userCancelled, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = userCancelled.signedInData;
                }
                return userCancelled.copy(signedInData);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final UserCancelled copy(SignedInData signedInData) {
                sq8.m48649h(signedInData, "signedInData");
                return new UserCancelled(signedInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserCancelled) && sq8.m48644c(this.signedInData, ((UserCancelled) obj).signedInData);
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return this.signedInData.hashCode();
            }

            public String toString() {
                return "UserCancelled(signedInData=" + this.signedInData + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public SignOutEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58133type = simpleName;
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
        return this.f58133type;
    }

    public /* synthetic */ SignOutEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
