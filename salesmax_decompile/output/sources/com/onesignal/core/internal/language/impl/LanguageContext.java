package com.onesignal.core.internal.language.impl;

import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class LanguageContext implements ILanguageContext {
    private final PropertiesModelStore _propertiesModelStore;
    private LanguageProviderDevice deviceLanguageProvider;

    public LanguageContext(PropertiesModelStore propertiesModelStore) {
        sq8.m48649h(propertiesModelStore, "_propertiesModelStore");
        this._propertiesModelStore = propertiesModelStore;
        this.deviceLanguageProvider = new LanguageProviderDevice();
    }

    @Override // com.onesignal.core.internal.language.ILanguageContext
    public String getLanguage() {
        String language = this._propertiesModelStore.getModel().getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // com.onesignal.core.internal.language.ILanguageContext
    public void setLanguage(String str) {
        sq8.m48649h(str, "value");
        this._propertiesModelStore.getModel().setLanguage(str);
    }
}
