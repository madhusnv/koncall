package com.amplifyframework.analytics;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AnalyticsDoubleProperty implements AnalyticsPropertyBehavior<Double> {
    private final Double value;

    private AnalyticsDoubleProperty(Double d2) {
        this.value = d2;
    }

    public static AnalyticsDoubleProperty from(Double d2) {
        Objects.requireNonNull(d2);
        return new AnalyticsDoubleProperty(d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsDoubleProperty.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(getValue(), ((AnalyticsDoubleProperty) obj).getValue());
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsDoubleProperty{value=" + this.value + '}';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public Double getValue() {
        return this.value;
    }
}
