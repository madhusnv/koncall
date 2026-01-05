package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.serializer.DateSerializer;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.Date;
import jy.InterfaceC3888y;
import jy.a1;
import jy.n0;
import jy.p0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import qw.InterfaceC6353c;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class SignedInData$$serializer implements InterfaceC3888y {
    public static final SignedInData$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        SignedInData$$serializer signedInData$$serializer = new SignedInData$$serializer();
        INSTANCE = signedInData$$serializer;
        p0 p0Var = new p0("com.amplifyframework.statemachine.codegen.data.SignedInData", signedInData$$serializer, 5);
        p0Var.m8428k("userId", false);
        p0Var.m8428k("username", false);
        p0Var.m8428k("signedInDate", false);
        p0Var.m8428k("signInMethod", false);
        p0Var.m8428k("cognitoUserPoolTokens", false);
        descriptor = p0Var;
    }

    private SignedInData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        InterfaceC6357g[] interfaceC6357gArr = SignedInData.$childSerializers;
        a1 a1Var = a1.f19869a;
        return new InterfaceC2401a[]{a1Var, a1Var, DateSerializer.INSTANCE, interfaceC6357gArr[3].getValue(), CognitoUserPoolTokens$$serializer.INSTANCE};
    }

    @Override // fy.InterfaceC2401a
    public final SignedInData deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        InterfaceC6357g[] interfaceC6357gArr = SignedInData.$childSerializers;
        int i10 = 0;
        String strMo7681d = null;
        String strMo7681d2 = null;
        Date date = null;
        SignInMethod signInMethod = null;
        CognitoUserPoolTokens cognitoUserPoolTokens = null;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 0);
                i10 |= 1;
            } else if (iMo7685o == 1) {
                strMo7681d2 = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 1);
                i10 |= 2;
            } else if (iMo7685o == 2) {
                date = (Date) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 2, DateSerializer.INSTANCE, date);
                i10 |= 4;
            } else if (iMo7685o == 3) {
                signInMethod = (SignInMethod) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 3, (InterfaceC2401a) interfaceC6357gArr[3].getValue(), signInMethod);
                i10 |= 8;
            } else {
                if (iMo7685o != 4) {
                    throw new UnknownFieldException(iMo7685o);
                }
                cognitoUserPoolTokens = (CognitoUserPoolTokens) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 4, CognitoUserPoolTokens$$serializer.INSTANCE, cognitoUserPoolTokens);
                i10 |= 16;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new SignedInData(i10, strMo7681d, strMo7681d2, date, signInMethod, cognitoUserPoolTokens, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, SignedInData value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        SignedInData.write$Self$aws_auth_cognito_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
