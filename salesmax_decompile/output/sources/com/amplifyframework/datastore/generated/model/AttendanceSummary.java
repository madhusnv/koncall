package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AttendanceSummary {
    private final Temporal.Date dayOfAttendance;
    private final Integer marked;
    private final Integer notMarked;
    private final Integer onLeave;

    public interface BuildStep {
        AttendanceSummary build();

        BuildStep dayOfAttendance(Temporal.Date date);

        BuildStep marked(Integer num);

        BuildStep notMarked(Integer num);

        BuildStep onLeave(Integer num);
    }

    public static class Builder implements BuildStep {
        private Temporal.Date dayOfAttendance;
        private Integer marked;
        private Integer notMarked;
        private Integer onLeave;

        @Override // com.amplifyframework.datastore.generated.model.AttendanceSummary.BuildStep
        public AttendanceSummary build() {
            return new AttendanceSummary(this.dayOfAttendance, this.marked, this.notMarked, this.onLeave);
        }

        @Override // com.amplifyframework.datastore.generated.model.AttendanceSummary.BuildStep
        public BuildStep dayOfAttendance(Temporal.Date date) {
            this.dayOfAttendance = date;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AttendanceSummary.BuildStep
        public BuildStep marked(Integer num) {
            this.marked = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AttendanceSummary.BuildStep
        public BuildStep notMarked(Integer num) {
            this.notMarked = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AttendanceSummary.BuildStep
        public BuildStep onLeave(Integer num) {
            this.onLeave = num;
            return this;
        }

        public Builder() {
        }

        private Builder(Temporal.Date date, Integer num, Integer num2, Integer num3) {
            this.dayOfAttendance = date;
            this.marked = num;
            this.notMarked = num2;
            this.onLeave = num3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(Temporal.Date date, Integer num, Integer num2, Integer num3) {
            super(date, num, num2, num3);
        }

        @Override // com.amplifyframework.datastore.generated.model.AttendanceSummary.Builder, com.amplifyframework.datastore.generated.model.AttendanceSummary.BuildStep
        public CopyOfBuilder dayOfAttendance(Temporal.Date date) {
            return (CopyOfBuilder) super.dayOfAttendance(date);
        }

        @Override // com.amplifyframework.datastore.generated.model.AttendanceSummary.Builder, com.amplifyframework.datastore.generated.model.AttendanceSummary.BuildStep
        public CopyOfBuilder marked(Integer num) {
            return (CopyOfBuilder) super.marked(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AttendanceSummary.Builder, com.amplifyframework.datastore.generated.model.AttendanceSummary.BuildStep
        public CopyOfBuilder notMarked(Integer num) {
            return (CopyOfBuilder) super.notMarked(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AttendanceSummary.Builder, com.amplifyframework.datastore.generated.model.AttendanceSummary.BuildStep
        public CopyOfBuilder onLeave(Integer num) {
            return (CopyOfBuilder) super.onLeave(num);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.dayOfAttendance, this.marked, this.notMarked, this.onLeave);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AttendanceSummary.class != obj.getClass()) {
            return false;
        }
        AttendanceSummary attendanceSummary = (AttendanceSummary) obj;
        return s6c.m47909a(getDayOfAttendance(), attendanceSummary.getDayOfAttendance()) && s6c.m47909a(getMarked(), attendanceSummary.getMarked()) && s6c.m47909a(getNotMarked(), attendanceSummary.getNotMarked()) && s6c.m47909a(getOnLeave(), attendanceSummary.getOnLeave());
    }

    public Temporal.Date getDayOfAttendance() {
        return this.dayOfAttendance;
    }

    public Integer getMarked() {
        return this.marked;
    }

    public Integer getNotMarked() {
        return this.notMarked;
    }

    public Integer getOnLeave() {
        return this.onLeave;
    }

    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDayOfAttendance());
        sb.append(getMarked());
        sb.append(getNotMarked());
        sb.append(getOnLeave());
        return sb.toString().hashCode();
    }

    private AttendanceSummary(Temporal.Date date, Integer num, Integer num2, Integer num3) {
        this.dayOfAttendance = date;
        this.marked = num;
        this.notMarked = num2;
        this.onLeave = num3;
    }
}
