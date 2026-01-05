package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignOutEvent.EventType.SignOutGlobally $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43768id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1", m15344f = "SignOutCognitoActions.kt", m15345l = {JPAKEParticipant.STATE_ROUND_3_VALIDATED}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1$1 */
    public static final class C11201 extends AbstractC8193c {
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

        public C11201(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1(String str, SignOutEvent.EventType.SignOutGlobally signOutGlobally) {
        this.$event$inlined = signOutGlobally;
        this.f43768id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r17, com.amplifyframework.statemachine.Environment r18, uw.InterfaceC7559c<? super qw.a0> r19) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43768id;
    }
}
