package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import com.sun.mail.imap.IMAPStore;
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
import ky.C4294z;
import ky.b0;
import pb.AbstractC5870b;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final /* synthetic */ class AmplifyOutputsDataImpl$$serializer implements InterfaceC3888y {
    public static final AmplifyOutputsDataImpl$$serializer INSTANCE;
    private static final InterfaceC3055f descriptor;

    static {
        AmplifyOutputsDataImpl$$serializer amplifyOutputsDataImpl$$serializer = new AmplifyOutputsDataImpl$$serializer();
        INSTANCE = amplifyOutputsDataImpl$$serializer;
        p0 p0Var = new p0("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl", amplifyOutputsDataImpl$$serializer, 8);
        p0Var.m8428k(IMAPStore.ID_VERSION, false);
        p0Var.m8428k("analytics", false);
        p0Var.m8428k("auth", false);
        p0Var.m8428k("data", false);
        p0Var.m8428k("geo", false);
        p0Var.m8428k("notifications", false);
        p0Var.m8428k("storage", false);
        p0Var.m8428k("custom", false);
        descriptor = p0Var;
    }

    private AmplifyOutputsDataImpl$$serializer() {
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        return new InterfaceC2401a[]{a1.f19869a, AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE), AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE), AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Data$$serializer.INSTANCE), AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE), AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE), AbstractC5870b.m11498a(AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE), AbstractC5870b.m11498a(b0.f21664a)};
    }

    @Override // fy.InterfaceC2401a
    public final AmplifyOutputsDataImpl deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = decoder.mo7699c(interfaceC3055f);
        int i10 = 0;
        String strMo7681d = null;
        AmplifyOutputsDataImpl.Analytics analytics = null;
        AmplifyOutputsDataImpl.Auth auth = null;
        AmplifyOutputsDataImpl.Data data = null;
        AmplifyOutputsDataImpl.Geo geo = null;
        AmplifyOutputsDataImpl.Notifications notifications = null;
        AmplifyOutputsDataImpl.Storage storage = null;
        C4294z c4294z = null;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            switch (iMo7685o) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 0);
                    i10 |= 1;
                    break;
                case 1:
                    analytics = (AmplifyOutputsDataImpl.Analytics) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 1, AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE, analytics);
                    i10 |= 2;
                    break;
                case 2:
                    auth = (AmplifyOutputsDataImpl.Auth) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 2, AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE, auth);
                    i10 |= 4;
                    break;
                case 3:
                    data = (AmplifyOutputsDataImpl.Data) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 3, AmplifyOutputsDataImpl$Data$$serializer.INSTANCE, data);
                    i10 |= 8;
                    break;
                case 4:
                    geo = (AmplifyOutputsDataImpl.Geo) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 4, AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE, geo);
                    i10 |= 16;
                    break;
                case 5:
                    notifications = (AmplifyOutputsDataImpl.Notifications) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 5, AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE, notifications);
                    i10 |= 32;
                    break;
                case 6:
                    storage = (AmplifyOutputsDataImpl.Storage) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 6, AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE, storage);
                    i10 |= 64;
                    break;
                case 7:
                    c4294z = (C4294z) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 7, b0.f21664a, c4294z);
                    i10 |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iMo7685o);
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new AmplifyOutputsDataImpl(i10, strMo7681d, analytics, auth, data, geo, notifications, storage, c4294z, null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d encoder, AmplifyOutputsDataImpl value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = encoder.mo7711c(interfaceC3055f);
        AmplifyOutputsDataImpl.write$Self$core_release(value, interfaceC3365bMo7711c, interfaceC3055f);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
