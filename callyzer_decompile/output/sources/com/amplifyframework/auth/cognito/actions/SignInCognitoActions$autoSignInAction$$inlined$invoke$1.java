package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInCognitoActions$autoSignInAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignInEvent.EventType.InitiateAutoSignIn $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43755id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SignInCognitoActions$autoSignInAction$$inlined$invoke$1", m15344f = "SignInCognitoActions.kt", m15345l = {81, 85}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$autoSignInAction$$inlined$invoke$1$1 */
    public static final class C11111 extends AbstractC8193c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
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

        public C11111(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignInCognitoActions$autoSignInAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignInCognitoActions$autoSignInAction$$inlined$invoke$1(String str, SignInEvent.EventType.InitiateAutoSignIn initiateAutoSignIn) {
        this.$event$inlined = initiateAutoSignIn;
        this.f43755id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0150 A[Catch: Exception -> 0x0168, TryCatch #3 {Exception -> 0x0168, blocks: (B:46:0x0140, B:48:0x0150, B:50:0x0163, B:54:0x016d, B:56:0x017f, B:58:0x0189, B:59:0x0191), top: B:85:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dd A[Catch: Exception -> 0x01d6, TryCatch #4 {Exception -> 0x01d6, blocks: (B:63:0x01d1, B:69:0x01dd, B:70:0x0205, B:71:0x0214), top: B:87:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0205 A[Catch: Exception -> 0x01d6, TryCatch #4 {Exception -> 0x01d6, blocks: (B:63:0x01d1, B:69:0x01dd, B:70:0x0205, B:71:0x0214), top: B:87:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r30, com.amplifyframework.statemachine.Environment r31, uw.InterfaceC7559c<? super qw.a0> r32) throws com.amplifyframework.auth.exceptions.ServiceException {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$autoSignInAction$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43755id;
    }
}
