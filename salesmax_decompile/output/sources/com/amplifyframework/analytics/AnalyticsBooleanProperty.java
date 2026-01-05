package com.amplifyframework.analytics;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AnalyticsBooleanProperty implements AnalyticsPropertyBehavior<Boolean> {
    private final Boolean value;

    private AnalyticsBooleanProperty(Boolean bool) {
        this.value = bool;
    }

    public static AnalyticsBooleanProperty from(Boolean bool) {
        Objects.requireNonNull(bool);
        return new AnalyticsBooleanProperty(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsBooleanProperty.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(getValue(), ((AnalyticsBooleanProperty) obj).getValue());
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsBooleanProperty{value=" + this.value + '}';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public Boolean getValue() {
        return this.value;
    }
}
