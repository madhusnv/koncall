package com.onesignal.user.internal.identity;

import com.onesignal.common.modeling.SimpleModelStore;
import com.onesignal.common.modeling.SingletonModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import org.apache.http.protocol.HTTP;
import p001o.kf9;
import p001o.sq8;
import p001o.uk7;

/* loaded from: classes6.dex */
public class IdentityModelStore extends SingletonModelStore<IdentityModel> {

    /* renamed from: com.onesignal.user.internal.identity.IdentityModelStore$1 */
    public static final class C118631 extends kf9 implements uk7 {
        public static final C118631 INSTANCE = new C118631();

        public C118631() {
            super(0);
        }

        @Override // p001o.uk7
        public final IdentityModel invoke() {
            return new IdentityModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityModelStore(IPreferencesService iPreferencesService) {
        super(new SimpleModelStore(C118631.INSTANCE, HTTP.IDENTITY_CODING, iPreferencesService));
        sq8.m48649h(iPreferencesService, "prefs");
    }
}
