package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 */
/* loaded from: classes.dex */
public final class C1116xc349ee6d implements Action {
    final /* synthetic */ CustomSignInEvent.EventType.InitiateCustomSignIn $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43766id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1", m15344f = "SignInCustomCognitoActions.kt", m15345l = {78, 79, 84}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return C1116xc349ee6d.this.execute(null, null, this);
        }
    }

    public C1116xc349ee6d(String str, CustomSignInEvent.EventType.InitiateCustomSignIn initiateCustomSignIn) {
        this.$event$inlined = initiateCustomSignIn;
        this.f43766id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ae A[Catch: Exception -> 0x01b8, TryCatch #5 {Exception -> 0x01b8, blocks: (B:57:0x01aa, B:59:0x01ae, B:62:0x01bb, B:64:0x01c9, B:66:0x01dc, B:68:0x01e2, B:70:0x01f0, B:72:0x01fa, B:73:0x0202), top: B:116:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9 A[Catch: Exception -> 0x01b8, TryCatch #5 {Exception -> 0x01b8, blocks: (B:57:0x01aa, B:59:0x01ae, B:62:0x01bb, B:64:0x01c9, B:66:0x01dc, B:68:0x01e2, B:70:0x01f0, B:72:0x01fa, B:73:0x0202), top: B:116:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0241 A[Catch: Exception -> 0x0239, TryCatch #4 {Exception -> 0x0239, blocks: (B:77:0x0236, B:82:0x0241, B:84:0x0245, B:86:0x024d, B:88:0x0251, B:90:0x025b, B:93:0x0265, B:95:0x026f, B:96:0x029b, B:97:0x02aa), top: B:115:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024d A[Catch: Exception -> 0x0239, TryCatch #4 {Exception -> 0x0239, blocks: (B:77:0x0236, B:82:0x0241, B:84:0x0245, B:86:0x024d, B:88:0x0251, B:90:0x025b, B:93:0x0265, B:95:0x026f, B:96:0x029b, B:97:0x02aa), top: B:115:0x0236 }] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.Map] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r29, com.amplifyframework.statemachine.Environment r30, uw.InterfaceC7559c<? super qw.a0> r31) throws com.amplifyframework.auth.exceptions.ServiceException {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1116xc349ee6d.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43766id;
    }
}
