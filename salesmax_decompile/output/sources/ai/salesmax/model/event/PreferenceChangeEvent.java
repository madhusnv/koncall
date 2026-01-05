package ai.salesmax.model.event;

import p001o.q6c;

/* loaded from: classes.dex */
public class PreferenceChangeEvent {
    private final EventType eventType;
    private final Object prefValue;

    public enum EventType {
        PREF_SCREEN_POP("prefScreenPop"),
        PREF_SAVE_BUSINESS_CALL("prefSaveBusinessCall"),
        PREF_POST_CALL_DISPOSITION("prefPostCallDisposition"),
        PREF_MISSED_CALL_DISPOSITION("prefMissedCallDisposition"),
        PREF_DEFAULT_SIM_TO_CALL("prefDefaultSimToCall"),
        PREF_TRACK_LOCATION_ON_ACTIVITY("prefTrackLocationOnActivity"),
        PREF_USE_BUSINESS_WHATSAPP("prefUseBusinessWhatsapp"),
        PREF_TRACK_ALL_CALLS("prefTrackAllCalls"),
        PREF_TRACK_ALL_CALLS_SPECIFIC_SIM("prefTrackAllCallsSpecificSim"),
        PREF_USE_DEVICE_PROTECTION("prefUseDeviceProtection"),
        PREF_CALL_RECORDING_SYNC("prefCallRecordingSync"),
        PREF_CALL_RECORDING_STORAGE("prefCallRecordingStorage"),
        PREF_CALL_RECORDING_ROOT_URI("prefCallRecordingStorage"),
        PREF_AUTO_TRACK_LOCATION("prefAutoTrackLocation"),
        PREF_KEEP_UNKNOWN_NUMBER_UNASSIGNED("prefKeepUnknownNumberUnassigned"),
        PREF_SHOW_INAPP_NOTIFICATIONS("prefShowInAppNotifications"),
        PREF_CLOUD_TELEPHONY_PROVIDER_PREF("cloudTelephonyProviderPref");

        private String pref;

        EventType(String str) {
            this.pref = str;
        }

        public static EventType fromPref(String str) {
            for (EventType eventType : values()) {
                if (q6c.m44865a(eventType.pref, str)) {
                    return eventType;
                }
            }
            throw new IllegalArgumentException(String.format("No event type found for %s", str));
        }

        public String pref() {
            return this.pref;
        }
    }

    public PreferenceChangeEvent(EventType eventType, Object obj) {
        this.eventType = eventType;
        this.prefValue = obj;
    }

    public EventType getEventType() {
        return this.eventType;
    }

    public Object getPrefValue() {
        return this.prefValue;
    }

    public String toString() {
        return "PreferenceChangeEvent{eventType=" + this.eventType + ", prefValue=" + this.prefValue + '}';
    }
}
