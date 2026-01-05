package com.amplifyframework.statemachine.codegen.events;

import a2.AbstractC0030c;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SRPEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class CancelSRPSignIn extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43791id;

            /* JADX WARN: Multi-variable type inference failed */
            public CancelSRPSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ CancelSRPSignIn copy$default(CancelSRPSignIn cancelSRPSignIn, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = cancelSRPSignIn.f43791id;
                }
                return cancelSRPSignIn.copy(str);
            }

            public final String component1() {
                return this.f43791id;
            }

            public final CancelSRPSignIn copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new CancelSRPSignIn(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CancelSRPSignIn) && AbstractC4154l.m8918a(this.f43791id, ((CancelSRPSignIn) obj).f43791id);
            }

            public final String getId() {
                return this.f43791id;
            }

            public int hashCode() {
                return this.f43791id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("CancelSRPSignIn(id=", this.f43791id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelSRPSignIn(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43791id = id2;
            }

            public /* synthetic */ CancelSRPSignIn(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateSRP extends EventType {
            private final AuthFlowType authFlowType;
            private final Map<String, String> metadata;
            private final String password;
            private final AuthChallenge respondToAuthChallenge;
            private final String username;

            public /* synthetic */ InitiateSRP(String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i10, AbstractC4148f abstractC4148f) {
                this(str, str2, map, authFlowType, (i10 & 16) != 0 ? null : authChallenge);
            }

            public static /* synthetic */ InitiateSRP copy$default(InitiateSRP initiateSRP, String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = initiateSRP.username;
                }
                if ((i10 & 2) != 0) {
                    str2 = initiateSRP.password;
                }
                if ((i10 & 4) != 0) {
                    map = initiateSRP.metadata;
                }
                if ((i10 & 8) != 0) {
                    authFlowType = initiateSRP.authFlowType;
                }
                if ((i10 & 16) != 0) {
                    authChallenge = initiateSRP.respondToAuthChallenge;
                }
                AuthChallenge authChallenge2 = authChallenge;
                Map map2 = map;
                return initiateSRP.copy(str, str2, map2, authFlowType, authChallenge2);
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

            public final InitiateSRP copy(String username, String password, Map<String, String> metadata, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(authFlowType, "authFlowType");
                return new InitiateSRP(username, password, metadata, authFlowType, authChallenge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSRP)) {
                    return false;
                }
                InitiateSRP initiateSRP = (InitiateSRP) obj;
                return AbstractC4154l.m8918a(this.username, initiateSRP.username) && AbstractC4154l.m8918a(this.password, initiateSRP.password) && AbstractC4154l.m8918a(this.metadata, initiateSRP.metadata) && this.authFlowType == initiateSRP.authFlowType && AbstractC4154l.m8918a(this.respondToAuthChallenge, initiateSRP.respondToAuthChallenge);
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
                int iHashCode = (this.authFlowType.hashCode() + m0.m7369b(AbstractC0030c.m113d(this.username.hashCode() * 31, 31, this.password), 31, this.metadata)) * 31;
                AuthChallenge authChallenge = this.respondToAuthChallenge;
                return iHashCode + (authChallenge == null ? 0 : authChallenge.hashCode());
            }

            public String toString() {
                String str = this.username;
                String str2 = this.password;
                Map<String, String> map = this.metadata;
                AuthFlowType authFlowType = this.authFlowType;
                AuthChallenge authChallenge = this.respondToAuthChallenge;
                StringBuilder sbM127r = AbstractC0030c.m127r("InitiateSRP(username=", str, ", password=", str2, ", metadata=");
                sbM127r.append(map);
                sbM127r.append(", authFlowType=");
                sbM127r.append(authFlowType);
                sbM127r.append(", respondToAuthChallenge=");
                sbM127r.append(authChallenge);
                sbM127r.append(")");
                return sbM127r.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSRP(String username, String password, Map<String, String> metadata, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(authFlowType, "authFlowType");
                this.username = username;
                this.password = password;
                this.metadata = metadata;
                this.authFlowType = authFlowType;
                this.respondToAuthChallenge = authChallenge;
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateSRPWithCustom extends EventType {
            private final Map<String, String> metadata;
            private final String password;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSRPWithCustom(String username, String password, Map<String, String> metadata) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                this.username = username;
                this.password = password;
                this.metadata = metadata;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSRPWithCustom copy$default(InitiateSRPWithCustom initiateSRPWithCustom, String str, String str2, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = initiateSRPWithCustom.username;
                }
                if ((i10 & 2) != 0) {
                    str2 = initiateSRPWithCustom.password;
                }
                if ((i10 & 4) != 0) {
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

            public final InitiateSRPWithCustom copy(String username, String password, Map<String, String> metadata) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                return new InitiateSRPWithCustom(username, password, metadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSRPWithCustom)) {
                    return false;
                }
                InitiateSRPWithCustom initiateSRPWithCustom = (InitiateSRPWithCustom) obj;
                return AbstractC4154l.m8918a(this.username, initiateSRPWithCustom.username) && AbstractC4154l.m8918a(this.password, initiateSRPWithCustom.password) && AbstractC4154l.m8918a(this.metadata, initiateSRPWithCustom.metadata);
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
                return this.metadata.hashCode() + AbstractC0030c.m113d(this.username.hashCode() * 31, 31, this.password);
            }

            public String toString() {
                String str = this.username;
                String str2 = this.password;
                Map<String, String> map = this.metadata;
                StringBuilder sbM127r = AbstractC0030c.m127r("InitiateSRPWithCustom(username=", str, ", password=", str2, ", metadata=");
                sbM127r.append(map);
                sbM127r.append(")");
                return sbM127r.toString();
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Reset extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43792id;

            /* JADX WARN: Multi-variable type inference failed */
            public Reset() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Reset copy$default(Reset reset, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = reset.f43792id;
                }
                return reset.copy(str);
            }

            public final String component1() {
                return this.f43792id;
            }

            public final Reset copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new Reset(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Reset) && AbstractC4154l.m8918a(this.f43792id, ((Reset) obj).f43792id);
            }

            public final String getId() {
                return this.f43792id;
            }

            public int hashCode() {
                return this.f43792id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("Reset(id=", this.f43792id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reset(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43792id = id2;
            }

            public /* synthetic */ Reset(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RespondPasswordVerifier extends EventType {
            private final Map<String, String> challengeParameters;
            private final Map<String, String> metadata;
            private final String session;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondPasswordVerifier(Map<String, String> challengeParameters, Map<String, String> metadata, String str) {
                super(null);
                AbstractC4154l.m8923f(challengeParameters, "challengeParameters");
                AbstractC4154l.m8923f(metadata, "metadata");
                this.challengeParameters = challengeParameters;
                this.metadata = metadata;
                this.session = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RespondPasswordVerifier copy$default(RespondPasswordVerifier respondPasswordVerifier, Map map, Map map2, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    map = respondPasswordVerifier.challengeParameters;
                }
                if ((i10 & 2) != 0) {
                    map2 = respondPasswordVerifier.metadata;
                }
                if ((i10 & 4) != 0) {
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

            public final RespondPasswordVerifier copy(Map<String, String> challengeParameters, Map<String, String> metadata, String str) {
                AbstractC4154l.m8923f(challengeParameters, "challengeParameters");
                AbstractC4154l.m8923f(metadata, "metadata");
                return new RespondPasswordVerifier(challengeParameters, metadata, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondPasswordVerifier)) {
                    return false;
                }
                RespondPasswordVerifier respondPasswordVerifier = (RespondPasswordVerifier) obj;
                return AbstractC4154l.m8918a(this.challengeParameters, respondPasswordVerifier.challengeParameters) && AbstractC4154l.m8918a(this.metadata, respondPasswordVerifier.metadata) && AbstractC4154l.m8918a(this.session, respondPasswordVerifier.session);
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
                int iM7369b = m0.m7369b(this.challengeParameters.hashCode() * 31, 31, this.metadata);
                String str = this.session;
                return iM7369b + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                Map<String, String> map = this.challengeParameters;
                Map<String, String> map2 = this.metadata;
                String str = this.session;
                StringBuilder sb2 = new StringBuilder("RespondPasswordVerifier(challengeParameters=");
                sb2.append(map);
                sb2.append(", metadata=");
                sb2.append(map2);
                sb2.append(", session=");
                return AbstractC1452a.m4564k(sb2, str, ")");
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RetryRespondPasswordVerifier extends EventType {
            private final Map<String, String> challengeParameters;
            private final Map<String, String> metadata;
            private final String session;
            private final SignInMethod signInMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetryRespondPasswordVerifier(Map<String, String> challengeParameters, Map<String, String> metadata, String str, SignInMethod signInMethod) {
                super(null);
                AbstractC4154l.m8923f(challengeParameters, "challengeParameters");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                this.challengeParameters = challengeParameters;
                this.metadata = metadata;
                this.session = str;
                this.signInMethod = signInMethod;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RetryRespondPasswordVerifier copy$default(RetryRespondPasswordVerifier retryRespondPasswordVerifier, Map map, Map map2, String str, SignInMethod signInMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    map = retryRespondPasswordVerifier.challengeParameters;
                }
                if ((i10 & 2) != 0) {
                    map2 = retryRespondPasswordVerifier.metadata;
                }
                if ((i10 & 4) != 0) {
                    str = retryRespondPasswordVerifier.session;
                }
                if ((i10 & 8) != 0) {
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

            public final RetryRespondPasswordVerifier copy(Map<String, String> challengeParameters, Map<String, String> metadata, String str, SignInMethod signInMethod) {
                AbstractC4154l.m8923f(challengeParameters, "challengeParameters");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                return new RetryRespondPasswordVerifier(challengeParameters, metadata, str, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RetryRespondPasswordVerifier)) {
                    return false;
                }
                RetryRespondPasswordVerifier retryRespondPasswordVerifier = (RetryRespondPasswordVerifier) obj;
                return AbstractC4154l.m8918a(this.challengeParameters, retryRespondPasswordVerifier.challengeParameters) && AbstractC4154l.m8918a(this.metadata, retryRespondPasswordVerifier.metadata) && AbstractC4154l.m8918a(this.session, retryRespondPasswordVerifier.session) && AbstractC4154l.m8918a(this.signInMethod, retryRespondPasswordVerifier.signInMethod);
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
                int iM7369b = m0.m7369b(this.challengeParameters.hashCode() * 31, 31, this.metadata);
                String str = this.session;
                return this.signInMethod.hashCode() + ((iM7369b + (str == null ? 0 : str.hashCode())) * 31);
            }

            public String toString() {
                return "RetryRespondPasswordVerifier(challengeParameters=" + this.challengeParameters + ", metadata=" + this.metadata + ", session=" + this.session + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowAuthError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowAuthError(Exception exception) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ ThrowAuthError copy$default(ThrowAuthError throwAuthError, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwAuthError.exception;
                }
                return throwAuthError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowAuthError copy(Exception exception) {
                AbstractC4154l.m8923f(exception, "exception");
                return new ThrowAuthError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowAuthError) && AbstractC4154l.m8918a(this.exception, ((ThrowAuthError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11237h("ThrowAuthError(exception=", ")", this.exception);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowPasswordVerifierError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowPasswordVerifierError(Exception exception) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ ThrowPasswordVerifierError copy$default(ThrowPasswordVerifierError throwPasswordVerifierError, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwPasswordVerifierError.exception;
                }
                return throwPasswordVerifierError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowPasswordVerifierError copy(Exception exception) {
                AbstractC4154l.m8923f(exception, "exception");
                return new ThrowPasswordVerifierError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowPasswordVerifierError) && AbstractC4154l.m8918a(this.exception, ((ThrowPasswordVerifierError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11237h("ThrowPasswordVerifierError(exception=", ")", this.exception);
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public SRPEvent(EventType eventType, Date date) {
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

    public /* synthetic */ SRPEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
