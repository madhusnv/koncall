package com.amplifyframework.core.configuration;

import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import com.google.firebase.messaging.Constants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import org.apache.http.cookie.ClientCookie;
import p001o.aa9;
import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.p8g;
import p001o.sm1;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;
import p001o.z99;

/* loaded from: classes5.dex */
public final class AmplifyOutputsDataImpl$$serializer implements yn7 {
    public static final AmplifyOutputsDataImpl$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        AmplifyOutputsDataImpl$$serializer amplifyOutputsDataImpl$$serializer = new AmplifyOutputsDataImpl$$serializer();
        INSTANCE = amplifyOutputsDataImpl$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.core.configuration.AmplifyOutputsDataImpl", amplifyOutputsDataImpl$$serializer, 8);
        ubdVar.m51338k(ClientCookie.VERSION_ATTR, false);
        ubdVar.m51338k("analytics", false);
        ubdVar.m51338k("auth", false);
        ubdVar.m51338k(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, false);
        ubdVar.m51338k("geo", false);
        ubdVar.m51338k("notifications", false);
        ubdVar.m51338k("storage", false);
        ubdVar.m51338k(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM, false);
        descriptor = ubdVar;
    }

    private AmplifyOutputsDataImpl$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{p8g.f39602a, sm1.m48521p(AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE), sm1.m48521p(AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE), sm1.m48521p(AmplifyOutputsDataImpl$Data$$serializer.INSTANCE), sm1.m48521p(AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE), sm1.m48521p(AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE), sm1.m48521p(AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE), sm1.m48521p(aa9.f14377a)};
    }

    @Override // p001o.bn5
    public AmplifyOutputsDataImpl deserialize(w75 w75Var) {
        z99 z99Var;
        int i;
        AmplifyOutputsDataImpl.Storage storage;
        String str;
        AmplifyOutputsDataImpl.Auth auth;
        AmplifyOutputsDataImpl.Geo geo;
        AmplifyOutputsDataImpl.Notifications notifications;
        AmplifyOutputsDataImpl.Analytics analytics;
        AmplifyOutputsDataImpl.Data data;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        int i2 = 7;
        String strMo17247p = null;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 0);
            AmplifyOutputsDataImpl.Analytics analytics2 = (AmplifyOutputsDataImpl.Analytics) jo3VarMo20420b.mo17244m(descriptor2, 1, AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE, null);
            AmplifyOutputsDataImpl.Auth auth2 = (AmplifyOutputsDataImpl.Auth) jo3VarMo20420b.mo17244m(descriptor2, 2, AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE, null);
            AmplifyOutputsDataImpl.Data data2 = (AmplifyOutputsDataImpl.Data) jo3VarMo20420b.mo17244m(descriptor2, 3, AmplifyOutputsDataImpl$Data$$serializer.INSTANCE, null);
            AmplifyOutputsDataImpl.Geo geo2 = (AmplifyOutputsDataImpl.Geo) jo3VarMo20420b.mo17244m(descriptor2, 4, AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE, null);
            AmplifyOutputsDataImpl.Notifications notifications2 = (AmplifyOutputsDataImpl.Notifications) jo3VarMo20420b.mo17244m(descriptor2, 5, AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE, null);
            AmplifyOutputsDataImpl.Storage storage2 = (AmplifyOutputsDataImpl.Storage) jo3VarMo20420b.mo17244m(descriptor2, 6, AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE, null);
            z99Var = (z99) jo3VarMo20420b.mo17244m(descriptor2, 7, aa9.f14377a, null);
            storage = storage2;
            notifications = notifications2;
            data = data2;
            geo = geo2;
            auth = auth2;
            i = 255;
            analytics = analytics2;
            str = strMo17247p2;
        } else {
            boolean z = true;
            int i3 = 0;
            z99 z99Var2 = null;
            AmplifyOutputsDataImpl.Storage storage3 = null;
            AmplifyOutputsDataImpl.Notifications notifications3 = null;
            AmplifyOutputsDataImpl.Analytics analytics3 = null;
            AmplifyOutputsDataImpl.Auth auth3 = null;
            AmplifyOutputsDataImpl.Data data3 = null;
            AmplifyOutputsDataImpl.Geo geo3 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                switch (iMo16814k) {
                    case -1:
                        z = false;
                    case 0:
                        strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        analytics3 = (AmplifyOutputsDataImpl.Analytics) jo3VarMo20420b.mo17244m(descriptor2, 1, AmplifyOutputsDataImpl$Analytics$$serializer.INSTANCE, analytics3);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        auth3 = (AmplifyOutputsDataImpl.Auth) jo3VarMo20420b.mo17244m(descriptor2, 2, AmplifyOutputsDataImpl$Auth$$serializer.INSTANCE, auth3);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        data3 = (AmplifyOutputsDataImpl.Data) jo3VarMo20420b.mo17244m(descriptor2, 3, AmplifyOutputsDataImpl$Data$$serializer.INSTANCE, data3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        geo3 = (AmplifyOutputsDataImpl.Geo) jo3VarMo20420b.mo17244m(descriptor2, 4, AmplifyOutputsDataImpl$Geo$$serializer.INSTANCE, geo3);
                        i3 |= 16;
                    case 5:
                        notifications3 = (AmplifyOutputsDataImpl.Notifications) jo3VarMo20420b.mo17244m(descriptor2, 5, AmplifyOutputsDataImpl$Notifications$$serializer.INSTANCE, notifications3);
                        i3 |= 32;
                    case 6:
                        storage3 = (AmplifyOutputsDataImpl.Storage) jo3VarMo20420b.mo17244m(descriptor2, 6, AmplifyOutputsDataImpl$Storage$$serializer.INSTANCE, storage3);
                        i3 |= 64;
                    case 7:
                        z99Var2 = (z99) jo3VarMo20420b.mo17244m(descriptor2, i2, aa9.f14377a, z99Var2);
                        i3 |= 128;
                    default:
                        throw new i4i(iMo16814k);
                }
            }
            z99Var = z99Var2;
            i = i3;
            AmplifyOutputsDataImpl.Geo geo4 = geo3;
            storage = storage3;
            str = strMo17247p;
            auth = auth3;
            geo = geo4;
            AmplifyOutputsDataImpl.Data data4 = data3;
            notifications = notifications3;
            analytics = analytics3;
            data = data4;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new AmplifyOutputsDataImpl(i, str, analytics, auth, data, geo, notifications, storage, z99Var, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AmplifyOutputsDataImpl amplifyOutputsDataImpl) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(amplifyOutputsDataImpl, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        AmplifyOutputsDataImpl.write$Self(amplifyOutputsDataImpl, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
