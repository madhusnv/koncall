package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1 */
/* loaded from: classes.dex */
public final class C1053x22220602 implements Action {

    /* renamed from: id, reason: collision with root package name */
    private final String f43717id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1", m15344f = "AuthCognitoActions.kt", m15345l = {68}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC8193c {
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

        public AnonymousClass1(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1053x22220602.this.execute(null, null, this);
        }
    }

    public C1053x22220602(String str) {
        this.f43717id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r8, com.amplifyframework.statemachine.Environment r9, uw.InterfaceC7559c<? super qw.a0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.amplifyframework.auth.cognito.actions.C1053x22220602.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1$1 r0 = (com.amplifyframework.auth.cognito.actions.C1053x22220602.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1$1 r0 = new com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4c
            if (r2 != r3) goto L44
            java.lang.Object r8 = r0.L$6
            com.amplifyframework.auth.cognito.AuthEnvironment r8 = (com.amplifyframework.auth.cognito.AuthEnvironment) r8
            java.lang.Object r9 = r0.L$5
            java.lang.String r9 = (java.lang.String) r9
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
            og.od.m10798c(r10)
            goto L96
        L44:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4c:
            og.od.m10798c(r10)
            java.lang.String r10 = "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r9, r10)
            java.lang.String r10 = r7.getId()
            com.amplifyframework.auth.cognito.AuthEnvironment r9 = (com.amplifyframework.auth.cognito.AuthEnvironment) r9
            com.amplifyframework.logging.Logger r2 = r9.getLogger()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r6 = " Starting execution"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r2.verbose(r5)
            com.amplifyframework.auth.cognito.StoreClientBehavior r2 = r9.getCredentialStoreClient()
            com.amplifyframework.statemachine.codegen.data.CredentialType$Amplify r5 = com.amplifyframework.statemachine.codegen.data.CredentialType.Amplify.INSTANCE
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.L$3 = r4
            r0.L$4 = r8
            r0.L$5 = r10
            r0.L$6 = r9
            r6 = 0
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r0 = r2.loadCredentials(r5, r0)
            if (r0 != r1) goto L92
            return r1
        L92:
            r1 = r8
            r8 = r9
            r9 = r10
            r10 = r0
        L96:
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential r10 = (com.amplifyframework.statemachine.codegen.data.AmplifyCredential) r10
            com.amplifyframework.auth.cognito.AuthConfiguration r0 = r8.getConfiguration()
            com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration r0 = r0.getUserPool()
            r2 = 2
            if (r0 == 0) goto Lb2
            com.amplifyframework.statemachine.codegen.events.AuthEvent r0 = new com.amplifyframework.statemachine.codegen.events.AuthEvent
            com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType$ConfigureAuthentication r3 = new com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType$ConfigureAuthentication
            com.amplifyframework.auth.cognito.AuthConfiguration r5 = r8.getConfiguration()
            r3.<init>(r5, r10)
            r0.<init>(r3, r4, r2, r4)
            goto Lc0
        Lb2:
            com.amplifyframework.statemachine.codegen.events.AuthEvent r0 = new com.amplifyframework.statemachine.codegen.events.AuthEvent
            com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType$ConfigureAuthorization r3 = new com.amplifyframework.statemachine.codegen.events.AuthEvent$EventType$ConfigureAuthorization
            com.amplifyframework.auth.cognito.AuthConfiguration r5 = r8.getConfiguration()
            r3.<init>(r5, r10)
            r0.<init>(r3, r4, r2, r4)
        Lc0:
            com.amplifyframework.logging.Logger r8 = r8.getLogger()
            java.lang.String r10 = r0.getType()
            java.lang.String r2 = " Sending event "
            a2.AbstractC0030c.m132w(r9, r2, r10, r8)
            r1.send(r0)
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1053x22220602.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43717id;
    }
}
