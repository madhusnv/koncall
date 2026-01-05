package ai.salesmax.model;

import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.ActivityRelatedObjectType;
import com.amplifyframework.datastore.generated.model.NotificationStaging;
import p001o.a81;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class NotificationStagingSummary {
    private NotificationStaging underlyingNotificationStaging;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final NotificationStaging newInstance() {
            NotificationStaging notificationStagingBuild = NotificationStaging.builder().accountId("").notificationRelatedObjectType(ActivityRelatedObjectType.CONTACT).notificationRelatedObjectId("").ownerId("").build();
            sq8.m48646e(notificationStagingBuild);
            return notificationStagingBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationStagingSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String getAccountId() {
        return this.underlyingNotificationStaging.getAccountId();
    }

    public final String getActivityDoneByUserId() {
        return this.underlyingNotificationStaging.getActivityDoneByUserId();
    }

    public final String getContactId() {
        return this.underlyingNotificationStaging.getContactId();
    }

    public final String getContent() {
        return this.underlyingNotificationStaging.getContent();
    }

    public final Long getCreatedAt() {
        Temporal.DateTime createdAt = this.underlyingNotificationStaging.getCreatedAt();
        if (createdAt != null) {
            return a81.m16645F(createdAt);
        }
        return null;
    }

    public final String getId() {
        String id = this.underlyingNotificationStaging.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getNotificationChannel() {
        return this.underlyingNotificationStaging.getNotificationChannel();
    }

    public final String getNotificationId() {
        return this.underlyingNotificationStaging.getNotificationId();
    }

    public final String getNotificationRelatedObjectId() {
        return this.underlyingNotificationStaging.getNotificationRelatedObjectId();
    }

    public final String getNotificationRelatedObjectType() {
        ActivityRelatedObjectType notificationRelatedObjectType = this.underlyingNotificationStaging.getNotificationRelatedObjectType();
        if (notificationRelatedObjectType != null) {
            return notificationRelatedObjectType.name();
        }
        return null;
    }

    public final String getNotificationStatus() {
        return this.underlyingNotificationStaging.getNotificationStatus();
    }

    public final String getNotificationType() {
        return this.underlyingNotificationStaging.getNotificationType();
    }

    public final String getOwnerId() {
        return this.underlyingNotificationStaging.getOwnerId();
    }

    public final String getPrimaryTeamId() {
        return this.underlyingNotificationStaging.getPrimaryTeamId();
    }

    public final Long getScheduledAt() {
        Temporal.DateTime scheduledAt = this.underlyingNotificationStaging.getScheduledAt();
        if (scheduledAt != null) {
            return a81.m16645F(scheduledAt);
        }
        return null;
    }

    public final NotificationStaging getUnderlyingNotificationStaging() {
        return this.underlyingNotificationStaging;
    }

    public final Long getUpdatedAt() {
        Temporal.DateTime updatedAt = this.underlyingNotificationStaging.getUpdatedAt();
        if (updatedAt != null) {
            return a81.m16645F(updatedAt);
        }
        return null;
    }

    public final void setUnderlyingNotificationStaging(NotificationStaging notificationStaging) {
        sq8.m48649h(notificationStaging, "<set-?>");
        this.underlyingNotificationStaging = notificationStaging;
    }

    public final NotificationStagingInfo toNotificationStagingInfo() {
        return new NotificationStagingInfo(getId(), getAccountId(), getNotificationId(), getNotificationChannel(), getNotificationStatus(), getNotificationType(), getNotificationRelatedObjectType(), getNotificationRelatedObjectId(), getOwnerId(), getPrimaryTeamId(), getContactId(), getActivityDoneByUserId(), getContent(), getScheduledAt());
    }

    public NotificationStagingSummary(NotificationStaging notificationStaging) {
        sq8.m48649h(notificationStaging, "underlyingNotificationStaging");
        this.underlyingNotificationStaging = notificationStaging;
    }

    public /* synthetic */ NotificationStagingSummary(NotificationStaging notificationStaging, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : notificationStaging);
    }
}
