package com.amplifyframework.statemachine.codegen.events;

import a2.AbstractC0030c;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SetupTOTPEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RespondToAuthChallenge extends EventType {
            private final String session;
            private final SignInMethod signInMethod;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondToAuthChallenge(String username, String str, SignInMethod signInMethod) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                this.username = username;
                this.session = str;
                this.signInMethod = signInMethod;
            }

            public static /* synthetic */ RespondToAuthChallenge copy$default(RespondToAuthChallenge respondToAuthChallenge, String str, String str2, SignInMethod signInMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = respondToAuthChallenge.username;
                }
                if ((i10 & 2) != 0) {
                    str2 = respondToAuthChallenge.session;
                }
                if ((i10 & 4) != 0) {
                    signInMethod = respondToAuthChallenge.signInMethod;
                }
                return respondToAuthChallenge.copy(str, str2, signInMethod);
            }

            public final String component1() {
                return this.username;
            }

            public final String component2() {
                return this.session;
            }

            public final SignInMethod component3() {
                return this.signInMethod;
            }

            public final RespondToAuthChallenge copy(String username, String str, SignInMethod signInMethod) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                return new RespondToAuthChallenge(username, str, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondToAuthChallenge)) {
                    return false;
                }
                RespondToAuthChallenge respondToAuthChallenge = (RespondToAuthChallenge) obj;
                return AbstractC4154l.m8918a(this.username, respondToAuthChallenge.username) && AbstractC4154l.m8918a(this.session, respondToAuthChallenge.session) && AbstractC4154l.m8918a(this.signInMethod, respondToAuthChallenge.signInMethod);
            }

            public final String getSession() {
                return this.session;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                int iHashCode = this.username.hashCode() * 31;
                String str = this.session;
                return this.signInMethod.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public String toString() {
                String str = this.username;
                String str2 = this.session;
                SignInMethod signInMethod = this.signInMethod;
                StringBuilder sbM127r = AbstractC0030c.m127r("RespondToAuthChallenge(username=", str, ", session=", str2, ", signInMethod=");
                sbM127r.append(signInMethod);
                sbM127r.append(")");
                return sbM127r.toString();
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class SetupTOTP extends EventType {
            private final Map<String, String> challengeParams;
            private final SignInMethod signInMethod;
            private final SignInTOTPSetupData totpSetupDetails;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupTOTP(SignInTOTPSetupData totpSetupDetails, Map<String, String> map, SignInMethod signInMethod) {
                super(null);
                AbstractC4154l.m8923f(totpSetupDetails, "totpSetupDetails");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                this.totpSetupDetails = totpSetupDetails;
                this.challengeParams = map;
                this.signInMethod = signInMethod;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SetupTOTP copy$default(SetupTOTP setupTOTP, SignInTOTPSetupData signInTOTPSetupData, Map map, SignInMethod signInMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signInTOTPSetupData = setupTOTP.totpSetupDetails;
                }
                if ((i10 & 2) != 0) {
                    map = setupTOTP.challengeParams;
                }
                if ((i10 & 4) != 0) {
                    signInMethod = setupTOTP.signInMethod;
                }
                return setupTOTP.copy(signInTOTPSetupData, map, signInMethod);
            }

            public final SignInTOTPSetupData component1() {
                return this.totpSetupDetails;
            }

            public final Map<String, String> component2() {
                return this.challengeParams;
            }

            public final SignInMethod component3() {
                return this.signInMethod;
            }

            public final SetupTOTP copy(SignInTOTPSetupData totpSetupDetails, Map<String, String> map, SignInMethod signInMethod) {
                AbstractC4154l.m8923f(totpSetupDetails, "totpSetupDetails");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                return new SetupTOTP(totpSetupDetails, map, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupTOTP)) {
                    return false;
                }
                SetupTOTP setupTOTP = (SetupTOTP) obj;
                return AbstractC4154l.m8918a(this.totpSetupDetails, setupTOTP.totpSetupDetails) && AbstractC4154l.m8918a(this.challengeParams, setupTOTP.challengeParams) && AbstractC4154l.m8918a(this.signInMethod, setupTOTP.signInMethod);
            }

            public final Map<String, String> getChallengeParams() {
                return this.challengeParams;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            public final SignInTOTPSetupData getTotpSetupDetails() {
                return this.totpSetupDetails;
            }

            public int hashCode() {
                int iHashCode = this.totpSetupDetails.hashCode() * 31;
                Map<String, String> map = this.challengeParams;
                return this.signInMethod.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
            }

            public String toString() {
                return "SetupTOTP(totpSetupDetails=" + this.totpSetupDetails + ", challengeParams=" + this.challengeParams + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowAuthError extends EventType {
            private final Exception exception;
            private final String session;
            private final SignInMethod signInMethod;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowAuthError(Exception exception, String username, String str, SignInMethod signInMethod) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                this.exception = exception;
                this.username = username;
                this.session = str;
                this.signInMethod = signInMethod;
            }

            public static /* synthetic */ ThrowAuthError copy$default(ThrowAuthError throwAuthError, Exception exc, String str, String str2, SignInMethod signInMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwAuthError.exception;
                }
                if ((i10 & 2) != 0) {
                    str = throwAuthError.username;
                }
                if ((i10 & 4) != 0) {
                    str2 = throwAuthError.session;
                }
                if ((i10 & 8) != 0) {
                    signInMethod = throwAuthError.signInMethod;
                }
                return throwAuthError.copy(exc, str, str2, signInMethod);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final String component2() {
                return this.username;
            }

            public final String component3() {
                return this.session;
            }

            public final SignInMethod component4() {
                return this.signInMethod;
            }

            public final ThrowAuthError copy(Exception exception, String username, String str, SignInMethod signInMethod) {
                AbstractC4154l.m8923f(exception, "exception");
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                return new ThrowAuthError(exception, username, str, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowAuthError)) {
                    return false;
                }
                ThrowAuthError throwAuthError = (ThrowAuthError) obj;
                return AbstractC4154l.m8918a(this.exception, throwAuthError.exception) && AbstractC4154l.m8918a(this.username, throwAuthError.username) && AbstractC4154l.m8918a(this.session, throwAuthError.session) && AbstractC4154l.m8918a(this.signInMethod, throwAuthError.signInMethod);
            }

            public final Exception getException() {
                return this.exception;
            }

            public final String getSession() {
                return this.session;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                int iM113d = AbstractC0030c.m113d(this.exception.hashCode() * 31, 31, this.username);
                String str = this.session;
                return this.signInMethod.hashCode() + ((iM113d + (str == null ? 0 : str.hashCode())) * 31);
            }

            public String toString() {
                return "ThrowAuthError(exception=" + this.exception + ", username=" + this.username + ", session=" + this.session + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Verified extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43793id;

            /* JADX WARN: Multi-variable type inference failed */
            public Verified() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Verified copy$default(Verified verified, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = verified.f43793id;
                }
                return verified.copy(str);
            }

            public final String component1() {
                return this.f43793id;
            }

            public final Verified copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new Verified(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Verified) && AbstractC4154l.m8918a(this.f43793id, ((Verified) obj).f43793id);
            }

            public final String getId() {
                return this.f43793id;
            }

            public int hashCode() {
                return this.f43793id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("Verified(id=", this.f43793id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Verified(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43793id = id2;
            }

            public /* synthetic */ Verified(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class VerifyChallengeAnswer extends EventType {
            private final String answer;
            private final String friendlyDeviceName;
            private final String session;
            private final SignInMethod signInMethod;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyChallengeAnswer(String answer, String username, String str, String str2, SignInMethod signInMethod) {
                super(null);
                AbstractC4154l.m8923f(answer, "answer");
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                this.answer = answer;
                this.username = username;
                this.session = str;
                this.friendlyDeviceName = str2;
                this.signInMethod = signInMethod;
            }

            public static /* synthetic */ VerifyChallengeAnswer copy$default(VerifyChallengeAnswer verifyChallengeAnswer, String str, String str2, String str3, String str4, SignInMethod signInMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = verifyChallengeAnswer.answer;
                }
                if ((i10 & 2) != 0) {
                    str2 = verifyChallengeAnswer.username;
                }
                if ((i10 & 4) != 0) {
                    str3 = verifyChallengeAnswer.session;
                }
                if ((i10 & 8) != 0) {
                    str4 = verifyChallengeAnswer.friendlyDeviceName;
                }
                if ((i10 & 16) != 0) {
                    signInMethod = verifyChallengeAnswer.signInMethod;
                }
                SignInMethod signInMethod2 = signInMethod;
                String str5 = str3;
                return verifyChallengeAnswer.copy(str, str2, str5, str4, signInMethod2);
            }

            public final String component1() {
                return this.answer;
            }

            public final String component2() {
                return this.username;
            }

            public final String component3() {
                return this.session;
            }

            public final String component4() {
                return this.friendlyDeviceName;
            }

            public final SignInMethod component5() {
                return this.signInMethod;
            }

            public final VerifyChallengeAnswer copy(String answer, String username, String str, String str2, SignInMethod signInMethod) {
                AbstractC4154l.m8923f(answer, "answer");
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                return new VerifyChallengeAnswer(answer, username, str, str2, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyChallengeAnswer)) {
                    return false;
                }
                VerifyChallengeAnswer verifyChallengeAnswer = (VerifyChallengeAnswer) obj;
                return AbstractC4154l.m8918a(this.answer, verifyChallengeAnswer.answer) && AbstractC4154l.m8918a(this.username, verifyChallengeAnswer.username) && AbstractC4154l.m8918a(this.session, verifyChallengeAnswer.session) && AbstractC4154l.m8918a(this.friendlyDeviceName, verifyChallengeAnswer.friendlyDeviceName) && AbstractC4154l.m8918a(this.signInMethod, verifyChallengeAnswer.signInMethod);
            }

            public final String getAnswer() {
                return this.answer;
            }

            public final String getFriendlyDeviceName() {
                return this.friendlyDeviceName;
            }

            public final String getSession() {
                return this.session;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                int iM113d = AbstractC0030c.m113d(this.answer.hashCode() * 31, 31, this.username);
                String str = this.session;
                int iHashCode = (iM113d + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.friendlyDeviceName;
                return this.signInMethod.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public String toString() {
                String str = this.answer;
                String str2 = this.username;
                String str3 = this.session;
                String str4 = this.friendlyDeviceName;
                SignInMethod signInMethod = this.signInMethod;
                StringBuilder sbM127r = AbstractC0030c.m127r("VerifyChallengeAnswer(answer=", str, ", username=", str2, ", session=");
                a1.m14319B(sbM127r, str3, ", friendlyDeviceName=", str4, ", signInMethod=");
                sbM127r.append(signInMethod);
                sbM127r.append(")");
                return sbM127r.toString();
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class WaitForAnswer extends EventType {
            private final Map<String, String> challengeParams;
            private final SignInMethod signInMethod;
            private final SignInTOTPSetupData totpSetupDetails;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WaitForAnswer(SignInTOTPSetupData totpSetupDetails, Map<String, String> map, SignInMethod signInMethod) {
                super(null);
                AbstractC4154l.m8923f(totpSetupDetails, "totpSetupDetails");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                this.totpSetupDetails = totpSetupDetails;
                this.challengeParams = map;
                this.signInMethod = signInMethod;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ WaitForAnswer copy$default(WaitForAnswer waitForAnswer, SignInTOTPSetupData signInTOTPSetupData, Map map, SignInMethod signInMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signInTOTPSetupData = waitForAnswer.totpSetupDetails;
                }
                if ((i10 & 2) != 0) {
                    map = waitForAnswer.challengeParams;
                }
                if ((i10 & 4) != 0) {
                    signInMethod = waitForAnswer.signInMethod;
                }
                return waitForAnswer.copy(signInTOTPSetupData, map, signInMethod);
            }

            public final SignInTOTPSetupData component1() {
                return this.totpSetupDetails;
            }

            public final Map<String, String> component2() {
                return this.challengeParams;
            }

            public final SignInMethod component3() {
                return this.signInMethod;
            }

            public final WaitForAnswer copy(SignInTOTPSetupData totpSetupDetails, Map<String, String> map, SignInMethod signInMethod) {
                AbstractC4154l.m8923f(totpSetupDetails, "totpSetupDetails");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                return new WaitForAnswer(totpSetupDetails, map, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WaitForAnswer)) {
                    return false;
                }
                WaitForAnswer waitForAnswer = (WaitForAnswer) obj;
                return AbstractC4154l.m8918a(this.totpSetupDetails, waitForAnswer.totpSetupDetails) && AbstractC4154l.m8918a(this.challengeParams, waitForAnswer.challengeParams) && AbstractC4154l.m8918a(this.signInMethod, waitForAnswer.signInMethod);
            }

            public final Map<String, String> getChallengeParams() {
                return this.challengeParams;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            public final SignInTOTPSetupData getTotpSetupDetails() {
                return this.totpSetupDetails;
            }

            public int hashCode() {
                int iHashCode = this.totpSetupDetails.hashCode() * 31;
                Map<String, String> map = this.challengeParams;
                return this.signInMethod.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
            }

            public String toString() {
                return "WaitForAnswer(totpSetupDetails=" + this.totpSetupDetails + ", challengeParams=" + this.challengeParams + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public SetupTOTPEvent(EventType eventType, Date date) {
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

    public /* synthetic */ SetupTOTPEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
