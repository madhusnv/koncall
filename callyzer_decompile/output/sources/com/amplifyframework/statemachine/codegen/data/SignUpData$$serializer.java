package com.amplifyframework.statemachine.codegen.data;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.Map;
import jy.InterfaceC3888y;
import jy.a1;
import jy.n0;
import jy.p0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import pb.AbstractC5870b;
import qw.InterfaceC6353c;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class SignUpData$$serializer implements InterfaceC3888y {
    public static final SignUpData$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        SignUpData$$serializer signUpData$$serializer = new SignUpData$$serializer();
        INSTANCE = signUpData$$serializer;
        p0 p0Var = new p0("com.amplifyframework.statemachine.codegen.data.SignUpData", signUpData$$serializer, 5);
        p0Var.m8428k("username", false);
        p0Var.m8428k("validationData", true);
        p0Var.m8428k("clientMetadata", true);
        p0Var.m8428k("session", true);
        p0Var.m8428k("userId", true);
        descriptor = p0Var;
    }

    private SignUpData$$serializer() {
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        InterfaceC6357g[] interfaceC6357gArr = SignUpData.$childSerializers;
        a1 a1Var = a1.f19869a;
        return new InterfaceC2401a[]{a1Var, AbstractC5870b.m11498a((InterfaceC2401a) interfaceC6357gArr[1].getValue()), AbstractC5870b.m11498a((InterfaceC2401a) interfaceC6357gArr[2].getValue()), AbstractC5870b.m11498a(a1Var), AbstractC5870b.m11498a(a1Var)};
    }

    @Override // fy.InterfaceC2401a
    public final SignUpData deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        InterfaceC6357g[] interfaceC6357gArr = SignUpData.$childSerializers;
        int i10 = 0;
        String strMo7681d = null;
        Map map = null;
        Map map2 = null;
        String str = null;
        String str2 = null;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 0);
                i10 |= 1;
            } else if (iMo7685o == 1) {
                map = (Map) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 1, (InterfaceC2401a) interfaceC6357gArr[1].getValue(), map);
                i10 |= 2;
            } else if (iMo7685o == 2) {
                map2 = (Map) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 2, (InterfaceC2401a) interfaceC6357gArr[2].getValue(), map2);
                i10 |= 4;
            } else if (iMo7685o == 3) {
                str = (String) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 3, a1.f19869a, str);
                i10 |= 8;
            } else {
                if (iMo7685o != 4) {
                    throw new UnknownFieldException(iMo7685o);
                }
                str2 = (String) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 4, a1.f19869a, str2);
                i10 |= 16;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new SignUpData(i10, strMo7681d, map, map2, str, str2, (w0) null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, SignUpData value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        SignUpData.write$Self$aws_auth_cognito_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
