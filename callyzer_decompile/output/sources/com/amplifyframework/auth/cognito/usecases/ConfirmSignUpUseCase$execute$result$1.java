package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignUpOptions;
import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import com.amplifyframework.statemachine.codegen.data.SignUpData;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import com.amplifyframework.statemachine.codegen.states.SignUpState;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ConfirmSignUpUseCase$execute$result$1", m15344f = "ConfirmSignUpUseCase.kt", m15345l = {}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ConfirmSignUpUseCase$execute$result$1 extends AbstractC8199i implements InterfaceC2141e {
    final /* synthetic */ String $confirmationCode;
    final /* synthetic */ AuthConfirmSignUpOptions $options;
    final /* synthetic */ SignUpState $startingState;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ ConfirmSignUpUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSignUpUseCase$execute$result$1(SignUpState signUpState, String str, AuthConfirmSignUpOptions authConfirmSignUpOptions, String str2, ConfirmSignUpUseCase confirmSignUpUseCase, InterfaceC7559c<? super ConfirmSignUpUseCase$execute$result$1> interfaceC7559c) {
        super(2, interfaceC7559c);
        this.$startingState = signUpState;
        this.$username = str;
        this.$options = authConfirmSignUpOptions;
        this.$confirmationCode = str2;
        this.this$0 = confirmSignUpUseCase;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        return new ConfirmSignUpUseCase$execute$result$1(this.$startingState, this.$username, this.$options, this.$confirmationCode, this.this$0, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        String session;
        String userId;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        SignUpState signUpState = this.$startingState;
        if ((signUpState instanceof SignUpState.AwaitingUserConfirmation) && AbstractC4154l.m8918a(((SignUpState.AwaitingUserConfirmation) signUpState).getSignUpData().getUsername(), this.$username)) {
            session = ((SignUpState.AwaitingUserConfirmation) this.$startingState).getSignUpData().getSession();
            userId = ((SignUpState.AwaitingUserConfirmation) this.$startingState).getSignUpResult().getUserId();
        } else {
            session = null;
            userId = null;
        }
        AuthConfirmSignUpOptions authConfirmSignUpOptions = this.$options;
        AWSCognitoAuthConfirmSignUpOptions aWSCognitoAuthConfirmSignUpOptions = authConfirmSignUpOptions instanceof AWSCognitoAuthConfirmSignUpOptions ? (AWSCognitoAuthConfirmSignUpOptions) authConfirmSignUpOptions : null;
        this.this$0.stateMachine.send(new SignUpEvent(new SignUpEvent.EventType.ConfirmSignUp(new SignUpData(this.$username, null, aWSCognitoAuthConfirmSignUpOptions != null ? aWSCognitoAuthConfirmSignUpOptions.getClientMetadata() : null, session, userId), this.$confirmationCode), null, 2, null));
        return a0.f30746a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC8210k interfaceC8210k, InterfaceC7559c<? super a0> interfaceC7559c) {
        return ((ConfirmSignUpUseCase$execute$result$1) create(interfaceC8210k, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
