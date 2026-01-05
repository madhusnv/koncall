package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.preferences.PreferenceStores;
import java.util.Set;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OutcomeEventsPreferences implements IOutcomeEventsPreferences {
    private final IPreferencesService preferences;

    public OutcomeEventsPreferences(IPreferencesService iPreferencesService) {
        sq8.m48649h(iPreferencesService, "preferences");
        this.preferences = iPreferencesService;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsPreferences
    public Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        return this.preferences.getStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT, null);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsPreferences
    public void setUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set) {
        this.preferences.saveStringSet(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT, set);
    }
}
