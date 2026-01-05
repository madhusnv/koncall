package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import p001o.sq8;
import p001o.sz0;
import p001o.szb;

/* loaded from: classes5.dex */
public final class AuthFlowTypeHelperKt {

    public /* synthetic */ class WhenMappings {
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

    public static final sz0 toCognitoType(AuthFlowType authFlowType) {
        sq8.m48649h(authFlowType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[authFlowType.ordinal()]) {
            case 1:
                return sz0.C16943i.f46143c;
            case 2:
                return sz0.C16938d.f46133c;
            case 3:
                return sz0.C16938d.f46133c;
            case 4:
                return sz0.C16938d.f46133c;
            case 5:
                return sz0.C16942h.f46141c;
            case 6:
                return sz0.C16941g.f46139c;
            default:
                throw new szb();
        }
    }

    public static final SignInMethod.ApiBased toSignInMethod(AuthFlowType authFlowType) {
        sq8.m48649h(authFlowType, "<this>");
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
                throw new szb();
        }
    }
}
