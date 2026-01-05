package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class WebAuthnEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58135type;

    public static abstract class EventType {

        public static final class AssertCredentialOptions extends EventType {
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AssertCredentialOptions(WebAuthnSignInContext webAuthnSignInContext) {
                super(null);
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                this.signInContext = webAuthnSignInContext;
            }

            public static /* synthetic */ AssertCredentialOptions copy$default(AssertCredentialOptions assertCredentialOptions, WebAuthnSignInContext webAuthnSignInContext, int i, Object obj) {
                if ((i & 1) != 0) {
                    webAuthnSignInContext = assertCredentialOptions.signInContext;
                }
                return assertCredentialOptions.copy(webAuthnSignInContext);
            }

            public final WebAuthnSignInContext component1() {
                return this.signInContext;
            }

            public final AssertCredentialOptions copy(WebAuthnSignInContext webAuthnSignInContext) {
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                return new AssertCredentialOptions(webAuthnSignInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AssertCredentialOptions) && sq8.m48644c(this.signInContext, ((AssertCredentialOptions) obj).signInContext);
            }

            public final WebAuthnSignInContext getSignInContext() {
                return this.signInContext;
            }

            public int hashCode() {
                return this.signInContext.hashCode();
            }

            public String toString() {
                return "AssertCredentialOptions(signInContext=" + this.signInContext + ")";
            }
        }

        public static final class FetchCredentialOptions extends EventType {
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchCredentialOptions(WebAuthnSignInContext webAuthnSignInContext) {
                super(null);
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                this.signInContext = webAuthnSignInContext;
            }

            public static /* synthetic */ FetchCredentialOptions copy$default(FetchCredentialOptions fetchCredentialOptions, WebAuthnSignInContext webAuthnSignInContext, int i, Object obj) {
                if ((i & 1) != 0) {
                    webAuthnSignInContext = fetchCredentialOptions.signInContext;
                }
                return fetchCredentialOptions.copy(webAuthnSignInContext);
            }

            public final WebAuthnSignInContext component1() {
                return this.signInContext;
            }

            public final FetchCredentialOptions copy(WebAuthnSignInContext webAuthnSignInContext) {
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                return new FetchCredentialOptions(webAuthnSignInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchCredentialOptions) && sq8.m48644c(this.signInContext, ((FetchCredentialOptions) obj).signInContext);
            }

            public final WebAuthnSignInContext getSignInContext() {
                return this.signInContext;
            }

            public int hashCode() {
                return this.signInContext.hashCode();
            }

            public String toString() {
                return "FetchCredentialOptions(signInContext=" + this.signInContext + ")";
            }
        }

        public static final class ThrowError extends EventType {
            private final Exception exception;
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exc, WebAuthnSignInContext webAuthnSignInContext) {
                super(null);
                sq8.m48649h(exc, "exception");
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                this.exception = exc;
                this.signInContext = webAuthnSignInContext;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, WebAuthnSignInContext webAuthnSignInContext, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwError.exception;
                }
                if ((i & 2) != 0) {
                    webAuthnSignInContext = throwError.signInContext;
                }
                return throwError.copy(exc, webAuthnSignInContext);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final WebAuthnSignInContext component2() {
                return this.signInContext;
            }

            public final ThrowError copy(Exception exc, WebAuthnSignInContext webAuthnSignInContext) {
                sq8.m48649h(exc, "exception");
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                return new ThrowError(exc, webAuthnSignInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowError)) {
                    return false;
                }
                ThrowError throwError = (ThrowError) obj;
                return sq8.m48644c(this.exception, throwError.exception) && sq8.m48644c(this.signInContext, throwError.signInContext);
            }

            public final Exception getException() {
                return this.exception;
            }

            public final WebAuthnSignInContext getSignInContext() {
                return this.signInContext;
            }

            public int hashCode() {
                return (this.exception.hashCode() * 31) + this.signInContext.hashCode();
            }

            public String toString() {
                return "ThrowError(exception=" + this.exception + ", signInContext=" + this.signInContext + ")";
            }
        }

        public static final class VerifyCredentialsAndSignIn extends EventType {
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyCredentialsAndSignIn(WebAuthnSignInContext webAuthnSignInContext) {
                super(null);
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                this.signInContext = webAuthnSignInContext;
            }

            public static /* synthetic */ VerifyCredentialsAndSignIn copy$default(VerifyCredentialsAndSignIn verifyCredentialsAndSignIn, WebAuthnSignInContext webAuthnSignInContext, int i, Object obj) {
                if ((i & 1) != 0) {
                    webAuthnSignInContext = verifyCredentialsAndSignIn.signInContext;
                }
                return verifyCredentialsAndSignIn.copy(webAuthnSignInContext);
            }

            public final WebAuthnSignInContext component1() {
                return this.signInContext;
            }

            public final VerifyCredentialsAndSignIn copy(WebAuthnSignInContext webAuthnSignInContext) {
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                return new VerifyCredentialsAndSignIn(webAuthnSignInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VerifyCredentialsAndSignIn) && sq8.m48644c(this.signInContext, ((VerifyCredentialsAndSignIn) obj).signInContext);
            }

            public final WebAuthnSignInContext getSignInContext() {
                return this.signInContext;
            }

            public int hashCode() {
                return this.signInContext.hashCode();
            }

            public String toString() {
                return "VerifyCredentialsAndSignIn(signInContext=" + this.signInContext + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public WebAuthnEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58135type = simpleName;
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
        return this.f58135type;
    }

    public /* synthetic */ WebAuthnEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
