package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignUpEvent.EventType.ConfirmSignUp $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43773id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1", m15344f = "SignUpCognitoActions.kt", m15345l = {JPAKEParticipant.STATE_ROUND_3_VALIDATED, 74}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1$1 */
    public static final class C11221 extends AbstractC8193c {
        int I$0;
        int I$1;
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

        public C11221(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1(String str, SignUpEvent.EventType.ConfirmSignUp confirmSignUp) {
        this.$event$inlined = confirmSignUp;
        this.f43773id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5 A[Catch: Exception -> 0x0113, TryCatch #4 {Exception -> 0x0113, blocks: (B:31:0x00e5, B:33:0x00f5, B:35:0x010e, B:39:0x0118, B:41:0x0126, B:43:0x012e, B:45:0x0138, B:47:0x0140, B:49:0x0148, B:51:0x015e, B:52:0x0172), top: B:91:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01de A[Catch: Exception -> 0x01e1, TryCatch #6 {Exception -> 0x01e1, blocks: (B:62:0x01c6, B:64:0x01de, B:68:0x01e6, B:70:0x01f7, B:73:0x01fd, B:74:0x01ff), top: B:95:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f7 A[Catch: Exception -> 0x01e1, TryCatch #6 {Exception -> 0x01e1, blocks: (B:62:0x01c6, B:64:0x01de, B:68:0x01e6, B:70:0x01f7, B:73:0x01fd, B:74:0x01ff), top: B:95:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fd A[Catch: Exception -> 0x01e1, TryCatch #6 {Exception -> 0x01e1, blocks: (B:62:0x01c6, B:64:0x01de, B:68:0x01e6, B:70:0x01f7, B:73:0x01fd, B:74:0x01ff), top: B:95:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r20, com.amplifyframework.statemachine.Environment r21, uw.InterfaceC7559c<? super qw.a0> r22) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43773id;
    }
}
