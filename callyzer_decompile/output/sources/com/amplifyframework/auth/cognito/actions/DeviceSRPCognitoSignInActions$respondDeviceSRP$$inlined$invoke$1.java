package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 implements Action {
    final /* synthetic */ DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43738id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1", m15344f = "DeviceSRPCognitoSignInActions.kt", m15345l = {JPAKEParticipant.STATE_ROUND_3_VALIDATED, 71, 90, 121}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1$1 */
    public static final class C10731 extends AbstractC8193c {
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

        public C10731(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1(String str, DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge respondDeviceSRPChallenge) {
        this.$event$inlined = respondDeviceSRPChallenge;
        this.f43738id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(6:(1:(1:(5:14|105|106|107|108)(2:15|16))(7:17|114|18|19|113|82|(4:(1:85)|88|107|108)(2:89|90)))(18:22|117|23|24|25|44|45|(1:54)(1:50)|55|(1:60)|61|(1:63)(1:64)|65|(1:67)(1:68)|69|(1:71)|72|(8:74|75|121|76|77|78|(4:81|113|82|(0)(0))|103)(2:93|94))|99|(3:101|(2:104|105)|103)|106|107|108)(4:28|111|29|30))(8:34|119|35|36|109|37|(1:40)|103)|116|41|(1:43)(6:25|44|45|(13:47|49|54|55|(2:57|60)|61|(0)(0)|65|(0)(0)|69|(0)|72|(0)(0))(0)|107|108)|103|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0199, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dd A[Catch: Exception -> 0x0199, TryCatch #4 {Exception -> 0x0199, blocks: (B:44:0x0182, B:47:0x018f, B:55:0x019e, B:57:0x01ad, B:61:0x01b5, B:63:0x01dd, B:65:0x01e3, B:67:0x01ed, B:69:0x01f3, B:71:0x01f9, B:72:0x01fe, B:74:0x0208, B:78:0x0219, B:93:0x02a7, B:94:0x02ac, B:41:0x0160), top: B:116:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed A[Catch: Exception -> 0x0199, TryCatch #4 {Exception -> 0x0199, blocks: (B:44:0x0182, B:47:0x018f, B:55:0x019e, B:57:0x01ad, B:61:0x01b5, B:63:0x01dd, B:65:0x01e3, B:67:0x01ed, B:69:0x01f3, B:71:0x01f9, B:72:0x01fe, B:74:0x0208, B:78:0x0219, B:93:0x02a7, B:94:0x02ac, B:41:0x0160), top: B:116:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f9 A[Catch: Exception -> 0x0199, TryCatch #4 {Exception -> 0x0199, blocks: (B:44:0x0182, B:47:0x018f, B:55:0x019e, B:57:0x01ad, B:61:0x01b5, B:63:0x01dd, B:65:0x01e3, B:67:0x01ed, B:69:0x01f3, B:71:0x01f9, B:72:0x01fe, B:74:0x0208, B:78:0x0219, B:93:0x02a7, B:94:0x02ac, B:41:0x0160), top: B:116:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0208 A[Catch: Exception -> 0x0199, TRY_LEAVE, TryCatch #4 {Exception -> 0x0199, blocks: (B:44:0x0182, B:47:0x018f, B:55:0x019e, B:57:0x01ad, B:61:0x01b5, B:63:0x01dd, B:65:0x01e3, B:67:0x01ed, B:69:0x01f3, B:71:0x01f9, B:72:0x01fe, B:74:0x0208, B:78:0x0219, B:93:0x02a7, B:94:0x02ac, B:41:0x0160), top: B:116:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0292 A[Catch: Exception -> 0x027b, TryCatch #2 {Exception -> 0x027b, blocks: (B:82:0x0256, B:85:0x025e, B:88:0x027e, B:89:0x0292, B:90:0x02a1), top: B:113:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a7 A[Catch: Exception -> 0x0199, TRY_ENTER, TryCatch #4 {Exception -> 0x0199, blocks: (B:44:0x0182, B:47:0x018f, B:55:0x019e, B:57:0x01ad, B:61:0x01b5, B:63:0x01dd, B:65:0x01e3, B:67:0x01ed, B:69:0x01f3, B:71:0x01f9, B:72:0x01fe, B:74:0x0208, B:78:0x0219, B:93:0x02a7, B:94:0x02ac, B:41:0x0160), top: B:116:0x0160 }] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r24, com.amplifyframework.statemachine.Environment r25, uw.InterfaceC7559c<? super qw.a0> r26) throws com.amplifyframework.auth.exceptions.ServiceException, com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43738id;
    }
}
