package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WebAuthnEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class AssertCredentialOptions extends EventType {
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AssertCredentialOptions(WebAuthnSignInContext signInContext) {
                super(null);
                AbstractC4154l.m8923f(signInContext, "signInContext");
                this.signInContext = signInContext;
            }

            public static /* synthetic */ AssertCredentialOptions copy$default(AssertCredentialOptions assertCredentialOptions, WebAuthnSignInContext webAuthnSignInContext, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    webAuthnSignInContext = assertCredentialOptions.signInContext;
                }
                return assertCredentialOptions.copy(webAuthnSignInContext);
            }

            public final WebAuthnSignInContext component1() {
                return this.signInContext;
            }

            public final AssertCredentialOptions copy(WebAuthnSignInContext signInContext) {
                AbstractC4154l.m8923f(signInContext, "signInContext");
                return new AssertCredentialOptions(signInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AssertCredentialOptions) && AbstractC4154l.m8918a(this.signInContext, ((AssertCredentialOptions) obj).signInContext);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FetchCredentialOptions extends EventType {
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchCredentialOptions(WebAuthnSignInContext signInContext) {
                super(null);
                AbstractC4154l.m8923f(signInContext, "signInContext");
                this.signInContext = signInContext;
            }

            public static /* synthetic */ FetchCredentialOptions copy$default(FetchCredentialOptions fetchCredentialOptions, WebAuthnSignInContext webAuthnSignInContext, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    webAuthnSignInContext = fetchCredentialOptions.signInContext;
                }
                return fetchCredentialOptions.copy(webAuthnSignInContext);
            }

            public final WebAuthnSignInContext component1() {
                return this.signInContext;
            }

            public final FetchCredentialOptions copy(WebAuthnSignInContext signInContext) {
                AbstractC4154l.m8923f(signInContext, "signInContext");
                return new FetchCredentialOptions(signInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchCredentialOptions) && AbstractC4154l.m8918a(this.signInContext, ((FetchCredentialOptions) obj).signInContext);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowError extends EventType {
            private final Exception exception;
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exception, WebAuthnSignInContext signInContext) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                AbstractC4154l.m8923f(signInContext, "signInContext");
                this.exception = exception;
                this.signInContext = signInContext;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, WebAuthnSignInContext webAuthnSignInContext, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwError.exception;
                }
                if ((i10 & 2) != 0) {
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

            public final ThrowError copy(Exception exception, WebAuthnSignInContext signInContext) {
                AbstractC4154l.m8923f(exception, "exception");
                AbstractC4154l.m8923f(signInContext, "signInContext");
                return new ThrowError(exception, signInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowError)) {
                    return false;
                }
                ThrowError throwError = (ThrowError) obj;
                return AbstractC4154l.m8918a(this.exception, throwError.exception) && AbstractC4154l.m8918a(this.signInContext, throwError.signInContext);
            }

            public final Exception getException() {
                return this.exception;
            }

            public final WebAuthnSignInContext getSignInContext() {
                return this.signInContext;
            }

            public int hashCode() {
                return this.signInContext.hashCode() + (this.exception.hashCode() * 31);
            }

            public String toString() {
                return "ThrowError(exception=" + this.exception + ", signInContext=" + this.signInContext + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class VerifyCredentialsAndSignIn extends EventType {
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyCredentialsAndSignIn(WebAuthnSignInContext signInContext) {
                super(null);
                AbstractC4154l.m8923f(signInContext, "signInContext");
                this.signInContext = signInContext;
            }

            public static /* synthetic */ VerifyCredentialsAndSignIn copy$default(VerifyCredentialsAndSignIn verifyCredentialsAndSignIn, WebAuthnSignInContext webAuthnSignInContext, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    webAuthnSignInContext = verifyCredentialsAndSignIn.signInContext;
                }
                return verifyCredentialsAndSignIn.copy(webAuthnSignInContext);
            }

            public final WebAuthnSignInContext component1() {
                return this.signInContext;
            }

            public final VerifyCredentialsAndSignIn copy(WebAuthnSignInContext signInContext) {
                AbstractC4154l.m8923f(signInContext, "signInContext");
                return new VerifyCredentialsAndSignIn(signInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VerifyCredentialsAndSignIn) && AbstractC4154l.m8918a(this.signInContext, ((VerifyCredentialsAndSignIn) obj).signInContext);
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

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public WebAuthnEvent(EventType eventType, Date date) {
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

    public /* synthetic */ WebAuthnEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
