package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1 */
/* loaded from: classes.dex */
public final class C1091xb12e4569 implements Action {
    final /* synthetic */ SignInEvent.EventType.InitiateMigrateAuth $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43747id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1", m15344f = "MigrateAuthCognitoActions.kt", m15345l = {78, 85, 110}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC8193c {
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

        public AnonymousClass1(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1091xb12e4569.this.execute(null, null, this);
        }
    }

    public C1091xb12e4569(String str, SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth) {
        this.$event$inlined = initiateMigrateAuth;
        this.f43747id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x030e A[Catch: Exception -> 0x0231, TryCatch #6 {Exception -> 0x0231, blocks: (B:102:0x0306, B:105:0x030e, B:107:0x031a, B:110:0x0324, B:112:0x032e, B:114:0x033c, B:117:0x034e, B:116:0x0346, B:120:0x036d, B:121:0x037c, B:74:0x022e, B:79:0x0239, B:82:0x026a, B:83:0x0279), top: B:138:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b A[Catch: Exception -> 0x01a0, TryCatch #0 {Exception -> 0x01a0, blocks: (B:52:0x018d, B:54:0x019b, B:59:0x01a6, B:61:0x01b7, B:63:0x01c6, B:65:0x01cc, B:67:0x01ea, B:69:0x01f4, B:70:0x01fc, B:84:0x027a, B:86:0x0284, B:87:0x0289, B:89:0x0293, B:91:0x02ae, B:93:0x02b4, B:95:0x02c2, B:97:0x02cc, B:98:0x02d4), top: B:127:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6 A[Catch: Exception -> 0x01a0, TryCatch #0 {Exception -> 0x01a0, blocks: (B:52:0x018d, B:54:0x019b, B:59:0x01a6, B:61:0x01b7, B:63:0x01c6, B:65:0x01cc, B:67:0x01ea, B:69:0x01f4, B:70:0x01fc, B:84:0x027a, B:86:0x0284, B:87:0x0289, B:89:0x0293, B:91:0x02ae, B:93:0x02b4, B:95:0x02c2, B:97:0x02cc, B:98:0x02d4), top: B:127:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0239 A[Catch: Exception -> 0x0231, TryCatch #6 {Exception -> 0x0231, blocks: (B:102:0x0306, B:105:0x030e, B:107:0x031a, B:110:0x0324, B:112:0x032e, B:114:0x033c, B:117:0x034e, B:116:0x0346, B:120:0x036d, B:121:0x037c, B:74:0x022e, B:79:0x0239, B:82:0x026a, B:83:0x0279), top: B:138:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027a A[Catch: Exception -> 0x01a0, TRY_ENTER, TryCatch #0 {Exception -> 0x01a0, blocks: (B:52:0x018d, B:54:0x019b, B:59:0x01a6, B:61:0x01b7, B:63:0x01c6, B:65:0x01cc, B:67:0x01ea, B:69:0x01f4, B:70:0x01fc, B:84:0x027a, B:86:0x0284, B:87:0x0289, B:89:0x0293, B:91:0x02ae, B:93:0x02b4, B:95:0x02c2, B:97:0x02cc, B:98:0x02d4), top: B:127:0x018d }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.amplifyframework.statemachine.EventDispatcher] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.amplifyframework.auth.cognito.AuthEnvironment] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r28, com.amplifyframework.statemachine.Environment r29, uw.InterfaceC7559c<? super qw.a0> r30) throws com.amplifyframework.auth.exceptions.ServiceException {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1091xb12e4569.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43747id;
    }
}
