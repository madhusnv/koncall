package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
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
import jy.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import pb.AbstractC5870b;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class DeviceMetadata$Metadata$$serializer implements InterfaceC3888y {
    public static final DeviceMetadata$Metadata$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        DeviceMetadata$Metadata$$serializer deviceMetadata$Metadata$$serializer = new DeviceMetadata$Metadata$$serializer();
        INSTANCE = deviceMetadata$Metadata$$serializer;
        p0 p0Var = new p0("metadata", deviceMetadata$Metadata$$serializer, 3);
        p0Var.m8428k("deviceKey", false);
        p0Var.m8428k("deviceGroupKey", false);
        p0Var.m8428k("deviceSecret", true);
        descriptor = p0Var;
    }

    private DeviceMetadata$Metadata$$serializer() {
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        a1 a1Var = a1.f19869a;
        return new InterfaceC2401a[]{a1Var, a1Var, AbstractC5870b.m11498a(a1Var)};
    }

    @Override // fy.InterfaceC2401a
    public final DeviceMetadata.Metadata deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        int i10 = 0;
        String strMo7681d = null;
        String strMo7681d2 = null;
        String str = null;
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
            } else {
                if (iMo7685o != 2) {
                    throw new UnknownFieldException(iMo7685o);
                }
                str = (String) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 2, a1.f19869a, str);
                i10 |= 4;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new DeviceMetadata.Metadata(i10, strMo7681d, strMo7681d2, str, (w0) null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, DeviceMetadata.Metadata value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        DeviceMetadata.Metadata.write$Self$aws_auth_cognito_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
