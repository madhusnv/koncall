package com.amplifyframework.auth.cognito.actions;

import a2.AbstractC0030c;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.exceptions.ValidationException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.actions.AuthenticationActions;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthenticationCognitoActions implements AuthenticationActions {
    public static final AuthenticationCognitoActions INSTANCE = new AuthenticationCognitoActions();

    private AuthenticationCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthenticationActions
    public Action configureAuthenticationAction(AuthenticationEvent.EventType.Configure event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new C1057xab1a6752("ConfigureAuthN", event);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthenticationActions
    public Action initiateSignInAction(final AuthenticationEvent.EventType.SignInRequested event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitiateSignInAction";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$initiateSignInAction$$inlined$invoke$1
            final /* synthetic */ AuthenticationEvent.EventType.SignInRequested $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43721id;

            {
                this.$event$inlined = event;
                this.f43721id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                StateMachineEvent signInEvent;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", authEnvironment.getLogger());
                SignInData signInData = this.$event$inlined.getSignInData();
                if (signInData instanceof SignInData.SRPSignInData) {
                    SignInData.SRPSignInData sRPSignInData = (SignInData.SRPSignInData) signInData;
                    signInEvent = (sRPSignInData.getUsername() == null || sRPSignInData.getPassword() == null) ? new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username or password empty", null, 4, null)), null, 2, null) : new SignInEvent(new SignInEvent.EventType.InitiateSignInWithSRP(sRPSignInData.getUsername(), sRPSignInData.getPassword(), sRPSignInData.getMetadata(), sRPSignInData.getAuthFlowType(), null, 16, null), null, 2, null);
                } else if (signInData instanceof SignInData.CustomAuthSignInData) {
                    SignInData.CustomAuthSignInData customAuthSignInData = (SignInData.CustomAuthSignInData) signInData;
                    signInEvent = customAuthSignInData.getUsername() != null ? new SignInEvent(new SignInEvent.EventType.InitiateSignInWithCustom(customAuthSignInData.getUsername(), customAuthSignInData.getMetadata()), null, 2, null) : new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username can not be empty", null, 4, null)), null, 2, null);
                } else if (signInData instanceof SignInData.CustomSRPAuthSignInData) {
                    SignInData.CustomSRPAuthSignInData customSRPAuthSignInData = (SignInData.CustomSRPAuthSignInData) signInData;
                    signInEvent = (customSRPAuthSignInData.getUsername() == null || customSRPAuthSignInData.getPassword() == null) ? new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username can not be empty", null, 4, null)), null, 2, null) : new SignInEvent(new SignInEvent.EventType.InitiateCustomSignInWithSRP(customSRPAuthSignInData.getUsername(), customSRPAuthSignInData.getPassword(), customSRPAuthSignInData.getMetadata()), null, 2, null);
                } else if (signInData instanceof SignInData.HostedUISignInData) {
                    signInEvent = new SignInEvent(new SignInEvent.EventType.InitiateHostedUISignIn((SignInData.HostedUISignInData) signInData), null, 2, null);
                } else if (signInData instanceof SignInData.MigrationAuthSignInData) {
                    SignInData.MigrationAuthSignInData migrationAuthSignInData = (SignInData.MigrationAuthSignInData) signInData;
                    signInEvent = (migrationAuthSignInData.getUsername() == null || migrationAuthSignInData.getPassword() == null) ? new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username or password empty", null, 4, null)), null, 2, null) : new SignInEvent(new SignInEvent.EventType.InitiateMigrateAuth(migrationAuthSignInData.getUsername(), migrationAuthSignInData.getPassword(), migrationAuthSignInData.getMetadata(), migrationAuthSignInData.getAuthFlowType(), null, 16, null), null, 2, null);
                } else if (signInData instanceof SignInData.UserAuthSignInData) {
                    SignInData.UserAuthSignInData userAuthSignInData = (SignInData.UserAuthSignInData) signInData;
                    signInEvent = userAuthSignInData.getUsername() != null ? new SignInEvent(new SignInEvent.EventType.InitiateUserAuth(userAuthSignInData.getUsername(), userAuthSignInData.getPreferredChallenge(), userAuthSignInData.getCallingActivity(), userAuthSignInData.getMetadata()), null, 2, null) : new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username cannot be empty", null, 4, null)), null, 2, null);
                } else {
                    if (!(signInData instanceof SignInData.AutoSignInData)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    signInEvent = new SignInEvent(new SignInEvent.EventType.InitiateAutoSignIn((SignInData.AutoSignInData) signInData), null, 2, null);
                }
                AbstractC0030c.m132w(id2, " Sending event ", signInEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(signInEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43721id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthenticationActions
    public Action initiateSignOutAction(final AuthenticationEvent.EventType.SignOutRequested event, final SignedInData signedInData) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitSignOut";
        return new Action(str, signedInData, event) { // from class: com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$initiateSignOutAction$$inlined$invoke$1
            final /* synthetic */ AuthenticationEvent.EventType.SignOutRequested $event$inlined;
            final /* synthetic */ SignedInData $signedInData$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43722id;

            {
                this.$signedInData$inlined = signedInData;
                this.$event$inlined = event;
                this.f43722id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                SignOutEvent signOutEvent;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", authEnvironment.getLogger());
                SignedInData signedInData2 = this.$signedInData$inlined;
                if (signedInData2 == null || !(signedInData2.getSignInMethod() instanceof SignInMethod.HostedUI)) {
                    SignedInData signedInData3 = this.$signedInData$inlined;
                    signOutEvent = (signedInData3 == null || !AbstractC4154l.m8918a(signedInData3.getSignInMethod(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.UNKNOWN)) || authEnvironment.getHostedUIClient() == null) ? (this.$signedInData$inlined == null || !this.$event$inlined.getSignOutData().getGlobalSignOut()) ? (this.$signedInData$inlined == null || this.$event$inlined.getSignOutData().getGlobalSignOut()) ? new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(this.$signedInData$inlined, null, null, null, 14, null), null, 2, null) : new SignOutEvent(new SignOutEvent.EventType.RevokeToken(this.$signedInData$inlined, null, null, 6, null), null, 2, null) : new SignOutEvent(new SignOutEvent.EventType.SignOutGlobally(this.$signedInData$inlined, null, 2, null), null, 2, null) : new SignOutEvent(new SignOutEvent.EventType.InvokeHostedUISignOut(this.$event$inlined.getSignOutData(), this.$signedInData$inlined), null, 2, null);
                } else {
                    signOutEvent = new SignOutEvent(new SignOutEvent.EventType.InvokeHostedUISignOut(this.$event$inlined.getSignOutData(), this.$signedInData$inlined), null, 2, null);
                }
                AbstractC0030c.m132w(id2, " Sending event ", signOutEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(signOutEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43722id;
            }
        };
    }
}
