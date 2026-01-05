package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignInChallengeEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58131type;

    public static abstract class EventType {

        public static final class FinalizeSignIn extends EventType {
            private final String accessToken;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinalizeSignIn(String str) {
                super(null);
                sq8.m48649h(str, "accessToken");
                this.accessToken = str;
            }

            public static /* synthetic */ FinalizeSignIn copy$default(FinalizeSignIn finalizeSignIn, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = finalizeSignIn.accessToken;
                }
                return finalizeSignIn.copy(str);
            }

            public final String component1() {
                return this.accessToken;
            }

            public final FinalizeSignIn copy(String str) {
                sq8.m48649h(str, "accessToken");
                return new FinalizeSignIn(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinalizeSignIn) && sq8.m48644c(this.accessToken, ((FinalizeSignIn) obj).accessToken);
            }

            public final String getAccessToken() {
                return this.accessToken;
            }

            public int hashCode() {
                return this.accessToken.hashCode();
            }

            public String toString() {
                return "FinalizeSignIn(accessToken=" + this.accessToken + ")";
            }
        }

        public static final class RetryVerifyChallengeAnswer extends EventType {
            private final String answer;
            private final AuthChallenge authChallenge;
            private final Map<String, String> metadata;
            private final List<AuthUserAttribute> userAttributes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetryVerifyChallengeAnswer(String str, Map<String, String> map, List<AuthUserAttribute> list, AuthChallenge authChallenge) {
                super(null);
                sq8.m48649h(str, "answer");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(list, "userAttributes");
                sq8.m48649h(authChallenge, "authChallenge");
                this.answer = str;
                this.metadata = map;
                this.userAttributes = list;
                this.authChallenge = authChallenge;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RetryVerifyChallengeAnswer copy$default(RetryVerifyChallengeAnswer retryVerifyChallengeAnswer, String str, Map map, List list, AuthChallenge authChallenge, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = retryVerifyChallengeAnswer.answer;
                }
                if ((i & 2) != 0) {
                    map = retryVerifyChallengeAnswer.metadata;
                }
                if ((i & 4) != 0) {
                    list = retryVerifyChallengeAnswer.userAttributes;
                }
                if ((i & 8) != 0) {
                    authChallenge = retryVerifyChallengeAnswer.authChallenge;
                }
                return retryVerifyChallengeAnswer.copy(str, map, list, authChallenge);
            }

            public final String component1() {
                return this.answer;
            }

            public final Map<String, String> component2() {
                return this.metadata;
            }

            public final List<AuthUserAttribute> component3() {
                return this.userAttributes;
            }

            public final AuthChallenge component4() {
                return this.authChallenge;
            }

            public final RetryVerifyChallengeAnswer copy(String str, Map<String, String> map, List<AuthUserAttribute> list, AuthChallenge authChallenge) {
                sq8.m48649h(str, "answer");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(list, "userAttributes");
                sq8.m48649h(authChallenge, "authChallenge");
                return new RetryVerifyChallengeAnswer(str, map, list, authChallenge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RetryVerifyChallengeAnswer)) {
                    return false;
                }
                RetryVerifyChallengeAnswer retryVerifyChallengeAnswer = (RetryVerifyChallengeAnswer) obj;
                return sq8.m48644c(this.answer, retryVerifyChallengeAnswer.answer) && sq8.m48644c(this.metadata, retryVerifyChallengeAnswer.metadata) && sq8.m48644c(this.userAttributes, retryVerifyChallengeAnswer.userAttributes) && sq8.m48644c(this.authChallenge, retryVerifyChallengeAnswer.authChallenge);
            }

            public final String getAnswer() {
                return this.answer;
            }

            public final AuthChallenge getAuthChallenge() {
                return this.authChallenge;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final List<AuthUserAttribute> getUserAttributes() {
                return this.userAttributes;
            }

            public int hashCode() {
                return (((((this.answer.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.userAttributes.hashCode()) * 31) + this.authChallenge.hashCode();
            }

            public String toString() {
                return "RetryVerifyChallengeAnswer(answer=" + this.answer + ", metadata=" + this.metadata + ", userAttributes=" + this.userAttributes + ", authChallenge=" + this.authChallenge + ")";
            }
        }

        public static final class ThrowError extends EventType {
            private final AuthChallenge challenge;
            private final Exception exception;
            private final boolean hasNewResponse;

            public /* synthetic */ ThrowError(Exception exc, AuthChallenge authChallenge, boolean z, int i, id5 id5Var) {
                this(exc, authChallenge, (i & 4) != 0 ? false : z);
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, AuthChallenge authChallenge, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwError.exception;
                }
                if ((i & 2) != 0) {
                    authChallenge = throwError.challenge;
                }
                if ((i & 4) != 0) {
                    z = throwError.hasNewResponse;
                }
                return throwError.copy(exc, authChallenge, z);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final AuthChallenge component2() {
                return this.challenge;
            }

            public final boolean component3() {
                return this.hasNewResponse;
            }

            public final ThrowError copy(Exception exc, AuthChallenge authChallenge, boolean z) {
                sq8.m48649h(exc, "exception");
                sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
                return new ThrowError(exc, authChallenge, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowError)) {
                    return false;
                }
                ThrowError throwError = (ThrowError) obj;
                return sq8.m48644c(this.exception, throwError.exception) && sq8.m48644c(this.challenge, throwError.challenge) && this.hasNewResponse == throwError.hasNewResponse;
            }

            public final AuthChallenge getChallenge() {
                return this.challenge;
            }

            public final Exception getException() {
                return this.exception;
            }

            public final boolean getHasNewResponse() {
                return this.hasNewResponse;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = ((this.exception.hashCode() * 31) + this.challenge.hashCode()) * 31;
                boolean z = this.hasNewResponse;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return iHashCode + i;
            }

            public String toString() {
                return "ThrowError(exception=" + this.exception + ", challenge=" + this.challenge + ", hasNewResponse=" + this.hasNewResponse + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exc, AuthChallenge authChallenge, boolean z) {
                super(null);
                sq8.m48649h(exc, "exception");
                sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
                this.exception = exc;
                this.challenge = authChallenge;
                this.hasNewResponse = z;
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
            private final Map<String, String> metadata;
            private final List<AuthUserAttribute> userAttributes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyChallengeAnswer(String str, Map<String, String> map, List<AuthUserAttribute> list) {
                super(null);
                sq8.m48649h(str, "answer");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(list, "userAttributes");
                this.answer = str;
                this.metadata = map;
                this.userAttributes = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VerifyChallengeAnswer copy$default(VerifyChallengeAnswer verifyChallengeAnswer, String str, Map map, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = verifyChallengeAnswer.answer;
                }
                if ((i & 2) != 0) {
                    map = verifyChallengeAnswer.metadata;
                }
                if ((i & 4) != 0) {
                    list = verifyChallengeAnswer.userAttributes;
                }
                return verifyChallengeAnswer.copy(str, map, list);
            }

            public final String component1() {
                return this.answer;
            }

            public final Map<String, String> component2() {
                return this.metadata;
            }

            public final List<AuthUserAttribute> component3() {
                return this.userAttributes;
            }

            public final VerifyChallengeAnswer copy(String str, Map<String, String> map, List<AuthUserAttribute> list) {
                sq8.m48649h(str, "answer");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(list, "userAttributes");
                return new VerifyChallengeAnswer(str, map, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyChallengeAnswer)) {
                    return false;
                }
                VerifyChallengeAnswer verifyChallengeAnswer = (VerifyChallengeAnswer) obj;
                return sq8.m48644c(this.answer, verifyChallengeAnswer.answer) && sq8.m48644c(this.metadata, verifyChallengeAnswer.metadata) && sq8.m48644c(this.userAttributes, verifyChallengeAnswer.userAttributes);
            }

            public final String getAnswer() {
                return this.answer;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final List<AuthUserAttribute> getUserAttributes() {
                return this.userAttributes;
            }

            public int hashCode() {
                return (((this.answer.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.userAttributes.hashCode();
            }

            public String toString() {
                return "VerifyChallengeAnswer(answer=" + this.answer + ", metadata=" + this.metadata + ", userAttributes=" + this.userAttributes + ")";
            }
        }

        public static final class WaitForAnswer extends EventType {
            private final AuthChallenge challenge;
            private final boolean hasNewResponse;
            private final SignInMethod signInMethod;

            public /* synthetic */ WaitForAnswer(AuthChallenge authChallenge, SignInMethod signInMethod, boolean z, int i, id5 id5Var) {
                this(authChallenge, signInMethod, (i & 4) != 0 ? false : z);
            }

            public static /* synthetic */ WaitForAnswer copy$default(WaitForAnswer waitForAnswer, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    authChallenge = waitForAnswer.challenge;
                }
                if ((i & 2) != 0) {
                    signInMethod = waitForAnswer.signInMethod;
                }
                if ((i & 4) != 0) {
                    z = waitForAnswer.hasNewResponse;
                }
                return waitForAnswer.copy(authChallenge, signInMethod, z);
            }

            public final AuthChallenge component1() {
                return this.challenge;
            }

            public final SignInMethod component2() {
                return this.signInMethod;
            }

            public final boolean component3() {
                return this.hasNewResponse;
            }

            public final WaitForAnswer copy(AuthChallenge authChallenge, SignInMethod signInMethod, boolean z) {
                sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
                sq8.m48649h(signInMethod, "signInMethod");
                return new WaitForAnswer(authChallenge, signInMethod, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WaitForAnswer)) {
                    return false;
                }
                WaitForAnswer waitForAnswer = (WaitForAnswer) obj;
                return sq8.m48644c(this.challenge, waitForAnswer.challenge) && sq8.m48644c(this.signInMethod, waitForAnswer.signInMethod) && this.hasNewResponse == waitForAnswer.hasNewResponse;
            }

            public final AuthChallenge getChallenge() {
                return this.challenge;
            }

            public final boolean getHasNewResponse() {
                return this.hasNewResponse;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = ((this.challenge.hashCode() * 31) + this.signInMethod.hashCode()) * 31;
                boolean z = this.hasNewResponse;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return iHashCode + i;
            }

            public String toString() {
                return "WaitForAnswer(challenge=" + this.challenge + ", signInMethod=" + this.signInMethod + ", hasNewResponse=" + this.hasNewResponse + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WaitForAnswer(AuthChallenge authChallenge, SignInMethod signInMethod, boolean z) {
                super(null);
                sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
                sq8.m48649h(signInMethod, "signInMethod");
                this.challenge = authChallenge;
                this.signInMethod = signInMethod;
                this.hasNewResponse = z;
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public SignInChallengeEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58131type = simpleName;
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
        return this.f58131type;
    }

    public /* synthetic */ SignInChallengeEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
