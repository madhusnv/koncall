package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.SignUpData;
import java.util.Date;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignUpEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58134type;

    public static abstract class EventType {

        public static final class ConfirmSignUp extends EventType {
            private final String confirmationCode;
            private final SignUpData signUpData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmSignUp(SignUpData signUpData, String str) {
                super(null);
                sq8.m48649h(signUpData, "signUpData");
                sq8.m48649h(str, "confirmationCode");
                this.signUpData = signUpData;
                this.confirmationCode = str;
            }

            public static /* synthetic */ ConfirmSignUp copy$default(ConfirmSignUp confirmSignUp, SignUpData signUpData, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    signUpData = confirmSignUp.signUpData;
                }
                if ((i & 2) != 0) {
                    str = confirmSignUp.confirmationCode;
                }
                return confirmSignUp.copy(signUpData, str);
            }

            public final SignUpData component1() {
                return this.signUpData;
            }

            public final String component2() {
                return this.confirmationCode;
            }

            public final ConfirmSignUp copy(SignUpData signUpData, String str) {
                sq8.m48649h(signUpData, "signUpData");
                sq8.m48649h(str, "confirmationCode");
                return new ConfirmSignUp(signUpData, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfirmSignUp)) {
                    return false;
                }
                ConfirmSignUp confirmSignUp = (ConfirmSignUp) obj;
                return sq8.m48644c(this.signUpData, confirmSignUp.signUpData) && sq8.m48644c(this.confirmationCode, confirmSignUp.confirmationCode);
            }

            public final String getConfirmationCode() {
                return this.confirmationCode;
            }

            public final SignUpData getSignUpData() {
                return this.signUpData;
            }

            public int hashCode() {
                return (this.signUpData.hashCode() * 31) + this.confirmationCode.hashCode();
            }

            public String toString() {
                return "ConfirmSignUp(signUpData=" + this.signUpData + ", confirmationCode=" + this.confirmationCode + ")";
            }
        }

        public static final class InitiateSignUp extends EventType {
            private final String password;
            private final SignUpData signUpData;
            private final List<AuthUserAttribute> userAttributes;

            public /* synthetic */ InitiateSignUp(SignUpData signUpData, String str, List list, int i, id5 id5Var) {
                this(signUpData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSignUp copy$default(InitiateSignUp initiateSignUp, SignUpData signUpData, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    signUpData = initiateSignUp.signUpData;
                }
                if ((i & 2) != 0) {
                    str = initiateSignUp.password;
                }
                if ((i & 4) != 0) {
                    list = initiateSignUp.userAttributes;
                }
                return initiateSignUp.copy(signUpData, str, list);
            }

            public final SignUpData component1() {
                return this.signUpData;
            }

            public final String component2() {
                return this.password;
            }

            public final List<AuthUserAttribute> component3() {
                return this.userAttributes;
            }

            public final InitiateSignUp copy(SignUpData signUpData, String str, List<AuthUserAttribute> list) {
                sq8.m48649h(signUpData, "signUpData");
                return new InitiateSignUp(signUpData, str, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignUp)) {
                    return false;
                }
                InitiateSignUp initiateSignUp = (InitiateSignUp) obj;
                return sq8.m48644c(this.signUpData, initiateSignUp.signUpData) && sq8.m48644c(this.password, initiateSignUp.password) && sq8.m48644c(this.userAttributes, initiateSignUp.userAttributes);
            }

            public final String getPassword() {
                return this.password;
            }

            public final SignUpData getSignUpData() {
                return this.signUpData;
            }

            public final List<AuthUserAttribute> getUserAttributes() {
                return this.userAttributes;
            }

            public int hashCode() {
                int iHashCode = this.signUpData.hashCode() * 31;
                String str = this.password;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                List<AuthUserAttribute> list = this.userAttributes;
                return iHashCode2 + (list != null ? list.hashCode() : 0);
            }

            public String toString() {
                return "InitiateSignUp(signUpData=" + this.signUpData + ", password=" + this.password + ", userAttributes=" + this.userAttributes + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignUp(SignUpData signUpData, String str, List<AuthUserAttribute> list) {
                super(null);
                sq8.m48649h(signUpData, "signUpData");
                this.signUpData = signUpData;
                this.password = str;
                this.userAttributes = list;
            }
        }

        public static final class InitiateSignUpComplete extends EventType {
            private final SignUpData signUpData;
            private final AuthSignUpResult signUpResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignUpComplete(SignUpData signUpData, AuthSignUpResult authSignUpResult) {
                super(null);
                sq8.m48649h(signUpData, "signUpData");
                sq8.m48649h(authSignUpResult, "signUpResult");
                this.signUpData = signUpData;
                this.signUpResult = authSignUpResult;
            }

            public static /* synthetic */ InitiateSignUpComplete copy$default(InitiateSignUpComplete initiateSignUpComplete, SignUpData signUpData, AuthSignUpResult authSignUpResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    signUpData = initiateSignUpComplete.signUpData;
                }
                if ((i & 2) != 0) {
                    authSignUpResult = initiateSignUpComplete.signUpResult;
                }
                return initiateSignUpComplete.copy(signUpData, authSignUpResult);
            }

            public final SignUpData component1() {
                return this.signUpData;
            }

            public final AuthSignUpResult component2() {
                return this.signUpResult;
            }

            public final InitiateSignUpComplete copy(SignUpData signUpData, AuthSignUpResult authSignUpResult) {
                sq8.m48649h(signUpData, "signUpData");
                sq8.m48649h(authSignUpResult, "signUpResult");
                return new InitiateSignUpComplete(signUpData, authSignUpResult);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignUpComplete)) {
                    return false;
                }
                InitiateSignUpComplete initiateSignUpComplete = (InitiateSignUpComplete) obj;
                return sq8.m48644c(this.signUpData, initiateSignUpComplete.signUpData) && sq8.m48644c(this.signUpResult, initiateSignUpComplete.signUpResult);
            }

            public final SignUpData getSignUpData() {
                return this.signUpData;
            }

            public final AuthSignUpResult getSignUpResult() {
                return this.signUpResult;
            }

            public int hashCode() {
                return (this.signUpData.hashCode() * 31) + this.signUpResult.hashCode();
            }

            public String toString() {
                return "InitiateSignUpComplete(signUpData=" + this.signUpData + ", signUpResult=" + this.signUpResult + ")";
            }
        }

        public static final class SignedUp extends EventType {
            private final SignUpData signUpData;
            private final AuthSignUpResult signUpResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignedUp(SignUpData signUpData, AuthSignUpResult authSignUpResult) {
                super(null);
                sq8.m48649h(signUpData, "signUpData");
                sq8.m48649h(authSignUpResult, "signUpResult");
                this.signUpData = signUpData;
                this.signUpResult = authSignUpResult;
            }

            public static /* synthetic */ SignedUp copy$default(SignedUp signedUp, SignUpData signUpData, AuthSignUpResult authSignUpResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    signUpData = signedUp.signUpData;
                }
                if ((i & 2) != 0) {
                    authSignUpResult = signedUp.signUpResult;
                }
                return signedUp.copy(signUpData, authSignUpResult);
            }

            public final SignUpData component1() {
                return this.signUpData;
            }

            public final AuthSignUpResult component2() {
                return this.signUpResult;
            }

            public final SignedUp copy(SignUpData signUpData, AuthSignUpResult authSignUpResult) {
                sq8.m48649h(signUpData, "signUpData");
                sq8.m48649h(authSignUpResult, "signUpResult");
                return new SignedUp(signUpData, authSignUpResult);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignedUp)) {
                    return false;
                }
                SignedUp signedUp = (SignedUp) obj;
                return sq8.m48644c(this.signUpData, signedUp.signUpData) && sq8.m48644c(this.signUpResult, signedUp.signUpResult);
            }

            public final SignUpData getSignUpData() {
                return this.signUpData;
            }

            public final AuthSignUpResult getSignUpResult() {
                return this.signUpResult;
            }

            public int hashCode() {
                return (this.signUpData.hashCode() * 31) + this.signUpResult.hashCode();
            }

            public String toString() {
                return "SignedUp(signUpData=" + this.signUpData + ", signUpResult=" + this.signUpResult + ")";
            }
        }

        public static final class ThrowError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exc) {
                super(null);
                sq8.m48649h(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwError.exception;
                }
                return throwError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowError copy(Exception exc) {
                sq8.m48649h(exc, "exception");
                return new ThrowError(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && sq8.m48644c(this.exception, ((ThrowError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrowError(exception=" + this.exception + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public SignUpEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58134type = simpleName;
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
        return this.f58134type;
    }

    public /* synthetic */ SignUpEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
