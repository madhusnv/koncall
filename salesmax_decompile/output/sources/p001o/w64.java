package p001o;

import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes5.dex */
public enum w64 {
    VALUE_TO_SUM("value"),
    EVENT_TIME("event_time"),
    EVENT_NAME("event_name"),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE(FirebaseAnalytics.Param.CONTENT_TYPE),
    DESCRIPTION(MediaTrack.ROLE_DESCRIPTION),
    LEVEL(FirebaseAnalytics.Param.LEVEL),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS(FirebaseAnalytics.Param.SUCCESS),
    ORDER_ID("order_id"),
    AD_TYPE("ad_type"),
    CURRENCY(FirebaseAnalytics.Param.CURRENCY);

    private final String rawValue;

    w64(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
