package p001o;

/* loaded from: classes5.dex */
public enum rfc {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");

    private final String rawValue;

    rfc(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
