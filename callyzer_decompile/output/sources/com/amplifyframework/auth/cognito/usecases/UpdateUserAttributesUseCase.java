package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.cognito.util.CognitoExtensionsKt;
import com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.result.AuthUpdateAttributeResult;
import com.amplifyframework.auth.result.step.AuthNextUpdateAttributeStep;
import com.amplifyframework.auth.result.step.AuthUpdateAttributeStep;
import eb.j3;
import eb.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import sw.C6962f;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UpdateUserAttributesUseCase {
    private final InterfaceC0086d client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase", m15344f = "UpdateUserAttributesUseCase.kt", m15345l = {56}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase$execute$2 */
    public static final class C11752 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11752(InterfaceC7559c<? super C11752> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdateUserAttributesUseCase.this.execute((AuthUserAttribute) null, (AuthUpdateUserAttributeOptions) null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase", m15344f = "UpdateUserAttributesUseCase.kt", m15345l = {64, 66, 114}, m15346m = "updateAttributes")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase$updateAttributes$1 */
    public static final class C11761 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11761(InterfaceC7559c<? super C11761> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdateUserAttributesUseCase.this.updateAttributes(null, null, this);
        }
    }

    public UpdateUserAttributesUseCase(InterfaceC0086d client, FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.client = client;
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
    }

    public static /* synthetic */ Object execute$default(UpdateUserAttributesUseCase updateUserAttributesUseCase, List list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            authUpdateUserAttributesOptions = AuthUpdateUserAttributesOptions.defaults();
            AbstractC4154l.m8922e(authUpdateUserAttributesOptions, "defaults(...)");
        }
        return updateUserAttributesUseCase.execute((List<AuthUserAttribute>) list, authUpdateUserAttributesOptions, (InterfaceC7559c<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>>) interfaceC7559c);
    }

    private final Map<AuthUserAttributeKey, AuthUpdateAttributeResult> mapResults(j3 j3Var, List<AuthUserAttribute> list) {
        C6962f c6962f = new C6962f();
        ArrayList arrayList = j3Var.f9347a;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                l0 l0Var = (l0) obj;
                String str = l0Var.f9355a;
                if (str != null) {
                    AuthUserAttributeKey authUserAttributeKeyCustom = AuthUserAttributeKey.custom(str);
                    AuthUpdateAttributeResult authUpdateAttributeResult = new AuthUpdateAttributeResult(false, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.CONFIRM_ATTRIBUTE_WITH_CODE, new HashMap(), CognitoExtensionsKt.toAuthCodeDeliveryDetails(l0Var)));
                    AbstractC4154l.m8920c(authUserAttributeKeyCustom);
                    c6962f.put(authUserAttributeKeyCustom, authUpdateAttributeResult);
                }
            }
        }
        AuthUpdateAttributeResult authUpdateAttributeResult2 = new AuthUpdateAttributeResult(true, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.DONE, new HashMap(), null));
        for (AuthUserAttribute authUserAttribute : list) {
            if (!c6962f.containsKey(authUserAttribute.getKey())) {
                AuthUserAttributeKey key = authUserAttribute.getKey();
                AbstractC4154l.m8922e(key, "getKey(...)");
                c6962f.put(key, authUpdateAttributeResult2);
            }
        }
        return c6962f.m13230d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6 A[LOOP:0: B:25:0x00b0->B:27:0x00b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAttributes(java.util.List<com.amplifyframework.auth.AuthUserAttribute> r17, java.util.Map<java.lang.String, java.lang.String> r18, uw.InterfaceC7559c<? super java.util.Map<com.amplifyframework.auth.AuthUserAttributeKey, com.amplifyframework.auth.result.AuthUpdateAttributeResult>> r19) throws com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase.updateAttributes(java.util.List, java.util.Map, uw.c):java.lang.Object");
    }

    public final Object execute(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, InterfaceC7559c<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> interfaceC7559c) {
        AWSCognitoAuthUpdateUserAttributesOptions aWSCognitoAuthUpdateUserAttributesOptions = authUpdateUserAttributesOptions instanceof AWSCognitoAuthUpdateUserAttributesOptions ? (AWSCognitoAuthUpdateUserAttributesOptions) authUpdateUserAttributesOptions : null;
        return updateAttributes(list, aWSCognitoAuthUpdateUserAttributesOptions != null ? aWSCognitoAuthUpdateUserAttributesOptions.getMetadata() : null, interfaceC7559c);
    }

    public static /* synthetic */ Object execute$default(UpdateUserAttributesUseCase updateUserAttributesUseCase, AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            authUpdateUserAttributeOptions = AuthUpdateUserAttributeOptions.defaults();
            AbstractC4154l.m8922e(authUpdateUserAttributeOptions, "defaults(...)");
        }
        return updateUserAttributesUseCase.execute(authUserAttribute, authUpdateUserAttributeOptions, (InterfaceC7559c<? super AuthUpdateAttributeResult>) interfaceC7559c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(com.amplifyframework.auth.AuthUserAttribute r5, com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions r6, uw.InterfaceC7559c<? super com.amplifyframework.auth.result.AuthUpdateAttributeResult> r7) throws com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase.C11752
            if (r0 == 0) goto L13
            r0 = r7
            com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase$execute$2 r0 = (com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase.C11752) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase$execute$2 r0 = new com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase$execute$2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$2
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r0.L$1
            com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions r5 = (com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions) r5
            java.lang.Object r5 = r0.L$0
            com.amplifyframework.auth.AuthUserAttribute r5 = (com.amplifyframework.auth.AuthUserAttribute) r5
            og.od.m10798c(r7)
            goto L62
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            og.od.m10798c(r7)
            boolean r7 = r6 instanceof com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributeOptions
            r2 = 0
            if (r7 == 0) goto L46
            com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributeOptions r6 = (com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributeOptions) r6
            goto L47
        L46:
            r6 = r2
        L47:
            if (r6 == 0) goto L4e
            java.util.Map r6 = r6.getMetadata()
            goto L4f
        L4e:
            r6 = r2
        L4f:
            java.util.List r5 = og.pe.m10833h(r5)
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r7 = r4.updateAttributes(r5, r6, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r5 = r7.values()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r5 = rw.AbstractC6663m.m12741E(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase.execute(com.amplifyframework.auth.AuthUserAttribute, com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions, uw.c):java.lang.Object");
    }
}
