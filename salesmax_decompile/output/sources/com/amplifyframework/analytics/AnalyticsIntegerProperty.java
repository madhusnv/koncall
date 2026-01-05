package com.amplifyframework.analytics;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AnalyticsIntegerProperty implements AnalyticsPropertyBehavior<Integer> {
    private final Integer value;

    private AnalyticsIntegerProperty(Integer num) {
        this.value = num;
    }

    public static AnalyticsIntegerProperty from(Integer num) {
        Objects.requireNonNull(num);
        return new AnalyticsIntegerProperty(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsIntegerProperty.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(getValue(), ((AnalyticsIntegerProperty) obj).getValue());
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsIntegerProperty{value=" + this.value + '}';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public Integer getValue() {
        return this.value;
    }
}
