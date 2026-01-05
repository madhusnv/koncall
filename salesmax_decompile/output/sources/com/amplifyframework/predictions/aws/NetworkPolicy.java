package com.amplifyframework.predictions.aws;

/* loaded from: classes5.dex */
public enum NetworkPolicy {
    OFFLINE("offline"),
    AUTO("auto");

    private final String configurationKey;

    NetworkPolicy(String str) {
        this.configurationKey = str;
    }

    public static NetworkPolicy fromKey(String str) {
        for (NetworkPolicy networkPolicy : values()) {
            if (networkPolicy.getConfigurationKey().equals(str)) {
                return networkPolicy;
            }
        }
        throw new IllegalArgumentException("There is no network policy that matches the provided key.");
    }

    public String getConfigurationKey() {
        return this.configurationKey;
    }
}
