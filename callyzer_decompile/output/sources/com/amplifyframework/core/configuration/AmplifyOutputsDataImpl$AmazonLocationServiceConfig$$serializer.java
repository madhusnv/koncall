package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
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
import ly.C4597u;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer implements InterfaceC3888y {
    public static final AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer amplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer = new AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer();
        INSTANCE = amplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer;
        p0 p0Var = new p0("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.AmazonLocationServiceConfig", amplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer, 1);
        p0Var.m8428k("style", false);
        descriptor = p0Var;
    }

    private AmplifyOutputsDataImpl$AmazonLocationServiceConfig$$serializer() {
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        return new InterfaceC2401a[]{a1.f19869a};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyOutputsDataImpl.AmazonLocationServiceConfig deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        boolean z6 = true;
        int i10 = 0;
        String strMo7681d = null;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else {
                if (iMo7685o != 0) {
                    throw new UnknownFieldException(iMo7685o);
                }
                strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 0);
                i10 = 1;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyOutputsDataImpl.AmazonLocationServiceConfig(i10, strMo7681d, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyOutputsDataImpl.AmazonLocationServiceConfig value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        ((C4597u) interfaceC3365bMo7711c).m9444w(interfaceC3055f, 0, value.getStyle());
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
