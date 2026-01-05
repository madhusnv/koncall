package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
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
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import qw.InterfaceC6353c;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyOutputsDataImpl$Geo$Maps$$serializer implements InterfaceC3888y {
    public static final AmplifyOutputsDataImpl$Geo$Maps$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyOutputsDataImpl$Geo$Maps$$serializer amplifyOutputsDataImpl$Geo$Maps$$serializer = new AmplifyOutputsDataImpl$Geo$Maps$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Geo$Maps$$serializer;
        p0 p0Var = new p0("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Geo.Maps", amplifyOutputsDataImpl$Geo$Maps$$serializer, 2);
        p0Var.m8428k("items", false);
        p0Var.m8428k("default", false);
        descriptor = p0Var;
    }

    private AmplifyOutputsDataImpl$Geo$Maps$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        return new InterfaceC2401a[]{AmplifyOutputsDataImpl.Geo.Maps.$childSerializers[0].getValue(), a1.f19869a};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyOutputsDataImpl.Geo.Maps deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        InterfaceC6357g[] interfaceC6357gArr = AmplifyOutputsDataImpl.Geo.Maps.$childSerializers;
        boolean z6 = true;
        int i10 = 0;
        Map map = null;
        String strMo7681d = null;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                map = (Map) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 0, (InterfaceC2401a) interfaceC6357gArr[0].getValue(), map);
                i10 |= 1;
            } else {
                if (iMo7685o != 1) {
                    throw new UnknownFieldException(iMo7685o);
                }
                strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 1);
                i10 |= 2;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyOutputsDataImpl.Geo.Maps(i10, map, strMo7681d, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyOutputsDataImpl.Geo.Maps value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        AmplifyOutputsDataImpl.Geo.Maps.write$Self$core_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
