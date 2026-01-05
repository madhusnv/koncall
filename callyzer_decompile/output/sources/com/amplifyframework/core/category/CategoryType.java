package com.amplifyframework.core.category;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum CategoryType {
    ANALYTICS("analytics"),
    API("api"),
    AUTH("auth"),
    DATASTORE("dataStore"),
    HUB("hub"),
    LOGGING("logging"),
    NOTIFICATIONS("notifications"),
    PREDICTIONS("predictions"),
    STORAGE("storage"),
    GEO("geo");

    private final String configurationKey;

    CategoryType(String str) {
        this.configurationKey = str;
    }

    public String getConfigurationKey() {
        return this.configurationKey;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.configurationKey;
    }
}
