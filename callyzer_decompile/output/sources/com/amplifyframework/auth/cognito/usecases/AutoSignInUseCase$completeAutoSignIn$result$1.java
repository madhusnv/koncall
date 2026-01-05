package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$completeAutoSignIn$result$1", m15344f = "AutoSignInUseCase.kt", m15345l = {}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AutoSignInUseCase$completeAutoSignIn$result$1 extends AbstractC8199i implements InterfaceC2141e {
    final /* synthetic */ SignInData.AutoSignInData $signInData;
    int label;
    final /* synthetic */ AutoSignInUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSignInUseCase$completeAutoSignIn$result$1(SignInData.AutoSignInData autoSignInData, AutoSignInUseCase autoSignInUseCase, InterfaceC7559c<? super AutoSignInUseCase$completeAutoSignIn$result$1> interfaceC7559c) {
        super(2, interfaceC7559c);
        this.$signInData = autoSignInData;
        this.this$0 = autoSignInUseCase;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        return new AutoSignInUseCase$completeAutoSignIn$result$1(this.$signInData, this.this$0, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        this.this$0.stateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(this.$signInData), null, 2, null));
        return a0.f30746a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC8210k interfaceC8210k, InterfaceC7559c<? super a0> interfaceC7559c) {
        return ((AutoSignInUseCase$completeAutoSignIn$result$1) create(interfaceC8210k, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
