package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInCognitoActions$confirmDevice$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignInEvent.EventType.ConfirmDevice $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43756id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$$inlined$invoke$1", m15344f = "SignInCognitoActions.kt", m15345l = {74, 87}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$$inlined$invoke$1$1 */
    public static final class C11121 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C11121(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignInCognitoActions$confirmDevice$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignInCognitoActions$confirmDevice$$inlined$invoke$1(String str, SignInEvent.EventType.ConfirmDevice confirmDevice) {
        this.$event$inlined = confirmDevice;
        this.f43756id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f A[Catch: Exception -> 0x01a2, TRY_LEAVE, TryCatch #5 {Exception -> 0x01a2, blocks: (B:35:0x012b, B:37:0x012f), top: B:67:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r23, com.amplifyframework.statemachine.Environment r24, uw.InterfaceC7559c<? super qw.a0> r25) throws com.amplifyframework.auth.exceptions.ServiceException {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43756id;
    }
}
