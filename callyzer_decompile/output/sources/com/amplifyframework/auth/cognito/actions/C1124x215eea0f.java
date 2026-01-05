package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.UserAuthSignInCognitoActions$initiateUserAuthSignIn$$inlined$invoke$1 */
/* loaded from: classes.dex */
public final class C1124x215eea0f implements Action {
    final /* synthetic */ SignInEvent.EventType.InitiateUserAuth $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43775id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.UserAuthSignInCognitoActions$initiateUserAuthSignIn$$inlined$invoke$1", m15344f = "UserAuthSignInCognitoActions.kt", m15345l = {81, 82, 87}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.UserAuthSignInCognitoActions$initiateUserAuthSignIn$$inlined$invoke$1$1, reason: invalid class name */
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
            return C1124x215eea0f.this.execute(null, null, this);
        }
    }

    public C1124x215eea0f(String str, SignInEvent.EventType.InitiateUserAuth initiateUserAuth) {
        this.$event$inlined = initiateUserAuth;
        this.f43775id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02df A[Catch: Exception -> 0x024b, TryCatch #1 {Exception -> 0x024b, blocks: (B:80:0x0248, B:85:0x0254, B:88:0x025d, B:91:0x0263, B:93:0x0267, B:98:0x0275, B:100:0x0281, B:102:0x0289, B:104:0x028d, B:106:0x0295, B:108:0x02aa, B:109:0x02ba, B:110:0x02df, B:112:0x02e3, B:114:0x02e7, B:117:0x02ef, B:121:0x02f7, B:124:0x0305, B:127:0x030f, B:129:0x0317, B:130:0x0341, B:131:0x0350), top: B:143:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e3 A[Catch: Exception -> 0x024b, TryCatch #1 {Exception -> 0x024b, blocks: (B:80:0x0248, B:85:0x0254, B:88:0x025d, B:91:0x0263, B:93:0x0267, B:98:0x0275, B:100:0x0281, B:102:0x0289, B:104:0x028d, B:106:0x0295, B:108:0x02aa, B:109:0x02ba, B:110:0x02df, B:112:0x02e3, B:114:0x02e7, B:117:0x02ef, B:121:0x02f7, B:124:0x0305, B:127:0x030f, B:129:0x0317, B:130:0x0341, B:131:0x0350), top: B:143:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c0 A[Catch: Exception -> 0x01ca, TryCatch #3 {Exception -> 0x01ca, blocks: (B:60:0x01bc, B:62:0x01c0, B:65:0x01cd, B:67:0x01db, B:69:0x01ee, B:71:0x01f4, B:73:0x0202, B:75:0x020c, B:76:0x0214), top: B:146:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01db A[Catch: Exception -> 0x01ca, TryCatch #3 {Exception -> 0x01ca, blocks: (B:60:0x01bc, B:62:0x01c0, B:65:0x01cd, B:67:0x01db, B:69:0x01ee, B:71:0x01f4, B:73:0x0202, B:75:0x020c, B:76:0x0214), top: B:146:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0254 A[Catch: Exception -> 0x024b, TryCatch #1 {Exception -> 0x024b, blocks: (B:80:0x0248, B:85:0x0254, B:88:0x025d, B:91:0x0263, B:93:0x0267, B:98:0x0275, B:100:0x0281, B:102:0x0289, B:104:0x028d, B:106:0x0295, B:108:0x02aa, B:109:0x02ba, B:110:0x02df, B:112:0x02e3, B:114:0x02e7, B:117:0x02ef, B:121:0x02f7, B:124:0x0305, B:127:0x030f, B:129:0x0317, B:130:0x0341, B:131:0x0350), top: B:143:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025d A[Catch: Exception -> 0x024b, TryCatch #1 {Exception -> 0x024b, blocks: (B:80:0x0248, B:85:0x0254, B:88:0x025d, B:91:0x0263, B:93:0x0267, B:98:0x0275, B:100:0x0281, B:102:0x0289, B:104:0x028d, B:106:0x0295, B:108:0x02aa, B:109:0x02ba, B:110:0x02df, B:112:0x02e3, B:114:0x02e7, B:117:0x02ef, B:121:0x02f7, B:124:0x0305, B:127:0x030f, B:129:0x0317, B:130:0x0341, B:131:0x0350), top: B:143:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0263 A[Catch: Exception -> 0x024b, TryCatch #1 {Exception -> 0x024b, blocks: (B:80:0x0248, B:85:0x0254, B:88:0x025d, B:91:0x0263, B:93:0x0267, B:98:0x0275, B:100:0x0281, B:102:0x0289, B:104:0x028d, B:106:0x0295, B:108:0x02aa, B:109:0x02ba, B:110:0x02df, B:112:0x02e3, B:114:0x02e7, B:117:0x02ef, B:121:0x02f7, B:124:0x0305, B:127:0x030f, B:129:0x0317, B:130:0x0341, B:131:0x0350), top: B:143:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.Map] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r29, com.amplifyframework.statemachine.Environment r30, uw.InterfaceC7559c<? super qw.a0> r31) throws com.amplifyframework.auth.exceptions.ServiceException {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1124x215eea0f.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43775id;
    }
}
