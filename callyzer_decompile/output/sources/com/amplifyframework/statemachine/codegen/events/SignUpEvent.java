package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.SignUpData;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignUpEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ConfirmSignUp extends EventType {
            private final String confirmationCode;
            private final SignUpData signUpData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmSignUp(SignUpData signUpData, String confirmationCode) {
                super(null);
                AbstractC4154l.m8923f(signUpData, "signUpData");
                AbstractC4154l.m8923f(confirmationCode, "confirmationCode");
                this.signUpData = signUpData;
                this.confirmationCode = confirmationCode;
            }

            public static /* synthetic */ ConfirmSignUp copy$default(ConfirmSignUp confirmSignUp, SignUpData signUpData, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signUpData = confirmSignUp.signUpData;
                }
                if ((i10 & 2) != 0) {
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

            public final ConfirmSignUp copy(SignUpData signUpData, String confirmationCode) {
                AbstractC4154l.m8923f(signUpData, "signUpData");
                AbstractC4154l.m8923f(confirmationCode, "confirmationCode");
                return new ConfirmSignUp(signUpData, confirmationCode);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfirmSignUp)) {
                    return false;
                }
                ConfirmSignUp confirmSignUp = (ConfirmSignUp) obj;
                return AbstractC4154l.m8918a(this.signUpData, confirmSignUp.signUpData) && AbstractC4154l.m8918a(this.confirmationCode, confirmSignUp.confirmationCode);
            }

            public final String getConfirmationCode() {
                return this.confirmationCode;
            }

            public final SignUpData getSignUpData() {
                return this.signUpData;
            }

            public int hashCode() {
                return this.confirmationCode.hashCode() + (this.signUpData.hashCode() * 31);
            }

            public String toString() {
                return "ConfirmSignUp(signUpData=" + this.signUpData + ", confirmationCode=" + this.confirmationCode + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateSignUp extends EventType {
            private final String password;
            private final SignUpData signUpData;
            private final List<AuthUserAttribute> userAttributes;

            public /* synthetic */ InitiateSignUp(SignUpData signUpData, String str, List list, int i10, AbstractC4148f abstractC4148f) {
                this(signUpData, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSignUp copy$default(InitiateSignUp initiateSignUp, SignUpData signUpData, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signUpData = initiateSignUp.signUpData;
                }
                if ((i10 & 2) != 0) {
                    str = initiateSignUp.password;
                }
                if ((i10 & 4) != 0) {
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
                AbstractC4154l.m8923f(signUpData, "signUpData");
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
                return AbstractC4154l.m8918a(this.signUpData, initiateSignUp.signUpData) && AbstractC4154l.m8918a(this.password, initiateSignUp.password) && AbstractC4154l.m8918a(this.userAttributes, initiateSignUp.userAttributes);
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
                SignUpData signUpData = this.signUpData;
                String str = this.password;
                List<AuthUserAttribute> list = this.userAttributes;
                StringBuilder sb2 = new StringBuilder("InitiateSignUp(signUpData=");
                sb2.append(signUpData);
                sb2.append(", password=");
                sb2.append(str);
                sb2.append(", userAttributes=");
                return AbstractC5601a.m11240k(")", sb2, list);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignUp(SignUpData signUpData, String str, List<AuthUserAttribute> list) {
                super(null);
                AbstractC4154l.m8923f(signUpData, "signUpData");
                this.signUpData = signUpData;
                this.password = str;
                this.userAttributes = list;
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateSignUpComplete extends EventType {
            private final SignUpData signUpData;
            private final AuthSignUpResult signUpResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignUpComplete(SignUpData signUpData, AuthSignUpResult signUpResult) {
                super(null);
                AbstractC4154l.m8923f(signUpData, "signUpData");
                AbstractC4154l.m8923f(signUpResult, "signUpResult");
                this.signUpData = signUpData;
                this.signUpResult = signUpResult;
            }

            public static /* synthetic */ InitiateSignUpComplete copy$default(InitiateSignUpComplete initiateSignUpComplete, SignUpData signUpData, AuthSignUpResult authSignUpResult, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signUpData = initiateSignUpComplete.signUpData;
                }
                if ((i10 & 2) != 0) {
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

            public final InitiateSignUpComplete copy(SignUpData signUpData, AuthSignUpResult signUpResult) {
                AbstractC4154l.m8923f(signUpData, "signUpData");
                AbstractC4154l.m8923f(signUpResult, "signUpResult");
                return new InitiateSignUpComplete(signUpData, signUpResult);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignUpComplete)) {
                    return false;
                }
                InitiateSignUpComplete initiateSignUpComplete = (InitiateSignUpComplete) obj;
                return AbstractC4154l.m8918a(this.signUpData, initiateSignUpComplete.signUpData) && AbstractC4154l.m8918a(this.signUpResult, initiateSignUpComplete.signUpResult);
            }

            public final SignUpData getSignUpData() {
                return this.signUpData;
            }

            public final AuthSignUpResult getSignUpResult() {
                return this.signUpResult;
            }

            public int hashCode() {
                return this.signUpResult.hashCode() + (this.signUpData.hashCode() * 31);
            }

            public String toString() {
                return "InitiateSignUpComplete(signUpData=" + this.signUpData + ", signUpResult=" + this.signUpResult + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class SignedUp extends EventType {
            private final SignUpData signUpData;
            private final AuthSignUpResult signUpResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignedUp(SignUpData signUpData, AuthSignUpResult signUpResult) {
                super(null);
                AbstractC4154l.m8923f(signUpData, "signUpData");
                AbstractC4154l.m8923f(signUpResult, "signUpResult");
                this.signUpData = signUpData;
                this.signUpResult = signUpResult;
            }

            public static /* synthetic */ SignedUp copy$default(SignedUp signedUp, SignUpData signUpData, AuthSignUpResult authSignUpResult, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signUpData = signedUp.signUpData;
                }
                if ((i10 & 2) != 0) {
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

            public final SignedUp copy(SignUpData signUpData, AuthSignUpResult signUpResult) {
                AbstractC4154l.m8923f(signUpData, "signUpData");
                AbstractC4154l.m8923f(signUpResult, "signUpResult");
                return new SignedUp(signUpData, signUpResult);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignedUp)) {
                    return false;
                }
                SignedUp signedUp = (SignedUp) obj;
                return AbstractC4154l.m8918a(this.signUpData, signedUp.signUpData) && AbstractC4154l.m8918a(this.signUpResult, signedUp.signUpResult);
            }

            public final SignUpData getSignUpData() {
                return this.signUpData;
            }

            public final AuthSignUpResult getSignUpResult() {
                return this.signUpResult;
            }

            public int hashCode() {
                return this.signUpResult.hashCode() + (this.signUpData.hashCode() * 31);
            }

            public String toString() {
                return "SignedUp(signUpData=" + this.signUpData + ", signUpResult=" + this.signUpResult + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exception) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwError.exception;
                }
                return throwError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowError copy(Exception exception) {
                AbstractC4154l.m8923f(exception, "exception");
                return new ThrowError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && AbstractC4154l.m8918a(this.exception, ((ThrowError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11237h("ThrowError(exception=", ")", this.exception);
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public SignUpEvent(EventType eventType, Date date) {
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

    public /* synthetic */ SignUpEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
