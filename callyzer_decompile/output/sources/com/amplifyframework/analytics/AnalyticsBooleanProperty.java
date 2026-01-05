package com.amplifyframework.analytics;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        return Objects.equals(getValue(), ((AnalyticsBooleanProperty) obj).getValue());
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
