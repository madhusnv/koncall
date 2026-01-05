package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import jy.C3869f;
import jy.InterfaceC3888y;
import jy.d0;
import jy.n0;
import jy.p0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import pb.AbstractC5870b;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer implements InterfaceC3888y {
    public static final AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer amplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer = new AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer;
        p0 p0Var = new p0("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Auth.PasswordPolicy", amplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer, 5);
        p0Var.m8428k("minLength", false);
        p0Var.m8428k("requireNumbers", false);
        p0Var.m8428k("requireLowercase", false);
        p0Var.m8428k("requireUppercase", false);
        p0Var.m8428k("requireSymbols", false);
        descriptor = p0Var;
    }

    private AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer() {
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        InterfaceC2401a interfaceC2401aM11498a = AbstractC5870b.m11498a(d0.f19882a);
        C3869f c3869f = C3869f.f19891a;
        return new InterfaceC2401a[]{interfaceC2401aM11498a, AbstractC5870b.m11498a(c3869f), AbstractC5870b.m11498a(c3869f), AbstractC5870b.m11498a(c3869f), AbstractC5870b.m11498a(c3869f)};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyOutputsDataImpl.Auth.PasswordPolicy deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        int i10 = 0;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                num = (Integer) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 0, d0.f19882a, num);
                i10 |= 1;
            } else if (iMo7685o == 1) {
                bool = (Boolean) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 1, C3869f.f19891a, bool);
                i10 |= 2;
            } else if (iMo7685o == 2) {
                bool2 = (Boolean) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 2, C3869f.f19891a, bool2);
                i10 |= 4;
            } else if (iMo7685o == 3) {
                bool3 = (Boolean) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 3, C3869f.f19891a, bool3);
                i10 |= 8;
            } else {
                if (iMo7685o != 4) {
                    throw new UnknownFieldException(iMo7685o);
                }
                bool4 = (Boolean) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 4, C3869f.f19891a, bool4);
                i10 |= 16;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyOutputsDataImpl.Auth.PasswordPolicy(i10, num, bool, bool2, bool3, bool4, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyOutputsDataImpl.Auth.PasswordPolicy value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        AmplifyOutputsDataImpl.Auth.PasswordPolicy.write$Self$core_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
