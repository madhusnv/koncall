package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SetupTOTPEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58130type;

    public static abstract class EventType {

        public static final class RespondToAuthChallenge extends EventType {
            private final String session;
            private final SignInMethod signInMethod;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondToAuthChallenge(String str, String str2, SignInMethod signInMethod) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(signInMethod, "signInMethod");
                this.username = str;
                this.session = str2;
                this.signInMethod = signInMethod;
            }

            public static /* synthetic */ RespondToAuthChallenge copy$default(RespondToAuthChallenge respondToAuthChallenge, String str, String str2, SignInMethod signInMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = respondToAuthChallenge.username;
                }
                if ((i & 2) != 0) {
                    str2 = respondToAuthChallenge.session;
                }
                if ((i & 4) != 0) {
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

            public final RespondToAuthChallenge copy(String str, String str2, SignInMethod signInMethod) {
                sq8.m48649h(str, "username");
                sq8.m48649h(signInMethod, "signInMethod");
                return new RespondToAuthChallenge(str, str2, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondToAuthChallenge)) {
                    return false;
                }
                RespondToAuthChallenge respondToAuthChallenge = (RespondToAuthChallenge) obj;
                return sq8.m48644c(this.username, respondToAuthChallenge.username) && sq8.m48644c(this.session, respondToAuthChallenge.session) && sq8.m48644c(this.signInMethod, respondToAuthChallenge.signInMethod);
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
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.signInMethod.hashCode();
            }

            public String toString() {
                return "RespondToAuthChallenge(username=" + this.username + ", session=" + this.session + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        public static final class SetupTOTP extends EventType {
            private final Map<String, String> challengeParams;
            private final SignInMethod signInMethod;
            private final SignInTOTPSetupData totpSetupDetails;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupTOTP(SignInTOTPSetupData signInTOTPSetupData, Map<String, String> map, SignInMethod signInMethod) {
                super(null);
                sq8.m48649h(signInTOTPSetupData, "totpSetupDetails");
                sq8.m48649h(signInMethod, "signInMethod");
                this.totpSetupDetails = signInTOTPSetupData;
                this.challengeParams = map;
                this.signInMethod = signInMethod;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SetupTOTP copy$default(SetupTOTP setupTOTP, SignInTOTPSetupData signInTOTPSetupData, Map map, SignInMethod signInMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    signInTOTPSetupData = setupTOTP.totpSetupDetails;
                }
                if ((i & 2) != 0) {
                    map = setupTOTP.challengeParams;
                }
                if ((i & 4) != 0) {
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

            public final SetupTOTP copy(SignInTOTPSetupData signInTOTPSetupData, Map<String, String> map, SignInMethod signInMethod) {
                sq8.m48649h(signInTOTPSetupData, "totpSetupDetails");
                sq8.m48649h(signInMethod, "signInMethod");
                return new SetupTOTP(signInTOTPSetupData, map, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupTOTP)) {
                    return false;
                }
                SetupTOTP setupTOTP = (SetupTOTP) obj;
                return sq8.m48644c(this.totpSetupDetails, setupTOTP.totpSetupDetails) && sq8.m48644c(this.challengeParams, setupTOTP.challengeParams) && sq8.m48644c(this.signInMethod, setupTOTP.signInMethod);
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
                return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.signInMethod.hashCode();
            }

            public String toString() {
                return "SetupTOTP(totpSetupDetails=" + this.totpSetupDetails + ", challengeParams=" + this.challengeParams + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        public static final class ThrowAuthError extends EventType {
            private final Exception exception;
            private final String session;
            private final SignInMethod signInMethod;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowAuthError(Exception exc, String str, String str2, SignInMethod signInMethod) {
                super(null);
                sq8.m48649h(exc, "exception");
                sq8.m48649h(str, "username");
                sq8.m48649h(signInMethod, "signInMethod");
                this.exception = exc;
                this.username = str;
                this.session = str2;
                this.signInMethod = signInMethod;
            }

            public static /* synthetic */ ThrowAuthError copy$default(ThrowAuthError throwAuthError, Exception exc, String str, String str2, SignInMethod signInMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwAuthError.exception;
                }
                if ((i & 2) != 0) {
                    str = throwAuthError.username;
                }
                if ((i & 4) != 0) {
                    str2 = throwAuthError.session;
                }
                if ((i & 8) != 0) {
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

            public final ThrowAuthError copy(Exception exc, String str, String str2, SignInMethod signInMethod) {
                sq8.m48649h(exc, "exception");
                sq8.m48649h(str, "username");
                sq8.m48649h(signInMethod, "signInMethod");
                return new ThrowAuthError(exc, str, str2, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowAuthError)) {
                    return false;
                }
                ThrowAuthError throwAuthError = (ThrowAuthError) obj;
                return sq8.m48644c(this.exception, throwAuthError.exception) && sq8.m48644c(this.username, throwAuthError.username) && sq8.m48644c(this.session, throwAuthError.session) && sq8.m48644c(this.signInMethod, throwAuthError.signInMethod);
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
                int iHashCode = ((this.exception.hashCode() * 31) + this.username.hashCode()) * 31;
                String str = this.session;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.signInMethod.hashCode();
            }

            public String toString() {
                return "ThrowAuthError(exception=" + this.exception + ", username=" + this.username + ", session=" + this.session + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        public static final class Verified extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public Verified() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Verified copy$default(Verified verified, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = verified.id;
                }
                return verified.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final Verified copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new Verified(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Verified) && sq8.m48644c(this.id, ((Verified) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "Verified(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Verified(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ Verified(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class VerifyChallengeAnswer extends EventType {
            private final String answer;
            private final String friendlyDeviceName;
            private final String session;
            private final SignInMethod signInMethod;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyChallengeAnswer(String str, String str2, String str3, String str4, SignInMethod signInMethod) {
                super(null);
                sq8.m48649h(str, "answer");
                sq8.m48649h(str2, "username");
                sq8.m48649h(signInMethod, "signInMethod");
                this.answer = str;
                this.username = str2;
                this.session = str3;
                this.friendlyDeviceName = str4;
                this.signInMethod = signInMethod;
            }

            public static /* synthetic */ VerifyChallengeAnswer copy$default(VerifyChallengeAnswer verifyChallengeAnswer, String str, String str2, String str3, String str4, SignInMethod signInMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = verifyChallengeAnswer.answer;
                }
                if ((i & 2) != 0) {
                    str2 = verifyChallengeAnswer.username;
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = verifyChallengeAnswer.session;
                }
                String str6 = str3;
                if ((i & 8) != 0) {
                    str4 = verifyChallengeAnswer.friendlyDeviceName;
                }
                String str7 = str4;
                if ((i & 16) != 0) {
                    signInMethod = verifyChallengeAnswer.signInMethod;
                }
                return verifyChallengeAnswer.copy(str, str5, str6, str7, signInMethod);
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

            public final VerifyChallengeAnswer copy(String str, String str2, String str3, String str4, SignInMethod signInMethod) {
                sq8.m48649h(str, "answer");
                sq8.m48649h(str2, "username");
                sq8.m48649h(signInMethod, "signInMethod");
                return new VerifyChallengeAnswer(str, str2, str3, str4, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyChallengeAnswer)) {
                    return false;
                }
                VerifyChallengeAnswer verifyChallengeAnswer = (VerifyChallengeAnswer) obj;
                return sq8.m48644c(this.answer, verifyChallengeAnswer.answer) && sq8.m48644c(this.username, verifyChallengeAnswer.username) && sq8.m48644c(this.session, verifyChallengeAnswer.session) && sq8.m48644c(this.friendlyDeviceName, verifyChallengeAnswer.friendlyDeviceName) && sq8.m48644c(this.signInMethod, verifyChallengeAnswer.signInMethod);
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
                int iHashCode = ((this.answer.hashCode() * 31) + this.username.hashCode()) * 31;
                String str = this.session;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.friendlyDeviceName;
                return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.signInMethod.hashCode();
            }

            public String toString() {
                return "VerifyChallengeAnswer(answer=" + this.answer + ", username=" + this.username + ", session=" + this.session + ", friendlyDeviceName=" + this.friendlyDeviceName + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        public static final class WaitForAnswer extends EventType {
            private final Map<String, String> challengeParams;
            private final SignInMethod signInMethod;
            private final SignInTOTPSetupData totpSetupDetails;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WaitForAnswer(SignInTOTPSetupData signInTOTPSetupData, Map<String, String> map, SignInMethod signInMethod) {
                super(null);
                sq8.m48649h(signInTOTPSetupData, "totpSetupDetails");
                sq8.m48649h(signInMethod, "signInMethod");
                this.totpSetupDetails = signInTOTPSetupData;
                this.challengeParams = map;
                this.signInMethod = signInMethod;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ WaitForAnswer copy$default(WaitForAnswer waitForAnswer, SignInTOTPSetupData signInTOTPSetupData, Map map, SignInMethod signInMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    signInTOTPSetupData = waitForAnswer.totpSetupDetails;
                }
                if ((i & 2) != 0) {
                    map = waitForAnswer.challengeParams;
                }
                if ((i & 4) != 0) {
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

            public final WaitForAnswer copy(SignInTOTPSetupData signInTOTPSetupData, Map<String, String> map, SignInMethod signInMethod) {
                sq8.m48649h(signInTOTPSetupData, "totpSetupDetails");
                sq8.m48649h(signInMethod, "signInMethod");
                return new WaitForAnswer(signInTOTPSetupData, map, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WaitForAnswer)) {
                    return false;
                }
                WaitForAnswer waitForAnswer = (WaitForAnswer) obj;
                return sq8.m48644c(this.totpSetupDetails, waitForAnswer.totpSetupDetails) && sq8.m48644c(this.challengeParams, waitForAnswer.challengeParams) && sq8.m48644c(this.signInMethod, waitForAnswer.signInMethod);
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
                return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.signInMethod.hashCode();
            }

            public String toString() {
                return "WaitForAnswer(totpSetupDetails=" + this.totpSetupDetails + ", challengeParams=" + this.challengeParams + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public SetupTOTPEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58130type = simpleName;
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
        return this.f58130type;
    }

    public /* synthetic */ SetupTOTPEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
