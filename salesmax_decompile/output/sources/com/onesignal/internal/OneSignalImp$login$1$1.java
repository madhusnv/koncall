package com.onesignal.internal;

import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.properties.PropertiesModel;
import p001o.kf9;
import p001o.nl7;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class OneSignalImp$login$1$1 extends kf9 implements nl7 {
    final /* synthetic */ String $externalId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$login$1$1(String str) {
        super(2);
        this.$externalId = str;
    }

    @Override // p001o.nl7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((IdentityModel) obj, (PropertiesModel) obj2);
        return y3i.f54824a;
    }

    public final void invoke(IdentityModel identityModel, PropertiesModel propertiesModel) {
        sq8.m48649h(identityModel, "identityModel");
        sq8.m48649h(propertiesModel, "<anonymous parameter 1>");
        identityModel.setExternalId(this.$externalId);
    }
}
