package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.auth.cognito.exceptions.service.UserCancelledException;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SignOutActions;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.sun.mail.util.AbstractC1452a;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SignOutState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class BuildingRevokeTokenError extends SignOutState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43849id;

        /* JADX WARN: Multi-variable type inference failed */
        public BuildingRevokeTokenError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ BuildingRevokeTokenError copy$default(BuildingRevokeTokenError buildingRevokeTokenError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = buildingRevokeTokenError.f43849id;
            }
            return buildingRevokeTokenError.copy(str);
        }

        public final String component1() {
            return this.f43849id;
        }

        public final BuildingRevokeTokenError copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new BuildingRevokeTokenError(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuildingRevokeTokenError) && AbstractC4154l.m8918a(this.f43849id, ((BuildingRevokeTokenError) obj).f43849id);
        }

        public final String getId() {
            return this.f43849id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43849id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("BuildingRevokeTokenError(id=", this.f43849id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuildingRevokeTokenError(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43849id = id2;
        }

        public /* synthetic */ BuildingRevokeTokenError(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends SignOutState {
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception) {
            super(null);
            AbstractC4154l.m8923f(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Error copy(Exception exception) {
            AbstractC4154l.m8923f(exception, "exception");
            return new Error(exception);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && AbstractC4154l.m8918a(this.exception, ((Error) obj).exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11237h("Error(exception=", ")", this.exception);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends SignOutState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43850id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43850id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43850id;
        }

        public final NotStarted copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new NotStarted(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43850id, ((NotStarted) obj).f43850id);
        }

        public final String getId() {
            return this.f43850id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43850id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43850id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43850id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<SignOutState> {
        private final NotStarted defaultState;
        private final SignOutActions signOutActions;

        public Resolver(SignOutActions signOutActions) {
            AbstractC4154l.m8923f(signOutActions, "signOutActions");
            this.signOutActions = signOutActions;
            this.defaultState = new NotStarted("");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SignOutState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignOutState, StateMachineResolver<SignOutState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignOutState> resolve(SignOutState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            StateResolution<SignOutState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            SignOutEvent.EventType eventTypeIsSignOutEvent = AuthEnvironmentKt.isSignOutEvent(event);
            int i10 = 1;
            if (oldState instanceof NotStarted) {
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.InvokeHostedUISignOut) {
                    SignOutEvent.EventType.InvokeHostedUISignOut invokeHostedUISignOut = (SignOutEvent.EventType.InvokeHostedUISignOut) eventTypeIsSignOutEvent;
                    return new StateResolution<>(new SigningOutHostedUI(invokeHostedUISignOut.getSignedInData(), invokeHostedUISignOut.getSignOutData().getGlobalSignOut(), invokeHostedUISignOut.getSignOutData().getBypassCancel()), pe.m10833h(this.signOutActions.hostedUISignOutAction(invokeHostedUISignOut)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutGlobally) {
                    return new StateResolution<>(new SigningOutGlobally(str, i10, objArr11 == true ? 1 : 0), pe.m10833h(this.signOutActions.globalSignOutAction((SignOutEvent.EventType.SignOutGlobally) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.RevokeToken) {
                    return new StateResolution<>(new RevokingToken(objArr10 == true ? 1 : 0, i10, objArr9 == true ? 1 : 0), pe.m10833h(this.signOutActions.revokeTokenAction((SignOutEvent.EventType.RevokeToken) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutLocally) {
                    SignOutEvent.EventType.SignOutLocally signOutLocally = (SignOutEvent.EventType.SignOutLocally) eventTypeIsSignOutEvent;
                    return new StateResolution<>(new SigningOutLocally(signOutLocally.getSignedInData()), pe.m10833h(this.signOutActions.localSignOutAction(signOutLocally)));
                }
            } else if (oldState instanceof SigningOutHostedUI) {
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutGlobally) {
                    return new StateResolution<>(new SigningOutGlobally(objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0), pe.m10833h(this.signOutActions.globalSignOutAction((SignOutEvent.EventType.SignOutGlobally) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.RevokeToken) {
                    return new StateResolution<>(new RevokingToken(objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0), pe.m10833h(this.signOutActions.revokeTokenAction((SignOutEvent.EventType.RevokeToken) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.UserCancelled) {
                    return new StateResolution<>(new Error(new UserCancelledException("The user cancelled the sign-out attempt, so it did not complete.", "To recover: catch this error, and attempt the sign out again.", null, 4, null)), pe.m10833h(this.signOutActions.userCancelledAction((SignOutEvent.EventType.UserCancelled) eventTypeIsSignOutEvent)));
                }
            } else if (oldState instanceof SigningOutLocally) {
                AuthEvent.EventType eventTypeIsAuthEvent = AuthEnvironmentKt.isAuthEvent(event);
                if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ReceivedCachedCredentials) {
                    SignedInData signedInData = ((SigningOutLocally) oldState).getSignedInData();
                    return new StateResolution<>(new SignedOut(new SignedOutData(signedInData != null ? signedInData.getUsername() : null, null, null, null, 14, null)), null, 2, null);
                }
                if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.CachedCredentialsFailed) {
                    return new StateResolution<>(new Error(new Exception("Failed clearing store")), null, 2, null);
                }
            } else if (oldState instanceof SigningOutGlobally) {
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.RevokeToken) {
                    return new StateResolution<>(new RevokingToken(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), pe.m10833h(this.signOutActions.revokeTokenAction((SignOutEvent.EventType.RevokeToken) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutGloballyError) {
                    return new StateResolution<>(new BuildingRevokeTokenError(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), pe.m10833h(this.signOutActions.buildRevokeTokenErrorAction((SignOutEvent.EventType.SignOutGloballyError) eventTypeIsSignOutEvent)));
                }
            } else if (((oldState instanceof RevokingToken) || (oldState instanceof BuildingRevokeTokenError)) && (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutLocally)) {
                SignOutEvent.EventType.SignOutLocally signOutLocally2 = (SignOutEvent.EventType.SignOutLocally) eventTypeIsSignOutEvent;
                return new StateResolution<>(new SigningOutLocally(signOutLocally2.getSignedInData()), pe.m10833h(this.signOutActions.localSignOutAction(signOutLocally2)));
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class RevokingToken extends SignOutState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43851id;

        /* JADX WARN: Multi-variable type inference failed */
        public RevokingToken() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RevokingToken copy$default(RevokingToken revokingToken, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = revokingToken.f43851id;
            }
            return revokingToken.copy(str);
        }

        public final String component1() {
            return this.f43851id;
        }

        public final RevokingToken copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new RevokingToken(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RevokingToken) && AbstractC4154l.m8918a(this.f43851id, ((RevokingToken) obj).f43851id);
        }

        public final String getId() {
            return this.f43851id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43851id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("RevokingToken(id=", this.f43851id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevokingToken(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43851id = id2;
        }

        public /* synthetic */ RevokingToken(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SignedOut extends SignOutState {
        private final SignedOutData signedOutData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedOut(SignedOutData signedOutData) {
            super(null);
            AbstractC4154l.m8923f(signedOutData, "signedOutData");
            this.signedOutData = signedOutData;
        }

        public static /* synthetic */ SignedOut copy$default(SignedOut signedOut, SignedOutData signedOutData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedOutData = signedOut.signedOutData;
            }
            return signedOut.copy(signedOutData);
        }

        public final SignedOutData component1() {
            return this.signedOutData;
        }

        public final SignedOut copy(SignedOutData signedOutData) {
            AbstractC4154l.m8923f(signedOutData, "signedOutData");
            return new SignedOut(signedOutData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedOut) && AbstractC4154l.m8918a(this.signedOutData, ((SignedOut) obj).signedOutData);
        }

        public final SignedOutData getSignedOutData() {
            return this.signedOutData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signedOutData.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SignedOut(signedOutData=" + this.signedOutData + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SigningOutGlobally extends SignOutState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43852id;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningOutGlobally() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningOutGlobally copy$default(SigningOutGlobally signingOutGlobally, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = signingOutGlobally.f43852id;
            }
            return signingOutGlobally.copy(str);
        }

        public final String component1() {
            return this.f43852id;
        }

        public final SigningOutGlobally copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new SigningOutGlobally(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOutGlobally) && AbstractC4154l.m8918a(this.f43852id, ((SigningOutGlobally) obj).f43852id);
        }

        public final String getId() {
            return this.f43852id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43852id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("SigningOutGlobally(id=", this.f43852id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOutGlobally(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43852id = id2;
        }

        public /* synthetic */ SigningOutGlobally(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SigningOutHostedUI extends SignOutState {
        private final boolean bypassCancel;
        private final boolean globalSignOut;
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOutHostedUI(SignedInData signedInData, boolean z6, boolean z10) {
            super(null);
            AbstractC4154l.m8923f(signedInData, "signedInData");
            this.signedInData = signedInData;
            this.globalSignOut = z6;
            this.bypassCancel = z10;
        }

        public static /* synthetic */ SigningOutHostedUI copy$default(SigningOutHostedUI signingOutHostedUI, SignedInData signedInData, boolean z6, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedInData = signingOutHostedUI.signedInData;
            }
            if ((i10 & 2) != 0) {
                z6 = signingOutHostedUI.globalSignOut;
            }
            if ((i10 & 4) != 0) {
                z10 = signingOutHostedUI.bypassCancel;
            }
            return signingOutHostedUI.copy(signedInData, z6, z10);
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final boolean component2() {
            return this.globalSignOut;
        }

        public final boolean component3() {
            return this.bypassCancel;
        }

        public final SigningOutHostedUI copy(SignedInData signedInData, boolean z6, boolean z10) {
            AbstractC4154l.m8923f(signedInData, "signedInData");
            return new SigningOutHostedUI(signedInData, z6, z10);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SigningOutHostedUI)) {
                return false;
            }
            SigningOutHostedUI signingOutHostedUI = (SigningOutHostedUI) obj;
            return AbstractC4154l.m8918a(this.signedInData, signingOutHostedUI.signedInData) && this.globalSignOut == signingOutHostedUI.globalSignOut && this.bypassCancel == signingOutHostedUI.bypassCancel;
        }

        public final boolean getBypassCancel() {
            return this.bypassCancel;
        }

        public final boolean getGlobalSignOut() {
            return this.globalSignOut;
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return Boolean.hashCode(this.bypassCancel) + AbstractC1452a.m4558e(this.signedInData.hashCode() * 31, 31, this.globalSignOut);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            SignedInData signedInData = this.signedInData;
            boolean z6 = this.globalSignOut;
            boolean z10 = this.bypassCancel;
            StringBuilder sb2 = new StringBuilder("SigningOutHostedUI(signedInData=");
            sb2.append(signedInData);
            sb2.append(", globalSignOut=");
            sb2.append(z6);
            sb2.append(", bypassCancel=");
            return AbstractC5601a.m11242m(sb2, z10, ")");
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SigningOutLocally extends SignOutState {
        private final SignedInData signedInData;

        public SigningOutLocally(SignedInData signedInData) {
            super(null);
            this.signedInData = signedInData;
        }

        public static /* synthetic */ SigningOutLocally copy$default(SigningOutLocally signingOutLocally, SignedInData signedInData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedInData = signingOutLocally.signedInData;
            }
            return signingOutLocally.copy(signedInData);
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final SigningOutLocally copy(SignedInData signedInData) {
            return new SigningOutLocally(signedInData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOutLocally) && AbstractC4154l.m8918a(this.signedInData, ((SigningOutLocally) obj).signedInData);
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SignedInData signedInData = this.signedInData;
            if (signedInData == null) {
                return 0;
            }
            return signedInData.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOutLocally(signedInData=" + this.signedInData + ")";
        }
    }

    public /* synthetic */ SignOutState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private SignOutState() {
    }
}
