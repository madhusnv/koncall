package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 implements Action {
    final /* synthetic */ SetupTOTPEvent.EventType.RespondToAuthChallenge $eventType$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43752id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1", m15344f = "SetupTOTPCognitoActions.kt", m15345l = {71, 74, 78}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1$1 */
    public static final class C11041 extends AbstractC8193c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
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

        public C11041(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1(String str, SetupTOTPEvent.EventType.RespondToAuthChallenge respondToAuthChallenge) {
        this.$eventType$inlined = respondToAuthChallenge;
        this.f43752id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015e A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:21:0x009d, B:43:0x014e, B:45:0x015e, B:47:0x017b, B:49:0x0181, B:51:0x0185, B:53:0x018f, B:54:0x0197, B:26:0x00c7, B:35:0x011b, B:37:0x011f, B:39:0x0125, B:40:0x012a, B:31:0x0102), top: B:74:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0066, B:58:0x01c6, B:61:0x01cd, B:63:0x01f3), top: B:70:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f3 A[Catch: Exception -> 0x006b, TRY_LEAVE, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0066, B:58:0x01c6, B:61:0x01cd, B:63:0x01f3), top: B:70:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r23, com.amplifyframework.statemachine.Environment r24, uw.InterfaceC7559c<? super qw.a0> r25) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43752id;
    }
}
