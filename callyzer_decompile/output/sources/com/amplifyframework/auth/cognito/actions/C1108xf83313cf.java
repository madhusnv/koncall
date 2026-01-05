package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import java.util.List;
import java.util.Map;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 */
/* loaded from: classes.dex */
public final class C1108xf83313cf implements Action {
    final /* synthetic */ String $answer$inlined;
    final /* synthetic */ List $attributes$inlined;
    final /* synthetic */ AuthChallenge $challenge$inlined;
    final /* synthetic */ Map $metadata$inlined;
    final /* synthetic */ SignInMethod $signInMethod$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43754id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1", m15344f = "SignInChallengeCognitoActions.kt", m15345l = {111, 114, 140}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return C1108xf83313cf.this.execute(null, null, this);
        }
    }

    public C1108xf83313cf(String str, AuthChallenge authChallenge, String str2, SignInMethod signInMethod, List list, Map map) {
        this.$challenge$inlined = authChallenge;
        this.$answer$inlined = str2;
        this.$signInMethod$inlined = signInMethod;
        this.$attributes$inlined = list;
        this.$metadata$inlined = map;
        this.f43754id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(7:13|106|107|108|110|111|112)(2:14|15))(7:16|118|17|87|(5:90|(1:92)(1:93)|94|(1:96)|110)(0)|111|112))(3:23|113|24))(4:28|115|29|(5:31|(1:33)(1:34)|35|111|112)(14:38|(1:43)|44|(1:46)|47|(2:50|48)|120|51|(1:53)(1:54)|55|(1:57)(1:58)|59|(1:61)|(3:63|(1:66)|104)(4:69|116|70|(8:72|(1:74)(1:77)|78|(1:80)|(1:82)|83|(5:86|87|(0)(0)|111|112)|104)(4:88|(0)(0)|111|112))))|67|68|116|70|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0256, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0242 A[Catch: Exception -> 0x0256, TryCatch #2 {Exception -> 0x0256, blocks: (B:70:0x0234, B:72:0x0242, B:74:0x0251, B:78:0x025a, B:80:0x0274, B:82:0x027e, B:83:0x0286), top: B:116:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c6 A[Catch: Exception -> 0x00a5, TryCatch #3 {Exception -> 0x00a5, blocks: (B:17:0x00a0, B:87:0x02bf, B:90:0x02c6, B:94:0x02cf, B:96:0x02f1), top: B:118:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f1 A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a5, blocks: (B:17:0x00a0, B:87:0x02bf, B:90:0x02c6, B:94:0x02cf, B:96:0x02f1), top: B:118:0x00a0 }] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.Map] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r32, com.amplifyframework.statemachine.Environment r33, uw.InterfaceC7559c<? super qw.a0> r34) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.C1108xf83313cf.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43754id;
    }
}
