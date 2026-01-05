package p001o;

/* loaded from: classes5.dex */
public enum vd4 {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");

    public static final C17548a Companion = new C17548a(null);
    private final String rawValue;

    /* renamed from: o.vd4$a */
    public static final class C17548a {
        public C17548a() {
        }

        public /* synthetic */ C17548a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final vd4 m52580a(String str) {
            sq8.m48649h(str, "rawValue");
            for (vd4 vd4Var : vd4.values()) {
                if (sq8.m48644c(vd4Var.getRawValue(), str)) {
                    return vd4Var;
                }
            }
            return null;
        }
    }

    vd4(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
