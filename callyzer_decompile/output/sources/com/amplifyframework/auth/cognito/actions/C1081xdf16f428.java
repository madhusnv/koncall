package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1 */
/* loaded from: classes.dex */
public final class C1081xdf16f428 implements Action {
    final /* synthetic */ LoginsMapProvider $loginsMap$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43740id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1", m15344f = "FetchAuthSessionCognitoActions.kt", m15345l = {74}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1081xdf16f428.this.execute(null, null, this);
        }
    }

    public C1081xdf16f428(String str, LoginsMapProvider loginsMapProvider) {
        this.$loginsMap$inlined = loginsMapProvider;
        this.f43740id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3 A[Catch: Exception -> 0x00bb, NotAuthorizedException -> 0x00bd, TryCatch #3 {NotAuthorizedException -> 0x00bd, Exception -> 0x00bb, blocks: (B:26:0x00b8, B:33:0x00c3, B:35:0x00c7, B:36:0x00d4, B:37:0x00db, B:21:0x007c, B:23:0x009a), top: B:44:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r13, com.amplifyframework.statemachine.Environment r14, uw.InterfaceC7559c<? super qw.a0> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1081xdf16f428.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43740id;
    }
}
