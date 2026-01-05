package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.statemachine.codegen.data.SignUpData;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import ex.InterfaceC2141e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$result$1", m15344f = "SignUpUseCase.kt", m15345l = {}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SignUpUseCase$execute$result$1 extends AbstractC8199i implements InterfaceC2141e {
    final /* synthetic */ AWSCognitoAuthSignUpOptions $awsOptions;
    final /* synthetic */ AuthSignUpOptions $options;
    final /* synthetic */ String $password;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ SignUpUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpUseCase$execute$result$1(AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions, String str, String str2, AuthSignUpOptions authSignUpOptions, SignUpUseCase signUpUseCase, InterfaceC7559c<? super SignUpUseCase$execute$result$1> interfaceC7559c) {
        super(2, interfaceC7559c);
        this.$awsOptions = aWSCognitoAuthSignUpOptions;
        this.$username = str;
        this.$password = str2;
        this.$options = authSignUpOptions;
        this.this$0 = signUpUseCase;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        return new SignUpUseCase$execute$result$1(this.$awsOptions, this.$username, this.$password, this.$options, this.this$0, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions = this.$awsOptions;
        Map<String, String> validationData = aWSCognitoAuthSignUpOptions != null ? aWSCognitoAuthSignUpOptions.getValidationData() : null;
        AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions2 = this.$awsOptions;
        this.this$0.stateMachine.send(new SignUpEvent(new SignUpEvent.EventType.InitiateSignUp(new SignUpData(this.$username, validationData, aWSCognitoAuthSignUpOptions2 != null ? aWSCognitoAuthSignUpOptions2.getClientMetadata() : null, (String) null, (String) null, 24, (AbstractC4148f) null), this.$password, this.$options.getUserAttributes()), null, 2, null));
        return a0.f30746a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC8210k interfaceC8210k, InterfaceC7559c<? super a0> interfaceC7559c) {
        return ((SignUpUseCase$execute$result$1) create(interfaceC8210k, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
