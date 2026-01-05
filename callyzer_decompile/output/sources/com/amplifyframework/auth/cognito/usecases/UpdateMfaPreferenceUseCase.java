package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.MFAPreference;
import com.amplifyframework.auth.cognito.UserMFAPreference;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UpdateMfaPreferenceUseCase {
    private final InterfaceC0086d client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final FetchMfaPreferenceUseCase fetchMfaPreference;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.UpdateMfaPreferenceUseCase", m15344f = "UpdateMfaPreferenceUseCase.kt", m15345l = {42, 43, 51, 93}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.UpdateMfaPreferenceUseCase$execute$1 */
    public static final class C11731 extends AbstractC8193c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C11731(InterfaceC7559c<? super C11731> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdateMfaPreferenceUseCase.this.execute(null, null, null, this);
        }
    }

    public UpdateMfaPreferenceUseCase(InterfaceC0086d client, FetchAuthSessionUseCase fetchAuthSession, FetchMfaPreferenceUseCase fetchMfaPreference, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(fetchMfaPreference, "fetchMfaPreference");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.client = client;
        this.fetchAuthSession = fetchAuthSession;
        this.fetchMfaPreference = fetchMfaPreference;
        this.stateMachine = stateMachine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreferred(MFAType mFAType, MFAPreference mFAPreference, boolean z6, UserMFAPreference userMFAPreference) {
        Boolean mfaPreferred$aws_auth_cognito_release = mFAPreference.getMfaPreferred$aws_auth_cognito_release();
        return mfaPreferred$aws_auth_cognito_release != null ? mfaPreferred$aws_auth_cognito_release.booleanValue() : z6 && userMFAPreference.getPreferred() == mFAType && mFAPreference.getMfaEnabled$aws_auth_cognito_release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0282, code lost:
    
        if (og.kf.m10740e(r11, r10.f332c, r2, r5) != r6) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(com.amplifyframework.auth.cognito.MFAPreference r20, com.amplifyframework.auth.cognito.MFAPreference r21, com.amplifyframework.auth.cognito.MFAPreference r22, uw.InterfaceC7559c<? super qw.a0> r23) throws com.amplifyframework.auth.cognito.exceptions.service.InvalidParameterException, com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.UpdateMfaPreferenceUseCase.execute(com.amplifyframework.auth.cognito.MFAPreference, com.amplifyframework.auth.cognito.MFAPreference, com.amplifyframework.auth.cognito.MFAPreference, uw.c):java.lang.Object");
    }
}
