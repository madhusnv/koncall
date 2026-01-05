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
import qw.InterfaceC6353c;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyOutputsDataImpl$Auth$Oauth$$serializer implements InterfaceC3888y {
    public static final AmplifyOutputsDataImpl$Auth$Oauth$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyOutputsDataImpl$Auth$Oauth$$serializer amplifyOutputsDataImpl$Auth$Oauth$$serializer = new AmplifyOutputsDataImpl$Auth$Oauth$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Auth$Oauth$$serializer;
        p0 p0Var = new p0("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Auth.Oauth", amplifyOutputsDataImpl$Auth$Oauth$$serializer, 6);
        p0Var.m8428k("identityProviders", false);
        p0Var.m8428k("domain", false);
        p0Var.m8428k("scopes", false);
        p0Var.m8428k("redirectSignInUri", false);
        p0Var.m8428k("redirectSignOutUri", false);
        p0Var.m8428k("responseType", false);
        descriptor = p0Var;
    }

    private AmplifyOutputsDataImpl$Auth$Oauth$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        InterfaceC6357g[] interfaceC6357gArr = AmplifyOutputsDataImpl.Auth.Oauth.$childSerializers;
        return new InterfaceC2401a[]{interfaceC6357gArr[0].getValue(), a1.f19869a, interfaceC6357gArr[2].getValue(), interfaceC6357gArr[3].getValue(), interfaceC6357gArr[4].getValue(), interfaceC6357gArr[5].getValue()};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyOutputsDataImpl.Auth.Oauth deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        InterfaceC6357g[] interfaceC6357gArr = AmplifyOutputsDataImpl.Auth.Oauth.$childSerializers;
        int i10 = 0;
        List list = null;
        String strMo7681d = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        AmplifyOutputsData.Auth.Oauth.ResponseType responseType = null;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            switch (iMo7685o) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    list = (List) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 0, (InterfaceC2401a) interfaceC6357gArr[0].getValue(), list);
                    i10 |= 1;
                    break;
                case 1:
                    strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 1);
                    i10 |= 2;
                    break;
                case 2:
                    list2 = (List) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 2, (InterfaceC2401a) interfaceC6357gArr[2].getValue(), list2);
                    i10 |= 4;
                    break;
                case 3:
                    list3 = (List) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 3, (InterfaceC2401a) interfaceC6357gArr[3].getValue(), list3);
                    i10 |= 8;
                    break;
                case 4:
                    list4 = (List) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 4, (InterfaceC2401a) interfaceC6357gArr[4].getValue(), list4);
                    i10 |= 16;
                    break;
                case 5:
                    responseType = (AmplifyOutputsData.Auth.Oauth.ResponseType) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 5, (InterfaceC2401a) interfaceC6357gArr[5].getValue(), responseType);
                    i10 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo7685o);
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyOutputsDataImpl.Auth.Oauth(i10, list, strMo7681d, list2, list3, list4, responseType, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyOutputsDataImpl.Auth.Oauth value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        AmplifyOutputsDataImpl.Auth.Oauth.write$Self$core_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
