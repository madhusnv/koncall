package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthenticationEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class CancelSignIn extends EventType {
            private final Exception error;

            /* JADX WARN: Multi-variable type inference failed */
            public CancelSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ CancelSignIn copy$default(CancelSignIn cancelSignIn, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
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
                return (obj instanceof CancelSignIn) && AbstractC4154l.m8918a(this.error, ((CancelSignIn) obj).error);
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
                return AbstractC5601a.m11237h("CancelSignIn(error=", ")", this.error);
            }

            public CancelSignIn(Exception exc) {
                super(null);
                this.error = exc;
            }

            public /* synthetic */ CancelSignIn(Exception exc, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? null : exc);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class CancelSignOut extends EventType {
            private final DeviceMetadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelSignOut(SignedInData signedInData, DeviceMetadata deviceMetadata) {
                super(null);
                AbstractC4154l.m8923f(signedInData, "signedInData");
                AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
                this.signedInData = signedInData;
                this.deviceMetadata = deviceMetadata;
            }

            public static /* synthetic */ CancelSignOut copy$default(CancelSignOut cancelSignOut, SignedInData signedInData, DeviceMetadata deviceMetadata, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signedInData = cancelSignOut.signedInData;
                }
                if ((i10 & 2) != 0) {
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
                AbstractC4154l.m8923f(signedInData, "signedInData");
                AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
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
                return AbstractC4154l.m8918a(this.signedInData, cancelSignOut.signedInData) && AbstractC4154l.m8918a(this.deviceMetadata, cancelSignOut.deviceMetadata);
            }

            public final DeviceMetadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return this.deviceMetadata.hashCode() + (this.signedInData.hashCode() * 31);
            }

            public String toString() {
                return "CancelSignOut(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ClearFederationToIdentityPool extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43784id;

            /* JADX WARN: Multi-variable type inference failed */
            public ClearFederationToIdentityPool() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ ClearFederationToIdentityPool copy$default(ClearFederationToIdentityPool clearFederationToIdentityPool, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = clearFederationToIdentityPool.f43784id;
                }
                return clearFederationToIdentityPool.copy(str);
            }

            public final String component1() {
                return this.f43784id;
            }

            public final ClearFederationToIdentityPool copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new ClearFederationToIdentityPool(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClearFederationToIdentityPool) && AbstractC4154l.m8918a(this.f43784id, ((ClearFederationToIdentityPool) obj).f43784id);
            }

            public final String getId() {
                return this.f43784id;
            }

            public int hashCode() {
                return this.f43784id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("ClearFederationToIdentityPool(id=", this.f43784id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClearFederationToIdentityPool(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43784id = id2;
            }

            public /* synthetic */ ClearFederationToIdentityPool(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Configure extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Configure(AuthConfiguration configuration, AmplifyCredential storedCredentials) {
                super(null);
                AbstractC4154l.m8923f(configuration, "configuration");
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                this.configuration = configuration;
                this.storedCredentials = storedCredentials;
            }

            public static /* synthetic */ Configure copy$default(Configure configure, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authConfiguration = configure.configuration;
                }
                if ((i10 & 2) != 0) {
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

            public final Configure copy(AuthConfiguration configuration, AmplifyCredential storedCredentials) {
                AbstractC4154l.m8923f(configuration, "configuration");
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                return new Configure(configuration, storedCredentials);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Configure)) {
                    return false;
                }
                Configure configure = (Configure) obj;
                return AbstractC4154l.m8918a(this.configuration, configure.configuration) && AbstractC4154l.m8918a(this.storedCredentials, configure.storedCredentials);
            }

            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return this.storedCredentials.hashCode() + (this.configuration.hashCode() * 31);
            }

            public String toString() {
                return "Configure(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Configured extends EventType {
            public static final Configured INSTANCE = new Configured();

            private Configured() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitializedFederated extends EventType {
            public static final InitializedFederated INSTANCE = new InitializedFederated();

            private InitializedFederated() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitializedSignedIn extends EventType {
            private final DeviceMetadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializedSignedIn(SignedInData signedInData, DeviceMetadata deviceMetadata) {
                super(null);
                AbstractC4154l.m8923f(signedInData, "signedInData");
                AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
                this.signedInData = signedInData;
                this.deviceMetadata = deviceMetadata;
            }

            public static /* synthetic */ InitializedSignedIn copy$default(InitializedSignedIn initializedSignedIn, SignedInData signedInData, DeviceMetadata deviceMetadata, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signedInData = initializedSignedIn.signedInData;
                }
                if ((i10 & 2) != 0) {
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
                AbstractC4154l.m8923f(signedInData, "signedInData");
                AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
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
                return AbstractC4154l.m8918a(this.signedInData, initializedSignedIn.signedInData) && AbstractC4154l.m8918a(this.deviceMetadata, initializedSignedIn.deviceMetadata);
            }

            public final DeviceMetadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return this.deviceMetadata.hashCode() + (this.signedInData.hashCode() * 31);
            }

            public String toString() {
                return "InitializedSignedIn(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitializedSignedOut extends EventType {
            private final SignedOutData signedOutData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializedSignedOut(SignedOutData signedOutData) {
                super(null);
                AbstractC4154l.m8923f(signedOutData, "signedOutData");
                this.signedOutData = signedOutData;
            }

            public static /* synthetic */ InitializedSignedOut copy$default(InitializedSignedOut initializedSignedOut, SignedOutData signedOutData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signedOutData = initializedSignedOut.signedOutData;
                }
                return initializedSignedOut.copy(signedOutData);
            }

            public final SignedOutData component1() {
                return this.signedOutData;
            }

            public final InitializedSignedOut copy(SignedOutData signedOutData) {
                AbstractC4154l.m8923f(signedOutData, "signedOutData");
                return new InitializedSignedOut(signedOutData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitializedSignedOut) && AbstractC4154l.m8918a(this.signedOutData, ((InitializedSignedOut) obj).signedOutData);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class SignInCompleted extends EventType {
            private final DeviceMetadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignInCompleted(SignedInData signedInData, DeviceMetadata deviceMetadata) {
                super(null);
                AbstractC4154l.m8923f(signedInData, "signedInData");
                AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
                this.signedInData = signedInData;
                this.deviceMetadata = deviceMetadata;
            }

            public static /* synthetic */ SignInCompleted copy$default(SignInCompleted signInCompleted, SignedInData signedInData, DeviceMetadata deviceMetadata, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signedInData = signInCompleted.signedInData;
                }
                if ((i10 & 2) != 0) {
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
                AbstractC4154l.m8923f(signedInData, "signedInData");
                AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
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
                return AbstractC4154l.m8918a(this.signedInData, signInCompleted.signedInData) && AbstractC4154l.m8918a(this.deviceMetadata, signInCompleted.deviceMetadata);
            }

            public final DeviceMetadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return this.deviceMetadata.hashCode() + (this.signedInData.hashCode() * 31);
            }

            public String toString() {
                return "SignInCompleted(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class SignInRequested extends EventType {
            private final SignInData signInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignInRequested(SignInData signInData) {
                super(null);
                AbstractC4154l.m8923f(signInData, "signInData");
                this.signInData = signInData;
            }

            public static /* synthetic */ SignInRequested copy$default(SignInRequested signInRequested, SignInData signInData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signInData = signInRequested.signInData;
                }
                return signInRequested.copy(signInData);
            }

            public final SignInData component1() {
                return this.signInData;
            }

            public final SignInRequested copy(SignInData signInData) {
                AbstractC4154l.m8923f(signInData, "signInData");
                return new SignInRequested(signInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignInRequested) && AbstractC4154l.m8918a(this.signInData, ((SignInRequested) obj).signInData);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class SignOutRequested extends EventType {
            private final SignOutData signOutData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignOutRequested(SignOutData signOutData) {
                super(null);
                AbstractC4154l.m8923f(signOutData, "signOutData");
                this.signOutData = signOutData;
            }

            public static /* synthetic */ SignOutRequested copy$default(SignOutRequested signOutRequested, SignOutData signOutData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signOutData = signOutRequested.signOutData;
                }
                return signOutRequested.copy(signOutData);
            }

            public final SignOutData component1() {
                return this.signOutData;
            }

            public final SignOutRequested copy(SignOutData signOutData) {
                AbstractC4154l.m8923f(signOutData, "signOutData");
                return new SignOutRequested(signOutData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignOutRequested) && AbstractC4154l.m8918a(this.signOutData, ((SignOutRequested) obj).signOutData);
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

    public AuthenticationEvent(EventType eventType, Date date) {
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

    public /* synthetic */ AuthenticationEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
