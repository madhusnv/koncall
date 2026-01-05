package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInChallengeEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FinalizeSignIn extends EventType {
            private final String accessToken;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinalizeSignIn(String accessToken) {
                super(null);
                AbstractC4154l.m8923f(accessToken, "accessToken");
                this.accessToken = accessToken;
            }

            public static /* synthetic */ FinalizeSignIn copy$default(FinalizeSignIn finalizeSignIn, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = finalizeSignIn.accessToken;
                }
                return finalizeSignIn.copy(str);
            }

            public final String component1() {
                return this.accessToken;
            }

            public final FinalizeSignIn copy(String accessToken) {
                AbstractC4154l.m8923f(accessToken, "accessToken");
                return new FinalizeSignIn(accessToken);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinalizeSignIn) && AbstractC4154l.m8918a(this.accessToken, ((FinalizeSignIn) obj).accessToken);
            }

            public final String getAccessToken() {
                return this.accessToken;
            }

            public int hashCode() {
                return this.accessToken.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("FinalizeSignIn(accessToken=", this.accessToken, ")");
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RetryVerifyChallengeAnswer extends EventType {
            private final String answer;
            private final AuthChallenge authChallenge;
            private final Map<String, String> metadata;
            private final List<AuthUserAttribute> userAttributes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetryVerifyChallengeAnswer(String answer, Map<String, String> metadata, List<AuthUserAttribute> userAttributes, AuthChallenge authChallenge) {
                super(null);
                AbstractC4154l.m8923f(answer, "answer");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(userAttributes, "userAttributes");
                AbstractC4154l.m8923f(authChallenge, "authChallenge");
                this.answer = answer;
                this.metadata = metadata;
                this.userAttributes = userAttributes;
                this.authChallenge = authChallenge;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RetryVerifyChallengeAnswer copy$default(RetryVerifyChallengeAnswer retryVerifyChallengeAnswer, String str, Map map, List list, AuthChallenge authChallenge, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = retryVerifyChallengeAnswer.answer;
                }
                if ((i10 & 2) != 0) {
                    map = retryVerifyChallengeAnswer.metadata;
                }
                if ((i10 & 4) != 0) {
                    list = retryVerifyChallengeAnswer.userAttributes;
                }
                if ((i10 & 8) != 0) {
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

            public final RetryVerifyChallengeAnswer copy(String answer, Map<String, String> metadata, List<AuthUserAttribute> userAttributes, AuthChallenge authChallenge) {
                AbstractC4154l.m8923f(answer, "answer");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(userAttributes, "userAttributes");
                AbstractC4154l.m8923f(authChallenge, "authChallenge");
                return new RetryVerifyChallengeAnswer(answer, metadata, userAttributes, authChallenge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RetryVerifyChallengeAnswer)) {
                    return false;
                }
                RetryVerifyChallengeAnswer retryVerifyChallengeAnswer = (RetryVerifyChallengeAnswer) obj;
                return AbstractC4154l.m8918a(this.answer, retryVerifyChallengeAnswer.answer) && AbstractC4154l.m8918a(this.metadata, retryVerifyChallengeAnswer.metadata) && AbstractC4154l.m8918a(this.userAttributes, retryVerifyChallengeAnswer.userAttributes) && AbstractC4154l.m8918a(this.authChallenge, retryVerifyChallengeAnswer.authChallenge);
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
                return this.authChallenge.hashCode() + AbstractC1452a.m4559f(this.userAttributes, m0.m7369b(this.answer.hashCode() * 31, 31, this.metadata), 31);
            }

            public String toString() {
                return "RetryVerifyChallengeAnswer(answer=" + this.answer + ", metadata=" + this.metadata + ", userAttributes=" + this.userAttributes + ", authChallenge=" + this.authChallenge + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowError extends EventType {
            private final AuthChallenge challenge;
            private final Exception exception;
            private final boolean hasNewResponse;

            public /* synthetic */ ThrowError(Exception exc, AuthChallenge authChallenge, boolean z6, int i10, AbstractC4148f abstractC4148f) {
                this(exc, authChallenge, (i10 & 4) != 0 ? false : z6);
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, AuthChallenge authChallenge, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwError.exception;
                }
                if ((i10 & 2) != 0) {
                    authChallenge = throwError.challenge;
                }
                if ((i10 & 4) != 0) {
                    z6 = throwError.hasNewResponse;
                }
                return throwError.copy(exc, authChallenge, z6);
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

            public final ThrowError copy(Exception exception, AuthChallenge challenge, boolean z6) {
                AbstractC4154l.m8923f(exception, "exception");
                AbstractC4154l.m8923f(challenge, "challenge");
                return new ThrowError(exception, challenge, z6);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowError)) {
                    return false;
                }
                ThrowError throwError = (ThrowError) obj;
                return AbstractC4154l.m8918a(this.exception, throwError.exception) && AbstractC4154l.m8918a(this.challenge, throwError.challenge) && this.hasNewResponse == throwError.hasNewResponse;
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

            public int hashCode() {
                return Boolean.hashCode(this.hasNewResponse) + ((this.challenge.hashCode() + (this.exception.hashCode() * 31)) * 31);
            }

            public String toString() {
                Exception exc = this.exception;
                AuthChallenge authChallenge = this.challenge;
                boolean z6 = this.hasNewResponse;
                StringBuilder sb2 = new StringBuilder("ThrowError(exception=");
                sb2.append(exc);
                sb2.append(", challenge=");
                sb2.append(authChallenge);
                sb2.append(", hasNewResponse=");
                return AbstractC5601a.m11242m(sb2, z6, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exception, AuthChallenge challenge, boolean z6) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                AbstractC4154l.m8923f(challenge, "challenge");
                this.exception = exception;
                this.challenge = challenge;
                this.hasNewResponse = z6;
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Verified extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43794id;

            /* JADX WARN: Multi-variable type inference failed */
            public Verified() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Verified copy$default(Verified verified, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = verified.f43794id;
                }
                return verified.copy(str);
            }

            public final String component1() {
                return this.f43794id;
            }

            public final Verified copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new Verified(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Verified) && AbstractC4154l.m8918a(this.f43794id, ((Verified) obj).f43794id);
            }

            public final String getId() {
                return this.f43794id;
            }

            public int hashCode() {
                return this.f43794id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("Verified(id=", this.f43794id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Verified(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43794id = id2;
            }

            public /* synthetic */ Verified(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class VerifyChallengeAnswer extends EventType {
            private final String answer;
            private final Map<String, String> metadata;
            private final List<AuthUserAttribute> userAttributes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyChallengeAnswer(String answer, Map<String, String> metadata, List<AuthUserAttribute> userAttributes) {
                super(null);
                AbstractC4154l.m8923f(answer, "answer");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(userAttributes, "userAttributes");
                this.answer = answer;
                this.metadata = metadata;
                this.userAttributes = userAttributes;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VerifyChallengeAnswer copy$default(VerifyChallengeAnswer verifyChallengeAnswer, String str, Map map, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = verifyChallengeAnswer.answer;
                }
                if ((i10 & 2) != 0) {
                    map = verifyChallengeAnswer.metadata;
                }
                if ((i10 & 4) != 0) {
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

            public final VerifyChallengeAnswer copy(String answer, Map<String, String> metadata, List<AuthUserAttribute> userAttributes) {
                AbstractC4154l.m8923f(answer, "answer");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(userAttributes, "userAttributes");
                return new VerifyChallengeAnswer(answer, metadata, userAttributes);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyChallengeAnswer)) {
                    return false;
                }
                VerifyChallengeAnswer verifyChallengeAnswer = (VerifyChallengeAnswer) obj;
                return AbstractC4154l.m8918a(this.answer, verifyChallengeAnswer.answer) && AbstractC4154l.m8918a(this.metadata, verifyChallengeAnswer.metadata) && AbstractC4154l.m8918a(this.userAttributes, verifyChallengeAnswer.userAttributes);
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
                return this.userAttributes.hashCode() + m0.m7369b(this.answer.hashCode() * 31, 31, this.metadata);
            }

            public String toString() {
                String str = this.answer;
                Map<String, String> map = this.metadata;
                List<AuthUserAttribute> list = this.userAttributes;
                StringBuilder sb2 = new StringBuilder("VerifyChallengeAnswer(answer=");
                sb2.append(str);
                sb2.append(", metadata=");
                sb2.append(map);
                sb2.append(", userAttributes=");
                return AbstractC5601a.m11240k(")", sb2, list);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class WaitForAnswer extends EventType {
            private final AuthChallenge challenge;
            private final boolean hasNewResponse;
            private final SignInMethod signInMethod;

            public /* synthetic */ WaitForAnswer(AuthChallenge authChallenge, SignInMethod signInMethod, boolean z6, int i10, AbstractC4148f abstractC4148f) {
                this(authChallenge, signInMethod, (i10 & 4) != 0 ? false : z6);
            }

            public static /* synthetic */ WaitForAnswer copy$default(WaitForAnswer waitForAnswer, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authChallenge = waitForAnswer.challenge;
                }
                if ((i10 & 2) != 0) {
                    signInMethod = waitForAnswer.signInMethod;
                }
                if ((i10 & 4) != 0) {
                    z6 = waitForAnswer.hasNewResponse;
                }
                return waitForAnswer.copy(authChallenge, signInMethod, z6);
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

            public final WaitForAnswer copy(AuthChallenge challenge, SignInMethod signInMethod, boolean z6) {
                AbstractC4154l.m8923f(challenge, "challenge");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                return new WaitForAnswer(challenge, signInMethod, z6);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WaitForAnswer)) {
                    return false;
                }
                WaitForAnswer waitForAnswer = (WaitForAnswer) obj;
                return AbstractC4154l.m8918a(this.challenge, waitForAnswer.challenge) && AbstractC4154l.m8918a(this.signInMethod, waitForAnswer.signInMethod) && this.hasNewResponse == waitForAnswer.hasNewResponse;
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

            public int hashCode() {
                return Boolean.hashCode(this.hasNewResponse) + ((this.signInMethod.hashCode() + (this.challenge.hashCode() * 31)) * 31);
            }

            public String toString() {
                AuthChallenge authChallenge = this.challenge;
                SignInMethod signInMethod = this.signInMethod;
                boolean z6 = this.hasNewResponse;
                StringBuilder sb2 = new StringBuilder("WaitForAnswer(challenge=");
                sb2.append(authChallenge);
                sb2.append(", signInMethod=");
                sb2.append(signInMethod);
                sb2.append(", hasNewResponse=");
                return AbstractC5601a.m11242m(sb2, z6, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WaitForAnswer(AuthChallenge challenge, SignInMethod signInMethod, boolean z6) {
                super(null);
                AbstractC4154l.m8923f(challenge, "challenge");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                this.challenge = challenge;
                this.signInMethod = signInMethod;
                this.hasNewResponse = z6;
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public SignInChallengeEvent(EventType eventType, Date date) {
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

    public /* synthetic */ SignInChallengeEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
