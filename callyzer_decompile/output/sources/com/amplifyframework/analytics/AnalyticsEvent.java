package com.amplifyframework.analytics;

import com.amplifyframework.analytics.AnalyticsProperties;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AnalyticsEvent implements AnalyticsEventBehavior {
    private final String name;
    private final AnalyticsProperties properties;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private String name;
        private AnalyticsProperties.Builder propertiesBuilder;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public Builder addProperty(String str, String str2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            this.propertiesBuilder.add(str, str2);
            return this;
        }

        public AnalyticsEvent build() {
            return new AnalyticsEvent(this.name, this.propertiesBuilder.build(), 0);
        }

        public Builder name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        private Builder() {
            this.propertiesBuilder = AnalyticsProperties.builder();
        }

        public Builder addProperty(String str, Double d2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(d2);
            this.propertiesBuilder.add(str, d2);
            return this;
        }

        public Builder addProperty(String str, Boolean bool) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(bool);
            this.propertiesBuilder.add(str, bool);
            return this;
        }

        public Builder addProperty(String str, Integer num) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(num);
            this.propertiesBuilder.add(str, num);
            return this;
        }
    }

    public /* synthetic */ AnalyticsEvent(String str, AnalyticsProperties analyticsProperties, int i10) {
        this(str, analyticsProperties);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsEvent.class != obj.getClass()) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        if (Objects.equals(getName(), analyticsEvent.getName())) {
            return Objects.equals(getProperties(), analyticsEvent.getProperties());
        }
        return false;
    }

    @Override // com.amplifyframework.analytics.AnalyticsEventBehavior
    public String getName() {
        return this.name;
    }

    @Override // com.amplifyframework.analytics.AnalyticsEventBehavior
    public AnalyticsProperties getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return getProperties().hashCode() + (getName().hashCode() * 31);
    }

    public String toString() {
        return "AnalyticsEvent{name='" + this.name + "', properties=" + this.properties + '}';
    }

    private AnalyticsEvent(String str, AnalyticsProperties analyticsProperties) {
        this.name = str;
        this.properties = analyticsProperties;
    }
}
