package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.SimpleModelStore;
import com.onesignal.common.modeling.SingletonModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import p001o.kf9;
import p001o.sq8;
import p001o.uk7;

/* loaded from: classes6.dex */
public class ConfigModelStore extends SingletonModelStore<ConfigModel> {

    /* renamed from: com.onesignal.core.internal.config.ConfigModelStore$1 */
    public static final class C116101 extends kf9 implements uk7 {
        public static final C116101 INSTANCE = new C116101();

        public C116101() {
            super(0);
        }

        @Override // p001o.uk7
        public final ConfigModel invoke() {
            return new ConfigModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigModelStore(IPreferencesService iPreferencesService) {
        super(new SimpleModelStore(C116101.INSTANCE, "config", iPreferencesService));
        sq8.m48649h(iPreferencesService, "prefs");
    }
}
