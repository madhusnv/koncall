package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 */
/* loaded from: classes.dex */
public final class C1085xf78af94c implements Action {
    final /* synthetic */ SignedInData $signedInData$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43744id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1", m15344f = "FetchAuthSessionCognitoActions.kt", m15345l = {82, 83, 88}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC8193c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
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
            return C1085xf78af94c.this.execute(null, null, this);
        }
    }

    public C1085xf78af94c(String str, SignedInData signedInData) {
        this.$signedInData$inlined = signedInData;
        this.f43744id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d9 A[Catch: Exception -> 0x0275, NotAuthorizedException -> 0x0278, TryCatch #13 {NotAuthorizedException -> 0x0278, Exception -> 0x0275, blocks: (B:90:0x0271, B:97:0x0281, B:99:0x0285, B:101:0x028b, B:103:0x028f, B:105:0x0293, B:108:0x0299, B:110:0x029d, B:112:0x02a1, B:114:0x02cd, B:119:0x02e0, B:121:0x02e6, B:126:0x02f4, B:128:0x030e, B:130:0x031a, B:132:0x0320, B:134:0x032a, B:136:0x0330, B:137:0x0346, B:118:0x02d9), top: B:157:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x030e A[Catch: Exception -> 0x0275, NotAuthorizedException -> 0x0278, TryCatch #13 {NotAuthorizedException -> 0x0278, Exception -> 0x0275, blocks: (B:90:0x0271, B:97:0x0281, B:99:0x0285, B:101:0x028b, B:103:0x028f, B:105:0x0293, B:108:0x0299, B:110:0x029d, B:112:0x02a1, B:114:0x02cd, B:119:0x02e0, B:121:0x02e6, B:126:0x02f4, B:128:0x030e, B:130:0x031a, B:132:0x0320, B:134:0x032a, B:136:0x0330, B:137:0x0346, B:118:0x02d9), top: B:157:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0346 A[Catch: Exception -> 0x0275, NotAuthorizedException -> 0x0278, TRY_LEAVE, TryCatch #13 {NotAuthorizedException -> 0x0278, Exception -> 0x0275, blocks: (B:90:0x0271, B:97:0x0281, B:99:0x0285, B:101:0x028b, B:103:0x028f, B:105:0x0293, B:108:0x0299, B:110:0x029d, B:112:0x02a1, B:114:0x02cd, B:119:0x02e0, B:121:0x02e6, B:126:0x02f4, B:128:0x030e, B:130:0x031a, B:132:0x0320, B:134:0x032a, B:136:0x0330, B:137:0x0346, B:118:0x02d9), top: B:157:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9 A[Catch: Exception -> 0x01f3, NotAuthorizedException -> 0x01f7, TryCatch #11 {NotAuthorizedException -> 0x01f7, Exception -> 0x01f3, blocks: (B:68:0x01e5, B:70:0x01e9, B:75:0x01fa, B:77:0x0208, B:79:0x021b, B:81:0x0221, B:83:0x0227, B:85:0x0231, B:86:0x0239), top: B:160:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208 A[Catch: Exception -> 0x01f3, NotAuthorizedException -> 0x01f7, TryCatch #11 {NotAuthorizedException -> 0x01f7, Exception -> 0x01f3, blocks: (B:68:0x01e5, B:70:0x01e9, B:75:0x01fa, B:77:0x0208, B:79:0x021b, B:81:0x0221, B:83:0x0227, B:85:0x0231, B:86:0x0239), top: B:160:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0281 A[Catch: Exception -> 0x0275, NotAuthorizedException -> 0x0278, TryCatch #13 {NotAuthorizedException -> 0x0278, Exception -> 0x0275, blocks: (B:90:0x0271, B:97:0x0281, B:99:0x0285, B:101:0x028b, B:103:0x028f, B:105:0x0293, B:108:0x0299, B:110:0x029d, B:112:0x02a1, B:114:0x02cd, B:119:0x02e0, B:121:0x02e6, B:126:0x02f4, B:128:0x030e, B:130:0x031a, B:132:0x0320, B:134:0x032a, B:136:0x0330, B:137:0x0346, B:118:0x02d9), top: B:157:0x0271 }] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.util.Map] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r26, com.amplifyframework.statemachine.Environment r27, uw.InterfaceC7559c<? super qw.a0> r28) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1085xf78af94c.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43744id;
    }
}
