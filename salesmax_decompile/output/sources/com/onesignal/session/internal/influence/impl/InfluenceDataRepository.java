package com.onesignal.session.internal.influence.impl;

import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.session.internal.influence.InfluenceType;
import org.json.JSONArray;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InfluenceDataRepository implements IInfluenceDataRepository {
    private final ConfigModelStore _configModelStore;
    private final IPreferencesService preferences;

    public InfluenceDataRepository(IPreferencesService iPreferencesService, ConfigModelStore configModelStore) {
        sq8.m48649h(iPreferencesService, "preferences");
        sq8.m48649h(configModelStore, "_configModelStore");
        this.preferences = iPreferencesService;
        this._configModelStore = configModelStore;
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public void cacheIAMInfluenceType(InfluenceType influenceType) {
        sq8.m48649h(influenceType, "influenceType");
        this.preferences.saveString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, influenceType.toString());
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public void cacheNotificationInfluenceType(InfluenceType influenceType) {
        sq8.m48649h(influenceType, "influenceType");
        this.preferences.saveString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, influenceType.toString());
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public void cacheNotificationOpenId(String str) {
        this.preferences.saveString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, str);
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public String getCachedNotificationOpenId() {
        return this.preferences.getString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, null);
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public InfluenceType getIamCachedInfluenceType() {
        return InfluenceType.Companion.fromString(this.preferences.getString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, InfluenceType.UNATTRIBUTED.toString()));
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public int getIamIndirectAttributionWindow() {
        return this._configModelStore.getModel().getInfluenceParams().getIndirectIAMAttributionWindow();
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public int getIamLimit() {
        return this._configModelStore.getModel().getInfluenceParams().getIamLimit();
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public JSONArray getLastIAMsReceivedData() {
        String string = this.preferences.getString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public JSONArray getLastNotificationsReceivedData() {
        String string = this.preferences.getString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public InfluenceType getNotificationCachedInfluenceType() {
        return InfluenceType.Companion.fromString(this.preferences.getString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, InfluenceType.UNATTRIBUTED.toString()));
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public int getNotificationIndirectAttributionWindow() {
        return this._configModelStore.getModel().getInfluenceParams().getIndirectNotificationAttributionWindow();
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public int getNotificationLimit() {
        return this._configModelStore.getModel().getInfluenceParams().getNotificationLimit();
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public boolean isDirectInfluenceEnabled() {
        return this._configModelStore.getModel().getInfluenceParams().isDirectEnabled();
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public boolean isIndirectInfluenceEnabled() {
        return this._configModelStore.getModel().getInfluenceParams().isIndirectEnabled();
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public boolean isUnattributedInfluenceEnabled() {
        return this._configModelStore.getModel().getInfluenceParams().isUnattributedEnabled();
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public void saveIAMs(JSONArray jSONArray) {
        sq8.m48649h(jSONArray, "iams");
        this.preferences.saveString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_LAST_IAMS_RECEIVED, jSONArray.toString());
    }

    @Override // com.onesignal.session.internal.influence.impl.IInfluenceDataRepository
    public void saveNotifications(JSONArray jSONArray) {
        sq8.m48649h(jSONArray, "notifications");
        this.preferences.saveString(PreferenceStores.ONESIGNAL, InfluenceConstants.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, jSONArray.toString());
    }
}
