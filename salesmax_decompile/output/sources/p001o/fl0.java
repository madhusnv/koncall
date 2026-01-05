package p001o;

/* loaded from: classes5.dex */
public enum fl0 {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");

    public static final C13476a Companion = new C13476a(null);
    private final String rawValue;

    /* renamed from: o.fl0$a */
    public static final class C13476a {
        public C13476a() {
        }

        public /* synthetic */ C13476a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final fl0 m26981a(String str) {
            sq8.m48649h(str, "rawValue");
            for (fl0 fl0Var : fl0.values()) {
                if (sq8.m48644c(fl0Var.getRawValue(), str)) {
                    return fl0Var;
                }
            }
            return null;
        }
    }

    fl0(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
