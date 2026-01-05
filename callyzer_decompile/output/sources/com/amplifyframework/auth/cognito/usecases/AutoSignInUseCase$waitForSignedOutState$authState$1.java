package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import ex.InterfaceC2142f;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$waitForSignedOutState$authState$1", m15344f = "AutoSignInUseCase.kt", m15345l = {56}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AutoSignInUseCase$waitForSignedOutState$authState$1 extends AbstractC8199i implements InterfaceC2142f {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AutoSignInUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSignInUseCase$waitForSignedOutState$authState$1(AutoSignInUseCase autoSignInUseCase, InterfaceC7559c<? super AutoSignInUseCase$waitForSignedOutState$authState$1> interfaceC7559c) {
        super(3, interfaceC7559c);
        this.this$0 = autoSignInUseCase;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws AuthException {
        InterfaceC8210k interfaceC8210k = (InterfaceC8210k) this.L$0;
        AuthState authState = (AuthState) this.L$1;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.label;
        boolean z6 = true;
        if (i10 == 0) {
            od.m10798c(obj);
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState instanceof AuthenticationState.NotConfigured) {
                throw new InvalidUserPoolConfigurationException();
            }
            if (!(authNState instanceof AuthenticationState.SignedOut)) {
                if (!(authNState instanceof AuthenticationState.SigningOut)) {
                    if (!(authNState instanceof AuthenticationState.SigningIn)) {
                        if (authNState instanceof AuthenticationState.Error) {
                            throw CognitoAuthExceptionConverter.Companion.lookup(((AuthenticationState.Error) authNState).getException(), "Sign in failed.");
                        }
                        throw new InvalidStateException(null, null, null, 7, null);
                    }
                    this.this$0.stateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null));
                }
                return Boolean.valueOf(z6);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (interfaceC8210k.emit(authState, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        z6 = false;
        return Boolean.valueOf(z6);
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(InterfaceC8210k interfaceC8210k, AuthState authState, InterfaceC7559c<? super Boolean> interfaceC7559c) {
        AutoSignInUseCase$waitForSignedOutState$authState$1 autoSignInUseCase$waitForSignedOutState$authState$1 = new AutoSignInUseCase$waitForSignedOutState$authState$1(this.this$0, interfaceC7559c);
        autoSignInUseCase$waitForSignedOutState$authState$1.L$0 = interfaceC8210k;
        autoSignInUseCase$waitForSignedOutState$authState$1.L$1 = authState;
        return autoSignInUseCase$waitForSignedOutState$authState$1.invokeSuspend(a0.f30746a);
    }
}
