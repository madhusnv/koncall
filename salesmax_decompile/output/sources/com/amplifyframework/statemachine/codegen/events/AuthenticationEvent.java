package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthenticationEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58120type;

    public static abstract class EventType {

        public static final class CancelSignIn extends EventType {
            private final Exception error;

            /* JADX WARN: Multi-variable type inference failed */
            public CancelSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ CancelSignIn copy$default(CancelSignIn cancelSignIn, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = cancelSignIn.error;
                }
                return cancelSignIn.copy(exc);
            }

            public final Exception component1() {
                return this.error;
            }

            public final CancelSignIn copy(Exception exc) {
                return new CancelSignIn(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CancelSignIn) && sq8.m48644c(this.error, ((CancelSignIn) obj).error);
            }

            public final Exception getError() {
                return this.error;
            }

            public int hashCode() {
                Exception exc = this.error;
                if (exc == null) {
                    return 0;
                }
                return exc.hashCode();
            }

            public String toString() {
                return "CancelSignIn(error=" + this.error + ")";
            }

            public CancelSignIn(Exception exc) {
                super(null);
                this.error = exc;
            }

            public /* synthetic */ CancelSignIn(Exception exc, int i, id5 id5Var) {
                this((i & 1) != 0 ? null : exc);
            }
        }

        public static final class CancelSignOut extends EventType {
            private final DeviceMetadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelSignOut(SignedInData signedInData, DeviceMetadata deviceMetadata) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                sq8.m48649h(deviceMetadata, "deviceMetadata");
                this.signedInData = signedInData;
                this.deviceMetadata = deviceMetadata;
            }

            public static /* synthetic */ CancelSignOut copy$default(CancelSignOut cancelSignOut, SignedInData signedInData, DeviceMetadata deviceMetadata, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = cancelSignOut.signedInData;
                }
                if ((i & 2) != 0) {
                    deviceMetadata = cancelSignOut.deviceMetadata;
                }
                return cancelSignOut.copy(signedInData, deviceMetadata);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final DeviceMetadata component2() {
                return this.deviceMetadata;
            }

            public final CancelSignOut copy(SignedInData signedInData, DeviceMetadata deviceMetadata) {
                sq8.m48649h(signedInData, "signedInData");
                sq8.m48649h(deviceMetadata, "deviceMetadata");
                return new CancelSignOut(signedInData, deviceMetadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CancelSignOut)) {
                    return false;
                }
                CancelSignOut cancelSignOut = (CancelSignOut) obj;
                return sq8.m48644c(this.signedInData, cancelSignOut.signedInData) && sq8.m48644c(this.deviceMetadata, cancelSignOut.deviceMetadata);
            }

            public final DeviceMetadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return (this.signedInData.hashCode() * 31) + this.deviceMetadata.hashCode();
            }

            public String toString() {
                return "CancelSignOut(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
            }
        }

        public static final class ClearFederationToIdentityPool extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public ClearFederationToIdentityPool() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ ClearFederationToIdentityPool copy$default(ClearFederationToIdentityPool clearFederationToIdentityPool, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = clearFederationToIdentityPool.id;
                }
                return clearFederationToIdentityPool.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final ClearFederationToIdentityPool copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new ClearFederationToIdentityPool(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClearFederationToIdentityPool) && sq8.m48644c(this.id, ((ClearFederationToIdentityPool) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "ClearFederationToIdentityPool(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClearFederationToIdentityPool(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ ClearFederationToIdentityPool(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class Configure extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Configure(AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(authConfiguration, "configuration");
                sq8.m48649h(amplifyCredential, "storedCredentials");
                this.configuration = authConfiguration;
                this.storedCredentials = amplifyCredential;
            }

            public static /* synthetic */ Configure copy$default(Configure configure, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configure.configuration;
                }
                if ((i & 2) != 0) {
                    amplifyCredential = configure.storedCredentials;
                }
                return configure.copy(authConfiguration, amplifyCredential);
            }

            public final AuthConfiguration component1() {
                return this.configuration;
            }

            public final AmplifyCredential component2() {
                return this.storedCredentials;
            }

            public final Configure copy(AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential) {
                sq8.m48649h(authConfiguration, "configuration");
                sq8.m48649h(amplifyCredential, "storedCredentials");
                return new Configure(authConfiguration, amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Configure)) {
                    return false;
                }
                Configure configure = (Configure) obj;
                return sq8.m48644c(this.configuration, configure.configuration) && sq8.m48644c(this.storedCredentials, configure.storedCredentials);
            }

            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return (this.configuration.hashCode() * 31) + this.storedCredentials.hashCode();
            }

            public String toString() {
                return "Configure(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }
        }

        public static final class Configured extends EventType {
            public static final Configured INSTANCE = new Configured();

            private Configured() {
                super(null);
            }
        }

        public static final class InitializedFederated extends EventType {
            public static final InitializedFederated INSTANCE = new InitializedFederated();

            private InitializedFederated() {
                super(null);
            }
        }

        public static final class InitializedSignedIn extends EventType {
            private final DeviceMetadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializedSignedIn(SignedInData signedInData, DeviceMetadata deviceMetadata) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                sq8.m48649h(deviceMetadata, "deviceMetadata");
                this.signedInData = signedInData;
                this.deviceMetadata = deviceMetadata;
            }

            public static /* synthetic */ InitializedSignedIn copy$default(InitializedSignedIn initializedSignedIn, SignedInData signedInData, DeviceMetadata deviceMetadata, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = initializedSignedIn.signedInData;
                }
                if ((i & 2) != 0) {
                    deviceMetadata = initializedSignedIn.deviceMetadata;
                }
                return initializedSignedIn.copy(signedInData, deviceMetadata);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final DeviceMetadata component2() {
                return this.deviceMetadata;
            }

            public final InitializedSignedIn copy(SignedInData signedInData, DeviceMetadata deviceMetadata) {
                sq8.m48649h(signedInData, "signedInData");
                sq8.m48649h(deviceMetadata, "deviceMetadata");
                return new InitializedSignedIn(signedInData, deviceMetadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitializedSignedIn)) {
                    return false;
                }
                InitializedSignedIn initializedSignedIn = (InitializedSignedIn) obj;
                return sq8.m48644c(this.signedInData, initializedSignedIn.signedInData) && sq8.m48644c(this.deviceMetadata, initializedSignedIn.deviceMetadata);
            }

            public final DeviceMetadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return (this.signedInData.hashCode() * 31) + this.deviceMetadata.hashCode();
            }

            public String toString() {
                return "InitializedSignedIn(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
            }
        }

        public static final class InitializedSignedOut extends EventType {
            private final SignedOutData signedOutData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializedSignedOut(SignedOutData signedOutData) {
                super(null);
                sq8.m48649h(signedOutData, "signedOutData");
                this.signedOutData = signedOutData;
            }

            public static /* synthetic */ InitializedSignedOut copy$default(InitializedSignedOut initializedSignedOut, SignedOutData signedOutData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedOutData = initializedSignedOut.signedOutData;
                }
                return initializedSignedOut.copy(signedOutData);
            }

            public final SignedOutData component1() {
                return this.signedOutData;
            }

            public final InitializedSignedOut copy(SignedOutData signedOutData) {
                sq8.m48649h(signedOutData, "signedOutData");
                return new InitializedSignedOut(signedOutData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitializedSignedOut) && sq8.m48644c(this.signedOutData, ((InitializedSignedOut) obj).signedOutData);
            }

            public final SignedOutData getSignedOutData() {
                return this.signedOutData;
            }

            public int hashCode() {
                return this.signedOutData.hashCode();
            }

            public String toString() {
                return "InitializedSignedOut(signedOutData=" + this.signedOutData + ")";
            }
        }

        public static final class SignInCompleted extends EventType {
            private final DeviceMetadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignInCompleted(SignedInData signedInData, DeviceMetadata deviceMetadata) {
                super(null);
                sq8.m48649h(signedInData, "signedInData");
                sq8.m48649h(deviceMetadata, "deviceMetadata");
                this.signedInData = signedInData;
                this.deviceMetadata = deviceMetadata;
            }

            public static /* synthetic */ SignInCompleted copy$default(SignInCompleted signInCompleted, SignedInData signedInData, DeviceMetadata deviceMetadata, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = signInCompleted.signedInData;
                }
                if ((i & 2) != 0) {
                    deviceMetadata = signInCompleted.deviceMetadata;
                }
                return signInCompleted.copy(signedInData, deviceMetadata);
            }

            public final SignedInData component1() {
                return this.signedInData;
            }

            public final DeviceMetadata component2() {
                return this.deviceMetadata;
            }

            public final SignInCompleted copy(SignedInData signedInData, DeviceMetadata deviceMetadata) {
                sq8.m48649h(signedInData, "signedInData");
                sq8.m48649h(deviceMetadata, "deviceMetadata");
                return new SignInCompleted(signedInData, deviceMetadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignInCompleted)) {
                    return false;
                }
                SignInCompleted signInCompleted = (SignInCompleted) obj;
                return sq8.m48644c(this.signedInData, signInCompleted.signedInData) && sq8.m48644c(this.deviceMetadata, signInCompleted.deviceMetadata);
            }

            public final DeviceMetadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return (this.signedInData.hashCode() * 31) + this.deviceMetadata.hashCode();
            }

            public String toString() {
                return "SignInCompleted(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
            }
        }

        public static final class SignInRequested extends EventType {
            private final SignInData signInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignInRequested(SignInData signInData) {
                super(null);
                sq8.m48649h(signInData, "signInData");
                this.signInData = signInData;
            }

            public static /* synthetic */ SignInRequested copy$default(SignInRequested signInRequested, SignInData signInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signInData = signInRequested.signInData;
                }
                return signInRequested.copy(signInData);
            }

            public final SignInData component1() {
                return this.signInData;
            }

            public final SignInRequested copy(SignInData signInData) {
                sq8.m48649h(signInData, "signInData");
                return new SignInRequested(signInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignInRequested) && sq8.m48644c(this.signInData, ((SignInRequested) obj).signInData);
            }

            public final SignInData getSignInData() {
                return this.signInData;
            }

            public int hashCode() {
                return this.signInData.hashCode();
            }

            public String toString() {
                return "SignInRequested(signInData=" + this.signInData + ")";
            }
        }

        public static final class SignOutRequested extends EventType {
            private final SignOutData signOutData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignOutRequested(SignOutData signOutData) {
                super(null);
                sq8.m48649h(signOutData, "signOutData");
                this.signOutData = signOutData;
            }

            public static /* synthetic */ SignOutRequested copy$default(SignOutRequested signOutRequested, SignOutData signOutData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signOutData = signOutRequested.signOutData;
                }
                return signOutRequested.copy(signOutData);
            }

            public final SignOutData component1() {
                return this.signOutData;
            }

            public final SignOutRequested copy(SignOutData signOutData) {
                sq8.m48649h(signOutData, "signOutData");
                return new SignOutRequested(signOutData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignOutRequested) && sq8.m48644c(this.signOutData, ((SignOutRequested) obj).signOutData);
            }

            public final SignOutData getSignOutData() {
                return this.signOutData;
            }

            public int hashCode() {
                return this.signOutData.hashCode();
            }

            public String toString() {
                return "SignOutRequested(signOutData=" + this.signOutData + ")";
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

    public AuthenticationEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58120type = simpleName;
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
        return this.f58120type;
    }

    public /* synthetic */ AuthenticationEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
