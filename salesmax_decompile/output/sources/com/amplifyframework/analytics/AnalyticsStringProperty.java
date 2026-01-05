package com.amplifyframework.analytics;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AnalyticsStringProperty implements AnalyticsPropertyBehavior<String> {
    private final String value;

    private AnalyticsStringProperty(String str) {
        this.value = str;
    }

    public static AnalyticsStringProperty from(String str) {
        Objects.requireNonNull(str);
        return new AnalyticsStringProperty(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsStringProperty.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(getValue(), ((AnalyticsStringProperty) obj).getValue());
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsStringProperty{value='" + this.value + "'}";
    }

    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public String getValue() {
        return this.value;
    }
}
