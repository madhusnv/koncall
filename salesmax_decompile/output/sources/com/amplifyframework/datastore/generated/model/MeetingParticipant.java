package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class MeetingParticipant {
    private final Temporal.DateTime endTime;
    private final String id;
    private final String name;
    private final Temporal.DateTime startTime;

    public interface BuildStep {
        MeetingParticipant build();

        BuildStep endTime(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep name(String str);

        BuildStep startTime(Temporal.DateTime dateTime);
    }

    public static class Builder implements BuildStep {
        private Temporal.DateTime endTime;
        private String id;
        private String name;
        private Temporal.DateTime startTime;

        @Override // com.amplifyframework.datastore.generated.model.MeetingParticipant.BuildStep
        public MeetingParticipant build() {
            return new MeetingParticipant(this.id, this.name, this.startTime, this.endTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.MeetingParticipant.BuildStep
        public BuildStep endTime(Temporal.DateTime dateTime) {
            this.endTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MeetingParticipant.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MeetingParticipant.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MeetingParticipant.BuildStep
        public BuildStep startTime(Temporal.DateTime dateTime) {
            this.startTime = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.name = str2;
            this.startTime = dateTime;
            this.endTime = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, dateTime, dateTime2);
        }

        @Override // com.amplifyframework.datastore.generated.model.MeetingParticipant.Builder, com.amplifyframework.datastore.generated.model.MeetingParticipant.BuildStep
        public CopyOfBuilder endTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.endTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.MeetingParticipant.Builder, com.amplifyframework.datastore.generated.model.MeetingParticipant.BuildStep
        public CopyOfBuilder id(String str) {
            return (CopyOfBuilder) super.id(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MeetingParticipant.Builder, com.amplifyframework.datastore.generated.model.MeetingParticipant.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MeetingParticipant.Builder, com.amplifyframework.datastore.generated.model.MeetingParticipant.BuildStep
        public CopyOfBuilder startTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.startTime(dateTime);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.name, this.startTime, this.endTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MeetingParticipant.class != obj.getClass()) {
            return false;
        }
        MeetingParticipant meetingParticipant = (MeetingParticipant) obj;
        return s6c.m47909a(getId(), meetingParticipant.getId()) && s6c.m47909a(getName(), meetingParticipant.getName()) && s6c.m47909a(getStartTime(), meetingParticipant.getStartTime()) && s6c.m47909a(getEndTime(), meetingParticipant.getEndTime());
    }

    public Temporal.DateTime getEndTime() {
        return this.endTime;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Temporal.DateTime getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (getId() + getName() + getStartTime() + getEndTime()).hashCode();
    }

    private MeetingParticipant(String str, String str2, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.name = str2;
        this.startTime = dateTime;
        this.endTime = dateTime2;
    }
}
