package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class WorkingHour {
    private final Day day;
    private final Temporal.Time endTime;
    private final Temporal.Time startTime;

    public interface BuildStep {
        WorkingHour build();

        BuildStep day(Day day);

        BuildStep endTime(Temporal.Time time);

        BuildStep startTime(Temporal.Time time);
    }

    public static class Builder implements BuildStep {
        private Day day;
        private Temporal.Time endTime;
        private Temporal.Time startTime;

        @Override // com.amplifyframework.datastore.generated.model.WorkingHour.BuildStep
        public WorkingHour build() {
            return new WorkingHour(this.day, this.startTime, this.endTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WorkingHour.BuildStep
        public BuildStep day(Day day) {
            this.day = day;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WorkingHour.BuildStep
        public BuildStep endTime(Temporal.Time time) {
            this.endTime = time;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WorkingHour.BuildStep
        public BuildStep startTime(Temporal.Time time) {
            this.startTime = time;
            return this;
        }

        public Builder() {
        }

        private Builder(Day day, Temporal.Time time, Temporal.Time time2) {
            this.day = day;
            this.startTime = time;
            this.endTime = time2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(Day day, Temporal.Time time, Temporal.Time time2) {
            super(day, time, time2);
        }

        @Override // com.amplifyframework.datastore.generated.model.WorkingHour.Builder, com.amplifyframework.datastore.generated.model.WorkingHour.BuildStep
        public CopyOfBuilder day(Day day) {
            return (CopyOfBuilder) super.day(day);
        }

        @Override // com.amplifyframework.datastore.generated.model.WorkingHour.Builder, com.amplifyframework.datastore.generated.model.WorkingHour.BuildStep
        public CopyOfBuilder endTime(Temporal.Time time) {
            return (CopyOfBuilder) super.endTime(time);
        }

        @Override // com.amplifyframework.datastore.generated.model.WorkingHour.Builder, com.amplifyframework.datastore.generated.model.WorkingHour.BuildStep
        public CopyOfBuilder startTime(Temporal.Time time) {
            return (CopyOfBuilder) super.startTime(time);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.day, this.startTime, this.endTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkingHour.class != obj.getClass()) {
            return false;
        }
        WorkingHour workingHour = (WorkingHour) obj;
        return s6c.m47909a(getDay(), workingHour.getDay()) && s6c.m47909a(getStartTime(), workingHour.getStartTime()) && s6c.m47909a(getEndTime(), workingHour.getEndTime());
    }

    public Day getDay() {
        return this.day;
    }

    public Temporal.Time getEndTime() {
        return this.endTime;
    }

    public Temporal.Time getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDay());
        sb.append(getStartTime());
        sb.append(getEndTime());
        return sb.toString().hashCode();
    }

    private WorkingHour(Day day, Temporal.Time time, Temporal.Time time2) {
        this.day = day;
        this.startTime = time;
        this.endTime = time2;
    }
}
