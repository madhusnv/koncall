package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignUpEvent.EventType.InitiateSignUp $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43774id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1", m15344f = "SignUpCognitoActions.kt", m15345l = {JPAKEParticipant.STATE_ROUND_3_VALIDATED, 74}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1$1 */
    public static final class C11231 extends AbstractC8193c {
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

        public C11231(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1(String str, SignUpEvent.EventType.InitiateSignUp initiateSignUp) {
        this.$event$inlined = initiateSignUp;
        this.f43774id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5 A[Catch: Exception -> 0x013e, TryCatch #0 {Exception -> 0x013e, blocks: (B:31:0x00e5, B:33:0x00f5, B:35:0x010c, B:36:0x011b, B:38:0x0121, B:42:0x0143, B:44:0x014f, B:46:0x0155, B:48:0x0163, B:50:0x0169, B:52:0x0173, B:54:0x0179, B:56:0x0181, B:58:0x0197, B:59:0x01ab, B:61:0x01c3, B:62:0x01d0, B:64:0x01d6, B:66:0x01f3), top: B:111:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0258 A[Catch: Exception -> 0x0237, TryCatch #3 {Exception -> 0x0237, blocks: (B:77:0x0234, B:81:0x023c, B:83:0x0258, B:86:0x025e, B:88:0x0262, B:91:0x0269, B:93:0x026e, B:95:0x0274, B:96:0x0276, B:97:0x0290, B:99:0x029b, B:102:0x02a1), top: B:117:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025e A[Catch: Exception -> 0x0237, TryCatch #3 {Exception -> 0x0237, blocks: (B:77:0x0234, B:81:0x023c, B:83:0x0258, B:86:0x025e, B:88:0x0262, B:91:0x0269, B:93:0x026e, B:95:0x0274, B:96:0x0276, B:97:0x0290, B:99:0x029b, B:102:0x02a1), top: B:117:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0269 A[Catch: Exception -> 0x0237, TRY_ENTER, TryCatch #3 {Exception -> 0x0237, blocks: (B:77:0x0234, B:81:0x023c, B:83:0x0258, B:86:0x025e, B:88:0x0262, B:91:0x0269, B:93:0x026e, B:95:0x0274, B:96:0x0276, B:97:0x0290, B:99:0x029b, B:102:0x02a1), top: B:117:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0290 A[Catch: Exception -> 0x0237, TryCatch #3 {Exception -> 0x0237, blocks: (B:77:0x0234, B:81:0x023c, B:83:0x0258, B:86:0x025e, B:88:0x0262, B:91:0x0269, B:93:0x026e, B:95:0x0274, B:96:0x0276, B:97:0x0290, B:99:0x029b, B:102:0x02a1), top: B:117:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029b A[Catch: Exception -> 0x0237, TryCatch #3 {Exception -> 0x0237, blocks: (B:77:0x0234, B:81:0x023c, B:83:0x0258, B:86:0x025e, B:88:0x0262, B:91:0x0269, B:93:0x026e, B:95:0x0274, B:96:0x0276, B:97:0x0290, B:99:0x029b, B:102:0x02a1), top: B:117:0x0234 }] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r18, com.amplifyframework.statemachine.Environment r19, uw.InterfaceC7559c<? super qw.a0> r20) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43774id;
    }
}
