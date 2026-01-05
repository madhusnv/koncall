package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import java.util.Map;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ Map $challengeParameters$inlined;
    final /* synthetic */ Map $metadata$inlined;
    final /* synthetic */ String $session$inlined;
    final /* synthetic */ SignInMethod $signInMethod$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43750id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1", m15344f = "SRPCognitoActions.kt", m15345l = {94, 98, 126}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1$1 */
    public static final class C10981 extends AbstractC8193c {
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
        Object L$16;
        Object L$17;
        Object L$18;
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

        public C10981(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1(String str, Map map, SignInMethod signInMethod, Map map2, String str2) {
        this.$challengeParameters$inlined = map;
        this.$signInMethod$inlined = signInMethod;
        this.$metadata$inlined = map2;
        this.$session$inlined = str2;
        this.f43750id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0243 A[Catch: Exception -> 0x026f, TryCatch #2 {Exception -> 0x026f, blocks: (B:54:0x0233, B:56:0x0243, B:58:0x0266, B:63:0x0277, B:64:0x027f), top: B:97:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ca A[Catch: Exception -> 0x02c3, TryCatch #8 {Exception -> 0x02c3, blocks: (B:68:0x02be, B:74:0x02ca, B:75:0x02f0, B:76:0x02ff), top: B:109:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f0 A[Catch: Exception -> 0x02c3, TryCatch #8 {Exception -> 0x02c3, blocks: (B:68:0x02be, B:74:0x02ca, B:75:0x02f0, B:76:0x02ff), top: B:109:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0377  */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.Map] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r31, com.amplifyframework.statemachine.Environment r32, uw.InterfaceC7559c<? super qw.a0> r33) throws com.amplifyframework.auth.exceptions.ServiceException {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43750id;
    }
}
