package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import eb.AbstractC1991o;
import eb.C1986j;
import eb.C1988l;
import eb.C1989m;
import eb.C1990n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthFlowTypeHelperKt {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthFlowType.values().length];
            try {
                iArr[AuthFlowType.USER_SRP_AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthFlowType.CUSTOM_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthFlowType.CUSTOM_AUTH_WITH_SRP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AuthFlowType.CUSTOM_AUTH_WITHOUT_SRP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AuthFlowType.USER_PASSWORD_AUTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AuthFlowType.USER_AUTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AbstractC1991o toCognitoType(AuthFlowType authFlowType) {
        AbstractC4154l.m8923f(authFlowType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[authFlowType.ordinal()]) {
            case 1:
                return C1990n.f9377a;
            case 2:
                return C1986j.f9340a;
            case 3:
                return C1986j.f9340a;
            case 4:
                return C1986j.f9340a;
            case 5:
                return C1989m.f9363a;
            case 6:
                return C1988l.f9354a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final SignInMethod.ApiBased toSignInMethod(AuthFlowType authFlowType) {
        AbstractC4154l.m8923f(authFlowType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[authFlowType.ordinal()]) {
            case 1:
                return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH);
            case 2:
                return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.CUSTOM_AUTH);
            case 3:
                return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.CUSTOM_AUTH);
            case 4:
                return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.CUSTOM_AUTH);
            case 5:
                return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_PASSWORD_AUTH);
            case 6:
                return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
