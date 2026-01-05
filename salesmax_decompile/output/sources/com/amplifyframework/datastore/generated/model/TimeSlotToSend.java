package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class TimeSlotToSend {
    private final Temporal.Time timeEnd;
    private final Temporal.Time timeStart;

    public interface BuildStep {
        TimeSlotToSend build();

        BuildStep timeEnd(Temporal.Time time);

        BuildStep timeStart(Temporal.Time time);
    }

    public static class Builder implements BuildStep {
        private Temporal.Time timeEnd;
        private Temporal.Time timeStart;

        @Override // com.amplifyframework.datastore.generated.model.TimeSlotToSend.BuildStep
        public TimeSlotToSend build() {
            return new TimeSlotToSend(this.timeStart, this.timeEnd);
        }

        @Override // com.amplifyframework.datastore.generated.model.TimeSlotToSend.BuildStep
        public BuildStep timeEnd(Temporal.Time time) {
            this.timeEnd = time;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TimeSlotToSend.BuildStep
        public BuildStep timeStart(Temporal.Time time) {
            this.timeStart = time;
            return this;
        }

        public Builder() {
        }

        private Builder(Temporal.Time time, Temporal.Time time2) {
            this.timeStart = time;
            this.timeEnd = time2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(Temporal.Time time, Temporal.Time time2) {
            super(time, time2);
        }

        @Override // com.amplifyframework.datastore.generated.model.TimeSlotToSend.Builder, com.amplifyframework.datastore.generated.model.TimeSlotToSend.BuildStep
        public CopyOfBuilder timeEnd(Temporal.Time time) {
            return (CopyOfBuilder) super.timeEnd(time);
        }

        @Override // com.amplifyframework.datastore.generated.model.TimeSlotToSend.Builder, com.amplifyframework.datastore.generated.model.TimeSlotToSend.BuildStep
        public CopyOfBuilder timeStart(Temporal.Time time) {
            return (CopyOfBuilder) super.timeStart(time);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.timeStart, this.timeEnd);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimeSlotToSend.class != obj.getClass()) {
            return false;
        }
        TimeSlotToSend timeSlotToSend = (TimeSlotToSend) obj;
        return s6c.m47909a(getTimeStart(), timeSlotToSend.getTimeStart()) && s6c.m47909a(getTimeEnd(), timeSlotToSend.getTimeEnd());
    }

    public Temporal.Time getTimeEnd() {
        return this.timeEnd;
    }

    public Temporal.Time getTimeStart() {
        return this.timeStart;
    }

    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTimeStart());
        sb.append(getTimeEnd());
        return sb.toString().hashCode();
    }

    private TimeSlotToSend(Temporal.Time time, Temporal.Time time2) {
        this.timeStart = time;
        this.timeEnd = time2;
    }
}
