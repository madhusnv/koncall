package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import jy.InterfaceC3888y;
import jy.n0;
import jy.p0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import pb.AbstractC5870b;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyOutputsDataImpl$Analytics$$serializer implements InterfaceC3888y {
    public static final AmplifyOutputsDataImpl$Analytics$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyOutputsDataImpl$Analytics$$serializer amplifyOutputsDataImpl$Analytics$$serializer = new AmplifyOutputsDataImpl$Analytics$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Analytics$$serializer;
        p0 p0Var = new p0("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Analytics", amplifyOutputsDataImpl$Analytics$$serializer, 1);
        p0Var.m8428k("amazonPinpoint", false);
        descriptor = p0Var;
    }

    private AmplifyOutputsDataImpl$Analytics$$serializer() {
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        return new InterfaceC2401a[]{AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Analytics$AmazonPinpoint$$serializer.INSTANCE)};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyOutputsDataImpl.Analytics deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        boolean z6 = true;
        int i10 = 0;
        AmplifyOutputsDataImpl.Analytics.AmazonPinpoint amazonPinpoint = null;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else {
                if (iMo7685o != 0) {
                    throw new UnknownFieldException(iMo7685o);
                }
                amazonPinpoint = (AmplifyOutputsDataImpl.Analytics.AmazonPinpoint) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 0, AmplifyOutputsDataImpl$Analytics$AmazonPinpoint$$serializer.INSTANCE, amazonPinpoint);
                i10 = 1;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyOutputsDataImpl.Analytics(i10, amazonPinpoint, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyOutputsDataImpl.Analytics value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        interfaceC3365bMo7711c.mo7695n(interfaceC3055f, 0, AmplifyOutputsDataImpl$Analytics$AmazonPinpoint$$serializer.INSTANCE, value.getAmazonPinpoint());
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
