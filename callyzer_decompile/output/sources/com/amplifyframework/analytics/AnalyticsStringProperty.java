package com.amplifyframework.analytics;

import com.sun.mail.util.AbstractC1452a;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        return Objects.equals(getValue(), ((AnalyticsStringProperty) obj).getValue());
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return AbstractC1452a.m4564k(new StringBuilder("AnalyticsStringProperty{value='"), this.value, "'}");
    }

    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public String getValue() {
        return this.value;
    }
}
