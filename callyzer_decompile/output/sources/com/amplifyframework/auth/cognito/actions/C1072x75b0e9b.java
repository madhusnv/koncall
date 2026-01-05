package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1 */
/* loaded from: classes.dex */
public final class C1072x75b0e9b implements Action {
    final /* synthetic */ DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43737id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1", m15344f = "DeviceSRPCognitoSignInActions.kt", m15345l = {77, 98, 121}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1$1, reason: invalid class name */
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

        public AnonymousClass1(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1072x75b0e9b.this.execute(null, null, this);
        }
    }

    public C1072x75b0e9b(String str, DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier respondDevicePasswordVerifier) {
        this.$event$inlined = respondDevicePasswordVerifier;
        this.f43737id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219 A[Catch: Exception -> 0x0205, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x0205, blocks: (B:51:0x0200, B:58:0x0219, B:63:0x0225), top: B:145:0x0200 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0225 A[Catch: Exception -> 0x0205, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x0205, blocks: (B:51:0x0200, B:58:0x0219, B:63:0x0225), top: B:145:0x0200 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0234 A[Catch: Exception -> 0x02de, TRY_LEAVE, TryCatch #7 {Exception -> 0x02de, blocks: (B:47:0x01d8, B:49:0x01ec, B:56:0x020f, B:61:0x021f, B:64:0x022a, B:66:0x0234), top: B:133:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e2  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r35, com.amplifyframework.statemachine.Environment r36, uw.InterfaceC7559c<? super qw.a0> r37) throws com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1072x75b0e9b.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43737id;
    }
}
