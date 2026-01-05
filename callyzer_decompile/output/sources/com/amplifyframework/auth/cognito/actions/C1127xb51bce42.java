package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import ex.InterfaceC2141e;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$safeAction$$inlined$invoke$default$1 */
/* loaded from: classes.dex */
public final class C1127xb51bce42 implements Action {
    final /* synthetic */ InterfaceC2141e $block$inlined;
    final /* synthetic */ WebAuthnSignInContext $context$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43776id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$safeAction$$inlined$invoke$default$1", m15344f = "WebAuthnSignInCognitoActions.kt", m15345l = {68}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$safeAction$$inlined$invoke$default$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1127xb51bce42.this.execute(null, null, this);
        }
    }

    public C1127xb51bce42(String str, InterfaceC2141e interfaceC2141e, WebAuthnSignInContext webAuthnSignInContext) {
        this.$block$inlined = interfaceC2141e;
        this.$context$inlined = webAuthnSignInContext;
        this.f43776id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r6, com.amplifyframework.statemachine.Environment r7, uw.InterfaceC7559c<? super qw.a0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.amplifyframework.auth.cognito.actions.C1127xb51bce42.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$safeAction$$inlined$invoke$default$1$1 r0 = (com.amplifyframework.auth.cognito.actions.C1127xb51bce42.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$safeAction$$inlined$invoke$default$1$1 r0 = new com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$safeAction$$inlined$invoke$default$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r6 = r0.L$5
            com.amplifyframework.auth.cognito.AuthEnvironment r6 = (com.amplifyframework.auth.cognito.AuthEnvironment) r6
            java.lang.Object r6 = r0.L$4
            com.amplifyframework.statemachine.EventDispatcher r6 = (com.amplifyframework.statemachine.EventDispatcher) r6
            java.lang.Object r7 = r0.L$3
            uw.c r7 = (uw.InterfaceC7559c) r7
            java.lang.Object r7 = r0.L$2
            com.amplifyframework.statemachine.Environment r7 = (com.amplifyframework.statemachine.Environment) r7
            java.lang.Object r7 = r0.L$1
            com.amplifyframework.statemachine.Environment r7 = (com.amplifyframework.statemachine.Environment) r7
            java.lang.Object r7 = r0.L$0
            com.amplifyframework.statemachine.EventDispatcher r7 = (com.amplifyframework.statemachine.EventDispatcher) r7
            og.od.m10798c(r8)     // Catch: java.lang.Exception -> L40
            goto L71
        L40:
            r7 = move-exception
            goto L74
        L42:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4a:
            og.od.m10798c(r8)
            java.lang.String r8 = "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r7, r8)
            r5.getId()
            com.amplifyframework.auth.cognito.AuthEnvironment r7 = (com.amplifyframework.auth.cognito.AuthEnvironment) r7
            ex.e r8 = r5.$block$inlined     // Catch: java.lang.Exception -> L40
            r0.L$0 = r4     // Catch: java.lang.Exception -> L40
            r0.L$1 = r4     // Catch: java.lang.Exception -> L40
            r0.L$2 = r4     // Catch: java.lang.Exception -> L40
            r0.L$3 = r4     // Catch: java.lang.Exception -> L40
            r0.L$4 = r6     // Catch: java.lang.Exception -> L40
            r0.L$5 = r4     // Catch: java.lang.Exception -> L40
            r2 = 0
            r0.I$0 = r2     // Catch: java.lang.Exception -> L40
            r0.label = r3     // Catch: java.lang.Exception -> L40
            java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Exception -> L40
            if (r8 != r1) goto L71
            return r1
        L71:
            com.amplifyframework.statemachine.StateMachineEvent r8 = (com.amplifyframework.statemachine.StateMachineEvent) r8     // Catch: java.lang.Exception -> L40
            goto L81
        L74:
            com.amplifyframework.statemachine.codegen.events.WebAuthnEvent r8 = new com.amplifyframework.statemachine.codegen.events.WebAuthnEvent
            com.amplifyframework.statemachine.codegen.events.WebAuthnEvent$EventType$ThrowError r0 = new com.amplifyframework.statemachine.codegen.events.WebAuthnEvent$EventType$ThrowError
            com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext r1 = r5.$context$inlined
            r0.<init>(r7, r1)
            r7 = 2
            r8.<init>(r0, r4, r7, r4)
        L81:
            r6.send(r8)
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1127xb51bce42.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43776id;
    }
}
