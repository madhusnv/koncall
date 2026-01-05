package com.amplifyframework.analytics;

import i0.m0;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        throw new IllegalArgumentException(m0.m7378k("Analytics category does not publish any Hub event with name = ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.hubEventName;
    }
}
