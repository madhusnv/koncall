package com.onesignal.inAppMessages.internal.preferences.impl;

import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import java.util.Set;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppPreferencesController implements IInAppPreferencesController {
    private final IPreferencesService _prefs;

    public InAppPreferencesController(IPreferencesService iPreferencesService) {
        sq8.m48649h(iPreferencesService, "_prefs");
        this._prefs = iPreferencesService;
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> stringSet;
        if (set != null) {
            Set<String> set2 = set;
            if ((!set2.isEmpty()) && (stringSet = this._prefs.getStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_CLICKED_CLICK_IDS_IAMS, null)) != null && (!stringSet.isEmpty())) {
                Set<String> setU0 = kh3.U0(stringSet);
                setU0.removeAll(set2);
                this._prefs.saveStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_CLICKED_CLICK_IDS_IAMS, setU0);
            }
        }
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void cleanInAppMessageIds(Set<String> set) {
        if (set != null) {
            Set<String> set2 = set;
            if (!set2.isEmpty()) {
                Set<String> stringSet = this._prefs.getStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_DISMISSED_IAMS, null);
                Set<String> stringSet2 = this._prefs.getStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_IMPRESSIONED_IAMS, null);
                if (stringSet != null && (!stringSet.isEmpty())) {
                    Set<String> setU0 = kh3.U0(stringSet);
                    setU0.removeAll(set2);
                    this._prefs.saveStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_DISMISSED_IAMS, setU0);
                }
                if (stringSet2 == null || !(!stringSet2.isEmpty())) {
                    return;
                }
                Set<String> setU02 = kh3.U0(stringSet2);
                setU02.removeAll(set2);
                this._prefs.saveStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_IMPRESSIONED_IAMS, setU02);
            }
        }
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Set<String> getClickedMessagesId() {
        return this._prefs.getStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_CLICKED_CLICK_IDS_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Set<String> getDismissedMessagesId() {
        return this._prefs.getStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_DISMISSED_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Set<String> getImpressionesMessagesId() {
        return this._prefs.getStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_IMPRESSIONED_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Long getLastTimeInAppDismissed() {
        return this._prefs.getLong(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_IAM_LAST_DISMISSED_TIME, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public String getSavedIAMs() {
        return this._prefs.getString(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_CACHED_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Set<String> getViewPageImpressionedIds() {
        return this._prefs.getStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_PAGE_IMPRESSIONED_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setClickedMessagesId(Set<String> set) {
        this._prefs.saveStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_CLICKED_CLICK_IDS_IAMS, set);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setDismissedMessagesId(Set<String> set) {
        this._prefs.saveStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_DISMISSED_IAMS, set);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setImpressionesMessagesId(Set<String> set) {
        this._prefs.saveStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_IMPRESSIONED_IAMS, set);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setLastTimeInAppDismissed(Long l) {
        this._prefs.saveLong(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_IAM_LAST_DISMISSED_TIME, l);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setSavedIAMs(String str) {
        this._prefs.saveString(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_CACHED_IAMS, str);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setViewPageImpressionedIds(Set<String> set) {
        this._prefs.saveStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_PAGE_IMPRESSIONED_IAMS, set);
    }
}
