package com.amplifyframework.analytics;

import java.util.Objects;

/* loaded from: classes5.dex */
public enum AnalyticsChannelEventName {
    INVALID_PROPERTY_TYPE("invalid_property_type"),
    FLUSH_EVENTS("flushEvents");

    private final String hubEventName;

    AnalyticsChannelEventName(String str) {
        Objects.requireNonNull(str);
        this.hubEventName = str;
    }

    public static AnalyticsChannelEventName fromString(String str) {
        for (AnalyticsChannelEventName analyticsChannelEventName : values()) {
            if (analyticsChannelEventName.toString().equals(str)) {
                return analyticsChannelEventName;
            }
        }
        throw new IllegalArgumentException("Analytics category does not publish any Hub event with name = " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.hubEventName;
    }
}
