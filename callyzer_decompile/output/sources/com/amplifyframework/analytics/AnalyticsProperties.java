package com.amplifyframework.analytics;

import i0.m0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AnalyticsProperties implements Iterable<Map.Entry<String, AnalyticsPropertyBehavior<?>>> {
    private final Map<String, AnalyticsPropertyBehavior<?>> properties;

    public /* synthetic */ AnalyticsProperties(Map map, int i10) {
        this(map);
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsProperties.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.properties, ((AnalyticsProperties) obj).properties);
    }

    public AnalyticsPropertyBehavior<?> get(String str) {
        if (this.properties.get(str) != null) {
            return this.properties.get(str);
        }
        throw new NoSuchElementException(m0.m7378k("AnalyticsPropertyBehavior not found ", str));
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<String, AnalyticsPropertyBehavior<?>>> iterator() {
        return this.properties.entrySet().iterator();
    }

    public int size() {
        return this.properties.size();
    }

    public String toString() {
        return "AnalyticsProperties{properties=" + this.properties + '}';
    }

    private AnalyticsProperties(Map<String, AnalyticsPropertyBehavior<?>> map) {
        this.properties = map;
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private final Map<String, AnalyticsPropertyBehavior<?>> properties = new HashMap();

        public Builder add(String str, String str2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            this.properties.put(str, AnalyticsStringProperty.from(str2));
            return this;
        }

        public AnalyticsProperties build() {
            return new AnalyticsProperties(this.properties, 0);
        }

        public Builder add(String str, Double d2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(d2);
            this.properties.put(str, AnalyticsDoubleProperty.from(d2));
            return this;
        }

        public Builder add(String str, Boolean bool) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(bool);
            this.properties.put(str, AnalyticsBooleanProperty.from(bool));
            return this;
        }

        public Builder add(String str, Integer num) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(num);
            this.properties.put(str, AnalyticsIntegerProperty.from(num));
            return this;
        }

        public <T, P extends AnalyticsPropertyBehavior<T>> Builder add(String str, P p4) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(p4);
            this.properties.put(str, p4);
            return this;
        }
    }
}
