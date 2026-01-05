package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import jy.InterfaceC3888y;
import jy.a1;
import jy.n0;
import jy.p0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyCredential$IdentityPoolFederated$$serializer implements InterfaceC3888y {
    public static final AmplifyCredential$IdentityPoolFederated$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyCredential$IdentityPoolFederated$$serializer amplifyCredential$IdentityPoolFederated$$serializer = new AmplifyCredential$IdentityPoolFederated$$serializer();
        INSTANCE = amplifyCredential$IdentityPoolFederated$$serializer;
        p0 p0Var = new p0("identityPoolFederated", amplifyCredential$IdentityPoolFederated$$serializer, 3);
        p0Var.m8428k("federatedToken", false);
        p0Var.m8428k("identityId", false);
        p0Var.m8428k("credentials", false);
        descriptor = p0Var;
    }

    private AmplifyCredential$IdentityPoolFederated$$serializer() {
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        return new InterfaceC2401a[]{FederatedToken$$serializer.INSTANCE, a1.f19869a, AWSCredentials$$serializer.INSTANCE};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyCredential.IdentityPoolFederated deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        int i10 = 0;
        FederatedToken federatedToken = null;
        String strMo7681d = null;
        AWSCredentials aWSCredentials = null;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                federatedToken = (FederatedToken) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 0, FederatedToken$$serializer.INSTANCE, federatedToken);
                i10 |= 1;
            } else if (iMo7685o == 1) {
                strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 1);
                i10 |= 2;
            } else {
                if (iMo7685o != 2) {
                    throw new UnknownFieldException(iMo7685o);
                }
                aWSCredentials = (AWSCredentials) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 2, AWSCredentials$$serializer.INSTANCE, aWSCredentials);
                i10 |= 4;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyCredential.IdentityPoolFederated(i10, federatedToken, strMo7681d, aWSCredentials, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyCredential.IdentityPoolFederated value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        AmplifyCredential.IdentityPoolFederated.write$Self$aws_auth_cognito_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
