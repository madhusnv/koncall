package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SRPEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58129type;

    public static abstract class EventType {

        public static final class CancelSRPSignIn extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public CancelSRPSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ CancelSRPSignIn copy$default(CancelSRPSignIn cancelSRPSignIn, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cancelSRPSignIn.id;
                }
                return cancelSRPSignIn.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final CancelSRPSignIn copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new CancelSRPSignIn(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CancelSRPSignIn) && sq8.m48644c(this.id, ((CancelSRPSignIn) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "CancelSRPSignIn(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelSRPSignIn(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ CancelSRPSignIn(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class InitiateSRP extends EventType {
            private final AuthFlowType authFlowType;
            private final Map<String, String> metadata;
            private final String password;
            private final AuthChallenge respondToAuthChallenge;
            private final String username;

            public /* synthetic */ InitiateSRP(String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i, id5 id5Var) {
                this(str, str2, map, authFlowType, (i & 16) != 0 ? null : authChallenge);
            }

            public static /* synthetic */ InitiateSRP copy$default(InitiateSRP initiateSRP, String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSRP.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateSRP.password;
                }
                String str3 = str2;
                if ((i & 4) != 0) {
                    map = initiateSRP.metadata;
                }
                Map map2 = map;
                if ((i & 8) != 0) {
                    authFlowType = initiateSRP.authFlowType;
                }
                AuthFlowType authFlowType2 = authFlowType;
                if ((i & 16) != 0) {
                    authChallenge = initiateSRP.respondToAuthChallenge;
                }
                return initiateSRP.copy(str, str3, map2, authFlowType2, authChallenge);
            }

            public final String component1() {
                return this.username;
            }

            public final String component2() {
                return this.password;
            }

            public final Map<String, String> component3() {
                return this.metadata;
            }

            public final AuthFlowType component4() {
                return this.authFlowType;
            }

            public final AuthChallenge component5() {
                return this.respondToAuthChallenge;
            }

            public final InitiateSRP copy(String str, String str2, Map<String, String> map, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(authFlowType, "authFlowType");
                return new InitiateSRP(str, str2, map, authFlowType, authChallenge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSRP)) {
                    return false;
                }
                InitiateSRP initiateSRP = (InitiateSRP) obj;
                return sq8.m48644c(this.username, initiateSRP.username) && sq8.m48644c(this.password, initiateSRP.password) && sq8.m48644c(this.metadata, initiateSRP.metadata) && this.authFlowType == initiateSRP.authFlowType && sq8.m48644c(this.respondToAuthChallenge, initiateSRP.respondToAuthChallenge);
            }

            public final AuthFlowType getAuthFlowType() {
                return this.authFlowType;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getPassword() {
                return this.password;
            }

            public final AuthChallenge getRespondToAuthChallenge() {
                return this.respondToAuthChallenge;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                int iHashCode = ((((((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.authFlowType.hashCode()) * 31;
                AuthChallenge authChallenge = this.respondToAuthChallenge;
                return iHashCode + (authChallenge == null ? 0 : authChallenge.hashCode());
            }

            public String toString() {
                return "InitiateSRP(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ", authFlowType=" + this.authFlowType + ", respondToAuthChallenge=" + this.respondToAuthChallenge + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSRP(String str, String str2, Map<String, String> map, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(authFlowType, "authFlowType");
                this.username = str;
                this.password = str2;
                this.metadata = map;
                this.authFlowType = authFlowType;
                this.respondToAuthChallenge = authChallenge;
            }
        }

        public static final class InitiateSRPWithCustom extends EventType {
            private final Map<String, String> metadata;
            private final String password;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSRPWithCustom(String str, String str2, Map<String, String> map) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                this.username = str;
                this.password = str2;
                this.metadata = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSRPWithCustom copy$default(InitiateSRPWithCustom initiateSRPWithCustom, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSRPWithCustom.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateSRPWithCustom.password;
                }
                if ((i & 4) != 0) {
                    map = initiateSRPWithCustom.metadata;
                }
                return initiateSRPWithCustom.copy(str, str2, map);
            }

            public final String component1() {
                return this.username;
            }

            public final String component2() {
                return this.password;
            }

            public final Map<String, String> component3() {
                return this.metadata;
            }

            public final InitiateSRPWithCustom copy(String str, String str2, Map<String, String> map) {
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                return new InitiateSRPWithCustom(str, str2, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSRPWithCustom)) {
                    return false;
                }
                InitiateSRPWithCustom initiateSRPWithCustom = (InitiateSRPWithCustom) obj;
                return sq8.m48644c(this.username, initiateSRPWithCustom.username) && sq8.m48644c(this.password, initiateSRPWithCustom.password) && sq8.m48644c(this.metadata, initiateSRPWithCustom.metadata);
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getPassword() {
                return this.password;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return (((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.metadata.hashCode();
            }

            public String toString() {
                return "InitiateSRPWithCustom(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
            }
        }

        public static final class Reset extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public Reset() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Reset copy$default(Reset reset, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = reset.id;
                }
                return reset.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final Reset copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new Reset(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Reset) && sq8.m48644c(this.id, ((Reset) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "Reset(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reset(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ Reset(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class RespondPasswordVerifier extends EventType {
            private final Map<String, String> challengeParameters;
            private final Map<String, String> metadata;
            private final String session;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondPasswordVerifier(Map<String, String> map, Map<String, String> map2, String str) {
                super(null);
                sq8.m48649h(map, "challengeParameters");
                sq8.m48649h(map2, "metadata");
                this.challengeParameters = map;
                this.metadata = map2;
                this.session = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RespondPasswordVerifier copy$default(RespondPasswordVerifier respondPasswordVerifier, Map map, Map map2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = respondPasswordVerifier.challengeParameters;
                }
                if ((i & 2) != 0) {
                    map2 = respondPasswordVerifier.metadata;
                }
                if ((i & 4) != 0) {
                    str = respondPasswordVerifier.session;
                }
                return respondPasswordVerifier.copy(map, map2, str);
            }

            public final Map<String, String> component1() {
                return this.challengeParameters;
            }

            public final Map<String, String> component2() {
                return this.metadata;
            }

            public final String component3() {
                return this.session;
            }

            public final RespondPasswordVerifier copy(Map<String, String> map, Map<String, String> map2, String str) {
                sq8.m48649h(map, "challengeParameters");
                sq8.m48649h(map2, "metadata");
                return new RespondPasswordVerifier(map, map2, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondPasswordVerifier)) {
                    return false;
                }
                RespondPasswordVerifier respondPasswordVerifier = (RespondPasswordVerifier) obj;
                return sq8.m48644c(this.challengeParameters, respondPasswordVerifier.challengeParameters) && sq8.m48644c(this.metadata, respondPasswordVerifier.metadata) && sq8.m48644c(this.session, respondPasswordVerifier.session);
            }

            public final Map<String, String> getChallengeParameters() {
                return this.challengeParameters;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getSession() {
                return this.session;
            }

            public int hashCode() {
                int iHashCode = ((this.challengeParameters.hashCode() * 31) + this.metadata.hashCode()) * 31;
                String str = this.session;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RespondPasswordVerifier(challengeParameters=" + this.challengeParameters + ", metadata=" + this.metadata + ", session=" + this.session + ")";
            }
        }

        public static final class RetryRespondPasswordVerifier extends EventType {
            private final Map<String, String> challengeParameters;
            private final Map<String, String> metadata;
            private final String session;
            private final SignInMethod signInMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetryRespondPasswordVerifier(Map<String, String> map, Map<String, String> map2, String str, SignInMethod signInMethod) {
                super(null);
                sq8.m48649h(map, "challengeParameters");
                sq8.m48649h(map2, "metadata");
                sq8.m48649h(signInMethod, "signInMethod");
                this.challengeParameters = map;
                this.metadata = map2;
                this.session = str;
                this.signInMethod = signInMethod;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RetryRespondPasswordVerifier copy$default(RetryRespondPasswordVerifier retryRespondPasswordVerifier, Map map, Map map2, String str, SignInMethod signInMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = retryRespondPasswordVerifier.challengeParameters;
                }
                if ((i & 2) != 0) {
                    map2 = retryRespondPasswordVerifier.metadata;
                }
                if ((i & 4) != 0) {
                    str = retryRespondPasswordVerifier.session;
                }
                if ((i & 8) != 0) {
                    signInMethod = retryRespondPasswordVerifier.signInMethod;
                }
                return retryRespondPasswordVerifier.copy(map, map2, str, signInMethod);
            }

            public final Map<String, String> component1() {
                return this.challengeParameters;
            }

            public final Map<String, String> component2() {
                return this.metadata;
            }

            public final String component3() {
                return this.session;
            }

            public final SignInMethod component4() {
                return this.signInMethod;
            }

            public final RetryRespondPasswordVerifier copy(Map<String, String> map, Map<String, String> map2, String str, SignInMethod signInMethod) {
                sq8.m48649h(map, "challengeParameters");
                sq8.m48649h(map2, "metadata");
                sq8.m48649h(signInMethod, "signInMethod");
                return new RetryRespondPasswordVerifier(map, map2, str, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RetryRespondPasswordVerifier)) {
                    return false;
                }
                RetryRespondPasswordVerifier retryRespondPasswordVerifier = (RetryRespondPasswordVerifier) obj;
                return sq8.m48644c(this.challengeParameters, retryRespondPasswordVerifier.challengeParameters) && sq8.m48644c(this.metadata, retryRespondPasswordVerifier.metadata) && sq8.m48644c(this.session, retryRespondPasswordVerifier.session) && sq8.m48644c(this.signInMethod, retryRespondPasswordVerifier.signInMethod);
            }

            public final Map<String, String> getChallengeParameters() {
                return this.challengeParameters;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getSession() {
                return this.session;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            public int hashCode() {
                int iHashCode = ((this.challengeParameters.hashCode() * 31) + this.metadata.hashCode()) * 31;
                String str = this.session;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.signInMethod.hashCode();
            }

            public String toString() {
                return "RetryRespondPasswordVerifier(challengeParameters=" + this.challengeParameters + ", metadata=" + this.metadata + ", session=" + this.session + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        public static final class ThrowAuthError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowAuthError(Exception exc) {
                super(null);
                sq8.m48649h(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ ThrowAuthError copy$default(ThrowAuthError throwAuthError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwAuthError.exception;
                }
                return throwAuthError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowAuthError copy(Exception exc) {
                sq8.m48649h(exc, "exception");
                return new ThrowAuthError(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowAuthError) && sq8.m48644c(this.exception, ((ThrowAuthError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrowAuthError(exception=" + this.exception + ")";
            }
        }

        public static final class ThrowPasswordVerifierError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowPasswordVerifierError(Exception exc) {
                super(null);
                sq8.m48649h(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ ThrowPasswordVerifierError copy$default(ThrowPasswordVerifierError throwPasswordVerifierError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwPasswordVerifierError.exception;
                }
                return throwPasswordVerifierError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowPasswordVerifierError copy(Exception exc) {
                sq8.m48649h(exc, "exception");
                return new ThrowPasswordVerifierError(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowPasswordVerifierError) && sq8.m48644c(this.exception, ((ThrowPasswordVerifierError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrowPasswordVerifierError(exception=" + this.exception + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public SRPEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58129type = simpleName;
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
        return this.f58129type;
    }

    public /* synthetic */ SRPEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
