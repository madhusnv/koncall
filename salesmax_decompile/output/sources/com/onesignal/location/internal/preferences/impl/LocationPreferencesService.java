package com.onesignal.location.internal.preferences.impl;

import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.location.internal.preferences.ILocationPreferencesService;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class LocationPreferencesService implements ILocationPreferencesService {
    private final IPreferencesService _prefs;

    public LocationPreferencesService(IPreferencesService iPreferencesService) {
        sq8.m48649h(iPreferencesService, "_prefs");
        this._prefs = iPreferencesService;
    }

    @Override // com.onesignal.location.internal.preferences.ILocationPreferencesService
    public long getLastLocationTime() {
        Long l = this._prefs.getLong(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_LAST_LOCATION_TIME, -600000L);
        sq8.m48646e(l);
        return l.longValue();
    }

    @Override // com.onesignal.location.internal.preferences.ILocationPreferencesService
    public void setLastLocationTime(long j) {
        this._prefs.saveLong(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_LAST_LOCATION_TIME, Long.valueOf(j));
    }
}
