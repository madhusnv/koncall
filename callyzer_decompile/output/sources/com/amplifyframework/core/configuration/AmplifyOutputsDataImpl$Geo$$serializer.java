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
import pb.AbstractC5870b;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyOutputsDataImpl$Geo$$serializer implements InterfaceC3888y {
    public static final AmplifyOutputsDataImpl$Geo$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyOutputsDataImpl$Geo$$serializer amplifyOutputsDataImpl$Geo$$serializer = new AmplifyOutputsDataImpl$Geo$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Geo$$serializer;
        p0 p0Var = new p0("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Geo", amplifyOutputsDataImpl$Geo$$serializer, 4);
        p0Var.m8428k("awsRegion", false);
        p0Var.m8428k("maps", false);
        p0Var.m8428k("searchIndices", false);
        p0Var.m8428k("geofenceCollections", false);
        descriptor = p0Var;
    }

    private AmplifyOutputsDataImpl$Geo$$serializer() {
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        return new InterfaceC2401a[]{a1.f19869a, AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE), AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE), AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE)};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyOutputsDataImpl.Geo deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        int i10 = 0;
        String strMo7681d = null;
        AmplifyOutputsDataImpl.Geo.Maps maps = null;
        AmplifyOutputsDataImpl.Geo.SearchIndices searchIndices = null;
        AmplifyOutputsDataImpl.Geo.GeofenceCollections geofenceCollections = null;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 0);
                i10 |= 1;
            } else if (iMo7685o == 1) {
                maps = (AmplifyOutputsDataImpl.Geo.Maps) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 1, AmplifyOutputsDataImpl$Geo$Maps$$serializer.INSTANCE, maps);
                i10 |= 2;
            } else if (iMo7685o == 2) {
                searchIndices = (AmplifyOutputsDataImpl.Geo.SearchIndices) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 2, AmplifyOutputsDataImpl$Geo$SearchIndices$$serializer.INSTANCE, searchIndices);
                i10 |= 4;
            } else {
                if (iMo7685o != 3) {
                    throw new UnknownFieldException(iMo7685o);
                }
                geofenceCollections = (AmplifyOutputsDataImpl.Geo.GeofenceCollections) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 3, AmplifyOutputsDataImpl$Geo$GeofenceCollections$$serializer.INSTANCE, geofenceCollections);
                i10 |= 8;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyOutputsDataImpl.Geo(i10, strMo7681d, maps, searchIndices, geofenceCollections, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyOutputsDataImpl.Geo value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        AmplifyOutputsDataImpl.Geo.write$Self$core_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
