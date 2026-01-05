package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1 implements Action {
    final /* synthetic */ AmplifyCredential $amplifyCredential$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43729id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1", m15344f = "AuthorizationCognitoActions.kt", m15345l = {69}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1$1 */
    public static final class C10651 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C10651(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1(String str, AmplifyCredential amplifyCredential) {
        this.$amplifyCredential$inlined = amplifyCredential;
        this.f43729id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r10, com.amplifyframework.statemachine.Environment r11, uw.InterfaceC7559c<? super qw.a0> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1.C10651
            if (r0 == 0) goto L13
            r0 = r12
            com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1$1 r0 = (com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1.C10651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1$1 r0 = new com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L54
            if (r2 != r4) goto L4c
            java.lang.Object r10 = r0.L$6
            com.amplifyframework.auth.cognito.AuthEnvironment r10 = (com.amplifyframework.auth.cognito.AuthEnvironment) r10
            java.lang.Object r11 = r0.L$5
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r0.L$4
            com.amplifyframework.statemachine.EventDispatcher r1 = (com.amplifyframework.statemachine.EventDispatcher) r1
            java.lang.Object r2 = r0.L$3
            uw.c r2 = (uw.InterfaceC7559c) r2
            java.lang.Object r2 = r0.L$2
            com.amplifyframework.statemachine.Environment r2 = (com.amplifyframework.statemachine.Environment) r2
            java.lang.Object r2 = r0.L$1
            com.amplifyframework.statemachine.Environment r2 = (com.amplifyframework.statemachine.Environment) r2
            java.lang.Object r0 = r0.L$0
            com.amplifyframework.statemachine.EventDispatcher r0 = (com.amplifyframework.statemachine.EventDispatcher) r0
            og.od.m10798c(r12)     // Catch: java.lang.Exception -> L48
            r12 = r11
            r11 = r10
            r10 = r1
            goto L8d
        L48:
            r12 = r11
            r11 = r10
            r10 = r1
            goto L9a
        L4c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L54:
            og.od.m10798c(r12)
            java.lang.String r12 = "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r11, r12)
            java.lang.String r12 = r9.getId()
            com.amplifyframework.auth.cognito.AuthEnvironment r11 = (com.amplifyframework.auth.cognito.AuthEnvironment) r11
            com.amplifyframework.logging.Logger r2 = r11.getLogger()
            java.lang.String r6 = " Starting execution"
            a2.AbstractC0030c.m131v(r12, r6, r2)
            com.amplifyframework.auth.cognito.StoreClientBehavior r2 = r11.getCredentialStoreClient()     // Catch: java.lang.Exception -> L9a
            com.amplifyframework.statemachine.codegen.data.CredentialType$Amplify r6 = com.amplifyframework.statemachine.codegen.data.CredentialType.Amplify.INSTANCE     // Catch: java.lang.Exception -> L9a
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential r7 = r9.$amplifyCredential$inlined     // Catch: java.lang.Exception -> L9a
            r0.L$0 = r5     // Catch: java.lang.Exception -> L9a
            r0.L$1 = r5     // Catch: java.lang.Exception -> L9a
            r0.L$2 = r5     // Catch: java.lang.Exception -> L9a
            r0.L$3 = r5     // Catch: java.lang.Exception -> L9a
            r0.L$4 = r10     // Catch: java.lang.Exception -> L9a
            r0.L$5 = r12     // Catch: java.lang.Exception -> L9a
            r0.L$6 = r11     // Catch: java.lang.Exception -> L9a
            r8 = 0
            r0.I$0 = r8     // Catch: java.lang.Exception -> L9a
            r0.label = r4     // Catch: java.lang.Exception -> L9a
            java.lang.Object r0 = r2.storeCredentials(r6, r7, r0)     // Catch: java.lang.Exception -> L9a
            if (r0 != r1) goto L8d
            return r1
        L8d:
            com.amplifyframework.statemachine.codegen.events.AuthEvent r0 = new com.amplifyframework.statemachine.codegen.events.AuthEvent     // Catch: java.lang.Exception -> L9a
            com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType$ReceivedCachedCredentials r1 = new com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType$ReceivedCachedCredentials     // Catch: java.lang.Exception -> L9a
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential r2 = r9.$amplifyCredential$inlined     // Catch: java.lang.Exception -> L9a
            r1.<init>(r2)     // Catch: java.lang.Exception -> L9a
            r0.<init>(r1, r5, r3, r5)     // Catch: java.lang.Exception -> L9a
            goto La1
        L9a:
            com.amplifyframework.statemachine.codegen.events.AuthEvent r0 = new com.amplifyframework.statemachine.codegen.events.AuthEvent
            com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType$CachedCredentialsFailed r1 = com.amplifyframework.statemachine.codegen.events.AuthEvent.EventType.CachedCredentialsFailed.INSTANCE
            r0.<init>(r1, r5, r3, r5)
        La1:
            com.amplifyframework.logging.Logger r11 = r11.getLogger()
            java.lang.String r1 = r0.getType()
            java.lang.String r2 = " Sending event "
            a2.AbstractC0030c.m132w(r12, r2, r1, r11)
            r10.send(r0)
            qw.a0 r10 = qw.a0.f30746a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43729id;
    }
}
