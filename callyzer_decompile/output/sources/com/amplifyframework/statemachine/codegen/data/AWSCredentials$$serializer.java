package com.amplifyframework.statemachine.codegen.data;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import jy.InterfaceC3888y;
import jy.a1;
import jy.j0;
import jy.n0;
import jy.p0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import pb.AbstractC5870b;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AWSCredentials$$serializer implements InterfaceC3888y {
    public static final AWSCredentials$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AWSCredentials$$serializer aWSCredentials$$serializer = new AWSCredentials$$serializer();
        INSTANCE = aWSCredentials$$serializer;
        p0 p0Var = new p0("com.amplifyframework.statemachine.codegen.data.AWSCredentials", aWSCredentials$$serializer, 4);
        p0Var.m8428k("accessKeyId", false);
        p0Var.m8428k("secretAccessKey", false);
        p0Var.m8428k("sessionToken", false);
        p0Var.m8428k("expiration", false);
        descriptor = p0Var;
    }

    private AWSCredentials$$serializer() {
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        a1 a1Var = a1.f19869a;
        return new InterfaceC2401a[]{AbstractC5870b.m11498a(a1Var), AbstractC5870b.m11498a(a1Var), AbstractC5870b.m11498a(a1Var), AbstractC5870b.m11498a(j0.f19910a)};
    }

    @Override // fy.InterfaceC2401a
    public final AWSCredentials deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l9 = null;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                str = (String) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 0, a1.f19869a, str);
                i10 |= 1;
            } else if (iMo7685o == 1) {
                str2 = (String) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 1, a1.f19869a, str2);
                i10 |= 2;
            } else if (iMo7685o == 2) {
                str3 = (String) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 2, a1.f19869a, str3);
                i10 |= 4;
            } else {
                if (iMo7685o != 3) {
                    throw new UnknownFieldException(iMo7685o);
                }
                l9 = (Long) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 3, j0.f19910a, l9);
                i10 |= 8;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AWSCredentials(i10, str, str2, str3, l9, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AWSCredentials value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        AWSCredentials.write$Self$aws_auth_cognito_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
