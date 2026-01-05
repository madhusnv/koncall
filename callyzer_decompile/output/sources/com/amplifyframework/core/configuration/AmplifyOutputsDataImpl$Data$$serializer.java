package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.List;
import jy.InterfaceC3888y;
import jy.a1;
import jy.n0;
import jy.p0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import pb.AbstractC5870b;
import qw.InterfaceC6353c;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyOutputsDataImpl$Data$$serializer implements InterfaceC3888y {
    public static final AmplifyOutputsDataImpl$Data$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyOutputsDataImpl$Data$$serializer amplifyOutputsDataImpl$Data$$serializer = new AmplifyOutputsDataImpl$Data$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Data$$serializer;
        p0 p0Var = new p0("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Data", amplifyOutputsDataImpl$Data$$serializer, 5);
        p0Var.m8428k("awsRegion", false);
        p0Var.m8428k("url", false);
        p0Var.m8428k("apiKey", false);
        p0Var.m8428k("defaultAuthorizationType", false);
        p0Var.m8428k("authorizationTypes", false);
        descriptor = p0Var;
    }

    private AmplifyOutputsDataImpl$Data$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        InterfaceC6357g[] interfaceC6357gArr = AmplifyOutputsDataImpl.Data.$childSerializers;
        a1 a1Var = a1.f19869a;
        return new InterfaceC2401a[]{a1Var, a1Var, AbstractC5870b.m11498a(a1Var), interfaceC6357gArr[3].getValue(), interfaceC6357gArr[4].getValue()};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyOutputsDataImpl.Data deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        InterfaceC6357g[] interfaceC6357gArr = AmplifyOutputsDataImpl.Data.$childSerializers;
        int i10 = 0;
        String strMo7681d = null;
        String strMo7681d2 = null;
        String str = null;
        AmplifyOutputsData.AwsAppsyncAuthorizationType awsAppsyncAuthorizationType = null;
        List list = null;
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
                str = (String) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 2, a1.f19869a, str);
                i10 |= 4;
            } else if (iMo7685o == 3) {
                awsAppsyncAuthorizationType = (AmplifyOutputsData.AwsAppsyncAuthorizationType) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 3, (InterfaceC2401a) interfaceC6357gArr[3].getValue(), awsAppsyncAuthorizationType);
                i10 |= 8;
            } else {
                if (iMo7685o != 4) {
                    throw new UnknownFieldException(iMo7685o);
                }
                list = (List) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 4, (InterfaceC2401a) interfaceC6357gArr[4].getValue(), list);
                i10 |= 16;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyOutputsDataImpl.Data(i10, strMo7681d, strMo7681d2, str, awsAppsyncAuthorizationType, list, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyOutputsDataImpl.Data value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        AmplifyOutputsDataImpl.Data.write$Self$core_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
