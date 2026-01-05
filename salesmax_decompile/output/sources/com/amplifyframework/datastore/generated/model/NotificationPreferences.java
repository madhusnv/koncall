package com.amplifyframework.datastore.generated.model;

import java.util.List;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class NotificationPreferences {
    private final List<Channels> channels;
    private final ActivityType notificationType;

    public interface BuildStep {
        NotificationPreferences build();
    }

    public static class Builder implements NotificationTypeStep, ChannelsStep, BuildStep {
        private List<Channels> channels;
        private ActivityType notificationType;

        @Override // com.amplifyframework.datastore.generated.model.NotificationPreferences.BuildStep
        public NotificationPreferences build() {
            return new NotificationPreferences(this.notificationType, this.channels);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationPreferences.ChannelsStep
        public BuildStep channels(List<Channels> list) {
            Objects.requireNonNull(list);
            this.channels = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationPreferences.NotificationTypeStep
        public ChannelsStep notificationType(ActivityType activityType) {
            Objects.requireNonNull(activityType);
            this.notificationType = activityType;
            return this;
        }

        public Builder() {
        }

        private Builder(ActivityType activityType, List<Channels> list) {
            this.notificationType = activityType;
            this.channels = list;
        }
    }

    public interface ChannelsStep {
        BuildStep channels(List<Channels> list);
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.NotificationPreferences.Builder, com.amplifyframework.datastore.generated.model.NotificationPreferences.ChannelsStep
        public /* bridge */ /* synthetic */ BuildStep channels(List list) {
            return channels((List<Channels>) list);
        }

        private CopyOfBuilder(ActivityType activityType, List<Channels> list) {
            super(activityType, list);
            Objects.requireNonNull(activityType);
            Objects.requireNonNull(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationPreferences.Builder, com.amplifyframework.datastore.generated.model.NotificationPreferences.ChannelsStep
        public CopyOfBuilder channels(List<Channels> list) {
            return (CopyOfBuilder) super.channels(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.NotificationPreferences.Builder, com.amplifyframework.datastore.generated.model.NotificationPreferences.NotificationTypeStep
        public CopyOfBuilder notificationType(ActivityType activityType) {
            return (CopyOfBuilder) super.notificationType(activityType);
        }
    }

    public interface NotificationTypeStep {
        ChannelsStep notificationType(ActivityType activityType);
    }

    public static NotificationTypeStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.notificationType, this.channels);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NotificationPreferences.class != obj.getClass()) {
            return false;
        }
        NotificationPreferences notificationPreferences = (NotificationPreferences) obj;
        return s6c.m47909a(getNotificationType(), notificationPreferences.getNotificationType()) && s6c.m47909a(getChannels(), notificationPreferences.getChannels());
    }

    public List<Channels> getChannels() {
        return this.channels;
    }

    public ActivityType getNotificationType() {
        return this.notificationType;
    }

    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNotificationType());
        sb.append(getChannels());
        return sb.toString().hashCode();
    }

    private NotificationPreferences(ActivityType activityType, List<Channels> list) {
        this.notificationType = activityType;
        this.channels = list;
    }
}
