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
import jy.C3869f;
import jy.InterfaceC3888y;
import jy.a1;
import jy.n0;
import jy.p0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pb.AbstractC5870b;
import qw.InterfaceC6353c;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyOutputsDataImpl$Auth$$serializer implements InterfaceC3888y {
    public static final AmplifyOutputsDataImpl$Auth$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyOutputsDataImpl$Auth$$serializer amplifyOutputsDataImpl$Auth$$serializer = new AmplifyOutputsDataImpl$Auth$$serializer();
        INSTANCE = amplifyOutputsDataImpl$Auth$$serializer;
        p0 p0Var = new p0("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl.Auth", amplifyOutputsDataImpl$Auth$$serializer, 12);
        p0Var.m8428k("awsRegion", false);
        p0Var.m8428k("userPoolId", false);
        p0Var.m8428k("userPoolClientId", false);
        p0Var.m8428k("identityPoolId", false);
        p0Var.m8428k("passwordPolicy", false);
        p0Var.m8428k("oauth", false);
        p0Var.m8428k("standardRequiredAttributes", true);
        p0Var.m8428k("usernameAttributes", true);
        p0Var.m8428k("userVerificationTypes", true);
        p0Var.m8428k("unauthenticatedIdentitiesEnabled", true);
        p0Var.m8428k("mfaConfiguration", false);
        p0Var.m8428k("mfaMethods", true);
        descriptor = p0Var;
    }

    private AmplifyOutputsDataImpl$Auth$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        InterfaceC6357g[] interfaceC6357gArr = AmplifyOutputsDataImpl.Auth.$childSerializers;
        a1 a1Var = a1.f19869a;
        return new InterfaceC2401a[]{a1Var, a1Var, a1Var, AbstractC5870b.m11498a(a1Var), AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE), AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE), interfaceC6357gArr[6].getValue(), interfaceC6357gArr[7].getValue(), interfaceC6357gArr[8].getValue(), C3869f.f19891a, AbstractC5870b.m11498a((InterfaceC2401a) interfaceC6357gArr[10].getValue()), interfaceC6357gArr[11].getValue()};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyOutputsDataImpl.Auth deserialize(InterfaceC3366c decoder) {
        InterfaceC6357g[] interfaceC6357gArr;
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        InterfaceC6357g[] interfaceC6357gArr2 = AmplifyOutputsDataImpl.Auth.$childSerializers;
        List list = null;
        AmplifyOutputsData.Auth.MfaConfiguration mfaConfiguration = null;
        List list2 = null;
        String strMo7681d = null;
        String strMo7681d2 = null;
        String strMo7681d3 = null;
        String str = null;
        AmplifyOutputsDataImpl.Auth.PasswordPolicy passwordPolicy = null;
        AmplifyOutputsDataImpl.Auth.Oauth oauth = null;
        List list3 = null;
        List list4 = null;
        int i10 = 0;
        boolean z6 = true;
        boolean zMo7682h = false;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            switch (iMo7685o) {
                case -1:
                    z6 = false;
                    continue;
                case 0:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 0);
                    i10 |= 1;
                    break;
                case 1:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    strMo7681d2 = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 1);
                    i10 |= 2;
                    break;
                case 2:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    strMo7681d3 = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 2);
                    i10 |= 4;
                    break;
                case 3:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    str = (String) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 3, a1.f19869a, str);
                    i10 |= 8;
                    break;
                case 4:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    passwordPolicy = (AmplifyOutputsDataImpl.Auth.PasswordPolicy) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 4, AmplifyOutputsDataImpl$Auth$PasswordPolicy$$serializer.INSTANCE, passwordPolicy);
                    i10 |= 16;
                    break;
                case 5:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    oauth = (AmplifyOutputsDataImpl.Auth.Oauth) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 5, AmplifyOutputsDataImpl$Auth$Oauth$$serializer.INSTANCE, oauth);
                    i10 |= 32;
                    break;
                case 6:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    list3 = (List) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 6, (InterfaceC2401a) interfaceC6357gArr[6].getValue(), list3);
                    i10 |= 64;
                    break;
                case 7:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    list4 = (List) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 7, (InterfaceC2401a) interfaceC6357gArr[7].getValue(), list4);
                    i10 |= 128;
                    break;
                case 8:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    list = (List) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 8, (InterfaceC2401a) interfaceC6357gArr[8].getValue(), list);
                    i10 |= 256;
                    break;
                case 9:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    zMo7682h = interfaceC3364aMo7699c.mo7682h(interfaceC3055f, 9);
                    i10 |= 512;
                    break;
                case 10:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    mfaConfiguration = (AmplifyOutputsData.Auth.MfaConfiguration) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 10, (InterfaceC2401a) interfaceC6357gArr[10].getValue(), mfaConfiguration);
                    i10 |= 1024;
                    break;
                case 11:
                    interfaceC6357gArr = interfaceC6357gArr2;
                    list2 = (List) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 11, (InterfaceC2401a) interfaceC6357gArr2[11].getValue(), list2);
                    i10 |= NewHope.SENDB_BYTES;
                    break;
                default:
                    throw new UnknownFieldException(iMo7685o);
            }
            interfaceC6357gArr2 = interfaceC6357gArr;
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyOutputsDataImpl.Auth(i10, strMo7681d, strMo7681d2, strMo7681d3, str, passwordPolicy, oauth, list3, list4, list, zMo7682h, mfaConfiguration, list2, (w0) null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyOutputsDataImpl.Auth value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        AmplifyOutputsDataImpl.Auth.write$Self$core_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
