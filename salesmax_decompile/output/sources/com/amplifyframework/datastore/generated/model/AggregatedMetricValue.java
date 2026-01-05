package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AggregatedMetricValue {
    private final Temporal.Date asOf;
    private final String name;
    private final Double value;

    public interface BuildStep {
        BuildStep asOf(Temporal.Date date);

        AggregatedMetricValue build();

        BuildStep name(String str);

        BuildStep value(Double d);
    }

    public static class Builder implements BuildStep {
        private Temporal.Date asOf;
        private String name;
        private Double value;

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetricValue.BuildStep
        public BuildStep asOf(Temporal.Date date) {
            this.asOf = date;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetricValue.BuildStep
        public AggregatedMetricValue build() {
            return new AggregatedMetricValue(this.name, this.value, this.asOf);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetricValue.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetricValue.BuildStep
        public BuildStep value(Double d) {
            this.value = d;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Double d, Temporal.Date date) {
            this.name = str;
            this.value = d;
            this.asOf = date;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Double d, Temporal.Date date) {
            super(str, d, date);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetricValue.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetricValue.BuildStep
        public CopyOfBuilder asOf(Temporal.Date date) {
            return (CopyOfBuilder) super.asOf(date);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetricValue.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetricValue.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AggregatedMetricValue.Builder, com.amplifyframework.datastore.generated.model.AggregatedMetricValue.BuildStep
        public CopyOfBuilder value(Double d) {
            return (CopyOfBuilder) super.value(d);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.name, this.value, this.asOf);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AggregatedMetricValue.class != obj.getClass()) {
            return false;
        }
        AggregatedMetricValue aggregatedMetricValue = (AggregatedMetricValue) obj;
        return s6c.m47909a(getName(), aggregatedMetricValue.getName()) && s6c.m47909a(getValue(), aggregatedMetricValue.getValue()) && s6c.m47909a(getAsOf(), aggregatedMetricValue.getAsOf());
    }

    public Temporal.Date getAsOf() {
        return this.asOf;
    }

    public String getName() {
        return this.name;
    }

    public Double getValue() {
        return this.value;
    }

    public int hashCode() {
        return (getName() + getValue() + getAsOf()).hashCode();
    }

    private AggregatedMetricValue(String str, Double d, Temporal.Date date) {
        this.name = str;
        this.value = d;
        this.asOf = date;
    }
}
