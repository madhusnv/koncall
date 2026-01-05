package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthChannelEventName;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter;
import com.amplifyframework.auth.plugins.core.AuthHubEventEmitter;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.amplifyframework.statemachine.codegen.states.AuthorizationState;
import com.amplifyframework.statemachine.codegen.states.DeleteUserState;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import og.od;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeleteUserUseCase {
    private final AuthHubEventEmitter emitter;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase", m15344f = "DeleteUserUseCase.kt", m15345l = {38, JPAKEParticipant.STATE_ROUND_2_VALIDATED, 47}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase$execute$1 */
    public static final class C11561 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11561(InterfaceC7559c<? super C11561> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeleteUserUseCase.this.execute(this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase$execute$2", m15344f = "DeleteUserUseCase.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase$execute$2 */
    public static final class C11572 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ DeleteUserUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11572(String str, DeleteUserUseCase deleteUserUseCase, InterfaceC7559c<? super C11572> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$token = str;
            this.this$0 = deleteUserUseCase;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C11572(this.$token, this.this$0, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            this.this$0.stateMachine.send(new DeleteUserEvent(new DeleteUserEvent.EventType.DeleteUser(this.$token), null, 2, null));
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC8210k interfaceC8210k, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C11572) create(interfaceC8210k, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    public DeleteUserUseCase(FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine, AuthHubEventEmitter emitter) {
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        AbstractC4154l.m8923f(emitter, "emitter");
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
        this.emitter = emitter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean execute$lambda$0(C4168z c4168z, DeleteUserUseCase deleteUserUseCase, AuthState authState) throws AuthException {
        Object obj;
        AbstractC4154l.m8923f(authState, "authState");
        AuthenticationState authNState = authState.getAuthNState();
        AuthorizationState authZState = authState.getAuthZState();
        if (authZState instanceof AuthorizationState.DeletingUser) {
            AuthorizationState.DeletingUser deletingUser = (AuthorizationState.DeletingUser) authZState;
            if (deletingUser.getDeleteUserState() instanceof DeleteUserState.Error) {
                c4168z.f21164a = ((DeleteUserState.Error) deletingUser.getDeleteUserState()).getException();
                return true;
            }
        }
        if ((authNState instanceof AuthenticationState.SignedOut) && (authZState instanceof AuthorizationState.Configured)) {
            deleteUserUseCase.emitter.sendHubEvent(AuthChannelEventName.USER_DELETED.toString());
            return false;
        }
        if (!(authZState instanceof AuthorizationState.SessionEstablished) || (obj = c4168z.f21164a) == null) {
            return true;
        }
        CognitoAuthExceptionConverter.Companion companion = CognitoAuthExceptionConverter.Companion;
        AbstractC4154l.m8920c(obj);
        throw companion.lookup((Exception) obj, "Request to delete user may have failed. Please check exception stack");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if (com.amplifyframework.auth.cognito.helpers.FlowExtensionsKt.collectWhile(r8, r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(uw.InterfaceC7559c<? super qw.a0> r8) throws com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase.C11561
            if (r0 == 0) goto L13
            r0 = r8
            com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase$execute$1 r0 = (com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase.C11561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase$execute$1 r0 = new com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase$execute$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.L$1
            kotlin.jvm.internal.z r1 = (kotlin.jvm.internal.C4168z) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            og.od.m10798c(r8)
            goto L8e
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            og.od.m10798c(r8)
            goto L5e
        L41:
            og.od.m10798c(r8)
            goto L53
        L45:
            og.od.m10798c(r8)
            com.amplifyframework.auth.cognito.AuthStateMachine r8 = r7.stateMachine
            r0.label = r5
            java.lang.Object r8 = com.amplifyframework.auth.cognito.AuthStateMachineKt.requireSignedInState(r8, r0)
            if (r8 != r1) goto L53
            goto L8d
        L53:
            com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase r8 = r7.fetchAuthSession
            r0.label = r4
            java.lang.Object r8 = r8.execute(r0)
            if (r8 != r1) goto L5e
            goto L8d
        L5e:
            com.amplifyframework.auth.cognito.AWSCognitoAuthSession r8 = (com.amplifyframework.auth.cognito.AWSCognitoAuthSession) r8
            java.lang.String r8 = com.amplifyframework.auth.cognito.AWSCognitoAuthSessionKt.requireAccessToken(r8)
            kotlin.jvm.internal.z r2 = new kotlin.jvm.internal.z
            r2.<init>()
            com.amplifyframework.auth.cognito.AuthStateMachine r4 = r7.stateMachine
            wx.k1 r4 = r4.getState()
            com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase$execute$2 r5 = new com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase$execute$2
            r6 = 0
            r5.<init>(r8, r7, r6)
            wx.t r8 = new wx.t
            r8.<init>(r5, r4)
            an.o1 r4 = new an.o1
            r5 = 19
            r4.<init>(r5, r2, r7)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = com.amplifyframework.auth.cognito.helpers.FlowExtensionsKt.collectWhile(r8, r4, r0)
            if (r8 != r1) goto L8e
        L8d:
            return r1
        L8e:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase.execute(uw.c):java.lang.Object");
    }

    public /* synthetic */ DeleteUserUseCase(FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine, AuthHubEventEmitter authHubEventEmitter, int i10, AbstractC4148f abstractC4148f) {
        this(fetchAuthSessionUseCase, authStateMachine, (i10 & 4) != 0 ? new AuthHubEventEmitter() : authHubEventEmitter);
    }
}
