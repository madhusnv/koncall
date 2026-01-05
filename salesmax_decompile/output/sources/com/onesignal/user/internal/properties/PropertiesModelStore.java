package com.onesignal.user.internal.properties;

import com.onesignal.common.modeling.SimpleModelStore;
import com.onesignal.common.modeling.SingletonModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import p001o.kf9;
import p001o.sq8;
import p001o.uk7;

/* loaded from: classes6.dex */
public class PropertiesModelStore extends SingletonModelStore<PropertiesModel> {

    /* renamed from: com.onesignal.user.internal.properties.PropertiesModelStore$1 */
    public static final class C118751 extends kf9 implements uk7 {
        public static final C118751 INSTANCE = new C118751();

        public C118751() {
            super(0);
        }

        @Override // p001o.uk7
        public final PropertiesModel invoke() {
            return new PropertiesModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertiesModelStore(IPreferencesService iPreferencesService) {
        super(new SimpleModelStore(C118751.INSTANCE, "properties", iPreferencesService));
        sq8.m48649h(iPreferencesService, "prefs");
    }
}
