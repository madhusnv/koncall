package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SignInActions;
import com.amplifyframework.statemachine.codegen.actions.UserAuthSignInActions;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.amplifyframework.statemachine.codegen.states.CustomSignInState;
import com.amplifyframework.statemachine.codegen.states.DeviceSRPSignInState;
import com.amplifyframework.statemachine.codegen.states.HostedUISignInState;
import com.amplifyframework.statemachine.codegen.states.MigrateSignInState;
import com.amplifyframework.statemachine.codegen.states.SRPSignInState;
import com.amplifyframework.statemachine.codegen.states.SetupTOTPState;
import com.amplifyframework.statemachine.codegen.states.SignInChallengeState;
import com.amplifyframework.statemachine.codegen.states.WebAuthnSignInState;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.hh3;
import p001o.id5;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class SignInState implements State {
    private SignInChallengeState challengeState;
    private CustomSignInState customSignInState;
    private DeviceSRPSignInState deviceSRPSignInState;
    private HostedUISignInState hostedUISignInState;
    private MigrateSignInState migrateSignInState;
    private SetupTOTPState setupTOTPState;
    private SRPSignInState srpSignInState;
    private WebAuthnSignInState webAuthnSignInState;

    public static final class AutoSigningIn extends SignInState {
        private final SignInData.AutoSignInData signInEventData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoSigningIn(SignInData.AutoSignInData autoSignInData) {
            super(null);
            sq8.m48649h(autoSignInData, "signInEventData");
            this.signInEventData = autoSignInData;
        }

        public static /* synthetic */ AutoSigningIn copy$default(AutoSigningIn autoSigningIn, SignInData.AutoSignInData autoSignInData, int i, Object obj) {
            if ((i & 1) != 0) {
                autoSignInData = autoSigningIn.signInEventData;
            }
            return autoSigningIn.copy(autoSignInData);
        }

        public final SignInData.AutoSignInData component1() {
            return this.signInEventData;
        }

        public final AutoSigningIn copy(SignInData.AutoSignInData autoSignInData) {
            sq8.m48649h(autoSignInData, "signInEventData");
            return new AutoSigningIn(autoSignInData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AutoSigningIn) && sq8.m48644c(this.signInEventData, ((AutoSigningIn) obj).signInEventData);
        }

        public final SignInData.AutoSignInData getSignInEventData() {
            return this.signInEventData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signInEventData.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "AutoSigningIn(signInEventData=" + this.signInEventData + ")";
        }
    }

    public static final class Builder implements com.amplifyframework.statemachine.Builder<SignInState> {
        private SignInChallengeState challengeState;
        private CustomSignInState customSignInState;
        private DeviceSRPSignInState deviceSRPSignInState;
        private HostedUISignInState hostedUISignInState;
        private MigrateSignInState migrateSignInState;
        private SetupTOTPState setupTOTPState;
        private final SignInState signInState;
        private SRPSignInState srpSignInState;
        private WebAuthnSignInState webAuthnSignInState;

        public Builder(SignInState signInState) {
            sq8.m48649h(signInState, "signInState");
            this.signInState = signInState;
        }

        public final SignInChallengeState getChallengeState() {
            return this.challengeState;
        }

        public final CustomSignInState getCustomSignInState() {
            return this.customSignInState;
        }

        public final DeviceSRPSignInState getDeviceSRPSignInState() {
            return this.deviceSRPSignInState;
        }

        public final HostedUISignInState getHostedUISignInState() {
            return this.hostedUISignInState;
        }

        public final MigrateSignInState getMigrateSignInState() {
            return this.migrateSignInState;
        }

        public final SetupTOTPState getSetupTOTPState() {
            return this.setupTOTPState;
        }

        public final SRPSignInState getSrpSignInState() {
            return this.srpSignInState;
        }

        public final WebAuthnSignInState getWebAuthnSignInState() {
            return this.webAuthnSignInState;
        }

        public final void setChallengeState(SignInChallengeState signInChallengeState) {
            this.challengeState = signInChallengeState;
        }

        public final void setCustomSignInState(CustomSignInState customSignInState) {
            this.customSignInState = customSignInState;
        }

        public final void setDeviceSRPSignInState(DeviceSRPSignInState deviceSRPSignInState) {
            this.deviceSRPSignInState = deviceSRPSignInState;
        }

        public final void setHostedUISignInState(HostedUISignInState hostedUISignInState) {
            this.hostedUISignInState = hostedUISignInState;
        }

        public final void setMigrateSignInState(MigrateSignInState migrateSignInState) {
            this.migrateSignInState = migrateSignInState;
        }

        public final void setSetupTOTPState(SetupTOTPState setupTOTPState) {
            this.setupTOTPState = setupTOTPState;
        }

        public final void setSrpSignInState(SRPSignInState sRPSignInState) {
            this.srpSignInState = sRPSignInState;
        }

        public final void setWebAuthnSignInState(WebAuthnSignInState webAuthnSignInState) {
            this.webAuthnSignInState = webAuthnSignInState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.Builder
        public SignInState build() {
            SignInState signInState = this.signInState;
            if (signInState instanceof SigningInWithSRP) {
                return new SigningInWithSRP(this.srpSignInState);
            }
            if (signInState instanceof ResolvingChallenge) {
                return new ResolvingChallenge(this.challengeState);
            }
            if (signInState instanceof SigningInViaMigrateAuth) {
                return new SigningInViaMigrateAuth(this.migrateSignInState);
            }
            if (signInState instanceof SigningInWithCustom) {
                return new SigningInWithCustom(this.customSignInState);
            }
            if (signInState instanceof SigningInWithHostedUI) {
                return new SigningInWithHostedUI(this.hostedUISignInState);
            }
            if (signInState instanceof SigningInWithSRPCustom) {
                return new SigningInWithSRPCustom(this.srpSignInState);
            }
            if (signInState instanceof ResolvingDeviceSRP) {
                return new ResolvingDeviceSRP(this.deviceSRPSignInState);
            }
            if (signInState instanceof ResolvingTOTPSetup) {
                return new ResolvingTOTPSetup(this.setupTOTPState);
            }
            if (signInState instanceof SigningInWithUserAuth) {
                return new SigningInWithUserAuth(null, 1, 0 == true ? 1 : 0);
            }
            return signInState instanceof SigningInWithWebAuthn ? new SigningInWithWebAuthn(this.webAuthnSignInState) : signInState;
        }
    }

    public static final class ConfirmingDevice extends SignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public ConfirmingDevice() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ConfirmingDevice copy$default(ConfirmingDevice confirmingDevice, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirmingDevice.id;
            }
            return confirmingDevice.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final ConfirmingDevice copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new ConfirmingDevice(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmingDevice) && sq8.m48644c(this.id, ((ConfirmingDevice) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ConfirmingDevice(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmingDevice(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ ConfirmingDevice(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Done extends SignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Done() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Done copy$default(Done done, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = done.id;
            }
            return done.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Done copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Done(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && sq8.m48644c(this.id, ((Done) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Done(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Done(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Done(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends SignInState {
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc) {
            super(null);
            sq8.m48649h(exc, "exception");
            this.exception = exc;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Error copy(Exception exc) {
            sq8.m48649h(exc, "exception");
            return new Error(exc);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && sq8.m48644c(this.exception, ((Error) obj).exception);
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
            return "Error(exception=" + this.exception + ")";
        }
    }

    public static final class NotStarted extends SignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notStarted.id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final NotStarted copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new NotStarted(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotStarted) && sq8.m48644c(this.id, ((NotStarted) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "NotStarted(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ NotStarted(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Resolver implements StateMachineResolver<SignInState> {
        private final StateMachineResolver<SignInChallengeState> challengeResolver;
        private final StateMachineResolver<CustomSignInState> customSignInResolver;
        private final NotStarted defaultState;
        private final StateMachineResolver<DeviceSRPSignInState> deviceSRPSignInResolver;
        private final StateMachineResolver<HostedUISignInState> hostedUISignInResolver;
        private final StateMachineResolver<MigrateSignInState> migrationSignInResolver;
        private final StateMachineResolver<SetupTOTPState> setupTOTPResolver;
        private final SignInActions signInActions;
        private final StateMachineResolver<SRPSignInState> srpSignInResolver;
        private final UserAuthSignInActions userAuthSignInActions;
        private final StateMachineResolver<WebAuthnSignInState> webAuthnSignInResolver;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(StateMachineResolver<SRPSignInState> stateMachineResolver, StateMachineResolver<CustomSignInState> stateMachineResolver2, StateMachineResolver<MigrateSignInState> stateMachineResolver3, StateMachineResolver<SignInChallengeState> stateMachineResolver4, StateMachineResolver<HostedUISignInState> stateMachineResolver5, StateMachineResolver<DeviceSRPSignInState> stateMachineResolver6, StateMachineResolver<SetupTOTPState> stateMachineResolver7, StateMachineResolver<WebAuthnSignInState> stateMachineResolver8, UserAuthSignInActions userAuthSignInActions, SignInActions signInActions) {
            sq8.m48649h(stateMachineResolver, "srpSignInResolver");
            sq8.m48649h(stateMachineResolver2, "customSignInResolver");
            sq8.m48649h(stateMachineResolver3, "migrationSignInResolver");
            sq8.m48649h(stateMachineResolver4, "challengeResolver");
            sq8.m48649h(stateMachineResolver5, "hostedUISignInResolver");
            sq8.m48649h(stateMachineResolver6, "deviceSRPSignInResolver");
            sq8.m48649h(stateMachineResolver7, "setupTOTPResolver");
            sq8.m48649h(stateMachineResolver8, "webAuthnSignInResolver");
            sq8.m48649h(userAuthSignInActions, "userAuthSignInActions");
            sq8.m48649h(signInActions, "signInActions");
            this.srpSignInResolver = stateMachineResolver;
            this.customSignInResolver = stateMachineResolver2;
            this.migrationSignInResolver = stateMachineResolver3;
            this.challengeResolver = stateMachineResolver4;
            this.hostedUISignInResolver = stateMachineResolver5;
            this.deviceSRPSignInResolver = stateMachineResolver6;
            this.setupTOTPResolver = stateMachineResolver7;
            this.webAuthnSignInResolver = stateMachineResolver8;
            this.userAuthSignInActions = userAuthSignInActions;
            this.signInActions = signInActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final SignInEvent.EventType asSignInEvent(StateMachineEvent stateMachineEvent) {
            SignInEvent signInEvent = stateMachineEvent instanceof SignInEvent ? (SignInEvent) stateMachineEvent : null;
            if (signInEvent != null) {
                return signInEvent.getEventType();
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final StateResolution<SignInState> resolveSignInEvent(SignInState signInState, StateMachineEvent stateMachineEvent) {
            SignInEvent.EventType eventTypeAsSignInEvent = asSignInEvent(stateMachineEvent);
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
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            Object[] objArr17 = 0;
            StateResolution<SignInState> stateResolution = new StateResolution<>(signInState, null, 2, null);
            int i = 1;
            if (signInState instanceof NotStarted) {
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateSignInWithSRP) {
                    return new StateResolution<>(new SigningInWithSRP(signInState.getSrpSignInState()), bh3.m18963e(this.signInActions.startSRPAuthAction((SignInEvent.EventType.InitiateSignInWithSRP) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateSignInWithCustom) {
                    return new StateResolution<>(new SigningInWithCustom(signInState.getCustomSignInState()), bh3.m18963e(this.signInActions.startCustomAuthAction((SignInEvent.EventType.InitiateSignInWithCustom) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateHostedUISignIn) {
                    return new StateResolution<>(new SigningInWithHostedUI(new HostedUISignInState.NotStarted(null, 1, null)), bh3.m18963e(this.signInActions.startHostedUIAuthAction((SignInEvent.EventType.InitiateHostedUISignIn) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateMigrateAuth) {
                    return new StateResolution<>(new SigningInViaMigrateAuth(new MigrateSignInState.NotStarted(null, 1, null)), bh3.m18963e(this.signInActions.startMigrationAuthAction((SignInEvent.EventType.InitiateMigrateAuth) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateCustomSignInWithSRP) {
                    return new StateResolution<>(new SigningInWithSRPCustom(signInState.getSrpSignInState()), bh3.m18963e(this.signInActions.startCustomAuthWithSRPAction((SignInEvent.EventType.InitiateCustomSignInWithSRP) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateUserAuth) {
                    return new StateResolution<>(new SigningInWithUserAuth(str, i, objArr17 == true ? 1 : 0), bh3.m18963e(this.userAuthSignInActions.initiateUserAuthSignIn((SignInEvent.EventType.InitiateUserAuth) eventTypeAsSignInEvent)));
                }
                if (!(eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateAutoSignIn)) {
                    return stateResolution;
                }
                SignInEvent.EventType.InitiateAutoSignIn initiateAutoSignIn = (SignInEvent.EventType.InitiateAutoSignIn) eventTypeAsSignInEvent;
                return new StateResolution<>(new AutoSigningIn(initiateAutoSignIn.getSignInData()), bh3.m18963e(this.signInActions.autoSignInAction(initiateAutoSignIn)));
            }
            if (signInState instanceof SigningInWithSRP ? true : signInState instanceof SigningInWithCustom ? true : signInState instanceof SigningInViaMigrateAuth ? true : signInState instanceof SigningInWithSRPCustom ? true : signInState instanceof SigningInWithUserAuth ? true : signInState instanceof SigningInWithWebAuthn) {
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ReceivedChallenge) {
                    return new StateResolution<>(new ResolvingChallenge(signInState.getChallengeState()), bh3.m18963e(this.signInActions.initResolveChallenge((SignInEvent.EventType.ReceivedChallenge) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateSignInWithDeviceSRP) {
                    return new StateResolution<>(new ResolvingDeviceSRP(new DeviceSRPSignInState.NotStarted(null, 1, null)), bh3.m18963e(this.signInActions.startDeviceSRPAuthAction((SignInEvent.EventType.InitiateSignInWithDeviceSRP) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ConfirmDevice) {
                    return new StateResolution<>(new ConfirmingDevice(objArr16 == true ? 1 : 0, i, objArr15 == true ? 1 : 0), bh3.m18963e(this.signInActions.confirmDevice((SignInEvent.EventType.ConfirmDevice) eventTypeAsSignInEvent)));
                }
                return eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateTOTPSetup ? new StateResolution<>(new ResolvingTOTPSetup(signInState.getSetupTOTPState()), bh3.m18963e(this.signInActions.initiateTOTPSetupAction((SignInEvent.EventType.InitiateTOTPSetup) eventTypeAsSignInEvent))) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateWebAuthnSignIn ? new StateResolution<>(new SigningInWithWebAuthn(new WebAuthnSignInState.NotStarted(null, 1, null)), bh3.m18963e(this.signInActions.initiateWebAuthnSignInAction((SignInEvent.EventType.InitiateWebAuthnSignIn) eventTypeAsSignInEvent))) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution;
            }
            if (signInState instanceof ResolvingChallenge) {
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ConfirmDevice) {
                    return new StateResolution<>(new ConfirmingDevice(objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0), bh3.m18963e(this.signInActions.confirmDevice((SignInEvent.EventType.ConfirmDevice) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ReceivedChallenge) {
                    return new StateResolution<>(new ResolvingChallenge(signInState.getChallengeState()), bh3.m18963e(this.signInActions.initResolveChallenge((SignInEvent.EventType.ReceivedChallenge) eventTypeAsSignInEvent)));
                }
                return eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateTOTPSetup ? new StateResolution<>(new ResolvingTOTPSetup(signInState.getSetupTOTPState()), bh3.m18963e(this.signInActions.initiateTOTPSetupAction((SignInEvent.EventType.InitiateTOTPSetup) eventTypeAsSignInEvent))) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateWebAuthnSignIn ? new StateResolution<>(new SigningInWithWebAuthn(new WebAuthnSignInState.NotStarted(null, 1, null)), bh3.m18963e(this.signInActions.initiateWebAuthnSignInAction((SignInEvent.EventType.InitiateWebAuthnSignIn) eventTypeAsSignInEvent))) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateSignInWithSRP ? new StateResolution<>(new SigningInWithSRP(signInState.getSrpSignInState()), bh3.m18963e(this.signInActions.startSRPAuthAction((SignInEvent.EventType.InitiateSignInWithSRP) eventTypeAsSignInEvent))) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution;
            }
            if (signInState instanceof ResolvingTOTPSetup) {
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ReceivedChallenge) {
                    return new StateResolution<>(new ResolvingChallenge(signInState.getChallengeState()), bh3.m18963e(this.signInActions.initResolveChallenge((SignInEvent.EventType.ReceivedChallenge) eventTypeAsSignInEvent)));
                }
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ConfirmDevice) {
                    return new StateResolution<>(new ConfirmingDevice(objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0), bh3.m18963e(this.signInActions.confirmDevice((SignInEvent.EventType.ConfirmDevice) eventTypeAsSignInEvent)));
                }
                return eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateSignInWithDeviceSRP ? new StateResolution<>(new ResolvingDeviceSRP(new DeviceSRPSignInState.NotStarted(null, 1, null)), bh3.m18963e(this.signInActions.startDeviceSRPAuthAction((SignInEvent.EventType.InitiateSignInWithDeviceSRP) eventTypeAsSignInEvent))) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.FinalizeSignIn ? new StateResolution<>(new SignedIn(objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            if (signInState instanceof ResolvingDeviceSRP) {
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ReceivedChallenge) {
                    return new StateResolution<>(new ResolvingChallenge(signInState.getChallengeState()), bh3.m18963e(this.signInActions.initResolveChallenge((SignInEvent.EventType.ReceivedChallenge) eventTypeAsSignInEvent)));
                }
                return eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateTOTPSetup ? new StateResolution<>(new ResolvingTOTPSetup(new SetupTOTPState.NotStarted(null, 1, null)), bh3.m18963e(this.signInActions.initiateTOTPSetupAction((SignInEvent.EventType.InitiateTOTPSetup) eventTypeAsSignInEvent))) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution;
            }
            if (signInState instanceof ConfirmingDevice) {
                return eventTypeAsSignInEvent instanceof SignInEvent.EventType.FinalizeSignIn ? new StateResolution<>(new SignedIn(objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0), null, 2, null) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution;
            }
            if (signInState instanceof SigningInWithHostedUI) {
                return eventTypeAsSignInEvent instanceof SignInEvent.EventType.SignedIn ? new StateResolution<>(new Done(objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), null, 2, null) : eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution;
            }
            if (!(signInState instanceof AutoSigningIn)) {
                return stateResolution;
            }
            if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.FinalizeSignIn) {
                return new StateResolution<>(new SignedIn(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), null, 2, null);
            }
            if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.ConfirmDevice) {
                return new StateResolution<>(new ConfirmingDevice(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), bh3.m18963e(this.signInActions.confirmDevice((SignInEvent.EventType.ConfirmDevice) eventTypeAsSignInEvent)));
            }
            return eventTypeAsSignInEvent instanceof SignInEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignInEvent.EventType.ThrowError) eventTypeAsSignInEvent).getException()), null, 2, null) : stateResolution;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SignInState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignInState, StateMachineResolver<SignInState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignInState> resolve(SignInState signInState, StateMachineEvent stateMachineEvent) {
            StateResolution<StateType> stateResolutionResolve;
            StateResolution<StateType> stateResolutionResolve2;
            StateResolution<StateType> stateResolutionResolve3;
            StateResolution<StateType> stateResolutionResolve4;
            StateResolution<StateType> stateResolutionResolve5;
            StateResolution<StateType> stateResolutionResolve6;
            StateResolution<StateType> stateResolutionResolve7;
            StateResolution<StateType> stateResolutionResolve8;
            sq8.m48649h(signInState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            StateResolution<SignInState> stateResolutionResolveSignInEvent = resolveSignInEvent(signInState, stateMachineEvent);
            List listT0 = kh3.T0(stateResolutionResolveSignInEvent.getActions());
            Builder builder = new Builder((SignInState) stateResolutionResolveSignInEvent.getNewState());
            SRPSignInState srpSignInState = signInState.getSrpSignInState();
            if (srpSignInState != null && (stateResolutionResolve8 = this.srpSignInResolver.resolve(srpSignInState, stateMachineEvent)) != 0) {
                builder.setSrpSignInState((SRPSignInState) stateResolutionResolve8.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve8.getActions());
            }
            SignInChallengeState challengeState = signInState.getChallengeState();
            if (challengeState != null && (stateResolutionResolve7 = this.challengeResolver.resolve(challengeState, stateMachineEvent)) != 0) {
                builder.setChallengeState((SignInChallengeState) stateResolutionResolve7.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve7.getActions());
            }
            MigrateSignInState migrateSignInState = signInState.getMigrateSignInState();
            if (migrateSignInState != null && (stateResolutionResolve6 = this.migrationSignInResolver.resolve(migrateSignInState, stateMachineEvent)) != 0) {
                builder.setMigrateSignInState((MigrateSignInState) stateResolutionResolve6.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve6.getActions());
            }
            HostedUISignInState hostedUISignInState = signInState.getHostedUISignInState();
            if (hostedUISignInState != null && (stateResolutionResolve5 = this.hostedUISignInResolver.resolve(hostedUISignInState, stateMachineEvent)) != 0) {
                builder.setHostedUISignInState((HostedUISignInState) stateResolutionResolve5.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve5.getActions());
            }
            CustomSignInState customSignInState = signInState.getCustomSignInState();
            if (customSignInState != null && (stateResolutionResolve4 = this.customSignInResolver.resolve(customSignInState, stateMachineEvent)) != 0) {
                builder.setCustomSignInState((CustomSignInState) stateResolutionResolve4.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve4.getActions());
            }
            DeviceSRPSignInState deviceSRPSignInState = signInState.getDeviceSRPSignInState();
            if (deviceSRPSignInState != null && (stateResolutionResolve3 = this.deviceSRPSignInResolver.resolve(deviceSRPSignInState, stateMachineEvent)) != 0) {
                builder.setDeviceSRPSignInState((DeviceSRPSignInState) stateResolutionResolve3.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve3.getActions());
            }
            SetupTOTPState setupTOTPState = signInState.getSetupTOTPState();
            if (setupTOTPState != null && (stateResolutionResolve2 = this.setupTOTPResolver.resolve(setupTOTPState, stateMachineEvent)) != 0) {
                builder.setSetupTOTPState((SetupTOTPState) stateResolutionResolve2.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve2.getActions());
            }
            WebAuthnSignInState webAuthnSignInState = signInState.getWebAuthnSignInState();
            if (webAuthnSignInState != null && (stateResolutionResolve = this.webAuthnSignInResolver.resolve(webAuthnSignInState, stateMachineEvent)) != 0) {
                builder.setWebAuthnSignInState((WebAuthnSignInState) stateResolutionResolve.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve.getActions());
            }
            return new StateResolution<>(builder.build(), listT0);
        }
    }

    public static final class ResolvingChallenge extends SignInState {
        private SignInChallengeState challengeState;

        public ResolvingChallenge(SignInChallengeState signInChallengeState) {
            super(null);
            this.challengeState = signInChallengeState;
        }

        public static /* synthetic */ ResolvingChallenge copy$default(ResolvingChallenge resolvingChallenge, SignInChallengeState signInChallengeState, int i, Object obj) {
            if ((i & 1) != 0) {
                signInChallengeState = resolvingChallenge.challengeState;
            }
            return resolvingChallenge.copy(signInChallengeState);
        }

        public final SignInChallengeState component1() {
            return this.challengeState;
        }

        public final ResolvingChallenge copy(SignInChallengeState signInChallengeState) {
            return new ResolvingChallenge(signInChallengeState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolvingChallenge) && sq8.m48644c(this.challengeState, ((ResolvingChallenge) obj).challengeState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public SignInChallengeState getChallengeState() {
            return this.challengeState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SignInChallengeState signInChallengeState = this.challengeState;
            if (signInChallengeState == null) {
                return 0;
            }
            return signInChallengeState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setChallengeState(SignInChallengeState signInChallengeState) {
            this.challengeState = signInChallengeState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ResolvingChallenge(challengeState=" + this.challengeState + ")";
        }
    }

    public static final class ResolvingDeviceSRP extends SignInState {
        private DeviceSRPSignInState deviceSRPSignInState;

        public ResolvingDeviceSRP(DeviceSRPSignInState deviceSRPSignInState) {
            super(null);
            this.deviceSRPSignInState = deviceSRPSignInState;
        }

        public static /* synthetic */ ResolvingDeviceSRP copy$default(ResolvingDeviceSRP resolvingDeviceSRP, DeviceSRPSignInState deviceSRPSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceSRPSignInState = resolvingDeviceSRP.deviceSRPSignInState;
            }
            return resolvingDeviceSRP.copy(deviceSRPSignInState);
        }

        public final DeviceSRPSignInState component1() {
            return this.deviceSRPSignInState;
        }

        public final ResolvingDeviceSRP copy(DeviceSRPSignInState deviceSRPSignInState) {
            return new ResolvingDeviceSRP(deviceSRPSignInState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolvingDeviceSRP) && sq8.m48644c(this.deviceSRPSignInState, ((ResolvingDeviceSRP) obj).deviceSRPSignInState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public DeviceSRPSignInState getDeviceSRPSignInState() {
            return this.deviceSRPSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            DeviceSRPSignInState deviceSRPSignInState = this.deviceSRPSignInState;
            if (deviceSRPSignInState == null) {
                return 0;
            }
            return deviceSRPSignInState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setDeviceSRPSignInState(DeviceSRPSignInState deviceSRPSignInState) {
            this.deviceSRPSignInState = deviceSRPSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ResolvingDeviceSRP(deviceSRPSignInState=" + this.deviceSRPSignInState + ")";
        }
    }

    public static final class ResolvingTOTPSetup extends SignInState {
        private SetupTOTPState setupTOTPState;

        public ResolvingTOTPSetup(SetupTOTPState setupTOTPState) {
            super(null);
            this.setupTOTPState = setupTOTPState;
        }

        public static /* synthetic */ ResolvingTOTPSetup copy$default(ResolvingTOTPSetup resolvingTOTPSetup, SetupTOTPState setupTOTPState, int i, Object obj) {
            if ((i & 1) != 0) {
                setupTOTPState = resolvingTOTPSetup.setupTOTPState;
            }
            return resolvingTOTPSetup.copy(setupTOTPState);
        }

        public final SetupTOTPState component1() {
            return this.setupTOTPState;
        }

        public final ResolvingTOTPSetup copy(SetupTOTPState setupTOTPState) {
            return new ResolvingTOTPSetup(setupTOTPState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolvingTOTPSetup) && sq8.m48644c(this.setupTOTPState, ((ResolvingTOTPSetup) obj).setupTOTPState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public SetupTOTPState getSetupTOTPState() {
            return this.setupTOTPState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SetupTOTPState setupTOTPState = this.setupTOTPState;
            if (setupTOTPState == null) {
                return 0;
            }
            return setupTOTPState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setSetupTOTPState(SetupTOTPState setupTOTPState) {
            this.setupTOTPState = setupTOTPState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ResolvingTOTPSetup(setupTOTPState=" + this.setupTOTPState + ")";
        }
    }

    public static final class SignedIn extends SignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public SignedIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signedIn.id;
            }
            return signedIn.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final SignedIn copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new SignedIn(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedIn) && sq8.m48644c(this.id, ((SignedIn) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SignedIn(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ SignedIn(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SigningInViaMigrateAuth extends SignInState {
        private MigrateSignInState migrateSignInState;

        public SigningInViaMigrateAuth(MigrateSignInState migrateSignInState) {
            super(null);
            this.migrateSignInState = migrateSignInState;
        }

        public static /* synthetic */ SigningInViaMigrateAuth copy$default(SigningInViaMigrateAuth signingInViaMigrateAuth, MigrateSignInState migrateSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                migrateSignInState = signingInViaMigrateAuth.migrateSignInState;
            }
            return signingInViaMigrateAuth.copy(migrateSignInState);
        }

        public final MigrateSignInState component1() {
            return this.migrateSignInState;
        }

        public final SigningInViaMigrateAuth copy(MigrateSignInState migrateSignInState) {
            return new SigningInViaMigrateAuth(migrateSignInState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInViaMigrateAuth) && sq8.m48644c(this.migrateSignInState, ((SigningInViaMigrateAuth) obj).migrateSignInState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public MigrateSignInState getMigrateSignInState() {
            return this.migrateSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            MigrateSignInState migrateSignInState = this.migrateSignInState;
            if (migrateSignInState == null) {
                return 0;
            }
            return migrateSignInState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setMigrateSignInState(MigrateSignInState migrateSignInState) {
            this.migrateSignInState = migrateSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInViaMigrateAuth(migrateSignInState=" + this.migrateSignInState + ")";
        }
    }

    public static final class SigningInWithCustom extends SignInState {
        private CustomSignInState customSignInState;

        public SigningInWithCustom(CustomSignInState customSignInState) {
            super(null);
            this.customSignInState = customSignInState;
        }

        public static /* synthetic */ SigningInWithCustom copy$default(SigningInWithCustom signingInWithCustom, CustomSignInState customSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                customSignInState = signingInWithCustom.customSignInState;
            }
            return signingInWithCustom.copy(customSignInState);
        }

        public final CustomSignInState component1() {
            return this.customSignInState;
        }

        public final SigningInWithCustom copy(CustomSignInState customSignInState) {
            return new SigningInWithCustom(customSignInState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithCustom) && sq8.m48644c(this.customSignInState, ((SigningInWithCustom) obj).customSignInState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public CustomSignInState getCustomSignInState() {
            return this.customSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            CustomSignInState customSignInState = this.customSignInState;
            if (customSignInState == null) {
                return 0;
            }
            return customSignInState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setCustomSignInState(CustomSignInState customSignInState) {
            this.customSignInState = customSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithCustom(customSignInState=" + this.customSignInState + ")";
        }
    }

    public static final class SigningInWithHostedUI extends SignInState {
        private HostedUISignInState hostedUISignInState;

        public SigningInWithHostedUI(HostedUISignInState hostedUISignInState) {
            super(null);
            this.hostedUISignInState = hostedUISignInState;
        }

        public static /* synthetic */ SigningInWithHostedUI copy$default(SigningInWithHostedUI signingInWithHostedUI, HostedUISignInState hostedUISignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                hostedUISignInState = signingInWithHostedUI.hostedUISignInState;
            }
            return signingInWithHostedUI.copy(hostedUISignInState);
        }

        public final HostedUISignInState component1() {
            return this.hostedUISignInState;
        }

        public final SigningInWithHostedUI copy(HostedUISignInState hostedUISignInState) {
            return new SigningInWithHostedUI(hostedUISignInState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithHostedUI) && sq8.m48644c(this.hostedUISignInState, ((SigningInWithHostedUI) obj).hostedUISignInState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public HostedUISignInState getHostedUISignInState() {
            return this.hostedUISignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            HostedUISignInState hostedUISignInState = this.hostedUISignInState;
            if (hostedUISignInState == null) {
                return 0;
            }
            return hostedUISignInState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setHostedUISignInState(HostedUISignInState hostedUISignInState) {
            this.hostedUISignInState = hostedUISignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithHostedUI(hostedUISignInState=" + this.hostedUISignInState + ")";
        }
    }

    public static final class SigningInWithSRP extends SignInState {
        private SRPSignInState srpSignInState;

        public SigningInWithSRP(SRPSignInState sRPSignInState) {
            super(null);
            this.srpSignInState = sRPSignInState;
        }

        public static /* synthetic */ SigningInWithSRP copy$default(SigningInWithSRP signingInWithSRP, SRPSignInState sRPSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                sRPSignInState = signingInWithSRP.srpSignInState;
            }
            return signingInWithSRP.copy(sRPSignInState);
        }

        public final SRPSignInState component1() {
            return this.srpSignInState;
        }

        public final SigningInWithSRP copy(SRPSignInState sRPSignInState) {
            return new SigningInWithSRP(sRPSignInState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithSRP) && sq8.m48644c(this.srpSignInState, ((SigningInWithSRP) obj).srpSignInState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public SRPSignInState getSrpSignInState() {
            return this.srpSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SRPSignInState sRPSignInState = this.srpSignInState;
            if (sRPSignInState == null) {
                return 0;
            }
            return sRPSignInState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setSrpSignInState(SRPSignInState sRPSignInState) {
            this.srpSignInState = sRPSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithSRP(srpSignInState=" + this.srpSignInState + ")";
        }
    }

    public static final class SigningInWithSRPCustom extends SignInState {
        private SRPSignInState srpSignInState;

        public SigningInWithSRPCustom(SRPSignInState sRPSignInState) {
            super(null);
            this.srpSignInState = sRPSignInState;
        }

        public static /* synthetic */ SigningInWithSRPCustom copy$default(SigningInWithSRPCustom signingInWithSRPCustom, SRPSignInState sRPSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                sRPSignInState = signingInWithSRPCustom.srpSignInState;
            }
            return signingInWithSRPCustom.copy(sRPSignInState);
        }

        public final SRPSignInState component1() {
            return this.srpSignInState;
        }

        public final SigningInWithSRPCustom copy(SRPSignInState sRPSignInState) {
            return new SigningInWithSRPCustom(sRPSignInState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithSRPCustom) && sq8.m48644c(this.srpSignInState, ((SigningInWithSRPCustom) obj).srpSignInState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public SRPSignInState getSrpSignInState() {
            return this.srpSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SRPSignInState sRPSignInState = this.srpSignInState;
            if (sRPSignInState == null) {
                return 0;
            }
            return sRPSignInState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setSrpSignInState(SRPSignInState sRPSignInState) {
            this.srpSignInState = sRPSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithSRPCustom(srpSignInState=" + this.srpSignInState + ")";
        }
    }

    public static final class SigningInWithUserAuth extends SignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningInWithUserAuth() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningInWithUserAuth copy$default(SigningInWithUserAuth signingInWithUserAuth, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signingInWithUserAuth.id;
            }
            return signingInWithUserAuth.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final SigningInWithUserAuth copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new SigningInWithUserAuth(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithUserAuth) && sq8.m48644c(this.id, ((SigningInWithUserAuth) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithUserAuth(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningInWithUserAuth(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ SigningInWithUserAuth(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SigningInWithWebAuthn extends SignInState {
        private WebAuthnSignInState webAuthnSignInState;

        public SigningInWithWebAuthn(WebAuthnSignInState webAuthnSignInState) {
            super(null);
            this.webAuthnSignInState = webAuthnSignInState;
        }

        public static /* synthetic */ SigningInWithWebAuthn copy$default(SigningInWithWebAuthn signingInWithWebAuthn, WebAuthnSignInState webAuthnSignInState, int i, Object obj) {
            if ((i & 1) != 0) {
                webAuthnSignInState = signingInWithWebAuthn.webAuthnSignInState;
            }
            return signingInWithWebAuthn.copy(webAuthnSignInState);
        }

        public final WebAuthnSignInState component1() {
            return this.webAuthnSignInState;
        }

        public final SigningInWithWebAuthn copy(WebAuthnSignInState webAuthnSignInState) {
            return new SigningInWithWebAuthn(webAuthnSignInState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningInWithWebAuthn) && sq8.m48644c(this.webAuthnSignInState, ((SigningInWithWebAuthn) obj).webAuthnSignInState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public WebAuthnSignInState getWebAuthnSignInState() {
            return this.webAuthnSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            WebAuthnSignInState webAuthnSignInState = this.webAuthnSignInState;
            if (webAuthnSignInState == null) {
                return 0;
            }
            return webAuthnSignInState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.SignInState
        public void setWebAuthnSignInState(WebAuthnSignInState webAuthnSignInState) {
            this.webAuthnSignInState = webAuthnSignInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningInWithWebAuthn(webAuthnSignInState=" + this.webAuthnSignInState + ")";
        }
    }

    public /* synthetic */ SignInState(id5 id5Var) {
        this();
    }

    public SignInChallengeState getChallengeState() {
        return this.challengeState;
    }

    public CustomSignInState getCustomSignInState() {
        return this.customSignInState;
    }

    public DeviceSRPSignInState getDeviceSRPSignInState() {
        return this.deviceSRPSignInState;
    }

    public HostedUISignInState getHostedUISignInState() {
        return this.hostedUISignInState;
    }

    public MigrateSignInState getMigrateSignInState() {
        return this.migrateSignInState;
    }

    public SetupTOTPState getSetupTOTPState() {
        return this.setupTOTPState;
    }

    public SRPSignInState getSrpSignInState() {
        return this.srpSignInState;
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public WebAuthnSignInState getWebAuthnSignInState() {
        return this.webAuthnSignInState;
    }

    public void setChallengeState(SignInChallengeState signInChallengeState) {
        this.challengeState = signInChallengeState;
    }

    public void setCustomSignInState(CustomSignInState customSignInState) {
        this.customSignInState = customSignInState;
    }

    public void setDeviceSRPSignInState(DeviceSRPSignInState deviceSRPSignInState) {
        this.deviceSRPSignInState = deviceSRPSignInState;
    }

    public void setHostedUISignInState(HostedUISignInState hostedUISignInState) {
        this.hostedUISignInState = hostedUISignInState;
    }

    public void setMigrateSignInState(MigrateSignInState migrateSignInState) {
        this.migrateSignInState = migrateSignInState;
    }

    public void setSetupTOTPState(SetupTOTPState setupTOTPState) {
        this.setupTOTPState = setupTOTPState;
    }

    public void setSrpSignInState(SRPSignInState sRPSignInState) {
        this.srpSignInState = sRPSignInState;
    }

    public void setWebAuthnSignInState(WebAuthnSignInState webAuthnSignInState) {
        this.webAuthnSignInState = webAuthnSignInState;
    }

    private SignInState() {
        this.srpSignInState = new SRPSignInState.NotStarted(null, 1, null);
        this.challengeState = new SignInChallengeState.NotStarted(null, 1, null);
        this.customSignInState = new CustomSignInState.NotStarted(null, 1, null);
        this.migrateSignInState = new MigrateSignInState.NotStarted(null, 1, null);
        this.hostedUISignInState = new HostedUISignInState.NotStarted(null, 1, null);
        this.deviceSRPSignInState = new DeviceSRPSignInState.NotStarted(null, 1, null);
        this.setupTOTPState = new SetupTOTPState.NotStarted(null, 1, null);
        this.webAuthnSignInState = new WebAuthnSignInState.NotStarted(null, 1, null);
    }
}
