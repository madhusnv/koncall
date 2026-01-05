package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 */
/* loaded from: classes.dex */
public final class C1097xf02c4164 implements Action {
    final /* synthetic */ SRPEvent.EventType.InitiateSRPWithCustom $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43749id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1", m15344f = "SRPCognitoActions.kt", m15345l = {84, 85, 90}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC8193c {
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

        public AnonymousClass1(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1097xf02c4164.this.execute(null, null, this);
        }
    }

    public C1097xf02c4164(String str, SRPEvent.EventType.InitiateSRPWithCustom initiateSRPWithCustom) {
        this.$event$inlined = initiateSRPWithCustom;
        this.f43749id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d6 A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:58:0x01d2, B:60:0x01d6, B:63:0x01e1, B:65:0x01ef, B:67:0x0206, B:69:0x020c, B:71:0x021a, B:73:0x0224, B:74:0x022c), top: B:109:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ef A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:58:0x01d2, B:60:0x01d6, B:63:0x01e1, B:65:0x01ef, B:67:0x0206, B:69:0x020c, B:71:0x021a, B:73:0x0224, B:74:0x022c), top: B:109:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e A[Catch: Exception -> 0x0267, TryCatch #5 {Exception -> 0x0267, blocks: (B:78:0x0264, B:83:0x026e, B:85:0x0272, B:87:0x027a, B:90:0x0280, B:92:0x0286, B:93:0x028f, B:94:0x02a3, B:95:0x02b2, B:96:0x02b3, B:97:0x02ba), top: B:117:0x0264 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027a A[Catch: Exception -> 0x0267, TryCatch #5 {Exception -> 0x0267, blocks: (B:78:0x0264, B:83:0x026e, B:85:0x0272, B:87:0x027a, B:90:0x0280, B:92:0x0286, B:93:0x028f, B:94:0x02a3, B:95:0x02b2, B:96:0x02b3, B:97:0x02ba), top: B:117:0x0264 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b3 A[Catch: Exception -> 0x0267, TryCatch #5 {Exception -> 0x0267, blocks: (B:78:0x0264, B:83:0x026e, B:85:0x0272, B:87:0x027a, B:90:0x0280, B:92:0x0286, B:93:0x028f, B:94:0x02a3, B:95:0x02b2, B:96:0x02b3, B:97:0x02ba), top: B:117:0x0264 }] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.Map] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r25, com.amplifyframework.statemachine.Environment r26, uw.InterfaceC7559c<? super qw.a0> r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1097xf02c4164.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43749id;
    }
}
