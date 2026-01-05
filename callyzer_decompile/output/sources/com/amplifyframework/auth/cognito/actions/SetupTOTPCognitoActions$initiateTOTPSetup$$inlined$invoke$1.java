package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 implements Action {
    final /* synthetic */ SetupTOTPEvent.EventType.SetupTOTP $eventType$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43751id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1", m15344f = "SetupTOTPCognitoActions.kt", m15345l = {JPAKEParticipant.STATE_ROUND_3_VALIDATED}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1$1 */
    public static final class C11031 extends AbstractC8193c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C11031(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1(String str, SetupTOTPEvent.EventType.SetupTOTP setupTOTP) {
        this.$eventType$inlined = setupTOTP;
        this.f43751id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:24:0x00b9, B:29:0x00c1, B:31:0x00c5, B:32:0x00ed, B:19:0x0077, B:21:0x0081), top: B:37:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[Catch: Exception -> 0x00bc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bc, blocks: (B:24:0x00b9, B:29:0x00c1, B:31:0x00c5, B:32:0x00ed, B:19:0x0077, B:21:0x0081), top: B:37:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r9, com.amplifyframework.statemachine.Environment r10, uw.InterfaceC7559c<? super qw.a0> r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43751id;
    }
}
