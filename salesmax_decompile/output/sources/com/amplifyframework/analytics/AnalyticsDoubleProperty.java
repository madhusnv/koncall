package com.amplifyframework.analytics;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AnalyticsDoubleProperty implements AnalyticsPropertyBehavior<Double> {
    private final Double value;

    private AnalyticsDoubleProperty(Double d) {
        this.value = d;
    }

    public static AnalyticsDoubleProperty from(Double d) {
        Objects.requireNonNull(d);
        return new AnalyticsDoubleProperty(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsDoubleProperty.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(getValue(), ((AnalyticsDoubleProperty) obj).getValue());
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
